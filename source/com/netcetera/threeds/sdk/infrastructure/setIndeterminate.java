package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes5.dex */
public class setIndeterminate implements setDividerHeight {
    public static int ThreeDS2ServiceInstance = 0;
    private static int cleanup = 0;
    public static char get = 0;
    private static int getSDKInfo = 1;
    public static long valueOf = 2004467754404055750L;
    private final InterfaceC9652ns ThreeDS2Service = C9653nt.ThreeDS2ServiceInstance(setIndeterminate.class);
    private final setDividerHeight getWarnings;
    private final Executor values;

    public setIndeterminate(Executor executor, setDividerHeight setdividerheight) {
        this.values = executor;
        this.getWarnings = setdividerheight;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
        /*
            if (r12 == 0) goto L6
            char[] r12 = r12.toCharArray()
        L6:
            char[] r12 = (char[]) r12
            if (r11 == 0) goto Le
            char[] r11 = r11.toCharArray()
        Le:
            char[] r11 = (char[]) r11
            if (r10 == 0) goto L16
            char[] r10 = r10.toCharArray()
        L16:
            char[] r10 = (char[]) r10
            java.lang.Object r0 = com.netcetera.threeds.sdk.infrastructure.cleanup.get
            monitor-enter(r0)
            java.lang.Object r11 = r11.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r11 = (char[]) r11     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r12 = r12.clone()     // Catch: java.lang.Throwable -> L7c
            char[] r12 = (char[]) r12     // Catch: java.lang.Throwable -> L7c
            r1 = 0
            char r2 = r11[r1]     // Catch: java.lang.Throwable -> L7c
            r9 = r9 ^ r2
            char r9 = (char) r9     // Catch: java.lang.Throwable -> L7c
            r11[r1] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 2
            char r2 = r12[r9]     // Catch: java.lang.Throwable -> L7c
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r8
            char r8 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r12[r9] = r8     // Catch: java.lang.Throwable -> L7c
            int r8 = r10.length     // Catch: java.lang.Throwable -> L7c
            char[] r9 = new char[r8]     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r1     // Catch: java.lang.Throwable -> L7c
        L3b:
            int r2 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            if (r2 >= r8) goto L7e
            int r3 = r2 + 2
            int r3 = r3 % 4
            int r4 = r2 + 3
            int r4 = r4 % 4
            int r2 = r2 % 4
            char r2 = r11[r2]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 * 32718
            char r3 = r12[r3]     // Catch: java.lang.Throwable -> L7c
            int r2 = r2 + r3
            r5 = 65535(0xffff, float:9.1834E-41)
            int r2 = r2 % r5
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            com.netcetera.threeds.sdk.infrastructure.cleanup.values = r2     // Catch: java.lang.Throwable -> L7c
            char r6 = r11[r4]     // Catch: java.lang.Throwable -> L7c
            int r6 = r6 * 32718
            int r6 = r6 + r3
            int r6 = r6 / r5
            char r3 = (char) r6     // Catch: java.lang.Throwable -> L7c
            r12[r4] = r3     // Catch: java.lang.Throwable -> L7c
            r11[r4] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            char r4 = r10[r3]     // Catch: java.lang.Throwable -> L7c
            r2 = r2 ^ r4
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r6 = com.netcetera.threeds.sdk.infrastructure.setIndeterminate.valueOf     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.setIndeterminate.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.setIndeterminate.get     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L7c
            char r2 = (char) r2     // Catch: java.lang.Throwable -> L7c
            r9[r3] = r2     // Catch: java.lang.Throwable -> L7c
            int r3 = r3 + 1
            com.netcetera.threeds.sdk.infrastructure.cleanup.ThreeDS2ServiceInstance = r3     // Catch: java.lang.Throwable -> L7c
            goto L3b
        L7c:
            r8 = move-exception
            goto L87
        L7e:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            r13[r1] = r8
            return
        L87:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.setIndeterminate.ThreeDS2ServiceInstance(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    public static /* synthetic */ void valueOf(setIndeterminate setindeterminate, setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        cleanup = (getSDKInfo + 49) % 128;
        setindeterminate.valueOf(setscrollingcacheenabled, str);
        int i = getSDKInfo + 87;
        cleanup = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setDividerHeight
    public void values(setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        this.values.execute(new setIndeterminateDrawable(this, setscrollingcacheenabled, str));
        int i = getSDKInfo + 85;
        cleanup = i % 128;
        if (i % 2 == 0) {
            return;
        }
        throw null;
    }

    public static setDividerHeight valueOf(setDividerHeight setdividerheight) {
        setIndeterminate setindeterminate = new setIndeterminate(Executors.newSingleThreadExecutor(), setdividerheight);
        cleanup = (getSDKInfo + 85) % 128;
        return setindeterminate;
    }

    private /* synthetic */ void valueOf(setScrollingCacheEnabled setscrollingcacheenabled, String str) {
        getSDKInfo = (cleanup + 99) % 128;
        try {
            this.getWarnings.values(setscrollingcacheenabled, str);
        } catch (setId e) {
            InterfaceC9652ns interfaceC9652ns = this.ThreeDS2Service;
            Object[] objArr = new Object[1];
            ThreeDS2ServiceInstance(View.MeasureSpec.makeMeasureSpec(0, 0), (char) (Color.green(0) + 5674), "﹢夬\ue3ea戠\ua6fbퟌ纱ꤎ\uea8d棇䍲\ue800劚ⵌ坝黚뿳覟\uea70镶捈\ue726혶粲\ueb2cةꢕ켨䓥᧴婻ꔤ⸚輴鵡蝚紋뫰䖍ꃶꝜ扌\ue202՟ᢷ팀靸︁遲觓ᛶ䕢\u05fa詉\ud987鶽㚁⽑", "⭪л⩳䨖", "諆烺䳍ᯑ", objArr);
            interfaceC9652ns.ThreeDS2Service(((String) objArr[0]).intern(), e.ThreeDS2Service());
        }
        cleanup = (getSDKInfo + 111) % 128;
    }
}
