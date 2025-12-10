package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setIncludeFontPadding {
    private static int cleanup = 1;
    private static int getSDKInfo;
    private final Integer ThreeDS2Service;
    private final setStackTrace ThreeDS2ServiceInstance;
    private final addSuppressed get;
    private final clear getSDKVersion;
    private final getInfo initialize;
    private final fillInStackTrace valueOf;
    private final String values;

    public setIncludeFontPadding(fillInStackTrace fillinstacktrace, addSuppressed addsuppressed, setStackTrace setstacktrace, Integer num, String str, getInfo getinfo, clear clearVar) {
        this.valueOf = fillinstacktrace;
        this.get = addsuppressed;
        this.ThreeDS2ServiceInstance = setstacktrace;
        this.ThreeDS2Service = num;
        this.values = str;
        this.initialize = getinfo;
        this.getSDKVersion = clearVar;
    }

    public addSuppressed ThreeDS2Service() {
        addSuppressed addsuppressed;
        int i = cleanup;
        int i2 = (i & 30) + (i | 30);
        int i3 = (~i2) + (i2 << 1);
        int i4 = i3 % 128;
        getSDKInfo = i4;
        if (i3 % 2 != 0) {
            addsuppressed = this.get;
            int i5 = 97 / 0;
        } else {
            addsuppressed = this.get;
        }
        cleanup = (((i4 | 97) << 1) - (i4 ^ 97)) % 128;
        return addsuppressed;
    }

    public setStackTrace ThreeDS2ServiceInstance() {
        int i = cleanup;
        int i2 = (i ^ 42) + ((i & 42) << 1);
        int i3 = (~i2) + (i2 << 1);
        int i4 = i3 % 128;
        getSDKInfo = i4;
        if (i3 % 2 == 0) {
            setStackTrace setstacktrace = this.ThreeDS2ServiceInstance;
            int i5 = (i4 ^ 41) + ((i4 & 41) << 1);
            cleanup = i5 % 128;
            if (i5 % 2 != 0) {
                return setstacktrace;
            }
            throw null;
        }
        throw null;
    }

    public getInfo cleanup() {
        int i = cleanup;
        int i2 = i & 121;
        int i3 = (i ^ 121) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getSDKInfo = i4 % 128;
        if (i4 % 2 == 0) {
            return this.initialize;
        }
        throw null;
    }

    public Integer get() {
        int i = getSDKInfo;
        int i2 = i & 25;
        int i3 = ((i ^ 25) | i2) << 1;
        int i4 = -((i | 25) & (~i2));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        cleanup = i5 % 128;
        int i6 = i5 % 2;
        Integer num = this.ThreeDS2Service;
        if (i6 == 0) {
            int i7 = 71 / 0;
        }
        return num;
    }

    public clear getSDKInfo() {
        int i = cleanup;
        clear clearVar = this.getSDKVersion;
        getSDKInfo = (i + 125) % 128;
        return clearVar;
    }

    public boolean getSDKVersion() {
        int i = cleanup;
        int i2 = i & 33;
        int i3 = (i ^ 33) | i2;
        getSDKInfo = ((i2 & i3) + (i3 | i2)) % 128;
        boolean ThreeDS2ServiceInstance = C9664oh.ThreeDS2ServiceInstance(this.valueOf, this.get, this.ThreeDS2ServiceInstance, this.ThreeDS2Service, this.values, this.initialize, this.getSDKVersion);
        int i4 = cleanup;
        int i5 = i4 & 83;
        int i6 = ((i4 | 83) & (~i5)) + (i5 << 1);
        getSDKInfo = i6 % 128;
        if (i6 % 2 == 0) {
            return ThreeDS2ServiceInstance;
        }
        throw null;
    }

    public String valueOf() {
        int i = cleanup;
        String str = this.values;
        getSDKInfo = ((i ^ 35) + ((i & 35) << 1)) % 128;
        return str;
    }

    public fillInStackTrace values() {
        int i = getSDKInfo + 20;
        int i2 = (~i) + (i << 1);
        cleanup = i2 % 128;
        int i3 = i2 % 2;
        fillInStackTrace fillinstacktrace = this.valueOf;
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return fillinstacktrace;
    }
}
