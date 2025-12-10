package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__DistinctKt {

    /* renamed from: a */
    public static final Function1 f70786a = FlowKt__DistinctKt$defaultKeySelector$1.INSTANCE;

    /* renamed from: b */
    public static final Function2 f70787b = FlowKt__DistinctKt$defaultAreEquivalent$1.INSTANCE;

    /* renamed from: a */
    public static final Flow m27026a(Flow flow) {
        if (!(flow instanceof StateFlow)) {
            return m27023d(flow, f70786a, f70787b);
        }
        return flow;
    }

    /* renamed from: b */
    public static final Flow m27025b(Flow flow, Function2 function2) {
        Function1 function1 = f70786a;
        Intrinsics.checkNotNull(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return m27023d(flow, function1, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2));
    }

    /* renamed from: c */
    public static final Flow m27024c(Flow flow, Function1 function1) {
        return m27023d(flow, function1, f70787b);
    }

    /* renamed from: d */
    public static final Flow m27023d(Flow flow, Function1 function1, Function2 function2) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.f70759b == function1 && distinctFlowImpl.f70760c == function2) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, function1, function2);
    }
}
