package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.messaging.C8553c;
import com.google.firebase.messaging.C8555d;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class FirebaseMessaging {
    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";

    /* renamed from: n */
    public static C8555d f55612n;

    /* renamed from: p */
    public static ScheduledExecutorService f55614p;

    /* renamed from: a */
    public final FirebaseApp f55615a;

    /* renamed from: b */
    public final FirebaseInstanceIdInternal f55616b;

    /* renamed from: c */
    public final Context f55617c;

    /* renamed from: d */
    public final C22733w60 f55618d;

    /* renamed from: e */
    public final C8553c f55619e;

    /* renamed from: f */
    public final C8547a f55620f;

    /* renamed from: g */
    public final Executor f55621g;

    /* renamed from: h */
    public final Executor f55622h;

    /* renamed from: i */
    public final Task f55623i;

    /* renamed from: j */
    public final C22003rs0 f55624j;

    /* renamed from: k */
    public boolean f55625k;

    /* renamed from: l */
    public final Application.ActivityLifecycleCallbacks f55626l;

    /* renamed from: m */
    public static final long f55611m = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: o */
    public static Provider f55613o = new Provider() { // from class: H10
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return FirebaseMessaging.m38520h();
        }
    };

    /* renamed from: com.google.firebase.messaging.FirebaseMessaging$a */
    /* loaded from: classes4.dex */
    public class C8547a {

        /* renamed from: a */
        public final Subscriber f55627a;

        /* renamed from: b */
        public boolean f55628b;

        /* renamed from: c */
        public EventHandler f55629c;

        /* renamed from: d */
        public Boolean f55630d;

        public C8547a(Subscriber subscriber) {
            FirebaseMessaging.this = r1;
            this.f55627a = subscriber;
        }

        /* renamed from: a */
        public static /* synthetic */ void m38501a(C8547a c8547a, Event event) {
            c8547a.m38498d(event);
        }

        /* renamed from: b */
        public synchronized void m38500b() {
            try {
                if (this.f55628b) {
                    return;
                }
                Boolean m38497e = m38497e();
                this.f55630d = m38497e;
                if (m38497e == null) {
                    EventHandler eventHandler = new EventHandler() { // from class: Q10
                        {
                            FirebaseMessaging.C8547a.this = this;
                        }

                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging.C8547a.m38501a(FirebaseMessaging.C8547a.this, event);
                        }
                    };
                    this.f55629c = eventHandler;
                    this.f55627a.subscribe(DataCollectionDefaultChange.class, eventHandler);
                }
                this.f55628b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        /* renamed from: c */
        public synchronized boolean m38499c() {
            boolean isDataCollectionDefaultEnabled;
            try {
                m38500b();
                Boolean bool = this.f55630d;
                if (bool != null) {
                    isDataCollectionDefaultEnabled = bool.booleanValue();
                } else {
                    isDataCollectionDefaultEnabled = FirebaseMessaging.this.f55615a.isDataCollectionDefaultEnabled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return isDataCollectionDefaultEnabled;
        }

        /* renamed from: d */
        public final /* synthetic */ void m38498d(Event event) {
            if (m38499c()) {
                FirebaseMessaging.this.m38530R();
            }
        }

        /* renamed from: e */
        public final Boolean m38497e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context applicationContext = FirebaseMessaging.this.f55615a.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* renamed from: f */
        public synchronized void m38496f(boolean z) {
            try {
                m38500b();
                EventHandler eventHandler = this.f55629c;
                if (eventHandler != null) {
                    this.f55627a.unsubscribe(DataCollectionDefaultChange.class, eventHandler);
                    this.f55629c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.f55615a.getApplicationContext().getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0).edit();
                edit.putBoolean("auto_init", z);
                edit.apply();
                if (z) {
                    FirebaseMessaging.this.m38530R();
                }
                this.f55630d = Boolean.valueOf(z);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber) {
        this(firebaseApp, firebaseInstanceIdInternal, provider, provider2, firebaseInstallationsApi, provider3, subscriber, new C22003rs0(firebaseApp.getApplicationContext()));
    }

    /* renamed from: L */
    public static /* synthetic */ TransportFactory m38536L() {
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m38527a(FirebaseMessaging firebaseMessaging, Void r1) {
        firebaseMessaging.m38537K(r1);
    }

    /* renamed from: b */
    public static /* synthetic */ Task m38526b(FirebaseMessaging firebaseMessaging, String str, C8555d.C8556a c8556a, String str2) {
        return firebaseMessaging.m38547A(str, c8556a, str2);
    }

    /* renamed from: c */
    public static /* synthetic */ void m38525c(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.m38540H();
    }

    /* renamed from: d */
    public static /* synthetic */ void m38524d(FirebaseMessaging firebaseMessaging, String str) {
        firebaseMessaging.m38541G(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m38523e(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.m38543E(taskCompletionSource);
    }

    /* renamed from: f */
    public static /* synthetic */ void m38522f(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.m38545C(taskCompletionSource);
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(FirebaseApp.getInstance());
        }
        return firebaseMessaging;
    }

    @Nullable
    public static TransportFactory getTransportFactory() {
        return (TransportFactory) f55613o.get();
    }

    /* renamed from: h */
    public static /* synthetic */ TransportFactory m38520h() {
        return m38536L();
    }

    /* renamed from: i */
    public static /* synthetic */ void m38519i(FirebaseMessaging firebaseMessaging) {
        firebaseMessaging.m38538J();
    }

    /* renamed from: j */
    public static /* synthetic */ void m38518j(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.m38542F(cloudMessage);
    }

    /* renamed from: n */
    public static /* synthetic */ void m38514n(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.m38544D(taskCompletionSource);
    }

    /* renamed from: t */
    public static synchronized C8555d m38508t(Context context) {
        C8555d c8555d;
        synchronized (FirebaseMessaging.class) {
            try {
                if (f55612n == null) {
                    f55612n = new C8555d(context);
                }
                c8555d = f55612n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8555d;
    }

    /* renamed from: A */
    public final /* synthetic */ Task m38547A(String str, C8555d.C8556a c8556a, String str2) {
        m38508t(this.f55617c).m38426g(m38507u(), str, str2, this.f55624j.m23252a());
        if (c8556a == null || !str2.equals(c8556a.f55683a)) {
            m38541G(str2);
        }
        return Tasks.forResult(str2);
    }

    /* renamed from: B */
    public final /* synthetic */ Task m38546B(final String str, final C8555d.C8556a c8556a) {
        return this.f55618d.m914g().onSuccessTask(this.f55622h, new SuccessContinuation() { // from class: G10
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return FirebaseMessaging.m38526b(FirebaseMessaging.this, str, c8556a, (String) obj);
            }
        });
    }

    /* renamed from: C */
    public final /* synthetic */ void m38545C(TaskCompletionSource taskCompletionSource) {
        try {
            this.f55616b.deleteToken(C22003rs0.m23250c(this.f55615a), INSTANCE_ID_SCOPE);
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: D */
    public final /* synthetic */ void m38544D(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(this.f55618d.m918c());
            m38508t(this.f55617c).m38429d(m38507u(), C22003rs0.m23250c(this.f55615a));
            taskCompletionSource.setResult(null);
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: E */
    public final /* synthetic */ void m38543E(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(m38511q());
        } catch (Exception e) {
            taskCompletionSource.setException(e);
        }
    }

    /* renamed from: F */
    public final /* synthetic */ void m38542F(CloudMessage cloudMessage) {
        if (cloudMessage != null) {
            MessagingAnalytics.logNotificationReceived(cloudMessage.getIntent());
            m38505w();
        }
    }

    /* renamed from: H */
    public final /* synthetic */ void m38540H() {
        if (isAutoInitEnabled()) {
            m38530R();
        }
    }

    /* renamed from: I */
    public final /* synthetic */ void m38539I(AU1 au1) {
        if (isAutoInitEnabled()) {
            au1.m69077q();
        }
    }

    /* renamed from: K */
    public final /* synthetic */ void m38537K(Void r3) {
        AbstractC18838Yo1.m65295g(this.f55617c, this.f55618d, m38532P());
    }

    /* renamed from: O */
    public synchronized void m38533O(boolean z) {
        this.f55625k = z;
    }

    /* renamed from: P */
    public final boolean m38532P() {
        AbstractC18710Wo1.m65560c(this.f55617c);
        if (!AbstractC18710Wo1.m65559d(this.f55617c)) {
            return false;
        }
        if (this.f55615a.get(AnalyticsConnector.class) != null) {
            return true;
        }
        if (!MessagingAnalytics.m38485a() || f55613o == null) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final synchronized void m38531Q() {
        if (!this.f55625k) {
            m38529S(0L);
        }
    }

    /* renamed from: R */
    public final void m38530R() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f55616b;
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.getToken();
        } else if (m38528T(m38506v())) {
            m38531Q();
        }
    }

    /* renamed from: S */
    public synchronized void m38529S(long j) {
        m38510r(new QP1(this, Math.min(Math.max(30L, 2 * j), f55611m)), j);
        this.f55625k = true;
    }

    /* renamed from: T */
    public boolean m38528T(C8555d.C8556a c8556a) {
        if (c8556a != null && !c8556a.m38424b(this.f55624j.m23252a())) {
            return false;
        }
        return true;
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (this.f55616b != null) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f55621g.execute(new Runnable() { // from class: L10
                {
                    FirebaseMessaging.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.m38522f(FirebaseMessaging.this, taskCompletionSource);
                }
            });
            return taskCompletionSource.getTask();
        } else if (m38506v() == null) {
            return Tasks.forResult(null);
        } else {
            final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            AbstractC10308gW.m31108e().execute(new Runnable() { // from class: M10
                {
                    FirebaseMessaging.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.m38514n(FirebaseMessaging.this, taskCompletionSource2);
                }
            });
            return taskCompletionSource2.getTask();
        }
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.m38485a();
    }

    @NonNull
    public Task<String> getToken() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f55616b;
        if (firebaseInstanceIdInternal != null) {
            return firebaseInstanceIdInternal.getTokenTask();
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f55621g.execute(new Runnable() { // from class: J10
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m38523e(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public boolean isAutoInitEnabled() {
        return this.f55620f.m38499c();
    }

    public boolean isNotificationDelegationEnabled() {
        return AbstractC18710Wo1.m65559d(this.f55617c);
    }

    /* renamed from: q */
    public String m38511q() {
        FirebaseInstanceIdInternal firebaseInstanceIdInternal = this.f55616b;
        if (firebaseInstanceIdInternal != null) {
            try {
                return (String) Tasks.await(firebaseInstanceIdInternal.getTokenTask());
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        final C8555d.C8556a m38506v = m38506v();
        if (!m38528T(m38506v)) {
            return m38506v.f55683a;
        }
        final String m23250c = C22003rs0.m23250c(this.f55615a);
        try {
            return (String) Tasks.await(this.f55619e.m38434b(m23250c, new C8553c.InterfaceC8554a() { // from class: F10
                @Override // com.google.firebase.messaging.C8553c.InterfaceC8554a
                public final Task start() {
                    Task m38546B;
                    m38546B = FirebaseMessaging.this.m38546B(m23250c, m38506v);
                    return m38546B;
                }
            }));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: r */
    public void m38510r(Runnable runnable, long j) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f55614p == null) {
                    f55614p = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
                }
                f55614p.schedule(runnable, j, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    public Context m38509s() {
        return this.f55617c;
    }

    @Deprecated
    public void send(@NonNull RemoteMessage remoteMessage) {
        int i;
        if (!TextUtils.isEmpty(remoteMessage.getTo())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            Context context = this.f55617c;
            if (Build.VERSION.SDK_INT >= 23) {
                i = 67108864;
            } else {
                i = 0;
            }
            intent.putExtra("app", PendingIntent.getBroadcast(context, 0, intent2, i));
            intent.setPackage("com.google.android.gms");
            remoteMessage.m38452d(intent);
            this.f55617c.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void setAutoInitEnabled(boolean z) {
        this.f55620f.m38496f(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.m38465u(z);
        AbstractC18838Yo1.m65295g(this.f55617c, this.f55618d, m38532P());
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z) {
        return AbstractC18710Wo1.m65557f(this.f55621g, this.f55617c, z).addOnSuccessListener(new ExecutorC21992ro1(), new OnSuccessListener() { // from class: I10
            {
                FirebaseMessaging.this = this;
            }

            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m38527a(FirebaseMessaging.this, (Void) obj);
            }
        });
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull final String str) {
        return this.f55623i.onSuccessTask(new SuccessContinuation() { // from class: C10
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m69076r;
                m69076r = ((AU1) obj).m69076r(str);
                return m69076r;
            }
        });
    }

    /* renamed from: u */
    public final String m38507u() {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.f55615a.getName())) {
            return "";
        }
        return this.f55615a.getPersistenceKey();
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull final String str) {
        return this.f55623i.onSuccessTask(new SuccessContinuation() { // from class: K10
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task m69073u;
                m69073u = ((AU1) obj).m69073u(str);
                return m69073u;
            }
        });
    }

    /* renamed from: v */
    public C8555d.C8556a m38506v() {
        return m38508t(this.f55617c).m38428e(m38507u(), C22003rs0.m23250c(this.f55615a));
    }

    /* renamed from: w */
    public final void m38505w() {
        this.f55618d.m915f().addOnSuccessListener(this.f55621g, new OnSuccessListener() { // from class: E10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.m38518j(FirebaseMessaging.this, (CloudMessage) obj);
            }
        });
    }

    /* renamed from: x */
    public final void m38538J() {
        AbstractC18710Wo1.m65560c(this.f55617c);
        AbstractC18838Yo1.m65295g(this.f55617c, this.f55618d, m38532P());
        if (m38532P()) {
            m38505w();
        }
    }

    /* renamed from: y */
    public final void m38541G(String str) {
        if (FirebaseApp.DEFAULT_APP_NAME.equals(this.f55615a.getName())) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invoking onNewToken for app: ");
                sb.append(this.f55615a.getName());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new FcmBroadcastProcessor(this.f55617c).process(intent);
        }
    }

    /* renamed from: z */
    public boolean m38502z() {
        return this.f55624j.m23246g();
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) firebaseApp.get(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Provider provider2, FirebaseInstallationsApi firebaseInstallationsApi, Provider provider3, Subscriber subscriber, C22003rs0 c22003rs0) {
        this(firebaseApp, firebaseInstanceIdInternal, provider3, subscriber, c22003rs0, new C22733w60(firebaseApp, c22003rs0, provider, provider2, firebaseInstallationsApi), AbstractC10308gW.m31107f(), AbstractC10308gW.m31110c(), AbstractC10308gW.m31111b());
    }

    public FirebaseMessaging(FirebaseApp firebaseApp, FirebaseInstanceIdInternal firebaseInstanceIdInternal, Provider provider, Subscriber subscriber, C22003rs0 c22003rs0, C22733w60 c22733w60, Executor executor, Executor executor2, Executor executor3) {
        this.f55625k = false;
        f55613o = provider;
        this.f55615a = firebaseApp;
        this.f55616b = firebaseInstanceIdInternal;
        this.f55620f = new C8547a(subscriber);
        Context applicationContext = firebaseApp.getApplicationContext();
        this.f55617c = applicationContext;
        C8552b c8552b = new C8552b();
        this.f55626l = c8552b;
        this.f55624j = c22003rs0;
        this.f55618d = c22733w60;
        this.f55619e = new C8553c(executor);
        this.f55621g = executor2;
        this.f55622h = executor3;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        if (applicationContext2 instanceof Application) {
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(c8552b);
        } else {
            Log.w(Constants.TAG, "Context " + applicationContext2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (firebaseInstanceIdInternal != null) {
            firebaseInstanceIdInternal.addNewTokenListener(new FirebaseInstanceIdInternal.NewTokenListener() { // from class: N10
                {
                    FirebaseMessaging.this = this;
                }

                @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
                public final void onNewToken(String str) {
                    FirebaseMessaging.m38524d(FirebaseMessaging.this, str);
                }
            });
        }
        executor2.execute(new Runnable() { // from class: O10
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m38525c(FirebaseMessaging.this);
            }
        });
        Task m69088f = AU1.m69088f(this, c22003rs0, c22733w60, applicationContext, AbstractC10308gW.m31106g());
        this.f55623i = m69088f;
        m69088f.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: P10
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.this.m38539I((AU1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: D10
            {
                FirebaseMessaging.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m38519i(FirebaseMessaging.this);
            }
        });
    }
}
