package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.ImageFormat;
import android.os.Process;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ThreeDS2ServiceInstance uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class initCause implements printStackTrace {
    public static final initCause ThreeDS2ServiceInstance;
    private static final /* synthetic */ initCause[] get;
    private static int initialize = 1;
    private static int valueOf;
    public static int[] values;
    private final String ThreeDS2Service;

    static {
        ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        valueOf(new int[]{-1993223425, -574155241}, 2 - ImageFormat.getBitsPerPixel(0), objArr);
        String intern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        valueOf(new int[]{-2061619488, 969211661}, -Process.getGidForName(""), objArr2);
        initCause initcause = new initCause(intern, 0, ((String) objArr2[0]).intern());
        ThreeDS2ServiceInstance = initcause;
        get = new initCause[]{initcause};
        int i = valueOf + 53;
        initialize = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    private initCause(String str, int i, String str2) {
        this.ThreeDS2Service = str2;
    }

    public static void ThreeDS2ServiceInstance() {
        values = new int[]{446175039, 464228567, 1479456624, 1145610767, 1628591603, -893416777, 1968586064, -913224579, -1913745640, -798844788, 1683664093, 427025023, -807737648, 1030736607, -566680709, -1359346478, 1495619005, 1639740216};
    }

    public static initCause valueOf(String str) {
        int i = initialize + 11;
        valueOf = i % 128;
        int i2 = i % 2;
        initCause initcause = (initCause) Enum.valueOf(initCause.class, str);
        if (i2 != 0) {
            int i3 = 36 / 0;
        }
        initialize = (valueOf + 19) % 128;
        return initcause;
    }

    public static initCause[] values() {
        initialize = (valueOf + 17) % 128;
        initCause[] initcauseArr = (initCause[]) get.clone();
        valueOf = (initialize + 13) % 128;
        return initcauseArr;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.printStackTrace
    public String ThreeDS2Service() {
        String str;
        int i = valueOf;
        int i2 = i + 19;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            str = this.ThreeDS2Service;
            int i3 = 44 / 0;
        } else {
            str = this.ThreeDS2Service;
        }
        int i4 = i + 101;
        initialize = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static void valueOf(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (onError.ThreeDS2ServiceInstance) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) values.clone();
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
