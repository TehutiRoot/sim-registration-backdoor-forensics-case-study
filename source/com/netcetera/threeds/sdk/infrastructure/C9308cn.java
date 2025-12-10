package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cn */
/* loaded from: classes5.dex */
class C9308cn extends AbstractC9290bx {
    private static int cleanup = 1;
    private static int initialize;
    private final InterfaceC9391fo getSDKVersion;

    public C9308cn(Context context, InterfaceC9391fo interfaceC9391fo) {
        super(context);
        this.getSDKVersion = interfaceC9391fo;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public void ThreeDS2ServiceInstance(Context context) {
        AbstractC9260ay valueOf = this.getSDKVersion.valueOf(context);
        valueOf.ThreeDS2Service(new C9312cp(this));
        values(valueOf);
        int i = initialize;
        int i2 = (i & (-110)) | ((~i) & 109);
        int i3 = -(-((i & 109) << 1));
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        cleanup = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public final ViewGroup get(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        int i = initialize;
        int i2 = ((i & 114) + (i | 114)) - 1;
        cleanup = i2 % 128;
        if (i2 % 2 != 0) {
            return frameLayout;
        }
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ThreeDS2ServiceInstance(isEmpty isempty) {
        values(new C9306cl(isempty));
        int i = initialize;
        cleanup = ((i ^ 81) + ((i & 81) << 1)) % 128;
    }
}
