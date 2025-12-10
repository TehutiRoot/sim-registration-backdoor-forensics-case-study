package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class CancellableFlowImpl implements CancellableFlow {

    /* renamed from: a */
    public final Flow f70756a;

    public CancellableFlowImpl(Flow flow) {
        this.f70756a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f70756a.collect(new CancellableFlowImpl$collect$2(flowCollector), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
