package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.List;
import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.i */
/* loaded from: classes3.dex */
public final class C6593i extends C6591g implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ C6594j f47293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6593i(C6594j c6594j) {
        super(c6594j);
        this.f47293d = c6594j;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i;
        boolean isEmpty = this.f47293d.isEmpty();
        m46714a();
        ((ListIterator) this.f47285a).add(obj);
        zzal zzalVar = this.f47293d.f47294f;
        i = zzalVar.zzb;
        zzalVar.zzb = i + 1;
        if (isEmpty) {
            this.f47293d.m46713a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        m46714a();
        return ((ListIterator) this.f47285a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        m46714a();
        return ((ListIterator) this.f47285a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m46714a();
        return ((ListIterator) this.f47285a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        m46714a();
        return ((ListIterator) this.f47285a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m46714a();
        ((ListIterator) this.f47285a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6593i(C6594j c6594j, int i) {
        super(c6594j, ((List) c6594j.f47289b).listIterator(i));
        this.f47293d = c6594j;
    }
}