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

/* renamed from: u30 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC22380u30 {
    /* renamed from: a */
    public static final /* synthetic */ Flow m1328a(Flow flow, int i) {
        Flow m1325d;
        m1325d = m1325d(flow, i, null, 2, null);
        return m1325d;
    }

    /* renamed from: b */
    public static final Flow m1327b(Flow flow, int i, BufferOverflow bufferOverflow) {
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
    public static /* synthetic */ Flow m1326c(Flow flow, int i, int i2, Object obj) {
        Flow m1328a;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        m1328a = m1328a(flow, i);
        return m1328a;
    }

    /* renamed from: d */
    public static /* synthetic */ Flow m1325d(Flow flow, int i, BufferOverflow bufferOverflow, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return FlowKt.buffer(flow, i, bufferOverflow);
    }

    /* renamed from: e */
    public static final Flow m1324e(Flow flow) {
        if (!(flow instanceof CancellableFlow)) {
            return new CancellableFlowImpl(flow);
        }
        return flow;
    }

    /* renamed from: f */
    public static final void m1323f(CoroutineContext coroutineContext) {
        if (coroutineContext.get(Job.Key) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* renamed from: g */
    public static final Flow m1322g(Flow flow) {
        Flow m1325d;
        m1325d = m1325d(flow, -1, null, 2, null);
        return m1325d;
    }

    /* renamed from: h */
    public static final Flow m1321h(Flow flow, CoroutineContext coroutineContext) {
        m1323f(coroutineContext);
        if (!Intrinsics.areEqual(coroutineContext, EmptyCoroutineContext.INSTANCE)) {
            if (flow instanceof FusibleFlow) {
                return FusibleFlow.DefaultImpls.fuse$default((FusibleFlow) flow, coroutineContext, 0, null, 6, null);
            }
            return new ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
        }
        return flow;
    }
}
