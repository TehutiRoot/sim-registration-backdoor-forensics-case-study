package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzks extends Qx2 implements RandomAccess, zzkt {

    /* renamed from: c */
    public static final zzks f46335c;
    public static final zzkt zza;

    /* renamed from: b */
    public final List f46336b;

    static {
        zzks zzksVar = new zzks(10);
        f46335c = zzksVar;
        zzksVar.zzb();
        zza = zzksVar;
    }

    public zzks() {
        this(10);
    }

    /* renamed from: a */
    public static String m47149a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            return ((zzjd) obj).zzn(zzkm.f46331b);
        }
        return zzkm.zzh((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbP();
        this.f46336b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbP();
        if (collection instanceof zzkt) {
            collection = ((zzkt) collection).zzh();
        }
        boolean addAll = this.f46336b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbP();
        this.f46336b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.Qx2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbP();
        Object remove = this.f46336b.remove(i);
        ((AbstractList) this).modCount++;
        return m47149a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbP();
        return m47149a(this.f46336b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46336b.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkl
    public final /* bridge */ /* synthetic */ zzkl zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46336b);
            return new zzks(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final zzkt zze() {
        if (zzc()) {
            return new zzms(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final Object zzf(int i) {
        return this.f46336b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.f46336b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjd) {
            zzjd zzjdVar = (zzjd) obj;
            String zzn = zzjdVar.zzn(zzkm.f46331b);
            if (zzjdVar.zzi()) {
                this.f46336b.set(i, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzkm.zzh(bArr);
        if (zzkm.zzi(bArr)) {
            this.f46336b.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final List zzh() {
        return Collections.unmodifiableList(this.f46336b);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void zzi(zzjd zzjdVar) {
        zzbP();
        this.f46336b.add(zzjdVar);
        ((AbstractList) this).modCount++;
    }

    public zzks(int i) {
        this.f46336b = new ArrayList(i);
    }

    public zzks(ArrayList arrayList) {
        this.f46336b = arrayList;
    }

    @Override // p000.Qx2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
