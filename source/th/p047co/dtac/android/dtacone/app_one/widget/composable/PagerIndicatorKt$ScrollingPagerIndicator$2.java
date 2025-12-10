package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.PagerIndicatorKt$ScrollingPagerIndicator$2 */
/* loaded from: classes7.dex */
public final class PagerIndicatorKt$ScrollingPagerIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $activeColor;
    final /* synthetic */ float $dotSize;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ int $maximumVisible;
    final /* synthetic */ float $miniDotSize;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ float $space;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerIndicatorKt$ScrollingPagerIndicator$2(PagerState pagerState, long j, Modifier modifier, long j2, int i, float f, float f2, float f3, int i2, int i3) {
        super(2);
        this.$pagerState = pagerState;
        this.$activeColor = j;
        this.$modifier = modifier;
        this.$inactiveColor = j2;
        this.$maximumVisible = i;
        this.$dotSize = f;
        this.$miniDotSize = f2;
        this.$space = f3;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        PagerIndicatorKt.m74949ScrollingPagerIndicatorP3dhf8A(this.$pagerState, this.$activeColor, this.$modifier, this.$inactiveColor, this.$maximumVisible, this.$dotSize, this.$miniDotSize, this.$space, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
