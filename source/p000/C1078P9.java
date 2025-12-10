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
public final class C1078P9 {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f4658b = AtomicIntegerFieldUpdater.newUpdater(C1078P9.class, "notCompletedCount");

    /* renamed from: a */
    public final Deferred[] f4659a;
    @Volatile
    private volatile int notCompletedCount;

    /* renamed from: P9$a */
    /* loaded from: classes6.dex */
    public final class C1079a extends JobNode {

        /* renamed from: g */
        public static final AtomicReferenceFieldUpdater f4660g = AtomicReferenceFieldUpdater.newUpdater(C1079a.class, Object.class, "_disposer");
        @Volatile
        @Nullable
        private volatile Object _disposer;

        /* renamed from: d */
        public final CancellableContinuation f4661d;

        /* renamed from: e */
        public DisposableHandle f4662e;

        public C1079a(CancellableContinuation cancellableContinuation) {
            this.f4661d = cancellableContinuation;
        }

        /* renamed from: e */
        public final C1080b m66906e() {
            return (C1080b) f4660g.get(this);
        }

        /* renamed from: f */
        public final DisposableHandle m66905f() {
            DisposableHandle disposableHandle = this.f4662e;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        /* renamed from: g */
        public final void m66904g(C1080b c1080b) {
            f4660g.set(this, c1080b);
        }

        /* renamed from: h */
        public final void m66903h(DisposableHandle disposableHandle) {
            this.f4662e = disposableHandle;
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
                Object tryResumeWithException = this.f4661d.tryResumeWithException(th2);
                if (tryResumeWithException != null) {
                    this.f4661d.completeResume(tryResumeWithException);
                    C1080b m66906e = m66906e();
                    if (m66906e != null) {
                        m66906e.m66902a();
                    }
                }
            } else if (C1078P9.f4658b.decrementAndGet(C1078P9.this) == 0) {
                CancellableContinuation cancellableContinuation = this.f4661d;
                Deferred[] deferredArr = C1078P9.this.f4659a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuation.resumeWith(Result.m74087constructorimpl(arrayList));
            }
        }
    }

    /* renamed from: P9$b */
    /* loaded from: classes6.dex */
    public final class C1080b extends CancelHandler {

        /* renamed from: a */
        public final C1079a[] f4664a;

        public C1080b(C1079a[] c1079aArr) {
            this.f4664a = c1079aArr;
        }

        /* renamed from: a */
        public final void m66902a() {
            for (C1079a c1079a : this.f4664a) {
                c1079a.m66905f().dispose();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.INSTANCE;
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f4664a + AbstractJsonLexerKt.END_LIST;
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public void invoke2(Throwable th2) {
            m66902a();
        }
    }

    public C1078P9(Deferred[] deferredArr) {
        this.f4659a = deferredArr;
        this.notCompletedCount = deferredArr.length;
    }

    /* renamed from: c */
    public final Object m66907c(Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        int length = this.f4659a.length;
        C1079a[] c1079aArr = new C1079a[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = this.f4659a[i];
            deferred.start();
            C1079a c1079a = new C1079a(cancellableContinuationImpl);
            c1079a.m66903h(deferred.invokeOnCompletion(c1079a));
            Unit unit = Unit.INSTANCE;
            c1079aArr[i] = c1079a;
        }
        C1080b c1080b = new C1080b(c1079aArr);
        for (int i2 = 0; i2 < length; i2++) {
            c1079aArr[i2].m66904g(c1080b);
        }
        if (cancellableContinuationImpl.isCompleted()) {
            c1080b.m66902a();
        } else {
            cancellableContinuationImpl.invokeOnCancellation(c1080b);
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
