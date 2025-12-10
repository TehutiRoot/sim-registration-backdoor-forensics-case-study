package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobNode;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.Nullable;

/* renamed from: P9 */
/* loaded from: classes6.dex */
public final class C1068P9 {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f4688b = AtomicIntegerFieldUpdater.newUpdater(C1068P9.class, "notCompletedCount");

    /* renamed from: a */
    public final Deferred[] f4689a;
    @Volatile
    private volatile int notCompletedCount;

    /* renamed from: P9$a */
    /* loaded from: classes6.dex */
    public final class C1069a extends JobNode {

        /* renamed from: g */
        public static final AtomicReferenceFieldUpdater f4690g = AtomicReferenceFieldUpdater.newUpdater(C1069a.class, Object.class, "_disposer");
        @Volatile
        @Nullable
        private volatile Object _disposer;

        /* renamed from: d */
        public final CancellableContinuation f4691d;

        /* renamed from: e */
        public DisposableHandle f4692e;

        public C1069a(CancellableContinuation cancellableContinuation) {
            this.f4691d = cancellableContinuation;
        }

        /* renamed from: e */
        public final C1070b m67002e() {
            return (C1070b) f4690g.get(this);
        }

        /* renamed from: f */
        public final DisposableHandle m67001f() {
            DisposableHandle disposableHandle = this.f4692e;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        /* renamed from: g */
        public final void m67000g(C1070b c1070b) {
            f4690g.set(this, c1070b);
        }

        /* renamed from: h */
        public final void m66999h(DisposableHandle disposableHandle) {
            this.f4692e = disposableHandle;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            if (th2 != null) {
                Object tryResumeWithException = this.f4691d.tryResumeWithException(th2);
                if (tryResumeWithException != null) {
                    this.f4691d.completeResume(tryResumeWithException);
                    C1070b m67002e = m67002e();
                    if (m67002e != null) {
                        m67002e.m66998a();
                    }
                }
            } else if (C1068P9.f4688b.decrementAndGet(C1068P9.this) == 0) {
                CancellableContinuation cancellableContinuation = this.f4691d;
                Deferred[] deferredArr = C1068P9.this.f4689a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuation.resumeWith(Result.m74271constructorimpl(arrayList));
            }
        }
    }

    /* renamed from: P9$b */
    /* loaded from: classes6.dex */
    public final class C1070b extends CancelHandler {

        /* renamed from: a */
        public final C1069a[] f4694a;

        public C1070b(C1069a[] c1069aArr) {
            this.f4694a = c1069aArr;
        }

        /* renamed from: a */
        public final void m66998a() {
            for (C1069a c1069a : this.f4694a) {
                c1069a.m67001f().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f4694a + AbstractJsonLexerKt.END_LIST;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            m66998a();
        }
    }

    public C1068P9(Deferred[] deferredArr) {
        this.f4689a = deferredArr;
        this.notCompletedCount = deferredArr.length;
    }

    /* renamed from: c */
    public final Object m67003c(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        int length = this.f4689a.length;
        C1069a[] c1069aArr = new C1069a[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = this.f4689a[i];
            deferred.start();
            C1069a c1069a = new C1069a(cancellableContinuationImpl);
            c1069a.m66999h(deferred.invokeOnCompletion(c1069a));
            Unit unit = Unit.INSTANCE;
            c1069aArr[i] = c1069a;
        }
        C1070b c1070b = new C1070b(c1069aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c1069aArr[i2].m67000g(c1070b);
        }
        if (cancellableContinuationImpl.isCompleted()) {
            c1070b.m66998a();
        } else {
            cancellableContinuationImpl.invokeOnCancellation(c1070b);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}