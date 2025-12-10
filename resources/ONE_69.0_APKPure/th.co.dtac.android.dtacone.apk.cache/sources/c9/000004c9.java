package p000;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.node.AbstractC3508a;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3623Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F2 */
/* loaded from: classes.dex */
public final class C0354F2 extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public AlignmentLine f1554n;

    /* renamed from: o */
    public long f1555o;

    /* renamed from: p */
    public long f1556p;

    public /* synthetic */ C0354F2(AlignmentLine alignmentLine, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j, j2);
    }

    /* renamed from: a */
    public final void m68551a(long j) {
        this.f1556p = j;
    }

    /* renamed from: b */
    public final void m68550b(long j) {
        this.f1555o = j;
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
        float m73862getUnspecifiedD9Ej5fM;
        float m73862getUnspecifiedD9Ej5fM2;
        MeasureResult m61385a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        AlignmentLine alignmentLine = this.f1554n;
        if (!TextUnitKt.m74041isUnspecifiedR2X_6o(this.f1555o)) {
            m73862getUnspecifiedD9Ej5fM = measure.mo69617toDpGaN1DYA(this.f1555o);
        } else {
            m73862getUnspecifiedD9Ej5fM = C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM();
        }
        float f = m73862getUnspecifiedD9Ej5fM;
        if (!TextUnitKt.m74041isUnspecifiedR2X_6o(this.f1556p)) {
            m73862getUnspecifiedD9Ej5fM2 = measure.mo69617toDpGaN1DYA(this.f1556p);
        } else {
            m73862getUnspecifiedD9Ej5fM2 = C3623Dp.Companion.m73862getUnspecifiedD9Ej5fM();
        }
        m61385a = AlignmentLineKt.m61385a(measure, alignmentLine, f, m73862getUnspecifiedD9Ej5fM2, measurable, j);
        return m61385a;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59336c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3508a.m59335d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "<set-?>");
        this.f1554n = alignmentLine;
    }

    public C0354F2(AlignmentLine alignmentLine, long j, long j2) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        this.f1554n = alignmentLine;
        this.f1555o = j;
        this.f1556p = j2;
    }
}