package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* loaded from: classes5.dex */
public class getSchemeName extends getSchemeEncryptionPublicKeyId {
    public static long ThreeDS2Service = 0;
    public static logoDark ThreeDS2ServiceInstance = null;
    private static int[] cleanup = null;
    public static logoDark get = null;
    private static int getSDKInfo = 0;
    private static int getSDKVersion = 1;
    public static logoDark getWarnings;
    private static long initialize;
    public static long valueOf;
    public static long values;

    static {
        ThreeDS2ServiceInstance();
        values = -1L;
        ThreeDS2ServiceInstance = null;
        ThreeDS2Service = -1L;
        get = null;
        valueOf = -1L;
        getWarnings = null;
        getSDKInfo = (getSDKVersion + 101) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r8.canRead() == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service r8) {
        /*
            r0 = 18
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKInfo
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKVersion = r2
            int r1 = r1 % 2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<java.io.File> r3 = java.io.File.class
            r4 = 0
            r5 = 1
            if (r1 != 0) goto L40
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> Lb1
            r1[r5] = r2     // Catch: java.lang.Exception -> Lb1
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lb1
            int[] r0 = new int[r0]     // Catch: java.lang.Exception -> Lb1
            r0 = {x00b2: FILL_ARRAY_DATA  , data: [-743016342, 1537730983, -472069461, 1483144888, -1034758509, -1051177005, -794676986, -925245981, -1273268407, 1448456940, 987674460, -554750020, -1273268407, 1448456940, 987674460, -554750020, 683372176, -772906455} // fill-array     // Catch: java.lang.Exception -> Lb1
            int r6 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch: java.lang.Exception -> Lb1
            int r6 = r6 << r5
            r7 = 70
            int r7 = r7 % r6
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lb1
            ThreeDS2Service(r0, r7, r6)     // Catch: java.lang.Exception -> Lb1
            r0 = r6[r4]     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb1
            r2[r5] = r0     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r8 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values(r3, r1, r2, r8)     // Catch: java.lang.Exception -> Lb1
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Exception -> Lb1
            boolean r0 = r8.canRead()     // Catch: java.lang.Exception -> Lb1
            r0 = r0 ^ r5
            if (r0 == r5) goto L6a
            goto L78
        L40:
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lb1
            r1[r4] = r2     // Catch: java.lang.Exception -> Lb1
            int[] r0 = new int[r0]     // Catch: java.lang.Exception -> Lb1
            r0 = {x00da: FILL_ARRAY_DATA  , data: [-743016342, 1537730983, -472069461, 1483144888, -1034758509, -1051177005, -794676986, -925245981, -1273268407, 1448456940, 987674460, -554750020, -1273268407, 1448456940, 987674460, -554750020, 683372176, -772906455} // fill-array     // Catch: java.lang.Exception -> Lb1
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch: java.lang.Exception -> Lb1
            int r2 = r2 >> 16
            int r2 = r2 + 36
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lb1
            ThreeDS2Service(r0, r2, r6)     // Catch: java.lang.Exception -> Lb1
            r0 = r6[r4]     // Catch: java.lang.Exception -> Lb1
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> Lb1
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lb1
            r2[r4] = r0     // Catch: java.lang.Exception -> Lb1
            java.lang.Object r8 = com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.values(r3, r1, r2, r8)     // Catch: java.lang.Exception -> Lb1
            java.io.File r8 = (java.io.File) r8     // Catch: java.lang.Exception -> Lb1
            boolean r0 = r8.canRead()     // Catch: java.lang.Exception -> Lb1
            if (r0 != 0) goto L78
        L6a:
            int r8 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKVersion
            int r8 = r8 + 11
            int r8 = r8 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKInfo = r8
            int r8 = r8 + r5
            int r8 = r8 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKVersion = r8
            return r4
        L78:
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Exception -> Lb1
            r0.<init>(r8)     // Catch: java.lang.Exception -> Lb1
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Exception -> Lb1
            r8.<init>(r0)     // Catch: java.lang.Exception -> Lb1
            java.lang.String r1 = r8.readLine()     // Catch: java.lang.Throwable -> La9
            r2 = 2082874434(0x7c262442, float:3.4506267E36)
            r3 = -1812795625(0xffffffff93f2ef17, float:-6.132515E-27)
            int[] r2 = new int[]{r3, r2}     // Catch: java.lang.Throwable -> La9
            int r3 = android.view.View.MeasureSpec.getMode(r4)     // Catch: java.lang.Throwable -> La9
            int r3 = r3 + r5
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> La9
            ThreeDS2Service(r2, r3, r5)     // Catch: java.lang.Throwable -> La9
            r2 = r5[r4]     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La9
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> La9
            r0.close()     // Catch: java.lang.Exception -> Lb1
            r8.close()     // Catch: java.lang.Exception -> Lb1
            return r1
        La9:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Exception -> Lb1
            r8.close()     // Catch: java.lang.Exception -> Lb1
            throw r1     // Catch: java.lang.Exception -> Lb1
        Lb1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeName.ThreeDS2Service(com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$ThreeDS2Service):boolean");
    }

    public static void ThreeDS2ServiceInstance() {
        initialize = 512243387041355723L;
        cleanup = new int[]{363815288, -238057016, -395483632, -808016419, -499279063, 1930186390, -618795367, -1810665082, 1440585476, 1571029466, 1291501689, 1680563409, -1801135790, -791829614, 619483153, 671697211, -679411633, 646946891};
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00be A[Catch: Exception -> 0x00d6, LOOP:0: B:8:0x0067->B:19:0x00be, LOOP_END, TryCatch #0 {Exception -> 0x00d6, blocks: (B:5:0x0018, B:11:0x0076, B:16:0x00b7, B:19:0x00be, B:20:0x00c0, B:22:0x00c8, B:14:0x0096, B:6:0x003e), top: B:27:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.netcetera.threeds.sdk.infrastructure.logoDark get(int r12, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service r13) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeName.get(int, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$ThreeDS2Service):com.netcetera.threeds.sdk.infrastructure.logoDark");
    }

    public static logoDark values(int i) {
        getSchemeLogoDark.ThreeDS2Service threeDS2Service = new getSchemeLogoDark.ThreeDS2Service();
        logoDark logodark = get(i, threeDS2Service);
        if (i != logodark.values()) {
            getSDKVersion = (getSDKInfo + 89) % 128;
            return logodark;
        }
        logoDark logodark2 = get(i);
        if (i != logodark2.values()) {
            int i2 = getSDKVersion + 13;
            getSDKInfo = i2 % 128;
            if (i2 % 2 == 0) {
                return logodark2;
            }
            throw null;
        }
        return ThreeDS2ServiceInstance(i, threeDS2Service);
    }

    public static int ThreeDS2ServiceInstance(int i) {
        getSDKInfo = (getSDKVersion + 57) % 128;
        int values2 = values(i).values();
        int i2 = getSDKInfo + 35;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            return values2;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.netcetera.threeds.sdk.infrastructure.logoDark ThreeDS2ServiceInstance(int r3, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark.ThreeDS2Service r4) {
        /*
            java.lang.String r0 = get(r4)
            boolean r1 = values(r4)
            if (r1 == 0) goto L2e
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKVersion
            int r1 = r1 + 63
            int r2 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKInfo = r2
            int r1 = r1 % 2
            if (r1 == 0) goto L1e
            boolean r1 = ThreeDS2Service(r4)
            r2 = 1
            if (r1 == r2) goto L24
            goto L2e
        L1e:
            boolean r1 = ThreeDS2Service(r4)
            if (r1 == 0) goto L2e
        L24:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKInfo
            int r1 = r1 + 115
            int r1 = r1 % 128
            com.netcetera.threeds.sdk.infrastructure.getSchemeName.getSDKVersion = r1
            if (r0 != 0) goto L34
        L2e:
            boolean r1 = r4.get()
            if (r1 == 0) goto L40
        L34:
            r1 = r3 ^ 20
            int r4 = r4.values(r1)
            com.netcetera.threeds.sdk.infrastructure.logoDark r1 = new com.netcetera.threeds.sdk.infrastructure.logoDark
            r1.<init>(r3, r4, r0)
            return r1
        L40:
            com.netcetera.threeds.sdk.infrastructure.logoDark r4 = new com.netcetera.threeds.sdk.infrastructure.logoDark
            r0 = 0
            r4.<init>(r3, r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeName.ThreeDS2ServiceInstance(int, com.netcetera.threeds.sdk.infrastructure.getSchemeLogoDark$ThreeDS2Service):com.netcetera.threeds.sdk.infrastructure.logoDark");
    }

    private static boolean values(getSchemeLogoDark.ThreeDS2Service threeDS2Service) {
        getSDKInfo = (getSDKVersion + 25) % 128;
        try {
            Object[] objArr = new Object[1];
            ThreeDS2Service(new int[]{1542633992, -715467826, 693242571, -1013287066, 1108193513, 826873936, -600421583, -1440439818, 191389959, -543419165, -762610421, 1053141007, 1213639038, 302974536, 1348374898, -1109235161}, 30 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
            File file = (File) getSchemeLogoDark.values(File.class, new Class[]{String.class}, new Object[]{(String) objArr[0]}, threeDS2Service);
            if (!(!file.canRead())) {
                FileReader fileReader = new FileReader(file);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String readLine = bufferedReader.readLine();
                Object[] objArr2 = new Object[1];
                ThreeDS2Service(new int[]{-1812795625, 2082874434}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr2);
                boolean equals = readLine.equals((String) objArr2[0]);
                fileReader.close();
                bufferedReader.close();
                getSDKInfo = (getSDKVersion + 71) % 128;
                return equals;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static logoDark get(int i) {
        int i2 = getSDKInfo + 1;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0 ? C9293c.m33369d() == 1 : C9293c.m33369d() == 0) {
            logoDark logodark = new logoDark(i, 10, null);
            getSDKVersion = (getSDKInfo + 15) % 128;
            return logodark;
        }
        logoDark logodark2 = new logoDark(i, i, null);
        getSDKVersion = (getSDKInfo + 45) % 128;
        return logodark2;
    }

    private static void ThreeDS2Service(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (rootPublicKey.ThreeDS2Service) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = (int[]) cleanup.clone();
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

    private static String get(getSchemeLogoDark.ThreeDS2Service threeDS2Service) {
        File file;
        getSDKVersion = (getSDKInfo + 117) % 128;
        try {
            Object[] objArr = new Object[1];
            ThreeDS2Service(new int[]{-743016342, 1537730983, -472069461, 1483144888, -1034758509, -1051177005, -794676986, -925245981, -1273268407, 1448456940, 987674460, -554750020, -1899789892, 1771250944, -599429371, 1080112715, -1718701996, 1128306540, -377008658, -1423360844}, 40 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            file = (File) getSchemeLogoDark.values(File.class, new Class[]{String.class}, new Object[]{(String) objArr[0]}, threeDS2Service);
        } catch (Exception unused) {
        }
        if (!file.canRead()) {
            int i = getSDKInfo + 125;
            getSDKVersion = i % 128;
            if (i % 2 != 0) {
                return null;
            }
            throw null;
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String readLine = bufferedReader.readLine();
        Object[] objArr2 = new Object[1];
        ThreeDS2Service(new int[]{233384384, 300901700}, 3 - TextUtils.indexOf("", ""), objArr2);
        if (!readLine.equals((String) objArr2[0])) {
            int i2 = getSDKInfo + CameraActivity.REQUEST_CODE;
            getSDKVersion = i2 % 128;
            if (i2 % 2 == 0) {
                fileReader.close();
            } else {
                fileReader.close();
            }
            bufferedReader.close();
            return readLine;
        }
        fileReader.close();
        bufferedReader.close();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r8, int r9, java.lang.Object[] r10) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.getParamValue.ThreeDS2ServiceInstance
            monitor-enter(r0)
            long r1 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.initialize     // Catch: java.lang.Throwable -> L3a
            char[] r8 = com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf(r1, r8, r9)     // Catch: java.lang.Throwable -> L3a
            r9 = 4
            com.netcetera.threeds.sdk.infrastructure.getParamValue.get = r9     // Catch: java.lang.Throwable -> L3a
        L14:
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            if (r1 >= r2) goto L3c
            int r1 = r1 + (-4)
            com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf = r1     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            char r2 = r8[r1]     // Catch: java.lang.Throwable -> L3a
            int r3 = r1 % 4
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L3a
            r2 = r2 ^ r3
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L3a
            int r4 = com.netcetera.threeds.sdk.infrastructure.getParamValue.valueOf     // Catch: java.lang.Throwable -> L3a
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L3a
            long r6 = com.netcetera.threeds.sdk.infrastructure.getSchemeName.initialize     // Catch: java.lang.Throwable -> L3a
            long r4 = r4 * r6
            long r2 = r2 ^ r4
            int r3 = (int) r2     // Catch: java.lang.Throwable -> L3a
            char r2 = (char) r3     // Catch: java.lang.Throwable -> L3a
            r8[r1] = r2     // Catch: java.lang.Throwable -> L3a
            int r1 = com.netcetera.threeds.sdk.infrastructure.getParamValue.get     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + 1
            com.netcetera.threeds.sdk.infrastructure.getParamValue.get = r1     // Catch: java.lang.Throwable -> L3a
            goto L14
        L3a:
            r8 = move-exception
            goto L48
        L3c:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L3a
            int r2 = r8.length     // Catch: java.lang.Throwable -> L3a
            int r2 = r2 - r9
            r1.<init>(r8, r9, r2)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r8 = 0
            r10[r8] = r1
            return
        L48:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.getSchemeName.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
