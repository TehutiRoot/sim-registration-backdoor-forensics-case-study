package p000;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.GmsRpc;
import com.google.firebase.messaging.Constants;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: xV1 */
/* loaded from: classes4.dex */
public class C23042xV1 {

    /* renamed from: i */
    public static final long f108763i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f108764a;

    /* renamed from: b */
    public final C23105xs0 f108765b;

    /* renamed from: c */
    public final C60 f108766c;

    /* renamed from: d */
    public final FirebaseMessaging f108767d;

    /* renamed from: f */
    public final ScheduledExecutorService f108769f;

    /* renamed from: h */
    public final C22696vV1 f108771h;

    /* renamed from: e */
    public final Map f108768e = new ArrayMap();

    /* renamed from: g */
    public boolean f108770g = false;

    public C23042xV1(FirebaseMessaging firebaseMessaging, C23105xs0 c23105xs0, C22696vV1 c22696vV1, C60 c60, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f108767d = firebaseMessaging;
        this.f108765b = c23105xs0;
        this.f108771h = c22696vV1;
        this.f108766c = c60;
        this.f108764a = context;
        this.f108769f = scheduledExecutorService;
    }

    /* renamed from: a */
    public static /* synthetic */ C23042xV1 m527a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C23105xs0 c23105xs0, C60 c60) {
        return m518j(context, scheduledExecutorService, firebaseMessaging, c23105xs0, c60);
    }

    /* renamed from: c */
    public static void m525c(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE, e);
        }
    }

    /* renamed from: f */
    public static Task m522f(final FirebaseMessaging firebaseMessaging, final C23105xs0 c23105xs0, final C60 c60, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: wV1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C23042xV1.m527a(context, scheduledExecutorService, firebaseMessaging, c23105xs0, c60);
            }
        });
    }

    /* renamed from: h */
    public static boolean m520h() {
        if (!Log.isLoggable(Constants.TAG, 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable(Constants.TAG, 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static /* synthetic */ C23042xV1 m518j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C23105xs0 c23105xs0, C60 c60) {
        return new C23042xV1(firebaseMessaging, c23105xs0, C22696vV1.m895b(context, scheduledExecutorService), c60, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m526b(C22523uV1 c22523uV1, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f108768e) {
            try {
                String m1164e = c22523uV1.m1164e();
                if (this.f108768e.containsKey(m1164e)) {
                    arrayDeque = (ArrayDeque) this.f108768e.get(m1164e);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f108768e.put(m1164e, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m524d(String str) {
        m525c(this.f108766c.m68999n(this.f108767d.m38503q(), str));
    }

    /* renamed from: e */
    public final void m523e(String str) {
        m525c(this.f108766c.m68998o(this.f108767d.m38503q(), str));
    }

    /* renamed from: g */
    public boolean m521g() {
        if (this.f108771h.m894c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public synchronized boolean m519i() {
        return this.f108770g;
    }

    /* renamed from: k */
    public final void m517k(C22523uV1 c22523uV1) {
        synchronized (this.f108768e) {
            try {
                String m1164e = c22523uV1.m1164e();
                if (!this.f108768e.containsKey(m1164e)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f108768e.get(m1164e);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f108768e.remove(m1164e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b A[Catch: IOException -> 0x001d, TryCatch #0 {IOException -> 0x001d, blocks: (B:45:0x0001, B:62:0x0030, B:64:0x0036, B:65:0x0049, B:67:0x0056, B:68:0x006b, B:70:0x0078, B:50:0x0013, B:55:0x001f), top: B:83:0x0001 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m516l(p000.C22523uV1 r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.m1167b()     // Catch: java.io.IOException -> L1d
            int r2 = r1.hashCode()     // Catch: java.io.IOException -> L1d
            r3 = 83
            r4 = 1
            if (r2 == r3) goto L1f
            r3 = 85
            if (r2 == r3) goto L13
            goto L29
        L13:
            java.lang.String r2 = "U"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L29
            r1 = 1
            goto L2a
        L1d:
            r6 = move-exception
            goto L8d
        L1f:
            java.lang.String r2 = "S"
            boolean r1 = r1.equals(r2)     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L29
            r1 = 0
            goto L2a
        L29:
            r1 = -1
        L2a:
            java.lang.String r2 = " succeeded."
            if (r1 == 0) goto L6b
            if (r1 == r4) goto L49
            boolean r1 = m520h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r2 = "Unknown topic operation"
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = "."
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            goto L8c
        L49:
            java.lang.String r1 = r6.m1166c()     // Catch: java.io.IOException -> L1d
            r5.m523e(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = m520h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Unsubscribe from topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.m1166c()     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            goto L8c
        L6b:
            java.lang.String r1 = r6.m1166c()     // Catch: java.io.IOException -> L1d
            r5.m524d(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = m520h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Subscribe to topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.m1166c()     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
        L8c:
            return r4
        L8d:
            java.lang.String r1 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lae
            java.lang.String r1 = "INTERNAL_SERVER_ERROR"
            java.lang.String r2 = r6.getMessage()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La6
            goto Lae
        La6:
            java.lang.String r1 = r6.getMessage()
            if (r1 != 0) goto Lad
            return r0
        Lad:
            throw r6
        Lae:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Topic operation failed: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = ". Will retry Topic operation."
            r1.append(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C23042xV1.m516l(uV1):boolean");
    }

    /* renamed from: m */
    public void m515m(Runnable runnable, long j) {
        this.f108769f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public Task m514n(C22523uV1 c22523uV1) {
        this.f108771h.m896a(c22523uV1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m526b(c22523uV1, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public synchronized void m513o(boolean z) {
        this.f108770g = z;
    }

    /* renamed from: p */
    public final void m512p() {
        if (!m519i()) {
            m508t(0L);
        }
    }

    /* renamed from: q */
    public void m511q() {
        if (m521g()) {
            m512p();
        }
    }

    /* renamed from: r */
    public Task m510r(String str) {
        Task m514n = m514n(C22523uV1.m1163f(str));
        m511q();
        return m514n;
    }

    /* renamed from: s */
    public boolean m509s() {
        while (true) {
            synchronized (this) {
                try {
                    C22523uV1 m894c = this.f108771h.m894c();
                    if (m894c == null) {
                        m520h();
                        return true;
                    } else if (!m516l(m894c)) {
                        return false;
                    } else {
                        this.f108771h.m892e(m894c);
                        m517k(m894c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: t */
    public void m508t(long j) {
        m515m(new RunnableC23215yV1(this, this.f108764a, this.f108765b, Math.min(Math.max(30L, 2 * j), f108763i)), j);
        m513o(true);
    }

    /* renamed from: u */
    public Task m507u(String str) {
        Task m514n = m514n(C22523uV1.m1162g(str));
        m511q();
        return m514n;
    }
}