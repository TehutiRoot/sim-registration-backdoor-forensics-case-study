package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum get uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class setBaselineAlignBottom {
    public static final setBaselineAlignBottom ThreeDS2ServiceInstance;
    public static final setBaselineAlignBottom get;
    private static int getSDKInfo = 1;
    private static int initialize;
    public static int[] valueOf;
    private static final /* synthetic */ setBaselineAlignBottom[] values;
    private final String ThreeDS2Service;

    static {
        get();
        Object[] objArr = new Object[1];
        valueOf(new int[]{434446242, -1397737035, -58475724, 756839481, -1101500726, -862923160}, Color.rgb(0, 0, 0) + 16777226, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf(new int[]{434446242, -1397737035}, 4 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
        setBaselineAlignBottom setbaselinealignbottom = new setBaselineAlignBottom(intern, 0, ((String) objArr2[0]).intern());
        get = setbaselinealignbottom;
        Object[] objArr3 = new Object[1];
        valueOf(new int[]{2058020495, -866298750, 165122990, 769074428}, TextUtils.getCapsMode("", 0, 0) + 7, objArr3);
        String intern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        valueOf(new int[]{2058020495, -866298750}, 4 - TextUtils.indexOf("", "", 0, 0), objArr4);
        setBaselineAlignBottom setbaselinealignbottom2 = new setBaselineAlignBottom(intern2, 1, ((String) objArr4[0]).intern());
        ThreeDS2ServiceInstance = setbaselinealignbottom2;
        values = new setBaselineAlignBottom[]{setbaselinealignbottom, setbaselinealignbottom2};
        initialize = (getSDKInfo + 51) % 128;
    }

    private setBaselineAlignBottom(String str, int i, String str2) {
        this.ThreeDS2Service = str2;
    }

    public static void get() {
        valueOf = new int[]{1353961927, 320212977, -1397000008, -1552012376, -1396213196, -1204714571, 1140621722, -31302903, 1746524650, -1973469042, -543886535, -315111201, 811013545, 1733687974, 2009323657, -1166124845, -1123159232, -405444125};
    }

    public static setBaselineAlignBottom valueOf(String str) {
        int i = getSDKInfo + 115;
        initialize = i % 128;
        int i2 = i % 2;
        setBaselineAlignBottom setbaselinealignbottom = (setBaselineAlignBottom) Enum.valueOf(setBaselineAlignBottom.class, str);
        if (i2 != 0) {
            int i3 = 20 / 0;
        }
        getSDKInfo = (initialize + 9) % 128;
        return setbaselinealignbottom;
    }

    public static setBaselineAlignBottom[] values() {
        getSDKInfo = (initialize + 33) % 128;
        setBaselineAlignBottom[] setbaselinealignbottomArr = (setBaselineAlignBottom[]) values.clone();
        getSDKInfo = (initialize + 69) % 128;
        return setbaselinealignbottomArr;
    }

    public static setBaselineAlignBottom values(String str) {
        setBaselineAlignBottom setbaselinealignbottom = get;
        if (C9658om.ThreeDS2ServiceInstance((CharSequence) setbaselinealignbottom.valueOf(), (CharSequence) str)) {
            int i = getSDKInfo + 63;
            initialize = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            setbaselinealignbottom = ThreeDS2ServiceInstance;
        }
        initialize = (getSDKInfo + 65) % 128;
        return setbaselinealignbottom;
    }

    public String valueOf() {
        int i = initialize + 9;
        int i2 = i % 128;
        getSDKInfo = i2;
        if (i % 2 != 0) {
            String str = this.ThreeDS2Service;
            int i3 = i2 + 95;
            initialize = i3 % 128;
            if (i3 % 2 == 0) {
                return str;
            }
            throw null;
        }
        throw null;
    }

    private static void valueOf(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) valueOf.clone();
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