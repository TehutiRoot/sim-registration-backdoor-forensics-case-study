package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.J */
/* loaded from: classes3.dex */
public final class RunnableC6691J implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48099a;

    /* renamed from: b */
    public final /* synthetic */ zzq f48100b;

    /* renamed from: c */
    public final /* synthetic */ zzjs f48101c;

    public RunnableC6691J(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar) {
        this.f48101c = zzjsVar;
        this.f48099a = atomicReference;
        this.f48100b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzee zzeeVar;
        synchronized (this.f48099a) {
            try {
            } catch (RemoteException e) {
                this.f48101c.zzs.zzay().zzd().zzb("Failed to get app instance id", e);
                atomicReference = this.f48099a;
            }
            if (!this.f48101c.zzs.zzm().m69072d().zzi(zzah.ANALYTICS_STORAGE)) {
                this.f48101c.zzs.zzay().zzl().zza("Analytics storage consent denied; will not get app instance id");
                this.f48101c.zzs.zzq().m46240g(null);
                this.f48101c.zzs.zzm().f521f.zzb(null);
                this.f48099a.set(null);
                this.f48099a.notify();
                return;
            }
            zzjs zzjsVar = this.f48101c;
            zzeeVar = zzjsVar.f48446c;
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zza("Failed to get app instance id");
                this.f48099a.notify();
                return;
            }
            Preconditions.checkNotNull(this.f48100b);
            this.f48099a.set(zzeeVar.zzd(this.f48100b));
            String str = (String) this.f48099a.get();
            if (str != null) {
                this.f48101c.zzs.zzq().m46240g(str);
                this.f48101c.zzs.zzm().f521f.zzb(str);
            }
            this.f48101c.m46215g();
            atomicReference = this.f48099a;
            atomicReference.notify();
        }
    }
}