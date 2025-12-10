package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00032\f\b\u0002\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R \u0010'\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010$R\u0011\u0010+\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, m29142d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "timeNanos", "sendFrame", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancellationException", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "", "cause", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/lang/Throwable;)V", "Lkotlin/jvm/functions/Function0;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Object;", "lock", OperatorName.CURVE_TO, "Ljava/lang/Throwable;", "failureCause", "", "Landroidx/compose/runtime/BroadcastFrameClock$a;", "d", "Ljava/util/List;", "awaiters", "e", "spareList", "", "getHasAwaiters", "()Z", "hasAwaiters", "runtime_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,132:1\n70#2:133\n70#2:134\n70#2:144\n70#2:147\n314#3,9:135\n323#3,2:145\n33#4,6:148\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock\n*L\n54#1:133\n62#1:134\n81#1:144\n112#1:147\n79#1:135,9\n79#1:145,2\n115#1:148,6\n*E\n"})
/* loaded from: classes2.dex */
public final class BroadcastFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Function0 f28280a;

    /* renamed from: b */
    public final Object f28281b;

    /* renamed from: c */
    public Throwable f28282c;

    /* renamed from: d */
    public List f28283d;

    /* renamed from: e */
    public List f28284e;

    /* renamed from: androidx.compose.runtime.BroadcastFrameClock$a */
    /* loaded from: classes2.dex */
    public static final class C3417a {

        /* renamed from: a */
        public final Function1 f28285a;

        /* renamed from: b */
        public final Continuation f28286b;

        public C3417a(Function1 onFrame, Continuation continuation) {
            Intrinsics.checkNotNullParameter(onFrame, "onFrame");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.f28285a = onFrame;
            this.f28286b = continuation;
        }

        /* renamed from: a */
        public final Continuation m60346a() {
            return this.f28286b;
        }

        /* renamed from: b */
        public final void m60345b(long j) {
            Object m74271constructorimpl;
            Continuation continuation = this.f28286b;
            try {
                Result.Companion companion = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl(this.f28285a.invoke(Long.valueOf(j)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                m74271constructorimpl = Result.m74271constructorimpl(ResultKt.createFailure(th2));
            }
            continuation.resumeWith(m74271constructorimpl);
        }
    }

    public BroadcastFrameClock() {
        this(null, 1, null);
    }

    public static /* synthetic */ void cancel$default(BroadcastFrameClock broadcastFrameClock, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    /* renamed from: a */
    public final void m60347a(Throwable th2) {
        synchronized (this.f28281b) {
            try {
                if (this.f28282c != null) {
                    return;
                }
                this.f28282c = th2;
                List list = this.f28283d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Continuation m60346a = ((C3417a) list.get(i)).m60346a();
                    Result.Companion companion = Result.Companion;
                    m60346a.resumeWith(Result.m74271constructorimpl(ResultKt.createFailure(th2)));
                }
                this.f28283d.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void cancel(@NotNull CancellationException cancellationException) {
        Intrinsics.checkNotNullParameter(cancellationException, "cancellationException");
        m60347a(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    public final boolean getHasAwaiters() {
        boolean z;
        synchronized (this.f28281b) {
            z = !this.f28283d.isEmpty();
        }
        return z;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.Key getKey() {
        return AbstractC22589ut0.m1000a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final void sendFrame(long j) {
        synchronized (this.f28281b) {
            try {
                List list = this.f28283d;
                this.f28283d = this.f28284e;
                this.f28284e = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((C3417a) list.get(i)).m60345b(j);
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [T, androidx.compose.runtime.BroadcastFrameClock$a] */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        C3417a c3417a;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (this.f28281b) {
            Throwable th2 = this.f28282c;
            if (th2 != null) {
                Result.Companion companion = Result.Companion;
                cancellableContinuationImpl.resumeWith(Result.m74271constructorimpl(ResultKt.createFailure(th2)));
            } else {
                objectRef.element = new C3417a(function1, cancellableContinuationImpl);
                boolean z = !this.f28283d.isEmpty();
                List list = this.f28283d;
                Object obj = objectRef.element;
                if (obj == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("awaiter");
                    c3417a = null;
                } else {
                    c3417a = (C3417a) obj;
                }
                list.add(c3417a);
                boolean z2 = !z;
                cancellableContinuationImpl.invokeOnCancellation(new BroadcastFrameClock$withFrameNanos$2$1(this, objectRef));
                if (z2 && this.f28280a != null) {
                    try {
                        this.f28280a.invoke();
                    } catch (Throwable th3) {
                        m60347a(th3);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public BroadcastFrameClock(@Nullable Function0<Unit> function0) {
        this.f28280a = function0;
        this.f28281b = new Object();
        this.f28283d = new ArrayList();
        this.f28284e = new ArrayList();
    }

    public /* synthetic */ BroadcastFrameClock(Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
    }
}