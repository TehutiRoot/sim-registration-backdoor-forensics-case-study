package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.a */
/* loaded from: classes3.dex */
public final class C6596a extends AbstractC19558df2 {

    /* renamed from: a */
    public final /* synthetic */ C6598c f47263a;

    public C6596a(C6598c c6598c) {
        this.f47263a = c6598c;
    }

    @Override // p000.AbstractC19558df2
    /* renamed from: a */
    public final Map mo31803a() {
        return this.f47263a;
    }

    @Override // p000.AbstractC19558df2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f47263a.f47267c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6597b(this.f47263a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C6598c c6598c = this.f47263a;
        zzal.zzk(c6598c.f47268d, entry.getKey());
        return true;
    }
}
