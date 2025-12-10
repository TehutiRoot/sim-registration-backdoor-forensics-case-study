package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.j */
/* loaded from: classes3.dex */
public abstract class AbstractC6549j extends AbstractCollection {

    /* renamed from: a */
    public final Object f46538a;

    /* renamed from: b */
    public Collection f46539b;

    /* renamed from: c */
    public final AbstractC6549j f46540c;

    /* renamed from: d */
    public final Collection f46541d;

    /* renamed from: e */
    public final /* synthetic */ zzbu f46542e;

    public AbstractC6549j(zzbu zzbuVar, Object obj, Collection collection, AbstractC6549j abstractC6549j) {
        Collection collection2;
        this.f46542e = zzbuVar;
        this.f46538a = obj;
        this.f46539b = collection;
        this.f46540c = abstractC6549j;
        if (abstractC6549j == null) {
            collection2 = null;
        } else {
            collection2 = abstractC6549j.f46539b;
        }
        this.f46541d = collection2;
    }

    /* renamed from: a */
    public final void m47081a() {
        Map map;
        AbstractC6549j abstractC6549j = this.f46540c;
        if (abstractC6549j != null) {
            abstractC6549j.m47081a();
            return;
        }
        map = this.f46542e.zza;
        map.put(this.f46538a, this.f46539b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        zzb();
        boolean isEmpty = this.f46539b.isEmpty();
        boolean add = this.f46539b.add(obj);
        if (add) {
            zzbu zzbuVar = this.f46542e;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i + 1;
            if (isEmpty) {
                m47081a();
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
        boolean addAll = this.f46539b.addAll(collection);
        if (addAll) {
            int size2 = this.f46539b.size();
            zzbu zzbuVar = this.f46542e;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i + (size2 - size);
            if (size == 0) {
                m47081a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    /* renamed from: b */
    public final void m47080b() {
        Map map;
        AbstractC6549j abstractC6549j = this.f46540c;
        if (abstractC6549j != null) {
            abstractC6549j.m47080b();
        } else if (this.f46539b.isEmpty()) {
            map = this.f46542e.zza;
            map.remove(this.f46538a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.f46539b.clear();
        zzbu zzbuVar = this.f46542e;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - size;
        m47080b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zzb();
        return this.f46539b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zzb();
        return this.f46539b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zzb();
        return this.f46539b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zzb();
        return this.f46539b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzb();
        return new C6548i(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        zzb();
        boolean remove = this.f46539b.remove(obj);
        if (remove) {
            zzbu zzbuVar = this.f46542e;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i - 1;
            m47080b();
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
        boolean removeAll = this.f46539b.removeAll(collection);
        if (removeAll) {
            int size2 = this.f46539b.size();
            zzbu zzbuVar = this.f46542e;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i + (size2 - size);
            m47080b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.f46539b.retainAll(collection);
        if (retainAll) {
            int size2 = this.f46539b.size();
            zzbu zzbuVar = this.f46542e;
            i = zzbuVar.zzb;
            zzbuVar.zzb = i + (size2 - size);
            m47080b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zzb();
        return this.f46539b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zzb();
        return this.f46539b.toString();
    }

    public final void zzb() {
        Map map;
        AbstractC6549j abstractC6549j = this.f46540c;
        if (abstractC6549j != null) {
            abstractC6549j.zzb();
            if (this.f46540c.f46539b != this.f46541d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f46539b.isEmpty()) {
            map = this.f46542e.zza;
            Collection collection = (Collection) map.get(this.f46538a);
            if (collection != null) {
                this.f46539b = collection;
            }
        }
    }
}
