package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.p */
/* loaded from: classes3.dex */
public final class C6544p extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzcl f46560a;

    public C6544p(zzcl zzclVar) {
        this.f46560a = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46560a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzq;
        Map zzj = this.f46560a.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.f46560a.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.f46560a.zzc;
                objArr.getClass();
                if (zzay.zza(objArr[zzq], entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzcl zzclVar = this.f46560a;
        Map zzj = zzclVar.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new C6542n(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzp;
        int i;
        Map zzj = this.f46560a.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzcl zzclVar = this.f46560a;
        if (zzclVar.zzo()) {
            return false;
        }
        zzp = zzclVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzh = zzcl.zzh(this.f46560a);
        zzcl zzclVar2 = this.f46560a;
        int[] iArr = zzclVar2.zza;
        iArr.getClass();
        Object[] objArr = zzclVar2.zzb;
        objArr.getClass();
        Object[] objArr2 = zzclVar2.zzc;
        objArr2.getClass();
        int m26786b = AbstractC20998lh2.m26786b(key, value, zzp, zzh, iArr, objArr, objArr2);
        if (m26786b == -1) {
            return false;
        }
        this.f46560a.zzn(m26786b, zzp);
        zzcl zzclVar3 = this.f46560a;
        i = zzclVar3.zzg;
        zzclVar3.zzg = i - 1;
        this.f46560a.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46560a.size();
    }
}