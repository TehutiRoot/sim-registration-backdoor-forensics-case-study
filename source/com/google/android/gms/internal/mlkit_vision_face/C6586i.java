package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.i */
/* loaded from: classes3.dex */
public final class C6586i extends C6584g implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6587j f47081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6586i(C6587j c6587j) {
        super(c6587j);
        this.f47081d = c6587j;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f47081d.isEmpty();
        m46798a();
        ((ListIterator) this.f47073a).add(obj);
        zzap.zzd(this.f47081d.f47082f);
        if (isEmpty) {
            this.f47081d.m46797a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m46798a();
        return ((ListIterator) this.f47073a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m46798a();
        return ((ListIterator) this.f47073a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m46798a();
        return ((ListIterator) this.f47073a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m46798a();
        return ((ListIterator) this.f47073a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m46798a();
        ((ListIterator) this.f47073a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6586i(C6587j c6587j, int i) {
        super(c6587j, ((List) c6587j.f47077b).listIterator(i));
        this.f47081d = c6587j;
    }
}
