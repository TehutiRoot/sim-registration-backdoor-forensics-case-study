package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.db */
/* loaded from: classes5.dex */
public abstract class AbstractC9325db extends AbstractC9290bx {
    private static int ThreeDS2Service$InitializationCallback = 1;
    private static int onError;
    protected final InterfaceC9515js cleanup;
    private final int getSDKInfo;
    protected final setProperty getSDKVersion;
    private final InterfaceC9385fi getWarnings;
    private final InterfaceC9394fr initialize;

    public AbstractC9325db(Context context, InterfaceC9515js interfaceC9515js, InterfaceC9385fi interfaceC9385fi, InterfaceC9404ga interfaceC9404ga, InterfaceC9394fr interfaceC9394fr) {
        super(context);
        this.getSDKInfo = C9624nm.valueOf(900);
        this.cleanup = interfaceC9515js;
        this.getWarnings = interfaceC9385fi;
        this.getSDKVersion = interfaceC9404ga.ThreeDS2ServiceInstance();
        this.initialize = interfaceC9394fr;
    }

    public final void ThreeDS2Service(Context context) {
        int i = onError;
        int i2 = i & 13;
        int i3 = (i ^ 13) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service$InitializationCallback = i4 % 128;
        if (i4 % 2 != 0) {
            values(this.initialize.ThreeDS2Service(context));
        } else {
            values(this.initialize.ThreeDS2Service(context));
            throw null;
        }
    }

    public boolean ThreeDS2ServiceInstance() {
        boolean z;
        int i = onError;
        int i2 = i & 25;
        int i3 = (i | 25) & (~i2);
        int i4 = i2 << 1;
        int i5 = (i3 & i4) + (i3 | i4);
        ThreeDS2Service$InitializationCallback = i5 % 128;
        if (i5 % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9290bx
    public final ViewGroup get(Context context) {
        C9580lx c9580lx = new C9580lx(context, this.getSDKInfo);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        c9580lx.setLayoutParams(layoutParams);
        c9580lx.setOrientation(1);
        int i = onError;
        int i2 = i ^ 79;
        ThreeDS2Service$InitializationCallback = ((((i & 79) | i2) << 1) - i2) % 128;
        return c9580lx;
    }

    public abstract void valueOf(Context context);

    public final void values(Context context) {
        int i = ThreeDS2Service$InitializationCallback;
        onError = ((i & 29) + (i | 29)) % 128;
        AbstractC9239af ThreeDS2Service = this.getWarnings.ThreeDS2Service(context, get().ThreeDS2Service(), this.getSDKVersion);
        ThreeDS2Service.get(ThreeDS2ServiceInstance());
        values(ThreeDS2Service);
        int i2 = onError;
        int i3 = ((i2 & 90) + (i2 | 90)) - 1;
        ThreeDS2Service$InitializationCallback = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        throw null;
    }

    public InterfaceC9515js get() {
        int i = ThreeDS2Service$InitializationCallback;
        int i2 = i & 7;
        int i3 = i2 + ((i ^ 7) | i2);
        int i4 = i3 % 128;
        onError = i4;
        if (i3 % 2 == 0) {
            InterfaceC9515js interfaceC9515js = this.cleanup;
            ThreeDS2Service$InitializationCallback = (i4 + 105) % 128;
            return interfaceC9515js;
        }
        throw null;
    }
}
