package androidx.compose.foundation.layout;

import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B,\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bB\u001c\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\rB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\u00020\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0016J>\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010 \u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010(\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010)R\u0012\u0010\u0003\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b*\u0010\"R\u0012\u0010\u0004\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0012\u0010\u0005\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b,\u0010\"R\u0012\u0010\u0006\u001a\u00020\u00028Æ\u0002¢\u0006\u0006\u001a\u0004\b-\u0010\"\u0088\u0001\u000e\u0092\u0001\u00020\tø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006."}, m28850d2 = {"Landroidx/compose/foundation/layout/OrientationIndependentConstraints;", "", "", "mainAxisMin", "mainAxisMax", "crossAxisMin", "crossAxisMax", "constructor-impl", "(IIII)J", "Landroidx/compose/ui/unit/Constraints;", OperatorName.CURVE_TO, "Landroidx/compose/foundation/layout/LayoutOrientation;", "orientation", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)J", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)J", "stretchCrossAxis-q4ezo7Y", "stretchCrossAxis", "toBoxConstraints-OenEA2s", "toBoxConstraints", "maxWidth-impl", "(JLandroidx/compose/foundation/layout/LayoutOrientation;)I", "maxWidth", "maxHeight-impl", "maxHeight", "copy-yUG9Ft0", "(JIIII)J", "copy", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", OperatorName.SET_LINE_CAPSTYLE, "getMainAxisMin-impl", "getMainAxisMax-impl", "getCrossAxisMin-impl", "getCrossAxisMax-impl", "foundation-layout_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@JvmInline
@SourceDebugExtension({"SMAP\nRowColumnImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n1#1,868:1\n320#1:869\n321#1:870\n323#1:871\n322#1:872\n323#1:873\n320#1,4:874\n322#1,2:878\n320#1,2:880\n321#1:882\n323#1:883\n323#1:884\n321#1:885\n320#1:886\n321#1:887\n322#1:888\n323#1:889\n*S KotlinDebug\n*F\n+ 1 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n*L\n348#1:869\n349#1:870\n350#1:871\n350#1:872\n351#1:873\n357#1:874,4\n359#1:878,2\n359#1:880,2\n365#1:882\n367#1:883\n373#1:884\n375#1:885\n379#1:886\n380#1:887\n381#1:888\n382#1:889\n*E\n"})
/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {

    /* renamed from: a */
    public final long f13195a;

    public /* synthetic */ OrientationIndependentConstraints(long j) {
        this.f13195a = j;
    }

    /* renamed from: a */
    public static long m61360a(long j) {
        return j;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m69504boximpl(long j) {
        return new OrientationIndependentConstraints(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69505constructorimpl(int i, int i2, int i3, int i4) {
        return m61360a(ConstraintsKt.Constraints(i, i2, i3, i4));
    }

    /* renamed from: copy-yUG9Ft0  reason: not valid java name */
    public static final long m69507copyyUG9Ft0(long j, int i, int i2, int i3, int i4) {
        return m69505constructorimpl(i, i2, i3, i4);
    }

    /* renamed from: copy-yUG9Ft0$default  reason: not valid java name */
    public static /* synthetic */ long m69508copyyUG9Ft0$default(long j, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = Constraints.m73628getMinWidthimpl(j);
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = Constraints.m73626getMaxWidthimpl(j);
        }
        int i7 = i2;
        if ((i5 & 4) != 0) {
            i3 = Constraints.m73627getMinHeightimpl(j);
        }
        int i8 = i3;
        if ((i5 & 8) != 0) {
            i4 = Constraints.m73625getMaxHeightimpl(j);
        }
        return m69507copyyUG9Ft0(j, i6, i7, i8, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m69509equalsimpl(long j, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m73620equalsimpl0(j, ((OrientationIndependentConstraints) obj).m69521unboximpl());
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m69510equalsimpl0(long j, long j2) {
        return Constraints.m73620equalsimpl0(j, j2);
    }

    /* renamed from: getCrossAxisMax-impl  reason: not valid java name */
    public static final int m69511getCrossAxisMaximpl(long j) {
        return Constraints.m73625getMaxHeightimpl(j);
    }

    /* renamed from: getCrossAxisMin-impl  reason: not valid java name */
    public static final int m69512getCrossAxisMinimpl(long j) {
        return Constraints.m73627getMinHeightimpl(j);
    }

    /* renamed from: getMainAxisMax-impl  reason: not valid java name */
    public static final int m69513getMainAxisMaximpl(long j) {
        return Constraints.m73626getMaxWidthimpl(j);
    }

    /* renamed from: getMainAxisMin-impl  reason: not valid java name */
    public static final int m69514getMainAxisMinimpl(long j) {
        return Constraints.m73628getMinWidthimpl(j);
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m69515hashCodeimpl(long j) {
        return Constraints.m73629hashCodeimpl(j);
    }

    /* renamed from: maxHeight-impl  reason: not valid java name */
    public static final int m69516maxHeightimpl(long j, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m73625getMaxHeightimpl(j);
        }
        return Constraints.m73626getMaxWidthimpl(j);
    }

    /* renamed from: maxWidth-impl  reason: not valid java name */
    public static final int m69517maxWidthimpl(long j, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return Constraints.m73626getMaxWidthimpl(j);
        }
        return Constraints.m73625getMaxHeightimpl(j);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y  reason: not valid java name */
    public static final long m69518stretchCrossAxisq4ezo7Y(long j) {
        int m73627getMinHeightimpl;
        int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        if (Constraints.m73625getMaxHeightimpl(j) != Integer.MAX_VALUE) {
            m73627getMinHeightimpl = Constraints.m73625getMaxHeightimpl(j);
        } else {
            m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
        }
        return m69505constructorimpl(m73628getMinWidthimpl, m73626getMaxWidthimpl, m73627getMinHeightimpl, Constraints.m73625getMaxHeightimpl(j));
    }

    /* renamed from: toBoxConstraints-OenEA2s  reason: not valid java name */
    public static final long m69519toBoxConstraintsOenEA2s(long j, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == LayoutOrientation.Horizontal) {
            return ConstraintsKt.Constraints(Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j));
        }
        return ConstraintsKt.Constraints(Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j));
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m69520toStringimpl(long j) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m73631toStringimpl(j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return m69509equalsimpl(this.f13195a, obj);
    }

    public int hashCode() {
        return m69515hashCodeimpl(this.f13195a);
    }

    public String toString() {
        return m69520toStringimpl(this.f13195a);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m69521unboximpl() {
        return this.f13195a;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m69506constructorimpl(long j, @NotNull LayoutOrientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        LayoutOrientation layoutOrientation = LayoutOrientation.Horizontal;
        return m69505constructorimpl(orientation == layoutOrientation ? Constraints.m73628getMinWidthimpl(j) : Constraints.m73627getMinHeightimpl(j), orientation == layoutOrientation ? Constraints.m73626getMaxWidthimpl(j) : Constraints.m73625getMaxHeightimpl(j), orientation == layoutOrientation ? Constraints.m73627getMinHeightimpl(j) : Constraints.m73628getMinWidthimpl(j), orientation == layoutOrientation ? Constraints.m73625getMaxHeightimpl(j) : Constraints.m73626getMaxWidthimpl(j));
    }
}
