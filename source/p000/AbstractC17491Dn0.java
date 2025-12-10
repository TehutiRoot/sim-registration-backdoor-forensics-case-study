package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: Dn0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17491Dn0 {

    /* renamed from: a */
    public static volatile ScheduledExecutorService f1108a;

    /* renamed from: a */
    public static ScheduledExecutorService m68589a() {
        if (f1108a != null) {
            return f1108a;
        }
        synchronized (AbstractC17491Dn0.class) {
            try {
                if (f1108a == null) {
                    f1108a = new ScheduledExecutorServiceC22048s70(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f1108a;
    }
}
