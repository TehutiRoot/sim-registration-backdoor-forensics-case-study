package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.g */
/* loaded from: classes7.dex */
public abstract class AbstractC13794g extends JK1 {
    protected static final long P_INDEX_OFFSET = UnsafeAccess.addressOf(AbstractC13794g.class, "producerIndex");
    protected long producerIndex;
    protected long producerLookAhead;

    public AbstractC13794g(int i) {
        super(i);
    }
}
