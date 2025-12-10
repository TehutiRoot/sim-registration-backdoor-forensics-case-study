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
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.InterfaceC5247b {

    /* renamed from: f */
    public static final String f38546f = Logger.tagWithPrefix("SystemFgService");

    /* renamed from: g */
    public static SystemForegroundService f38547g = null;

    /* renamed from: b */
    public Handler f38548b;

    /* renamed from: c */
    public boolean f38549c;

    /* renamed from: d */
    public SystemForegroundDispatcher f38550d;

    /* renamed from: e */
    public NotificationManager f38551e;

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    /* loaded from: classes.dex */
    public class RunnableC5248a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38552a;

        /* renamed from: b */
        public final /* synthetic */ Notification f38553b;

        /* renamed from: c */
        public final /* synthetic */ int f38554c;

        public RunnableC5248a(int i, Notification notification, int i2) {
            this.f38552a = i;
            this.f38553b = notification;
            this.f38554c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                C5252e.m52217a(SystemForegroundService.this, this.f38552a, this.f38553b, this.f38554c);
            } else if (i >= 29) {
                C5251d.m52218a(SystemForegroundService.this, this.f38552a, this.f38553b, this.f38554c);
            } else {
                SystemForegroundService.this.startForeground(this.f38552a, this.f38553b);
            }
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$b */
    /* loaded from: classes.dex */
    public class RunnableC5249b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38556a;

        /* renamed from: b */
        public final /* synthetic */ Notification f38557b;

        public RunnableC5249b(int i, Notification notification) {
            this.f38556a = i;
            this.f38557b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f38551e.notify(this.f38556a, this.f38557b);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$c */
    /* loaded from: classes.dex */
    public class RunnableC5250c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f38559a;

        public RunnableC5250c(int i) {
            this.f38559a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f38551e.cancel(this.f38559a);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$d */
    /* loaded from: classes.dex */
    public static class C5251d {
        @DoNotInline
        /* renamed from: a */
        public static void m52218a(Service service, int i, Notification notification, int i2) {
            service.startForeground(i, notification, i2);
        }
    }

    /* renamed from: androidx.work.impl.foreground.SystemForegroundService$e */
    /* loaded from: classes.dex */
    public static class C5252e {
        @DoNotInline
        /* renamed from: a */
        public static void m52217a(Service service, int i, Notification notification, int i2) {
            try {
                service.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.get().warning(SystemForegroundService.f38546f, "Unable to start foreground service", e);
            }
        }
    }

    /* renamed from: b */
    private void m52219b() {
        this.f38548b = new Handler(Looper.getMainLooper());
        this.f38551e = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.f38550d = systemForegroundDispatcher;
        systemForegroundDispatcher.m52221i(this);
    }

    @Nullable
    public static SystemForegroundService getInstance() {
        return f38547g;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5247b
    public void cancelNotification(int i) {
        this.f38548b.post(new RunnableC5250c(i));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5247b
    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i, @NonNull Notification notification) {
        this.f38548b.post(new RunnableC5249b(i, notification));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f38547g = this;
        m52219b();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f38550d.m52223g();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f38549c) {
            Logger.get().info(f38546f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f38550d.m52223g();
            m52219b();
            this.f38549c = false;
        }
        if (intent != null) {
            this.f38550d.m52222h(intent);
            return 3;
        }
        return 3;
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5247b
    public void startForeground(int i, int i2, @NonNull Notification notification) {
        this.f38548b.post(new RunnableC5248a(i, notification, i2));
    }

    @Override // androidx.work.impl.foreground.SystemForegroundDispatcher.InterfaceC5247b
    @MainThread
    public void stop() {
        this.f38549c = true;
        Logger.get().debug(f38546f, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f38547g = null;
        stopSelf();
    }
}
