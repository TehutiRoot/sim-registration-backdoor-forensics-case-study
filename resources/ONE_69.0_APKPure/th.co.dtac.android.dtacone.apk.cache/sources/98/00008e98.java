package com.google.android.gms.internal.firebase_ml;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.firebase_ml.M0 */
/* loaded from: classes3.dex */
public final class C6438M0 implements Iterator {

    /* renamed from: a */
    public final ArrayDeque f45723a;

    /* renamed from: b */
    public zzwk f45724b;

    public C6438M0(zzwd zzwdVar) {
        zzwd zzwdVar2;
        if (zzwdVar instanceof zzzi) {
            zzzi zzziVar = (zzzi) zzwdVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzziVar.zzud());
            this.f45723a = arrayDeque;
            arrayDeque.push(zzziVar);
            zzwdVar2 = zzziVar.zzcsc;
            this.f45724b = m47988a(zzwdVar2);
            return;
        }
        this.f45723a = null;
        this.f45724b = (zzwk) zzwdVar;
    }

    /* renamed from: a */
    public final zzwk m47988a(zzwd zzwdVar) {
        while (zzwdVar instanceof zzzi) {
            zzzi zzziVar = (zzzi) zzwdVar;
            this.f45723a.push(zzziVar);
            zzwdVar = zzziVar.zzcsc;
        }
        return (zzwk) zzwdVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f45724b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        zzwk zzwkVar;
        zzwd zzwdVar;
        zzwk zzwkVar2 = this.f45724b;
        if (zzwkVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.f45723a;
                if (arrayDeque != null && !arrayDeque.isEmpty()) {
                    zzwdVar = ((zzzi) this.f45723a.pop()).zzcsd;
                    zzwkVar = m47988a(zzwdVar);
                } else {
                    zzwkVar = null;
                    break;
                }
            } while (zzwkVar.size() == 0);
            this.f45724b = zzwkVar;
            return zzwkVar2;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ C6438M0(zzwd zzwdVar, C6436L0 c6436l0) {
        this(zzwdVar);
    }
}