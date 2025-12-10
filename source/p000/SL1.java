package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.Nullable;

/* renamed from: SL1 */
/* loaded from: classes6.dex */
public final class SL1 extends AbstractSharedFlowSlot {

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f5595a = AtomicReferenceFieldUpdater.newUpdater(SL1.class, Object.class, "_state");
    @Volatile
    @Nullable
    private volatile Object _state;

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: b */
    public boolean allocateLocked(StateFlowImpl stateFlowImpl) {
        Symbol symbol;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5595a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            symbol = StateFlowKt.f70936a;
            atomicReferenceFieldUpdater.set(this, symbol);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final Object m66355c(Continuation continuation) {
        Symbol symbol;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5595a;
        symbol = StateFlowKt.f70936a;
        if (!AbstractC13055p0.m23740a(atomicReferenceFieldUpdater, this, symbol, cancellableContinuationImpl)) {
            Result.Companion companion = Result.Companion;
            cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return result;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    /* renamed from: d */
    public Continuation[] freeLocked(StateFlowImpl stateFlowImpl) {
        f5595a.set(this, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    /* renamed from: e */
    public final void m66353e() {
        Symbol symbol;
        Symbol symbol2;
        Symbol symbol3;
        Symbol symbol4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5595a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                symbol = StateFlowKt.f70937b;
                if (obj != symbol) {
                    symbol2 = StateFlowKt.f70936a;
                    if (obj == symbol2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5595a;
                        symbol3 = StateFlowKt.f70937b;
                        if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater2, this, obj, symbol3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f5595a;
                        symbol4 = StateFlowKt.f70936a;
                        if (AbstractC13055p0.m23740a(atomicReferenceFieldUpdater3, this, obj, symbol4)) {
                            Result.Companion companion = Result.Companion;
                            ((CancellableContinuationImpl) obj).resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean m66352f() {
        Symbol symbol;
        Symbol symbol2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5595a;
        symbol = StateFlowKt.f70936a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, symbol);
        Intrinsics.checkNotNull(andSet);
        symbol2 = StateFlowKt.f70937b;
        if (andSet == symbol2) {
            return true;
        }
        return false;
    }
}
