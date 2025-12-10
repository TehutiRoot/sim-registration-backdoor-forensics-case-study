package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.j */
/* loaded from: classes3.dex */
public class C6587j extends AbstractC6585h implements List {

    /* renamed from: f */
    public final /* synthetic */ zzap f47082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6587j(zzap zzapVar, Object obj, List list, AbstractC6585h abstractC6585h) {
        super(zzapVar, obj, list, abstractC6585h);
        this.f47082f = zzapVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        zzb();
        boolean isEmpty = this.f47077b.isEmpty();
        ((List) this.f47077b).add(i, obj);
        zzap.zzd(this.f47082f);
        if (isEmpty) {
            m46797a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f47077b).addAll(i, collection);
        if (addAll) {
            zzap.zzf(this.f47082f, this.f47077b.size() - size);
            if (size == 0) {
                m46797a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f47077b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f47077b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f47077b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C6586i(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        zzb();
        Object remove = ((List) this.f47077b).remove(i);
        zzap.zze(this.f47082f);
        m46796b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f47077b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzap zzapVar = this.f47082f;
        Object obj = this.f47076a;
        List subList = ((List) this.f47077b).subList(i, i2);
        AbstractC6585h abstractC6585h = this.f47078c;
        if (abstractC6585h == null) {
            abstractC6585h = this;
        }
        return zzapVar.zzi(obj, subList, abstractC6585h);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C6586i(this, i);
    }
}
