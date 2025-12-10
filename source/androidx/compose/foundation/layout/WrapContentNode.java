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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes.dex */
public final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public Direction f13342n;

    /* renamed from: o */
    public boolean f13343o;

    /* renamed from: p */
    public Function2 f13344p;

    public WrapContentNode(Direction direction, boolean z, Function2 alignmentCallback) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(alignmentCallback, "alignmentCallback");
        this.f13342n = direction;
        this.f13343o = z;
        this.f13344p = alignmentCallback;
    }

    /* renamed from: a */
    public final Function2 m61302a() {
        return this.f13344p;
    }

    /* renamed from: b */
    public final void m61301b(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f13344p = function2;
    }

    /* renamed from: c */
    public final void m61300c(Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<set-?>");
        this.f13342n = direction;
    }

    /* renamed from: d */
    public final void m61299d(boolean z) {
        this.f13343o = z;
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
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Direction direction = this.f13342n;
        Direction direction2 = Direction.Vertical;
        int i = 0;
        if (direction != direction2) {
            m73628getMinWidthimpl = 0;
        } else {
            m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        }
        Direction direction3 = this.f13342n;
        Direction direction4 = Direction.Horizontal;
        if (direction3 == direction4) {
            i = Constraints.m73627getMinHeightimpl(j);
        }
        int i2 = Integer.MAX_VALUE;
        if (this.f13342n != direction2 && this.f13343o) {
            m73626getMaxWidthimpl = Integer.MAX_VALUE;
        } else {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        }
        if (this.f13342n == direction4 || !this.f13343o) {
            i2 = Constraints.m73625getMaxHeightimpl(j);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.Constraints(m73628getMinWidthimpl, m73626getMaxWidthimpl, i, i2));
        int coerceIn = AbstractC11719c.coerceIn(mo72811measureBRTryo0.getWidth(), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j));
        int coerceIn2 = AbstractC11719c.coerceIn(mo72811measureBRTryo0.getHeight(), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j));
        return MeasureScope.CC.m59532q(measure, coerceIn, coerceIn2, null, new WrapContentNode$measure$1(this, coerceIn, mo72811measureBRTryo0, coerceIn2, measure), 4, null);
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
