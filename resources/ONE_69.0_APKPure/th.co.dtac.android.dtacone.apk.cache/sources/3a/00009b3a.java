package com.google.android.gms.internal.vision;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.vision.g */
/* loaded from: classes3.dex */
public final class C6619g extends AbstractCollection {

    /* renamed from: a */
    public final /* synthetic */ zzdp f47528a;

    public C6619g(zzdp zzdpVar) {
        this.f47528a = zzdpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f47528a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f47528a.zzg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f47528a.size();
    }
}