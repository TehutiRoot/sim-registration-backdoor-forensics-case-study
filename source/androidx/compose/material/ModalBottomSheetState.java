package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB?\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fB3\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\u000eH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0013\u0010\u0015\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0010J%\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00103\u001a\b\u0012\u0004\u0012\u00020\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u00010$8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010&\"\u0004\b7\u00108R\u001a\u0010=\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\"R\u0011\u0010@\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0011\u0010B\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bA\u0010?R\u0011\u0010C\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bC\u0010-R\u0014\u0010E\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010-R\u0014\u0010G\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\"R\u0014\u0010I\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006K"}, m28850d2 = {"Landroidx/compose/material/ModalBottomSheetState;", "", "Landroidx/compose/material/ModalBottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "", "isSkipHalfExpanded", "Lkotlin/Function1;", "confirmStateChange", "<init>", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;ZLkotlin/jvm/functions/Function1;)V", "(Landroidx/compose/material/ModalBottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "show", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "halfExpand$material_release", "halfExpand", "expand$material_release", "expand", "hide", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "trySnapTo$material_release", "(Landroidx/compose/material/ModalBottomSheetValue;)Z", "trySnapTo", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/ui/unit/Density;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec$material_release", "()Landroidx/compose/animation/core/AnimationSpec;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Z", "isSkipHalfExpanded$material_release", "()Z", "Landroidx/compose/material/AnchoredDraggableState;", OperatorName.CURVE_TO, "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "d", "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getProgress", "getProgress$annotations", "()V", "progress", "getCurrentValue", "()Landroidx/compose/material/ModalBottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "isVisible", "getHasHalfExpandedState$material_release", "hasHalfExpandedState", "getLastVelocity$material_release", "lastVelocity", "isAnimationRunning$material_release", "isAnimationRunning", "Companion", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ModalBottomSheetState {

    /* renamed from: a */
    public final AnimationSpec f14525a;

    /* renamed from: b */
    public final boolean f14526b;

    /* renamed from: c */
    public final AnchoredDraggableState f14527c;

    /* renamed from: d */
    public Density f14528d;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\fH\u0007JB\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ<\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/material/ModalBottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/ModalBottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmValueChange", "Lkotlin/Function1;", "Landroidx/compose/material/ModalBottomSheetValue;", "", "skipHalfExpanded", "density", "Landroidx/compose/ui/unit/Density;", "confirmStateChange", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(density, "density");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$1.INSTANCE, new ModalBottomSheetState$Companion$Saver$2(density, animationSpec, confirmValueChange, z));
        }

        public Companion() {
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmValueChange, density, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmValueChange, boolean z) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(ModalBottomSheetState$Companion$Saver$3.INSTANCE, new ModalBottomSheetState$Companion$Saver$4(animationSpec, confirmValueChange, z));
        }

        @Deprecated(message = "This function is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, skipHalfExpanded)", imports = {}))
        @NotNull
        public final Saver<ModalBottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return Saver(animationSpec, confirmStateChange, z);
        }
    }

    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, isSkipHalfExpanded)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, boolean z, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        this.f14525a = animationSpec;
        this.f14526b = z;
        this.f14527c = new AnchoredDraggableState(initialValue, new ModalBottomSheetState$anchoredDraggableState$1(this), new ModalBottomSheetState$anchoredDraggableState$2(this), animationSpec, confirmStateChange);
        if (z && initialValue == ModalBottomSheetValue.HalfExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString());
        }
    }

    public static /* synthetic */ Object animateTo$material_release$default(ModalBottomSheetState modalBottomSheetState, ModalBottomSheetValue modalBottomSheetValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = modalBottomSheetState.f14527c.getLastVelocity();
        }
        return modalBottomSheetState.animateTo$material_release(modalBottomSheetValue, f, continuation);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* renamed from: a */
    public final Density m60871a() {
        Density density = this.f14528d;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on ModalBottomSheetState (" + this + ") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?").toString());
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.f14527c, modalBottomSheetValue, f, continuation);
        if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object expand$material_release(@NotNull Continuation<? super Unit> continuation) {
        AnchoredDraggableState anchoredDraggableState = this.f14527c;
        ModalBottomSheetValue modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        if (!anchoredDraggableState.hasAnchorForValue(modalBottomSheetValue)) {
            return Unit.INSTANCE;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        if (animateTo$material_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material_release$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<ModalBottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.f14527c;
    }

    @NotNull
    public final AnimationSpec<Float> getAnimationSpec$material_release() {
        return this.f14525a;
    }

    @NotNull
    public final ModalBottomSheetValue getCurrentValue() {
        return (ModalBottomSheetValue) this.f14527c.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.f14528d;
    }

    public final boolean getHasHalfExpandedState$material_release() {
        return this.f14527c.hasAnchorForValue(ModalBottomSheetValue.HalfExpanded);
    }

    public final float getLastVelocity$material_release() {
        return this.f14527c.getLastVelocity();
    }

    public final float getProgress() {
        return this.f14527c.getProgress();
    }

    @NotNull
    public final ModalBottomSheetValue getTargetValue() {
        return (ModalBottomSheetValue) this.f14527c.getTargetValue();
    }

    @Nullable
    public final Object halfExpand$material_release(@NotNull Continuation<? super Unit> continuation) {
        if (!getHasHalfExpandedState$material_release()) {
            return Unit.INSTANCE;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.HalfExpanded, 0.0f, continuation, 2, null);
        if (animateTo$material_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material_release$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$material_release$default = animateTo$material_release$default(this, ModalBottomSheetValue.Hidden, 0.0f, continuation, 2, null);
        if (animateTo$material_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material_release$default;
        }
        return Unit.INSTANCE;
    }

    public final boolean isAnimationRunning$material_release() {
        return this.f14527c.isAnimationRunning();
    }

    public final boolean isSkipHalfExpanded$material_release() {
        return this.f14526b;
    }

    public final boolean isVisible() {
        if (this.f14527c.getCurrentValue() != ModalBottomSheetValue.Hidden) {
            return true;
        }
        return false;
    }

    public final float requireOffset$material_release() {
        return this.f14527c.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.f14528d = density;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        ModalBottomSheetValue modalBottomSheetValue;
        if (getHasHalfExpandedState$material_release()) {
            modalBottomSheetValue = ModalBottomSheetValue.HalfExpanded;
        } else {
            modalBottomSheetValue = ModalBottomSheetValue.Expanded;
        }
        Object animateTo$material_release$default = animateTo$material_release$default(this, modalBottomSheetValue, 0.0f, continuation, 2, null);
        if (animateTo$material_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material_release$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull ModalBottomSheetValue modalBottomSheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.f14527c, modalBottomSheetValue, continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull ModalBottomSheetValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f14527c.trySnapTo$material_release(target);
    }

    public /* synthetic */ ModalBottomSheetState(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, boolean z, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(modalBottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? false : z, function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "This constructor is deprecated. confirmStateChange has been renamed to confirmValueChange.", replaceWith = @ReplaceWith(expression = "ModalBottomSheetState(initialValue, animationSpec, confirmStateChange, false)", imports = {}))
    public ModalBottomSheetState(@NotNull ModalBottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super ModalBottomSheetValue, Boolean> confirmStateChange) {
        this(initialValue, animationSpec, false, confirmStateChange);
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
    }
}
