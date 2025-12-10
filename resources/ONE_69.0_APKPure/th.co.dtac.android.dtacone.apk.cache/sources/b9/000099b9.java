package com.google.android.gms.internal.mlkit_vision_text_common;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.a */
/* loaded from: classes3.dex */
public final class C6585a extends AbstractC19087ag2 {

    /* renamed from: a */
    public final /* synthetic */ C6587c f47275a;

    public C6585a(C6587c c6587c) {
        this.f47275a = c6587c;
    }

    @Override // p000.AbstractC19087ag2
    /* renamed from: a */
    public final Map mo46716a() {
        return this.f47275a;
    }

    @Override // p000.AbstractC19087ag2, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f47275a.f47279c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C6586b(this.f47275a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C6587c c6587c = this.f47275a;
        zzal.zzk(c6587c.f47280d, entry.getKey());
        return true;
    }
}