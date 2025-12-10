package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.netcetera.threeds.sdk.api.p018ui.logic.UiCustomization;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.bu */
/* loaded from: classes5.dex */
public class C9286bu extends AbstractC9283br<FrameLayout> {
    private static int getSDKVersion = 1;
    private static int valueOf;
    private final InterfaceC9515js ThreeDS2Service;
    private final InterfaceC9591mh ThreeDS2ServiceInstance;
    private final InterfaceC9311compute get;
    private final InterfaceC9387fk values;

    public C9286bu(InterfaceC9515js interfaceC9515js, InterfaceC9311compute interfaceC9311compute, InterfaceC9591mh interfaceC9591mh, InterfaceC9387fk interfaceC9387fk) {
        this.ThreeDS2Service = interfaceC9515js;
        this.get = interfaceC9311compute;
        this.ThreeDS2ServiceInstance = interfaceC9591mh;
        this.values = interfaceC9387fk;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.AbstractC9283br
    public /* synthetic */ FrameLayout ThreeDS2Service(Context context) {
        int i = getSDKVersion;
        int i2 = i & 71;
        int i3 = (i ^ 71) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            return get(context);
        }
        get(context);
        throw null;
    }

    public FrameLayout get(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        C9564list c9564list = new C9564list(context, this.ThreeDS2Service.ThreeDS2ServiceInstance(), this.ThreeDS2Service.ThreeDS2ServiceInstance(UiCustomization.ButtonType.CANCEL));
        c9564list.get(new C9284bs(this));
        this.ThreeDS2ServiceInstance.ThreeDS2ServiceInstance(frameLayout, C9597mn.ThreeDS2ServiceInstance(), C9597mn.ThreeDS2ServiceInstance(), C9597mn.ThreeDS2ServiceInstance(), C9597mn.ThreeDS2ServiceInstance(0));
        C9377ev.ThreeDS2ServiceInstance(frameLayout, this.ThreeDS2Service.ThreeDS2ServiceInstance().getSDKInfo());
        frameLayout.addView(c9564list.ThreeDS2Service());
        int i = valueOf;
        getSDKVersion = (((i | 15) << 1) - (i ^ 15)) % 128;
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void valueOf(isEmpty isempty) {
        int i = valueOf;
        int i2 = i & 73;
        int i3 = (i2 - (~(-(-((i ^ 73) | i2))))) - 1;
        getSDKVersion = i3 % 128;
        if (i3 % 2 == 0) {
            this.get.ThreeDS2Service(this.values.get(getStackTrace.ThreeDS2ServiceInstance));
            int i4 = 19 / 0;
            return;
        }
        this.get.ThreeDS2Service(this.values.get(getStackTrace.ThreeDS2ServiceInstance));
    }
}
