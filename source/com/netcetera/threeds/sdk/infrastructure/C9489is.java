package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.is */
/* loaded from: classes5.dex */
public class C9489is implements setSelected.ThreeDS2Service {
    private final setId ThreeDS2ServiceInstance;
    private final setLineBreakStyle values$4eb310c1;

    public C9489is(setLineBreakStyle setlinebreakstyle, setId setid) {
        this.values$4eb310c1 = setlinebreakstyle;
        this.ThreeDS2ServiceInstance = setid;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3252, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 49, (char) (ExpandableListView.getPackedPositionGroup(0L) + 31083))).getDeclaredMethod("ThreeDS2Service", (Class) get3DSServerTransactionID.ThreeDS2Service(3251 - TextUtils.lastIndexOf("", '0'), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 48, (char) (31083 - (ViewConfiguration.getFadingEdgeLength() >> 16))), setId.class).invoke(null, this.values$4eb310c1, this.ThreeDS2ServiceInstance);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
