package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.b */
/* loaded from: classes7.dex */
public abstract class AbstractC13790b extends AbstractC18115Mt0 {

    /* renamed from: e */
    public static final long f79488e = UnsafeAccess.addressOf(AbstractC13790b.class, "producerIndex");
    private volatile long producerIndex;

    public AbstractC13790b(int i) {
        super(i);
    }

    public final boolean casProducerIndex(long j, long j2) {
        return UnsafeAccess.UNSAFE.compareAndSwapLong(this, f79488e, j, j2);
    }

    public final long lvProducerIndex() {
        return this.producerIndex;
    }
}