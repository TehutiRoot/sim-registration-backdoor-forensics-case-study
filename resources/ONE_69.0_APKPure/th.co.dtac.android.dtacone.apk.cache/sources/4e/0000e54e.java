package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* loaded from: classes6.dex */
public final class DistinctFlowImpl implements Flow {

    /* renamed from: a */
    public final Flow f70792a;

    /* renamed from: b */
    public final Function1 f70793b;

    /* renamed from: c */
    public final Function2 f70794c;

    public DistinctFlowImpl(Flow flow, Function1 function1, Function2 function2) {
        this.f70792a = flow;
        this.f70793b = function1;
        this.f70794c = function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlinx.coroutines.internal.Symbol, T] */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = NullSurrogateKt.NULL;
        Object collect = this.f70792a.collect(new DistinctFlowImpl$collect$2(this, objectRef, flowCollector), continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}