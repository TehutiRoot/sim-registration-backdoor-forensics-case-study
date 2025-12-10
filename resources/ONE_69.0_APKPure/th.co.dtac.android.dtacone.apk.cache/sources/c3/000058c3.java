package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalMaterial3Api
@Metadata(m29143d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 12\u00020\u0001:\u00011BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012.\b\u0002\u0010\u000e\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0018H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0016\u0010'\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010*\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010-\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0012R\u0013\u00100\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m29142d2 = {"Landroidx/compose/material3/DismissState;", "", "Landroidx/compose/material3/DismissValue;", "initialValue", "Lkotlin/Function1;", "", "confirmValueChange", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "positionalThreshold", "<init>", "(Landroidx/compose/material3/DismissValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "requireOffset", "()F", "Landroidx/compose/material3/DismissDirection;", "direction", "isDismissed", "(Landroidx/compose/material3/DismissDirection;)Z", "targetValue", "", "snapTo", "(Landroidx/compose/material3/DismissValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dismiss", "(Landroidx/compose/material3/DismissDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/material3/SwipeableV2State;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material3/SwipeableV2State;", "getSwipeableState$material3_release", "()Landroidx/compose/material3/SwipeableV2State;", "swipeableState", "getOffset$material3_release", "()Ljava/lang/Float;", TypedValues.CycleType.S_WAVE_OFFSET, "getCurrentValue", "()Landroidx/compose/material3/DismissValue;", "currentValue", "getTargetValue", "getProgress", "progress", "getDismissDirection", "()Landroidx/compose/material3/DismissDirection;", "dismissDirection", "Companion", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class DismissState {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final SwipeableV2State f25833a;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DismissValue;", "invoke", "(Landroidx/compose/material3/DismissValue;)Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.DismissState$1 */
    /* loaded from: classes2.dex */
    public static final class C32651 extends Lambda implements Function1<DismissValue, Boolean> {
        public static final C32651 INSTANCE = new C32651();

        public C32651() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull DismissValue it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.TRUE;
        }
    }

    @Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2,\u0010\n\u001a(\u0012\u0004\u0012\u00020\f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u0011¨\u0006\u0012"}, m29142d2 = {"Landroidx/compose/material3/DismissState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DismissState;", "Landroidx/compose/material3/DismissValue;", "confirmValueChange", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "", "Lkotlin/ParameterName;", "name", "totalDistance", "Lkotlin/ExtensionFunctionType;", "material3_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DismissState, DismissValue> Saver(@NotNull Function1<? super DismissValue, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold) {
            Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
            Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
            return SaverKt.Saver(DismissState$Companion$Saver$1.INSTANCE, new DismissState$Companion$Saver$2(confirmValueChange, positionalThreshold));
        }

        public Companion() {
        }
    }

    public DismissState(@NotNull DismissValue initialValue, @NotNull Function1<? super DismissValue, Boolean> confirmValueChange, @NotNull Function2<? super Density, ? super Float, Float> positionalThreshold) {
        float f;
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        Intrinsics.checkNotNullParameter(confirmValueChange, "confirmValueChange");
        Intrinsics.checkNotNullParameter(positionalThreshold, "positionalThreshold");
        f = SwipeToDismissKt.f26300a;
        this.f25833a = new SwipeableV2State(initialValue, null, confirmValueChange, positionalThreshold, f, 2, null);
    }

    @Nullable
    public final Object dismiss(@NotNull DismissDirection dismissDirection, @NotNull Continuation<? super Unit> continuation) {
        DismissValue dismissValue;
        if (dismissDirection == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        Object animateTo$default = SwipeableV2State.animateTo$default(this.f25833a, dismissValue, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public final DismissValue getCurrentValue() {
        return (DismissValue) this.f25833a.getCurrentValue();
    }

    @Nullable
    public final DismissDirection getDismissDirection() {
        if (!Intrinsics.areEqual(getOffset$material3_release(), 0.0f) && getOffset$material3_release() != null) {
            Float offset$material3_release = getOffset$material3_release();
            Intrinsics.checkNotNull(offset$material3_release);
            if (offset$material3_release.floatValue() > 0.0f) {
                return DismissDirection.StartToEnd;
            }
            return DismissDirection.EndToStart;
        }
        return null;
    }

    @Nullable
    public final Float getOffset$material3_release() {
        return this.f25833a.getOffset();
    }

    public final float getProgress() {
        return this.f25833a.getProgress();
    }

    @NotNull
    public final SwipeableV2State<DismissValue> getSwipeableState$material3_release() {
        return this.f25833a;
    }

    @NotNull
    public final DismissValue getTargetValue() {
        return (DismissValue) this.f25833a.getTargetValue();
    }

    public final boolean isDismissed(@NotNull DismissDirection direction) {
        DismissValue dismissValue;
        Intrinsics.checkNotNullParameter(direction, "direction");
        DismissValue currentValue = getCurrentValue();
        if (direction == DismissDirection.StartToEnd) {
            dismissValue = DismissValue.DismissedToEnd;
        } else {
            dismissValue = DismissValue.DismissedToStart;
        }
        if (currentValue == dismissValue) {
            return true;
        }
        return false;
    }

    public final float requireOffset() {
        return this.f25833a.requireOffset();
    }

    @Nullable
    public final Object reset(@NotNull Continuation<? super Unit> continuation) {
        Object animateTo$default = SwipeableV2State.animateTo$default(this.f25833a, DismissValue.Default, 0.0f, continuation, 2, null);
        if (animateTo$default == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return animateTo$default;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object snapTo(@NotNull DismissValue dismissValue, @NotNull Continuation<? super Unit> continuation) {
        Object snapTo = this.f25833a.snapTo(dismissValue, continuation);
        if (snapTo == AbstractC19782eg0.getCOROUTINE_SUSPENDED()) {
            return snapTo;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DismissState(DismissValue dismissValue, Function1 function1, Function2<Density, Float, Float> function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dismissValue, (i & 2) != 0 ? C32651.INSTANCE : function1, (i & 4) != 0 ? SwipeToDismissDefaults.INSTANCE.getFixedPositionalThreshold() : function2);
    }
}