package p000;

import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzms;
import java.util.ListIterator;

/* renamed from: iH2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20360iH2 implements ListIterator {

    /* renamed from: a */
    public final ListIterator f62764a;

    /* renamed from: b */
    public final /* synthetic */ int f62765b;

    /* renamed from: c */
    public final /* synthetic */ zzms f62766c;

    public C20360iH2(zzms zzmsVar, int i) {
        zzkt zzktVar;
        this.f62766c = zzmsVar;
        this.f62765b = i;
        zzktVar = zzmsVar.f46344a;
        this.f62764a = zzktVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f62764a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f62764a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f62764a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f62764a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f62764a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f62764a.previousIndex();
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
