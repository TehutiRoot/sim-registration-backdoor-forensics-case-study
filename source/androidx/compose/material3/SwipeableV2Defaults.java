package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0084\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000526\u0010\u000e\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u00072!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R)\u0010\"\u001a\u00020\u001c8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 RF\u0010+\u001a(\u0012\u0004\u0012\u00020#\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\u0002\b%8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006,"}, m28850d2 = {"Landroidx/compose/material3/SwipeableV2Defaults;", "", "<init>", "()V", "T", "Landroidx/compose/material3/SwipeableV2State;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", TypedValues.AttributesType.S_TARGET, "", "velocity", "", "animate", "Lkotlin/Function1;", "snap", "Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler$material3_release", "(Landroidx/compose/material3/SwipeableV2State;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Landroidx/compose/material3/AnchorChangeHandler;", "ReconcileAnimationOnAnchorChangeHandler", "Landroidx/compose/animation/core/SpringSpec;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$annotations", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "F", "getVelocityThreshold-D9Ej5fM", "()F", "getVelocityThreshold-D9Ej5fM$annotations", "VelocityThreshold", "Landroidx/compose/ui/unit/Density;", "totalDistance", "Lkotlin/ExtensionFunctionType;", OperatorName.CURVE_TO, "Lkotlin/jvm/functions/Function2;", "getPositionalThreshold", "()Lkotlin/jvm/functions/Function2;", "getPositionalThreshold$annotations", "PositionalThreshold", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,692:1\n154#2:693\n154#2:694\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Defaults\n*L\n581#1:693\n588#1:694\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeableV2Defaults {
    @NotNull
    public static final SwipeableV2Defaults INSTANCE = new SwipeableV2Defaults();

    /* renamed from: a */
    public static final SpringSpec f26241a = new SpringSpec(0.0f, 0.0f, null, 7, null);

    /* renamed from: b */
    public static final float f26242b = C3641Dp.m73658constructorimpl(125);

    /* renamed from: c */
    public static final Function2 f26243c = SwipeableV2Kt.m70642fixedPositionalThreshold0680j_4(C3641Dp.m73658constructorimpl(56));

    /* renamed from: androidx.compose.material3.SwipeableV2Defaults$a */
    /* loaded from: classes2.dex */
    public static final class C3389a implements AnchorChangeHandler {

        /* renamed from: a */
        public final /* synthetic */ Function2 f26244a;

        /* renamed from: b */
        public final /* synthetic */ SwipeableV2State f26245b;

        /* renamed from: c */
        public final /* synthetic */ Function1 f26246c;

        public C3389a(Function2 function2, SwipeableV2State swipeableV2State, Function1 function1) {
            this.f26244a = function2;
            this.f26245b = swipeableV2State;
            this.f26246c = function1;
        }

        @Override // androidx.compose.material3.AnchorChangeHandler
        public final void onAnchorsChanged(Object obj, Map previousAnchors, Map newAnchors) {
            Intrinsics.checkNotNullParameter(previousAnchors, "previousAnchors");
            Intrinsics.checkNotNullParameter(newAnchors, "newAnchors");
            Float f = (Float) newAnchors.get(obj);
            if (!Intrinsics.areEqual((Float) previousAnchors.get(obj), f)) {
                if (f != null) {
                    this.f26244a.invoke(obj, Float.valueOf(this.f26245b.getLastVelocity()));
                } else {
                    this.f26246c.invoke(SwipeableV2Kt.m60496b(newAnchors, this.f26245b.requireOffset(), false, 2, null));
                }
            }
        }
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }

    @ExperimentalMaterial3Api
    public static /* synthetic */ void getPositionalThreshold$annotations() {
    }

    @ExperimentalMaterial3Api
    /* renamed from: getVelocityThreshold-D9Ej5fM$annotations  reason: not valid java name */
    public static /* synthetic */ void m70640getVelocityThresholdD9Ej5fM$annotations() {
    }

    @ExperimentalMaterial3Api
    @NotNull
    public final <T> AnchorChangeHandler<T> ReconcileAnimationOnAnchorChangeHandler$material3_release(@NotNull SwipeableV2State<T> state, @NotNull Function2<? super T, ? super Float, Unit> animate, @NotNull Function1<? super T, Unit> snap) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(animate, "animate");
        Intrinsics.checkNotNullParameter(snap, "snap");
        return new C3389a(animate, state, snap);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return f26241a;
    }

    @NotNull
    public final Function2<Density, Float, Float> getPositionalThreshold() {
        return f26243c;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM  reason: not valid java name */
    public final float m70641getVelocityThresholdD9Ej5fM() {
        return f26242b;
    }
}
