package com.netcetera.threeds.sdk.api.security;

/* loaded from: classes5.dex */
public class Warning {
    private static int ThreeDS2Service = 1;
    private static int valueOf;
    private Severity ThreeDS2ServiceInstance;
    private String get;
    private String values;

    public Warning(String str, String str2, Severity severity) {
        this.get = str;
        this.values = str2;
        this.ThreeDS2ServiceInstance = severity;
    }

    public String getId() {
        int i = valueOf + 5;
        int i2 = i % 128;
        ThreeDS2Service = i2;
        if (i % 2 != 0) {
            String str = this.get;
            int i3 = i2 + 19;
            valueOf = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    public String getMessage() {
        int i = ThreeDS2Service;
        String str = this.values;
        int i2 = i + 91;
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 57 / 0;
        }
        return str;
    }

    public Severity getSeverity() {
        int i = ThreeDS2Service;
        int i2 = i + 73;
        valueOf = i2 % 128;
        if (i2 % 2 == 0) {
            Severity severity = this.ThreeDS2ServiceInstance;
            valueOf = (i + 113) % 128;
            return severity;
        }
        throw null;
    }
}