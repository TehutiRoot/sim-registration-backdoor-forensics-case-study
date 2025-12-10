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
    public static final SharedFlow m27230a(MutableSharedFlow mutableSharedFlow) {
        return new C20168gt1(mutableSharedFlow, null);
    }

    /* renamed from: b */
    public static final StateFlow m27229b(MutableStateFlow mutableStateFlow) {
        return new C20341ht1(mutableStateFlow, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p000.PH1 m27228c(kotlinx.coroutines.flow.Flow r7, int r8) {
        /*
            kotlinx.coroutines.channels.Channel$Factory r0 = kotlinx.coroutines.channels.Channel.Factory
            int r0 = r0.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core()
            int r0 = kotlin.ranges.AbstractC11695c.coerceAtLeast(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof kotlinx.coroutines.flow.internal.ChannelFlow
            if (r1 == 0) goto L3c
            r1 = r7
            kotlinx.coroutines.flow.internal.ChannelFlow r1 = (kotlinx.coroutines.flow.internal.ChannelFlow) r1
            kotlinx.coroutines.flow.Flow r2 = r1.dropChannelOperators()
            if (r2 == 0) goto L3c
            PH1 r7 = new PH1
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
            PH1 r8 = new PH1
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt.m27228c(kotlinx.coroutines.flow.Flow, int):PH1");
    }

    /* renamed from: d */
    public static final Job m27227d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, MutableSharedFlow mutableSharedFlow, SharingStarted sharingStarted, Object obj) {
        CoroutineStart coroutineStart;
        if (Intrinsics.areEqual(sharingStarted, SharingStarted.Companion.getEagerly())) {
            coroutineStart = CoroutineStart.DEFAULT;
        } else {
            coroutineStart = CoroutineStart.UNDISPATCHED;
        }
        return BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, new FlowKt__ShareKt$launchSharing$1(sharingStarted, flow, mutableSharedFlow, obj, null));
    }

    /* renamed from: e */
    public static final void m27226e(CoroutineScope coroutineScope, CoroutineContext coroutineContext, Flow flow, CompletableDeferred completableDeferred) {
        AbstractC1539Vc.m65885e(coroutineScope, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(flow, completableDeferred, null), 2, null);
    }

    /* renamed from: f */
    public static final SharedFlow m27225f(SharedFlow sharedFlow, Function2 function2) {
        return new SubscribedSharedFlow(sharedFlow, function2);
    }

    /* renamed from: g */
    public static final SharedFlow m27224g(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i) {
        PH1 m27228c = m27228c(flow, i);
        MutableSharedFlow MutableSharedFlow = SharedFlowKt.MutableSharedFlow(i, m27228c.f4747b, m27228c.f4748c);
        return new C20168gt1(MutableSharedFlow, m27227d(coroutineScope, m27228c.f4749d, m27228c.f4746a, MutableSharedFlow, sharingStarted, SharedFlowKt.NO_VALUE));
    }

    /* renamed from: h */
    public static /* synthetic */ SharedFlow m27223h(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return FlowKt.shareIn(flow, coroutineScope, sharingStarted, i);
    }

    /* renamed from: i */
    public static final Object m27222i(Flow flow, CoroutineScope coroutineScope, Continuation continuation) {
        PH1 m27228c = m27228c(flow, 1);
        CompletableDeferred CompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        m27226e(coroutineScope, m27228c.f4749d, m27228c.f4746a, CompletableDeferred$default);
        return CompletableDeferred$default.await(continuation);
    }

    /* renamed from: j */
    public static final StateFlow m27221j(Flow flow, CoroutineScope coroutineScope, SharingStarted sharingStarted, Object obj) {
        PH1 m27228c = m27228c(flow, 1);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(obj);
        return new C20341ht1(MutableStateFlow, m27227d(coroutineScope, m27228c.f4749d, m27228c.f4746a, MutableStateFlow, sharingStarted, obj));
    }
}