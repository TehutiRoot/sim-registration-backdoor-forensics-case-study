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
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes.dex */
public final class FillNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public Direction f13135n;

    /* renamed from: o */
    public float f13136o;

    public FillNode(Direction direction, float f) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.f13135n = direction;
        this.f13136o = f;
    }

    /* renamed from: a */
    public final void m61402a(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        this.f13135n = direction;
    }

    /* renamed from: b */
    public final void m61401b(float f) {
        this.f13136o = f;
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
        int m73628getMinWidthimpl;
        int m73626getMaxWidthimpl;
        int m73625getMaxHeightimpl;
        int i;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (Constraints.m73622getHasBoundedWidthimpl(j) && this.f13135n != Direction.Vertical) {
            m73628getMinWidthimpl = AbstractC11719c.coerceIn(AbstractC21140mr0.roundToInt(Constraints.m73626getMaxWidthimpl(j) * this.f13136o), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j));
            m73626getMaxWidthimpl = m73628getMinWidthimpl;
        } else {
            m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        }
        if (Constraints.m73621getHasBoundedHeightimpl(j) && this.f13135n != Direction.Horizontal) {
            i = AbstractC11719c.coerceIn(AbstractC21140mr0.roundToInt(Constraints.m73625getMaxHeightimpl(j) * this.f13136o), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j));
            m73625getMaxHeightimpl = i;
        } else {
            int m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
            m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
            i = m73627getMinHeightimpl;
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.Constraints(m73628getMinWidthimpl, m73626getMaxWidthimpl, i, m73625getMaxHeightimpl));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new FillNode$measure$1(mo72811measureBRTryo0), 4, null);
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
