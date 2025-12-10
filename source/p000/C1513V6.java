package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: V6 */
/* loaded from: classes5.dex */
public final class C1513V6 implements Iterator, KMappedMarker {

    /* renamed from: a */
    public final Object[] f6551a;

    /* renamed from: b */
    public int f6552b;

    public C1513V6(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.f6551a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f6552b < this.f6551a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f6551a;
            int i = this.f6552b;
            this.f6552b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f6552b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
