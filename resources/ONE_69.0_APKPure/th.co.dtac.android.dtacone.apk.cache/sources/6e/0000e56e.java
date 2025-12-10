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
    public static final Object m27342a(Flow flow, Continuation continuation) {
        Object collect = flow.collect(NopCollector.INSTANCE, continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public static final /* synthetic */ Object m27341b(Flow flow, Function2 function2, Continuation continuation) {
        Object collect = flow.collect(new FlowKt__CollectKt$collect$3(function2), continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c */
    public static final Object m27340c(Flow flow, Function3 function3, Continuation continuation) {
        Object collect = flow.collect(new FlowKt__CollectKt$collectIndexed$2(function3), continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: d */
    public static final Object m27339d(Flow flow, Function2 function2, Continuation continuation) {
        Flow m437d;
        m437d = AbstractC23138y30.m437d(FlowKt.mapLatest(flow, function2), 0, null, 2, null);
        Object collect = FlowKt.collect(m437d, continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: e */
    public static final Object m27338e(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        FlowKt.ensureActive(flowCollector);
        Object collect = flow.collect(flowCollector, continuation);
        if (collect == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f */
    public static final Job m27337f(Flow flow, CoroutineScope coroutineScope) {
        Job m65885e;
        m65885e = AbstractC1539Vc.m65885e(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return m65885e;
    }
}