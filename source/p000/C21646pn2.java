package p000;

import com.google.android.gms.internal.clearcut.zzcx;
import com.google.android.gms.internal.clearcut.zzfa;
import java.util.ListIterator;

/* renamed from: pn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21646pn2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f76765a;

    /* renamed from: b */
    public final /* synthetic */ int f76766b;

    /* renamed from: c */
    public final /* synthetic */ zzfa f76767c;

    public C21646pn2(zzfa zzfaVar, int i) {
        zzcx zzcxVar;
        this.f76767c = zzfaVar;
        this.f76766b = i;
        zzcxVar = zzfaVar.f45590a;
        this.f76765a = zzcxVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f76765a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f76765a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f76765a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f76765a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f76765a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f76765a.previousIndex();
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
