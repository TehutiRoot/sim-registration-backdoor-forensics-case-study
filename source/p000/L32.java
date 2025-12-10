package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC8559f;
import java.util.concurrent.TimeUnit;

/* renamed from: L32 */
/* loaded from: classes4.dex */
public abstract class L32 {

    /* renamed from: a */
    public static final long f3372a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f3373b = new Object();

    /* renamed from: c */
    public static WakeLock f3374c;

    /* renamed from: b */
    public static void m67564b(Context context) {
        if (f3374c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f3374c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* renamed from: c */
    public static void m67563c(Intent intent) {
        synchronized (f3373b) {
            try {
                if (f3374c != null && m67562d(intent)) {
                    m67559g(intent, false);
                    f3374c.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static boolean m67562d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    public static void m67560f(Context context, ServiceConnectionC8559f serviceConnectionC8559f, final Intent intent) {
        synchronized (f3373b) {
            try {
                m67564b(context);
                boolean m67562d = m67562d(intent);
                m67559g(intent, true);
                if (!m67562d) {
                    f3374c.acquire(f3372a);
                }
                serviceConnectionC8559f.m38416c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: K32
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        L32.m67563c(intent);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static void m67559g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: h */
    public static ComponentName m67558h(Context context, Intent intent) {
        synchronized (f3373b) {
            try {
                m67564b(context);
                boolean m67562d = m67562d(intent);
                m67559g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!m67562d) {
                    f3374c.acquire(f3372a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
