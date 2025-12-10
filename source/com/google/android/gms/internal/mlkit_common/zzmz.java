package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes3.dex */
public final class zzmz {

    /* renamed from: a */
    public zznl f46435a;

    /* renamed from: b */
    public Long f46436b;

    /* renamed from: c */
    public zzmu f46437c;

    /* renamed from: d */
    public Long f46438d;

    /* renamed from: e */
    public zzna f46439e;

    /* renamed from: f */
    public Long f46440f;

    public final zzmz zzb(Long l) {
        this.f46440f = l;
        return this;
    }

    public final zzmz zzc(zzna zznaVar) {
        this.f46439e = zznaVar;
        return this;
    }

    public final zzmz zzd(zzmu zzmuVar) {
        this.f46437c = zzmuVar;
        return this;
    }

    public final zzmz zze(Long l) {
        this.f46438d = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zzmz zzf(zznl zznlVar) {
        this.f46435a = zznlVar;
        return this;
    }

    public final zzmz zzg(Long l) {
        this.f46436b = Long.valueOf(l.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznc zzi() {
        return new zznc(this, null);
    }
}
