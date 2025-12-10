package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.a */
/* loaded from: classes3.dex */
public abstract class AbstractRunnableC6527a implements Runnable {

    /* renamed from: a */
    public final long f46196a;

    /* renamed from: b */
    public final long f46197b;

    /* renamed from: c */
    public final boolean f46198c;

    /* renamed from: d */
    public final /* synthetic */ zzee f46199d;

    public AbstractRunnableC6527a(zzee zzeeVar, boolean z) {
        this.f46199d = zzeeVar;
        this.f46196a = zzeeVar.zza.currentTimeMillis();
        this.f46197b = zzeeVar.zza.elapsedRealtime();
        this.f46198c = z;
    }

    /* renamed from: a */
    public abstract void mo188a();

    /* renamed from: b */
    public void mo1009b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.f46199d.f46262e;
        if (z) {
            mo1009b();
            return;
        }
        try {
            mo188a();
        } catch (Exception e) {
            this.f46199d.m47327c(e, false, this.f46198c);
            mo1009b();
        }
    }
}
