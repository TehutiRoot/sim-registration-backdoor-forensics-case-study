package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.utils.WakeLocks;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.InterfaceC5236c {

    /* renamed from: d */
    public static final String f38469d = Logger.tagWithPrefix("SystemAlarmService");

    /* renamed from: b */
    public SystemAlarmDispatcher f38470b;

    /* renamed from: c */
    public boolean f38471c;

    /* renamed from: a */
    public final void m52245a() {
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f38470b = systemAlarmDispatcher;
        systemAlarmDispatcher.m52247k(this);
    }

    @Override // androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.InterfaceC5236c
    @MainThread
    public void onAllCommandsCompleted() {
        this.f38471c = true;
        Logger.get().debug(f38469d, "All commands completed in dispatcher");
        WakeLocks.checkWakeLocks();
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m52245a();
        this.f38471c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f38471c = true;
        this.f38470b.m52249i();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f38471c) {
            Logger.get().info(f38469d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f38470b.m52249i();
            m52245a();
            this.f38471c = false;
        }
        if (intent != null) {
            this.f38470b.add(intent, i2);
            return 3;
        }
        return 3;
    }
}
