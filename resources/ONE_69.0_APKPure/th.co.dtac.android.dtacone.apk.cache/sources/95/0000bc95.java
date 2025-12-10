package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class jcbConfiguration {
    public final String[] ThreeDS2Service;
    public final int ThreeDS2ServiceInstance;
    public final String valueOf;

    public jcbConfiguration(String str, int i, String... strArr) {
        this.valueOf = str;
        this.ThreeDS2Service = strArr;
        this.ThreeDS2ServiceInstance = i;
    }

    public jcbConfiguration(String str, String... strArr) {
        this.valueOf = str;
        this.ThreeDS2Service = strArr;
        this.ThreeDS2ServiceInstance = Integer.MAX_VALUE;
    }

    public jcbConfiguration(String str) {
        this.valueOf = str;
        this.ThreeDS2Service = null;
        this.ThreeDS2ServiceInstance = Integer.MAX_VALUE;
    }
}