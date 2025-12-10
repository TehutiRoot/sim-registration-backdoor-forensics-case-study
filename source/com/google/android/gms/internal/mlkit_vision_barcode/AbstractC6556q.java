package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.q */
/* loaded from: classes3.dex */
public abstract class AbstractC6556q implements Iterator {

    /* renamed from: a */
    public int f46549a;

    /* renamed from: b */
    public int f46550b;

    /* renamed from: c */
    public int f46551c;

    /* renamed from: d */
    public final /* synthetic */ zzcl f46552d;

    public /* synthetic */ AbstractC6556q(zzcl zzclVar, zzcg zzcgVar) {
        int i;
        this.f46552d = zzclVar;
        i = zzclVar.zzf;
        this.f46549a = i;
        this.f46550b = zzclVar.zze();
        this.f46551c = -1;
    }

    /* renamed from: a */
    public abstract Object mo47079a(int i);

    /* renamed from: b */
    public final void m47078b() {
        int i;
        i = this.f46552d.zzf;
        if (i == this.f46549a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46550b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m47078b();
        if (hasNext()) {
            int i = this.f46550b;
            this.f46551c = i;
            Object mo47079a = mo47079a(i);
            this.f46550b = this.f46552d.zzf(this.f46550b);
            return mo47079a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m47078b();
        if (this.f46551c >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzbc.zze(z, "no calls to next() since the last call to remove()");
        this.f46549a += 32;
        zzcl zzclVar = this.f46552d;
        int i = this.f46551c;
        Object[] objArr = zzclVar.zzb;
        objArr.getClass();
        zzclVar.remove(objArr[i]);
        this.f46550b--;
        this.f46551c = -1;
    }
}
