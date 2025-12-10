package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.n */
/* loaded from: classes3.dex */
public final class C6598n extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzba f47298a;

    public C6598n(zzba zzbaVar) {
        this.f47298a = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47298a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.f47298a.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.f47298a.zzw(entry.getKey());
            if (zzw != -1 && zzw.zza(zzba.zzj(this.f47298a, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzba zzbaVar = this.f47298a;
        Map zzl = zzbaVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new C6596l(zzbaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.f47298a.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzba zzbaVar = this.f47298a;
            if (!zzbaVar.zzr()) {
                zzv = zzbaVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzba zzbaVar2 = this.f47298a;
                Object zzi = zzba.zzi(zzbaVar2);
                zzA = zzbaVar2.zzA();
                zzB = zzbaVar2.zzB();
                zzC = zzbaVar2.zzC();
                int m67357b = AbstractC18078Me2.m67357b(key, value, zzv, zzi, zzA, zzB, zzC);
                if (m67357b != -1) {
                    this.f47298a.zzq(m67357b, zzv);
                    zzba zzbaVar3 = this.f47298a;
                    i = zzbaVar3.zzg;
                    zzbaVar3.zzg = i - 1;
                    this.f47298a.zzo();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47298a.size();
    }
}