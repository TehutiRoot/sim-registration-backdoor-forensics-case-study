package androidx.compose.p003ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m28850d2 = {"Landroidx/compose/ui/platform/AndroidUiFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/AndroidUiDispatcher;)V", "(Landroid/view/Choreographer;)V", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/view/Choreographer;", "getChoreographer", "()Landroid/view/Choreographer;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/platform/AndroidUiDispatcher;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,60:1\n314#2,11:61\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n38#1:61,11\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock */
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Choreographer f30626a;

    /* renamed from: b */
    public final AndroidUiDispatcher f30627b;

    /* renamed from: androidx.compose.ui.platform.AndroidUiFrameClock$a */
    /* loaded from: classes2.dex */
    public static final class Choreographer$FrameCallbackC3565a implements Choreographer.FrameCallback {

        /* renamed from: a */
        public final /* synthetic */ CancellableContinuation f30628a;

        /* renamed from: b */
        public final /* synthetic */ AndroidUiFrameClock f30629b;

        /* renamed from: c */
        public final /* synthetic */ Function1 f30630c;

        public Choreographer$FrameCallbackC3565a(CancellableContinuation cancellableContinuation, AndroidUiFrameClock androidUiFrameClock, Function1 function1) {
            this.f30628a = cancellableContinuation;
            this.f30629b = androidUiFrameClock;
            this.f30630c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object m74087constructorimpl;
            CancellableContinuation cancellableContinuation = this.f30628a;
            Function1 function1 = this.f30630c;
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

    public AndroidUiFrameClock(@NotNull Choreographer choreographer, @Nullable AndroidUiDispatcher androidUiDispatcher) {
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
        this.f30626a = choreographer;
        this.f30627b = androidUiDispatcher;
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

    @NotNull
    public final Choreographer getChoreographer() {
        return this.f30626a;
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock, kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.Key getKey() {
        return AbstractC21490ot0.m23748a(this);
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

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @Nullable
    public <R> Object withFrameNanos(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        AndroidUiDispatcher androidUiDispatcher = this.f30627b;
        if (androidUiDispatcher == null) {
            CoroutineContext.Element element = continuation.getContext().get(ContinuationInterceptor.Key);
            if (element instanceof AndroidUiDispatcher) {
                androidUiDispatcher = (AndroidUiDispatcher) element;
            } else {
                androidUiDispatcher = null;
            }
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Choreographer$FrameCallbackC3565a choreographer$FrameCallbackC3565a = new Choreographer$FrameCallbackC3565a(cancellableContinuationImpl, this, function1);
        if (androidUiDispatcher != null && Intrinsics.areEqual(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            androidUiDispatcher.postFrameCallback$ui_release(choreographer$FrameCallbackC3565a);
            cancellableContinuationImpl.invokeOnCancellation(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, choreographer$FrameCallbackC3565a));
        } else {
            getChoreographer().postFrameCallback(choreographer$FrameCallbackC3565a);
            cancellableContinuationImpl.invokeOnCancellation(new AndroidUiFrameClock$withFrameNanos$2$2(this, choreographer$FrameCallbackC3565a));
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock(@NotNull Choreographer choreographer) {
        this(choreographer, null);
        Intrinsics.checkNotNullParameter(choreographer, "choreographer");
    }
}
