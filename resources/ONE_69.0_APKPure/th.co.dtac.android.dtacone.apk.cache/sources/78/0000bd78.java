package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

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
public final class putIfAbsent implements printStackTrace {
    private static int ThreeDS2Service = 0;
    public static int[] ThreeDS2ServiceInstance = null;
    private static int cleanup = 1;
    public static final putIfAbsent get;
    private static final /* synthetic */ putIfAbsent[] valueOf;
    private String values;

    static {
        valueOf();
        Object[] objArr = new Object[1];
        get(new int[]{988392388, 208067011, 1122091219, -258346749}, TextUtils.indexOf((CharSequence) "", '0', 0) + 6, objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        get(new int[]{-1898377924, 1102840811}, (ViewConfiguration.getTapTimeout() >> 16) + 2, objArr2);
        putIfAbsent putifabsent = new putIfAbsent(intern, 0, ((String) objArr2[0]).intern());
        get = putifabsent;
        valueOf = new putIfAbsent[]{putifabsent};
        int i = cleanup + 119;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    private putIfAbsent(String str, int i, String str2) {
        this.values = str2;
    }

    private static void get(int[] iArr, int i, Object[] objArr) {
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

    public static void valueOf() {
        ThreeDS2ServiceInstance = new int[]{-1723025080, 1715257643, -548336685, 185747714, -449606741, -785794365, 692567191, 1262930119, -230903577, 1461242008, -737186732, 1179121570, 353953765, 917127992, -1305326650, -1067912970, -2090395190, 1552114608};
    }

    public static putIfAbsent[] values() {
        int i = cleanup + 107;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            int i2 = 70 / 0;
            return (putIfAbsent[]) valueOf.clone();
        }
        return (putIfAbsent[]) valueOf.clone();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        int i = (cleanup + CameraActivity.REQUEST_CODE) % 128;
        ThreeDS2Service = i;
        String str = this.values;
        int i2 = i + 95;
        cleanup = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 45 / 0;
        }
        return str;
    }

    public static putIfAbsent valueOf(String str) {
        cleanup = (ThreeDS2Service + 57) % 128;
        putIfAbsent putifabsent = (putIfAbsent) Enum.valueOf(putIfAbsent.class, str);
        int i = cleanup + 29;
        ThreeDS2Service = i % 128;
        if (i % 2 == 0) {
            return putifabsent;
        }
        throw null;
    }
}