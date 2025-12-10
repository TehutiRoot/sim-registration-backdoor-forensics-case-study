package p000;

import com.google.android.gms.internal.firebase_ml.zzaaj;
import com.google.android.gms.internal.firebase_ml.zzyd;
import java.util.ListIterator;

/* renamed from: Ca2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17391Ca2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f772a;

    /* renamed from: b */
    public final /* synthetic */ int f773b;

    /* renamed from: c */
    public final /* synthetic */ zzaaj f774c;

    public C17391Ca2(zzaaj zzaajVar, int i) {
        zzyd zzydVar;
        this.f774c = zzaajVar;
        this.f773b = i;
        zzydVar = zzaajVar.f45747a;
        this.f772a = zzydVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f772a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f772a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f772a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f772a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f772a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f772a.previousIndex();
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
