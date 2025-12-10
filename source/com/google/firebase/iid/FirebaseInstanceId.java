package com.google.firebase.iid;

import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.C8505a;
import com.google.firebase.iid.C8507b;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.slf4j.Marker;

@Deprecated
/* loaded from: classes4.dex */
public class FirebaseInstanceId {

    /* renamed from: j */
    public static C8507b f55454j;

    /* renamed from: l */
    public static ScheduledExecutorService f55456l;

    /* renamed from: a */
    public final Executor f55457a;

    /* renamed from: b */
    public final FirebaseApp f55458b;

    /* renamed from: c */
    public final Metadata f55459c;

    /* renamed from: d */
    public final GmsRpc f55460d;

    /* renamed from: e */
    public final C8505a f55461e;

    /* renamed from: f */
    public final FirebaseInstallationsApi f55462f;

    /* renamed from: g */
    public boolean f55463g;

    /* renamed from: h */
    public final List f55464h;

    /* renamed from: i */
    public static final long f55453i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k */
    public static final Pattern f55455k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId(FirebaseApp firebaseApp, Metadata metadata, Executor executor, Executor executor2, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this.f55463g = false;
        this.f55464h = new ArrayList();
        if (Metadata.getDefaultSenderId(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                try {
                    if (f55454j == null) {
                        f55454j = new C8507b(firebaseApp.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f55458b = firebaseApp;
            this.f55459c = metadata;
            this.f55460d = new GmsRpc(firebaseApp, metadata, provider, provider2, firebaseInstallationsApi);
            this.f55457a = executor2;
            this.f55461e = new C8505a(executor);
            this.f55462f = firebaseInstallationsApi;
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: c */
    public static Object m38716c(Task task) {
        Preconditions.checkNotNull(task, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(ExecutorC22718w10.f107876a, new OnCompleteListener(countDownLatch) { // from class: x10

            /* renamed from: a */
            public final CountDownLatch f108200a;

            {
                this.f108200a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task task2) {
                FirebaseInstanceId.m38702q(this.f108200a, task2);
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        return m38709j(task);
    }

    @VisibleForTesting
    @KeepForSdk
    public static synchronized void clearInstancesForTest() {
        synchronized (FirebaseInstanceId.class) {
            try {
                ScheduledExecutorService scheduledExecutorService = f55456l;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                f55456l = null;
                f55454j = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public static void m38714e(FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(m38703p(firebaseApp.getOptions().getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(m38704o(firebaseApp.getOptions().getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @NonNull
    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    /* renamed from: j */
    public static Object m38709j(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new CancellationException("Task is already canceled");
    }

    /* renamed from: n */
    public static boolean m38705n() {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: o */
    public static boolean m38704o(String str) {
        return f55455k.matcher(str).matches();
    }

    /* renamed from: p */
    public static boolean m38703p(String str) {
        return str.contains(":");
    }

    /* renamed from: q */
    public static final /* synthetic */ void m38702q(CountDownLatch countDownLatch, Task task) {
        countDownLatch.countDown();
    }

    /* renamed from: v */
    public static String m38697v(String str) {
        if (!str.isEmpty() && !str.equalsIgnoreCase("fcm") && !str.equalsIgnoreCase(Constants.MessageTypes.MESSAGE)) {
            return str;
        }
        return Marker.ANY_MARKER;
    }

    /* renamed from: A */
    public synchronized void m38720A(long j) {
        m38713f(new RunnableC8509c(this, Math.min(Math.max(30L, j + j), f55453i)), j);
        this.f55463g = true;
    }

    /* renamed from: B */
    public boolean m38719B(C8507b.C8508a c8508a) {
        if (c8508a != null && !c8508a.m38662c(this.f55459c.getAppVersionCode())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m38718a(FirebaseInstanceIdInternal.NewTokenListener newTokenListener) {
        this.f55464h.add(newTokenListener);
    }

    /* renamed from: b */
    public final Object m38717b(Task task) {
        try {
            return Tasks.await(task, 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException(GmsRpc.ERROR_SERVICE_NOT_AVAILABLE);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    m38696w();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: d */
    public String m38715d() {
        return getToken(Metadata.getDefaultSenderId(this.f55458b), Marker.ANY_MARKER);
    }

    @WorkerThread
    @Deprecated
    public void deleteInstanceId() throws IOException {
        m38714e(this.f55458b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            m38717b(this.f55462f.delete());
            m38696w();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    @WorkerThread
    @Deprecated
    public void deleteToken(@NonNull String str, @NonNull String str2) throws IOException {
        m38714e(this.f55458b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String m38697v = m38697v(str2);
            m38717b(this.f55460d.deleteToken(m38711h(), str, m38697v));
            f55454j.m38672e(m38708k(), str, m38697v);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    /* renamed from: f */
    public void m38713f(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f55456l == null) {
                    f55456l = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
                }
                f55456l.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public FirebaseApp m38712g() {
        return this.f55458b;
    }

    public long getCreationTime() {
        return f55454j.m38671f(this.f55458b.getPersistenceKey());
    }

    @NonNull
    @WorkerThread
    @Deprecated
    public String getId() {
        m38714e(this.f55458b);
        m38693z();
        return m38711h();
    }

    @NonNull
    @Deprecated
    public Task<InstanceIdResult> getInstanceId() {
        m38714e(this.f55458b);
        return m38710i(Metadata.getDefaultSenderId(this.f55458b), Marker.ANY_MARKER);
    }

    @Nullable
    @Deprecated
    public String getToken() {
        m38714e(this.f55458b);
        C8507b.C8508a m38707l = m38707l();
        if (m38719B(m38707l)) {
            m38694y();
        }
        return C8507b.C8508a.m38663b(m38707l);
    }

    /* renamed from: h */
    public String m38711h() {
        try {
            f55454j.m38666k(this.f55458b.getPersistenceKey());
            return (String) m38716c(this.f55462f.getId());
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: i */
    public final Task m38710i(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.f55457a, new Continuation(this, str, m38697v(str2)) { // from class: v10

            /* renamed from: a */
            public final FirebaseInstanceId f107549a;

            /* renamed from: b */
            public final String f107550b;

            /* renamed from: c */
            public final String f107551c;

            {
                this.f107549a = this;
                this.f107550b = str;
                this.f107551c = r3;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return this.f107549a.m38698u(this.f107550b, this.f107551c, task);
            }
        });
    }

    @VisibleForTesting
    @KeepForSdk
    public boolean isFcmAutoInitEnabled() {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    @VisibleForTesting
    public boolean isGmsCorePresent() {
        return this.f55459c.isGmscorePresent();
    }

    /* renamed from: k */
    public final String m38708k() {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.f55458b.getName())) {
            return "";
        }
        return this.f55458b.getPersistenceKey();
    }

    /* renamed from: l */
    public C8507b.C8508a m38707l() {
        return m38706m(Metadata.getDefaultSenderId(this.f55458b), Marker.ANY_MARKER);
    }

    /* renamed from: m */
    public C8507b.C8508a m38706m(String str, String str2) {
        return f55454j.m38669h(m38708k(), str, str2);
    }

    /* renamed from: r */
    public final /* synthetic */ Task m38701r(String str, String str2, String str3, String str4) {
        f55454j.m38667j(m38708k(), str, str2, str4, this.f55459c.getAppVersionCode());
        return Tasks.forResult(new C19212bf0(str3, str4));
    }

    /* renamed from: s */
    public final /* synthetic */ void m38700s(C8507b.C8508a c8508a, InstanceIdResult instanceIdResult) {
        String token = instanceIdResult.getToken();
        if (c8508a == null || !token.equals(c8508a.f55486a)) {
            for (FirebaseInstanceIdInternal.NewTokenListener newTokenListener : this.f55464h) {
                newTokenListener.onNewToken(token);
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void setFcmAutoInitEnabled(boolean z) {
        throw new IllegalStateException("FirebaseMessaging version not supported. Update to latest version.");
    }

    /* renamed from: t */
    public final /* synthetic */ Task m38699t(String str, String str2, String str3, C8507b.C8508a c8508a) {
        return this.f55460d.getToken(str, str2, str3).onSuccessTask(this.f55457a, new SuccessContinuation(this, str2, str3, str) { // from class: z10

            /* renamed from: a */
            public final FirebaseInstanceId f108957a;

            /* renamed from: b */
            public final String f108958b;

            /* renamed from: c */
            public final String f108959c;

            /* renamed from: d */
            public final String f108960d;

            {
                this.f108957a = this;
                this.f108958b = str2;
                this.f108959c = str3;
                this.f108960d = str;
            }

            @Override // com.google.android.gms.tasks.SuccessContinuation
            public Task then(Object obj) {
                return this.f108957a.m38701r(this.f108958b, this.f108959c, this.f108960d, (String) obj);
            }
        }).addOnSuccessListener(A10.f3a, new OnSuccessListener(this, c8508a) { // from class: B10

            /* renamed from: a */
            public final FirebaseInstanceId f273a;

            /* renamed from: b */
            public final C8507b.C8508a f274b;

            {
                this.f273a = this;
                this.f274b = c8508a;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public void onSuccess(Object obj) {
                this.f273a.m38700s(this.f274b, (InstanceIdResult) obj);
            }
        });
    }

    /* renamed from: u */
    public final /* synthetic */ Task m38698u(String str, String str2, Task task) {
        String m38711h = m38711h();
        C8507b.C8508a m38706m = m38706m(str, str2);
        if (!m38719B(m38706m)) {
            return Tasks.forResult(new C19212bf0(m38711h, m38706m.f55486a));
        }
        return this.f55461e.m38678a(str, str2, new C8505a.InterfaceC8506a(this, m38711h, str, str2, m38706m) { // from class: y10

            /* renamed from: a */
            public final FirebaseInstanceId f108593a;

            /* renamed from: b */
            public final String f108594b;

            /* renamed from: c */
            public final String f108595c;

            /* renamed from: d */
            public final String f108596d;

            /* renamed from: e */
            public final C8507b.C8508a f108597e;

            {
                this.f108593a = this;
                this.f108594b = m38711h;
                this.f108595c = str;
                this.f108596d = str2;
                this.f108597e = m38706m;
            }

            @Override // com.google.firebase.iid.C8505a.InterfaceC8506a
            public Task start() {
                return this.f108593a.m38699t(this.f108594b, this.f108595c, this.f108596d, this.f108597e);
            }
        });
    }

    /* renamed from: w */
    public synchronized void m38696w() {
        f55454j.m38673d();
    }

    /* renamed from: x */
    public synchronized void m38695x(boolean z) {
        this.f55463g = z;
    }

    /* renamed from: y */
    public synchronized void m38694y() {
        if (!this.f55463g) {
            m38720A(0L);
        }
    }

    /* renamed from: z */
    public final void m38693z() {
        if (m38719B(m38707l())) {
            m38694y();
        }
    }

    @NonNull
    @Keep
    public static FirebaseInstanceId getInstance(@NonNull FirebaseApp firebaseApp) {
        m38714e(firebaseApp);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
        Preconditions.checkNotNull(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    @Nullable
    @WorkerThread
    @Deprecated
    public String getToken(@NonNull String str, @NonNull String str2) throws IOException {
        m38714e(this.f55458b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) m38717b(m38710i(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new Metadata(firebaseApp.getApplicationContext()), AbstractC21342o10.m25976b(), AbstractC21342o10.m25976b(), provider, provider2, firebaseInstallationsApi);
    }
}
