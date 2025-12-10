package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ExpandableListView;

/* loaded from: classes5.dex */
abstract class ErrorMessage {
    private static int ThreeDS2Service = 0;
    public static long getSDKInfo = 2821689602400153314L;
    private static int valueOf = 1;

    public hideProgress ThreeDS2ServiceInstance(Context context, String str) {
        hideProgress hideprogress;
        int i = valueOf + 21;
        ThreeDS2Service = i % 128;
        if (i % 2 != 0) {
            Resources resources = context.getResources();
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance("溆\uf017厍딀ᒟ瘣\ud9a4㬶", 40583 % ExpandableListView.getPackedPositionType(0L), objArr);
            hideprogress = hideProgress.get(resources.getIdentifier(str, ((String) objArr[0]).intern(), context.getPackageName()));
        } else {
            Resources resources2 = context.getResources();
            Object[] objArr2 = new Object[1];
            ThreeDS2ServiceInstance("溆\uf017厍딀ᒟ瘣\ud9a4㬶", 40583 - ExpandableListView.getPackedPositionType(0L), objArr2);
            hideprogress = hideProgress.get(resources2.getIdentifier(str, ((String) objArr2[0]).intern(), context.getPackageName()));
        }
        int i2 = valueOf + 33;
        ThreeDS2Service = i2 % 128;
        if (i2 % 2 == 0) {
            return hideprogress;
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
    private static void ThreeDS2ServiceInstance(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.ErrorMessage.getSDKInfo     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.ErrorMessage.ThreeDS2ServiceInstance(java.lang.String, int, java.lang.Object[]):void");
    }
}
