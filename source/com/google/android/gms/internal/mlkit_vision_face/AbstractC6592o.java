package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.o */
/* loaded from: classes3.dex */
public abstract class AbstractC6592o implements Iterator {

    /* renamed from: a */
    public int f47087a;

    /* renamed from: b */
    public int f47088b;

    /* renamed from: c */
    public int f47089c;

    /* renamed from: d */
    public final /* synthetic */ zzbd f47090d;

    public /* synthetic */ AbstractC6592o(zzbd zzbdVar, C6588k c6588k) {
        int i;
        this.f47090d = zzbdVar;
        i = zzbdVar.zzf;
        this.f47087a = i;
        this.f47088b = zzbdVar.zze();
        this.f47089c = -1;
    }

    /* renamed from: a */
    public abstract Object mo46795a(int i);

    /* renamed from: b */
    public final void m46794b() {
        int i;
        i = this.f47090d.zzf;
        if (i == this.f47087a) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47088b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46794b();
        if (hasNext()) {
            int i = this.f47088b;
            this.f47089c = i;
            Object mo46795a = mo46795a(i);
            this.f47088b = this.f47090d.zzf(this.f47088b);
            return mo46795a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        m46794b();
        if (this.f47089c >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "no calls to next() since the last call to remove()");
        this.f47087a += 32;
        zzbd zzbdVar = this.f47090d;
        zzbdVar.remove(zzbd.zzg(zzbdVar, this.f47089c));
        this.f47088b--;
        this.f47089c = -1;
    }
}
