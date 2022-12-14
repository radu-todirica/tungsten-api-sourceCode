//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class JunosServicePorts extends ApiPropertyBase {
    List<String> service_port;
    public JunosServicePorts() {
    }
    public JunosServicePorts(List<String> service_port) {
        this.service_port = service_port;
    }
    
    public List<String> getServicePort() {
        return service_port;
    }
    
    
    public void addServicePort(String obj) {
        if (service_port == null) {
            service_port = new ArrayList<String>();
        }
        service_port.add(obj);
    }
    public void clearServicePort() {
        service_port = null;
    }
    
}
