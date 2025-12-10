package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.iq */
/* loaded from: classes5.dex */
public class C9487iq implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle ThreeDS2Service$4eb310c1;
    private final setId ThreeDS2ServiceInstance;

    public C9487iq(setLineBreakStyle setlinebreakstyle, setId setid) {
        this.ThreeDS2Service$4eb310c1 = setlinebreakstyle;
        this.ThreeDS2ServiceInstance = setid;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - Color.blue(0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 49, (char) (View.getDefaultSize(0, 0) + 31083))).getDeclaredMethod("get", (Class) get3DSServerTransactionID.ThreeDS2Service(3252 - TextUtils.getOffsetBefore("", 0), 49 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (31082 - ImageFormat.getBitsPerPixel(0))), setId.class).invoke(null, this.ThreeDS2Service$4eb310c1, this.ThreeDS2ServiceInstance);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
