package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.j */
/* loaded from: classes3.dex */
public class C6605j extends AbstractC6603h implements List {

    /* renamed from: f */
    public final /* synthetic */ zzal f47282f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6605j(zzal zzalVar, Object obj, List list, AbstractC6603h abstractC6603h) {
        super(zzalVar, obj, list, abstractC6603h);
        this.f47282f = zzalVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.f47277b.isEmpty();
        ((List) this.f47277b).add(i, obj);
        zzal zzalVar = this.f47282f;
        i2 = zzalVar.zzb;
        zzalVar.zzb = i2 + 1;
        if (isEmpty) {
            m46722a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f47277b).addAll(i, collection);
        if (addAll) {
            int size2 = this.f47277b.size();
            zzal zzalVar = this.f47282f;
            i2 = zzalVar.zzb;
            zzalVar.zzb = i2 + (size2 - size);
            if (size == 0) {
                m46722a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f47277b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f47277b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f47277b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C6604i(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.f47277b).remove(i);
        zzal zzalVar = this.f47282f;
        i2 = zzalVar.zzb;
        zzalVar.zzb = i2 - 1;
        m46721b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f47277b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        List subList = ((List) this.f47277b).subList(i, i2);
        AbstractC6603h abstractC6603h = this.f47278c;
        if (abstractC6603h == null) {
            abstractC6603h = this;
        }
        return this.f47282f.zzf(this.f47276a, subList, abstractC6603h);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C6604i(this, i);
    }
}
