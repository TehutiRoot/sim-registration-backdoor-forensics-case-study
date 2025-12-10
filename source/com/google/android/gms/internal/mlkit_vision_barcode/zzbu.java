package com.google.android.gms.internal.mlkit_vision_barcode;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public abstract class zzbu extends AbstractC20074gf2 implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzbu(Map map) {
        zzbc.zzc(map.isEmpty());
        this.zza = map;
    }

    public static /* bridge */ /* synthetic */ int zzg(zzbu zzbuVar) {
        return zzbuVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzn(zzbu zzbuVar) {
        return zzbuVar.zza;
    }

    public static /* bridge */ /* synthetic */ void zzq(zzbu zzbuVar, int i) {
        zzbuVar.zzb = i;
    }

    public static /* bridge */ /* synthetic */ void zzr(zzbu zzbuVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzbuVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzbuVar.zzb -= size;
        }
    }

    public abstract Collection zza();

    public Collection zzb() {
        throw null;
    }

    public Collection zzc(Collection collection) {
        throw null;
    }

    public Collection zzd(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final int zzh() {
        return this.zzb;
    }

    @Override // p000.AbstractC20074gf2
    public final Collection zzi() {
        if (this instanceof zzdt) {
            return new C19037af2(this);
        }
        return new C18555Ue2(this);
    }

    public final Collection zzj(Object obj) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            collection = zza();
        }
        return zzd(obj, collection);
    }

    public final Collection zzk(@CheckForNull Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return zzb();
        }
        Collection zza = zza();
        zza.addAll(collection);
        this.zzb -= collection.size();
        collection.clear();
        return zzc(zza);
    }

    @Override // p000.AbstractC20074gf2
    public final Iterator zzl() {
        return new C6540a(this);
    }

    public final List zzm(Object obj, List list, @CheckForNull AbstractC6549j abstractC6549j) {
        if (list instanceof RandomAccess) {
            return new C6547h(this, obj, list, abstractC6549j);
        }
        return new C6551l(this, obj, list, abstractC6549j);
    }

    @Override // p000.AbstractC20074gf2
    public final Map zzo() {
        return new C6543d(this, this.zza);
    }

    @Override // p000.AbstractC20074gf2
    public final Set zzp() {
        return new C6546g(this, this.zza);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final void zzs() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzdj
    public final boolean zzt(Object obj, Object obj2) {
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
