package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.H */
/* loaded from: classes3.dex */
public final class RunnableC6689H implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48093a;

    /* renamed from: b */
    public final /* synthetic */ zzq f48094b;

    /* renamed from: c */
    public final /* synthetic */ boolean f48095c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48096d;

    public RunnableC6689H(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.f48096d = zzjsVar;
        this.f48093a = atomicReference;
        this.f48094b = zzqVar;
        this.f48095c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48093a) {
            try {
                zzjsVar = this.f48096d;
                zzeeVar = zzjsVar.f48446c;
            } catch (RemoteException e) {
                this.f48096d.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e);
                atomicReference = this.f48093a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.f48093a.notify();
                return;
            }
            Preconditions.checkNotNull(this.f48094b);
            this.f48093a.set(zzeeVar.zze(this.f48094b, this.f48095c));
            this.f48096d.m46215g();
            atomicReference = this.f48093a;
            atomicReference.notify();
        }
    }
}