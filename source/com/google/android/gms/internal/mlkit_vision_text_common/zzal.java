package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public abstract class zzal extends AbstractC19549dc2 implements Serializable {
    private transient Map zza;
    private transient int zzb;

    public zzal(Map map) {
        if (map.isEmpty()) {
            this.zza = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* bridge */ /* synthetic */ int zzd(zzal zzalVar) {
        return zzalVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzg(zzal zzalVar) {
        return zzalVar.zza;
    }

    public static /* bridge */ /* synthetic */ void zzj(zzal zzalVar, int i) {
        zzalVar.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzal zzalVar, Object obj) {
        Object obj2;
        Map map = zzalVar.zza;
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
            zzalVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public final Collection zze(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzb(obj, collection);
    }

    public final List zzf(Object obj, List list, @CheckForNull AbstractC6603h abstractC6603h) {
        if (list instanceof RandomAccess) {
            return new C6601f(this, obj, list, abstractC6603h);
        }
        return new C6605j(this, obj, list, abstractC6603h);
    }

    @Override // p000.AbstractC19549dc2
    public final Map zzh() {
        return new C6598c(this, this.zza);
    }

    @Override // p000.AbstractC19549dc2
    public final Set zzi() {
        return new C6600e(this, this.zza);
    }

    public final void zzl() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzcc
    public final boolean zzm(Object obj, Object obj2) {
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
