package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* loaded from: classes6.dex */
public final class UndispatchedContextCollector implements FlowCollector {

    /* renamed from: a */
    public final CoroutineContext f70977a;

    /* renamed from: b */
    public final Object f70978b;

    /* renamed from: c */
    public final Function2 f70979c;

    public UndispatchedContextCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f70977a = coroutineContext;
        this.f70978b = ThreadContextKt.threadContextElements(coroutineContext);
        this.f70979c = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        Object withContextUndispatched = ChannelFlowKt.withContextUndispatched(this.f70977a, obj, this.f70978b, this.f70979c, continuation);
        if (withContextUndispatched == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return withContextUndispatched;
        }
        return Unit.INSTANCE;
    }
}
