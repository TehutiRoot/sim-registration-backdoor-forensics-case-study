package p000;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.CancellableFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.internal.FusibleFlow;

/* renamed from: gt1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C20168gt1 implements SharedFlow, CancellableFlow, FusibleFlow {

    /* renamed from: a */
    public final Job f62309a;

    /* renamed from: b */
    public final /* synthetic */ SharedFlow f62310b;

    public C20168gt1(SharedFlow sharedFlow, Job job) {
        this.f62309a = job;
        this.f62310b = sharedFlow;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f62310b.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List getReplayCache() {
        return this.f62310b.getReplayCache();
    }
}