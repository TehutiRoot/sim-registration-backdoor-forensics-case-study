package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0081\u0001\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J;\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "animate", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "iteration", "", "iterations", "reverseOnRepeat", "", "speed", "", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "initialProgress", "continueFromPreviousAnimate", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "progress", "resetLastFrameNanos", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public interface LottieAnimatable extends LottieAnimationState {

    @Metadata(m28849k = 3, m28848mv = {1, 6, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object animate$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i, int i2, boolean z, float f, LottieClipSpec lottieClipSpec, float f2, boolean z2, LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, Continuation continuation, int i3, Object obj) {
            int i4;
            int i5;
            boolean z5;
            float f3;
            LottieClipSpec lottieClipSpec2;
            float f4;
            boolean z6;
            LottieCancellationBehavior lottieCancellationBehavior2;
            boolean z7;
            boolean z8;
            if (obj == null) {
                if ((i3 & 2) != 0) {
                    i4 = lottieAnimatable.getIteration();
                } else {
                    i4 = i;
                }
                if ((i3 & 4) != 0) {
                    i5 = lottieAnimatable.getIterations();
                } else {
                    i5 = i2;
                }
                if ((i3 & 8) != 0) {
                    z5 = lottieAnimatable.getReverseOnRepeat();
                } else {
                    z5 = z;
                }
                if ((i3 & 16) != 0) {
                    f3 = lottieAnimatable.getSpeed();
                } else {
                    f3 = f;
                }
                if ((i3 & 32) != 0) {
                    lottieClipSpec2 = lottieAnimatable.getClipSpec();
                } else {
                    lottieClipSpec2 = lottieClipSpec;
                }
                if ((i3 & 64) != 0) {
                    f4 = LottieAnimatableKt.access$defaultProgress(lottieComposition, lottieClipSpec2, f3);
                } else {
                    f4 = f2;
                }
                if ((i3 & 128) != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                if ((i3 & 256) != 0) {
                    lottieCancellationBehavior2 = LottieCancellationBehavior.Immediately;
                } else {
                    lottieCancellationBehavior2 = lottieCancellationBehavior;
                }
                if ((i3 & 512) != 0) {
                    z7 = false;
                } else {
                    z7 = z3;
                }
                if ((i3 & 1024) != 0) {
                    z8 = false;
                } else {
                    z8 = z4;
                }
                return lottieAnimatable.animate(lottieComposition, i4, i5, z5, f3, lottieClipSpec2, f4, z6, lottieCancellationBehavior2, z7, z8, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }

        public static long getLastFrameNanos(@NotNull LottieAnimatable lottieAnimatable) {
            Intrinsics.checkNotNullParameter(lottieAnimatable, "this");
            return LottieAnimationState.DefaultImpls.getLastFrameNanos(lottieAnimatable);
        }

        public static /* synthetic */ Object snapTo$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, float f, int i, boolean z, Continuation continuation, int i2, Object obj) {
            boolean z2;
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    lottieComposition = lottieAnimatable.getComposition();
                }
                LottieComposition lottieComposition2 = lottieComposition;
                if ((i2 & 2) != 0) {
                    f = lottieAnimatable.getProgress();
                }
                float f2 = f;
                if ((i2 & 4) != 0) {
                    i = lottieAnimatable.getIteration();
                }
                int i3 = i;
                if ((i2 & 8) != 0) {
                    if (f2 == lottieAnimatable.getProgress()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z = !z2;
                }
                return lottieAnimatable.snapTo(lottieComposition2, f2, i3, z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
        }
    }

    @Nullable
    Object animate(@Nullable LottieComposition lottieComposition, int i, int i2, boolean z, float f, @Nullable LottieClipSpec lottieClipSpec, float f2, boolean z2, @NotNull LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object snapTo(@Nullable LottieComposition lottieComposition, float f, int i, boolean z, @NotNull Continuation<? super Unit> continuation);
}
