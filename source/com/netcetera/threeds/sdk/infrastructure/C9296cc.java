package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cc */
/* loaded from: classes5.dex */
class C9296cc extends AbstractC9285bt<FrameLayout> {
    public static char ThreeDS2Service = 0;
    public static int ThreeDS2ServiceInstance = 0;
    private static final String get;
    private static int getWarnings = 0;
    private static int initialize = 1;
    public static long values;
    private int cleanup = -1;
    private final C9348dx getSDKVersion;
    final C9304cj valueOf;

    static {
        getSDKInfo();
        Object[] objArr = new Object[1];
        valueOf((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) (6374 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), "縬㊧午\ue232\uf209靫떋㣎ᵣ\uecf8畋ᾕ\uf893匼\ueae6㤼咇㐿皔ꪦ斵윔⓱ᨇ⮂〰㞺㓞", "ꋒ係\ue654㴘", "\u0000\u0000\u0000\u0000", objArr);
        get = ((String) objArr[0]).intern();
        int i = initialize + 75;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public C9296cc(C9304cj c9304cj, C9348dx c9348dx) {
        this.valueOf = c9304cj;
        this.getSDKVersion = c9348dx;
    }

    public static C9296cc get(C9297cd c9297cd, com.netcetera.threeds.sdk.api.p018ui.ProgressView progressView, InterfaceC9515js interfaceC9515js, InterfaceC9401fy interfaceC9401fy) {
        C9296cc c9296cc = new C9296cc(C9304cj.get(c9297cd, interfaceC9515js, interfaceC9401fy), C9348dx.get(progressView));
        int i = getWarnings + 25;
        initialize = i % 128;
        if (i % 2 != 0) {
            return c9296cc;
        }
        throw null;
    }

    public static void getSDKInfo() {
        ThreeDS2ServiceInstance = 0;
        ThreeDS2Service = (char) 32930;
        values = 0L;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public /* synthetic */ View ThreeDS2Service(Context context) {
        initialize = (getWarnings + 67) % 128;
        FrameLayout frameLayout = get(context);
        initialize = (getWarnings + 109) % 128;
        return frameLayout;
    }

    public void ThreeDS2ServiceInstance() {
        int i = getWarnings + 11;
        initialize = i % 128;
        if (i % 2 == 0) {
            this.getSDKVersion.ThreeDS2ServiceInstance();
            int i2 = 61 / 0;
        } else {
            this.getSDKVersion.ThreeDS2ServiceInstance();
        }
        initialize = (getWarnings + 103) % 128;
    }

    public void cleanup() {
        initialize = (getWarnings + 101) % 128;
        this.valueOf.ThreeDS2ServiceInstance();
        int i = getWarnings + 107;
        initialize = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }

    public void valueOf(getServices getservices) {
        getWarnings = (initialize + 49) % 128;
        this.valueOf.ThreeDS2ServiceInstance(getservices);
        getWarnings = (initialize + 51) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9285bt
    public /* synthetic */ void values(setAllCaps setallcaps, FrameLayout frameLayout) {
        int i = getWarnings + 95;
        initialize = i % 128;
        int i2 = i % 2;
        values2(setallcaps, frameLayout);
        if (i2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r12 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void valueOf(int r8, char r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object[] r13) {
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
            long r6 = com.netcetera.threeds.sdk.infrastructure.C9296cc.values     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            int r2 = com.netcetera.threeds.sdk.infrastructure.C9296cc.ThreeDS2ServiceInstance     // Catch: java.lang.Throwable -> L7c
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L7c
            long r4 = r4 ^ r6
            char r2 = com.netcetera.threeds.sdk.infrastructure.C9296cc.ThreeDS2Service     // Catch: java.lang.Throwable -> L7c
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
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9296cc.valueOf(int, char, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void");
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public void ThreeDS2Service() {
        initialize = (getWarnings + 19) % 128;
        this.valueOf.values();
        this.getSDKVersion.values();
        getWarnings = (initialize + 85) % 128;
    }

    public void ThreeDS2ServiceInstance(InterfaceC9373er interfaceC9373er) {
        Object[] objArr = new Object[1];
        valueOf((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (6374 - View.resolveSize(0, 0)), "縬㊧午\ue232\uf209靫떋㣎ᵣ\uecf8畋ᾕ\uf893匼\ueae6㤼咇㐿皔ꪦ斵윔⓱ᨇ⮂〰㞺㓞", "ꋒ係\ue654㴘", "\u0000\u0000\u0000\u0000", objArr);
        int intValue = interfaceC9373er.get(((String) objArr[0]).intern(), -1).intValue();
        int i = this.cleanup;
        if (intValue != i || i == -1) {
            return;
        }
        int i2 = getWarnings + 9;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            this.valueOf.get(interfaceC9373er);
            throw null;
        }
        this.valueOf.get(interfaceC9373er);
        getWarnings = (initialize + 57) % 128;
    }

    public void values(InterfaceC9370eo interfaceC9370eo) {
        getWarnings = (initialize + 61) % 128;
        Object[] objArr = new Object[1];
        valueOf(View.MeasureSpec.getSize(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6374), "縬㊧午\ue232\uf209靫떋㣎ᵣ\uecf8畋ᾕ\uf893匼\ueae6㤼咇㐿皔ꪦ斵윔⓱ᨇ⮂〰㞺㓞", "ꋒ係\ue654㴘", "\u0000\u0000\u0000\u0000", objArr);
        interfaceC9370eo.values(((String) objArr[0]).intern(), this.cleanup);
        this.valueOf.ThreeDS2Service(interfaceC9370eo);
        initialize = (getWarnings + 79) % 128;
    }

    public void get(InterfaceC9311compute interfaceC9311compute) {
        int i = getWarnings + 77;
        initialize = i % 128;
        if (i % 2 != 0) {
            this.valueOf.ThreeDS2ServiceInstance(interfaceC9311compute);
        } else {
            this.valueOf.ThreeDS2ServiceInstance(interfaceC9311compute);
            throw null;
        }
    }

    public FrameLayout get(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.addView(this.valueOf.valueOf(context));
        frameLayout.addView(this.getSDKVersion.valueOf(context));
        int i = initialize + 27;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            int i2 = 78 / 0;
        }
        return frameLayout;
    }

    /* renamed from: values  reason: avoid collision after fix types in other method */
    public void values2(setAllCaps setallcaps, FrameLayout frameLayout) {
        int i = initialize + 15;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            this.valueOf.get(setallcaps);
            this.cleanup = ((Integer) C9664oh.ThreeDS2Service(setallcaps.getSDKVersion(), -1)).intValue();
            int i2 = 6 / 0;
        } else {
            this.valueOf.get(setallcaps);
            this.cleanup = ((Integer) C9664oh.ThreeDS2Service(setallcaps.getSDKVersion(), -1)).intValue();
        }
        int i3 = getWarnings + CameraActivity.REQUEST_CODE;
        initialize = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 58 / 0;
        }
    }

    public void get() {
        getWarnings = (initialize + 23) % 128;
        this.getSDKVersion.get();
        initialize = (getWarnings + 1) % 128;
    }
}
