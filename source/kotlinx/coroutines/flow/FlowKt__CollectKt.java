package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__CollectKt {
    /* renamed from: a */
    public static final Object m27050a(Flow flow, Continuation continuation) {
        Object collect = flow.collect(NopCollector.INSTANCE, continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m27049b(Flow flow, Function2 function2, Continuation continuation) {
        Object collect = flow.collect(new FlowKt__CollectKt$collect$3(function2), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final Object m27048c(Flow flow, Function3 function3, Continuation continuation) {
        Object collect = flow.collect(new FlowKt__CollectKt$collectIndexed$2(function3), continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public static final Object m27047d(Flow flow, Function2 function2, Continuation continuation) {
        Flow m1325d;
        m1325d = AbstractC22380u30.m1325d(FlowKt.mapLatest(flow, function2), 0, null, 2, null);
        Object collect = FlowKt.collect(m1325d, continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Object m27046e(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        FlowKt.ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, continuation);
        if (collect == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Job m27045f(Flow flow, CoroutineScope coroutineScope) {
        Job m65753e;
        m65753e = AbstractC1552Vc.m65753e(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return m65753e;
    }
}
