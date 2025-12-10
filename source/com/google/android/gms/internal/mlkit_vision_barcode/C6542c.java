package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.c */
/* loaded from: classes3.dex */
public final class C6542c implements Iterator {

    /* renamed from: a */
    public final Iterator f46521a;

    /* renamed from: b */
    public Collection f46522b;

    /* renamed from: c */
    public final /* synthetic */ C6543d f46523c;

    public C6542c(C6543d c6543d) {
        this.f46523c = c6543d;
        this.f46521a = c6543d.f46524c.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46521a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f46521a.next();
        this.f46522b = (Collection) entry.getValue();
        C6543d c6543d = this.f46523c;
        Object key = entry.getKey();
        return new zzcr(key, c6543d.f46525d.zzd(key, (Collection) entry.getValue()));
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        int i;
        if (this.f46522b != null) {
            z = true;
        } else {
            z = false;
        }
        zzbc.zze(z, "no calls to next() since the last call to remove()");
        this.f46521a.remove();
        zzbu zzbuVar = this.f46523c.f46525d;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - this.f46522b.size();
        this.f46522b.clear();
        this.f46522b = null;
    }
}
