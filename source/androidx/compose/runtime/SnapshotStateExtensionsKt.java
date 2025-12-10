package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0007\u001a\u0012\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\t0\u0002H\u0007\u001a\u0012\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¨\u0006\r"}, m28850d2 = {"asDoubleState", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/State;", "", "asFloatState", "Landroidx/compose/runtime/FloatState;", "", "asIntState", "Landroidx/compose/runtime/IntState;", "", "asLongState", "Landroidx/compose/runtime/LongState;", "", "runtime_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class SnapshotStateExtensionsKt {
    @Stable
    @NotNull
    public static final DoubleState asDoubleState(@NotNull State<Double> state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        if (state instanceof DoubleState) {
            return (DoubleState) state;
        }
        return new UnboxedDoubleState(state);
    }

    @Stable
    @NotNull
    public static final FloatState asFloatState(@NotNull State<Float> state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        if (state instanceof FloatState) {
            return (FloatState) state;
        }
        return new UnboxedFloatState(state);
    }

    @Stable
    @NotNull
    public static final IntState asIntState(@NotNull State<Integer> state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        if (state instanceof IntState) {
            return (IntState) state;
        }
        return new UnboxedIntState(state);
    }

    @Stable
    @NotNull
    public static final LongState asLongState(@NotNull State<Long> state) {
        Intrinsics.checkNotNullParameter(state, "<this>");
        if (state instanceof LongState) {
            return (LongState) state;
        }
        return new UnboxedLongState(state);
    }
}
