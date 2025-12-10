package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: yI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC23115yI2 implements ServiceConnection, zzt {

    /* renamed from: a */
    public final Map f108680a = new HashMap();

    /* renamed from: b */
    public int f108681b = 2;

    /* renamed from: c */
    public boolean f108682c;

    /* renamed from: d */
    public IBinder f108683d;

    /* renamed from: e */
    public final zzo f108684e;

    /* renamed from: f */
    public ComponentName f108685f;

    /* renamed from: g */
    public final /* synthetic */ C21570pJ2 f108686g;

    public ServiceConnectionC23115yI2(C21570pJ2 c21570pJ2, zzo zzoVar) {
        this.f108686g = c21570pJ2;
        this.f108684e = zzoVar;
    }

    /* renamed from: a */
    public final int m320a() {
        return this.f108681b;
    }

    /* renamed from: b */
    public final ComponentName m319b() {
        return this.f108685f;
    }

    /* renamed from: c */
    public final IBinder m318c() {
        return this.f108683d;
    }

    /* renamed from: d */
    public final void m317d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f108680a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m316e(String str, Executor executor) {
        ConnectionTracker connectionTracker;
        Context context;
        Context context2;
        ConnectionTracker connectionTracker2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f108681b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (PlatformVersion.isAtLeastS()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            C21570pJ2 c21570pJ2 = this.f108686g;
            connectionTracker = c21570pJ2.f76562j;
            context = c21570pJ2.f76559g;
            zzo zzoVar = this.f108684e;
            context2 = c21570pJ2.f76559g;
            boolean zza = connectionTracker.zza(context, str, zzoVar.zzb(context2), this, 4225, executor);
            this.f108682c = zza;
            if (zza) {
                handler = this.f108686g.f76560h;
                Message obtainMessage = handler.obtainMessage(1, this.f108684e);
                handler2 = this.f108686g.f76560h;
                j = this.f108686g.f76564l;
                handler2.sendMessageDelayed(obtainMessage, j);
            } else {
                this.f108681b = 2;
                try {
                    C21570pJ2 c21570pJ22 = this.f108686g;
                    connectionTracker2 = c21570pJ22.f76562j;
                    context3 = c21570pJ22.f76559g;
                    connectionTracker2.unbindService(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th2;
        }
    }

    /* renamed from: f */
    public final void m315f(ServiceConnection serviceConnection, String str) {
        this.f108680a.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m314g(String str) {
        Handler handler;
        ConnectionTracker connectionTracker;
        Context context;
        zzo zzoVar = this.f108684e;
        handler = this.f108686g.f76560h;
        handler.removeMessages(1, zzoVar);
        C21570pJ2 c21570pJ2 = this.f108686g;
        connectionTracker = c21570pJ2.f76562j;
        context = c21570pJ2.f76559g;
        connectionTracker.unbindService(context, this);
        this.f108682c = false;
        this.f108681b = 2;
    }

    /* renamed from: h */
    public final boolean m313h(ServiceConnection serviceConnection) {
        return this.f108680a.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m312i() {
        return this.f108680a.isEmpty();
    }

    /* renamed from: j */
    public final boolean m311j() {
        return this.f108682c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f108686g.f76558f;
        synchronized (hashMap) {
            try {
                handler = this.f108686g.f76560h;
                handler.removeMessages(1, this.f108684e);
                this.f108683d = iBinder;
                this.f108685f = componentName;
                for (ServiceConnection serviceConnection : this.f108680a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f108681b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f108686g.f76558f;
        synchronized (hashMap) {
            try {
                handler = this.f108686g.f76560h;
                handler.removeMessages(1, this.f108684e);
                this.f108683d = null;
                this.f108685f = componentName;
                for (ServiceConnection serviceConnection : this.f108680a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f108681b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
