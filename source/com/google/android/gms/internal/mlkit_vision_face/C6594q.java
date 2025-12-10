package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.q */
/* loaded from: classes3.dex */
public final class C6594q extends AbstractC21269nc2 {

    /* renamed from: a */
    public final Object f47092a;

    /* renamed from: b */
    public int f47093b;

    /* renamed from: c */
    public final /* synthetic */ zzbd f47094c;

    public C6594q(zzbd zzbdVar, int i) {
        this.f47094c = zzbdVar;
        this.f47092a = zzbd.zzg(zzbdVar, i);
        this.f47093b = i;
    }

    /* renamed from: a */
    public final void m46793a() {
        int zzv;
        int i = this.f47093b;
        if (i == -1 || i >= this.f47094c.size() || !zzx.zza(this.f47092a, zzbd.zzg(this.f47094c, this.f47093b))) {
            zzv = this.f47094c.zzv(this.f47092a);
            this.f47093b = zzv;
        }
    }

    @Override // p000.AbstractC21269nc2, java.util.Map.Entry
    public final Object getKey() {
        return this.f47092a;
    }

    @Override // p000.AbstractC21269nc2, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.f47094c.zzl();
        if (zzl != null) {
            return zzl.get(this.f47092a);
        }
        m46793a();
        int i = this.f47093b;
        if (i == -1) {
            return null;
        }
        return zzbd.zzj(this.f47094c, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.f47094c.zzl();
        if (zzl != null) {
            return zzl.put(this.f47092a, obj);
        }
        m46793a();
        int i = this.f47093b;
        if (i == -1) {
            this.f47094c.put(this.f47092a, obj);
            return null;
        }
        Object zzj = zzbd.zzj(this.f47094c, i);
        zzbd.zzm(this.f47094c, this.f47093b, obj);
        return zzj;
    }
}
