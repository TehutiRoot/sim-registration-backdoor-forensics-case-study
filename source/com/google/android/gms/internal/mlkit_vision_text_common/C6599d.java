package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.d */
/* loaded from: classes3.dex */
public final class C6599d implements Iterator {

    /* renamed from: a */
    public Map.Entry f47269a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f47270b;

    /* renamed from: c */
    public final /* synthetic */ C6600e f47271c;

    public C6599d(C6600e c6600e, Iterator it) {
        this.f47270b = it;
        this.f47271c = c6600e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47270b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f47270b.next();
        this.f47269a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f47269a != null) {
            z = true;
        } else {
            z = false;
        }
        zzx.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f47269a.getValue();
        this.f47270b.remove();
        zzal zzalVar = this.f47271c.f47272b;
        i = zzalVar.zzb;
        zzalVar.zzb = i - collection.size();
        collection.clear();
        this.f47269a = null;
    }
}
