package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.it */
/* loaded from: classes5.dex */
public class C9490it implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle ThreeDS2Service$4eb310c1;
    private final setCustomInsertionActionModeCallback values;

    public C9490it(setLineBreakStyle setlinebreakstyle, setCustomInsertionActionModeCallback setcustominsertionactionmodecallback) {
        this.ThreeDS2Service$4eb310c1 = setlinebreakstyle;
        this.values = setcustominsertionactionmodecallback;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - Color.red(0), 49 - Gravity.getAbsoluteGravity(0, 0), (char) (31083 - TextUtils.indexOf("", "", 0)))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (Process.myTid() >> 22), 49 - View.MeasureSpec.getMode(0), (char) (31083 - TextUtils.indexOf("", ""))), setCustomInsertionActionModeCallback.class).invoke(null, this.ThreeDS2Service$4eb310c1, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
