package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.b */
/* loaded from: classes3.dex */
public final class C6597b implements Iterator {

    /* renamed from: a */
    public final Iterator f47264a;

    /* renamed from: b */
    public Collection f47265b;

    /* renamed from: c */
    public final /* synthetic */ C6598c f47266c;

    public C6597b(C6598c c6598c) {
        this.f47266c = c6598c;
        this.f47264a = c6598c.f47267c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47264a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f47264a.next();
        this.f47265b = (Collection) entry.getValue();
        Object key = entry.getKey();
        return new zzbg(key, this.f47266c.f47268d.zzb(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f47265b != null) {
            z = true;
        } else {
            z = false;
        }
        zzx.zzd(z, "no calls to next() since the last call to remove()");
        this.f47264a.remove();
        zzal zzalVar = this.f47266c.f47268d;
        i = zzalVar.zzb;
        zzalVar.zzb = i - this.f47265b.size();
        this.f47265b.clear();
        this.f47265b = null;
    }
}
