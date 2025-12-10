package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.r */
/* loaded from: classes3.dex */
public final class C6584r extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ zzbd f47107a;

    public C6584r(zzbd zzbdVar) {
        this.f47107a = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f47107a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zzbd zzbdVar = this.f47107a;
        Map zzl = zzbdVar.zzl();
        if (zzl != null) {
            return zzl.values().iterator();
        }
        return new C6579m(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f47107a.size();
    }
}