package p046rx.internal.util.unsafe;

import p046rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

@SuppressAnimalSniffer
/* renamed from: rx.internal.util.unsafe.ConcurrentSequencedCircularArrayQueue */
/* loaded from: classes7.dex */
public abstract class ConcurrentSequencedCircularArrayQueue<E> extends ConcurrentCircularArrayQueue<E> {

    /* renamed from: c */
    public static final long f79478c;

    /* renamed from: d */
    public static final int f79479d;
    protected final long[] sequenceBuffer;

    static {
        Unsafe unsafe = UnsafeAccess.UNSAFE;
        if (8 == unsafe.arrayIndexScale(long[].class)) {
            int i = ConcurrentCircularArrayQueue.SPARSE_SHIFT;
            int i2 = i + 3;
            f79479d = i2;
            f79478c = unsafe.arrayBaseOffset(long[].class) + (32 << (i2 - i));
            return;
        }
        throw new IllegalStateException("Unexpected long[] element size");
    }

    public ConcurrentSequencedCircularArrayQueue(int i) {
        super(i);
        int i2 = (int) (this.mask + 1);
        this.sequenceBuffer = new long[(i2 << ConcurrentCircularArrayQueue.SPARSE_SHIFT) + 64];
        for (long j = 0; j < i2; j++) {
            soSequence(this.sequenceBuffer, calcSequenceOffset(j), j);
        }
    }

    public final long calcSequenceOffset(long j) {
        return f79478c + ((j & this.mask) << f79479d);
    }

    public final long lvSequence(long[] jArr, long j) {
        return UnsafeAccess.UNSAFE.getLongVolatile(jArr, j);
    }

    public final void soSequence(long[] jArr, long j, long j2) {
        UnsafeAccess.UNSAFE.putOrderedLong(jArr, j, j2);
    }
}