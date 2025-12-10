package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes2.dex */
public final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    /* renamed from: a */
    public static final DefaultChoreographerFrameClock f28311a = new DefaultChoreographerFrameClock();

    /* renamed from: b */
    public static final Choreographer f28312b = (Choreographer) BuildersKt.runBlocking(Dispatchers.getMain().getImmediate(), new DefaultChoreographerFrameClock$choreographer$1(null));

    /* renamed from: androidx.compose.runtime.DefaultChoreographerFrameClock$a */
    /* loaded from: classes2.dex */
    public static final class Choreographer$FrameCallbackC3442a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f28313a;

        /* renamed from: b */
        public final /* synthetic */ Function1 f28314b;

        public Choreographer$FrameCallbackC3442a(CancellableContinuation cancellableContinuation, Function1 function1) {
            this.f28313a = cancellableContinuation;
            this.f28314b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object m74087constructorimpl;
            CancellableContinuation cancellableContinuation = this.f28313a;
            DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.f28311a;
            Function1 function1 = this.f28314b;
            try {
                Result.Companion companion = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
            }
            cancellableContinuation.resumeWith(m74087constructorimpl);
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return MonotonicFrameClock.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.Key getKey() {
        return AbstractC21490ot0.m23748a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public Object withFrameNanos(Function1 function1, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Choreographer$FrameCallbackC3442a choreographer$FrameCallbackC3442a = new Choreographer$FrameCallbackC3442a(cancellableContinuationImpl, function1);
        f28312b.postFrameCallback(choreographer$FrameCallbackC3442a);
        cancellableContinuationImpl.invokeOnCancellation(new DefaultChoreographerFrameClock$withFrameNanos$2$1(choreographer$FrameCallbackC3442a));
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
