package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.q */
/* loaded from: classes3.dex */
public final class C6612q extends AbstractC18802Yb2 {

    /* renamed from: a */
    public final Object f47292a;

    /* renamed from: b */
    public int f47293b;

    /* renamed from: c */
    public final /* synthetic */ zzba f47294c;

    public C6612q(zzba zzbaVar, int i) {
        this.f47294c = zzbaVar;
        this.f47292a = zzba.zzg(zzbaVar, i);
        this.f47293b = i;
    }

    /* renamed from: a */
    public final void m46718a() {
        int zzw;
        int i = this.f47293b;
        if (i != -1 && i < this.f47294c.size() && zzw.zza(this.f47292a, zzba.zzg(this.f47294c, this.f47293b))) {
            return;
        }
        zzw = this.f47294c.zzw(this.f47292a);
        this.f47293b = zzw;
    }

    @Override // p000.AbstractC18802Yb2, java.util.Map.Entry
    public final Object getKey() {
        return this.f47292a;
    }

    @Override // p000.AbstractC18802Yb2, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.f47294c.zzl();
        if (zzl != null) {
            return zzl.get(this.f47292a);
        }
        m46718a();
        int i = this.f47293b;
        if (i == -1) {
            return null;
        }
        return zzba.zzj(this.f47294c, i);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.f47294c.zzl();
        if (zzl != null) {
            return zzl.put(this.f47292a, obj);
        }
        m46718a();
        int i = this.f47293b;
        if (i == -1) {
            this.f47294c.put(this.f47292a, obj);
            return null;
        }
        zzba zzbaVar = this.f47294c;
        Object zzj = zzba.zzj(zzbaVar, i);
        zzba.zzn(zzbaVar, this.f47293b, obj);
        return zzj;
    }
}
