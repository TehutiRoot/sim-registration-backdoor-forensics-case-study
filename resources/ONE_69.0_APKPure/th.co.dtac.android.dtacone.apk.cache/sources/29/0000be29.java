package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public class setFastScrollAlwaysVisible implements Executor {
    private static int get = 0;
    private static int valueOf = 1;
    private final Handler values;

    public setFastScrollAlwaysVisible(Handler handler) {
        this.values = handler;
    }

    public static Executor values() {
        setFastScrollAlwaysVisible setfastscrollalwaysvisible = new setFastScrollAlwaysVisible(new Handler(Looper.getMainLooper()));
        int i = get;
        valueOf = ((i ^ 7) + ((i & 7) << 1)) % 128;
        return setfastscrollalwaysvisible;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        int i = get;
        int i2 = (-2) - (~((i ^ 106) + ((i & 106) << 1)));
        valueOf = i2 % 128;
        if (i2 % 2 != 0) {
            this.values.post(runnable);
            int i3 = get;
            int i4 = ((i3 & 89) - (~(-(-(i3 | 89))))) - 1;
            valueOf = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            throw null;
        }
        this.values.post(runnable);
        throw null;
    }
}