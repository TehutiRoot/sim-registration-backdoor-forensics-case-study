package p000;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import org.reactivestreams.Publisher;

/* renamed from: I */
/* loaded from: classes5.dex */
public abstract class AbstractC0558I extends Flowable implements HasUpstreamPublisher {
    protected final Flowable<Object> source;

    public AbstractC0558I(Flowable flowable) {
        this.source = (Flowable) ObjectHelper.requireNonNull(flowable, "source is null");
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public final Publisher<Object> source() {
        return this.source;
    }
}