package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.k */
/* loaded from: classes3.dex */
public final class C6539k extends C6537i implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6540l f46555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6539k(C6540l c6540l) {
        super(c6540l);
        this.f46555d = c6540l;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f46555d.isEmpty();
        m47091a();
        ((ListIterator) this.f46547a).add(obj);
        zzbu zzbuVar = this.f46555d.f46556f;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i + 1;
        if (isEmpty) {
            this.f46555d.m47090a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m47091a();
        return ((ListIterator) this.f46547a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m47091a();
        return ((ListIterator) this.f46547a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m47091a();
        return ((ListIterator) this.f46547a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m47091a();
        return ((ListIterator) this.f46547a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m47091a();
        ((ListIterator) this.f46547a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6539k(C6540l c6540l, int i) {
        super(c6540l, ((List) c6540l.f46551b).listIterator(i));
        this.f46555d = c6540l;
    }
}