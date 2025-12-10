package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.b */
/* loaded from: classes3.dex */
public final class C6541b extends AbstractC20599ji2 {

    /* renamed from: a */
    public final /* synthetic */ C6543d f46520a;

    public C6541b(C6543d c6543d) {
        this.f46520a = c6543d;
    }

    @Override // p000.AbstractC20599ji2
    /* renamed from: a */
    public final Map mo29147a() {
        return this.f46520a;
    }

    @Override // p000.AbstractC20599ji2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f46520a.f46524c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6542c(this.f46520a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzbu.zzr(this.f46520a.f46525d, entry.getKey());
        return true;
    }
}
