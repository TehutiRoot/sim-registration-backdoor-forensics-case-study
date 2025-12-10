package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.g */
/* loaded from: classes7.dex */
public abstract class AbstractC13795g extends GL1 {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(AbstractC13795g.class, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public AbstractC13795g(int i) {
        super(i);
    }
}