package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6585h extends AbstractCollection {

    /* renamed from: a */
    public final Object f47076a;

    /* renamed from: b */
    public Collection f47077b;

    /* renamed from: c */
    public final AbstractC6585h f47078c;

    /* renamed from: d */
    public final Collection f47079d;

    /* renamed from: e */
    public final /* synthetic */ zzap f47080e;

    public AbstractC6585h(zzap zzapVar, Object obj, Collection collection, AbstractC6585h abstractC6585h) {
        Collection collection2;
        this.f47080e = zzapVar;
        this.f47076a = obj;
        this.f47077b = collection;
        this.f47078c = abstractC6585h;
        if (abstractC6585h == null) {
            collection2 = null;
        } else {
            collection2 = abstractC6585h.f47077b;
        }
        this.f47079d = collection2;
    }

    /* renamed from: a */
    public final void m46797a() {
        Map map;
        AbstractC6585h abstractC6585h = this.f47078c;
        if (abstractC6585h != null) {
            abstractC6585h.m46797a();
            return;
        }
        map = this.f47080e.zza;
        map.put(this.f47076a, this.f47077b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzb();
        boolean isEmpty = this.f47077b.isEmpty();
        boolean add = this.f47077b.add(obj);
        if (add) {
            zzap.zzd(this.f47080e);
            if (isEmpty) {
                m46797a();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f47077b.addAll(collection);
        if (addAll) {
            zzap.zzf(this.f47080e, this.f47077b.size() - size);
            if (size == 0) {
                m46797a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* renamed from: b */
    public final void m46796b() {
        Map map;
        AbstractC6585h abstractC6585h = this.f47078c;
        if (abstractC6585h != null) {
            abstractC6585h.m46796b();
        } else if (this.f47077b.isEmpty()) {
            map = this.f47080e.zza;
            map.remove(this.f47076a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f47077b.clear();
        zzap.zzg(this.f47080e, size);
        m46796b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f47077b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f47077b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f47077b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f47077b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C6584g(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zzb();
        boolean remove = this.f47077b.remove(obj);
        if (remove) {
            zzap.zze(this.f47080e);
            m46796b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f47077b.removeAll(collection);
        if (removeAll) {
            zzap.zzf(this.f47080e, this.f47077b.size() - size);
            m46796b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean retainAll = this.f47077b.retainAll(collection);
        if (retainAll) {
            zzap.zzf(this.f47080e, this.f47077b.size() - size);
            m46796b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f47077b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f47077b.toString();
    }

    public final void zzb() {
        Map map;
        AbstractC6585h abstractC6585h = this.f47078c;
        if (abstractC6585h != null) {
            abstractC6585h.zzb();
            if (this.f47078c.f47077b != this.f47079d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f47077b.isEmpty()) {
            map = this.f47080e.zza;
            Collection collection = (Collection) map.get(this.f47076a);
            if (collection != null) {
                this.f47077b = collection;
            }
        }
    }
}
