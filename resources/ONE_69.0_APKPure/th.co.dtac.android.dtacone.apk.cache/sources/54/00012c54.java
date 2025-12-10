package th.p047co.dtac.android.dtacone.view.appOne.common.composable;

import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, m29142d2 = {"shimmerEffect", "Landroidx/compose/ui/Modifier;", "startColor", "Landroidx/compose/ui/graphics/Color;", "endColor", "direction", "Lth/co/dtac/android/dtacone/view/appOne/common/composable/ShimmerDirection;", "durationMillis", "", "shimmerEffect-1wkBAMs", "(Landroidx/compose/ui/Modifier;JJLth/co/dtac/android/dtacone/view/appOne/common/composable/ShimmerDirection;I)Landroidx/compose/ui/Modifier;", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.composable.ModifierHelperKt */
/* loaded from: classes10.dex */
public final class ModifierHelperKt {
    @NotNull
    /* renamed from: shimmerEffect-1wkBAMs  reason: not valid java name */
    public static final Modifier m75162shimmerEffect1wkBAMs(@NotNull Modifier shimmerEffect, long j, long j2, @NotNull ShimmerDirection direction, int i) {
        Intrinsics.checkNotNullParameter(shimmerEffect, "$this$shimmerEffect");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return ComposedModifierKt.composed$default(shimmerEffect, null, new ModifierHelperKt$shimmerEffect$1(i, direction, j, j2), 1, null);
    }

    /* renamed from: shimmerEffect-1wkBAMs$default  reason: not valid java name */
    public static /* synthetic */ Modifier m75163shimmerEffect1wkBAMs$default(Modifier modifier, long j, long j2, ShimmerDirection shimmerDirection, int i, int i2, Object obj) {
        long j3;
        long j4;
        ShimmerDirection shimmerDirection2;
        int i3;
        if ((i2 & 1) != 0) {
            j3 = Color.m71918copywmQWz5c$default(Color.Companion.m71951getLightGray0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j3 = j;
        }
        if ((i2 & 2) != 0) {
            j4 = Color.m71918copywmQWz5c$default(Color.Companion.m71951getLightGray0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            j4 = j2;
        }
        if ((i2 & 4) != 0) {
            shimmerDirection2 = ShimmerDirection.TopToBottom;
        } else {
            shimmerDirection2 = shimmerDirection;
        }
        if ((i2 & 8) != 0) {
            i3 = 1000;
        } else {
            i3 = i;
        }
        return m75162shimmerEffect1wkBAMs(modifier, j3, j4, shimmerDirection2, i3);
    }
}