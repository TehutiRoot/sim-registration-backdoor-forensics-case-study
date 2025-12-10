package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.n */
/* loaded from: classes3.dex */
public final class C6580n extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzbd f47098a;

    public C6580n(zzbd zzbdVar) {
        this.f47098a = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47098a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzv;
        Map zzl = this.f47098a.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzv = this.f47098a.zzv(entry.getKey());
            if (zzv != -1 && zzx.zza(zzbd.zzj(this.f47098a, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f47098a;
        Map zzl = zzbdVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new C6578l(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzu;
        int[] zzz;
        Object[] zzA;
        Object[] zzB;
        Map zzl = this.f47098a.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzbd zzbdVar = this.f47098a;
        if (zzbdVar.zzq()) {
            return false;
        }
        zzu = zzbdVar.zzu();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzk = zzbd.zzk(this.f47098a);
        zzz = this.f47098a.zzz();
        zzA = this.f47098a.zzA();
        zzB = this.f47098a.zzB();
        int m51675b = AbstractC19435cf2.m51675b(key, value, zzu, zzk, zzz, zzA, zzB);
        if (m51675b == -1) {
            return false;
        }
        this.f47098a.zzp(m51675b, zzu);
        zzbd.zzb(this.f47098a);
        this.f47098a.zzn();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47098a.size();
    }
}