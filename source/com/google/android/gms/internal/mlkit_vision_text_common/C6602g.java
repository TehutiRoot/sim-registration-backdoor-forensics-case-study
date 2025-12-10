package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.g */
/* loaded from: classes3.dex */
public class C6602g implements Iterator {

    /* renamed from: a */
    public final Iterator f47273a;

    /* renamed from: b */
    public final Collection f47274b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6603h f47275c;

    public C6602g(AbstractC6603h abstractC6603h, Iterator it) {
        this.f47275c = abstractC6603h;
        this.f47274b = abstractC6603h.f47277b;
        this.f47273a = it;
    }

    /* renamed from: a */
    public final void m46723a() {
        this.f47275c.zzb();
        if (this.f47275c.f47277b == this.f47274b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m46723a();
        return this.f47273a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46723a();
        return this.f47273a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f47273a.remove();
        zzal zzalVar = this.f47275c.f47280e;
        i = zzalVar.zzb;
        zzalVar.zzb = i - 1;
        this.f47275c.m46721b();
    }

    public C6602g(AbstractC6603h abstractC6603h) {
        Iterator it;
        this.f47275c = abstractC6603h;
        Collection collection = abstractC6603h.f47277b;
        this.f47274b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f47273a = it;
    }
}
