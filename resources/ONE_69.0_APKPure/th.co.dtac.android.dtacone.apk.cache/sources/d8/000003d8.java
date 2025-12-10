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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: E2 */
/* loaded from: classes.dex */
public final class C0286E2 extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public AlignmentLine f1227n;

    /* renamed from: o */
    public float f1228o;

    /* renamed from: p */
    public float f1229p;

    public /* synthetic */ C0286E2(AlignmentLine alignmentLine, float f, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, f, f2);
    }

    /* renamed from: a */
    public final void m68711a(float f) {
        this.f1229p = f;
    }

    /* renamed from: b */
    public final void m68710b(float f) {
        this.f1228o = f;
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
    /* renamed from: measure-3p2s80s  reason: not valid java name */
    public MeasureResult mo69341measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        MeasureResult m61385a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        m61385a = AlignmentLineKt.m61385a(measure, this.f1227n, this.f1228o, this.f1229p, measurable, j);
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
        this.f1227n = alignmentLine;
    }

    public C0286E2(AlignmentLine alignmentLine, float f, float f2) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        this.f1227n = alignmentLine;
        this.f1228o = f;
        this.f1229p = f2;
    }
}