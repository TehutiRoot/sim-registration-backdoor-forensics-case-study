package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.a */
/* loaded from: classes7.dex */
public abstract class AbstractC13789a extends AbstractC18180Nt0 {

    /* renamed from: f */
    public static final long f79487f = UnsafeAccess.addressOf(AbstractC13789a.class, "consumerIndex");
    private volatile long consumerIndex;

    public AbstractC13789a(int i) {
        super(i);
    }

    public final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, f79487f, j, j2);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}