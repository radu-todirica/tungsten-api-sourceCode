/*
 * Copyright (c) 2013 Juniper Networks, Inc. All rights reserved.
 */

package net.juniper.tungsten.api;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

public class ApiSerializer {
    private static class ReferenceSerializer implements JsonSerializer<ObjectReference<? extends ApiPropertyBase>> {
        public JsonElement serialize(ObjectReference<? extends ApiPropertyBase> objref, Type type,
            JsonSerializationContext context) {
            JsonObject obj = new JsonObject();
            obj.add("to", context.serialize(objref.getReferredName()));
            JsonElement js_attr;
            if (objref.getAttr() == null) {
                js_attr = new JsonNull();
            } else {
                js_attr = context.serialize(objref.getAttr());
            }
            obj.add("attr", js_attr);
            if (objref.getUuid() != null) {
                obj.addProperty("uuid", objref.getUuid());
            }
            return obj;
        }
    }

    static Gson getDeserializer() {
        GsonBuilder builder = new GsonBuilder();
        return builder.excludeFieldsWithModifiers(Modifier.VOLATILE).setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS").create();
    }

    static Gson getSerializer() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(ObjectReference.class, new ReferenceSerializer());
        return builder.create();
    }

    static ApiObjectBase deserialize(String str, Class<? extends ApiObjectBase> cls) {
        Gson json = getDeserializer();
        return json.fromJson(str, cls);
    }

    static String serializeObject(String typename, ApiObjectBase obj) {
        Gson json = getSerializer();
        obj.updateQualifiedName();
        if (obj instanceof VRouterApiObjectBase) {
            JsonElement el =  json.toJsonTree(obj);
            return el.toString();
        }
        JsonObject js_dict = new JsonObject();
        js_dict.add(typename, json.toJsonTree(obj));

        return js_dict.toString();
    }
}