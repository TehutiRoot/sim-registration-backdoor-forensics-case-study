package com.netcetera.threeds.sdk.api.configparameters;

import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.netcetera.threeds.sdk.infrastructure.C9610nj;
import com.netcetera.threeds.sdk.infrastructure.C9658om;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class ConfigParameters {
    private static int valueOf = 0;
    private static int values = 1;
    private HashMap<String, HashMap<String, String>> ThreeDS2Service = new HashMap<>();

    public void addParam(String str, String str2, String str3) throws InvalidInputException {
        int i = valueOf + 115;
        values = i % 128;
        if (i % 2 != 0) {
            C9610nj.ThreeDS2Service(str2, "paramName");
            C9610nj.ThreeDS2Service(str3, "paramValue");
            String values2 = C9658om.values(str);
            String values3 = C9658om.values(str2);
            if (this.ThreeDS2Service.containsKey(values2)) {
                HashMap<String, String> hashMap = this.ThreeDS2Service.get(values2);
                if (!hashMap.containsKey(values3)) {
                    hashMap.put(values3, str3);
                    return;
                }
                throw new InvalidInputException("There is already parameter with that name in the specified group");
            }
            HashMap<String, String> hashMap2 = new HashMap<>();
            hashMap2.put(values3, str3);
            this.ThreeDS2Service.put(values2, hashMap2);
            values = (valueOf + 11) % 128;
            return;
        }
        C9610nj.ThreeDS2Service(str2, "paramName");
        C9610nj.ThreeDS2Service(str3, "paramValue");
        String values4 = C9658om.values(str);
        C9658om.values(str2);
        this.ThreeDS2Service.containsKey(values4);
        throw null;
    }

    public String getParamValue(String str, String str2) throws InvalidInputException {
        String str3;
        C9610nj.ThreeDS2Service(str2, "paramName");
        String values2 = C9658om.values(str);
        String values3 = C9658om.values(str2);
        if (!this.ThreeDS2Service.containsKey(values2)) {
            str3 = null;
        } else {
            int i = valueOf + 101;
            values = i % 128;
            if (i % 2 == 0) {
                str3 = this.ThreeDS2Service.get(values2).get(values3);
                int i2 = 4 / 0;
            } else {
                str3 = this.ThreeDS2Service.get(values2).get(values3);
            }
        }
        int i3 = values + 31;
        valueOf = i3 % 128;
        if (i3 % 2 == 0) {
            return str3;
        }
        throw null;
    }

    public String removeParam(String str, String str2) throws InvalidInputException {
        int i = valueOf + 5;
        values = i % 128;
        if (i % 2 != 0) {
            C9610nj.ThreeDS2Service(str2, "paramName");
            String values2 = C9658om.values(str);
            String values3 = C9658om.values(str2);
            if (!this.ThreeDS2Service.containsKey(values2)) {
                return null;
            }
            String remove = this.ThreeDS2Service.get(values2).remove(values3);
            values = (valueOf + 7) % 128;
            return remove;
        }
        C9610nj.ThreeDS2Service(str2, "paramName");
        String values4 = C9658om.values(str);
        C9658om.values(str2);
        this.ThreeDS2Service.containsKey(values4);
        throw null;
    }
}