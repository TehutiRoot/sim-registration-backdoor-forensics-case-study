package com.netcetera.threeds.sdk.infrastructure;

import android.app.Activity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.jf */
/* loaded from: classes5.dex */
public class C9502jf implements com.netcetera.threeds.sdk.api.p018ui.ProgressView {
    public static char ThreeDS2ServiceInstance = 6;
    private static int getSDKInfo = 0;
    private static int getWarnings = 1;
    public static char[] valueOf = {13787, 13806, 13800, 13798, 13791, 13813, 13811, 13753, 13801, 13772, 13789, 13794, 13770, 13788, 13812, 13792, 13805, 13793, 13779, 13796, 13748, 13797, 13795, 13819, 13747, 13822, 13790, 13817, 13821, 13754, 13814, 13746, 13823, 13816, 13774, 13804};
    private final C9508jl ThreeDS2Service;
    private final InterfaceC9588me<Activity> get;
    private C9510jn getSDKVersion;
    private final InterfaceC9652ns values = C9653nt.ThreeDS2ServiceInstance(C9502jf.class);

    public C9502jf(C9508jl c9508jl, InterfaceC9588me<Activity> interfaceC9588me) {
        this.ThreeDS2Service = c9508jl;
        this.get = interfaceC9588me;
    }

    public static C9502jf ThreeDS2Service(getErrorMessageType geterrormessagetype, InterfaceC9515js interfaceC9515js) {
        C9502jf c9502jf = new C9502jf(new C9508jl(geterrormessagetype, interfaceC9515js), C9587md.values());
        getWarnings = (getSDKInfo + 39) % 128;
        return c9502jf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r11 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ThreeDS2ServiceInstance(int r10, java.lang.String r11, byte r12, java.lang.Object[] r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9502jf.ThreeDS2ServiceInstance(int, java.lang.String, byte, java.lang.Object[]):void");
    }

    public void get() {
        getSDKInfo = (getWarnings + 9) % 128;
        if (ThreeDS2Service()) {
            int i = getWarnings + 115;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                this.getSDKVersion.valueOf();
                this.getSDKVersion = null;
                return;
            }
            this.getSDKVersion.valueOf();
            this.getSDKVersion = null;
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void hideProgress() {
        if (ThreeDS2Service()) {
            int i = getWarnings + 27;
            getSDKInfo = i % 128;
            if (i % 2 == 0) {
                this.getSDKVersion.hideProgress();
            } else {
                this.getSDKVersion.hideProgress();
                throw null;
            }
        }
        getSDKInfo = (getWarnings + 25) % 128;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public boolean isProgressShown() {
        int i = getSDKInfo + 31;
        getWarnings = i % 128;
        if (i % 2 != 0) {
            if (ThreeDS2Service()) {
                return this.getSDKVersion.isProgressShown();
            }
            int i2 = getWarnings + 97;
            getSDKInfo = i2 % 128;
            if (i2 % 2 == 0) {
                return false;
            }
            throw null;
        }
        ThreeDS2Service();
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.api.p018ui.ProgressView
    public void showProgress() {
        int i = getWarnings + 63;
        getSDKInfo = i % 128;
        if (i % 2 == 0) {
            if (ThreeDS2Service()) {
                this.getSDKVersion.showProgress();
                getSDKInfo = (getWarnings + 21) % 128;
            }
            int i2 = getSDKInfo + 39;
            getWarnings = i2 % 128;
            if (i2 % 2 == 0) {
                int i3 = 86 / 0;
                return;
            }
            return;
        }
        ThreeDS2Service();
        throw null;
    }

    public void ThreeDS2Service(Activity activity) {
        if (!this.get.ThreeDS2ServiceInstance(activity)) {
            int i = getWarnings + 61;
            getSDKInfo = i % 128;
            if (i % 2 != 0) {
                get();
                throw null;
            }
            get();
        }
        if (this.getSDKVersion == null) {
            C9510jn ThreeDS2ServiceInstance2 = this.ThreeDS2Service.ThreeDS2ServiceInstance();
            this.getSDKVersion = ThreeDS2ServiceInstance2;
            this.get.ThreeDS2ServiceInstance(activity, ThreeDS2ServiceInstance2);
            getSDKInfo = (getWarnings + 89) % 128;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r6.getSDKVersion == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r6.getSDKVersion == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = r6.values;
        r1 = new java.lang.Object[1];
        ThreeDS2ServiceInstance(89 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), "\u000e\u0000\u0004\u001d\b\u0002㗳㗳\n\u0007\"\u000e\u001a\u0011\u0000\u0002\u0018\u000b\f\b\u0000\u0007\u0012#\t\f\u001f\u001a\u0017\u001a\u0014\f\u0007\u0000\u000b\u0012\u0000\f\u000e!\u001b#\u0017\u001c\u001d\u0015㘀㘀\b\f\u001d\u0018 \u0004\u0014\u0011\u000b\u0014\u0019\u0003\u000b\u0000\r\b\u001a\"\u0000\r\u0003\u0000\u001a\u0004\u0002\u000e\t\n\b\u001e\r\"\u0003\u0018\u0000\u0007\u001e\u000b\u0004\u0013㖽", (byte) (android.view.View.resolveSize(0, 0) + 10), r1);
        r0.valueOf(((java.lang.String) r1[0]).intern());
        com.netcetera.threeds.sdk.infrastructure.C9502jf.getSDKInfo = (com.netcetera.threeds.sdk.infrastructure.C9502jf.getWarnings + 99) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean ThreeDS2Service() {
        /*
            r6 = this;
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9502jf.getWarnings
            int r0 = r0 + 55
            int r1 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9502jf.getSDKInfo = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L16
            com.netcetera.threeds.sdk.infrastructure.jn r0 = r6.getSDKVersion
            r3 = 12
            int r3 = r3 / r2
            if (r0 != 0) goto L46
            goto L1a
        L16:
            com.netcetera.threeds.sdk.infrastructure.jn r0 = r6.getSDKVersion
            if (r0 != 0) goto L46
        L1a:
            com.netcetera.threeds.sdk.infrastructure.ns r0 = r6.values
            int r3 = android.view.ViewConfiguration.getWindowTouchSlop()
            int r3 = r3 >> 8
            int r3 = 89 - r3
            int r4 = android.view.View.resolveSize(r2, r2)
            int r4 = r4 + 10
            byte r4 = (byte) r4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "\u000e\u0000\u0004\u001d\b\u0002㗳㗳\n\u0007\"\u000e\u001a\u0011\u0000\u0002\u0018\u000b\f\b\u0000\u0007\u0012#\t\f\u001f\u001a\u0017\u001a\u0014\f\u0007\u0000\u000b\u0012\u0000\f\u000e!\u001b#\u0017\u001c\u001d\u0015㘀㘀\b\f\u001d\u0018 \u0004\u0014\u0011\u000b\u0014\u0019\u0003\u000b\u0000\r\b\u001a\"\u0000\r\u0003\u0000\u001a\u0004\u0002\u000e\t\n\b\u001e\r\"\u0003\u0018\u0000\u0007\u001e\u000b\u0004\u0013㖽"
            ThreeDS2ServiceInstance(r3, r5, r4, r1)
            r1 = r1[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.valueOf(r1)
            int r0 = com.netcetera.threeds.sdk.infrastructure.C9502jf.getWarnings
            int r0 = r0 + 99
            int r0 = r0 % 128
            com.netcetera.threeds.sdk.infrastructure.C9502jf.getSDKInfo = r0
            return r2
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netcetera.threeds.sdk.infrastructure.C9502jf.ThreeDS2Service():boolean");
    }
}
