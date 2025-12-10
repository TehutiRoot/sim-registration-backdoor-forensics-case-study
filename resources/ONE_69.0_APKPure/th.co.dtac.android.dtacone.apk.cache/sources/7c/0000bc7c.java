package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.if */
/* loaded from: classes5.dex */
public class C9467if implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle values$4eb310c1;

    public C9467if(setLineBreakStyle setlinebreakstyle) {
        this.values$4eb310c1 = setlinebreakstyle;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(View.MeasureSpec.makeMeasureSpec(0, 0) + 3252, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 49, (char) (31083 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))).getDeclaredMethod("ThreeDS2Service", (Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 50 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 31083))).invoke(null, this.values$4eb310c1);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}