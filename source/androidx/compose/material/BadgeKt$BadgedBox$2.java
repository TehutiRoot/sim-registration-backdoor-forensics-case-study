package androidx.compose.material;

import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.TuplesKt;
import kotlin.collections.AbstractC11687a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BadgeKt$BadgedBox$2 implements MeasurePolicy {

    /* renamed from: a */
    public static final BadgeKt$BadgedBox$2 f14368a = new BadgeKt$BadgedBox$2();

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1366a(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1365b(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo69194measure3p2s80s(MeasureScope Layout, List measurables, long j) {
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "badge")) {
                Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null));
                for (Measurable measurable2 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "anchor")) {
                        Placeable mo72811measureBRTryo02 = measurable2.mo72811measureBRTryo0(j);
                        return Layout.layout(mo72811measureBRTryo02.getWidth(), mo72811measureBRTryo02.getHeight(), AbstractC11687a.mapOf(TuplesKt.m28844to(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(mo72811measureBRTryo02.get(AlignmentLineKt.getFirstBaseline()))), TuplesKt.m28844to(AlignmentLineKt.getLastBaseline(), Integer.valueOf(mo72811measureBRTryo02.get(AlignmentLineKt.getLastBaseline())))), new BadgeKt$BadgedBox$2$measure$1(mo72811measureBRTryo0, Layout, mo72811measureBRTryo02));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1364c(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.p003ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return AbstractC22344tr0.m1363d(this, intrinsicMeasureScope, list, i);
    }
}
