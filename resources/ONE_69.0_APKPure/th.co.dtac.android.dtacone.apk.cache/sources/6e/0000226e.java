package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntOffset;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/EnterExitState;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class SlideModifier$transitionSpec$1 extends Lambda implements Function1<Transition.Segment<EnterExitState>, FiniteAnimationSpec<IntOffset>> {
    final /* synthetic */ SlideModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$transitionSpec$1(SlideModifier slideModifier) {
        super(1);
        this.this$0 = slideModifier;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final FiniteAnimationSpec<IntOffset> invoke(@NotNull Transition.Segment<EnterExitState> segment) {
        SpringSpec springSpec;
        SpringSpec springSpec2;
        FiniteAnimationSpec<IntOffset> animationSpec;
        SpringSpec springSpec3;
        FiniteAnimationSpec<IntOffset> animationSpec2;
        Intrinsics.checkNotNullParameter(segment, "$this$null");
        EnterExitState enterExitState = EnterExitState.PreEnter;
        EnterExitState enterExitState2 = EnterExitState.Visible;
        if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
            Slide slide = (Slide) this.this$0.m61666d().getValue();
            if (slide == null || (animationSpec2 = slide.getAnimationSpec()) == null) {
                springSpec3 = EnterExitTransitionKt.f12453d;
                return springSpec3;
            }
            return animationSpec2;
        } else if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
            springSpec = EnterExitTransitionKt.f12453d;
            return springSpec;
        } else {
            Slide slide2 = (Slide) this.this$0.m61665e().getValue();
            if (slide2 == null || (animationSpec = slide2.getAnimationSpec()) == null) {
                springSpec2 = EnterExitTransitionKt.f12453d;
                return springSpec2;
            }
            return animationSpec;
        }
    }
}