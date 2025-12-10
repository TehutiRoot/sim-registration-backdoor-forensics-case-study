package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.d */
/* loaded from: classes3.dex */
public final class C6543d extends AbstractC23007xi2 {

    /* renamed from: c */
    public final transient Map f46524c;

    /* renamed from: d */
    public final /* synthetic */ zzbu f46525d;

    public C6543d(zzbu zzbuVar, Map map) {
        this.f46525d = zzbuVar;
        this.f46524c = map;
    }

    @Override // p000.AbstractC23007xi2
    /* renamed from: a */
    public final Set mo403a() {
        return new C6541b(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public final Collection get(Object obj) {
        Collection collection = (Collection) zzdi.m47067a(this.f46524c, obj);
        if (collection == null) {
            return null;
        }
        return this.f46525d.zzd(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.f46524c;
        zzbu zzbuVar = this.f46525d;
        map = zzbuVar.zza;
        if (map2 == map) {
            zzbuVar.zzs();
        } else {
            zzda.m47068a(new C6542c(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return zzdi.m47066b(this.f46524c, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f46524c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f46524c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f46525d.zzw();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f46524c.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.f46525d.zza();
        zza.addAll(collection);
        zzbu zzbuVar = this.f46525d;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - collection.size();
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f46524c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f46524c.toString();
    }
}
