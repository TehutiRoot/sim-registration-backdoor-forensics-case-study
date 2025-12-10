package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public class setImageURI implements Callable {
    private final setOnItemLongClickListener ThreeDS2ServiceInstance$2eb70107;
    private final setRecyclerListener valueOf;
    private final setOnItemClickListener values;

    public setImageURI(setOnItemLongClickListener setonitemlongclicklistener, setOnItemClickListener setonitemclicklistener, setRecyclerListener setrecyclerlistener) {
        this.ThreeDS2ServiceInstance$2eb70107 = setonitemlongclicklistener;
        this.values = setonitemclicklistener;
        this.valueOf = setrecyclerlistener;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        try {
            return ((Class) setEmptyView.ThreeDS2ServiceInstance((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1004, 62 - TextUtils.indexOf((CharSequence) "", '0'))).getDeclaredMethod("get", (Class) setEmptyView.ThreeDS2ServiceInstance((char) (KeyEvent.getMaxKeyCode() >> 16), 1005 - (ViewConfiguration.getLongPressTimeout() >> 16), Color.blue(0) + 63), setOnItemClickListener.class, setRecyclerListener.class).invoke(null, this.ThreeDS2ServiceInstance$2eb70107, this.values, this.valueOf);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }
}