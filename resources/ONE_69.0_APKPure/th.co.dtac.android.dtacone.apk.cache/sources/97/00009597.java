package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.b */
/* loaded from: classes3.dex */
public final class C6530b extends AbstractC20139gj2 {

    /* renamed from: a */
    public final /* synthetic */ C6532d f46532a;

    public C6530b(C6532d c6532d) {
        this.f46532a = c6532d;
    }

    @Override // p000.AbstractC20139gj2
    /* renamed from: a */
    public final Map mo31339a() {
        return this.f46532a;
    }

    @Override // p000.AbstractC20139gj2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f46532a.f46536c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6531c(this.f46532a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzbu.zzr(this.f46532a.f46537d, entry.getKey());
        return true;
    }
}