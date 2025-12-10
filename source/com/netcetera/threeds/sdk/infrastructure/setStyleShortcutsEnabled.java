package com.netcetera.threeds.sdk.infrastructure;

import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class setStyleShortcutsEnabled implements Callable {
    private final setOnItemClickListener ThreeDS2Service$7157002a;
    private final AtomicBoolean ThreeDS2ServiceInstance;

    public setStyleShortcutsEnabled(setOnItemClickListener setonitemclicklistener, AtomicBoolean atomicBoolean) {
        this.ThreeDS2Service$7157002a = setonitemclicklistener;
        this.ThreeDS2ServiceInstance = atomicBoolean;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        try {
            return ((Class) setEmptyView.ThreeDS2ServiceInstance((char) (26041 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 319 - TextUtils.indexOf("", "", 0, 0), 64 - View.MeasureSpec.makeMeasureSpec(0, 0))).getDeclaredMethod("ThreeDS2ServiceInstance", (Class) setEmptyView.ThreeDS2ServiceInstance((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26040), TextUtils.indexOf("", "", 0, 0) + 319, (Process.myTid() >> 22) + 64), AtomicBoolean.class).invoke(null, this.ThreeDS2Service$7157002a, this.ThreeDS2ServiceInstance);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}
