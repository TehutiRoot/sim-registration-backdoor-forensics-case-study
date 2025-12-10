package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.View;
import android.widget.ExpandableListView;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jy */
/* loaded from: classes5.dex */
public class C9511jy implements InterfaceC9500jo {
    public static int[] ThreeDS2Service = {929193131, 282207708, 1209857454, -883571953, 1892182339, -1876841579, 130387175, 722478491, 1569661431, 356254555, -1611755875, -888855059, -1895588917, -2075611511, 1546837155, 50266479, -1584487389, 1451635238};
    private static int get = 1;
    private static int values;

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9500jo
    public int ThreeDS2Service() {
        int i = get + 73;
        values = i % 128;
        if (i % 2 != 0) {
            return 21;
        }
        return 24;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public int ThreeDS2ServiceInstance() {
        int i;
        int i2 = values + 47;
        int i3 = i2 % 128;
        get = i3;
        if (i2 % 2 == 0) {
            i = 104;
        } else {
            i = 16;
        }
        int i4 = i3 + 49;
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return i;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String get() {
        Object obj;
        int i = values + 83;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            valueOf(new int[]{-529046969, 424787137, -208255322, 1330718911}, ExpandableListView.getPackedPositionGroup(1L) * 99, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(new int[]{-529046969, 424787137, -208255322, 1330718911}, 7 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9503jr
    public String valueOf() {
        Object obj;
        int i = values + 27;
        get = i % 128;
        int[] iArr = {409810076, 262002622, 1511024240, -1309568422, -836046712, -993729592};
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            valueOf(iArr, 86 >> View.combineMeasuredStates(0, 1), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(iArr, 10 - View.combineMeasuredStates(0, 0), objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        values = (get + 95) % 128;
        return intern;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9500jo
    public String values() {
        Object obj;
        int i = values + 109;
        get = i % 128;
        if (i % 2 == 0) {
            Object[] objArr = new Object[1];
            valueOf(new int[]{-529046969, 424787137, -208255322, 1330718911}, 82 >>> TextUtils.getTrimmedLength(""), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            valueOf(new int[]{-529046969, 424787137, -208255322, 1330718911}, TextUtils.getTrimmedLength("") + 7, objArr2);
            obj = objArr2[0];
        }
        String intern = ((String) obj).intern();
        int i2 = get + 41;
        values = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 53 / 0;
        }
        return intern;
    }

    private static void valueOf(int[] iArr, int i, Object[] objArr) {
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
}