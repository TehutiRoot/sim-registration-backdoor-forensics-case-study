package p000;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* renamed from: ks1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20800ks1 implements StateFlow, CancellableFlow, FusibleFlow {

    /* renamed from: a */
    public final Job f71468a;

    /* renamed from: b */
    public final /* synthetic */ StateFlow f71469b;

    public C20800ks1(StateFlow stateFlow, Job job) {
        this.f71468a = job;
        this.f71469b = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f71469b.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List getReplayCache() {
        return this.f71469b.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        return this.f71469b.getValue();
    }
}
