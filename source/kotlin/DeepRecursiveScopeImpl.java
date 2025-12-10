package kotlin;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class DeepRecursiveScopeImpl extends DeepRecursiveScope implements Continuation {

    /* renamed from: a */
    public Function3 f68043a;

    /* renamed from: b */
    public Object f68044b;

    /* renamed from: c */
    public Continuation f68045c;

    /* renamed from: d */
    public Object f68046d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeepRecursiveScopeImpl(Function3 block, Object obj) {
        super(null);
        Object obj2;
        Intrinsics.checkNotNullParameter(block, "block");
        this.f68043a = block;
        this.f68044b = obj;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f68045c = this;
        obj2 = DeepRecursiveKt.f68042a;
        this.f68046d = obj2;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m28857a(DeepRecursiveScopeImpl deepRecursiveScopeImpl, Continuation continuation) {
        deepRecursiveScopeImpl.f68045c = continuation;
    }

    /* renamed from: b */
    public static final /* synthetic */ void m28856b(DeepRecursiveScopeImpl deepRecursiveScopeImpl, Function3 function3) {
        deepRecursiveScopeImpl.f68043a = function3;
    }

    /* renamed from: c */
    public static final /* synthetic */ void m28855c(DeepRecursiveScopeImpl deepRecursiveScopeImpl, Object obj) {
        deepRecursiveScopeImpl.f68046d = obj;
    }

    @Override // kotlin.DeepRecursiveScope
    public Object callRecursive(Object obj, Continuation continuation) {
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f68045c = continuation;
        this.f68044b = obj;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }

    /* renamed from: d */
    public final Continuation m28854d(final Function3 function3, final Continuation continuation) {
        final EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        return new Continuation<Object>() { // from class: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            @NotNull
            public CoroutineContext getContext() {
                return CoroutineContext.this;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(@NotNull Object obj) {
                DeepRecursiveScopeImpl.m28856b(this, function3);
                DeepRecursiveScopeImpl.m28857a(this, continuation);
                DeepRecursiveScopeImpl.m28855c(this, obj);
            }
        };
    }

    /* renamed from: e */
    public final Object m28853e() {
        Object obj;
        Object obj2;
        Object invoke;
        while (true) {
            Object obj3 = this.f68046d;
            Continuation continuation = this.f68045c;
            if (continuation != null) {
                obj = DeepRecursiveKt.f68042a;
                if (!Result.m74089equalsimpl0(obj, obj3)) {
                    obj2 = DeepRecursiveKt.f68042a;
                    this.f68046d = obj2;
                    continuation.resumeWith(obj3);
                } else {
                    try {
                        Function3 function3 = this.f68043a;
                        Object obj4 = this.f68044b;
                        if (!(function3 instanceof BaseContinuationImpl)) {
                            invoke = IntrinsicsKt__IntrinsicsJvmKt.wrapWithContinuationImpl(function3, this, obj4, continuation);
                        } else {
                            invoke = ((Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function3, 3)).invoke(this, obj4, continuation);
                        }
                        if (invoke != AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                            continuation.resumeWith(Result.m74087constructorimpl(invoke));
                        }
                    } catch (Throwable th2) {
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m74087constructorimpl(ResultKt.createFailure(th2)));
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj3);
                return obj3;
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object obj) {
        this.f68045c = null;
        this.f68046d = obj;
    }

    @Override // kotlin.DeepRecursiveScope
    public Object callRecursive(DeepRecursiveFunction deepRecursiveFunction, Object obj, Continuation continuation) {
        Function3 block$kotlin_stdlib = deepRecursiveFunction.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        Function3 function3 = this.f68043a;
        if (block$kotlin_stdlib != function3) {
            this.f68043a = block$kotlin_stdlib;
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f68045c = m28854d(function3, continuation);
        } else {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f68045c = continuation;
        }
        this.f68044b = obj;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended;
    }
}
