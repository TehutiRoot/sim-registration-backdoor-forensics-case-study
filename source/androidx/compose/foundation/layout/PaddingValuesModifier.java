package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.AbstractC3526a;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public PaddingValues f13217n;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f13217n = paddingValues;
    }

    /* renamed from: a */
    public final PaddingValues m61347a() {
        return this.f13217n;
    }

    /* renamed from: b */
    public final void m61346b(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<set-?>");
        this.f13217n = paddingValues;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59388a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59387b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f = 0;
        if (C3641Dp.m73657compareTo0680j_4(this.f13217n.mo69157calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), C3641Dp.m73658constructorimpl(f)) >= 0 && C3641Dp.m73657compareTo0680j_4(this.f13217n.mo69159calculateTopPaddingD9Ej5fM(), C3641Dp.m73658constructorimpl(f)) >= 0 && C3641Dp.m73657compareTo0680j_4(this.f13217n.mo69158calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), C3641Dp.m73658constructorimpl(f)) >= 0 && C3641Dp.m73657compareTo0680j_4(this.f13217n.mo69156calculateBottomPaddingD9Ej5fM(), C3641Dp.m73658constructorimpl(f)) >= 0) {
            int mo69432roundToPx0680j_4 = measure.mo69432roundToPx0680j_4(this.f13217n.mo69157calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo69432roundToPx0680j_4(this.f13217n.mo69158calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
            int mo69432roundToPx0680j_42 = measure.mo69432roundToPx0680j_4(this.f13217n.mo69159calculateTopPaddingD9Ej5fM()) + measure.mo69432roundToPx0680j_4(this.f13217n.mo69156calculateBottomPaddingD9Ej5fM());
            Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.m73642offsetNN6EwU(j, -mo69432roundToPx0680j_4, -mo69432roundToPx0680j_42));
            return MeasureScope.CC.m59532q(measure, ConstraintsKt.m73640constrainWidthK40F9xA(j, mo72811measureBRTryo0.getWidth() + mo69432roundToPx0680j_4), ConstraintsKt.m73639constrainHeightK40F9xA(j, mo72811measureBRTryo0.getHeight() + mo69432roundToPx0680j_42), null, new PaddingValuesModifier$measure$2(mo72811measureBRTryo0, measure, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59386c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59385d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}
