package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes5.dex */
public final class RingBuffer extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public final Object[] f68132a;

    /* renamed from: b */
    public final int f68133b;

    /* renamed from: c */
    public int f68134c;

    /* renamed from: d */
    public int f68135d;

    public RingBuffer(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f68132a = buffer;
        if (i >= 0) {
            if (i <= buffer.length) {
                this.f68133b = buffer.length;
                this.f68135d = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: a */
    public static final /* synthetic */ Object[] m28823a(RingBuffer ringBuffer) {
        return ringBuffer.f68132a;
    }

    /* renamed from: b */
    public static final /* synthetic */ int m28822b(RingBuffer ringBuffer) {
        return ringBuffer.f68133b;
    }

    /* renamed from: c */
    public static final /* synthetic */ int m28821c(RingBuffer ringBuffer) {
        return ringBuffer.f68134c;
    }

    /* renamed from: e */
    public final void m28820e(Object obj) {
        if (!m28818g()) {
            this.f68132a[(this.f68134c + size()) % this.f68133b] = obj;
            this.f68135d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: f */
    public final RingBuffer m28819f(int i) {
        Object[] array;
        int i2 = this.f68133b;
        int coerceAtMost = AbstractC11719c.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        if (this.f68134c == 0) {
            array = Arrays.copyOf(this.f68132a, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer(array, size());
    }

    /* renamed from: g */
    public final boolean m28818g() {
        if (size() == this.f68133b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return this.f68132a[(this.f68134c + i) % this.f68133b];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f68135d;
    }

    /* renamed from: h */
    public final void m28817h(int i) {
        if (i >= 0) {
            if (i <= size()) {
                if (i > 0) {
                    int i2 = this.f68134c;
                    int i3 = (i2 + i) % this.f68133b;
                    if (i2 > i3) {
                        ArraysKt___ArraysJvmKt.fill(this.f68132a, (Object) null, i2, this.f68133b);
                        ArraysKt___ArraysJvmKt.fill(this.f68132a, (Object) null, 0, i3);
                    } else {
                        ArraysKt___ArraysJvmKt.fill(this.f68132a, (Object) null, i2, i3);
                    }
                    this.f68134c = i3;
                    this.f68135d = size() - i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new AbstractIterator<Object>() { // from class: kotlin.collections.RingBuffer$iterator$1

            /* renamed from: c */
            public int f68136c;

            /* renamed from: d */
            public int f68137d;

            {
                this.f68136c = RingBuffer.this.size();
                this.f68137d = RingBuffer.m28821c(RingBuffer.this);
            }

            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                if (this.f68136c == 0) {
                    done();
                    return;
                }
                setNext(RingBuffer.m28823a(RingBuffer.this)[this.f68137d]);
                this.f68137d = (this.f68137d + 1) % RingBuffer.m28822b(RingBuffer.this);
                this.f68136c--;
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (array.length < size()) {
            array = Arrays.copyOf(array, size());
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f68134c; i2 < size && i3 < this.f68133b; i3++) {
            array[i2] = this.f68132a[i3];
            i2++;
        }
        while (i2 < size) {
            array[i2] = this.f68132a[i];
            i2++;
            i++;
        }
        return AbstractC10108ds.terminateCollectionToArray(size, array);
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
