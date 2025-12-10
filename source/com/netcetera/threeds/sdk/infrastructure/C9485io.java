package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.setSelected;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.io */
/* loaded from: classes5.dex */
public class C9485io implements setSelected.ThreeDS2Service {
    private final setLineBreakStyle ThreeDS2Service$4eb310c1;
    private final keys values;

    public C9485io(setLineBreakStyle setlinebreakstyle, keys keysVar) {
        this.ThreeDS2Service$4eb310c1 = setlinebreakstyle;
        this.values = keysVar;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.setSelected.ThreeDS2Service
    public void values() {
        try {
            ((Class) get3DSServerTransactionID.ThreeDS2Service(3252 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 49, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 31083))).getDeclaredMethod(CoreConstants.VALUE_OF, (Class) get3DSServerTransactionID.ThreeDS2Service(Drawable.resolveOpacity(0, 0) + 3252, TextUtils.lastIndexOf("", '0', 0) + 50, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31083)), keys.class).invoke(null, this.ThreeDS2Service$4eb310c1, this.values);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
