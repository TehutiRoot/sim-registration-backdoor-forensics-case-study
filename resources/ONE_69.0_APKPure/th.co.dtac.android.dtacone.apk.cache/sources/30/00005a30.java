package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.p003ui.unit.Density;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes2.dex */
public final class ScrollableTabData {

    /* renamed from: a */
    public final ScrollState f26075a;

    /* renamed from: b */
    public final CoroutineScope f26076b;

    /* renamed from: c */
    public Integer f26077c;

    public ScrollableTabData(ScrollState scrollState, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f26075a = scrollState;
        this.f26076b = coroutineScope;
    }

    /* renamed from: b */
    public final int m60526b(TabPosition tabPosition, Density density, int i, List list) {
        int mo69616roundToPx0680j_4 = density.mo69616roundToPx0680j_4(((TabPosition) CollectionsKt___CollectionsKt.last((List<? extends Object>) list)).m70839getRightD9Ej5fM()) + i;
        int maxValue = mo69616roundToPx0680j_4 - this.f26075a.getMaxValue();
        return AbstractC11695c.coerceIn(density.mo69616roundToPx0680j_4(tabPosition.m70838getLeftD9Ej5fM()) - ((maxValue / 2) - (density.mo69616roundToPx0680j_4(tabPosition.m70840getWidthD9Ej5fM()) / 2)), 0, AbstractC11695c.coerceAtLeast(mo69616roundToPx0680j_4 - maxValue, 0));
    }

    /* renamed from: c */
    public final void m60525c(Density density, int i, List tabPositions, int i2) {
        int m60526b;
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        Integer num = this.f26077c;
        if (num == null || num.intValue() != i2) {
            this.f26077c = Integer.valueOf(i2);
            TabPosition tabPosition = (TabPosition) CollectionsKt___CollectionsKt.getOrNull(tabPositions, i2);
            if (tabPosition != null && this.f26075a.getValue() != (m60526b = m60526b(tabPosition, density, i, tabPositions))) {
                AbstractC1539Vc.m65885e(this.f26076b, null, null, new ScrollableTabData$onLaidOut$1$1(this, m60526b, null), 3, null);
            }
        }
    }
}