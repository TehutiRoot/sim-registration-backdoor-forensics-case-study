package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.ServiceConnectionC8548f;
import java.util.concurrent.TimeUnit;

/* renamed from: I42 */
/* loaded from: classes4.dex */
public abstract class I42 {

    /* renamed from: a */
    public static final long f2567a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    public static final Object f2568b = new Object();

    /* renamed from: c */
    public static WakeLock f2569c;

    /* renamed from: a */
    public static /* synthetic */ void m68069a(Intent intent, Task task) {
        m68067c(intent);
    }

    /* renamed from: b */
    public static void m68068b(Context context) {
        if (f2569c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f2569c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* renamed from: c */
    public static void m68067c(Intent intent) {
        synchronized (f2568b) {
            try {
                if (f2569c != null && m68066d(intent)) {
                    m68063g(intent, false);
                    f2569c.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public static boolean m68066d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    /* renamed from: f */
    public static void m68064f(Context context, ServiceConnectionC8548f serviceConnectionC8548f, final Intent intent) {
        synchronized (f2568b) {
            try {
                m68068b(context);
                boolean m68066d = m68066d(intent);
                m68063g(intent, true);
                if (!m68066d) {
                    f2569c.acquire(f2567a);
                }
                serviceConnectionC8548f.m38408c(intent).addOnCompleteListener(new OnCompleteListener() { // from class: H42
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        I42.m68069a(intent, task);
                    }
                });
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public static void m68063g(Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    /* renamed from: h */
    public static ComponentName m68062h(Context context, Intent intent) {
        synchronized (f2568b) {
            try {
                m68068b(context);
                boolean m68066d = m68066d(intent);
                m68063g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!m68066d) {
                    f2569c.acquire(f2567a);
                }
                return startService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}