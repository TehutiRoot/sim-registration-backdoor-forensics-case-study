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
    public static zzv f44628e;

    /* renamed from: a */
    public final Context f44629a;

    /* renamed from: b */
    public final ScheduledExecutorService f44630b;

    /* renamed from: c */
    public ServiceConnectionC22496uJ2 f44631c = new ServiceConnectionC22496uJ2(this, null);

    /* renamed from: d */
    public int f44632d = 1;

    public zzv(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f44630b = scheduledExecutorService;
        this.f44629a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m48667a(zzv zzvVar) {
        return zzvVar.f44629a;
    }

    /* renamed from: b */
    public static /* bridge */ /* synthetic */ ScheduledExecutorService m48666b(zzv zzvVar) {
        return zzvVar.f44630b;
    }

    public static synchronized zzv zzb(Context context) {
        zzv zzvVar;
        synchronized (zzv.class) {
            try {
                if (f44628e == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.zza();
                    f44628e = new zzv(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                zzvVar = f44628e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzvVar;
    }

    /* renamed from: c */
    public final synchronized int m48665c() {
        int i;
        i = this.f44632d;
        this.f44632d = i + 1;
        return i;
    }

    /* renamed from: d */
    public final synchronized Task m48664d(AbstractC21980rK2 abstractC21980rK2) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(abstractC21980rK2.toString());
            }
            if (!this.f44631c.m1196g(abstractC21980rK2)) {
                ServiceConnectionC22496uJ2 serviceConnectionC22496uJ2 = new ServiceConnectionC22496uJ2(this, null);
                this.f44631c = serviceConnectionC22496uJ2;
                serviceConnectionC22496uJ2.m1196g(abstractC21980rK2);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return abstractC21980rK2.f77490b.getTask();
    }

    public final Task zzc(int i, Bundle bundle) {
        return m48664d(new C19904fK2(m48665c(), i, bundle));
    }

    public final Task zzd(int i, Bundle bundle) {
        return m48664d(new RK2(m48665c(), i, bundle));
    }
}