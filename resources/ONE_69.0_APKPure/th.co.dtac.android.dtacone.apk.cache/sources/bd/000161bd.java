package p000;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.CancellableFlowImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* renamed from: y30 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC23138y30 {
    /* renamed from: a */
    public static final /* synthetic */ Flow m440a(Flow flow, int i) {
        Flow m437d;
        m437d = m437d(flow, i, null, 2, null);
        return m437d;
    }

    /* renamed from: b */
    public static final Flow m439b(Flow flow, int i, BufferOverflow bufferOverflow) {
        int i2;
        BufferOverflow bufferOverflow2;
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        } else if (i == -1 && bufferOverflow != BufferOverflow.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else {
            if (i == -1) {
                bufferOverflow2 = BufferOverflow.DROP_OLDEST;
                i2 = 0;
            } else {
                i2 = i;
                bufferOverflow2 = bufferOverflow;
            }
            if (flow instanceof FusibleFlow) {
                return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, null, i2, bufferOverflow2, 1, null);
            }
            return new ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2, null);
        }
    }

    /* renamed from: c */
    public static /* synthetic */ Flow m438c(Flow flow, int i, int i2, Object obj) {
        Flow m440a;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        m440a = m440a(flow, i);
        return m440a;
    }

    /* renamed from: d */
    public static /* synthetic */ Flow m437d(Flow flow, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i, bufferOverflow);
    }

    /* renamed from: e */
    public static final Flow m436e(Flow flow) {
        if (!(flow instanceof CancellableFlow)) {
            return new CancellableFlowImpl(flow);
        }
        return flow;
    }

    /* renamed from: f */
    public static final void m435f(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* renamed from: g */
    public static final Flow m434g(Flow flow) {
        Flow m437d;
        m437d = m437d(flow, -1, null, 2, null);
        return m437d;
    }

    /* renamed from: h */
    public static final Flow m433h(Flow flow, CoroutineContext coroutineContext) {
        m435f(coroutineContext);
        if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            if (flow instanceof FusibleFlow) {
                return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, coroutineContext, 0, null, 6, null);
            }
            return new ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
        }
        return flow;
    }
}