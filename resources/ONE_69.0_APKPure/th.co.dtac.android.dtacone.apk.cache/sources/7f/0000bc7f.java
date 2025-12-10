package com.netcetera.threeds.sdk.infrastructure;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ik */
/* loaded from: classes5.dex */
public class RunnableC9470ik implements Runnable {
    private final setLineBreakStyle valueOf$4eb310c1;

    public RunnableC9470ik(setLineBreakStyle setlinebreakstyle) {
        this.valueOf$4eb310c1 = setlinebreakstyle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 48 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) (31084 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))))).getMethod(CoreConstants.VALUE_OF, null).invoke(this.valueOf$4eb310c1, null);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}