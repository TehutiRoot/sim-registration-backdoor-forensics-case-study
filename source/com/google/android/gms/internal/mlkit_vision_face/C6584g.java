package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.g */
/* loaded from: classes3.dex */
public class C6584g implements Iterator {

    /* renamed from: a */
    public final Iterator f47073a;

    /* renamed from: b */
    public final Collection f47074b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6585h f47075c;

    public C6584g(AbstractC6585h abstractC6585h, Iterator it) {
        this.f47075c = abstractC6585h;
        this.f47074b = abstractC6585h.f47077b;
        this.f47073a = it;
    }

    /* renamed from: a */
    public final void m46798a() {
        this.f47075c.zzb();
        if (this.f47075c.f47077b == this.f47074b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m46798a();
        return this.f47073a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m46798a();
        return this.f47073a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f47073a.remove();
        zzap.zze(this.f47075c.f47080e);
        this.f47075c.m46796b();
    }

    public C6584g(AbstractC6585h abstractC6585h) {
        Iterator it;
        this.f47075c = abstractC6585h;
        Collection collection = abstractC6585h.f47077b;
        this.f47074b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f47073a = it;
    }
}
