package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.c */
/* loaded from: classes3.dex */
public final class C6626c extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzdp f47509a;

    public C6626c(zzdp zzdpVar) {
        this.f47509a = zzdpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47509a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zza;
        Map zzb = this.f47509a.zzb();
        if (zzb != null) {
            return zzb.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zza = this.f47509a.zza(entry.getKey());
            if (zza != -1 && zzcz.zza(this.f47509a.zzc[zza], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f47509a.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzi;
        Object obj2;
        Map zzb = this.f47509a.zzb();
        if (zzb != null) {
            return zzb.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!this.f47509a.zza()) {
            zzi = this.f47509a.zzi();
            Object key = entry.getKey();
            Object value = entry.getValue();
            obj2 = this.f47509a.zze;
            zzdp zzdpVar = this.f47509a;
            int m726c = AbstractC22841wk2.m726c(key, value, zzi, obj2, zzdpVar.zza, zzdpVar.zzb, zzdpVar.zzc);
            if (m726c == -1) {
                return false;
            }
            this.f47509a.zza(m726c, zzi);
            zzdp.zzd(this.f47509a);
            this.f47509a.zzc();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47509a.size();
    }
}
