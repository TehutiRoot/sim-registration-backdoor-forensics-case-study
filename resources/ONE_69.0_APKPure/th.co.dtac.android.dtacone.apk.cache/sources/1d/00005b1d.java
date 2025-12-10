package androidx.compose.material3;

import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/unit/Density;", "it", "invoke", "(Landroidx/compose/ui/unit/Density;F)Ljava/lang/Float;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SwipeableV2Kt$fixedPositionalThreshold$1 extends Lambda implements Function2<Density, Float, Float> {
    final /* synthetic */ float $threshold;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2Kt$fixedPositionalThreshold$1(float f) {
        super(2);
        this.$threshold = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
        return invoke(density, f.floatValue());
    }

    @NotNull
    public final Float invoke(@NotNull Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Float.valueOf(density.mo69622toPx0680j_4(this.$threshold));
    }
}