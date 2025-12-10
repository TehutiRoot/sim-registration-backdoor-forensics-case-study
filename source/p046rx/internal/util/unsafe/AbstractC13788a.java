package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.a */
/* loaded from: classes7.dex */
public abstract class AbstractC13788a extends AbstractC17759Ht0 {

    /* renamed from: f */
    public static final long f79281f = UnsafeAccess.addressOf(AbstractC13788a.class, "consumerIndex");
    private volatile long consumerIndex;

    public AbstractC13788a(int i) {
        super(i);
    }

    public final boolean casConsumerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, f79281f, j, j2);
    }

    public final long lvConsumerIndex() {
        return this.consumerIndex;
    }
}
