package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.in */
/* loaded from: classes5.dex */
public class C9473in implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle ThreeDS2ServiceInstance$4eb310c1;
    private final setPopupTheme values;

    public C9473in(setLineBreakStyle setlinebreakstyle, setPopupTheme setpopuptheme) {
        this.ThreeDS2ServiceInstance$4eb310c1 = setlinebreakstyle;
        this.values = setpopuptheme;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(TextUtils.getOffsetAfter("", 0) + 3252, 49 - KeyEvent.getDeadChar(0, 0), (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31083))).getDeclaredMethod(CoreConstants.VALUE_OF, (Class) get3DSServerTransactionID.ThreeDS2Service(Color.argb(0, 0, 0, 0) + 3252, 49 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (31082 - Process.getGidForName(""))), setPopupTheme.class).invoke(null, this.ThreeDS2ServiceInstance$4eb310c1, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}