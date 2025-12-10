package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ServiceConnectionC8559f;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes4.dex */
public class ServiceConnectionC8559f implements ServiceConnection {

    /* renamed from: a */
    public final Context f55687a;

    /* renamed from: b */
    public final Intent f55688b;

    /* renamed from: c */
    public final ScheduledExecutorService f55689c;

    /* renamed from: d */
    public final Queue f55690d;

    /* renamed from: e */
    public BinderC8557e f55691e;

    /* renamed from: f */
    public boolean f55692f;

    /* renamed from: com.google.firebase.messaging.f$a */
    /* loaded from: classes4.dex */
    public static class C8560a {

        /* renamed from: a */
        public final Intent f55693a;

        /* renamed from: b */
        public final TaskCompletionSource f55694b = new TaskCompletionSource();

        public C8560a(Intent intent) {
            this.f55693a = intent;
        }

        /* renamed from: c */
        public void m38412c(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: a62
                {
                    ServiceConnectionC8559f.C8560a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ServiceConnectionC8559f.C8560a.this.m38409f();
                }
            }, 20L, TimeUnit.SECONDS);
            m38410e().addOnCompleteListener(scheduledExecutorService, new OnCompleteListener() { // from class: b62
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    schedule.cancel(false);
                }
            });
        }

        /* renamed from: d */
        public void m38411d() {
            this.f55694b.trySetResult(null);
        }

        /* renamed from: e */
        public Task m38410e() {
            return this.f55694b.getTask();
        }

        /* renamed from: f */
        public final /* synthetic */ void m38409f() {
            Log.w(Constants.TAG, "Service took too long to process intent: " + this.f55693a.getAction() + " finishing.");
            m38411d();
        }
    }

    public ServiceConnectionC8559f(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    /* renamed from: a */
    public final void m38418a() {
        while (!this.f55690d.isEmpty()) {
            ((C8560a) this.f55690d.poll()).m38411d();
        }
    }

    /* renamed from: b */
    public final synchronized void m38417b() {
        try {
            Log.isLoggable(Constants.TAG, 3);
            while (!this.f55690d.isEmpty()) {
                Log.isLoggable(Constants.TAG, 3);
                BinderC8557e binderC8557e = this.f55691e;
                if (binderC8557e != null && binderC8557e.isBinderAlive()) {
                    Log.isLoggable(Constants.TAG, 3);
                    this.f55691e.m38420c((C8560a) this.f55690d.poll());
                } else {
                    m38415d();
                    return;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: c */
    public synchronized Task m38416c(Intent intent) {
        C8560a c8560a;
        Log.isLoggable(Constants.TAG, 3);
        c8560a = new C8560a(intent);
        c8560a.m38412c(this.f55689c);
        this.f55690d.add(c8560a);
        m38417b();
        return c8560a.m38410e();
    }

    /* renamed from: d */
    public final void m38415d() {
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("binder is dead. start connection? ");
            sb.append(!this.f55692f);
        }
        if (this.f55692f) {
            return;
        }
        this.f55692f = true;
        try {
            if (ConnectionTracker.getInstance().bindService(this.f55687a, this.f55688b, this, 65)) {
                return;
            }
        } catch (SecurityException unused) {
        }
        this.f55692f = false;
        m38418a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable(Constants.TAG, 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("onServiceConnected: ");
                sb.append(componentName);
            }
            this.f55692f = false;
            if (!(iBinder instanceof BinderC8557e)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid service connection: ");
                sb2.append(iBinder);
                m38418a();
                return;
            }
            this.f55691e = (BinderC8557e) iBinder;
            m38417b();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable(Constants.TAG, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onServiceDisconnected: ");
            sb.append(componentName);
        }
        m38417b();
    }

    public ServiceConnectionC8559f(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f55690d = new ArrayDeque();
        this.f55692f = false;
        Context applicationContext = context.getApplicationContext();
        this.f55687a = applicationContext;
        this.f55688b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f55689c = scheduledExecutorService;
    }
}
