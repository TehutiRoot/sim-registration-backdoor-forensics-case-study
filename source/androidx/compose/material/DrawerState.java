package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Stable
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001a\"\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020\u000f8GX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u0016R\u0011\u0010-\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b/\u0010.R\u0011\u00101\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b0\u0010'R\u0011\u00102\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b2\u0010.\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, m28850d2 = {"Landroidx/compose/material/DrawerState;", "", "Landroidx/compose/material/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", PDWindowsLaunchParams.OPERATION_OPEN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requireOffset$material_release", "()F", "requireOffset", "Landroidx/compose/ui/unit/Density;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Landroidx/compose/ui/unit/Density;", "Landroidx/compose/material/AnchoredDraggableState;", "Landroidx/compose/material/AnchoredDraggableState;", "getAnchoredDraggableState$material_release", "()Landroidx/compose/material/AnchoredDraggableState;", "anchoredDraggableState", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/unit/Density;", "getDensity$material_release", "setDensity$material_release", "(Landroidx/compose/ui/unit/Density;)V", "density", "getTargetValue", "()Landroidx/compose/material/DrawerValue;", "getTargetValue$annotations", "()V", "getOffset", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "isOpen", "()Z", "isClosed", "getCurrentValue", "currentValue", "isAnimationRunning", "Companion", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DrawerState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final AnchoredDraggableState f14468a;

    /* renamed from: b */
    public Density f14469b;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material.DrawerState$1 */
    /* loaded from: classes.dex */
    public static final class C31151 extends Lambda implements Function1<DrawerValue, Boolean> {
        public static final C31151 INSTANCE = new C31151();

        public C31151() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m28850d2 = {"Landroidx/compose/material/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material/DrawerState;", "Landroidx/compose/material/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DrawerState, DrawerValue> Saver(@NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
            Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
            return SaverKt.Saver(DrawerState$Companion$Saver$1.INSTANCE, new DrawerState$Companion$Saver$2(confirmStateChange));
        }

        public Companion() {
        }
    }

    public DrawerState(@NotNull DrawerValue initialValue, @NotNull Function1<? super DrawerValue, Boolean> confirmStateChange) {
        TweenSpec tweenSpec;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmStateChange, "confirmStateChange");
        tweenSpec = DrawerKt.f14463d;
        this.f14468a = new AnchoredDraggableState(initialValue, new DrawerState$anchoredDraggableState$1(this), new DrawerState$anchoredDraggableState$2(this), tweenSpec, confirmStateChange);
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getOffset$annotations() {
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getTargetValue$annotations() {
    }

    /* renamed from: a */
    public final Density m60902a() {
        Density density = this.f14469b;
        if (density != null) {
            return density;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + this + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This method has been replaced by the open and close methods. The animation spec is now an implementation detail of ModalDrawer.")
    @ExperimentalMaterialApi
    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14468a, drawerValue, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14468a, DrawerValue.Closed, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final AnchoredDraggableState<DrawerValue> getAnchoredDraggableState$material_release() {
        return this.f14468a;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return (DrawerValue) this.f14468a.getCurrentValue();
    }

    @Nullable
    public final Density getDensity$material_release() {
        return this.f14469b;
    }

    @ExperimentalMaterialApi
    public final float getOffset() {
        return this.f14468a.getOffset();
    }

    @ExperimentalMaterialApi
    @NotNull
    public final DrawerValue getTargetValue() {
        return (DrawerValue) this.f14468a.getTargetValue();
    }

    public final boolean isAnimationRunning() {
        return this.f14468a.isAnimationRunning();
    }

    public final boolean isClosed() {
        if (getCurrentValue() == DrawerValue.Closed) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getCurrentValue() == DrawerValue.Open) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object open(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = AnchoredDraggableKt.animateTo$default(this.f14468a, DrawerValue.Open, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    public final float requireOffset$material_release() {
        return this.f14468a.requireOffset();
    }

    public final void setDensity$material_release(@Nullable Density density) {
        this.f14469b = density;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = AnchoredDraggableKt.snapTo(this.f14468a, drawerValue, continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C31151.INSTANCE : function1);
    }
}
