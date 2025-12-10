package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
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
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010)R\u001a\u0010.\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u0011R\u001a\u00101\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u0011R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0011\u00107\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0011\u00109\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b9\u00108R\u0014\u0010;\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010=\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006?"}, m28850d2 = {"Landroidx/compose/material/BottomSheetState;", "", "Landroidx/compose/material/BottomSheetValue;", "initialValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "animationSpec", "Lkotlin/Function1;", "", "confirmValueChange", "<init>", "(Landroidx/compose/material/BottomSheetValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;)V", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collapse", "requireOffset", "()F", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomSheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "trySnapTo$material_release", "(Landroidx/compose/material/BottomSheetValue;)Z", "trySnapTo", "Landroidx/compose/ui/unit/Density;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getProgress", "getProgress$annotations", "()V", "progress", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "()Landroidx/compose/material/BottomSheetValue;", "currentValue", "getTargetValue", "targetValue", "isExpanded", "()Z", "isCollapsed", "isAnimationRunning$material_release", "isAnimationRunning", "getLastVelocity$material_release", "lastVelocity", "Companion", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomSheetState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnchoredDraggableState f14391a;

    /* renamed from: b */
    public Density f14392b;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomSheetValue;", "invoke", "(Landroidx/compose/material/BottomSheetValue;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.BottomSheetState$1 */
    /* loaded from: classes.dex */
    public static final class C30911 extends Lambda implements Function1<BottomSheetValue, Boolean> {
        public static final C30911 INSTANCE = new C30911();

        public C30911() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomSheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0007J:\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, m28850d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomSheetState;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "confirmStateChange", "Lkotlin/Function1;", "Landroidx/compose/material/BottomSheetValue;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange, @NotNull Density density) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            Intrinsics.checkNotNullParameter(density, "density");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$1.INSTANCE, new BottomSheetState$Companion$Saver$2(density, animationSpec, confirmStateChange));
        }

        public Companion() {
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(animationSpec, confirmStateChange, density)", imports = {}))
        @NotNull
        public final Saver<BottomSheetState, ?> Saver(@NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomSheetState$Companion$Saver$3.INSTANCE, new BottomSheetState$Companion$Saver$4(animationSpec, confirmStateChange));
        }
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomSheetState(\n                initialValue = initialValue,\n                density = LocalDensity.current,\n                animationSpec = animationSpec,\n                confirmValueChange = confirmValueChange\n            )\n            ", imports = {}))
    public BottomSheetState(@NotNull BottomSheetValue initialValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Function1<? super BottomSheetValue, Boolean> confirmValueChange) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.f14391a = new AnchoredDraggableState(initialValue, new BottomSheetState$anchoredDraggableState$1(this), new BottomSheetState$anchoredDraggableState$2(this), animationSpec, confirmValueChange);
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomSheetState bottomSheetState, BottomSheetValue bottomSheetValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bottomSheetState.f14391a.getLastVelocity();
        }
        return bottomSheetState.animateTo$material_release(bottomSheetValue, f, continuation);
    }

    @Deprecated(message = "Use requireOffset() to access the offset.", replaceWith = @ReplaceWith(expression = "requireOffset()", imports = {}))
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* renamed from: a */
    public final Density m60933a() {
        Density density = this.f14392b;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomSheetState (" + this + ") was not set. Did you use BottomSheetState with the BottomSheetScaffold composable?").toString());
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomSheetValue bottomSheetValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.f14391a, bottomSheetValue, f, continuation);
        if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object collapse(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14391a, BottomSheetValue.Collapsed, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        AnchoredDraggableState anchoredDraggableState = this.f14391a;
        BottomSheetValue bottomSheetValue = BottomSheetValue.Expanded;
        if (!anchoredDraggableState.hasAnchorForValue(bottomSheetValue)) {
            bottomSheetValue = BottomSheetValue.Collapsed;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14391a, bottomSheetValue, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<BottomSheetValue> getAnchoredDraggableState$material_release() {
        return this.f14391a;
    }

    @NotNull
    public final BottomSheetValue getCurrentValue() {
        return (BottomSheetValue) this.f14391a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.f14392b;
    }

    public final float getLastVelocity$material_release() {
        return this.f14391a.getLastVelocity();
    }

    public final float getOffset() {
        throw new IllegalStateException("Use requireOffset() to access the offset.".toString());
    }

    public final float getProgress() {
        return this.f14391a.getProgress();
    }

    @NotNull
    public final BottomSheetValue getTargetValue() {
        return (BottomSheetValue) this.f14391a.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.f14391a.isAnimationRunning();
    }

    public final boolean isCollapsed() {
        if (this.f14391a.getCurrentValue() == BottomSheetValue.Collapsed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (this.f14391a.getCurrentValue() == BottomSheetValue.Expanded) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        return this.f14391a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.f14392b = density;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomSheetValue bottomSheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.f14391a, bottomSheetValue, continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull BottomSheetValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f14391a.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomSheetValue, (i & 2) != 0 ? SwipeableDefaults.INSTANCE.getAnimationSpec() : animationSpec, (i & 4) != 0 ? C30911.INSTANCE : function1);
    }
}
