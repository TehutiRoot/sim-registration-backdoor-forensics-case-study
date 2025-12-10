package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aG\u0010\t\u001a\u00020\u0006*\f\u0012\u0004\u0012\u00020\u0001\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0080@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, m28850d2 = {"Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/Dp;", TypedValues.AttributesType.S_TARGET, "Landroidx/compose/foundation/interaction/Interaction;", "from", TypedValues.TransitionType.S_TO, "", "animateElevation-rAjV9yQ", "(Landroidx/compose/animation/core/Animatable;FLandroidx/compose/foundation/interaction/Interaction;Landroidx/compose/foundation/interaction/Interaction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateElevation", "Landroidx/compose/animation/core/Easing;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Easing;", "OutgoingSpecEasing", "Landroidx/compose/animation/core/TweenSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/animation/core/TweenSpec;", "DefaultIncomingSpec", OperatorName.CURVE_TO, "DefaultOutgoingSpec", "d", "HoveredOutgoingSpec", "material3_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class ElevationKt {

    /* renamed from: a */
    public static final Easing f25761a;

    /* renamed from: b */
    public static final TweenSpec f25762b;

    /* renamed from: c */
    public static final TweenSpec f25763c;

    /* renamed from: d */
    public static final TweenSpec f25764d;

    static {
        CubicBezierEasing cubicBezierEasing = new CubicBezierEasing(0.4f, 0.0f, 0.6f, 1.0f);
        f25761a = cubicBezierEasing;
        f25762b = new TweenSpec(120, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
        f25763c = new TweenSpec(150, 0, cubicBezierEasing, 2, null);
        f25764d = new TweenSpec(120, 0, cubicBezierEasing, 2, null);
    }

    @Nullable
    /* renamed from: animateElevation-rAjV9yQ  reason: not valid java name */
    public static final Object m70381animateElevationrAjV9yQ(@NotNull Animatable<C3641Dp, ?> animatable, float f, @Nullable Interaction interaction, @Nullable Interaction interaction2, @NotNull Continuation<? super Unit> continuation) {
        AnimationSpec animationSpec;
        if (interaction2 != null) {
            animationSpec = C10225fR.f61814a.m31302a(interaction2);
        } else if (interaction != null) {
            animationSpec = C10225fR.f61814a.m31301b(interaction);
        } else {
            animationSpec = null;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if (animationSpec2 != null) {
            Object animateTo$default = Animatable.animateTo$default(animatable, C3641Dp.m73656boximpl(f), animationSpec2, null, null, continuation, 12, null);
            if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateTo$default;
            }
            return Unit.INSTANCE;
        }
        Object snapTo = animatable.snapTo(C3641Dp.m73656boximpl(f), continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: animateElevation-rAjV9yQ$default  reason: not valid java name */
    public static /* synthetic */ Object m70382animateElevationrAjV9yQ$default(Animatable animatable, float f, Interaction interaction, Interaction interaction2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            interaction = null;
        }
        if ((i & 4) != 0) {
            interaction2 = null;
        }
        return m70381animateElevationrAjV9yQ(animatable, f, interaction, interaction2, continuation);
    }
}
