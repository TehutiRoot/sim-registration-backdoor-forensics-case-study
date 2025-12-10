package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "T", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "Landroidx/compose/animation/core/Transition;", "animationObject", "", "", "states", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", OperatorName.CURVE_TO, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "d", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "ui-tooling_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.animation.TransitionComposeAnimation */
/* loaded from: classes2.dex */
public final class TransitionComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {

    /* renamed from: a */
    public final Transition f31680a;

    /* renamed from: b */
    public final Set f31681b;

    /* renamed from: c */
    public final String f31682c;

    /* renamed from: d */
    public final ComposeAnimationType f31683d;

    public TransitionComposeAnimation(@NotNull Transition<T> animationObject, @NotNull Set<? extends Object> states, @Nullable String str) {
        Intrinsics.checkNotNullParameter(animationObject, "animationObject");
        Intrinsics.checkNotNullParameter(states, "states");
        this.f31680a = animationObject;
        this.f31681b = states;
        this.f31682c = str;
        this.f31683d = ComposeAnimationType.TRANSITION_ANIMATION;
    }

    @Nullable
    public String getLabel() {
        return this.f31682c;
    }

    @NotNull
    public Set<Object> getStates() {
        return this.f31681b;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31683d;
    }

    @Override // androidx.compose.p003ui.tooling.animation.TransitionBasedAnimation
    @NotNull
    public Transition<T> getAnimationObject() {
        return this.f31680a;
    }
}
