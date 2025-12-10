package androidx.compose.foundation.lazy;

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
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13546n;

    /* renamed from: o */
    public State f13547o;

    /* renamed from: p */
    public State f13548p;

    public ParentSizeNode(float f, State state, State state2) {
        this.f13546n = f;
        this.f13547o = state;
        this.f13548p = state2;
    }

    /* renamed from: a */
    public final float m61209a() {
        return this.f13546n;
    }

    /* renamed from: b */
    public final State m61208b() {
        return this.f13548p;
    }

    /* renamed from: c */
    public final State m61207c() {
        return this.f13547o;
    }

    /* renamed from: d */
    public final void m61206d(float f) {
        this.f13546n = f;
    }

    /* renamed from: e */
    public final void m61205e(State state) {
        this.f13548p = state;
    }

    /* renamed from: f */
    public final void m61204f(State state) {
        this.f13547o = state;
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
        int i;
        int i2;
        int m73812getMinWidthimpl;
        int m73811getMinHeightimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        State state = this.f13547o;
        if (state != null && ((Number) state.getValue()).intValue() != Integer.MAX_VALUE) {
            i = AbstractC22237sr0.roundToInt(((Number) state.getValue()).floatValue() * this.f13546n);
        } else {
            i = Integer.MAX_VALUE;
        }
        State state2 = this.f13548p;
        if (state2 != null && ((Number) state2.getValue()).intValue() != Integer.MAX_VALUE) {
            i2 = AbstractC22237sr0.roundToInt(((Number) state2.getValue()).floatValue() * this.f13546n);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i != Integer.MAX_VALUE) {
            m73812getMinWidthimpl = i;
        } else {
            m73812getMinWidthimpl = Constraints.m73812getMinWidthimpl(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            m73811getMinHeightimpl = i2;
        } else {
            m73811getMinHeightimpl = Constraints.m73811getMinHeightimpl(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.m73810getMaxWidthimpl(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.m73809getMaxHeightimpl(j);
        }
        Placeable mo72995measureBRTryo0 = measurable.mo72995measureBRTryo0(ConstraintsKt.Constraints(m73812getMinWidthimpl, i, m73811getMinHeightimpl, i2));
        return MeasureScope.CC.m59482q(measure, mo72995measureBRTryo0.getWidth(), mo72995measureBRTryo0.getHeight(), null, new ParentSizeNode$measure$1(mo72995measureBRTryo0), 4, null);
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