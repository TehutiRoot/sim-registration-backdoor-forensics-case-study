package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.d */
/* loaded from: classes7.dex */
public abstract class AbstractC13792d extends BL1 {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(AbstractC13792d.class, "producerIndex");
    private volatile long producerIndex;

    public AbstractC13792d(int i) {
        super(i);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }

    public final void soTail(long j) {
        UnsafeAccess.UNSAFE.putOrderedLong(this, P_INDEX_OFFSET, j);
    }
}