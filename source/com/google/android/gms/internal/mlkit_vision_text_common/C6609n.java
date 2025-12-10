package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.n */
/* loaded from: classes3.dex */
public final class C6609n extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzba f47286a;

    public C6609n(zzba zzbaVar) {
        this.f47286a = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47286a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzw;
        Map zzl = this.f47286a.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.f47286a.zzw(entry.getKey());
            if (zzw != -1 && zzw.zza(zzba.zzj(this.f47286a, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzba zzbaVar = this.f47286a;
        Map zzl = zzbaVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new C6607l(zzbaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i;
        Map zzl = this.f47286a.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzba zzbaVar = this.f47286a;
            if (!zzbaVar.zzr()) {
                zzv = zzbaVar.zzv();
                Object key = entry.getKey();
                Object value = entry.getValue();
                zzba zzbaVar2 = this.f47286a;
                Object zzi = zzba.zzi(zzbaVar2);
                zzA = zzbaVar2.zzA();
                zzB = zzbaVar2.zzB();
                zzC = zzbaVar2.zzC();
                int m66782b = AbstractC18232Pd2.m66782b(key, value, zzv, zzi, zzA, zzB, zzC);
                if (m66782b != -1) {
                    this.f47286a.zzq(m66782b, zzv);
                    zzba zzbaVar3 = this.f47286a;
                    i = zzbaVar3.zzg;
                    zzbaVar3.zzg = i - 1;
                    this.f47286a.zzo();
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
        return this.f47286a.size();
    }
}
