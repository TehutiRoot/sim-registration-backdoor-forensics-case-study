package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.p */
/* loaded from: classes3.dex */
public final class C6593p extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzbd f47091a;

    public C6593p(zzbd zzbdVar) {
        this.f47091a = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47091a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47091a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f47091a;
        Map zzl = zzbdVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new C6588k(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzx;
        Object obj2;
        Map zzl = this.f47091a.zzl();
        if (zzl == null) {
            zzx = this.f47091a.zzx(obj);
            obj2 = zzbd.zzd;
            if (zzx == obj2) {
                return false;
            }
            return true;
        }
        return zzl.keySet().remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47091a.size();
    }
}
