package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.im */
/* loaded from: classes5.dex */
public class RunnableC9483im implements Runnable {
    private final setLineBreakStyle ThreeDS2Service$4eb310c1;

    public RunnableC9483im(setLineBreakStyle setlinebreakstyle) {
        this.ThreeDS2Service$4eb310c1 = setlinebreakstyle;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(Drawable.resolveOpacity(0, 0) + 3252, (-16777167) - Color.rgb(0, 0, 0), (char) (31083 - View.resolveSizeAndState(0, 0, 0)))).getDeclaredMethod(CoreConstants.VALUE_OF, (Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (Process.myPid() >> 22), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49, (char) (31084 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))))).invoke(null, this.ThreeDS2Service$4eb310c1);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
