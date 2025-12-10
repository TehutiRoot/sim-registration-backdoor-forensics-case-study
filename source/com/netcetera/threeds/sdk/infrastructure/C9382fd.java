package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.api.transaction.Transaction;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.fd */
/* loaded from: classes5.dex */
public class C9382fd implements setSelected.ThreeDS2Service {
    private final com.netcetera.threeds.sdk.api.transaction.Transaction ThreeDS2ServiceInstance$5f2d72c8;
    private final Transaction.BridgingMessageExtensionVersion values;

    public C9382fd(com.netcetera.threeds.sdk.api.transaction.Transaction transaction, Transaction.BridgingMessageExtensionVersion bridgingMessageExtensionVersion) {
        this.ThreeDS2ServiceInstance$5f2d72c8 = transaction;
        this.values = bridgingMessageExtensionVersion;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(375 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 54750), KeyEvent.normalizeMetaState(0) + 48)).getDeclaredMethod("ThreeDS2Service", (Class) setFirstBaselineToTopHeight.ThreeDS2ServiceInstance(Color.green(0) + 375, (char) (54749 - ((byte) KeyEvent.getModifierMetaStateMask())), MotionEvent.axisFromString("") + 49), Transaction.BridgingMessageExtensionVersion.class).invoke(null, this.ThreeDS2ServiceInstance$5f2d72c8, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
