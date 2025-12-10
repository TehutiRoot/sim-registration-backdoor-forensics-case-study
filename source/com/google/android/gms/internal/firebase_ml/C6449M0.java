package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase_ml.M0 */
/* loaded from: classes3.dex */
public final class C6449M0 implements Iterator {

    /* renamed from: a */
    public final ArrayDeque f45711a;

    /* renamed from: b */
    public zzwk f45712b;

    public C6449M0(zzwd zzwdVar) {
        zzwd zzwdVar2;
        if (zzwdVar instanceof zzzi) {
            zzzi zzziVar = (zzzi) zzwdVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzziVar.zzud());
            this.f45711a = arrayDeque;
            arrayDeque.push(zzziVar);
            zzwdVar2 = zzziVar.zzcsc;
            this.f45712b = m47991a(zzwdVar2);
            return;
        }
        this.f45711a = null;
        this.f45712b = (zzwk) zzwdVar;
    }

    /* renamed from: a */
    public final zzwk m47991a(zzwd zzwdVar) {
        while (zzwdVar instanceof zzzi) {
            zzzi zzziVar = (zzzi) zzwdVar;
            this.f45711a.push(zzziVar);
            zzwdVar = zzziVar.zzcsc;
        }
        return (zzwk) zzwdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45712b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        zzwk zzwkVar;
        zzwd zzwdVar;
        zzwk zzwkVar2 = this.f45712b;
        if (zzwkVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.f45711a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    zzwdVar = ((zzzi) this.f45711a.pop()).zzcsd;
                    zzwkVar = m47991a(zzwdVar);
                } else {
                    zzwkVar = null;
                    break;
                }
            } while (zzwkVar.size() == 0);
            this.f45712b = zzwkVar;
            return zzwkVar2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ C6449M0(zzwd zzwdVar, C6447L0 c6447l0) {
        this(zzwdVar);
    }
}
