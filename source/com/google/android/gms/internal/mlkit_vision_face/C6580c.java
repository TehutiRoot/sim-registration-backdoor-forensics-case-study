package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.c */
/* loaded from: classes3.dex */
public final class C6580c extends AbstractC20590jf2 {

    /* renamed from: c */
    public final transient Map f47067c;

    /* renamed from: d */
    public final /* synthetic */ zzap f47068d;

    public C6580c(zzap zzapVar, Map map) {
        this.f47068d = zzapVar;
        this.f47067c = map;
    }

    @Override // p000.AbstractC20590jf2
    /* renamed from: a */
    public final Set mo29161a() {
        return new C6578a(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f47067c;
        zzap zzapVar = this.f47068d;
        map = zzapVar.zza;
        if (map2 == map) {
            zzapVar.zzn();
        } else {
            zzbr.m46791a(new C6579b(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzbz.m46789b(this.f47067c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f47067c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzbz.m46790a(this.f47067c, obj);
        if (collection == null) {
            return null;
        }
        return this.f47068d.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f47067c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f47068d.zzq();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f47067c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.f47068d.zza();
        zza.addAll(collection);
        zzap.zzg(this.f47068d, collection.size());
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f47067c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f47067c.toString();
    }
}
