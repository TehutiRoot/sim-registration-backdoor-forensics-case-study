package p000;

import androidx.compose.runtime.RecomposerKt;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* renamed from: qo1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C21820qo1 {

    /* renamed from: a */
    public Object f77072a;

    /* renamed from: c */
    public final Object m23432c(Object obj, Continuation continuation) {
        Object obj2;
        Object obj3;
        CancellableContinuationImpl cancellableContinuationImpl;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.f77072a;
            obj2 = RecomposerKt.f28414a;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.f28415b;
                this.f77072a = obj5;
                return Unit.INSTANCE;
            }
            Unit unit = Unit.INSTANCE;
            CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl2.initCancellability();
            synchronized (obj) {
                try {
                    Object obj7 = this.f77072a;
                    obj3 = RecomposerKt.f28414a;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.f28415b;
                        this.f77072a = obj4;
                        cancellableContinuationImpl = cancellableContinuationImpl2;
                    } else {
                        this.f77072a = cancellableContinuationImpl2;
                        cancellableContinuationImpl = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (cancellableContinuationImpl != null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m74087constructorimpl(Unit.INSTANCE));
            }
            Object result = cancellableContinuationImpl2.getResult();
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                DebugProbes.probeCoroutineSuspended(continuation);
            }
            if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return result;
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: d */
    public final Continuation m23431d() {
        Object obj;
        Object obj2;
        boolean areEqual;
        Object obj3;
        Object obj4;
        Object obj5 = this.f77072a;
        if (obj5 instanceof Continuation) {
            obj4 = RecomposerKt.f28415b;
            this.f77072a = obj4;
            return (Continuation) obj5;
        }
        obj = RecomposerKt.f28414a;
        if (!Intrinsics.areEqual(obj5, obj)) {
            obj2 = RecomposerKt.f28415b;
            areEqual = Intrinsics.areEqual(obj5, obj2);
        } else {
            areEqual = true;
        }
        if (!areEqual) {
            if (obj5 == null) {
                obj3 = RecomposerKt.f28414a;
                this.f77072a = obj3;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m23430e() {
        Object obj;
        Object obj2 = this.f77072a;
        obj = RecomposerKt.f28415b;
        if (obj2 == obj) {
            this.f77072a = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
