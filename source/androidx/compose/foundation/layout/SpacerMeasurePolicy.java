package androidx.compose.foundation.layout;

import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SpacerMeasurePolicy implements MeasurePolicy {

    /* renamed from: a */
    public static final SpacerMeasurePolicy f13269a = new SpacerMeasurePolicy();

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
    public MeasureResult mo69194measure3p2s80s(MeasureScope measure, List measurables, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (Constraints.m73624getHasFixedWidthimpl(j)) {
            i = Constraints.m73626getMaxWidthimpl(j);
        } else {
            i = 0;
        }
        if (Constraints.m73623getHasFixedHeightimpl(j)) {
            i2 = Constraints.m73625getMaxHeightimpl(j);
        } else {
            i2 = 0;
        }
        return MeasureScope.CC.m59532q(measure, i, i2, null, SpacerMeasurePolicy$measure$1$1.INSTANCE, 4, null);
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
