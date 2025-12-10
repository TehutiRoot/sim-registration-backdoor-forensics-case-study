package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.t */
/* loaded from: classes3.dex */
public final class C6548t extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ zzcl f46569a;

    public C6548t(zzcl zzclVar) {
        this.f46569a = zzclVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f46569a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzcl zzclVar = this.f46569a;
        Map zzj = zzclVar.zzj();
        if (zzj != null) {
            return zzj.values().iterator();
        }
        return new C6543o(zzclVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f46569a.size();
    }
}