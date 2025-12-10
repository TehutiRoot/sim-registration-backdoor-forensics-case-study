package com.netcetera.threeds.sdk.infrastructure;

import android.os.Process;
import android.view.ViewConfiguration;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.nk */
/* loaded from: classes5.dex */
public final class C9611nk {
    private static int ThreeDS2Service = 0;
    private static int valueOf = 1;
    public static long values = -7797723509976835050L;

    @SafeVarargs
    public static <T> String ThreeDS2ServiceInstance(T... tArr) {
        StringBuilder sb = new StringBuilder();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            int i2 = valueOf + 75;
            ThreeDS2Service = i2 % 128;
            if (i2 % 2 != 0) {
                sb.append(tArr[i]);
                Object[] objArr = new Object[1];
                get("屪콫", 37634 >>> (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                sb.append(((String) objArr[0]).intern());
                i += 84;
            } else {
                sb.append(tArr[i]);
                Object[] objArr2 = new Object[1];
                get("屪콫", 37634 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr2);
                sb.append(((String) objArr2[0]).intern());
                i++;
            }
        }
        String substring = sb.substring(0, sb.length() - 2);
        int i3 = ThreeDS2Service + 19;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            return substring;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void get(java.lang.String r7, int r8, java.lang.Object[] r9) {
        /*
            if (r7 == 0) goto L6
            char[] r7 = r7.toCharArray()
        L6:
            char[] r7 = (char[]) r7
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.initialize.values
            monitor-enter(r0)
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service = r8     // Catch: java.lang.Throwable -> L2e
            int r8 = r7.length     // Catch: java.lang.Throwable -> L2e
            char[] r8 = new char[r8]     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L2e
        L13:
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r3 = r7.length     // Catch: java.lang.Throwable -> L2e
            if (r2 >= r3) goto L30
            char r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            int r4 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2Service     // Catch: java.lang.Throwable -> L2e
            int r4 = r4 * r2
            r3 = r3 ^ r4
            long r3 = (long) r3     // Catch: java.lang.Throwable -> L2e
            long r5 = com.netcetera.threeds.sdk.infrastructure.C9611nk.values     // Catch: java.lang.Throwable -> L2e
            long r3 = r3 ^ r5
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L2e
            char r3 = (char) r4     // Catch: java.lang.Throwable -> L2e
            r8[r2] = r3     // Catch: java.lang.Throwable -> L2e
            int r2 = com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2e
            int r2 = r2 + 1
            com.netcetera.threeds.sdk.infrastructure.initialize.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2e
            goto L13
        L2e:
            r7 = move-exception
            goto L39
        L30:
            java.lang.String r7 = new java.lang.String     // Catch: java.lang.Throwable -> L2e
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            r9[r1] = r7
            return
        L39:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9611nk.get(java.lang.String, int, java.lang.Object[]):void");
    }

    @SafeVarargs
    public static <T> String values(T... tArr) {
        StringBuilder sb = new StringBuilder();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            int i2 = ThreeDS2Service + 113;
            valueOf = i2 % 128;
            if (i2 % 2 == 0) {
                sb.append(tArr[i]);
                Object[] objArr = new Object[1];
                get("尶", 35542 >> Process.getGidForName(""), objArr);
                sb.append(((String) objArr[0]).intern());
                i += 68;
            } else {
                sb.append(tArr[i]);
                Object[] objArr2 = new Object[1];
                get("尶", 35542 - Process.getGidForName(""), objArr2);
                sb.append(((String) objArr2[0]).intern());
                i++;
            }
        }
        String substring = sb.substring(0, sb.length() - 1);
        ThreeDS2Service = (valueOf + 7) % 128;
        return substring;
    }
}