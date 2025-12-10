package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes3.dex */
public final class C6532f implements DF2 {

    /* renamed from: a */
    public final zzll f46220a;

    /* renamed from: b */
    public final AbstractC18978aH2 f46221b;

    /* renamed from: c */
    public final boolean f46222c;

    /* renamed from: d */
    public final KA2 f46223d;

    public C6532f(AbstractC18978aH2 abstractC18978aH2, KA2 ka2, zzll zzllVar) {
        this.f46221b = abstractC18978aH2;
        this.f46222c = ka2.mo47402c(zzllVar);
        this.f46223d = ka2;
        this.f46220a = zzllVar;
    }

    /* renamed from: c */
    public static C6532f m47358c(AbstractC18978aH2 abstractC18978aH2, KA2 ka2, zzll zzllVar) {
        return new C6532f(abstractC18978aH2, ka2, zzllVar);
    }

    @Override // p000.DF2
    /* renamed from: a */
    public final void mo47360a(Object obj, InterfaceC18981aI2 interfaceC18981aI2) {
        this.f46223d.mo47404a(obj);
        throw null;
    }

    @Override // p000.DF2
    /* renamed from: b */
    public final void mo47359b(Object obj, byte[] bArr, int i, int i2, C20475iy2 c20475iy2) {
        zzke zzkeVar = (zzke) obj;
        if (zzkeVar.zzc == zzmo.zzc()) {
            zzkeVar.zzc = zzmo.m47147b();
        }
        zzkb zzkbVar = (zzkb) obj;
        throw null;
    }

    @Override // p000.DF2
    public final int zza(Object obj) {
        AbstractC18978aH2 abstractC18978aH2 = this.f46221b;
        int mo47356b = abstractC18978aH2.mo47356b(abstractC18978aH2.mo47355c(obj));
        if (!this.f46222c) {
            return mo47356b;
        }
        this.f46223d.mo47404a(obj);
        throw null;
    }

    @Override // p000.DF2
    public final int zzb(Object obj) {
        int hashCode = this.f46221b.mo47355c(obj).hashCode();
        if (!this.f46222c) {
            return hashCode;
        }
        this.f46223d.mo47404a(obj);
        throw null;
    }

    @Override // p000.DF2
    public final Object zze() {
        return this.f46220a.zzbF().zzaG();
    }

    @Override // p000.DF2
    public final void zzf(Object obj) {
        this.f46221b.mo47351g(obj);
        this.f46223d.mo47403b(obj);
    }

    @Override // p000.DF2
    public final void zzg(Object obj, Object obj2) {
        IF2.m67951f(this.f46221b, obj, obj2);
        if (this.f46222c) {
            IF2.m67952e(this.f46223d, obj, obj2);
        }
    }

    @Override // p000.DF2
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.f46221b.mo47355c(obj).equals(this.f46221b.mo47355c(obj2))) {
            return false;
        }
        if (!this.f46222c) {
            return true;
        }
        this.f46223d.mo47404a(obj);
        this.f46223d.mo47404a(obj2);
        throw null;
    }

    @Override // p000.DF2
    public final boolean zzk(Object obj) {
        this.f46223d.mo47404a(obj);
        throw null;
    }
}
