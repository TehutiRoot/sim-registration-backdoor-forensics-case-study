package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.text.AndroidCharacter;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* loaded from: classes5.dex */
public class setCompoundDrawableTintMode implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.ThreeDS2Service ThreeDS2Service$7e09f6;
    private final Context ThreeDS2ServiceInstance;

    public setCompoundDrawableTintMode(com.netcetera.threeds.sdk.api.ThreeDS2Service threeDS2Service, Context context) {
        this.ThreeDS2Service$7e09f6 = threeDS2Service;
        this.ThreeDS2ServiceInstance = context;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1, (char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 58)).getDeclaredMethod("ThreeDS2Service", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(ViewConfiguration.getKeyRepeatDelay() >> 16, (char) (MotionEvent.axisFromString("") + 1), 'k' - AndroidCharacter.getMirror('0')), Context.class).invoke(null, this.ThreeDS2Service$7e09f6, this.ThreeDS2ServiceInstance);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}