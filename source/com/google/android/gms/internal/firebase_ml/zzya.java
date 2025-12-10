package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzya extends AbstractC22089sK2 implements zzyd, RandomAccess {

    /* renamed from: c */
    public static final zzya f46116c;

    /* renamed from: d */
    public static final zzyd f46117d;

    /* renamed from: b */
    public final List f46118b;

    static {
        zzya zzyaVar = new zzya();
        f46116c = zzyaVar;
        zzyaVar.zzty();
        f46117d = zzyaVar;
    }

    public zzya() {
        this(10);
    }

    /* renamed from: a */
    public static String m47417a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzwd) {
            return ((zzwd) obj).zzub();
        }
        return zzxl.zzj((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zztz();
        this.f46118b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zztz();
        this.f46118b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f46118b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzwd) {
            zzwd zzwdVar = (zzwd) obj;
            String zzub = zzwdVar.zzub();
            if (zzwdVar.zzuc()) {
                this.f46118b.set(i, zzub);
            }
            return zzub;
        }
        byte[] bArr = (byte[]) obj;
        String zzj = zzxl.zzj(bArr);
        if (zzxl.zzi(bArr)) {
            this.f46118b.set(i, zzj);
        }
        return zzj;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final Object getRaw(int i) {
        return this.f46118b.get(i);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zztz();
        return m47417a(this.f46118b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46118b.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzxt
    public final /* synthetic */ zzxt zzda(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46118b);
            return new zzya(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final void zze(zzwd zzwdVar) {
        zztz();
        this.f46118b.add(zzwdVar);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC22089sK2, com.google.android.gms.internal.firebase_ml.zzxt
    public final /* bridge */ /* synthetic */ boolean zztx() {
        return super.zztx();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final List<?> zzvz() {
        return Collections.unmodifiableList(this.f46118b);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final zzyd zzwa() {
        if (zztx()) {
            return new zzaaj(this);
        }
        return this;
    }

    public zzya(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zztz();
        if (collection instanceof zzyd) {
            collection = ((zzyd) collection).zzvz();
        }
        boolean addAll = this.f46118b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zztz();
        Object remove = this.f46118b.remove(i);
        ((AbstractList) this).modCount++;
        return m47417a(remove);
    }

    public zzya(ArrayList arrayList) {
        this.f46118b = arrayList;
    }

    @Override // p000.AbstractC22089sK2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
