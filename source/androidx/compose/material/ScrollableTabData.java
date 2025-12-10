package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p003ui.unit.Density;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ScrollableTabData {

    /* renamed from: a */
    public final ScrollState f14582a;

    /* renamed from: b */
    public final CoroutineScope f14583b;

    /* renamed from: c */
    public Integer f14584c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f14582a = scrollState;
        this.f14583b = coroutineScope;
    }

    /* renamed from: b */
    public final int m60837b(TabPosition tabPosition, Density density, int i, List list) {
        int mo69432roundToPx0680j_4 = density.mo69432roundToPx0680j_4(((TabPosition) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).m70122getRightD9Ej5fM()) + i;
        int maxValue = mo69432roundToPx0680j_4 - this.f14582a.getMaxValue();
        return AbstractC11719c.coerceIn(density.mo69432roundToPx0680j_4(tabPosition.m70121getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo69432roundToPx0680j_4(tabPosition.m70123getWidthD9Ej5fM()) / 2)), 0, AbstractC11719c.coerceAtLeast(mo69432roundToPx0680j_4 - maxValue, 0));
    }

    /* renamed from: c */
    public final void m60836c(Density density, int i, List tabPositions, int i2) {
        int m60837b;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = this.f14584c;
        if (num == null || num.intValue() != i2) {
            this.f14584c = Integer.valueOf(i2);
            TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.getOrNull(tabPositions, i2);
            if (tabPosition != null && this.f14582a.getValue() != (m60837b = m60837b(tabPosition, density, i, tabPositions))) {
                AbstractC1552Vc.m65753e(this.f14583b, null, null, new ScrollableTabData$onLaidOut$1$1(this, m60837b, null), 3, null);
            }
        }
    }
}
