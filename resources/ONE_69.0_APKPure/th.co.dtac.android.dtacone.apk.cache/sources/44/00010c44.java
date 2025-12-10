package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.c */
/* loaded from: classes7.dex */
public abstract class AbstractC13791c extends CL1 {
    protected static final long C_INDEX_OFFSET = UnsafeAccess.addressOf(AbstractC13791c.class, "consumerIndex");
    private volatile long consumerIndex;

    public AbstractC13791c(int i) {
        super(i);
    }

    public final boolean casHead(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, C_INDEX_OFFSET, j, j2);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}