package androidx.compose.p003ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.compose.p003ui.tooling.animation.states.AnimatedVisibilityState;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00028F¢\u0006\f\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, m29142d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "", "animationObject", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Transition;", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/tooling/ComposeAnimationType;", OperatorName.CURVE_TO, "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "type", "", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "d", "Ljava/util/Set;", "getStates", "()Ljava/util/Set;", "states", "", "getChildTransition", "getChildTransition$annotations", "()V", "childTransition", "ui-tooling_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.tooling.animation.AnimatedVisibilityComposeAnimation */
/* loaded from: classes2.dex */
public final class AnimatedVisibilityComposeAnimation implements ComposeAnimation {

    /* renamed from: a */
    public final Transition f31730a;

    /* renamed from: b */
    public final String f31731b;

    /* renamed from: c */
    public final ComposeAnimationType f31732c;

    /* renamed from: d */
    public final Set f31733d;

    public AnimatedVisibilityComposeAnimation(@NotNull Transition<Boolean> animationObject, @Nullable String str) {
        Intrinsics.checkNotNullParameter(animationObject, "animationObject");
        this.f31730a = animationObject;
        this.f31731b = str;
        this.f31732c = ComposeAnimationType.ANIMATED_VISIBILITY;
        AnimatedVisibilityState.Companion companion = AnimatedVisibilityState.Companion;
        this.f31733d = AH1.setOf((Object[]) new AnimatedVisibilityState[]{AnimatedVisibilityState.m73791boximpl(companion.m73797getEnterjXw82LU()), AnimatedVisibilityState.m73791boximpl(companion.m73798getExitjXw82LU())});
    }

    public static /* synthetic */ void getChildTransition$annotations() {
    }

    @Nullable
    public final Transition<Object> getChildTransition() {
        Object orNull = CollectionsKt___CollectionsKt.getOrNull(m73786getAnimationObject().getTransitions(), 0);
        if (orNull instanceof Transition) {
            return (Transition) orNull;
        }
        return null;
    }

    @Nullable
    public String getLabel() {
        return this.f31731b;
    }

    @NotNull
    public Set<AnimatedVisibilityState> getStates() {
        return this.f31733d;
    }

    @NotNull
    public ComposeAnimationType getType() {
        return this.f31732c;
    }

    @NotNull
    /* renamed from: getAnimationObject */
    public Transition<Boolean> m73786getAnimationObject() {
        return this.f31730a;
    }
}