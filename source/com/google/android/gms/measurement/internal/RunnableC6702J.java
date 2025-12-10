package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.J */
/* loaded from: classes3.dex */
public final class RunnableC6702J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48087a;

    /* renamed from: b */
    public final /* synthetic */ zzq f48088b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48089c;

    public RunnableC6702J(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f48089c = zzjsVar;
        this.f48087a = atomicReference;
        this.f48088b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzee zzeeVar;
        synchronized (this.f48087a) {
            try {
            } catch (RemoteException e) {
                this.f48089c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
                atomicReference = this.f48087a;
            }
            if (!this.f48089c.zzs.zzm().m68455d().zzi(zzah.ANALYTICS_STORAGE)) {
                this.f48089c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.f48089c.zzs.zzq().m46255g(null);
                this.f48089c.zzs.zzm().f1403f.zzb(null);
                this.f48087a.set(null);
                this.f48087a.notify();
                return;
            }
            zzjs zzjsVar = this.f48089c;
            zzeeVar = zzjsVar.f48434c;
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                this.f48087a.notify();
                return;
            }
            Preconditions.checkNotNull(this.f48088b);
            this.f48087a.set(zzeeVar.zzd(this.f48088b));
            String str = (String) this.f48087a.get();
            if (str != null) {
                this.f48089c.zzs.zzq().m46255g(str);
                this.f48089c.zzs.zzm().f1403f.zzb(str);
            }
            this.f48089c.m46230g();
            atomicReference = this.f48087a;
            atomicReference.notify();
        }
    }
}
