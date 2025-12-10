package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.ViewConfiguration;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class setScrollCaptureHint implements setPaddingRelative {
    public static int[] ThreeDS2Service = {-323246472, 144266118, 2113248502, -1512437708, -1770924651, 1814496511, -805711169, -148686543, -607181099, -165705427, -65488084, 2138210657, -212593690, -1843093058, 1710311480, -808994168, 532170733, -1508657858};
    private static int get = 1;
    private static int values;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.setScrollCaptureHint$3 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C97393 {
        private static int ThreeDS2Service = 1;
        private static int get;
        static final /* synthetic */ int[] values;

        static {
            int[] iArr = new int[setPadding.values().length];
            values = iArr;
            try {
                iArr[setPadding.ThreeDS2ServiceInstance.ordinal()] = 1;
                int i = get;
                int i2 = i ^ CameraActivity.REQUEST_CODE;
                int i3 = i & CameraActivity.REQUEST_CODE;
                int i4 = (i2 | i3) << 1;
                int i5 = -((i | CameraActivity.REQUEST_CODE) & (~i3));
                ThreeDS2Service = ((i4 & i5) + (i5 | i4)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                values[setPadding.values.ordinal()] = 2;
                get = (ThreeDS2Service + 13) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            int i6 = get;
            int i7 = i6 & 69;
            ThreeDS2Service = (i7 + ((i6 ^ 69) | i7)) % 128;
        }
    }

    private static void ThreeDS2ServiceInstance(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) ThreeDS2Service.clone();
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

    @Override // com.netcetera.threeds.sdk.infrastructure.setPaddingRelative
    public String get(setId setid) {
        values = (get + 29) % 128;
        if (C97393.values[setid.ThreeDS2Service().ThreeDS2Service().ordinal()] != 1) {
            StringBuilder sb = new StringBuilder();
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance(new int[]{-1344533379, 284199800, -277712567, -1583863957, 847133919, -1376421918, -127647117, -159816605, -137594962, -1225441613, 773036935, 1577064928, -389918995, -1210075785, -127647117, -159816605, 1197236195, -1822630486, 1518688359, -779776897}, 39 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr);
            sb.append(((String) objArr[0]).intern());
            sb.append(setid.ThreeDS2Service().get());
            Object[] objArr2 = new Object[1];
            ThreeDS2ServiceInstance(new int[]{1486313672, 2045427942}, 1 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr2);
            sb.append(((String) objArr2[0]).intern());
            String sb2 = sb.toString();
            values = (get + 1) % 128;
            return sb2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(setid.getMessage());
        Object[] objArr3 = new Object[1];
        ThreeDS2ServiceInstance(new int[]{-1563287150, 1696044957, -28503432, 361414588, 97716135, -1539401120, -1744877933, -479235249}, 14 - Color.red(0), objArr3);
        sb3.append(((String) objArr3[0]).intern());
        sb3.append(setid.ThreeDS2Service().get());
        Object[] objArr4 = new Object[1];
        ThreeDS2ServiceInstance(new int[]{1486313672, 2045427942}, 1 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr4);
        sb3.append(((String) objArr4[0]).intern());
        String sb4 = sb3.toString();
        int i = values + 91;
        get = i % 128;
        if (i % 2 != 0) {
            return sb4;
        }
        throw null;
    }
}