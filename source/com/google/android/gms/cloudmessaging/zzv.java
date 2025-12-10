package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public final class zzv {

    /* renamed from: e */
    public static zzv f44616e;

    /* renamed from: a */
    public final Context f44617a;

    /* renamed from: b */
    public final ScheduledExecutorService f44618b;

    /* renamed from: c */
    public ServiceConnectionC22943xI2 f44619c = new ServiceConnectionC22943xI2(this, null);

    /* renamed from: d */
    public int f44620d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f44618b = scheduledExecutorService;
        this.f44617a = context.getApplicationContext();
    }

    public static synchronized zzv zzb(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            try {
                if (f44616e == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    f44616e = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                zzvVar = f44616e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzvVar;
    }

    /* renamed from: c */
    public final synchronized int m48668c() {
        int i;
        i = this.f44620d;
        this.f44620d = i + 1;
        return i;
    }

    /* renamed from: d */
    public final synchronized Task m48667d(AbstractC22430uJ2 abstractC22430uJ2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(abstractC22430uJ2.toString());
            }
            if (!this.f44619c.m557g(abstractC22430uJ2)) {
                ServiceConnectionC22943xI2 serviceConnectionC22943xI2 = new ServiceConnectionC22943xI2(this, null);
                this.f44619c = serviceConnectionC22943xI2;
                serviceConnectionC22943xI2.m557g(abstractC22430uJ2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return abstractC22430uJ2.f107340b.getTask();
    }

    public final Task zzc(int i, Bundle bundle) {
        return m48667d(new C20366iJ2(m48668c(), i, bundle));
    }

    public final Task zzd(int i, Bundle bundle) {
        return m48667d(new UJ2(m48668c(), i, bundle));
    }
}
