package androidx.compose.material3;

import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "Landroidx/compose/ui/unit/Density;", "<anonymous parameter 0>", "invoke", "(Landroidx/compose/ui/unit/Density;F)Ljava/lang/Float;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSwipeToDismiss.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissDefaults$FixedPositionalThreshold$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,279:1\n154#2:280\n*S KotlinDebug\n*F\n+ 1 SwipeToDismiss.kt\nandroidx/compose/material3/SwipeToDismissDefaults$FixedPositionalThreshold$1\n*L\n276#1:280\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeToDismissDefaults$FixedPositionalThreshold$1 extends Lambda implements Function2<Density, Float, Float> {
    public static final SwipeToDismissDefaults$FixedPositionalThreshold$1 INSTANCE = new SwipeToDismissDefaults$FixedPositionalThreshold$1();

    public SwipeToDismissDefaults$FixedPositionalThreshold$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Float invoke(Density density, Float f) {
        return invoke(density, f.floatValue());
    }

    @NotNull
    public final Float invoke(@NotNull Density density, float f) {
        Intrinsics.checkNotNullParameter(density, "$this$null");
        return Float.valueOf(density.mo69438toPx0680j_4(C3641Dp.m73658constructorimpl(56)));
    }
}
