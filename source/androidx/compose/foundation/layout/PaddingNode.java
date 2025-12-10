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
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PaddingNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13202n;

    /* renamed from: o */
    public float f13203o;

    /* renamed from: p */
    public float f13204p;

    /* renamed from: q */
    public float f13205q;

    /* renamed from: r */
    public boolean f13206r;

    public /* synthetic */ PaddingNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: a */
    public final boolean m61357a() {
        return this.f13206r;
    }

    /* renamed from: b */
    public final float m61356b() {
        return this.f13202n;
    }

    /* renamed from: c */
    public final float m61355c() {
        return this.f13203o;
    }

    /* renamed from: d */
    public final void m61354d(float f) {
        this.f13205q = f;
    }

    /* renamed from: e */
    public final void m61353e(float f) {
        this.f13204p = f;
    }

    /* renamed from: f */
    public final void m61352f(boolean z) {
        this.f13206r = z;
    }

    /* renamed from: g */
    public final void m61351g(float f) {
        this.f13202n = f;
    }

    /* renamed from: h */
    public final void m61350h(float f) {
        this.f13203o = f;
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
        int mo69432roundToPx0680j_4 = measure.mo69432roundToPx0680j_4(this.f13202n) + measure.mo69432roundToPx0680j_4(this.f13204p);
        int mo69432roundToPx0680j_42 = measure.mo69432roundToPx0680j_4(this.f13203o) + measure.mo69432roundToPx0680j_4(this.f13205q);
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(ConstraintsKt.m73642offsetNN6EwU(j, -mo69432roundToPx0680j_4, -mo69432roundToPx0680j_42));
        return MeasureScope.CC.m59532q(measure, ConstraintsKt.m73640constrainWidthK40F9xA(j, mo72811measureBRTryo0.getWidth() + mo69432roundToPx0680j_4), ConstraintsKt.m73639constrainHeightK40F9xA(j, mo72811measureBRTryo0.getHeight() + mo69432roundToPx0680j_42), null, new PaddingNode$measure$1(this, mo72811measureBRTryo0, measure), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59386c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59385d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public PaddingNode(float f, float f2, float f3, float f4, boolean z) {
        this.f13202n = f;
        this.f13203o = f2;
        this.f13204p = f3;
        this.f13205q = f4;
        this.f13206r = z;
    }
}
