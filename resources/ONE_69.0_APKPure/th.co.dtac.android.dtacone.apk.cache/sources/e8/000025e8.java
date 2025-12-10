package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.AbstractC3508a;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaddingValuesModifier extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public PaddingValues f13305n;

    public PaddingValuesModifier(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.f13305n = paddingValues;
    }

    /* renamed from: a */
    public final PaddingValues m61297a() {
        return this.f13305n;
    }

    /* renamed from: b */
    public final void m61296b(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "<set-?>");
        this.f13305n = paddingValues;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59338a(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59337b(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69341measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f = 0;
        if (C3623Dp.m73841compareTo0680j_4(this.f13305n.mo69343calculateLeftPaddingu2uoSUM(measure.getLayoutDirection()), C3623Dp.m73842constructorimpl(f)) >= 0 && C3623Dp.m73841compareTo0680j_4(this.f13305n.mo69345calculateTopPaddingD9Ej5fM(), C3623Dp.m73842constructorimpl(f)) >= 0 && C3623Dp.m73841compareTo0680j_4(this.f13305n.mo69344calculateRightPaddingu2uoSUM(measure.getLayoutDirection()), C3623Dp.m73842constructorimpl(f)) >= 0 && C3623Dp.m73841compareTo0680j_4(this.f13305n.mo69342calculateBottomPaddingD9Ej5fM(), C3623Dp.m73842constructorimpl(f)) >= 0) {
            int mo69616roundToPx0680j_4 = measure.mo69616roundToPx0680j_4(this.f13305n.mo69343calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo69616roundToPx0680j_4(this.f13305n.mo69344calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
            int mo69616roundToPx0680j_42 = measure.mo69616roundToPx0680j_4(this.f13305n.mo69345calculateTopPaddingD9Ej5fM()) + measure.mo69616roundToPx0680j_4(this.f13305n.mo69342calculateBottomPaddingD9Ej5fM());
            Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(ConstraintsKt.m73826offsetNN6EwU(j, -mo69616roundToPx0680j_4, -mo69616roundToPx0680j_42));
            return MeasureScope.CC.m59482q(measure, ConstraintsKt.m73824constrainWidthK40F9xA(j, mo72995measureBRTryo0.getWidth() + mo69616roundToPx0680j_4), ConstraintsKt.m73823constrainHeightK40F9xA(j, mo72995measureBRTryo0.getHeight() + mo69616roundToPx0680j_42), null, new PaddingValuesModifier$measure$2(mo72995measureBRTryo0, measure, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59336c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59335d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }
}