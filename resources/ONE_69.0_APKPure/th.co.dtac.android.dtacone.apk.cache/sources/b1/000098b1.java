package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.d */
/* loaded from: classes3.dex */
public final class C6570d implements Iterator {

    /* renamed from: a */
    public Map.Entry f47081a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f47082b;

    /* renamed from: c */
    public final /* synthetic */ C6571e f47083c;

    public C6570d(C6571e c6571e, Iterator it) {
        this.f47083c = c6571e;
        this.f47082b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47082b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f47082b.next();
        this.f47081a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f47081a != null) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f47081a.getValue();
        this.f47082b.remove();
        zzap.zzg(this.f47083c.f47084b, collection.size());
        collection.clear();
        this.f47081a = null;
    }
}