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
import androidx.compose.p003ui.unit.Density;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;

/* loaded from: classes.dex */
public final class SizeNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13264n;

    /* renamed from: o */
    public float f13265o;

    /* renamed from: p */
    public float f13266p;

    /* renamed from: q */
    public float f13267q;

    /* renamed from: r */
    public boolean f13268r;

    public /* synthetic */ SizeNode(float f, float f2, float f3, float f4, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, z);
    }

    /* renamed from: a */
    public final long m61334a(Density density) {
        int i;
        int i2;
        int coerceAtLeast;
        float f = this.f13266p;
        C3641Dp.Companion companion = C3641Dp.Companion;
        int i3 = 0;
        if (!C3641Dp.m73663equalsimpl0(f, companion.m73678getUnspecifiedD9Ej5fM())) {
            i = AbstractC11719c.coerceAtLeast(density.mo69432roundToPx0680j_4(this.f13266p), 0);
        } else {
            i = Integer.MAX_VALUE;
        }
        if (!C3641Dp.m73663equalsimpl0(this.f13267q, companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = AbstractC11719c.coerceAtLeast(density.mo69432roundToPx0680j_4(this.f13267q), 0);
        } else {
            i2 = Integer.MAX_VALUE;
        }
        int i4 = (C3641Dp.m73663equalsimpl0(this.f13264n, companion.m73678getUnspecifiedD9Ej5fM()) || (i4 = AbstractC11719c.coerceAtLeast(AbstractC11719c.coerceAtMost(density.mo69432roundToPx0680j_4(this.f13264n), i), 0)) == Integer.MAX_VALUE) ? 0 : 0;
        if (!C3641Dp.m73663equalsimpl0(this.f13265o, companion.m73678getUnspecifiedD9Ej5fM()) && (coerceAtLeast = AbstractC11719c.coerceAtLeast(AbstractC11719c.coerceAtMost(density.mo69432roundToPx0680j_4(this.f13265o), i2), 0)) != Integer.MAX_VALUE) {
            i3 = coerceAtLeast;
        }
        return ConstraintsKt.Constraints(i4, i, i3, i2);
    }

    /* renamed from: b */
    public final void m61333b(boolean z) {
        this.f13268r = z;
    }

    /* renamed from: c */
    public final void m61332c(float f) {
        this.f13267q = f;
    }

    /* renamed from: d */
    public final void m61331d(float f) {
        this.f13266p = f;
    }

    /* renamed from: e */
    public final void m61330e(float f) {
        this.f13265o = f;
    }

    /* renamed from: f */
    public final void m61329f(float f) {
        this.f13264n = f;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61334a = m61334a(intrinsicMeasureScope);
        if (Constraints.m73623getHasFixedHeightimpl(m61334a)) {
            return Constraints.m73625getMaxHeightimpl(m61334a);
        }
        return ConstraintsKt.m73639constrainHeightK40F9xA(m61334a, measurable.maxIntrinsicHeight(i));
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61334a = m61334a(intrinsicMeasureScope);
        if (Constraints.m73624getHasFixedWidthimpl(m61334a)) {
            return Constraints.m73626getMaxWidthimpl(m61334a);
        }
        return ConstraintsKt.m73640constrainWidthK40F9xA(m61334a, measurable.maxIntrinsicWidth(i));
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        int coerceAtMost;
        int coerceAtLeast;
        int coerceAtMost2;
        int coerceAtLeast2;
        long Constraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61334a = m61334a(measure);
        if (this.f13268r) {
            Constraints = ConstraintsKt.m73638constrainN9IONVI(j, m61334a);
        } else {
            float f = this.f13264n;
            C3641Dp.Companion companion = C3641Dp.Companion;
            if (!C3641Dp.m73663equalsimpl0(f, companion.m73678getUnspecifiedD9Ej5fM())) {
                coerceAtMost = Constraints.m73628getMinWidthimpl(m61334a);
            } else {
                coerceAtMost = AbstractC11719c.coerceAtMost(Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(m61334a));
            }
            if (!C3641Dp.m73663equalsimpl0(this.f13266p, companion.m73678getUnspecifiedD9Ej5fM())) {
                coerceAtLeast = Constraints.m73626getMaxWidthimpl(m61334a);
            } else {
                coerceAtLeast = AbstractC11719c.coerceAtLeast(Constraints.m73626getMaxWidthimpl(j), Constraints.m73628getMinWidthimpl(m61334a));
            }
            if (!C3641Dp.m73663equalsimpl0(this.f13265o, companion.m73678getUnspecifiedD9Ej5fM())) {
                coerceAtMost2 = Constraints.m73627getMinHeightimpl(m61334a);
            } else {
                coerceAtMost2 = AbstractC11719c.coerceAtMost(Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(m61334a));
            }
            if (!C3641Dp.m73663equalsimpl0(this.f13267q, companion.m73678getUnspecifiedD9Ej5fM())) {
                coerceAtLeast2 = Constraints.m73625getMaxHeightimpl(m61334a);
            } else {
                coerceAtLeast2 = AbstractC11719c.coerceAtLeast(Constraints.m73625getMaxHeightimpl(j), Constraints.m73627getMinHeightimpl(m61334a));
            }
            Constraints = ConstraintsKt.Constraints(coerceAtMost, coerceAtLeast, coerceAtMost2, coerceAtLeast2);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(Constraints);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new SizeNode$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61334a = m61334a(intrinsicMeasureScope);
        if (Constraints.m73623getHasFixedHeightimpl(m61334a)) {
            return Constraints.m73625getMaxHeightimpl(m61334a);
        }
        return ConstraintsKt.m73639constrainHeightK40F9xA(m61334a, measurable.minIntrinsicHeight(i));
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61334a = m61334a(intrinsicMeasureScope);
        if (Constraints.m73624getHasFixedWidthimpl(m61334a)) {
            return Constraints.m73626getMaxWidthimpl(m61334a);
        }
        return ConstraintsKt.m73640constrainWidthK40F9xA(m61334a, measurable.minIntrinsicWidth(i));
    }

    public SizeNode(float f, float f2, float f3, float f4, boolean z) {
        this.f13264n = f;
        this.f13265o = f2;
        this.f13266p = f3;
        this.f13267q = f4;
        this.f13268r = z;
    }
}
