package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6544e implements Iterator {

    /* renamed from: a */
    public final Iterator f46526a;

    /* renamed from: b */
    public Object f46527b;

    /* renamed from: c */
    public Collection f46528c;

    /* renamed from: d */
    public Iterator f46529d;

    /* renamed from: e */
    public final /* synthetic */ zzbu f46530e;

    public AbstractC6544e(zzbu zzbuVar) {
        Map map;
        this.f46530e = zzbuVar;
        map = zzbuVar.zza;
        this.f46526a = map.entrySet().iterator();
        this.f46527b = null;
        this.f46528c = null;
        this.f46529d = zzcz.INSTANCE;
    }

    /* renamed from: a */
    public abstract Object mo47083a(Object obj, Object obj2);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f46526a.hasNext() && !this.f46529d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f46529d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f46526a.next();
            this.f46527b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f46528c = collection;
            this.f46529d = collection.iterator();
        }
        return mo47083a(this.f46527b, this.f46529d.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        this.f46529d.remove();
        Collection collection = this.f46528c;
        collection.getClass();
        if (collection.isEmpty()) {
            this.f46526a.remove();
        }
        zzbu zzbuVar = this.f46530e;
        i = zzbuVar.zzb;
        zzbuVar.zzb = i - 1;
    }
}
