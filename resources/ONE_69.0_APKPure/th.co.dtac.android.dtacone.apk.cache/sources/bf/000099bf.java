package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.g */
/* loaded from: classes3.dex */
public class C6591g implements Iterator {

    /* renamed from: a */
    public final Iterator f47285a;

    /* renamed from: b */
    public final Collection f47286b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6592h f47287c;

    public C6591g(AbstractC6592h abstractC6592h, Iterator it) {
        this.f47287c = abstractC6592h;
        this.f47286b = abstractC6592h.f47289b;
        this.f47285a = it;
    }

    /* renamed from: a */
    public final void m46714a() {
        this.f47287c.zzb();
        if (this.f47287c.f47289b == this.f47286b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m46714a();
        return this.f47285a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46714a();
        return this.f47285a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f47285a.remove();
        zzal zzalVar = this.f47287c.f47292e;
        i = zzalVar.zzb;
        zzalVar.zzb = i - 1;
        this.f47287c.m46712b();
    }

    public C6591g(AbstractC6592h abstractC6592h) {
        Iterator it;
        this.f47287c = abstractC6592h;
        Collection collection = abstractC6592h.f47289b;
        this.f47286b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f47285a = it;
    }
}