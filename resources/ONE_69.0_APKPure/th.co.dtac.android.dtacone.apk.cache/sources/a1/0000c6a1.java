package p000;

import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzms;
import java.util.ListIterator;

/* renamed from: fI2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19898fI2 implements ListIterator {

    /* renamed from: a */
    public final ListIterator f61832a;

    /* renamed from: b */
    public final /* synthetic */ int f61833b;

    /* renamed from: c */
    public final /* synthetic */ zzms f61834c;

    public C19898fI2(zzms zzmsVar, int i) {
        zzkt zzktVar;
        this.f61834c = zzmsVar;
        this.f61833b = i;
        zzktVar = zzmsVar.f46356a;
        this.f61832a = zzktVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f61832a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f61832a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f61832a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f61832a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f61832a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f61832a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}