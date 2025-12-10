package com.netcetera.threeds.sdk.infrastructure;

import android.text.AndroidCharacter;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setNavigationIcon;

/* loaded from: classes5.dex */
public final class setContentInsetsAbsolute extends setCollapseContentDescription {
    private static int cleanup = 0;
    private static int getSDKVersion = 1;
    public static int initialize = 82;

    private setContentInsetsAbsolute(setSubtitleTextColor<setTitleMargin, C9651nr> setsubtitletextcolor, InterfaceC9498jb interfaceC9498jb, setOverflowIcon setoverflowicon, setNavigationContentDescription setnavigationcontentdescription) {
        super(setsubtitletextcolor, interfaceC9498jb, setoverflowicon, setnavigationcontentdescription);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r8 = r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r6, int r7, java.lang.String r8, int r9, boolean r10, java.lang.Object[] r11) {
        /*
            if (r8 == 0) goto L6
            char[] r8 = r8.toCharArray()
        L6:
            char[] r8 = (char[]) r8
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.apiKey.get
            monitor-enter(r0)
            char[] r1 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L10:
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r3 >= r7) goto L31
            char r3 = r8[r3]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf = r3     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            int r4 = com.netcetera.threeds.sdk.infrastructure.apiKey.valueOf     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 + r9
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            char r4 = r1[r3]     // Catch: java.lang.Throwable -> L2f
            int r5 = com.netcetera.threeds.sdk.infrastructure.setContentInsetsAbsolute.initialize     // Catch: java.lang.Throwable -> L2f
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch: java.lang.Throwable -> L2f
            r1[r3] = r4     // Catch: java.lang.Throwable -> L2f
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L2f
            goto L10
        L2f:
            r6 = move-exception
            goto L69
        L31:
            if (r6 <= 0) goto L48
            com.netcetera.threeds.sdk.infrastructure.apiKey.values = r6     // Catch: java.lang.Throwable -> L2f
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            java.lang.System.arraycopy(r1, r2, r6, r2, r7)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r2, r1, r9, r8)     // Catch: java.lang.Throwable -> L2f
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.values     // Catch: java.lang.Throwable -> L2f
            int r9 = r7 - r8
            java.lang.System.arraycopy(r6, r8, r1, r2, r9)     // Catch: java.lang.Throwable -> L2f
        L48:
            if (r10 == 0) goto L60
            char[] r6 = new char[r7]     // Catch: java.lang.Throwable -> L2f
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r2     // Catch: java.lang.Throwable -> L2f
        L4e:
            int r8 = com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L2f
            if (r8 >= r7) goto L5f
            int r9 = r7 - r8
            int r9 = r9 + (-1)
            char r9 = r1[r9]     // Catch: java.lang.Throwable -> L2f
            r6[r8] = r9     // Catch: java.lang.Throwable -> L2f
            int r8 = r8 + 1
            com.netcetera.threeds.sdk.infrastructure.apiKey.ThreeDS2ServiceInstance = r8     // Catch: java.lang.Throwable -> L2f
            goto L4e
        L5f:
            r1 = r6
        L60:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L2f
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r11[r2] = r6
            return
        L69:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setContentInsetsAbsolute.ThreeDS2ServiceInstance(int, int, java.lang.String, int, boolean, java.lang.Object[]):void");
    }

    public static setCollapseContentDescription get(InterfaceC9498jb interfaceC9498jb) {
        setContentInsetsAbsolute setcontentinsetsabsolute = new setContentInsetsAbsolute(new setCollapseIcon(), interfaceC9498jb, new setOverflowIcon(), new setNavigationContentDescription());
        getSDKVersion = (cleanup + 65) % 128;
        return setcontentinsetsabsolute;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription
    public void ThreeDS2Service(C9651nr c9651nr, setNavigationIcon.valueOf valueof) {
        getSDKVersion = (cleanup + 87) % 128;
        Object[] objArr = new Object[1];
        ThreeDS2ServiceInstance(AndroidCharacter.getMirror('0') - 30, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 19, "\ufffb￪\u0005￼\u0004\uffdf�\u0004\uffff\n\t\uffff\u0002\ufffb\n\uffff\ufffe\r\n\u000e", 188 - View.resolveSize(0, 0), true, objArr);
        valueof.mastercardSchemeConfiguration(c9651nr.values(((String) objArr[0]).intern()));
        getSDKVersion = (cleanup + 99) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setCollapseContentDescription
    public put values() {
        cleanup = (getSDKVersion + 71) % 128;
        put putVar = put.ThreeDS2ServiceInstance;
        int i = getSDKVersion + 7;
        cleanup = i % 128;
        if (i % 2 != 0) {
            int i2 = 71 / 0;
        }
        return putVar;
    }
}
