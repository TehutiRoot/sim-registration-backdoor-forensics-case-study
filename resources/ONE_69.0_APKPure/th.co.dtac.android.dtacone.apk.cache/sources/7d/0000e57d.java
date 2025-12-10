package kotlinx.coroutines.flow;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__DelayKt {
    /* renamed from: a */
    public static final Flow m27329a(Flow flow, long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return flow;
            }
            return m27325e(flow, new FlowKt__DelayKt$debounce$2(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: b */
    public static final Flow m27328b(Flow flow, Function1 function1) {
        return m27325e(flow, function1);
    }

    /* renamed from: c */
    public static final Flow m27327c(Flow flow, long j) {
        return FlowKt.debounce(flow, DelayKt.m74843toDelayMillisLRDsOJo(j));
    }

    /* renamed from: d */
    public static final Flow m27326d(Flow flow, Function1 function1) {
        return m27325e(flow, new FlowKt__DelayKt$debounce$3(function1));
    }

    /* renamed from: e */
    public static final Flow m27325e(Flow flow, Function1 function1) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
    }

    /* renamed from: f */
    public static final ReceiveChannel m27324f(CoroutineScope coroutineScope, long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                return ProduceKt.produce$default(coroutineScope, null, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j2, j, null), 1, null);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    /* renamed from: g */
    public static /* synthetic */ ReceiveChannel m27323g(CoroutineScope coroutineScope, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return FlowKt.fixedPeriodTicker(coroutineScope, j, j2);
    }

    /* renamed from: h */
    public static final Flow m27322h(Flow flow, long j) {
        if (j > 0) {
            return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$sample$2(j, flow, null));
        }
        throw new IllegalArgumentException("Sample period should be positive".toString());
    }

    /* renamed from: i */
    public static final Flow m27321i(Flow flow, long j) {
        return FlowKt.sample(flow, DelayKt.m74843toDelayMillisLRDsOJo(j));
    }

    /* renamed from: j */
    public static final Flow m27320j(Flow flow, long j) {
        return m27319k(flow, j);
    }

    /* renamed from: k */
    public static final Flow m27319k(Flow flow, long j) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }
}