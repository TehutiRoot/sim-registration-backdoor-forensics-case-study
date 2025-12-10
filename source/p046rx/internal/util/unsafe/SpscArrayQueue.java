package p046rx.internal.util.unsafe;

import p046rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.SpscArrayQueue */
/* loaded from: classes7.dex */
public final class SpscArrayQueue<E> extends LK1 {
    public SpscArrayQueue(int i) {
        super(i);
    }

    private long lvConsumerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, AbstractC13793f.C_INDEX_OFFSET);
    }

    private long lvProducerIndex() {
        return UnsafeAccess.UNSAFE.getLongVolatile(this, AbstractC13794g.P_INDEX_OFFSET);
    }

    /* renamed from: a */
    public final void m22828a(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, AbstractC13793f.C_INDEX_OFFSET, j);
    }

    /* renamed from: b */
    public final void m22827b(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, AbstractC13794g.P_INDEX_OFFSET, j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p046rx.internal.util.unsafe.MessagePassingQueue
    public boolean isEmpty() {
        if (lvProducerIndex() == lvConsumerIndex()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue, p046rx.internal.util.unsafe.MessagePassingQueue
    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = this.buffer;
            long j = this.producerIndex;
            long calcElementOffset = calcElementOffset(j);
            if (lvElement(eArr, calcElementOffset) != null) {
                return false;
            }
            soElement(eArr, calcElementOffset, e);
            m22827b(j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // java.util.Queue, p046rx.internal.util.unsafe.MessagePassingQueue
    public E peek() {
        return lvElement(calcElementOffset(this.consumerIndex));
    }

    @Override // java.util.Queue, p046rx.internal.util.unsafe.MessagePassingQueue
    public E poll() {
        long j = this.consumerIndex;
        long calcElementOffset = calcElementOffset(j);
        E[] eArr = this.buffer;
        E lvElement = lvElement(eArr, calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soElement(eArr, calcElementOffset, null);
        m22828a(j + 1);
        return lvElement;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, p046rx.internal.util.unsafe.MessagePassingQueue
    public int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }
}
