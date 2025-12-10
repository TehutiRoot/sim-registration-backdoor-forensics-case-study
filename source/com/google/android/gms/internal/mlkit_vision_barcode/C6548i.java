package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.i */
/* loaded from: classes3.dex */
public class C6548i implements Iterator {

    /* renamed from: a */
    public final Iterator f46535a;

    /* renamed from: b */
    public final Collection f46536b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6549j f46537c;

    public C6548i(AbstractC6549j abstractC6549j, Iterator it) {
        this.f46537c = abstractC6549j;
        this.f46536b = abstractC6549j.f46539b;
        this.f46535a = it;
    }

    /* renamed from: a */
    public final void m47082a() {
        this.f46537c.zzb();
        if (this.f46537c.f46539b == this.f46536b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m47082a();
        return this.f46535a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m47082a();
        return this.f46535a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f46535a.remove();
        zzbu zzbuVar = this.f46537c.f46542e;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - 1;
        this.f46537c.m47080b();
    }

    public C6548i(AbstractC6549j abstractC6549j) {
        Iterator it;
        this.f46537c = abstractC6549j;
        Collection collection = abstractC6549j.f46539b;
        this.f46536b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f46535a = it;
    }
}
