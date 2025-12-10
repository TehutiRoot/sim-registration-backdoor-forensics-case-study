package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes.dex */
public final class ScrollingLayoutNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public ScrollState f12921n;

    /* renamed from: o */
    public boolean f12922o;

    /* renamed from: p */
    public boolean f12923p;

    public ScrollingLayoutNode(ScrollState scrollerState, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(scrollerState, "scrollerState");
        this.f12921n = scrollerState;
        this.f12922o = z;
        this.f12923p = z2;
    }

    /* renamed from: a */
    public final ScrollState m61536a() {
        return this.f12921n;
    }

    /* renamed from: b */
    public final boolean m61535b() {
        return this.f12922o;
    }

    /* renamed from: c */
    public final boolean m61534c() {
        return this.f12923p;
    }

    /* renamed from: d */
    public final void m61533d(boolean z) {
        this.f12922o = z;
    }

    /* renamed from: e */
    public final void m61532e(ScrollState scrollState) {
        Intrinsics.checkNotNullParameter(scrollState, "<set-?>");
        this.f12921n = scrollState;
    }

    /* renamed from: f */
    public final void m61531f(boolean z) {
        this.f12923p = z;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.f12923p) {
            return measurable.maxIntrinsicHeight(i);
        }
        return measurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.f12923p) {
            return measurable.maxIntrinsicWidth(Integer.MAX_VALUE);
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Orientation orientation;
        int m73625getMaxHeightimpl;
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.f12923p) {
            orientation = Orientation.Vertical;
        } else {
            orientation = Orientation.Horizontal;
        }
        CheckScrollableContainerConstraintsKt.m69340checkScrollableContainerConstraintsK40F9xA(j, orientation);
        if (this.f12923p) {
            m73625getMaxHeightimpl = Integer.MAX_VALUE;
        } else {
            m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        }
        if (this.f12923p) {
            i = Constraints.m73626getMaxWidthimpl(j);
        } else {
            i = Integer.MAX_VALUE;
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints.m73618copyZbe2FdA$default(j, 0, i, 0, m73625getMaxHeightimpl, 5, null));
        int coerceAtMost = AbstractC11719c.coerceAtMost(mo72811measureBRTryo0.getWidth(), Constraints.m73626getMaxWidthimpl(j));
        int coerceAtMost2 = AbstractC11719c.coerceAtMost(mo72811measureBRTryo0.getHeight(), Constraints.m73625getMaxHeightimpl(j));
        int height = mo72811measureBRTryo0.getHeight() - coerceAtMost2;
        int width = mo72811measureBRTryo0.getWidth() - coerceAtMost;
        if (!this.f12923p) {
            height = width;
        }
        this.f12921n.setMaxValue$foundation_release(height);
        ScrollState scrollState = this.f12921n;
        if (this.f12923p) {
            i2 = coerceAtMost2;
        } else {
            i2 = coerceAtMost;
        }
        scrollState.setViewportSize$foundation_release(i2);
        return MeasureScope.CC.m59532q(measure, coerceAtMost, coerceAtMost2, null, new ScrollingLayoutNode$measure$1(this, height, mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.f12923p) {
            return measurable.minIntrinsicHeight(i);
        }
        return measurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (this.f12923p) {
            return measurable.minIntrinsicWidth(Integer.MAX_VALUE);
        }
        return measurable.minIntrinsicWidth(i);
    }
}
