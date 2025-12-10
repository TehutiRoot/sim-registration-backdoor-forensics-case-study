package p000;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p046rx.internal.util.unsafe.Pow2;

/* renamed from: i7 */
/* loaded from: classes7.dex */
public abstract class AbstractC10429i7 extends AbstractQueue {
    protected final AtomicReferenceArray<Object> buffer;
    protected final int mask;

    public AbstractC10429i7(int i) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(i);
        this.mask = roundToPowerOfTwo - 1;
        this.buffer = new AtomicReferenceArray<>(roundToPowerOfTwo);
    }

    public final int calcElementOffset(long j, int i) {
        return ((int) j) & i;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    public final Object lpElement(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public final void spElement(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public final void svElement(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.set(i, obj);
    }

    public final int calcElementOffset(long j) {
        return this.mask & ((int) j);
    }

    public final Object lpElement(int i) {
        return this.buffer.get(i);
    }

    public final Object lvElement(int i) {
        return lvElement(this.buffer, i);
    }

    public final void soElement(int i, Object obj) {
        this.buffer.lazySet(i, obj);
    }

    public final void spElement(int i, Object obj) {
        this.buffer.lazySet(i, obj);
    }
}