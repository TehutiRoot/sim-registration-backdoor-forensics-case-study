package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.a */
/* loaded from: classes3.dex */
public final class C6578a extends AbstractC18363Re2 {

    /* renamed from: a */
    public final /* synthetic */ C6580c f47063a;

    public C6578a(C6580c c6580c) {
        this.f47063a = c6580c;
    }

    @Override // p000.AbstractC18363Re2
    /* renamed from: a */
    public final Map mo46799a() {
        return this.f47063a;
    }

    @Override // p000.AbstractC18363Re2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f47063a.f47067c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6579b(this.f47063a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzap.zzm(this.f47063a.f47068d, entry.getKey());
        return true;
    }
}
