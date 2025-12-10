package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11695c;

/* loaded from: classes.dex */
public final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13360n;

    /* renamed from: o */
    public float f13361o;

    public /* synthetic */ UnspecifiedConstraintsNode(float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2);
    }

    /* renamed from: a */
    public final void m61276a(float f) {
        this.f13361o = f;
    }

    /* renamed from: b */
    public final void m61275b(float f) {
        this.f13360n = f;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int maxIntrinsicHeight = measurable.maxIntrinsicHeight(i);
        if (!C3623Dp.m73847equalsimpl0(this.f13361o, C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69616roundToPx0680j_4(this.f13361o);
        } else {
            i2 = 0;
        }
        return AbstractC11695c.coerceAtLeast(maxIntrinsicHeight, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int maxIntrinsicWidth = measurable.maxIntrinsicWidth(i);
        if (!C3623Dp.m73847equalsimpl0(this.f13360n, C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69616roundToPx0680j_4(this.f13360n);
        } else {
            i2 = 0;
        }
        return AbstractC11695c.coerceAtLeast(maxIntrinsicWidth, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69341measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int m73812getMinWidthimpl;
        int m73811getMinHeightimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        float f = this.f13360n;
        C3623Dp.Companion companion = C3623Dp.Companion;
        if (!C3623Dp.m73847equalsimpl0(f, companion.m73862getUnspecifiedD9Ej5fM()) && Constraints.m73812getMinWidthimpl(j) == 0) {
            m73812getMinWidthimpl = AbstractC11695c.coerceAtLeast(AbstractC11695c.coerceAtMost(measure.mo69616roundToPx0680j_4(this.f13360n), Constraints.m73810getMaxWidthimpl(j)), 0);
        } else {
            m73812getMinWidthimpl = Constraints.m73812getMinWidthimpl(j);
        }
        int m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        if (!C3623Dp.m73847equalsimpl0(this.f13361o, companion.m73862getUnspecifiedD9Ej5fM()) && Constraints.m73811getMinHeightimpl(j) == 0) {
            m73811getMinHeightimpl = AbstractC11695c.coerceAtLeast(AbstractC11695c.coerceAtMost(measure.mo69616roundToPx0680j_4(this.f13361o), Constraints.m73809getMaxHeightimpl(j)), 0);
        } else {
            m73811getMinHeightimpl = Constraints.m73811getMinHeightimpl(j);
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(ConstraintsKt.Constraints(m73812getMinWidthimpl, m73810getMaxWidthimpl, m73811getMinHeightimpl, Constraints.m73809getMaxHeightimpl(j)));
        return MeasureScope.CC.m59482q(measure, mo72995measureBRTryo0.getWidth(), mo72995measureBRTryo0.getHeight(), null, new UnspecifiedConstraintsNode$measure$1(mo72995measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int minIntrinsicHeight = measurable.minIntrinsicHeight(i);
        if (!C3623Dp.m73847equalsimpl0(this.f13361o, C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69616roundToPx0680j_4(this.f13361o);
        } else {
            i2 = 0;
        }
        return AbstractC11695c.coerceAtLeast(minIntrinsicHeight, i2);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int minIntrinsicWidth = measurable.minIntrinsicWidth(i);
        if (!C3623Dp.m73847equalsimpl0(this.f13360n, C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM())) {
            i2 = intrinsicMeasureScope.mo69616roundToPx0680j_4(this.f13360n);
        } else {
            i2 = 0;
        }
        return AbstractC11695c.coerceAtLeast(minIntrinsicWidth, i2);
    }

    public UnspecifiedConstraintsNode(float f, float f2) {
        this.f13360n = f;
        this.f13361o = f2;
    }
}