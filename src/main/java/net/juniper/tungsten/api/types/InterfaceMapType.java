//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class InterfaceMapType extends ApiPropertyBase {
    List<PortInfoType> port_info;
    public InterfaceMapType() {
    }
    public InterfaceMapType(List<PortInfoType> port_info) {
        this.port_info = port_info;
    }
    
    public List<PortInfoType> getPortInfo() {
        return port_info;
    }
    
    
    public void addPortInfo(PortInfoType obj) {
        if (port_info == null) {
            port_info = new ArrayList<PortInfoType>();
        }
        port_info.add(obj);
    }
    public void clearPortInfo() {
        port_info = null;
    }
    
}
