package androidx.palette.graphics;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.palette.graphics.Palette;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28852bv = {1, 0, 2}, m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\n¨\u0006\u0005"}, m28850d2 = {"get", "Landroidx/palette/graphics/Palette$Swatch;", "Landroidx/palette/graphics/Palette;", TypedValues.AttributesType.S_TARGET, "Landroidx/palette/graphics/Target;", "palette-ktx_release"}, m28849k = 2, m28848mv = {1, 1, 10})
/* loaded from: classes2.dex */
public final class PaletteKt {
    @Nullable
    public static final Palette.Swatch get(@NotNull Palette receiver, @NotNull Target target) {
        Intrinsics.checkParameterIsNotNull(receiver, "$receiver");
        Intrinsics.checkParameterIsNotNull(target, "target");
        return receiver.getSwatchForTarget(target);
    }
}
