package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.media.AudioTrack;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import ch.qos.logback.core.CoreConstants;
import com.netcetera.threeds.sdk.infrastructure.C9596mx;

/* loaded from: classes5.dex */
public class setButtonDrawable implements C9596mx.get {
    private final Object ThreeDS2Service$3642dbc0;
    private final boolean values;

    public setButtonDrawable(Object obj, boolean z) {
        this.ThreeDS2Service$3642dbc0 = obj;
        this.values = z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9596mx.get
    public boolean valueOf(Object obj) {
        try {
            return ((Boolean) ((Class) setEmptyView.ThreeDS2ServiceInstance((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 64491), 70 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) + 57)).getDeclaredMethod(CoreConstants.VALUE_OF, (Class) setEmptyView.ThreeDS2ServiceInstance((char) (Color.green(0) + 64491), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 70, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 57), Boolean.TYPE, com.netcetera.threeds.sdk.api.security.Warning.class).invoke(null, this.ThreeDS2Service$3642dbc0, Boolean.valueOf(this.values), (com.netcetera.threeds.sdk.api.security.Warning) obj)).booleanValue();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}