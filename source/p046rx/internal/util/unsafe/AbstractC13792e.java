package p046rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.e */
/* loaded from: classes7.dex */
public abstract class AbstractC13792e extends ConcurrentCircularArrayQueue {

    /* renamed from: c */
    public static final Integer f79283c = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    protected final int lookAheadStep;

    public AbstractC13792e(int i) {
        super(i);
        this.lookAheadStep = Math.min(i / 4, f79283c.intValue());
    }
}
