package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.il */
/* loaded from: classes5.dex */
public class C9482il implements setSelected.ThreeDS2Service {
    private final setAllCaps ThreeDS2Service;
    private final setLineBreakStyle valueOf$4eb310c1;

    public C9482il(setLineBreakStyle setlinebreakstyle, setAllCaps setallcaps) {
        this.valueOf$4eb310c1 = setlinebreakstyle;
        this.ThreeDS2Service = setallcaps;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(TextUtils.getCapsMode("", 0, 0) + 3252, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49, (char) (31082 - MotionEvent.axisFromString("")))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) get3DSServerTransactionID.ThreeDS2Service(TextUtils.indexOf((CharSequence) "", '0') + 3253, 49 - Color.argb(0, 0, 0, 0), (char) (31083 - (ViewConfiguration.getJumpTapTimeout() >> 16))), setAllCaps.class).invoke(null, this.valueOf$4eb310c1, this.ThreeDS2Service);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
