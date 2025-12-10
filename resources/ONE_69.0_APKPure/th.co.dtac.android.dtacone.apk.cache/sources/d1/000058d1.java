package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.tom_roush.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams;
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
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0001-B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010 \u001a\u00020\u00028F¢\u0006\f\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010!\u001a\u00020\u00058F¢\u0006\f\u0012\u0004\b#\u0010\u001b\u001a\u0004\b!\u0010\"R\u0017\u0010\r\u001a\u00020\u00028F¢\u0006\f\u0012\u0004\b%\u0010\u001b\u001a\u0004\b$\u0010\u001eR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0&8F¢\u0006\f\u0012\u0004\b)\u0010\u001b\u001a\u0004\b'\u0010(R\u0011\u0010+\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0011\u0010,\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, m29142d2 = {"Landroidx/compose/material3/DrawerState;", "", "Landroidx/compose/material3/DrawerValue;", "initialValue", "Lkotlin/Function1;", "", "confirmStateChange", "<init>", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;)V", "", PDWindowsLaunchParams.OPERATION_OPEN, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "targetValue", "Landroidx/compose/animation/core/AnimationSpec;", "", "anim", "animateTo", "(Landroidx/compose/material3/DrawerValue;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "(Landroidx/compose/material3/DrawerValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableState;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableState;", "getSwipeableState$material3_release$annotations", "()V", "swipeableState", "getCurrentValue", "()Landroidx/compose/material3/DrawerValue;", "getCurrentValue$annotations", "currentValue", "isAnimationRunning", "()Z", "isAnimationRunning$annotations", "getTargetValue", "getTargetValue$annotations", "Landroidx/compose/runtime/State;", "getOffset", "()Landroidx/compose/runtime/State;", "getOffset$annotations", TypedValues.CycleType.S_WAVE_OFFSET, "isOpen", "isClosed", "Companion", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DrawerState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final SwipeableState f25845a;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DrawerValue;", "invoke", "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.DrawerState$1 */
    /* loaded from: classes2.dex */
    public static final class C32671 extends Lambda implements Function1<DrawerValue, Boolean> {
        public static final C32671 INSTANCE = new C32671();

        public C32671() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DrawerValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, m29142d2 = {"Landroidx/compose/material3/DrawerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DrawerState;", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "Lkotlin/Function1;", "", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
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
        tweenSpec = NavigationDrawerKt.f26001c;
        this.f25845a = new SwipeableState(initialValue, tweenSpec, confirmStateChange);
    }

    public static /* synthetic */ void getCurrentValue$annotations() {
    }

    public static /* synthetic */ void getOffset$annotations() {
    }

    public static /* synthetic */ void getSwipeableState$material3_release$annotations() {
    }

    public static /* synthetic */ void getTargetValue$annotations() {
    }

    public static /* synthetic */ void isAnimationRunning$annotations() {
    }

    @Nullable
    public final Object animateTo(@NotNull DrawerValue drawerValue, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo$material3_release = this.f25845a.animateTo$material3_release(drawerValue, animationSpec, continuation);
        if (animateTo$material3_release == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material3_release;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object close(@NotNull Continuation<? super Unit> continuation) {
        TweenSpec tweenSpec;
        DrawerValue drawerValue = DrawerValue.Closed;
        tweenSpec = NavigationDrawerKt.f26001c;
        Object animateTo = animateTo(drawerValue, tweenSpec, continuation);
        if (animateTo == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DrawerValue getCurrentValue() {
        return (DrawerValue) this.f25845a.getCurrentValue();
    }

    @NotNull
    public final State<Float> getOffset() {
        return this.f25845a.getOffset();
    }

    @NotNull
    public final SwipeableState<DrawerValue> getSwipeableState$material3_release() {
        return this.f25845a;
    }

    @NotNull
    public final DrawerValue getTargetValue() {
        return (DrawerValue) this.f25845a.getTargetValue$material3_release();
    }

    public final boolean isAnimationRunning() {
        return this.f25845a.isAnimationRunning();
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
        TweenSpec tweenSpec;
        DrawerValue drawerValue = DrawerValue.Open;
        tweenSpec = NavigationDrawerKt.f26001c;
        Object animateTo = animateTo(drawerValue, tweenSpec, continuation);
        if (animateTo == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull DrawerValue drawerValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo$material3_release = this.f25845a.snapTo$material3_release(drawerValue, continuation);
        if (snapTo$material3_release == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return snapTo$material3_release;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DrawerState(DrawerValue drawerValue, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawerValue, (i & 2) != 0 ? C32671.INSTANCE : function1);
    }
}