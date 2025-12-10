package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzo;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: xI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC22943xI2 implements ServiceConnection {

    /* renamed from: c */
    public II2 f108309c;

    /* renamed from: f */
    public final /* synthetic */ zzv f108312f;

    /* renamed from: a */
    public int f108307a = 0;

    /* renamed from: b */
    public final Messenger f108308b = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: com.google.android.gms.cloudmessaging.zzm
        {
            ServiceConnectionC22943xI2.this = this;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Received response to request: ");
                sb.append(i);
            }
            ServiceConnectionC22943xI2 serviceConnectionC22943xI2 = ServiceConnectionC22943xI2.this;
            synchronized (serviceConnectionC22943xI2) {
                try {
                    AbstractC22430uJ2 abstractC22430uJ2 = (AbstractC22430uJ2) serviceConnectionC22943xI2.f108311e.get(i);
                    if (abstractC22430uJ2 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                        return true;
                    }
                    serviceConnectionC22943xI2.f108311e.remove(i);
                    serviceConnectionC22943xI2.m558f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        abstractC22430uJ2.m1289c(new zzt(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    abstractC22430uJ2.mo1291a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* renamed from: d */
    public final Queue f108310d = new ArrayDeque();

    /* renamed from: e */
    public final SparseArray f108311e = new SparseArray();

    public /* synthetic */ ServiceConnectionC22943xI2(zzv zzvVar, zzo zzoVar) {
        this.f108312f = zzvVar;
    }

    /* renamed from: a */
    public final synchronized void m563a(int i, String str) {
        m562b(i, str, null);
    }

    /* renamed from: b */
    public final synchronized void m562b(int i, String str, Throwable th2) {
        Context context;
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i2 = this.f108307a;
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        return;
                    }
                    this.f108307a = 4;
                    return;
                }
                Log.isLoggable("MessengerIpcClient", 2);
                this.f108307a = 4;
                zzv zzvVar = this.f108312f;
                ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
                context = zzvVar.f44617a;
                connectionTracker.unbindService(context, this);
                zzt zztVar = new zzt(i, str, th2);
                for (AbstractC22430uJ2 abstractC22430uJ2 : this.f108310d) {
                    abstractC22430uJ2.m1289c(zztVar);
                }
                this.f108310d.clear();
                for (int i3 = 0; i3 < this.f108311e.size(); i3++) {
                    ((AbstractC22430uJ2) this.f108311e.valueAt(i3)).m1289c(zztVar);
                }
                this.f108311e.clear();
                return;
            }
            throw new IllegalStateException();
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* renamed from: c */
    public final void m561c() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.f108312f.f44618b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzj
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC22430uJ2 abstractC22430uJ2;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                while (true) {
                    final ServiceConnectionC22943xI2 serviceConnectionC22943xI2 = ServiceConnectionC22943xI2.this;
                    synchronized (serviceConnectionC22943xI2) {
                        try {
                            if (serviceConnectionC22943xI2.f108307a != 2) {
                                return;
                            }
                            if (serviceConnectionC22943xI2.f108310d.isEmpty()) {
                                serviceConnectionC22943xI2.m558f();
                                return;
                            }
                            abstractC22430uJ2 = (AbstractC22430uJ2) serviceConnectionC22943xI2.f108310d.poll();
                            serviceConnectionC22943xI2.f108311e.put(abstractC22430uJ2.f107339a, abstractC22430uJ2);
                            scheduledExecutorService2 = serviceConnectionC22943xI2.f108312f.f44618b;
                            scheduledExecutorService2.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzn
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC22943xI2.this.m559e(abstractC22430uJ2.f107339a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(abstractC22430uJ2));
                    }
                    zzv zzvVar = serviceConnectionC22943xI2.f108312f;
                    Messenger messenger = serviceConnectionC22943xI2.f108308b;
                    int i = abstractC22430uJ2.f107341c;
                    context = zzvVar.f44617a;
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    obtain.arg1 = abstractC22430uJ2.f107339a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC22430uJ2.mo1290b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", abstractC22430uJ2.f107342d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC22943xI2.f108309c.m67919a(obtain);
                    } catch (RemoteException e) {
                        serviceConnectionC22943xI2.m563a(2, e.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public final synchronized void m560d() {
        if (this.f108307a == 1) {
            m563a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void m559e(int i) {
        AbstractC22430uJ2 abstractC22430uJ2 = (AbstractC22430uJ2) this.f108311e.get(i);
        if (abstractC22430uJ2 != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.f108311e.remove(i);
            abstractC22430uJ2.m1289c(new zzt(3, "Timed out waiting for response", null));
            m558f();
        }
    }

    /* renamed from: f */
    public final synchronized void m558f() {
        Context context;
        if (this.f108307a == 2 && this.f108310d.isEmpty() && this.f108311e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f108307a = 3;
            zzv zzvVar = this.f108312f;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = zzvVar.f44617a;
            connectionTracker.unbindService(context, this);
        }
    }

    /* renamed from: g */
    public final synchronized boolean m557g(AbstractC22430uJ2 abstractC22430uJ2) {
        boolean z;
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.f108307a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                this.f108310d.add(abstractC22430uJ2);
                m561c();
                return true;
            }
            this.f108310d.add(abstractC22430uJ2);
            return true;
        }
        this.f108310d.add(abstractC22430uJ2);
        if (this.f108307a == 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        Log.isLoggable("MessengerIpcClient", 2);
        this.f108307a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.f108312f.f44617a;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.f108312f.f44618b;
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzk
                    {
                        ServiceConnectionC22943xI2.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC22943xI2.this.m560d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m563a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            m562b(0, "Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f108312f.f44618b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzi
            {
                ServiceConnectionC22943xI2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC22943xI2 serviceConnectionC22943xI2 = ServiceConnectionC22943xI2.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC22943xI2) {
                    if (iBinder2 == null) {
                        serviceConnectionC22943xI2.m563a(0, "Null service connection");
                        return;
                    }
                    try {
                        serviceConnectionC22943xI2.f108309c = new II2(iBinder2);
                        serviceConnectionC22943xI2.f108307a = 2;
                        serviceConnectionC22943xI2.m561c();
                    } catch (RemoteException e) {
                        serviceConnectionC22943xI2.m563a(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.f108312f.f44618b;
        scheduledExecutorService.execute(new Runnable() { // from class: com.google.android.gms.cloudmessaging.zzl
            {
                ServiceConnectionC22943xI2.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC22943xI2.this.m563a(2, "Service disconnected");
            }
        });
    }
}
