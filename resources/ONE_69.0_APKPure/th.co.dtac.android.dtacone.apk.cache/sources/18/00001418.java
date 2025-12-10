package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: V6 */
/* loaded from: classes5.dex */
public final class C1492V6 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final Object[] f6807a;

    /* renamed from: b */
    public int f6808b;

    public C1492V6(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f6807a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6808b < this.f6807a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f6807a;
            int i = this.f6808b;
            this.f6808b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6808b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}