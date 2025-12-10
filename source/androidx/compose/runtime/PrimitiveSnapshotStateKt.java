package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"Jn1"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class PrimitiveSnapshotStateKt {
    public static final float getValue(@NotNull FloatState floatState, @Nullable Object obj, @NotNull KProperty<?> kProperty) {
        return AbstractC17876Jn1.m67682a(floatState, obj, kProperty);
    }

    @StateFactoryMarker
    @NotNull
    public static final MutableFloatState mutableFloatStateOf(float f) {
        return AbstractC17876Jn1.m67681b(f);
    }

    public static final void setValue(@NotNull MutableFloatState mutableFloatState, @Nullable Object obj, @NotNull KProperty<?> kProperty, float f) {
        AbstractC17876Jn1.m67680c(mutableFloatState, obj, kProperty, f);
    }
}
