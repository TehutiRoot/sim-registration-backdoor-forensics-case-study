package p000;

import com.google.android.gms.internal.firebase_ml.zzaaj;
import com.google.android.gms.internal.firebase_ml.zzyd;
import java.util.ListIterator;

/* renamed from: zb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C23402zb2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f109428a;

    /* renamed from: b */
    public final /* synthetic */ int f109429b;

    /* renamed from: c */
    public final /* synthetic */ zzaaj f109430c;

    public C23402zb2(zzaaj zzaajVar, int i) {
        zzyd zzydVar;
        this.f109430c = zzaajVar;
        this.f109429b = i;
        zzydVar = zzaajVar.f45759a;
        this.f109428a = zzydVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f109428a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f109428a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f109428a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f109428a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f109428a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f109428a.previousIndex();
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