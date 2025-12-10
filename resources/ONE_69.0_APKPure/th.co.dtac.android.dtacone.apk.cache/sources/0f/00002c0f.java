package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p003ui.unit.Density;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ScrollableTabData {

    /* renamed from: a */
    public final ScrollState f14670a;

    /* renamed from: b */
    public final CoroutineScope f14671b;

    /* renamed from: c */
    public Integer f14672c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f14670a = scrollState;
        this.f14671b = coroutineScope;
    }

    /* renamed from: b */
    public final int m60787b(TabPosition tabPosition, Density density, int i, List list) {
        int mo69616roundToPx0680j_4 = density.mo69616roundToPx0680j_4(((TabPosition) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).m70306getRightD9Ej5fM()) + i;
        int maxValue = mo69616roundToPx0680j_4 - this.f14670a.getMaxValue();
        return AbstractC11695c.coerceIn(density.mo69616roundToPx0680j_4(tabPosition.m70305getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo69616roundToPx0680j_4(tabPosition.m70307getWidthD9Ej5fM()) / 2)), 0, AbstractC11695c.coerceAtLeast(mo69616roundToPx0680j_4 - maxValue, 0));
    }

    /* renamed from: c */
    public final void m60786c(Density density, int i, List tabPositions, int i2) {
        int m60787b;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = this.f14672c;
        if (num == null || num.intValue() != i2) {
            this.f14672c = Integer.valueOf(i2);
            TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.getOrNull(tabPositions, i2);
            if (tabPosition != null && this.f14670a.getValue() != (m60787b = m60787b(tabPosition, density, i, tabPositions))) {
                AbstractC1539Vc.m65885e(this.f14671b, null, null, new ScrollableTabData$onLaidOut$1$1(this, m60787b, null), 3, null);
            }
        }
    }
}