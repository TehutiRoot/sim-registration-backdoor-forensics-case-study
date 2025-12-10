package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.selects.SelectClause1;

/* renamed from: AF */
/* loaded from: classes6.dex */
public class C0016AF extends AbstractCoroutine implements Deferred {
    public C0016AF(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    /* renamed from: I */
    public static /* synthetic */ Object m69297I(C0016AF c0016af, Continuation continuation) {
        Object awaitInternal = c0016af.awaitInternal(continuation);
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(Continuation continuation) {
        return m69297I(this, continuation);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object getCompleted() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1 getOnAwait() {
        SelectClause1<?> onAwaitInternal = getOnAwaitInternal();
        Intrinsics.checkNotNull(onAwaitInternal, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.DeferredCoroutine>");
        return onAwaitInternal;
    }
}