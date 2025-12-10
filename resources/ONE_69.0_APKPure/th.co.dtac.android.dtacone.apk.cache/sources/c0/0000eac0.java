package p000;

import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.ListIterator;

/* renamed from: mo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21192mo2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f72172a;

    /* renamed from: b */
    public final /* synthetic */ int f72173b;

    /* renamed from: c */
    public final /* synthetic */ zzfa f72174c;

    public C21192mo2(zzfa zzfaVar, int i) {
        zzcx zzcxVar;
        this.f72174c = zzfaVar;
        this.f72173b = i;
        zzcxVar = zzfaVar.f45602a;
        this.f72172a = zzcxVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f72172a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f72172a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f72172a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f72172a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f72172a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f72172a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}