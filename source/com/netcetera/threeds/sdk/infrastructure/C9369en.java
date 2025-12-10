package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.en */
/* loaded from: classes5.dex */
public class C9369en implements keys {
    public static int ThreeDS2ServiceInstance = 178;
    private static int cleanup = 1;
    private static int get;
    private final keys ThreeDS2Service;
    private final InterfaceC9652ns valueOf = C9653nt.ThreeDS2ServiceInstance(C9369en.class);
    private final replaceAll values;

    public C9369en(keys keysVar, replaceAll replaceall) {
        this.ThreeDS2Service = keysVar;
        this.values = replaceall;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        int i = cleanup + 83;
        get = i % 128;
        if (i % 2 != 0) {
            Color.alpha(1);
            ViewConfiguration.getTapTimeout();
            Drawable.resolveOpacity(0, 1);
            threeDS2ServiceInstance.ThreeDS2Service(this.values);
            this.ThreeDS2Service.valueOf(threeDS2ServiceInstance);
            return;
        }
        Color.alpha(0);
        ViewConfiguration.getTapTimeout();
        Drawable.resolveOpacity(0, 0);
        threeDS2ServiceInstance.ThreeDS2Service(this.values);
        this.ThreeDS2Service.valueOf(threeDS2ServiceInstance);
    }
}
