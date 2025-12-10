package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.DoNotInline;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.foreground.SystemForegroundDispatcher;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.InterfaceC5229b {

    /* renamed from: f */
    public static final String f38634f = Logger.tagWithPrefix("SystemFgService");

    /* renamed from: g */
    public static SystemForegroundService f38635g = null;

    /* renamed from: b */
    public Handler f38636b;

    /* renamed from: c */
    public boolean f38637c;

    /* renamed from: d */
    public SystemForegroundDispatcher f38638d;

    /* renamed from: e */
    public NotificationManager f38639e;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes.dex */
    public class RunnableC5230a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38640a;

        /* renamed from: b */
        public final /* synthetic */ Notification f38641b;

        /* renamed from: c */
        public final /* synthetic */ int f38642c;

        public RunnableC5230a(int i, Notification notification, int i2) {
            this.f38640a = i;
            this.f38641b = notification;
            this.f38642c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                C5234e.m52169a(SystemForegroundService.this, this.f38640a, this.f38641b, this.f38642c);
            } else if (i >= 29) {
                C5233d.m52170a(SystemForegroundService.this, this.f38640a, this.f38641b, this.f38642c);
            } else {
                SystemForegroundService.this.startForeground(this.f38640a, this.f38641b);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes.dex */
    public class RunnableC5231b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38644a;

        /* renamed from: b */
        public final /* synthetic */ Notification f38645b;

        public RunnableC5231b(int i, Notification notification) {
            this.f38644a = i;
            this.f38645b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f38639e.notify(this.f38644a, this.f38645b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes.dex */
    public class RunnableC5232c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38647a;

        public RunnableC5232c(int i) {
            this.f38647a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f38639e.cancel(this.f38647a);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    /* loaded from: classes.dex */
    public static class C5233d {
        @DoNotInline
        /* renamed from: a */
        public static void m52170a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    /* loaded from: classes.dex */
    public static class C5234e {
        @DoNotInline
        /* renamed from: a */
        public static void m52169a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.get().warning(SystemForegroundService.f38634f, "Unable to start foreground service", e);
            }
        }
    }

    /* renamed from: b */
    private void m52171b() {
        this.f38636b = new Handler(Looper.getMainLooper());
        this.f38639e = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.f38638d = systemForegroundDispatcher;
        systemForegroundDispatcher.m52173i(this);
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return f38635g;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5229b
    public void cancelNotification(int i) {
        this.f38636b.post(new RunnableC5232c(i));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5229b
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i, @NonNull Notification notification) {
        this.f38636b.post(new RunnableC5231b(i, notification));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f38635g = this;
        m52171b();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f38638d.m52175g();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f38637c) {
            Logger.get().info(f38634f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f38638d.m52175g();
            m52171b();
            this.f38637c = false;
        }
        if (intent != null) {
            this.f38638d.m52174h(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5229b
    public void startForeground(int i, int i2, @NonNull Notification notification) {
        this.f38636b.post(new RunnableC5230a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5229b
    @MainThread
    public void stop() {
        this.f38637c = true;
        Logger.get().debug(f38634f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f38635g = null;
        stopSelf();
    }
}