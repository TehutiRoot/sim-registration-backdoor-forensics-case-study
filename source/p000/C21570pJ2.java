package p000;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.common.zzi;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: pJ2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21570pJ2 extends GmsClientSupervisor {

    /* renamed from: f */
    public final HashMap f76558f = new HashMap();

    /* renamed from: g */
    public final Context f76559g;

    /* renamed from: h */
    public volatile Handler f76560h;

    /* renamed from: i */
    public final C19506dJ2 f76561i;

    /* renamed from: j */
    public final ConnectionTracker f76562j;

    /* renamed from: k */
    public final long f76563k;

    /* renamed from: l */
    public final long f76564l;

    /* renamed from: m */
    public volatile Executor f76565m;

    public C21570pJ2(Context context, Looper looper, Executor executor) {
        C19506dJ2 c19506dJ2 = new C19506dJ2(this, null);
        this.f76561i = c19506dJ2;
        this.f76559g = context.getApplicationContext();
        this.f76560h = new zzi(looper, c19506dJ2);
        this.f76562j = ConnectionTracker.getInstance();
        this.f76563k = CoroutineLiveDataKt.DEFAULT_TIMEOUT;
        this.f76564l = PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
        this.f76565m = executor;
    }

    /* renamed from: f */
    public final void m23702f(Executor executor) {
        synchronized (this.f76558f) {
            this.f76565m = executor;
        }
    }

    /* renamed from: g */
    public final void m23701g(Looper looper) {
        synchronized (this.f76558f) {
            this.f76560h = new zzi(looper, this.f76561i);
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zza(zzo zzoVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f76558f) {
            try {
                ServiceConnectionC23115yI2 serviceConnectionC23115yI2 = (ServiceConnectionC23115yI2) this.f76558f.get(zzoVar);
                if (serviceConnectionC23115yI2 != null) {
                    if (serviceConnectionC23115yI2.m313h(serviceConnection)) {
                        serviceConnectionC23115yI2.m315f(serviceConnection, str);
                        if (serviceConnectionC23115yI2.m312i()) {
                            this.f76560h.sendMessageDelayed(this.f76560h.obtainMessage(0, zzoVar), this.f76563k);
                        }
                    } else {
                        String obj = zzoVar.toString();
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + obj);
                    }
                } else {
                    String obj2 = zzoVar.toString();
                    throw new IllegalStateException("Nonexistent connection status for service config: " + obj2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final boolean zzc(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean m311j;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f76558f) {
            try {
                ServiceConnectionC23115yI2 serviceConnectionC23115yI2 = (ServiceConnectionC23115yI2) this.f76558f.get(zzoVar);
                if (executor == null) {
                    executor = this.f76565m;
                }
                if (serviceConnectionC23115yI2 == null) {
                    serviceConnectionC23115yI2 = new ServiceConnectionC23115yI2(this, zzoVar);
                    serviceConnectionC23115yI2.m317d(serviceConnection, serviceConnection, str);
                    serviceConnectionC23115yI2.m316e(str, executor);
                    this.f76558f.put(zzoVar, serviceConnectionC23115yI2);
                } else {
                    this.f76560h.removeMessages(0, zzoVar);
                    if (!serviceConnectionC23115yI2.m313h(serviceConnection)) {
                        serviceConnectionC23115yI2.m317d(serviceConnection, serviceConnection, str);
                        int m320a = serviceConnectionC23115yI2.m320a();
                        if (m320a != 1) {
                            if (m320a == 2) {
                                serviceConnectionC23115yI2.m316e(str, executor);
                            }
                        } else {
                            serviceConnection.onServiceConnected(serviceConnectionC23115yI2.m319b(), serviceConnectionC23115yI2.m318c());
                        }
                    } else {
                        String obj = zzoVar.toString();
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + obj);
                    }
                }
                m311j = serviceConnectionC23115yI2.m311j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m311j;
    }
}
