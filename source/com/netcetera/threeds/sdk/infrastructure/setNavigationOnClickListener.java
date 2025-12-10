package com.netcetera.threeds.sdk.infrastructure;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;

/* loaded from: classes5.dex */
public final class setNavigationOnClickListener extends setCollapseContentDescription {
    private static int getSDKVersion = 1;
    public static long getWarnings = 2436491036541377602L;
    private static int initialize;

    private setNavigationOnClickListener(setSubtitleTextColor<setTitleMargin, C9651nr> setsubtitletextcolor, InterfaceC9498jb interfaceC9498jb, setOverflowIcon setoverflowicon, setNavigationContentDescription setnavigationcontentdescription) {
        super(setsubtitletextcolor, interfaceC9498jb, setoverflowicon, setnavigationcontentdescription);
    }

    public static setCollapseContentDescription get(InterfaceC9498jb interfaceC9498jb) {
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(new setCollapseIcon(), interfaceC9498jb, new setOverflowIcon(), new setNavigationContentDescription());
        int i = getSDKVersion + 21;
        initialize = i % 128;
        if (i % 2 == 0) {
            return setnavigationonclicklistener;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription
    public void ThreeDS2Service(C9651nr c9651nr, setNavigationIcon.valueOf valueof) {
        initialize = (getSDKVersion + 75) % 128;
        setSubtitleTextColor<String, String> ThreeDS2ServiceInstance = ThreeDS2ServiceInstance();
        Object[] objArr = new Object[1];
        values("\udc23⧺㞇㶛\u0b7aᅈἬ擭狿碗䚾䱎婵ꀵ", 62939 - TextUtils.getCapsMode("", 0, 0), objArr);
        valueof.valueOf(ThreeDS2ServiceInstance.valueOf(c9651nr.values(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        values("\udc21㗽ྍ憫筲䴔Ꜧ룄銟\ue48c﹀퀛⨟χᗦ澴", (ViewConfiguration.getTapTimeout() >> 16) + 59863, objArr2);
        valueof.ThreeDS2Service(c9651nr.values(((String) objArr2[0]).intern()));
        getSDKVersion = (initialize + 95) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription
    public put values() {
        getSDKVersion = (initialize + 57) % 128;
        put putVar = put.values;
        getSDKVersion = (initialize + 75) % 128;
        return putVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r7 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void values(java.lang.String r7, int r8, java.lang.Object[] r9) {
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
            long r5 = com.netcetera.threeds.sdk.infrastructure.setNavigationOnClickListener.getWarnings     // Catch: java.lang.Throwable -> L2e
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setNavigationOnClickListener.values(java.lang.String, int, java.lang.Object[]):void");
    }
}
