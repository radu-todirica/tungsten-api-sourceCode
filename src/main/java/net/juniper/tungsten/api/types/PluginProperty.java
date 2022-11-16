//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class PluginProperty extends ApiPropertyBase {
    String property;
    String value;
    public PluginProperty() {
    }
    public PluginProperty(String property, String value) {
        this.property = property;
        this.value = value;
    }
    public PluginProperty(String property) {
        this(property, null);    }
    
    public String getProperty() {
        return property;
    }
    
    public void setProperty(String property) {
        this.property = property;
    }
    
    
    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
}
