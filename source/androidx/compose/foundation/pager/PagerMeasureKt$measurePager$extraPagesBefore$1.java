package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.p003ui.Alignment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Landroidx/compose/foundation/pager/MeasuredPage;", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class PagerMeasureKt$measurePager$extraPagesBefore$1 extends Lambda implements Function1<Integer, MeasuredPage> {
    final /* synthetic */ long $childConstraints;
    final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
    final /* synthetic */ Orientation $orientation;
    final /* synthetic */ int $pageAvailableSize;
    final /* synthetic */ PagerLazyLayoutItemProvider $pagerItemProvider;
    final /* synthetic */ boolean $reverseLayout;
    final /* synthetic */ LazyLayoutMeasureScope $this_measurePager;
    final /* synthetic */ Alignment.Vertical $verticalAlignment;
    final /* synthetic */ long $visualPageOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$extraPagesBefore$1(LazyLayoutMeasureScope lazyLayoutMeasureScope, long j, PagerLazyLayoutItemProvider pagerLazyLayoutItemProvider, long j2, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, boolean z, int i) {
        super(1);
        this.$this_measurePager = lazyLayoutMeasureScope;
        this.$childConstraints = j;
        this.$pagerItemProvider = pagerLazyLayoutItemProvider;
        this.$visualPageOffset = j2;
        this.$orientation = orientation;
        this.$horizontalAlignment = horizontal;
        this.$verticalAlignment = vertical;
        this.$reverseLayout = z;
        this.$pageAvailableSize = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ MeasuredPage invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final MeasuredPage invoke(int i) {
        MeasuredPage m61116e;
        LazyLayoutMeasureScope lazyLayoutMeasureScope = this.$this_measurePager;
        m61116e = PagerMeasureKt.m61116e(lazyLayoutMeasureScope, i, this.$childConstraints, this.$pagerItemProvider, this.$visualPageOffset, this.$orientation, this.$horizontalAlignment, this.$verticalAlignment, lazyLayoutMeasureScope.getLayoutDirection(), this.$reverseLayout, this.$pageAvailableSize);
        return m61116e;
    }
}
