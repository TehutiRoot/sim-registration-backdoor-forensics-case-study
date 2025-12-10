package p000;

import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.ListIterator;

/* renamed from: JG2 */
/* loaded from: classes3.dex */
public final class JG2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f2959a;

    /* renamed from: b */
    public final /* synthetic */ int f2960b;

    /* renamed from: c */
    public final /* synthetic */ zzlz f2961c;

    public JG2(zzlz zzlzVar, int i) {
        zzjv zzjvVar;
        this.f2961c = zzlzVar;
        this.f2960b = i;
        zzjvVar = zzlzVar.f47675a;
        this.f2959a = zzjvVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f2959a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f2959a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f2959a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f2959a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f2959a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f2959a.previousIndex();
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