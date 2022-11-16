//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class GrpcParameters extends ApiPropertyBase {
    SubnetListType allow_clients;
    EnabledSensorParams enabled_sensor_params;
    String secure_mode;
    public GrpcParameters() {
    }
    public GrpcParameters(SubnetListType allow_clients, EnabledSensorParams enabled_sensor_params, String secure_mode) {
        this.allow_clients = allow_clients;
        this.enabled_sensor_params = enabled_sensor_params;
        this.secure_mode = secure_mode;
    }
    public GrpcParameters(SubnetListType allow_clients) {
        this(allow_clients, null, null);    }
    public GrpcParameters(SubnetListType allow_clients, EnabledSensorParams enabled_sensor_params) {
        this(allow_clients, enabled_sensor_params, null);    }
    
    public SubnetListType getAllowClients() {
        return allow_clients;
    }
    
    public void setAllowClients(SubnetListType allow_clients) {
        this.allow_clients = allow_clients;
    }
    
    
    public EnabledSensorParams getEnabledSensorParams() {
        return enabled_sensor_params;
    }
    
    public void setEnabledSensorParams(EnabledSensorParams enabled_sensor_params) {
        this.enabled_sensor_params = enabled_sensor_params;
    }
    
    
    public String getSecureMode() {
        return secure_mode;
    }
    
    public void setSecureMode(String secure_mode) {
        this.secure_mode = secure_mode;
    }
    
}
