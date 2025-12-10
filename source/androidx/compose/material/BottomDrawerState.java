package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
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

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 H2\u00020\u0001:\u0001HB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ%\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001e\u0010\u001bJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010)\u001a\u0004\b*\u0010+R$\u00102\u001a\u0004\u0018\u00010\u001f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010!\"\u0004\b0\u00101R\u0017\u00106\u001a\u00020\t8F¢\u0006\f\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u000bR\u001a\u00109\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010\u000bR\u0011\u0010<\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010?\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0011\u0010A\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bA\u0010@R\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010@R\u0014\u0010D\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bC\u0010@R\u0014\u0010F\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bE\u0010\u000bR\u0014\u0010G\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010@\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006I"}, m28850d2 = {"Landroidx/compose/material/BottomDrawerState;", "", "Landroidx/compose/material/BottomDrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/jvm/functions/Function1;)V", "", "requireOffset$material_release", "()F", "requireOffset", "", PDWindowsLaunchParams.OPERATION_OPEN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "expand", TypedValues.AttributesType.S_TARGET, "velocity", "animateTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "trySnapTo$material_release", "(Landroidx/compose/material/BottomDrawerValue;)Z", "trySnapTo", "value", "confirmStateChange$material_release", "Landroidx/compose/ui/unit/Density;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material/AnchoredDraggableState;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "getNestedScrollConnection$material_release", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "nestedScrollConnection", OperatorName.CURVE_TO, "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getOffset", "getOffset$annotations", "()V", TypedValues.CycleType.S_WAVE_OFFSET, "getProgress", "getProgress$annotations", "progress", "getTargetValue", "()Landroidx/compose/material/BottomDrawerValue;", "targetValue", "getCurrentValue", "currentValue", "isOpen", "()Z", "isClosed", "isExpanded", "isAnimationRunning$material_release", "isAnimationRunning", "getLastVelocity$material_release", "lastVelocity", "isOpenEnabled", "Companion", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class BottomDrawerState {

    /* renamed from: a */
    public final AnchoredDraggableState f14369a;

    /* renamed from: b */
    public final NestedScrollConnection f14370b;

    /* renamed from: c */
    public Density f14371c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke", "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.BottomDrawerState$1 */
    /* loaded from: classes.dex */
    public static final class C30751 extends Lambda implements Function1<BottomDrawerValue, Boolean> {
        public static final C30751 INSTANCE = new C30751();

        public C30751() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull BottomDrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\f"}, m28850d2 = {"Landroidx/compose/material/BottomDrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/BottomDrawerState;", "Landroidx/compose/material/BottomDrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "density", "Landroidx/compose/ui/unit/Density;", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull Density density, @NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(density, "density");
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$1.INSTANCE, new BottomDrawerState$Companion$Saver$2(density, confirmStateChange));
        }

        public Companion() {
        }

        @Deprecated(message = "This function is deprecated. Please use the overload where Density is provided.", replaceWith = @ReplaceWith(expression = "Saver(density, confirmValueChange)", imports = {}))
        @NotNull
        public final Saver<BottomDrawerState, BottomDrawerValue> Saver(@NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(BottomDrawerState$Companion$Saver$3.INSTANCE, new BottomDrawerState$Companion$Saver$4(confirmStateChange));
        }
    }

    @Deprecated(message = "This constructor is deprecated. Density must be provided by the component. Please use the constructor that provides a [Density].", replaceWith = @ReplaceWith(expression = "\n            BottomDrawerState(\n                initialValue = initialValue,\n                density =,\n                confirmStateChange = confirmStateChange\n            )\n            ", imports = {}))
    public BottomDrawerState(@NotNull BottomDrawerValue initialValue, @NotNull Function1<? super BottomDrawerValue, Boolean> confirmStateChange) {
        TweenSpec tweenSpec;
        NestedScrollConnection m60909d;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        tweenSpec = DrawerKt.f14463d;
        AnchoredDraggableState anchoredDraggableState = new AnchoredDraggableState(initialValue, new BottomDrawerState$anchoredDraggableState$1(this), new BottomDrawerState$anchoredDraggableState$2(this), tweenSpec, confirmStateChange);
        this.f14369a = anchoredDraggableState;
        m60909d = DrawerKt.m60909d(anchoredDraggableState);
        this.f14370b = m60909d;
    }

    public static /* synthetic */ Object animateTo$material_release$default(BottomDrawerState bottomDrawerState, BottomDrawerValue bottomDrawerValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = bottomDrawerState.f14369a.getLastVelocity();
        }
        return bottomDrawerState.animateTo$material_release(bottomDrawerValue, f, continuation);
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getProgress$annotations() {
    }

    /* renamed from: a */
    public final boolean m60948a() {
        return this.f14369a.hasAnchorForValue(BottomDrawerValue.Open);
    }

    @Nullable
    public final Object animateTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo = AnchoredDraggableKt.animateTo(this.f14369a, bottomDrawerValue, f, continuation);
        if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final Density m60947b() {
        Density density = this.f14371c;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on BottomDrawerState (" + this + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14369a, BottomDrawerValue.Closed, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    public final boolean confirmStateChange$material_release(@NotNull BottomDrawerValue value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ((Boolean) this.f14369a.getConfirmValueChange$material_release().invoke(value)).booleanValue();
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14369a, BottomDrawerValue.Expanded, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<BottomDrawerValue> getAnchoredDraggableState$material_release() {
        return this.f14369a;
    }

    @NotNull
    public final BottomDrawerValue getCurrentValue() {
        return (BottomDrawerValue) this.f14369a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.f14371c;
    }

    public final float getLastVelocity$material_release() {
        return this.f14369a.getLastVelocity();
    }

    @NotNull
    public final NestedScrollConnection getNestedScrollConnection$material_release() {
        return this.f14370b;
    }

    public final float getOffset() {
        return this.f14369a.getOffset();
    }

    public final float getProgress() {
        return this.f14369a.getProgress();
    }

    @NotNull
    public final BottomDrawerValue getTargetValue() {
        return (BottomDrawerValue) this.f14369a.getTargetValue();
    }

    public final boolean isAnimationRunning$material_release() {
        return this.f14369a.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (this.f14369a.getCurrentValue() == BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isExpanded() {
        if (this.f14369a.getCurrentValue() == BottomDrawerValue.Expanded) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (this.f14369a.getCurrentValue() != BottomDrawerValue.Closed) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        BottomDrawerValue bottomDrawerValue;
        if (m60948a()) {
            bottomDrawerValue = BottomDrawerValue.Open;
        } else {
            bottomDrawerValue = BottomDrawerValue.Expanded;
        }
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14369a, bottomDrawerValue, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.f14369a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.f14371c = density;
    }

    @Nullable
    public final Object snapTo$material_release(@NotNull BottomDrawerValue bottomDrawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.f14369a, bottomDrawerValue, continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material_release(@NotNull BottomDrawerValue target) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f14369a.trySnapTo$material_release(target);
    }

    public /* synthetic */ BottomDrawerState(BottomDrawerValue bottomDrawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bottomDrawerValue, (i & 2) != 0 ? C30751.INSTANCE : function1);
    }
}
