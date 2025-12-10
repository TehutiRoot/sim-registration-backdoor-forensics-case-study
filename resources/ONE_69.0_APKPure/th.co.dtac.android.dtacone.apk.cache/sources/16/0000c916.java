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

/* renamed from: ht1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20341ht1 implements StateFlow, CancellableFlow, FusibleFlow {

    /* renamed from: a */
    public final Job f62678a;

    /* renamed from: b */
    public final /* synthetic */ StateFlow f62679b;

    public C20341ht1(StateFlow stateFlow, Job job) {
        this.f62678a = job;
        this.f62679b = stateFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f62679b.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List getReplayCache() {
        return this.f62679b.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        return this.f62679b.getValue();
    }
}