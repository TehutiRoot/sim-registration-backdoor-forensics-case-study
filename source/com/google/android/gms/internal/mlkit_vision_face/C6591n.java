package com.google.android.gms.internal.mlkit_vision_face;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.n */
/* loaded from: classes3.dex */
public final class C6591n extends AbstractSet {

    /* renamed from: a */
    public final /* synthetic */ zzbd f47086a;

    public C6591n(zzbd zzbdVar) {
        this.f47086a = zzbdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f47086a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int zzv;
        Map zzl = this.f47086a.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzv = this.f47086a.zzv(entry.getKey());
            if (zzv != -1 && zzx.zza(zzbd.zzj(this.f47086a, zzv), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzbd zzbdVar = this.f47086a;
        Map zzl = zzbdVar.zzl();
        if (zzl != null) {
            return zzl.entrySet().iterator();
        }
        return new C6589l(zzbdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzu;
        int[] zzz;
        Object[] zzA;
        Object[] zzB;
        Map zzl = this.f47086a.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzbd zzbdVar = this.f47086a;
        if (zzbdVar.zzq()) {
            return false;
        }
        zzu = zzbdVar.zzu();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object zzk = zzbd.zzk(this.f47086a);
        zzz = this.f47086a.zzz();
        zzA = this.f47086a.zzA();
        zzB = this.f47086a.zzB();
        int m31278b = AbstractC19899fe2.m31278b(key, value, zzu, zzk, zzz, zzA, zzB);
        if (m31278b == -1) {
            return false;
        }
        this.f47086a.zzp(m31278b, zzu);
        zzbd.zzb(this.f47086a);
        this.f47086a.zzn();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f47086a.size();
    }
}
