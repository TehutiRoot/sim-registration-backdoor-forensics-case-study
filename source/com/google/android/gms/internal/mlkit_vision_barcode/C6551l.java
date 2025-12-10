package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.l */
/* loaded from: classes3.dex */
public class C6551l extends AbstractC6549j implements List {

    /* renamed from: f */
    public final /* synthetic */ zzbu f46544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6551l(zzbu zzbuVar, Object obj, List list, AbstractC6549j abstractC6549j) {
        super(zzbuVar, obj, list, abstractC6549j);
        this.f46544f = zzbuVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zzb();
        boolean isEmpty = this.f46539b.isEmpty();
        ((List) this.f46539b).add(i, obj);
        zzbu zzbuVar = this.f46544f;
        i2 = zzbuVar.zzb;
        zzbuVar.zzb = i2 + 1;
        if (isEmpty) {
            m47081a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f46539b).addAll(i, collection);
        if (addAll) {
            int size2 = this.f46539b.size();
            zzbu zzbuVar = this.f46544f;
            i2 = zzbuVar.zzb;
            zzbuVar.zzb = i2 + (size2 - size);
            if (size == 0) {
                m47081a();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzb();
        return ((List) this.f46539b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.f46539b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.f46539b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new C6550k(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        zzb();
        Object remove = ((List) this.f46539b).remove(i);
        zzbu zzbuVar = this.f46544f;
        i2 = zzbuVar.zzb;
        zzbuVar.zzb = i2 - 1;
        m47080b();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        zzb();
        return ((List) this.f46539b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        zzb();
        zzbu zzbuVar = this.f46544f;
        Object obj = this.f46538a;
        List subList = ((List) this.f46539b).subList(i, i2);
        AbstractC6549j abstractC6549j = this.f46540c;
        if (abstractC6549j == null) {
            abstractC6549j = this;
        }
        return zzbuVar.zzm(obj, subList, abstractC6549j);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        zzb();
        return new C6550k(this, i);
    }
}
