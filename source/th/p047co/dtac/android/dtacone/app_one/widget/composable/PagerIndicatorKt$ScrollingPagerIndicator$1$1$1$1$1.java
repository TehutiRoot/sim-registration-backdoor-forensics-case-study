package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.PagerIndicatorKt$ScrollingPagerIndicator$1$1$1$1$1 */
/* loaded from: classes7.dex */
public final class PagerIndicatorKt$ScrollingPagerIndicator$1$1$1$1$1 extends Lambda implements Function1<GraphicsLayerScope, Unit> {
    final /* synthetic */ float $xTranslation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerIndicatorKt$ScrollingPagerIndicator$1$1$1$1$1(float f) {
        super(1);
        this.$xTranslation = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
        invoke2(graphicsLayerScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setClip(true);
        graphicsLayer.setShape(RoundedCornerShapeKt.getCircleShape());
        graphicsLayer.setTranslationX(graphicsLayer.mo69438toPx0680j_4(this.$xTranslation));
    }
}
