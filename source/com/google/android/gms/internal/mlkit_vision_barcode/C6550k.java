package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.k */
/* loaded from: classes3.dex */
public final class C6550k extends C6548i implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6551l f46543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6550k(C6551l c6551l) {
        super(c6551l);
        this.f46543d = c6551l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f46543d.isEmpty();
        m47082a();
        ((ListIterator) this.f46535a).add(obj);
        zzbu zzbuVar = this.f46543d.f46544f;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i + 1;
        if (isEmpty) {
            this.f46543d.m47081a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m47082a();
        return ((ListIterator) this.f46535a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m47082a();
        return ((ListIterator) this.f46535a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m47082a();
        return ((ListIterator) this.f46535a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m47082a();
        return ((ListIterator) this.f46535a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m47082a();
        ((ListIterator) this.f46535a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6550k(C6551l c6551l, int i) {
        super(c6551l, ((List) c6551l.f46539b).listIterator(i));
        this.f46543d = c6551l;
    }
}
