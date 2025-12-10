package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h */
/* loaded from: classes3.dex */
public final class C6574h implements Iterator {

    /* renamed from: a */
    public final ArrayDeque f46870a;

    /* renamed from: b */
    public zzcx f46871b;

    public /* synthetic */ C6574h(zzdb zzdbVar, zzgd zzgdVar) {
        zzdb zzdbVar2;
        if (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzggVar.zzf());
            this.f46870a = arrayDeque;
            arrayDeque.push(zzggVar);
            zzdbVar2 = zzggVar.zzd;
            this.f46871b = m46914b(zzdbVar2);
            return;
        }
        this.f46870a = null;
        this.f46871b = (zzcx) zzdbVar;
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public final zzcx next() {
        zzcx zzcxVar;
        zzdb zzdbVar;
        zzcx zzcxVar2 = this.f46871b;
        if (zzcxVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.f46870a;
                zzcxVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzdbVar = ((zzgg) this.f46870a.pop()).zze;
                zzcxVar = m46914b(zzdbVar);
            } while (zzcxVar.zzd() == 0);
            this.f46871b = zzcxVar;
            return zzcxVar2;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: b */
    public final zzcx m46914b(zzdb zzdbVar) {
        while (zzdbVar instanceof zzgg) {
            zzgg zzggVar = (zzgg) zzdbVar;
            this.f46870a.push(zzggVar);
            zzdbVar = zzggVar.zzd;
        }
        return (zzcx) zzdbVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46871b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
