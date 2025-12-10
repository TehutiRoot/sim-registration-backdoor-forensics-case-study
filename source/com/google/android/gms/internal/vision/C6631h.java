package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.h */
/* loaded from: classes3.dex */
public final class C6631h extends AbstractC18375Ri2 {

    /* renamed from: a */
    public final Object f47517a;

    /* renamed from: b */
    public int f47518b;

    /* renamed from: c */
    public final /* synthetic */ zzdp f47519c;

    public C6631h(zzdp zzdpVar, int i) {
        this.f47519c = zzdpVar;
        this.f47517a = zzdpVar.zzb[i];
        this.f47518b = i;
    }

    /* renamed from: a */
    public final void m46591a() {
        int zza;
        int i = this.f47518b;
        if (i == -1 || i >= this.f47519c.size() || !zzcz.zza(this.f47517a, this.f47519c.zzb[this.f47518b])) {
            zza = this.f47519c.zza(this.f47517a);
            this.f47518b = zza;
        }
    }

    @Override // p000.AbstractC18375Ri2, java.util.Map.Entry
    public final Object getKey() {
        return this.f47517a;
    }

    @Override // p000.AbstractC18375Ri2, java.util.Map.Entry
    public final Object getValue() {
        Map zzb = this.f47519c.zzb();
        if (zzb != null) {
            return zzb.get(this.f47517a);
        }
        m46591a();
        int i = this.f47518b;
        if (i == -1) {
            return null;
        }
        return this.f47519c.zzc[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzb = this.f47519c.zzb();
        if (zzb != null) {
            return zzb.put(this.f47517a, obj);
        }
        m46591a();
        int i = this.f47518b;
        if (i == -1) {
            this.f47519c.put(this.f47517a, obj);
            return null;
        }
        Object[] objArr = this.f47519c.zzc;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
