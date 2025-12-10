package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.i */
/* loaded from: classes3.dex */
public final class C6604i extends C6602g implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6605j f47281d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6604i(C6605j c6605j) {
        super(c6605j);
        this.f47281d = c6605j;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f47281d.isEmpty();
        m46723a();
        ((ListIterator) this.f47273a).add(obj);
        zzal zzalVar = this.f47281d.f47282f;
        i = zzalVar.zzb;
        zzalVar.zzb = i + 1;
        if (isEmpty) {
            this.f47281d.m46722a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m46723a();
        return ((ListIterator) this.f47273a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m46723a();
        return ((ListIterator) this.f47273a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m46723a();
        return ((ListIterator) this.f47273a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m46723a();
        return ((ListIterator) this.f47273a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m46723a();
        ((ListIterator) this.f47273a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6604i(C6605j c6605j, int i) {
        super(c6605j, ((List) c6605j.f47277b).listIterator(i));
        this.f47281d = c6605j;
    }
}
