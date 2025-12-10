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

/* renamed from: AU1 */
/* loaded from: classes4.dex */
public class AU1 {

    /* renamed from: i */
    public static final long f118i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    public final Context f119a;

    /* renamed from: b */
    public final C22003rs0 f120b;

    /* renamed from: c */
    public final C22733w60 f121c;

    /* renamed from: d */
    public final FirebaseMessaging f122d;

    /* renamed from: f */
    public final ScheduledExecutorService f124f;

    /* renamed from: h */
    public final C23142yU1 f126h;

    /* renamed from: e */
    public final Map f123e = new ArrayMap();

    /* renamed from: g */
    public boolean f125g = false;

    public AU1(FirebaseMessaging firebaseMessaging, C22003rs0 c22003rs0, C23142yU1 c23142yU1, C22733w60 c22733w60, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f122d = firebaseMessaging;
        this.f120b = c22003rs0;
        this.f126h = c23142yU1;
        this.f121c = c22733w60;
        this.f119a = context;
        this.f124f = scheduledExecutorService;
    }

    /* renamed from: c */
    public static void m69091c(Task task) {
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
    public static Task m69088f(final FirebaseMessaging firebaseMessaging, final C22003rs0 c22003rs0, final C22733w60 c22733w60, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return Tasks.call(scheduledExecutorService, new Callable() { // from class: zU1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                AU1 m69084j;
                m69084j = AU1.m69084j(context, scheduledExecutorService, firebaseMessaging, c22003rs0, c22733w60);
                return m69084j;
            }
        });
    }

    /* renamed from: h */
    public static boolean m69086h() {
        if (!Log.isLoggable(Constants.TAG, 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable(Constants.TAG, 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static /* synthetic */ AU1 m69084j(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C22003rs0 c22003rs0, C22733w60 c22733w60) {
        return new AU1(firebaseMessaging, c22003rs0, C23142yU1.m247b(context, scheduledExecutorService), c22733w60, context, scheduledExecutorService);
    }

    /* renamed from: b */
    public final void m69092b(C22970xU1 c22970xU1, TaskCompletionSource taskCompletionSource) {
        ArrayDeque arrayDeque;
        synchronized (this.f123e) {
            try {
                String m503e = c22970xU1.m503e();
                if (this.f123e.containsKey(m503e)) {
                    arrayDeque = (ArrayDeque) this.f123e.get(m503e);
                } else {
                    ArrayDeque arrayDeque2 = new ArrayDeque();
                    this.f123e.put(m503e, arrayDeque2);
                    arrayDeque = arrayDeque2;
                }
                arrayDeque.add(taskCompletionSource);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m69090d(String str) {
        m69091c(this.f121c.m907n(this.f122d.m38511q(), str));
    }

    /* renamed from: e */
    public final void m69089e(String str) {
        m69091c(this.f121c.m906o(this.f122d.m38511q(), str));
    }

    /* renamed from: g */
    public boolean m69087g() {
        if (this.f126h.m246c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public synchronized boolean m69085i() {
        return this.f125g;
    }

    /* renamed from: k */
    public final void m69083k(C22970xU1 c22970xU1) {
        synchronized (this.f123e) {
            try {
                String m503e = c22970xU1.m503e();
                if (!this.f123e.containsKey(m503e)) {
                    return;
                }
                ArrayDeque arrayDeque = (ArrayDeque) this.f123e.get(m503e);
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(null);
                }
                if (arrayDeque.isEmpty()) {
                    this.f123e.remove(m503e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: IOException -> 0x001d, TryCatch #0 {IOException -> 0x001d, blocks: (B:3:0x0001, B:20:0x0030, B:22:0x0036, B:23:0x0049, B:25:0x0056, B:26:0x006b, B:28:0x0078, B:8:0x0013, B:13:0x001f), top: B:41:0x0001 }] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m69082l(p000.C22970xU1 r6) {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r6.m506b()     // Catch: java.io.IOException -> L1d
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
            boolean r1 = m69086h()     // Catch: java.io.IOException -> L1d
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
            java.lang.String r1 = r6.m505c()     // Catch: java.io.IOException -> L1d
            r5.m69089e(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = m69086h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Unsubscribe from topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.m505c()     // Catch: java.io.IOException -> L1d
            r1.append(r6)     // Catch: java.io.IOException -> L1d
            r1.append(r2)     // Catch: java.io.IOException -> L1d
            goto L8c
        L6b:
            java.lang.String r1 = r6.m505c()     // Catch: java.io.IOException -> L1d
            r5.m69090d(r1)     // Catch: java.io.IOException -> L1d
            boolean r1 = m69086h()     // Catch: java.io.IOException -> L1d
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L1d
            r1.<init>()     // Catch: java.io.IOException -> L1d
            java.lang.String r3 = "Subscribe to topic: "
            r1.append(r3)     // Catch: java.io.IOException -> L1d
            java.lang.String r6 = r6.m505c()     // Catch: java.io.IOException -> L1d
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AU1.m69082l(xU1):boolean");
    }

    /* renamed from: m */
    public void m69081m(Runnable runnable, long j) {
        this.f124f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: n */
    public Task m69080n(C22970xU1 c22970xU1) {
        this.f126h.m248a(c22970xU1);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m69092b(c22970xU1, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    /* renamed from: o */
    public synchronized void m69079o(boolean z) {
        this.f125g = z;
    }

    /* renamed from: p */
    public final void m69078p() {
        if (!m69085i()) {
            m69074t(0L);
        }
    }

    /* renamed from: q */
    public void m69077q() {
        if (m69087g()) {
            m69078p();
        }
    }

    /* renamed from: r */
    public Task m69076r(String str) {
        Task m69080n = m69080n(C22970xU1.m502f(str));
        m69077q();
        return m69080n;
    }

    /* renamed from: s */
    public boolean m69075s() {
        while (true) {
            synchronized (this) {
                try {
                    C22970xU1 m246c = this.f126h.m246c();
                    if (m246c == null) {
                        m69086h();
                        return true;
                    } else if (!m69082l(m246c)) {
                        return false;
                    } else {
                        this.f126h.m244e(m246c);
                        m69083k(m246c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: t */
    public void m69074t(long j) {
        m69081m(new BU1(this, this.f119a, this.f120b, Math.min(Math.max(30L, 2 * j), f118i)), j);
        m69079o(true);
    }

    /* renamed from: u */
    public Task m69073u(String str) {
        Task m69080n = m69080n(C22970xU1.m501g(str));
        m69077q();
        return m69080n;
    }
}
