package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
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
@ExperimentalMaterial3Api
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0013\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J%\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R(\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0011\u00102\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b0\u00101R\u0011\u0010\u0014\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b3\u00101R\u0011\u00104\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0011\u00106\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b5\u0010%R\u0011\u00108\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b7\u0010%R\u0016\u0010;\u001a\u0004\u0018\u00010\u000b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, m28850d2 = {"Landroidx/compose/material3/SheetState;", "", "", "skipPartiallyExpanded", "Landroidx/compose/material3/SheetValue;", "initialValue", "Lkotlin/Function1;", "confirmValueChange", "skipHiddenState", "<init>", "(ZLandroidx/compose/material3/SheetValue;Lkotlin/jvm/functions/Function1;Z)V", "", "requireOffset", "()F", "", "expand", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "partialExpand", "show", "hide", "targetValue", "velocity", "animateTo$material3_release", "(Landroidx/compose/material3/SheetValue;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateTo", "snapTo$material3_release", "(Landroidx/compose/material3/SheetValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "snapTo", "trySnapTo$material3_release", "(Landroidx/compose/material3/SheetValue;)Z", "trySnapTo", "settle$material3_release", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "settle", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getSkipPartiallyExpanded$material3_release", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSkipHiddenState$material3_release", "Landroidx/compose/material3/SwipeableV2State;", OperatorName.CURVE_TO, "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "setSwipeableState$material3_release", "(Landroidx/compose/material3/SwipeableV2State;)V", "swipeableState", "getCurrentValue", "()Landroidx/compose/material3/SheetValue;", "currentValue", "getTargetValue", "isVisible", "getHasExpandedState", "hasExpandedState", "getHasPartiallyExpandedState", "hasPartiallyExpandedState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "Companion", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class SheetState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final boolean f26057a;

    /* renamed from: b */
    public final boolean f26058b;

    /* renamed from: c */
    public SwipeableV2State f26059c;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SheetValue;", "invoke", "(Landroidx/compose/material3/SheetValue;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.SheetState$1 */
    /* loaded from: classes2.dex */
    public static final class C33591 extends Lambda implements Function1<SheetValue, Boolean> {
        public static final C33591 INSTANCE = new C33591();

        public C33591() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull SheetValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\n¨\u0006\u000b"}, m28850d2 = {"Landroidx/compose/material3/SheetState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/SheetState;", "Landroidx/compose/material3/SheetValue;", "skipPartiallyExpanded", "", "confirmValueChange", "Lkotlin/Function1;", "material3_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<SheetState, SheetValue> Saver(boolean z, @NotNull Function1<? super SheetValue, Boolean> confirmValueChange) {
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            return SaverKt.Saver(SheetState$Companion$Saver$1.INSTANCE, new SheetState$Companion$Saver$2(z, confirmValueChange));
        }

        public Companion() {
        }
    }

    public SheetState(boolean z, @NotNull SheetValue initialValue, @NotNull Function1<? super SheetValue, Boolean> confirmValueChange, boolean z2) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        this.f26057a = z;
        this.f26058b = z2;
        if (z && initialValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.".toString());
        }
        if (z2 && initialValue == SheetValue.Hidden) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.".toString());
        }
        this.f26059c = new SwipeableV2State(initialValue, SwipeableV2Defaults.INSTANCE.getAnimationSpec(), confirmValueChange, null, 0.0f, 24, null);
    }

    public static /* synthetic */ Object animateTo$material3_release$default(SheetState sheetState, SheetValue sheetValue, float f, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            f = sheetState.f26059c.getLastVelocity();
        }
        return sheetState.animateTo$material3_release(sheetValue, f, continuation);
    }

    @Nullable
    public final Object animateTo$material3_release(@NotNull SheetValue sheetValue, float f, @NotNull Continuation<? super Unit> continuation) {
        Object animateTo = this.f26059c.animateTo(sheetValue, f, continuation);
        if (animateTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object expand(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.f26059c, SheetValue.Expanded, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final SheetValue getCurrentValue() {
        return (SheetValue) this.f26059c.getCurrentValue();
    }

    public final boolean getHasExpandedState() {
        return this.f26059c.hasAnchorForValue(SheetValue.Expanded);
    }

    public final boolean getHasPartiallyExpandedState() {
        return this.f26059c.hasAnchorForValue(SheetValue.PartiallyExpanded);
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return this.f26059c.getOffset();
    }

    public final boolean getSkipHiddenState$material3_release() {
        return this.f26058b;
    }

    public final boolean getSkipPartiallyExpanded$material3_release() {
        return this.f26057a;
    }

    @NotNull
    public final SwipeableV2State<SheetValue> getSwipeableState$material3_release() {
        return this.f26059c;
    }

    @NotNull
    public final SheetValue getTargetValue() {
        return (SheetValue) this.f26059c.getTargetValue();
    }

    @Nullable
    public final Object hide(@NotNull Continuation<? super Unit> continuation) {
        if (!this.f26058b) {
            Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.Hidden, 0.0f, continuation, 2, null);
            if (animateTo$material3_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateTo$material3_release$default;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.".toString());
    }

    public final boolean isVisible() {
        if (this.f26059c.getCurrentValue() != SheetValue.Hidden) {
            return true;
        }
        return false;
    }

    @Nullable
    public final Object partialExpand(@NotNull Continuation<? super Unit> continuation) {
        if (!this.f26057a) {
            Object animateTo$material3_release$default = animateTo$material3_release$default(this, SheetValue.PartiallyExpanded, 0.0f, continuation, 2, null);
            if (animateTo$material3_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
                return animateTo$material3_release$default;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.".toString());
    }

    public final float requireOffset() {
        return this.f26059c.requireOffset();
    }

    public final void setSwipeableState$material3_release(@NotNull SwipeableV2State<SheetValue> swipeableV2State) {
        Intrinsics.checkNotNullParameter(swipeableV2State, "<set-?>");
        this.f26059c = swipeableV2State;
    }

    @Nullable
    public final Object settle$material3_release(float f, @NotNull Continuation<? super Unit> continuation) {
        Object obj = this.f26059c.settle(f, continuation);
        if (obj == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return obj;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object show(@NotNull Continuation<? super Unit> continuation) {
        SheetValue sheetValue;
        if (getHasPartiallyExpandedState()) {
            sheetValue = SheetValue.PartiallyExpanded;
        } else {
            sheetValue = SheetValue.Expanded;
        }
        Object animateTo$material3_release$default = animateTo$material3_release$default(this, sheetValue, 0.0f, continuation, 2, null);
        if (animateTo$material3_release$default == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return animateTo$material3_release$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo$material3_release(@NotNull SheetValue sheetValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = this.f26059c.snapTo(sheetValue, continuation);
        if (snapTo == AbstractC18812Yf0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public final boolean trySnapTo$material3_release(@NotNull SheetValue targetValue) {
        Intrinsics.checkNotNullParameter(targetValue, "targetValue");
        return this.f26059c.trySnapTo$material3_release(targetValue);
    }

    public /* synthetic */ SheetState(boolean z, SheetValue sheetValue, Function1 function1, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? SheetValue.Hidden : sheetValue, (i & 4) != 0 ? C33591.INSTANCE : function1, (i & 8) != 0 ? false : z2);
    }
}
