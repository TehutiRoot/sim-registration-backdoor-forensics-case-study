package androidx.compose.animation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"Landroidx/compose/animation/AnimatedVisibilityScopeImpl;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "transition", "<init>", "(Landroidx/compose/animation/core/Transition;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Transition;", "getTransition", "()Landroidx/compose/animation/core/Transition;", "setTransition", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/ui/unit/IntSize;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/MutableState;", "getTargetSize$animation_release", "()Landroidx/compose/runtime/MutableState;", "targetSize", "animation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalAnimationApi
/* loaded from: classes.dex */
public final class AnimatedVisibilityScopeImpl implements AnimatedVisibilityScope {

    /* renamed from: a */
    public Transition f12351a;

    /* renamed from: b */
    public final MutableState f12352b;

    public AnimatedVisibilityScopeImpl(@NotNull Transition<EnterExitState> transition) {
        MutableState m31891g;
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.f12351a = transition;
        m31891g = AbstractC19508dK1.m31891g(IntSize.m73810boximpl(IntSize.Companion.m73823getZeroYbymL2g()), null, 2, null);
        this.f12352b = m31891g;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    public /* synthetic */ Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str) {
        return AnimatedVisibilityScope.CC.m61746a(this, modifier, enterTransition, exitTransition, str);
    }

    @NotNull
    public final MutableState<IntSize> getTargetSize$animation_release() {
        return this.f12352b;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    @NotNull
    public Transition<EnterExitState> getTransition() {
        return this.f12351a;
    }

    public void setTransition(@NotNull Transition<EnterExitState> transition) {
        Intrinsics.checkNotNullParameter(transition, "<set-?>");
        this.f12351a = transition;
    }
}
