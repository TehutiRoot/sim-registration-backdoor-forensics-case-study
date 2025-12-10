package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.f */
/* loaded from: classes3.dex */
public final class C6534f implements Iterator {

    /* renamed from: a */
    public Map.Entry f46543a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f46544b;

    /* renamed from: c */
    public final /* synthetic */ C6535g f46545c;

    public C6534f(C6535g c6535g, Iterator it) {
        this.f46545c = c6535g;
        this.f46544b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46544b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f46544b.next();
        this.f46543a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f46543a != null) {
            z = true;
        } else {
            z = false;
        }
        zzbc.zze(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f46543a.getValue();
        this.f46544b.remove();
        zzbu zzbuVar = this.f46545c.f46546b;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - collection.size();
        collection.clear();
        this.f46543a = null;
    }
}