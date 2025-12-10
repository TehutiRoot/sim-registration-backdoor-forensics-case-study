package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.g */
/* loaded from: classes3.dex */
public class C6573g implements Iterator {

    /* renamed from: a */
    public final Iterator f47085a;

    /* renamed from: b */
    public final Collection f47086b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6574h f47087c;

    public C6573g(AbstractC6574h abstractC6574h, Iterator it) {
        this.f47087c = abstractC6574h;
        this.f47086b = abstractC6574h.f47089b;
        this.f47085a = it;
    }

    /* renamed from: a */
    public final void m46790a() {
        this.f47087c.zzb();
        if (this.f47087c.f47089b == this.f47086b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m46790a();
        return this.f47085a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46790a();
        return this.f47085a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f47085a.remove();
        zzap.zze(this.f47087c.f47092e);
        this.f47087c.m46788b();
    }

    public C6573g(AbstractC6574h abstractC6574h) {
        Iterator it;
        this.f47087c = abstractC6574h;
        Collection collection = abstractC6574h.f47089b;
        this.f47086b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f47085a = it;
    }
}