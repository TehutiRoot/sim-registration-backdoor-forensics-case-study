package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.p */
/* loaded from: classes3.dex */
public final class C6600p extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzba f47303a;

    public C6600p(zzba zzbaVar) {
        this.f47303a = zzbaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47303a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f47303a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzba zzbaVar = this.f47303a;
        Map zzl = zzbaVar.zzl();
        if (zzl != null) {
            return zzl.keySet().iterator();
        }
        return new C6595k(zzbaVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzy;
        Object obj2;
        Map zzl = this.f47303a.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        zzy = this.f47303a.zzy(obj);
        obj2 = zzba.zzd;
        if (zzy == obj2) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47303a.size();
    }
}