package p000;

import com.google.android.gms.internal.vision.zzjv;
import com.google.android.gms.internal.vision.zzlz;
import java.util.ListIterator;

/* renamed from: MF2 */
/* loaded from: classes3.dex */
public final class MF2 implements ListIterator {

    /* renamed from: a */
    public ListIterator f3720a;

    /* renamed from: b */
    public final /* synthetic */ int f3721b;

    /* renamed from: c */
    public final /* synthetic */ zzlz f3722c;

    public MF2(zzlz zzlzVar, int i) {
        zzjv zzjvVar;
        this.f3722c = zzlzVar;
        this.f3721b = i;
        zzjvVar = zzlzVar.f47663a;
        this.f3720a = zzjvVar.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3720a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3720a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return (String) this.f3720a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3720a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ Object previous() {
        return (String) this.f3720a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3720a.previousIndex();
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
