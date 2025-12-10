package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.widget.ExpandableListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class setMenu implements setSubtitleTextColor<setTitleMargin, C9640nr> {
    private static int ThreeDS2ServiceInstance = 0;
    private static int valueOf = 1;
    public static long values = 7659000074740415876L;

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2Service(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setMenu.values     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setMenu.ThreeDS2Service(java.lang.String, int, java.lang.Object[]):void");
    }

    public setTitleMargin ThreeDS2ServiceInstance(C9640nr c9640nr) {
        valueOf = (ThreeDS2ServiceInstance + 85) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2Service("뷠\uf62a⩴庄鋝윟笲", Color.red(0) + 19403, objArr);
        String values2 = c9640nr.values(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        ThreeDS2Service("뷠藖춐ᕶ", 14386 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr2);
        String values3 = c9640nr.values(((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        ThreeDS2Service("뷩\uddb8経鴒㲫屳ﰄᾮ뽱\udf0a", 24659 - ExpandableListView.getPackedPositionType(0L), objArr3);
        setTitleMargin settitlemargin = setSubtitle.get(values2, values3, c9640nr.values(((String) objArr3[0]).intern()));
        ThreeDS2ServiceInstance = (valueOf + 113) % 128;
        return settitlemargin;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSubtitleTextColor
    public /* synthetic */ setTitleMargin valueOf(C9640nr c9640nr) {
        ThreeDS2ServiceInstance = (valueOf + 17) % 128;
        setTitleMargin ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(c9640nr);
        int i = valueOf + 119;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 == 0) {
            return ThreeDS2ServiceInstance2;
        }
        throw null;
    }
}