package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.ScaleFactorKt;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.LayoutModifierNode;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.draw.PainterNode */
/* loaded from: classes2.dex */
public final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {

    /* renamed from: n */
    public Painter f28892n;

    /* renamed from: o */
    public boolean f28893o;

    /* renamed from: p */
    public Alignment f28894p;

    /* renamed from: q */
    public ContentScale f28895q;

    /* renamed from: r */
    public float f28896r;

    /* renamed from: s */
    public ColorFilter f28897s;

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.f28892n = painter;
        this.f28893o = z;
        this.f28894p = alignment;
        this.f28895q = contentScale;
        this.f28896r = f;
        this.f28897s = colorFilter;
    }

    /* renamed from: a */
    public final long m59843a(long j) {
        float m71571getWidthimpl;
        float m71568getHeightimpl;
        if (m59840d()) {
            if (!m59838f(this.f28892n.mo72236getIntrinsicSizeNHjbRc())) {
                m71571getWidthimpl = Size.m71571getWidthimpl(j);
            } else {
                m71571getWidthimpl = Size.m71571getWidthimpl(this.f28892n.mo72236getIntrinsicSizeNHjbRc());
            }
            if (!m59839e(this.f28892n.mo72236getIntrinsicSizeNHjbRc())) {
                m71568getHeightimpl = Size.m71568getHeightimpl(j);
            } else {
                m71568getHeightimpl = Size.m71568getHeightimpl(this.f28892n.mo72236getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m71571getWidthimpl, m71568getHeightimpl);
            if (Size.m71571getWidthimpl(j) == 0.0f || Size.m71568getHeightimpl(j) == 0.0f) {
                return Size.Companion.m71580getZeroNHjbRc();
            }
            return ScaleFactorKt.m72884timesUQTWf7w(Size, this.f28895q.mo72806computeScaleFactorH7hwNQA(Size, j));
        }
        return j;
    }

    /* renamed from: b */
    public final Painter m59842b() {
        return this.f28892n;
    }

    /* renamed from: c */
    public final boolean m59841c() {
        return this.f28893o;
    }

    /* renamed from: d */
    public final boolean m59840d() {
        if (this.f28893o && this.f28892n.mo72236getIntrinsicSizeNHjbRc() != Size.Companion.m71579getUnspecifiedNHjbRc()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m71571getWidthimpl;
        float m71568getHeightimpl;
        long m71580getZeroNHjbRc;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long mo72236getIntrinsicSizeNHjbRc = this.f28892n.mo72236getIntrinsicSizeNHjbRc();
        if (m59838f(mo72236getIntrinsicSizeNHjbRc)) {
            m71571getWidthimpl = Size.m71571getWidthimpl(mo72236getIntrinsicSizeNHjbRc);
        } else {
            m71571getWidthimpl = Size.m71571getWidthimpl(contentDrawScope.mo72144getSizeNHjbRc());
        }
        if (m59839e(mo72236getIntrinsicSizeNHjbRc)) {
            m71568getHeightimpl = Size.m71568getHeightimpl(mo72236getIntrinsicSizeNHjbRc);
        } else {
            m71568getHeightimpl = Size.m71568getHeightimpl(contentDrawScope.mo72144getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m71571getWidthimpl, m71568getHeightimpl);
        if (Size.m71571getWidthimpl(contentDrawScope.mo72144getSizeNHjbRc()) == 0.0f || Size.m71568getHeightimpl(contentDrawScope.mo72144getSizeNHjbRc()) == 0.0f) {
            m71580getZeroNHjbRc = Size.Companion.m71580getZeroNHjbRc();
        } else {
            m71580getZeroNHjbRc = ScaleFactorKt.m72884timesUQTWf7w(Size, this.f28895q.mo72806computeScaleFactorH7hwNQA(Size, contentDrawScope.mo72144getSizeNHjbRc()));
        }
        long j = m71580getZeroNHjbRc;
        long mo71407alignKFBX0sM = this.f28894p.mo71407alignKFBX0sM(IntSizeKt.IntSize(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(j)), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(j))), IntSizeKt.IntSize(AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(contentDrawScope.mo72144getSizeNHjbRc())), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(contentDrawScope.mo72144getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m73776getXimpl = IntOffset.m73776getXimpl(mo71407alignKFBX0sM);
        float m73777getYimpl = IntOffset.m73777getYimpl(mo71407alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(m73776getXimpl, m73777getYimpl);
        this.f28892n.m72242drawx_KDEd0(contentDrawScope, j, this.f28896r, this.f28897s);
        contentDrawScope.getDrawContext().getTransform().translate(-m73776getXimpl, -m73777getYimpl);
        contentDrawScope.drawContent();
    }

    /* renamed from: e */
    public final boolean m59839e(long j) {
        if (!Size.m71567equalsimpl0(j, Size.Companion.m71579getUnspecifiedNHjbRc())) {
            float m71568getHeightimpl = Size.m71568getHeightimpl(j);
            if (!Float.isInfinite(m71568getHeightimpl) && !Float.isNaN(m71568getHeightimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m59838f(long j) {
        if (!Size.m71567equalsimpl0(j, Size.Companion.m71579getUnspecifiedNHjbRc())) {
            float m71571getWidthimpl = Size.m71571getWidthimpl(j);
            if (!Float.isInfinite(m71571getWidthimpl) && !Float.isNaN(m71571getWidthimpl)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final long m59837g(long j) {
        boolean z;
        int m73628getMinWidthimpl;
        int m73627getMinHeightimpl;
        boolean z2 = false;
        if (Constraints.m73622getHasBoundedWidthimpl(j) && Constraints.m73621getHasBoundedHeightimpl(j)) {
            z = true;
        } else {
            z = false;
        }
        if (Constraints.m73624getHasFixedWidthimpl(j) && Constraints.m73623getHasFixedHeightimpl(j)) {
            z2 = true;
        }
        if ((!m59840d() && z) || z2) {
            return Constraints.m73618copyZbe2FdA$default(j, Constraints.m73626getMaxWidthimpl(j), 0, Constraints.m73625getMaxHeightimpl(j), 0, 10, null);
        }
        long mo72236getIntrinsicSizeNHjbRc = this.f28892n.mo72236getIntrinsicSizeNHjbRc();
        if (m59838f(mo72236getIntrinsicSizeNHjbRc)) {
            m73628getMinWidthimpl = AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(mo72236getIntrinsicSizeNHjbRc));
        } else {
            m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        }
        if (m59839e(mo72236getIntrinsicSizeNHjbRc)) {
            m73627getMinHeightimpl = AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(mo72236getIntrinsicSizeNHjbRc));
        } else {
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        }
        long m59843a = m59843a(SizeKt.Size(ConstraintsKt.m73640constrainWidthK40F9xA(j, m73628getMinWidthimpl), ConstraintsKt.m73639constrainHeightK40F9xA(j, m73627getMinHeightimpl)));
        return Constraints.m73618copyZbe2FdA$default(j, ConstraintsKt.m73640constrainWidthK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(m59843a))), 0, ConstraintsKt.m73639constrainHeightK40F9xA(j, AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(m59843a))), 0, 10, null);
    }

    @Override // androidx.compose.p003ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* renamed from: h */
    public final void m59836h(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.f28894p = alignment;
    }

    /* renamed from: i */
    public final void m59835i(ColorFilter colorFilter) {
        this.f28897s = colorFilter;
    }

    /* renamed from: j */
    public final void m59834j(ContentScale contentScale) {
        Intrinsics.checkNotNullParameter(contentScale, "<set-?>");
        this.f28895q = contentScale;
    }

    /* renamed from: k */
    public final void m59833k(Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        this.f28892n = painter;
    }

    /* renamed from: l */
    public final void m59832l(boolean z) {
        this.f28893o = z;
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m59840d()) {
            long m59837g = m59837g(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m73627getMinHeightimpl(m59837g), measurable.maxIntrinsicHeight(i));
        }
        return measurable.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m59840d()) {
            long m59837g = m59837g(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m73628getMinWidthimpl(m59837g), measurable.maxIntrinsicWidth(i));
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo69155measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(m59837g(j));
        return MeasureScope.CC.m59532q(measure, mo72811measureBRTryo0.getWidth(), mo72811measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo72811measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m59840d()) {
            long m59837g = m59837g(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m73627getMinHeightimpl(m59837g), measurable.minIntrinsicHeight(i));
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (m59840d()) {
            long m59837g = m59837g(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m73628getMinWidthimpl(m59837g), measurable.minIntrinsicWidth(i));
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        AbstractC11526jK.m29219a(this);
    }

    public final void setAlpha(float f) {
        this.f28896r = f;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f28892n + ", sizeToIntrinsics=" + this.f28893o + ", alignment=" + this.f28894p + ", alpha=" + this.f28896r + ", colorFilter=" + this.f28897s + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
