package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ip */
/* loaded from: classes5.dex */
public class C9486ip implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle valueOf$4eb310c1;

    public C9486ip(setLineBreakStyle setlinebreakstyle) {
        this.valueOf$4eb310c1 = setlinebreakstyle;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 50, (char) (31083 - Color.red(0)))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) get3DSServerTransactionID.ThreeDS2Service((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3252, 49 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (31083 - (Process.myTid() >> 22)))).invoke(null, this.valueOf$4eb310c1);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
