package com.netcetera.threeds.sdk.infrastructure;

import java.util.Arrays;
import kotlin.p023io.encoding.Base64;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oo */
/* loaded from: classes5.dex */
public abstract class AbstractC9671oo {
    private final int ThreeDS2Service;
    protected final byte ThreeDS2ServiceInstance = Base64.padSymbol;
    private final int get;
    private final int valueOf;
    protected final int values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.oo$get */
    /* loaded from: classes5.dex */
    public static class get {
        int ThreeDS2Service;
        byte[] ThreeDS2ServiceInstance;
        int get;
        int getSDKInfo;
        boolean getSDKVersion;
        int getWarnings;
        int valueOf;
        long values;

        public String toString() {
            return String.format("%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]", getClass().getSimpleName(), Arrays.toString(this.ThreeDS2ServiceInstance), Integer.valueOf(this.getWarnings), Boolean.valueOf(this.getSDKVersion), Integer.valueOf(this.ThreeDS2Service), Long.valueOf(this.values), Integer.valueOf(this.getSDKInfo), Integer.valueOf(this.get), Integer.valueOf(this.valueOf));
        }
    }

    public AbstractC9671oo(int i, int i2, int i3, int i4) {
        int i5;
        this.ThreeDS2Service = i;
        this.get = i2;
        if (i3 > 0 && i4 > 0) {
            i5 = (i3 / i2) * i2;
        } else {
            i5 = 0;
        }
        this.values = i5;
        this.valueOf = i4;
    }

    private byte[] valueOf(get getVar) {
        byte[] bArr = getVar.ThreeDS2ServiceInstance;
        if (bArr == null) {
            getVar.ThreeDS2ServiceInstance = new byte[ThreeDS2ServiceInstance()];
            getVar.get = 0;
            getVar.valueOf = 0;
        } else {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            getVar.ThreeDS2ServiceInstance = bArr2;
        }
        return getVar.ThreeDS2ServiceInstance;
    }

    public abstract void ThreeDS2Service(byte[] bArr, int i, int i2, get getVar);

    public int ThreeDS2ServiceInstance() {
        return 8192;
    }

    public abstract void get(byte[] bArr, int i, int i2, get getVar);

    public boolean get(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (61 == b || valueOf(b)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean valueOf(byte b);

    public int values(get getVar) {
        if (getVar.ThreeDS2ServiceInstance != null) {
            return getVar.get - getVar.valueOf;
        }
        return 0;
    }

    public byte[] ThreeDS2ServiceInstance(int i, get getVar) {
        byte[] bArr = getVar.ThreeDS2ServiceInstance;
        return (bArr == null || bArr.length < getVar.get + i) ? valueOf(getVar) : bArr;
    }

    public byte[] values(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        get getVar = new get();
        get(bArr, 0, bArr.length, getVar);
        get(bArr, 0, -1, getVar);
        int i = getVar.get;
        byte[] bArr2 = new byte[i];
        ThreeDS2ServiceInstance(bArr2, 0, i, getVar);
        return bArr2;
    }

    public int ThreeDS2ServiceInstance(byte[] bArr, int i, int i2, get getVar) {
        if (getVar.ThreeDS2ServiceInstance == null) {
            return getVar.getSDKVersion ? -1 : 0;
        }
        int min = Math.min(values(getVar), i2);
        System.arraycopy(getVar.ThreeDS2ServiceInstance, getVar.valueOf, bArr, i, min);
        int i3 = getVar.valueOf + min;
        getVar.valueOf = i3;
        if (i3 >= getVar.get) {
            getVar.ThreeDS2ServiceInstance = null;
        }
        return min;
    }

    public byte[] valueOf(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        get getVar = new get();
        ThreeDS2Service(bArr, 0, bArr.length, getVar);
        ThreeDS2Service(bArr, 0, -1, getVar);
        int i = getVar.get - getVar.valueOf;
        byte[] bArr2 = new byte[i];
        ThreeDS2ServiceInstance(bArr2, 0, i, getVar);
        return bArr2;
    }

    public String ThreeDS2ServiceInstance(byte[] bArr) {
        return C9730ro.get(valueOf(bArr));
    }

    public byte[] ThreeDS2ServiceInstance(String str) {
        return values(C9730ro.ThreeDS2Service(str));
    }
}
