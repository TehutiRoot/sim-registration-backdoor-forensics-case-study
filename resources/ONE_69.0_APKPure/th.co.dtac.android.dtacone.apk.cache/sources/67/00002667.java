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
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;

/* loaded from: classes.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public Direction f13430n;

    /* renamed from: o */
    public boolean f13431o;

    /* renamed from: p */
    public Function2 f13432p;

    public WrapContentNode(Direction direction, boolean z, Function2 alignmentCallback) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        this.f13430n = direction;
        this.f13431o = z;
        this.f13432p = alignmentCallback;
    }

    /* renamed from: a */
    public final Function2 m61252a() {
        return this.f13432p;
    }

    /* renamed from: b */
    public final void m61251b(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f13432p = function2;
    }

    /* renamed from: c */
    public final void m61250c(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        this.f13430n = direction;
    }

    /* renamed from: d */
    public final void m61249d(boolean z) {
        this.f13431o = z;
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
        int m73812getMinWidthimpl;
        int m73810getMaxWidthimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Direction direction = this.f13430n;
        Direction direction2 = Direction.Vertical;
        int i = 0;
        if (direction != direction2) {
            m73812getMinWidthimpl = 0;
        } else {
            m73812getMinWidthimpl = Constraints.m73812getMinWidthimpl(j);
        }
        Direction direction3 = this.f13430n;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i = Constraints.m73811getMinHeightimpl(j);
        }
        int i2 = Integer.MAX_VALUE;
        if (this.f13430n != direction2 && this.f13431o) {
            m73810getMaxWidthimpl = Integer.MAX_VALUE;
        } else {
            m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        }
        if (this.f13430n == direction4 || !this.f13431o) {
            i2 = Constraints.m73809getMaxHeightimpl(j);
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(ConstraintsKt.Constraints(m73812getMinWidthimpl, m73810getMaxWidthimpl, i, i2));
        int coerceIn = AbstractC11695c.coerceIn(mo72995measureBRTryo0.getWidth(), Constraints.m73812getMinWidthimpl(j), Constraints.m73810getMaxWidthimpl(j));
        int coerceIn2 = AbstractC11695c.coerceIn(mo72995measureBRTryo0.getHeight(), Constraints.m73811getMinHeightimpl(j), Constraints.m73809getMaxHeightimpl(j));
        return MeasureScope.CC.m59482q(measure, coerceIn, coerceIn2, null, new WrapContentNode$measure$1(this, coerceIn, mo72995measureBRTryo0, coerceIn2, measure), 4, null);
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