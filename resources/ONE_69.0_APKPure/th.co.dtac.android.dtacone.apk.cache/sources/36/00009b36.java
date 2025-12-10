package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.c */
/* loaded from: classes3.dex */
public final class C6615c extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzdp f47521a;

    public C6615c(zzdp zzdpVar) {
        this.f47521a = zzdpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47521a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zza;
        Map zzb = this.f47521a.zzb();
        if (zzb != null) {
            return zzb.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zza = this.f47521a.zza(entry.getKey());
            if (zza != -1 && zzcz.zza(this.f47521a.zzc[zza], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.f47521a.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzi;
        Object obj2;
        Map zzb = this.f47521a.zzb();
        if (zzb != null) {
            return zzb.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!this.f47521a.zza()) {
            zzi = this.f47521a.zzi();
            Object key = entry.getKey();
            Object value = entry.getValue();
            obj2 = this.f47521a.zze;
            zzdp zzdpVar = this.f47521a;
            int m1382c = AbstractC22394tl2.m1382c(key, value, zzi, obj2, zzdpVar.zza, zzdpVar.zzb, zzdpVar.zzc);
            if (m1382c == -1) {
                return false;
            }
            this.f47521a.zza(m1382c, zzi);
            zzdp.zzd(this.f47521a);
            this.f47521a.zzc();
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47521a.size();
    }
}