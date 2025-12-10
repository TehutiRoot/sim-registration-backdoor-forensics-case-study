package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class FlowKt__ShareKt {
    /* renamed from: a */
    public static final SharedFlow m26938a(MutableSharedFlow mutableSharedFlow) {
        return new C20628js1(mutableSharedFlow, null);
    }

    /* renamed from: b */
    public static final StateFlow m26937b(MutableStateFlow mutableStateFlow) {
        return new C20800ks1(mutableStateFlow, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.SG1 m26936c(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = kotlin.ranges.AbstractC11719c.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.Flow r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3c
            SG1 r7 = new SG1
            int r3 = r1.capacity
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r5 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            kotlinx.coroutines.channels.BufferOverflow r8 = r1.onBufferOverflow
            kotlin.coroutines.CoroutineContext r1 = r1.context
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            SG1 r8 = new SG1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m26936c(kotlinx.coroutines.flow.Flow, int):SG1");
    }

    /* renamed from: d */
    public static final Job m26935d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, MutableSharedFlow mutableSharedFlow, SharingStarted sharingStarted, Object obj) {
        CoroutineStart coroutineStart;
        if (Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.getEagerly())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, obj, null));
    }

    /* renamed from: e */
    public static final void m26934e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, CompletableDeferred completableDeferred) {
        AbstractC1552Vc.m65753e(coroutineScope, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    /* renamed from: f */
    public static final SharedFlow m26933f(SharedFlow sharedFlow, Function2 function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }

    /* renamed from: g */
    public static final SharedFlow m26932g(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        SG1 m26936c = m26936c(flow, i);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i, m26936c.f5569b, m26936c.f5570c);
        return new C20628js1(MutableSharedFlow, m26935d(coroutineScope, m26936c.f5571d, m26936c.f5568a, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    /* renamed from: h */
    public static /* synthetic */ SharedFlow m26931h(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    /* renamed from: i */
    public static final Object m26930i(Flow flow, CoroutineScope coroutineScope, Continuation continuation) {
        SG1 m26936c = m26936c(flow, 1);
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        m26934e(coroutineScope, m26936c.f5571d, m26936c.f5568a, CompletableDeferred$default);
        return CompletableDeferred$default.await(continuation);
    }

    /* renamed from: j */
    public static final StateFlow m26929j(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        SG1 m26936c = m26936c(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(obj);
        return new C20800ks1(MutableStateFlow, m26935d(coroutineScope, m26936c.f5571d, m26936c.f5568a, MutableStateFlow, sharingStarted, obj));
    }
}
