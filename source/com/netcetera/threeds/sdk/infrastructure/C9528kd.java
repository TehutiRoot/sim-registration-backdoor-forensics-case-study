package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.kd */
/* loaded from: classes5.dex */
public final class C9528kd implements InterfaceC9513jq {
    private static int ThreeDS2Service = 1;
    public static int[] get = {2070830746, 2060291746, -541467301, -1259972914, -1886416130, -1970077081, 984479167, -1612343951, 315800308, -775364199, -1486761833, -1941049620, -1515077337, 1533750751, -1800272047, -1802261390, 41627226, -1079111391};
    private static int valueOf;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9513jq
    public String ThreeDS2Service() {
        valueOf = (ThreeDS2Service + 105) % 128;
        Object[] objArr = new Object[1];
        valueOf(new int[]{1185775721, 422788273, -228065146, -987318338}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = ThreeDS2Service + 37;
        valueOf = i % 128;
        if (i % 2 != 0) {
            int i2 = 93 / 0;
        }
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public int ThreeDS2ServiceInstance() {
        int i = (ThreeDS2Service + 53) % 128;
        valueOf = i;
        int i2 = i + 37;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 76 / 0;
        }
        return 16;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String get() {
        valueOf = (ThreeDS2Service + 91) % 128;
        Object[] objArr = new Object[1];
        valueOf(new int[]{1185775721, 422788273, -228065146, -987318338}, Color.argb(0, 0, 0, 0) + 7, objArr);
        String intern = ((String) objArr[0]).intern();
        int i = valueOf + 77;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9513jq
    public int getWarnings() {
        int i = ThreeDS2Service + CameraActivity.REQUEST_CODE;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return 2;
        }
        return 4;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9514jr
    public String valueOf() {
        valueOf = (ThreeDS2Service + 95) % 128;
        Object[] objArr = new Object[1];
        valueOf(new int[]{1574100448, 602589071, -349342050, 2103582798, 1812731889, 2007067529}, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, objArr);
        String intern = ((String) objArr[0]).intern();
        valueOf = (ThreeDS2Service + 69) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9513jq
    public int values() {
        int i = ThreeDS2Service + 121;
        valueOf = i % 128;
        if (i % 2 != 0) {
            return 3;
        }
        return 4;
    }

    private static void valueOf(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) get.clone();
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
