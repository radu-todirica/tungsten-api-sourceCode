//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class CommunityListType extends ApiPropertyBase {
    List<String> community;
    public CommunityListType() {
    }
    public CommunityListType(List<String> community) {
        this.community = community;
    }
    
    public List<String> getCommunity() {
        return community;
    }
    
    
    public void addCommunity(String obj) {
        if (community == null) {
            community = new ArrayList<String>();
        }
        community.add(obj);
    }
    public void clearCommunity() {
        community = null;
    }
    
}
