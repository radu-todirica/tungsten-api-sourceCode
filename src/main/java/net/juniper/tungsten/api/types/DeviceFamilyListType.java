//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class DeviceFamilyListType extends ApiPropertyBase {
    List<String> device_family;
    public DeviceFamilyListType() {
    }
    public DeviceFamilyListType(List<String> device_family) {
        this.device_family = device_family;
    }
    
    public List<String> getDeviceFamily() {
        return device_family;
    }
    
    
    public void addDeviceFamily(String obj) {
        if (device_family == null) {
            device_family = new ArrayList<String>();
        }
        device_family.add(obj);
    }
    public void clearDeviceFamily() {
        device_family = null;
    }
    
}
