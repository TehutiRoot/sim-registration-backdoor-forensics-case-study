package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.d */
/* loaded from: classes3.dex */
public final class C6588d implements Iterator {

    /* renamed from: a */
    public Map.Entry f47281a;

    /* renamed from: b */
    public final /* synthetic */ Iterator f47282b;

    /* renamed from: c */
    public final /* synthetic */ C6589e f47283c;

    public C6588d(C6589e c6589e, Iterator it) {
        this.f47282b = it;
        this.f47283c = c6589e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f47282b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f47282b.next();
        this.f47281a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f47281a != null) {
            z = true;
        } else {
            z = false;
        }
        zzx.zzd(z, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f47281a.getValue();
        this.f47282b.remove();
        zzal zzalVar = this.f47283c.f47284b;
        i = zzalVar.zzb;
        zzalVar.zzb = i - collection.size();
        collection.clear();
        this.f47281a = null;
    }
}