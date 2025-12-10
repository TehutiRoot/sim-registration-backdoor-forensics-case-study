package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.b */
/* loaded from: classes3.dex */
public final class C6579b implements Iterator {

    /* renamed from: a */
    public final Iterator f47064a;

    /* renamed from: b */
    public Collection f47065b;

    /* renamed from: c */
    public final /* synthetic */ C6580c f47066c;

    public C6579b(C6580c c6580c) {
        this.f47066c = c6580c;
        this.f47064a = c6580c.f47067c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47064a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f47064a.next();
        this.f47065b = (Collection) entry.getValue();
        C6580c c6580c = this.f47066c;
        Object key = entry.getKey();
        return new zzbj(key, c6580c.f47068d.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        if (this.f47065b != null) {
            z = true;
        } else {
            z = false;
        }
        zzab.zzd(z, "no calls to next() since the last call to remove()");
        this.f47064a.remove();
        zzap.zzg(this.f47066c.f47068d, this.f47065b.size());
        this.f47065b.clear();
        this.f47065b = null;
    }
}
