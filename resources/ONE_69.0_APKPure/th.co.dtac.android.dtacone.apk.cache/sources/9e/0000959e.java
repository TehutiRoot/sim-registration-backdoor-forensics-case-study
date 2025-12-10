package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.i */
/* loaded from: classes3.dex */
public class C6537i implements Iterator {

    /* renamed from: a */
    public final Iterator f46547a;

    /* renamed from: b */
    public final Collection f46548b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC6538j f46549c;

    public C6537i(AbstractC6538j abstractC6538j, Iterator it) {
        this.f46549c = abstractC6538j;
        this.f46548b = abstractC6538j.f46551b;
        this.f46547a = it;
    }

    /* renamed from: a */
    public final void m47091a() {
        this.f46549c.zzb();
        if (this.f46549c.f46551b == this.f46548b) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        m47091a();
        return this.f46547a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        m47091a();
        return this.f46547a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f46547a.remove();
        zzbu zzbuVar = this.f46549c.f46554e;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - 1;
        this.f46549c.m47089b();
    }

    public C6537i(AbstractC6538j abstractC6538j) {
        Iterator it;
        this.f46549c = abstractC6538j;
        Collection collection = abstractC6538j.f46551b;
        this.f46548b = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f46547a = it;
    }
}