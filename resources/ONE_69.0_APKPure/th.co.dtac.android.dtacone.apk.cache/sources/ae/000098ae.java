package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_face.a */
/* loaded from: classes3.dex */
public final class C6567a extends AbstractC18211Of2 {

    /* renamed from: a */
    public final /* synthetic */ C6569c f47075a;

    public C6567a(C6569c c6569c) {
        this.f47075a = c6569c;
    }

    @Override // p000.AbstractC18211Of2
    /* renamed from: a */
    public final Map mo46791a() {
        return this.f47075a;
    }

    @Override // p000.AbstractC18211Of2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f47075a.f47079c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6568b(this.f47075a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzap.zzm(this.f47075a.f47080d, entry.getKey());
        return true;
    }
}