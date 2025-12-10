package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.b */
/* loaded from: classes7.dex */
public abstract class AbstractC13789b extends AbstractC17695Gt0 {

    /* renamed from: e */
    public static final long f79282e = UnsafeAccess.addressOf(AbstractC13789b.class, "producerIndex");
    private volatile long producerIndex;

    public AbstractC13789b(int i) {
        super(i);
    }

    public final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, f79282e, j, j2);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}
