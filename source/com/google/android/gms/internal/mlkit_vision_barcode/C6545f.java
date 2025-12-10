package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.f */
/* loaded from: classes3.dex */
public final class C6545f implements Iterator {

    /* renamed from: a */
    public Map.Entry f46531a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f46532b;

    /* renamed from: c */
    public final /* synthetic */ C6546g f46533c;

    public C6545f(C6546g c6546g, Iterator it) {
        this.f46533c = c6546g;
        this.f46532b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46532b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f46532b.next();
        this.f46531a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f46531a != null) {
            z = true;
        } else {
            z = false;
        }
        zzbc.zze(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f46531a.getValue();
        this.f46532b.remove();
        zzbu zzbuVar = this.f46533c.f46534b;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - collection.size();
        collection.clear();
        this.f46531a = null;
    }
}
