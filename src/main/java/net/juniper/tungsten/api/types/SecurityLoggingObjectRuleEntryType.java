//
// Automatically generated.
//
package net.juniper.tungsten.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.tungsten.api.ApiPropertyBase;

public class SecurityLoggingObjectRuleEntryType extends ApiPropertyBase {
    String rule_uuid;
    Integer rate;
    public SecurityLoggingObjectRuleEntryType() {
    }
    public SecurityLoggingObjectRuleEntryType(String rule_uuid, Integer rate) {
        this.rule_uuid = rule_uuid;
        this.rate = rate;
    }
    public SecurityLoggingObjectRuleEntryType(String rule_uuid) {
        this(rule_uuid, 100);    }
    
    public String getRuleUuid() {
        return rule_uuid;
    }
    
    public void setRuleUuid(String rule_uuid) {
        this.rule_uuid = rule_uuid;
    }
    
    
    public Integer getRate() {
        return rate;
    }
    
    public void setRate(Integer rate) {
        this.rate = rate;
    }
    
}
