package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AspectRatioNode extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public float f13105n;

    /* renamed from: o */
    public boolean f13106o;

    public AspectRatioNode(float f, boolean z) {
        this.f13105n = f;
        this.f13106o = z;
    }

    /* renamed from: e */
    public static /* synthetic */ long m61420e(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m61421d(j, z);
    }

    /* renamed from: g */
    public static /* synthetic */ long m61418g(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m61419f(j, z);
    }

    /* renamed from: i */
    public static /* synthetic */ long m61416i(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m61417h(j, z);
    }

    /* renamed from: k */
    public static /* synthetic */ long m61414k(AspectRatioNode aspectRatioNode, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return aspectRatioNode.m61415j(j, z);
    }

    /* renamed from: a */
    public final long m61424a(long j) {
        if (!this.f13106o) {
            long m61418g = m61418g(this, j, false, 1, null);
            IntSize.Companion companion = IntSize.Companion;
            if (!IntSize.m73816equalsimpl0(m61418g, companion.m73823getZeroYbymL2g())) {
                return m61418g;
            }
            long m61420e = m61420e(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61420e, companion.m73823getZeroYbymL2g())) {
                return m61420e;
            }
            long m61414k = m61414k(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61414k, companion.m73823getZeroYbymL2g())) {
                return m61414k;
            }
            long m61416i = m61416i(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61416i, companion.m73823getZeroYbymL2g())) {
                return m61416i;
            }
            long m61419f = m61419f(j, false);
            if (!IntSize.m73816equalsimpl0(m61419f, companion.m73823getZeroYbymL2g())) {
                return m61419f;
            }
            long m61421d = m61421d(j, false);
            if (!IntSize.m73816equalsimpl0(m61421d, companion.m73823getZeroYbymL2g())) {
                return m61421d;
            }
            long m61415j = m61415j(j, false);
            if (!IntSize.m73816equalsimpl0(m61415j, companion.m73823getZeroYbymL2g())) {
                return m61415j;
            }
            long m61417h = m61417h(j, false);
            if (!IntSize.m73816equalsimpl0(m61417h, companion.m73823getZeroYbymL2g())) {
                return m61417h;
            }
        } else {
            long m61420e2 = m61420e(this, j, false, 1, null);
            IntSize.Companion companion2 = IntSize.Companion;
            if (!IntSize.m73816equalsimpl0(m61420e2, companion2.m73823getZeroYbymL2g())) {
                return m61420e2;
            }
            long m61418g2 = m61418g(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61418g2, companion2.m73823getZeroYbymL2g())) {
                return m61418g2;
            }
            long m61416i2 = m61416i(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61416i2, companion2.m73823getZeroYbymL2g())) {
                return m61416i2;
            }
            long m61414k2 = m61414k(this, j, false, 1, null);
            if (!IntSize.m73816equalsimpl0(m61414k2, companion2.m73823getZeroYbymL2g())) {
                return m61414k2;
            }
            long m61421d2 = m61421d(j, false);
            if (!IntSize.m73816equalsimpl0(m61421d2, companion2.m73823getZeroYbymL2g())) {
                return m61421d2;
            }
            long m61419f2 = m61419f(j, false);
            if (!IntSize.m73816equalsimpl0(m61419f2, companion2.m73823getZeroYbymL2g())) {
                return m61419f2;
            }
            long m61417h2 = m61417h(j, false);
            if (!IntSize.m73816equalsimpl0(m61417h2, companion2.m73823getZeroYbymL2g())) {
                return m61417h2;
            }
            long m61415j2 = m61415j(j, false);
            if (!IntSize.m73816equalsimpl0(m61415j2, companion2.m73823getZeroYbymL2g())) {
                return m61415j2;
            }
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    /* renamed from: b */
    public final void m61423b(float f) {
        this.f13105n = f;
    }

    /* renamed from: c */
    public final void m61422c(boolean z) {
        this.f13106o = z;
    }

    /* renamed from: d */
    public final long m61421d(long j, boolean z) {
        int roundToInt;
        int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        if (m73625getMaxHeightimpl != Integer.MAX_VALUE && (roundToInt = AbstractC21140mr0.roundToInt(m73625getMaxHeightimpl * this.f13105n)) > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m73625getMaxHeightimpl);
            if (!z || ConstraintsKt.m73641isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    /* renamed from: f */
    public final long m61419f(long j, boolean z) {
        int roundToInt;
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        if (m73626getMaxWidthimpl != Integer.MAX_VALUE && (roundToInt = AbstractC21140mr0.roundToInt(m73626getMaxWidthimpl / this.f13105n)) > 0) {
            long IntSize = IntSizeKt.IntSize(m73626getMaxWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m73641isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    /* renamed from: h */
    public final long m61417h(long j, boolean z) {
        int m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        int roundToInt = AbstractC21140mr0.roundToInt(m73627getMinHeightimpl * this.f13105n);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(roundToInt, m73627getMinHeightimpl);
            if (!z || ConstraintsKt.m73641isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    /* renamed from: j */
    public final long m61415j(long j, boolean z) {
        int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        int roundToInt = AbstractC21140mr0.roundToInt(m73628getMinWidthimpl / this.f13105n);
        if (roundToInt > 0) {
            long IntSize = IntSizeKt.IntSize(m73628getMinWidthimpl, roundToInt);
            if (!z || ConstraintsKt.m73641isSatisfiedBy4WqzIAM(j, IntSize)) {
                return IntSize;
            }
        }
        return IntSize.Companion.m73823getZeroYbymL2g();
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return AbstractC21140mr0.roundToInt(i / this.f13105n);
        }
        return measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return AbstractC21140mr0.roundToInt(i * this.f13105n);
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long m61424a = m61424a(j);
        if (!IntSize.m73816equalsimpl0(m61424a, IntSize.Companion.m73823getZeroYbymL2g())) {
            j = Constraints.Companion.m73634fixedJhjzzOo(IntSize.m73818getWidthimpl(m61424a), IntSize.m73817getHeightimpl(m61424a));
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(j);
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new AspectRatioNode$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return AbstractC21140mr0.roundToInt(i / this.f13105n);
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (i != Integer.MAX_VALUE) {
            return AbstractC21140mr0.roundToInt(i * this.f13105n);
        }
        return measurable.minIntrinsicWidth(i);
    }
}
