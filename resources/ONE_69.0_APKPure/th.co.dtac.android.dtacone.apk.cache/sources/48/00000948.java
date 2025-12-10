package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: Jn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17908Jn0 {

    /* renamed from: a */
    public static volatile ScheduledExecutorService f3106a;

    /* renamed from: a */
    public static ScheduledExecutorService m67802a() {
        if (f3106a != null) {
            return f3106a;
        }
        synchronized (AbstractC17908Jn0.class) {
            try {
                if (f3106a == null) {
                    f3106a = new ScheduledExecutorServiceC23150y70(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f3106a;
    }
}