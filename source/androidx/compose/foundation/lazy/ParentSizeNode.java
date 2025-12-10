package androidx.compose.foundation.lazy;

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
import androidx.compose.runtime.State;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ParentSizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13458n;

    /* renamed from: o */
    public State f13459o;

    /* renamed from: p */
    public State f13460p;

    public ParentSizeNode(float f, State state, State state2) {
        this.f13458n = f;
        this.f13459o = state;
        this.f13460p = state2;
    }

    /* renamed from: a */
    public final float m61259a() {
        return this.f13458n;
    }

    /* renamed from: b */
    public final State m61258b() {
        return this.f13460p;
    }

    /* renamed from: c */
    public final State m61257c() {
        return this.f13459o;
    }

    /* renamed from: d */
    public final void m61256d(float f) {
        this.f13458n = f;
    }

    /* renamed from: e */
    public final void m61255e(State state) {
        this.f13460p = state;
    }

    /* renamed from: f */
    public final void m61254f(State state) {
        this.f13459o = state;
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
        int i;
        int i2;
        int m73628getMinWidthimpl;
        int m73627getMinHeightimpl;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        State state = this.f13459o;
        if (state != null && ((Number) state.getValue()).intValue() != Integer.MAX_VALUE) {
            i = AbstractC21140mr0.roundToInt(((Number) state.getValue()).floatValue() * this.f13458n);
        } else {
            i = Integer.MAX_VALUE;
        }
        State state2 = this.f13460p;
        if (state2 != null && ((Number) state2.getValue()).intValue() != Integer.MAX_VALUE) {
            i2 = AbstractC21140mr0.roundToInt(((Number) state2.getValue()).floatValue() * this.f13458n);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i != Integer.MAX_VALUE) {
            m73628getMinWidthimpl = i;
        } else {
            m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            m73627getMinHeightimpl = i2;
        } else {
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = Constraints.m73626getMaxWidthimpl(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = Constraints.m73625getMaxHeightimpl(j);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.Constraints(m73628getMinWidthimpl, i, m73627getMinHeightimpl, i2));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new ParentSizeNode$measure$1(mo72811measureBRTryo0), 4, null);
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
