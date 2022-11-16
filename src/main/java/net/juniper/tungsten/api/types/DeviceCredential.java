//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class DeviceCredential extends ApiPropertyBase {
    UserCredentials credential;
    String vendor;
    String device_family;
    public DeviceCredential() {
    }
    public DeviceCredential(UserCredentials credential, String vendor, String device_family) {
        this.credential = credential;
        this.vendor = vendor;
        this.device_family = device_family;
    }
    public DeviceCredential(UserCredentials credential) {
        this(credential, null, null);    }
    public DeviceCredential(UserCredentials credential, String vendor) {
        this(credential, vendor, null);    }
    
    public UserCredentials getCredential() {
        return credential;
    }
    
    public void setCredential(UserCredentials credential) {
        this.credential = credential;
    }
    
    
    public String getVendor() {
        return vendor;
    }
    
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }
    
    
    public String getDeviceFamily() {
        return device_family;
    }
    
    public void setDeviceFamily(String device_family) {
        this.device_family = device_family;
    }
    
}
