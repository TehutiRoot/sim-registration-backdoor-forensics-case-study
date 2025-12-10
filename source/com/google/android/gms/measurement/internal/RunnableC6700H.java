package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.H */
/* loaded from: classes3.dex */
public final class RunnableC6700H implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f48081a;

    /* renamed from: b */
    public final /* synthetic */ zzq f48082b;

    /* renamed from: c */
    public final /* synthetic */ boolean f48083c;

    /* renamed from: d */
    public final /* synthetic */ zzjs f48084d;

    public RunnableC6700H(zzjs zzjsVar, AtomicReference atomicReference, zzq zzqVar, boolean z) {
        this.f48084d = zzjsVar;
        this.f48081a = atomicReference;
        this.f48082b = zzqVar;
        this.f48083c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        zzjs zzjsVar;
        zzee zzeeVar;
        synchronized (this.f48081a) {
            try {
                zzjsVar = this.f48084d;
                zzeeVar = zzjsVar.f48434c;
            } catch (RemoteException e) {
                this.f48084d.zzs.zzay().zzd().zzb("Failed to get all user properties; remote exception", e);
                atomicReference = this.f48081a;
            }
            if (zzeeVar == null) {
                zzjsVar.zzs.zzay().zzd().zza("Failed to get all user properties; not connected to service");
                this.f48081a.notify();
                return;
            }
            Preconditions.checkNotNull(this.f48082b);
            this.f48081a.set(zzeeVar.zze(this.f48082b, this.f48083c));
            this.f48084d.m46230g();
            atomicReference = this.f48081a;
            atomicReference.notify();
        }
    }
}
