package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.e */
/* loaded from: classes3.dex */
public final class C6600e extends AbstractC20762kf2 {

    /* renamed from: b */
    public final /* synthetic */ zzal f47272b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6600e(zzal zzalVar, Map map) {
        super(map);
        this.f47272b = zzalVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzbo.m46717a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f67972a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f67972a.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f67972a.keySet().hashCode();
    }

    @Override // p000.AbstractC20762kf2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6599d(this, this.f67972a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f67972a.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzal zzalVar = this.f47272b;
            i = zzalVar.zzb;
            zzalVar.zzb = i - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
