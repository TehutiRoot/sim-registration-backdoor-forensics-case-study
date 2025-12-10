package p000;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: eE1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C19712eE1 extends AbstractFlow {

    /* renamed from: a */
    public final Function2 f61510a;

    public C19712eE1(Function2 function2) {
        this.f61510a = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector flowCollector, Continuation continuation) {
        Object invoke = this.f61510a.invoke(flowCollector, continuation);
        if (invoke == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return invoke;
        }
        return Unit.INSTANCE;
    }
}