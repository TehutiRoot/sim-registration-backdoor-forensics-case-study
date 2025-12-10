package com.google.android.gms.internal.mlkit_vision_face;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.i */
/* loaded from: classes3.dex */
public final class C6575i extends C6573g implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6576j f47093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6575i(C6576j c6576j) {
        super(c6576j);
        this.f47093d = c6576j;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean isEmpty = this.f47093d.isEmpty();
        m46790a();
        ((ListIterator) this.f47085a).add(obj);
        zzap.zzd(this.f47093d.f47094f);
        if (isEmpty) {
            this.f47093d.m46789a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m46790a();
        return ((ListIterator) this.f47085a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m46790a();
        return ((ListIterator) this.f47085a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m46790a();
        return ((ListIterator) this.f47085a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m46790a();
        return ((ListIterator) this.f47085a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m46790a();
        ((ListIterator) this.f47085a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6575i(C6576j c6576j, int i) {
        super(c6576j, ((List) c6576j.f47089b).listIterator(i));
        this.f47093d = c6576j;
    }
}