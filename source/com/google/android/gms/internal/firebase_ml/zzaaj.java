package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzaaj extends AbstractList<String> implements zzyd, RandomAccess {

    /* renamed from: a */
    public final zzyd f45747a;

    public zzaaj(zzyd zzydVar) {
        this.f45747a = zzydVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.f45747a.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final Object getRaw(int i) {
        return this.f45747a.getRaw(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new C17519Ea2(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new C17391Ca2(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45747a.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final void zze(zzwd zzwdVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final List<?> zzvz() {
        return this.f45747a.zzvz();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyd
    public final zzyd zzwa() {
        return this;
    }
}
