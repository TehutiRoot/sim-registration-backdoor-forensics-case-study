package com.netcetera.threeds.sdk.api.security;

/* loaded from: classes5.dex */
public enum Severity {
    LOW,
    MEDIUM,
    HIGH;
    
    private static int ThreeDS2ServiceInstance = 0;
    private static int values = 1;

    static {
        int i = values + 99;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    public static Severity valueOf(String str) {
        ThreeDS2ServiceInstance = (values + 45) % 128;
        Severity severity = (Severity) Enum.valueOf(Severity.class, str);
        int i = values + 117;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return severity;
        }
        throw null;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static Severity[] valuesCustom() {
        int i = values + 37;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return (Severity[]) values().clone();
        }
        values().clone();
        throw null;
    }
}