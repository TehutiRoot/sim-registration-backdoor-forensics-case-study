package com.netcetera.threeds.sdk.infrastructure;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.C9340e;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public class setText implements C9340e.ThreeDS2Service {
    private final AtomicBoolean get;

    public setText(AtomicBoolean atomicBoolean) {
        this.get = atomicBoolean;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.C9340e.ThreeDS2Service
    public void ThreeDS2ServiceInstance(int i, int i2) {
        try {
            Object[] objArr = {this.get, Integer.valueOf(i), Integer.valueOf(i2)};
            Class<?> cls = Integer.TYPE;
            ((Class) setEmptyView.ThreeDS2ServiceInstance((char) (26040 - (KeyEvent.getMaxKeyCode() >> 16)), 319 - View.MeasureSpec.getSize(0), (ViewConfiguration.getTouchSlop() >> 8) + 64)).getDeclaredMethod("ThreeDS2ServiceInstance", AtomicBoolean.class, cls, cls).invoke(null, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}