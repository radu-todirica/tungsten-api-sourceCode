//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;

import net.juniper.tungsten.api.ApiObjectBase;
import net.juniper.tungsten.api.ApiPropertyBase;
import net.juniper.tungsten.api.ObjectReference;

public class CliConfig extends ApiObjectBase {
    private String accepted_cli_config;
    private CliDiffListType commit_diff_list;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> tag_refs;

    @Override
    public String getObjectType() {
        return "cli-config";
    }

    @Override
    public List<String> getDefaultParent() {
        return Lists.newArrayList("default-global-system-config", "default-physical-router");
    }

    @Override
    public String getDefaultParentType() {
        return "physical-router";
    }

    public void setParent(PhysicalRouter parent) {
        super.setParent(parent);
    }
    
    public String getAcceptedCliConfig() {
        return accepted_cli_config;
    }
    
    public void setAcceptedCliConfig(String accepted_cli_config) {
        this.accepted_cli_config = accepted_cli_config;
    }
    
    
    public CliDiffListType getCommitDiffList() {
        return commit_diff_list;
    }
    
    public void setCommitDiffList(CliDiffListType commit_diff_list) {
        this.commit_diff_list = commit_diff_list;
    }
    
    
    public IdPermsType getIdPerms() {
        return id_perms;
    }
    
    public void setIdPerms(IdPermsType id_perms) {
        this.id_perms = id_perms;
    }
    
    
    public PermType2 getPerms2() {
        return perms2;
    }
    
    public void setPerms2(PermType2 perms2) {
        this.perms2 = perms2;
    }
    
    
    public KeyValuePairs getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(KeyValuePairs annotations) {
        this.annotations = annotations;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getTag() {
        return tag_refs;
    }

    public void setTag(Tag obj) {
        tag_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        tag_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void addTag(Tag obj) {
        if (tag_refs == null) {
            tag_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        tag_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null, null, obj.getUuid()));
    }
    
    public void removeTag(Tag obj) {
        if (tag_refs != null) {
            tag_refs.remove(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
        }
    }

    public void clearTag() {
        if (tag_refs != null) {
            tag_refs.clear();
            return;
        }
        tag_refs = null;
    }
}