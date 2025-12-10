package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13272n;

    /* renamed from: o */
    public float f13273o;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: a */
    public final void m61326a(float f) {
        this.f13273o = f;
    }

    /* renamed from: b */
    public final void m61325b(float f) {
        this.f13272n = f;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int maxIntrinsicHeight = measurable.maxIntrinsicHeight(i);
        if (!C3641Dp.m73663equalsimpl0(this.f13273o, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13273o);
        } else {
            i2 = 0;
        }
        return AbstractC11719c.coerceAtLeast(maxIntrinsicHeight, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int maxIntrinsicWidth = measurable.maxIntrinsicWidth(i);
        if (!C3641Dp.m73663equalsimpl0(this.f13272n, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13272n);
        } else {
            i2 = 0;
        }
        return AbstractC11719c.coerceAtLeast(maxIntrinsicWidth, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int m73628getMinWidthimpl;
        int m73627getMinHeightimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f = this.f13272n;
        C3641Dp.Companion companion = C3641Dp.Companion;
        if (!C3641Dp.m73663equalsimpl0(f, companion.m73678getUnspecifiedD9Ej5fM()) && Constraints.m73628getMinWidthimpl(j) == 0) {
            m73628getMinWidthimpl = AbstractC11719c.coerceAtLeast(AbstractC11719c.coerceAtMost(measure.mo69432roundToPx0680j_4(this.f13272n), Constraints.m73626getMaxWidthimpl(j)), 0);
        } else {
            m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        }
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        if (!C3641Dp.m73663equalsimpl0(this.f13273o, companion.m73678getUnspecifiedD9Ej5fM()) && Constraints.m73627getMinHeightimpl(j) == 0) {
            m73627getMinHeightimpl = AbstractC11719c.coerceAtLeast(AbstractC11719c.coerceAtMost(measure.mo69432roundToPx0680j_4(this.f13273o), Constraints.m73625getMaxHeightimpl(j)), 0);
        } else {
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.Constraints(m73628getMinWidthimpl, m73626getMaxWidthimpl, m73627getMinHeightimpl, Constraints.m73625getMaxHeightimpl(j)));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int minIntrinsicHeight = measurable.minIntrinsicHeight(i);
        if (!C3641Dp.m73663equalsimpl0(this.f13273o, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13273o);
        } else {
            i2 = 0;
        }
        return AbstractC11719c.coerceAtLeast(minIntrinsicHeight, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int minIntrinsicWidth = measurable.minIntrinsicWidth(i);
        if (!C3641Dp.m73663equalsimpl0(this.f13272n, C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69432roundToPx0680j_4(this.f13272n);
        } else {
            i2 = 0;
        }
        return AbstractC11719c.coerceAtLeast(minIntrinsicWidth, i2);
    }

    public UnspecifiedConstraintsNode(float f, float f2) {
        this.f13272n = f;
        this.f13273o = f2;
    }
}
