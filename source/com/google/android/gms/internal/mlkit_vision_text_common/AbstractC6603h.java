package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.h */
/* loaded from: classes3.dex */
public abstract class AbstractC6603h extends AbstractCollection {

    /* renamed from: a */
    public final Object f47276a;

    /* renamed from: b */
    public Collection f47277b;

    /* renamed from: c */
    public final AbstractC6603h f47278c;

    /* renamed from: d */
    public final Collection f47279d;

    /* renamed from: e */
    public final /* synthetic */ zzal f47280e;

    public AbstractC6603h(zzal zzalVar, Object obj, Collection collection, AbstractC6603h abstractC6603h) {
        Collection collection2;
        this.f47280e = zzalVar;
        this.f47276a = obj;
        this.f47277b = collection;
        this.f47278c = abstractC6603h;
        if (abstractC6603h == null) {
            collection2 = null;
        } else {
            collection2 = abstractC6603h.f47277b;
        }
        this.f47279d = collection2;
    }

    /* renamed from: a */
    public final void m46722a() {
        Map map;
        AbstractC6603h abstractC6603h = this.f47278c;
        if (abstractC6603h != null) {
            abstractC6603h.m46722a();
            return;
        }
        zzal zzalVar = this.f47280e;
        Object obj = this.f47276a;
        map = zzalVar.zza;
        map.put(obj, this.f47277b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.f47277b.isEmpty();
        boolean add = this.f47277b.add(obj);
        if (add) {
            zzal zzalVar = this.f47280e;
            i = zzalVar.zzb;
            zzalVar.zzb = i + 1;
            if (isEmpty) {
                m46722a();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f47277b.addAll(collection);
        if (addAll) {
            int size2 = this.f47277b.size();
            zzal zzalVar = this.f47280e;
            i = zzalVar.zzb;
            zzalVar.zzb = i + (size2 - size);
            if (size == 0) {
                m46722a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* renamed from: b */
    public final void m46721b() {
        Map map;
        AbstractC6603h abstractC6603h = this.f47278c;
        if (abstractC6603h != null) {
            abstractC6603h.m46721b();
        } else if (this.f47277b.isEmpty()) {
            zzal zzalVar = this.f47280e;
            Object obj = this.f47276a;
            map = zzalVar.zza;
            map.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f47277b.clear();
        zzal zzalVar = this.f47280e;
        i = zzalVar.zzb;
        zzalVar.zzb = i - size;
        m46721b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f47277b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f47277b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f47277b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f47277b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C6602g(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.f47277b.remove(obj);
        if (remove) {
            zzal zzalVar = this.f47280e;
            i = zzalVar.zzb;
            zzalVar.zzb = i - 1;
            m46721b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f47277b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f47277b.size();
            zzal zzalVar = this.f47280e;
            int i2 = size2 - size;
            i = zzalVar.zzb;
            zzalVar.zzb = i + i2;
            m46721b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f47277b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f47277b.size();
            zzal zzalVar = this.f47280e;
            int i2 = size2 - size;
            i = zzalVar.zzb;
            zzalVar.zzb = i + i2;
            m46721b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f47277b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f47277b.toString();
    }

    public final void zzb() {
        Map map;
        AbstractC6603h abstractC6603h = this.f47278c;
        if (abstractC6603h != null) {
            abstractC6603h.zzb();
            AbstractC6603h abstractC6603h2 = this.f47278c;
            if (abstractC6603h2.f47277b != this.f47279d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f47277b.isEmpty()) {
            zzal zzalVar = this.f47280e;
            Object obj = this.f47276a;
            map = zzalVar.zza;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.f47277b = collection;
            }
        }
    }
}
