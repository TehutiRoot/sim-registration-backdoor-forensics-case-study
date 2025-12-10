package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.e */
/* loaded from: classes3.dex */
public final class C6582e extends AbstractC18747Xe2 {

    /* renamed from: b */
    public final /* synthetic */ zzap f47072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6582e(zzap zzapVar, Map map) {
        super(map);
        this.f47072b = zzapVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzbr.m46791a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f7539a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f7539a.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7539a.keySet().hashCode();
    }

    @Override // p000.AbstractC18747Xe2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6581d(this, this.f7539a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f7539a.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzap.zzg(this.f47072b, size);
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
