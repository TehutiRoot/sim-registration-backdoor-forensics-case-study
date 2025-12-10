package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.r */
/* loaded from: classes3.dex */
public final class C6557r extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzcl f46553a;

    public C6557r(zzcl zzclVar) {
        this.f46553a = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f46553a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f46553a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzcl zzclVar = this.f46553a;
        Map zzj = zzclVar.zzj();
        if (zzj != null) {
            return zzj.keySet().iterator();
        }
        return new C6552m(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzs;
        Object obj2;
        Map zzj = this.f46553a.zzj();
        if (zzj != null) {
            return zzj.keySet().remove(obj);
        }
        zzs = this.f46553a.zzs(obj);
        obj2 = zzcl.zzd;
        if (zzs == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f46553a.size();
    }
}
