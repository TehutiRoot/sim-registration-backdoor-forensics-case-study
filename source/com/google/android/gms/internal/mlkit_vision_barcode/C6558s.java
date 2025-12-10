package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.s */
/* loaded from: classes3.dex */
public final class C6558s extends AbstractC18235Pe2 {

    /* renamed from: a */
    public final Object f46554a;

    /* renamed from: b */
    public int f46555b;

    /* renamed from: c */
    public final /* synthetic */ zzcl f46556c;

    public C6558s(zzcl zzclVar, int i) {
        this.f46556c = zzclVar;
        Object[] objArr = zzclVar.zzb;
        objArr.getClass();
        this.f46554a = objArr[i];
        this.f46555b = i;
    }

    /* renamed from: a */
    public final void m47077a() {
        int zzq;
        int i = this.f46555b;
        if (i != -1 && i < this.f46556c.size()) {
            Object obj = this.f46554a;
            zzcl zzclVar = this.f46556c;
            int i2 = this.f46555b;
            Object[] objArr = zzclVar.zzb;
            objArr.getClass();
            if (zzay.zza(obj, objArr[i2])) {
                return;
            }
        }
        zzq = this.f46556c.zzq(this.f46554a);
        this.f46555b = zzq;
    }

    @Override // p000.AbstractC18235Pe2, java.util.Map.Entry
    public final Object getKey() {
        return this.f46554a;
    }

    @Override // p000.AbstractC18235Pe2, java.util.Map.Entry
    public final Object getValue() {
        Map zzj = this.f46556c.zzj();
        if (zzj != null) {
            return zzj.get(this.f46554a);
        }
        m47077a();
        int i = this.f46555b;
        if (i == -1) {
            return null;
        }
        Object[] objArr = this.f46556c.zzc;
        objArr.getClass();
        return objArr[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzj = this.f46556c.zzj();
        if (zzj != null) {
            return zzj.put(this.f46554a, obj);
        }
        m47077a();
        int i = this.f46555b;
        if (i == -1) {
            this.f46556c.put(this.f46554a, obj);
            return null;
        }
        Object[] objArr = this.f46556c.zzc;
        objArr.getClass();
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }
}
