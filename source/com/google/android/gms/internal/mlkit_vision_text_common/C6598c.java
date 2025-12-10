package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.c */
/* loaded from: classes3.dex */
public final class C6598c extends AbstractC18174Of2 {

    /* renamed from: c */
    public final transient Map f47267c;

    /* renamed from: d */
    public final /* synthetic */ zzal f47268d;

    public C6598c(zzal zzalVar, Map map) {
        this.f47268d = zzalVar;
        this.f47267c = map;
    }

    @Override // p000.AbstractC18174Of2
    /* renamed from: a */
    public final Set mo46724a() {
        return new C6596a(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        zzal zzalVar = this.f47268d;
        Map map2 = this.f47267c;
        map = zzalVar.zza;
        if (map2 == map) {
            zzalVar.zzl();
        } else {
            zzbo.m46717a(new C6597b(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzcb.m46715b(this.f47267c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f47267c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzcb.m46716a(this.f47267c, obj);
        if (collection == null) {
            return null;
        }
        return this.f47268d.zzb(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f47267c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f47268d.zzo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f47267c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.f47268d.zza();
        zza.addAll(collection);
        zzal zzalVar = this.f47268d;
        i = zzalVar.zzb;
        zzalVar.zzb = i - collection.size();
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f47267c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f47267c.toString();
    }
}
