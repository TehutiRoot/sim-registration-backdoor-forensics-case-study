package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f */
/* loaded from: classes3.dex */
public final class C6521f implements AG2 {

    /* renamed from: a */
    public final zzll f46232a;

    /* renamed from: b */
    public final XH2 f46233b;

    /* renamed from: c */
    public final boolean f46234c;

    /* renamed from: d */
    public final HB2 f46235d;

    public C6521f(XH2 xh2, HB2 hb2, zzll zzllVar) {
        this.f46233b = xh2;
        this.f46234c = hb2.mo47411c(zzllVar);
        this.f46235d = hb2;
        this.f46232a = zzllVar;
    }

    /* renamed from: c */
    public static C6521f m47367c(XH2 xh2, HB2 hb2, zzll zzllVar) {
        return new C6521f(xh2, hb2, zzllVar);
    }

    @Override // p000.AG2
    /* renamed from: a */
    public final void mo47369a(Object obj, XI2 xi2) {
        this.f46235d.mo47413a(obj);
        throw null;
    }

    @Override // p000.AG2
    /* renamed from: b */
    public final void mo47368b(Object obj, byte[] bArr, int i, int i2, C20014fz2 c20014fz2) {
        zzke zzkeVar = (zzke) obj;
        if (zzkeVar.zzc == zzmo.zzc()) {
            zzkeVar.zzc = zzmo.m47156b();
        }
        zzkb zzkbVar = (zzkb) obj;
        throw null;
    }

    @Override // p000.AG2
    public final int zza(Object obj) {
        XH2 xh2 = this.f46233b;
        int mo47365b = xh2.mo47365b(xh2.mo47364c(obj));
        if (!this.f46234c) {
            return mo47365b;
        }
        this.f46235d.mo47413a(obj);
        throw null;
    }

    @Override // p000.AG2
    public final int zzb(Object obj) {
        int hashCode = this.f46233b.mo47364c(obj).hashCode();
        if (!this.f46234c) {
            return hashCode;
        }
        this.f46235d.mo47413a(obj);
        throw null;
    }

    @Override // p000.AG2
    public final Object zze() {
        return this.f46232a.zzbF().zzaG();
    }

    @Override // p000.AG2
    public final void zzf(Object obj) {
        this.f46233b.mo47360g(obj);
        this.f46235d.mo47412b(obj);
    }

    @Override // p000.AG2
    public final void zzg(Object obj, Object obj2) {
        FG2.m68464f(this.f46233b, obj, obj2);
        if (this.f46234c) {
            FG2.m68465e(this.f46235d, obj, obj2);
        }
    }

    @Override // p000.AG2
    public final boolean zzj(Object obj, Object obj2) {
        if (!this.f46233b.mo47364c(obj).equals(this.f46233b.mo47364c(obj2))) {
            return false;
        }
        if (!this.f46234c) {
            return true;
        }
        this.f46235d.mo47413a(obj);
        this.f46235d.mo47413a(obj2);
        throw null;
    }

    @Override // p000.AG2
    public final boolean zzk(Object obj) {
        this.f46235d.mo47413a(obj);
        throw null;
    }
}