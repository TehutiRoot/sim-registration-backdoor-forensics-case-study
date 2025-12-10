package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ir */
/* loaded from: classes5.dex */
public class C9477ir implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle valueOf$4eb310c1;
    private final setId values;

    public C9477ir(setLineBreakStyle setlinebreakstyle, setId setid) {
        this.valueOf$4eb310c1 = setlinebreakstyle;
        this.values = setid;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 49, (char) (TextUtils.indexOf("", "") + 31083))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) get3DSServerTransactionID.ThreeDS2Service(3252 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 49 - View.MeasureSpec.getMode(0), (char) (TextUtils.lastIndexOf("", '0') + 31084)), setId.class).invoke(null, this.valueOf$4eb310c1, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}