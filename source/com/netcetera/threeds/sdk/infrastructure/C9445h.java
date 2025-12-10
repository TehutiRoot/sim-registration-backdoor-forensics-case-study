package com.netcetera.threeds.sdk.infrastructure;

import android.view.ViewConfiguration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.h */
/* loaded from: classes5.dex */
public final class C9445h {
    private static int[] ThreeDS2Service = {-146233319, -451678460, -914645253, 1067782777, -1141521068, -2087698842, -1959457537, -707112374, -1033892204, 1031034041, 940641224, -424569355, 72679048, 1968569278, -908563771, 1789902304, -1480051533, 530558095};
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;

    private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (rootPublicKey.ThreeDS2Service) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = (int[]) ThreeDS2Service.clone();
                rootPublicKey.valueOf = 0;
                while (true) {
                    int i2 = rootPublicKey.valueOf;
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
                        rootPublicKey.ThreeDS2ServiceInstance = (c << 16) + c2;
                        rootPublicKey.values = (c3 << 16) + c4;
                        rootPublicKey.get(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = rootPublicKey.ThreeDS2ServiceInstance ^ iArr2[i5];
                            rootPublicKey.ThreeDS2ServiceInstance = i6;
                            rootPublicKey.values = rootPublicKey.ThreeDS2Service(i6) ^ rootPublicKey.values;
                            int i7 = rootPublicKey.ThreeDS2ServiceInstance;
                            rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                            rootPublicKey.values = i7;
                        }
                        int i8 = rootPublicKey.ThreeDS2ServiceInstance;
                        rootPublicKey.ThreeDS2ServiceInstance = rootPublicKey.values;
                        rootPublicKey.values = i8;
                        rootPublicKey.values = i8 ^ iArr2[16];
                        rootPublicKey.ThreeDS2ServiceInstance ^= iArr2[17];
                        int i9 = rootPublicKey.ThreeDS2ServiceInstance;
                        cArr[0] = (char) (i9 >>> 16);
                        cArr[1] = (char) i9;
                        int i10 = rootPublicKey.values;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        rootPublicKey.get(iArr2);
                        int i11 = rootPublicKey.valueOf;
                        int i12 = i11 * 2;
                        cArr2[i12] = cArr[0];
                        cArr2[i12 + 1] = cArr[1];
                        cArr2[i12 + 2] = cArr[2];
                        cArr2[i12 + 3] = cArr[3];
                        rootPublicKey.valueOf = i11 + 2;
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

    /* renamed from: b */
    public static native int m33364b(String str, String str2);

    public static int valueOf(String str, String str2) {
        String str3;
        File file = new File(str);
        if (file.exists()) {
            int i = get + 51;
            ThreeDS2ServiceInstance = i % 128;
            if (i % 2 != 0) {
                if (file.isFile()) {
                    try {
                        Object[] objArr = new Object[1];
                        ThreeDS2Service(new int[]{-1539474656, 332219035}, (ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr);
                        Scanner useDelimiter = new Scanner(new FileInputStream(file)).useDelimiter((String) objArr[0]);
                        if (useDelimiter.hasNext()) {
                            str3 = useDelimiter.next();
                            get = (ThreeDS2ServiceInstance + 61) % 128;
                        } else {
                            str3 = "";
                        }
                        useDelimiter.close();
                        if (str3.contains(str2)) {
                            int i2 = ThreeDS2ServiceInstance + 91;
                            get = i2 % 128;
                            if (i2 % 2 != 0) {
                                return 0;
                            }
                            return 1;
                        }
                    } catch (IOException unused) {
                    }
                }
            } else {
                file.isFile();
                throw null;
            }
        }
        return 0;
    }
}
