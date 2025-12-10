package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzjs extends AbstractC21213mv2 implements zzjv, RandomAccess {

    /* renamed from: c */
    public static final zzjs f47660c;

    /* renamed from: d */
    public static final zzjv f47661d;

    /* renamed from: b */
    public final List f47662b;

    static {
        zzjs zzjsVar = new zzjs();
        f47660c = zzjsVar;
        zzjsVar.zzb();
        f47661d = zzjsVar;
    }

    public zzjs() {
        this(10);
    }

    /* renamed from: a */
    public static String m46402a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzht) {
            return ((zzht) obj).zzb();
        }
        return zzjf.zzb((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        zzc();
        this.f47662b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzc();
        this.f47662b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.f47662b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzht) {
            zzht zzhtVar = (zzht) obj;
            String zzb = zzhtVar.zzb();
            if (zzhtVar.zzc()) {
                this.f47662b.set(i, zzb);
            }
            return zzb;
        }
        byte[] bArr = (byte[]) obj;
        String zzb2 = zzjf.zzb(bArr);
        if (zzjf.zza(bArr)) {
            this.f47662b.set(i, zzb2);
        }
        return zzb2;
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        zzc();
        return m46402a(this.f47662b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f47662b.size();
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final void zza(zzht zzhtVar) {
        zzc();
        this.f47662b.add(zzhtVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final Object zzb(int i) {
        return this.f47662b.get(i);
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final List<?> zzd() {
        return Collections.unmodifiableList(this.f47662b);
    }

    @Override // com.google.android.gms.internal.vision.zzjv
    public final zzjv zze() {
        if (zza()) {
            return new zzlz(this);
        }
        return this;
    }

    public zzjs(int i) {
        this(new ArrayList(i));
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzc();
        if (collection instanceof zzjv) {
            collection = ((zzjv) collection).zzd();
        }
        boolean addAll = this.f47662b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        zzc();
        Object remove = this.f47662b.remove(i);
        ((AbstractList) this).modCount++;
        return m46402a(remove);
    }

    public zzjs(ArrayList arrayList) {
        this.f47662b = arrayList;
    }

    @Override // p000.AbstractC21213mv2, com.google.android.gms.internal.vision.zzjl
    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    @Override // p000.AbstractC21213mv2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.vision.zzjl
    public final /* synthetic */ zzjl zza(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f47662b);
            return new zzjs(arrayList);
        }
        throw new IllegalArgumentException();
    }
}