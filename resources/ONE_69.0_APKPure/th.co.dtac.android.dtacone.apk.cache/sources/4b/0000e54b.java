package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class CancellableFlowImpl implements CancellableFlow {

    /* renamed from: a */
    public final Flow f70790a;

    public CancellableFlowImpl(Flow flow) {
        this.f70790a = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object collect = this.f70790a.collect(new CancellableFlowImpl$collect$2(flowCollector), continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}