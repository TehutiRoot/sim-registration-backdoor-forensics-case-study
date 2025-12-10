package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.g */
/* loaded from: classes3.dex */
public final class C6546g extends AbstractC21459oi2 {

    /* renamed from: b */
    public final /* synthetic */ zzbu f46534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6546g(zzbu zzbuVar, Map map) {
        super(map);
        this.f46534b = zzbuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzda.m47068a(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f72774a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f72774a.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f72774a.keySet().hashCode();
    }

    @Override // p000.AbstractC21459oi2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6545f(this, this.f72774a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f72774a.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbu zzbuVar = this.f46534b;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i - size;
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
