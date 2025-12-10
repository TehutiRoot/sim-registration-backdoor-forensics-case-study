package th.p047co.dtac.android.dtacone.util.animation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0005"}, m29142d2 = {"listenerEnd", "", "Landroid/animation/ValueAnimator;", "end", "Lkotlin/Function0;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.animation.ValueAnimatorListenerKt */
/* loaded from: classes8.dex */
public final class ValueAnimatorListenerKt {
    public static final void listenerEnd(@NotNull ValueAnimator valueAnimator, @NotNull final Function0<Unit> end) {
        Intrinsics.checkNotNullParameter(valueAnimator, "<this>");
        Intrinsics.checkNotNullParameter(end, "end");
        valueAnimator.addListener(new Animator.AnimatorListener() { // from class: th.co.dtac.android.dtacone.util.animation.ValueAnimatorListenerKt$listenerEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Function0.this.invoke();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
            }
        });
    }
}