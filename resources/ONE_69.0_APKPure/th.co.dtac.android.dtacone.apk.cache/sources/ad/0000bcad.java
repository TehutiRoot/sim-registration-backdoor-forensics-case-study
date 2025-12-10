package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jz */
/* loaded from: classes5.dex */
public class C9512jz implements InterfaceC9502jq {
    private static int ThreeDS2Service = 0;
    public static int[] ThreeDS2ServiceInstance = {1391141289, 273286688, 1276289620, -1703567940, -947262704, 1385518372, -1847126075, 812561887, -1468806135, -1541129749, -93444591, -1829493791, -902337785, -248580569, -1746292791, 148884429, 1127826295, -820599966};
    private static int get = 1;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public String ThreeDS2Service() {
        Object obj;
        int i = ThreeDS2Service + 19;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            values(new int[]{447469077, -744715908, 2139610926, 1630253991}, 121 >> (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(new int[]{447469077, -744715908, 2139610926, 1630253991}, 7 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i = (ThreeDS2Service + 125) % 128;
        get = i;
        ThreeDS2Service = (i + 49) % 128;
        return 16;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        Object obj;
        int i = get + 67;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            values(new int[]{447469077, -744715908, 2139610926, 1630253991}, 29 % Color.alpha(1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(new int[]{447469077, -744715908, 2139610926, 1630253991}, 7 - Color.alpha(0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int getWarnings() {
        ThreeDS2Service = (get + 9) % 128;
        return 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        Object obj;
        int i = get + 87;
        ThreeDS2Service = i % 128;
        int[] iArr = {-96927281, -122028354, 1960247533, 949875050, -1041055972, -157048418};
        if (i % 2 != 0) {
            Object[] objArr = new Object[1];
            values(iArr, 83 - TextUtils.indexOf("", (char) Matrix.MATRIX_TYPE_RANDOM_LT), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            values(iArr, 9 - TextUtils.indexOf((CharSequence) "", '0'), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9502jq
    public int values() {
        int i = get + 41;
        int i2 = i % 128;
        ThreeDS2Service = i2;
        int i3 = i % 2 != 0 ? 5 : 4;
        int i4 = i2 + 23;
        get = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 79 / 0;
        }
        return i3;
    }

    private static void values(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) ThreeDS2ServiceInstance.clone();
                onError.valueOf = 0;
                while (true) {
                    int i2 = onError.valueOf;
                    if (i2 < iArr.length) {
                        int i3 = iArr[i2];
                        char c = (char) (i3 >> 16);
                        cArr[0] = c;
                        char c2 = (char) i3;
                        cArr[1] = c2;
                        int i4 = iArr[i2 + 1];
                        char c3 = (char) (i4 >> 16);
                        cArr[2] = c3;
                        char c4 = (char) i4;
                        cArr[3] = c4;
                        onError.values = (c << 16) + c2;
                        onError.ThreeDS2Service = (c3 << 16) + c4;
                        onError.valueOf(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = onError.values ^ iArr2[i5];
                            onError.values = i6;
                            onError.ThreeDS2Service = onError.ThreeDS2Service(i6) ^ onError.ThreeDS2Service;
                            int i7 = onError.values;
                            onError.values = onError.ThreeDS2Service;
                            onError.ThreeDS2Service = i7;
                        }
                        int i8 = onError.values;
                        onError.values = onError.ThreeDS2Service;
                        onError.ThreeDS2Service = i8;
                        onError.ThreeDS2Service = i8 ^ iArr2[16];
                        onError.values ^= iArr2[17];
                        int i9 = onError.values;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = onError.ThreeDS2Service;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        onError.valueOf(iArr2);
                        int i11 = onError.valueOf;
                        int i12 = i11 << 1;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        onError.valueOf = i11 + 2;
                    } else {
                        str = new String(cArr2, 0, i);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}