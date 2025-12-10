package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m29142d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", "start", "stop", "fraction", "", "ui-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.graphics.ShadowKt */
/* loaded from: classes2.dex */
public final class ShadowKt {
    @Stable
    @NotNull
    public static final Shadow lerp(@NotNull Shadow start, @NotNull Shadow stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new Shadow(ColorKt.m71969lerpjxsXWHM(start.m72199getColor0d7_KjU(), stop.m72199getColor0d7_KjU(), f), OffsetKt.m71709lerpWko1d7g(start.m72200getOffsetF1C5BW0(), stop.m72200getOffsetF1C5BW0(), f), MathHelpersKt.lerp(start.getBlurRadius(), stop.getBlurRadius(), f), null);
    }
}