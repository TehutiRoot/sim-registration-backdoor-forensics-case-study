package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzev extends AbstractC20937lg2 implements RandomAccess, zzew {

    /* renamed from: c */
    public static final zzev f46974c;
    @Deprecated
    public static final zzew zza;

    /* renamed from: b */
    public final List f46975b;

    static {
        zzev zzevVar = new zzev(false);
        f46974c = zzevVar;
        zza = zzevVar;
    }

    public zzev() {
        this(10);
    }

    /* renamed from: a */
    public static String m46869a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            return ((zzdb) obj).zzt(zzem.f46970b);
        }
        return zzem.zzd((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zza();
        this.f46975b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zza();
        if (collection instanceof zzew) {
            collection = ((zzew) collection).zzh();
        }
        boolean addAll = this.f46975b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.f46975b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        Object remove = this.f46975b.remove(i);
        ((AbstractList) this).modCount++;
        return m46869a(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zza();
        return m46869a(this.f46975b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46975b.size();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzel
    public final /* bridge */ /* synthetic */ zzel zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46975b);
            return new zzev(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final zzew zze() {
        if (zzc()) {
            return new zzhd(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final Object zzf(int i) {
        return this.f46975b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.f46975b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdb) {
            zzdb zzdbVar = (zzdb) obj;
            String zzt = zzdbVar.zzt(zzem.f46970b);
            if (zzdbVar.zzn()) {
                this.f46975b.set(i, zzt);
            }
            return zzt;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzem.zzd(bArr);
        if (AbstractC6576j.m46897g(bArr)) {
            this.f46975b.set(i, zzd);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzew
    public final List zzh() {
        return Collections.unmodifiableList(this.f46975b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzev(int i) {
        super(true);
        ArrayList arrayList = new ArrayList(i);
        this.f46975b = arrayList;
    }

    public zzev(ArrayList arrayList) {
        super(true);
        this.f46975b = arrayList;
    }

    public zzev(boolean z) {
        super(false);
        this.f46975b = Collections.emptyList();
    }

    @Override // p000.AbstractC20937lg2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
