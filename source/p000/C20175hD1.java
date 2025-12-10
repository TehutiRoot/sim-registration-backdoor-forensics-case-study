package p000;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: hD1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20175hD1 extends AbstractFlow {

    /* renamed from: a */
    public final Function2 f62442a;

    public C20175hD1(Function2 function2) {
        this.f62442a = function2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector flowCollector, Continuation continuation) {
        Object invoke = this.f62442a.invoke(flowCollector, continuation);
        if (invoke == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return invoke;
        }
        return Unit.INSTANCE;
    }
}
