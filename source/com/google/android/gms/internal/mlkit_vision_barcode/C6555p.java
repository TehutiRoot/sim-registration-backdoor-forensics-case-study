package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.p */
/* loaded from: classes3.dex */
public final class C6555p extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzcl f46548a;

    public C6555p(zzcl zzclVar) {
        this.f46548a = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46548a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzq;
        Map zzj = this.f46548a.zzj();
        if (zzj != null) {
            return zzj.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzq = this.f46548a.zzq(entry.getKey());
            if (zzq != -1) {
                Object[] objArr = this.f46548a.zzc;
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
        zzcl zzclVar = this.f46548a;
        Map zzj = zzclVar.zzj();
        if (zzj != null) {
            return zzj.entrySet().iterator();
        }
        return new C6553n(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzp;
        int i;
        Map zzj = this.f46548a.zzj();
        if (zzj != null) {
            return zzj.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzcl zzclVar = this.f46548a;
        if (zzclVar.zzo()) {
            return false;
        }
        zzp = zzclVar.zzp();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzh = zzcl.zzh(this.f46548a);
        zzcl zzclVar2 = this.f46548a;
        int[] iArr = zzclVar2.zza;
        iArr.getClass();
        Object[] objArr = zzclVar2.zzb;
        objArr.getClass();
        Object[] objArr2 = zzclVar2.zzc;
        objArr2.getClass();
        int m25890b = AbstractC21453og2.m25890b(key, value, zzp, zzh, iArr, objArr, objArr2);
        if (m25890b == -1) {
            return false;
        }
        this.f46548a.zzn(m25890b, zzp);
        zzcl zzclVar3 = this.f46548a;
        i = zzclVar3.zzg;
        zzclVar3.zzg = i - 1;
        this.f46548a.zzl();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46548a.size();
    }
}
