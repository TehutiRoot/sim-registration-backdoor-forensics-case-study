package com.google.android.gms.internal.vision;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.f */
/* loaded from: classes3.dex */
public abstract class AbstractC6629f implements Iterator {

    /* renamed from: a */
    public int f47512a;

    /* renamed from: b */
    public int f47513b;

    /* renamed from: c */
    public int f47514c;

    /* renamed from: d */
    public final /* synthetic */ zzdp f47515d;

    public AbstractC6629f(zzdp zzdpVar) {
        int i;
        this.f47515d = zzdpVar;
        i = zzdpVar.zzf;
        this.f47512a = i;
        this.f47513b = zzdpVar.zzd();
        this.f47514c = -1;
    }

    /* renamed from: a */
    public abstract Object mo46593a(int i);

    /* renamed from: b */
    public final void m46592b() {
        int i;
        i = this.f47515d.zzf;
        if (i == this.f47512a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f47513b >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        m46592b();
        if (hasNext()) {
            int i = this.f47513b;
            this.f47514c = i;
            Object mo46593a = mo46593a(i);
            this.f47513b = this.f47515d.zza(this.f47513b);
            return mo46593a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        boolean z;
        m46592b();
        if (this.f47514c >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzde.zzb(z, "no calls to next() since the last call to remove()");
        this.f47512a += 32;
        zzdp zzdpVar = this.f47515d;
        zzdpVar.remove(zzdpVar.zzb[this.f47514c]);
        this.f47513b = zzdp.zzb(this.f47513b, this.f47514c);
        this.f47514c = -1;
    }

    public /* synthetic */ AbstractC6629f(zzdp zzdpVar, C6625b c6625b) {
        this(zzdpVar);
    }
}
