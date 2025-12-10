package com.google.android.gms.internal.mlkit_vision_face;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public abstract class zzap extends AbstractC21957rc2 implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzap(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int zzd(zzap zzapVar) {
        int i = zzapVar.zzb;
        zzapVar.zzb = i + 1;
        return i;
    }

    public static /* synthetic */ int zze(zzap zzapVar) {
        int i = zzapVar.zzb;
        zzapVar.zzb = i - 1;
        return i;
    }

    public static /* synthetic */ int zzf(zzap zzapVar, int i) {
        int i2 = zzapVar.zzb + i;
        zzapVar.zzb = i2;
        return i2;
    }

    public static /* synthetic */ int zzg(zzap zzapVar, int i) {
        int i2 = zzapVar.zzb - i;
        zzapVar.zzb = i2;
        return i2;
    }

    public static /* synthetic */ Map zzj(zzap zzapVar) {
        return zzapVar.zza;
    }

    public static /* synthetic */ void zzm(zzap zzapVar, Object obj) {
        Object obj2;
        Map map = zzapVar.zza;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzapVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zzh(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzi(Object obj, List list, @CheckForNull AbstractC6585h abstractC6585h) {
        if (list instanceof RandomAccess) {
            return new C6583f(this, obj, list, abstractC6585h);
        }
        return new C6587j(this, obj, list, abstractC6585h);
    }

    @Override // p000.AbstractC21957rc2
    public final Map zzk() {
        return new C6580c(this, this.zza);
    }

    @Override // p000.AbstractC21957rc2
    public final Set zzl() {
        return new C6582e(this, this.zza);
    }

    public final void zzn() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_face.zzca
    public final boolean zzo(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
