package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;

/* loaded from: classes5.dex */
public final class RingBuffer extends AbstractList implements RandomAccess {

    /* renamed from: a */
    public final Object[] f68166a;

    /* renamed from: b */
    public final int f68167b;

    /* renamed from: c */
    public int f68168c;

    /* renamed from: d */
    public int f68169d;

    public RingBuffer(Object[] buffer, int i) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f68166a = buffer;
        if (i >= 0) {
            if (i <= buffer.length) {
                this.f68167b = buffer.length;
                this.f68169d = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: e */
    public final void m29112e(Object obj) {
        if (!m29110g()) {
            this.f68166a[(this.f68168c + size()) % this.f68167b] = obj;
            this.f68169d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* renamed from: f */
    public final RingBuffer m29111f(int i) {
        Object[] array;
        int i2 = this.f68167b;
        int coerceAtMost = AbstractC11695c.coerceAtMost(i2 + (i2 >> 1) + 1, i);
        if (this.f68168c == 0) {
            array = Arrays.copyOf(this.f68166a, coerceAtMost);
            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
        } else {
            array = toArray(new Object[coerceAtMost]);
        }
        return new RingBuffer(array, size());
    }

    /* renamed from: g */
    public final boolean m29110g() {
        if (size() == this.f68167b) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public Object get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return this.f68166a[(this.f68168c + i) % this.f68167b];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.f68169d;
    }

    /* renamed from: h */
    public final void m29109h(int i) {
        if (i >= 0) {
            if (i <= size()) {
                if (i > 0) {
                    int i2 = this.f68168c;
                    int i3 = (i2 + i) % this.f68167b;
                    if (i2 > i3) {
                        ArraysKt___ArraysJvmKt.fill(this.f68166a, (Object) null, i2, this.f68167b);
                        ArraysKt___ArraysJvmKt.fill(this.f68166a, (Object) null, 0, i3);
                    } else {
                        ArraysKt___ArraysJvmKt.fill(this.f68166a, (Object) null, i2, i3);
                    }
                    this.f68168c = i3;
                    this.f68169d = size() - i;
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
            public int f68170c;

            /* renamed from: d */
            public int f68171d;

            {
                int i;
                this.f68170c = RingBuffer.this.size();
                i = RingBuffer.this.f68168c;
                this.f68171d = i;
            }

            @Override // kotlin.collections.AbstractIterator
            public void computeNext() {
                Object[] objArr;
                if (this.f68170c != 0) {
                    objArr = RingBuffer.this.f68166a;
                    setNext(objArr[this.f68171d]);
                    this.f68171d = (this.f68171d + 1) % RingBuffer.this.f68167b;
                    this.f68170c--;
                    return;
                }
                done();
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
        for (int i3 = this.f68168c; i2 < size && i3 < this.f68167b; i3++) {
            array[i2] = this.f68166a[i3];
            i2++;
        }
        while (i2 < size) {
            array[i2] = this.f68166a[i];
            i2++;
            i++;
        }
        return AbstractC10100ds.terminateCollectionToArray(size, array);
    }

    public RingBuffer(int i) {
        this(new Object[i], 0);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}