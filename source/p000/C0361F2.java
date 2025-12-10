package p000;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.node.AbstractC3526a;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: F2 */
/* loaded from: classes.dex */
public final class C0361F2 extends Modifier.Node implements LayoutModifierNode {

    /* renamed from: n */
    public AlignmentLine f1486n;

    /* renamed from: o */
    public long f1487o;

    /* renamed from: p */
    public long f1488p;

    public /* synthetic */ C0361F2(AlignmentLine alignmentLine, long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignmentLine, j, j2);
    }

    /* renamed from: a */
    public final void m68431a(long j) {
        this.f1488p = j;
    }

    /* renamed from: b */
    public final void m68430b(long j) {
        this.f1487o = j;
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
        float m73678getUnspecifiedD9Ej5fM;
        float m73678getUnspecifiedD9Ej5fM2;
        MeasureResult m61435a;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        AlignmentLine alignmentLine = this.f1486n;
        if (!TextUnitKt.m73857isUnspecifiedR2X_6o(this.f1487o)) {
            m73678getUnspecifiedD9Ej5fM = measure.mo69433toDpGaN1DYA(this.f1487o);
        } else {
            m73678getUnspecifiedD9Ej5fM = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        float f = m73678getUnspecifiedD9Ej5fM;
        if (!TextUnitKt.m73857isUnspecifiedR2X_6o(this.f1488p)) {
            m73678getUnspecifiedD9Ej5fM2 = measure.mo69433toDpGaN1DYA(this.f1488p);
        } else {
            m73678getUnspecifiedD9Ej5fM2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        m61435a = AlignmentLineKt.m61435a(measure, alignmentLine, f, m73678getUnspecifiedD9Ej5fM2, measurable, j);
        return m61435a;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59386c(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return AbstractC3526a.m59385d(this, intrinsicMeasureScope, intrinsicMeasurable, i);
    }

    public final void setAlignmentLine(AlignmentLine alignmentLine) {
        Intrinsics.checkNotNullParameter(alignmentLine, "<set-?>");
        this.f1486n = alignmentLine;
    }

    public C0361F2(AlignmentLine alignmentLine, long j, long j2) {
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        this.f1486n = alignmentLine;
        this.f1487o = j;
        this.f1488p = j2;
    }
}
