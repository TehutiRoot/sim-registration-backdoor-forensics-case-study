package androidx.compose.material;

import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SnackbarKt$TextOnlySnackbar$2 implements MeasurePolicy {

    /* renamed from: a */
    public static final SnackbarKt$TextOnlySnackbar$2 f14621a = new SnackbarKt$TextOnlySnackbar$2();

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
        if (measurables.size() == 1) {
            Placeable mo72811measureBRTryo0 = ((Measurable) CollectionsKt___CollectionsKt.first((List<? extends Object>) measurables)).mo72811measureBRTryo0(j);
            int i = mo72811measureBRTryo0.get(AlignmentLineKt.getFirstBaseline());
            int i2 = mo72811measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
            if (i != Integer.MIN_VALUE) {
                if (i2 != Integer.MIN_VALUE) {
                    int max = Math.max(Layout.mo69432roundToPx0680j_4(i == i2 ? SnackbarKt.f14617h : SnackbarKt.f14618i), mo72811measureBRTryo0.getHeight());
                    return MeasureScope.CC.m59532q(Layout, Constraints.m73626getMaxWidthimpl(j), max, null, new SnackbarKt$TextOnlySnackbar$2$measure$4(max, mo72811measureBRTryo0), 4, null);
                }
                throw new IllegalArgumentException("No baselines for text".toString());
            }
            throw new IllegalArgumentException("No baselines for text".toString());
        }
        throw new IllegalArgumentException("text for Snackbar expected to have exactly only one child".toString());
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
