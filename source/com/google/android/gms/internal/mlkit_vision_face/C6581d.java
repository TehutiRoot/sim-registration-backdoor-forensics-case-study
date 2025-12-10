package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.d */
/* loaded from: classes3.dex */
public final class C6581d implements Iterator {

    /* renamed from: a */
    public Map.Entry f47069a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f47070b;

    /* renamed from: c */
    public final /* synthetic */ C6582e f47071c;

    public C6581d(C6582e c6582e, Iterator it) {
        this.f47071c = c6582e;
        this.f47070b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47070b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f47070b.next();
        this.f47069a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f47069a != null) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f47069a.getValue();
        this.f47070b.remove();
        zzap.zzg(this.f47071c.f47072b, collection.size());
        collection.clear();
        this.f47069a = null;
    }
}
