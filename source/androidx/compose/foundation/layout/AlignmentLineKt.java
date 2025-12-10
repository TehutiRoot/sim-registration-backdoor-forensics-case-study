package androidx.compose.foundation.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.HorizontalAlignmentLine;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Stable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aA\u0010\u0019\u001a\u00020\u0018*\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001a\"\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001f"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/unit/Dp;", "before", "after", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "paddingFrom", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "horizontal", "foundation-layout_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* renamed from: a */
    public static final MeasureResult m61435a(MeasureScope measureScope, AlignmentLine alignmentLine, float f, float f2, Measurable measurable, long j) {
        long m73618copyZbe2FdA$default;
        int width;
        int m73626getMaxWidthimpl;
        int i;
        int i2;
        int max;
        int height;
        if (m61434b(alignmentLine)) {
            m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null);
        } else {
            m73618copyZbe2FdA$default = Constraints.m73618copyZbe2FdA$default(j, 0, 0, 0, 0, 14, null);
        }
        Placeable mo72811measureBRTryo0 = measurable.mo72811measureBRTryo0(m73618copyZbe2FdA$default);
        int i3 = mo72811measureBRTryo0.get(alignmentLine);
        if (i3 == Integer.MIN_VALUE) {
            i3 = 0;
        }
        if (m61434b(alignmentLine)) {
            width = mo72811measureBRTryo0.getHeight();
        } else {
            width = mo72811measureBRTryo0.getWidth();
        }
        if (m61434b(alignmentLine)) {
            m73626getMaxWidthimpl = Constraints.m73625getMaxHeightimpl(j);
        } else {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        }
        C3641Dp.Companion companion = C3641Dp.Companion;
        if (!C3641Dp.m73663equalsimpl0(f, companion.m73678getUnspecifiedD9Ej5fM())) {
            i = measureScope.mo69432roundToPx0680j_4(f);
        } else {
            i = 0;
        }
        int i4 = m73626getMaxWidthimpl - width;
        int coerceIn = AbstractC11719c.coerceIn(i - i3, 0, i4);
        if (!C3641Dp.m73663equalsimpl0(f2, companion.m73678getUnspecifiedD9Ej5fM())) {
            i2 = measureScope.mo69432roundToPx0680j_4(f2);
        } else {
            i2 = 0;
        }
        int coerceIn2 = AbstractC11719c.coerceIn((i2 - width) + i3, 0, i4 - coerceIn);
        if (m61434b(alignmentLine)) {
            max = mo72811measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo72811measureBRTryo0.getWidth() + coerceIn + coerceIn2, Constraints.m73628getMinWidthimpl(j));
        }
        int i5 = max;
        if (m61434b(alignmentLine)) {
            height = Math.max(mo72811measureBRTryo0.getHeight() + coerceIn + coerceIn2, Constraints.m73627getMinHeightimpl(j));
        } else {
            height = mo72811measureBRTryo0.getHeight();
        }
        int i6 = height;
        return MeasureScope.CC.m59532q(measureScope, i5, i6, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f, coerceIn, i5, coerceIn2, mo72811measureBRTryo0, i6), 4, null);
    }

    /* renamed from: b */
    public static final boolean m61434b(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-4j6BHR0  reason: not valid java name */
    public static final Modifier m69461paddingFrom4j6BHR0(@NotNull Modifier paddingFrom, @NotNull AlignmentLine alignmentLine, float f, float f2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C2838x29bde906(alignmentLine, f, f2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return paddingFrom.then(new AlignmentLineOffsetDpElement(alignmentLine, f, f2, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default  reason: not valid java name */
    public static /* synthetic */ Modifier m69462paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 4) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69461paddingFrom4j6BHR0(modifier, alignmentLine, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFrom-Y_r0B1c  reason: not valid java name */
    public static final Modifier m69463paddingFromY_r0B1c(@NotNull Modifier paddingFrom, @NotNull AlignmentLine alignmentLine, long j, long j2) {
        Function1 noInspectorInfo;
        Intrinsics.checkNotNullParameter(paddingFrom, "$this$paddingFrom");
        Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new C2839x79f276d2(alignmentLine, j, j2);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return paddingFrom.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j, j2, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default  reason: not valid java name */
    public static /* synthetic */ Modifier m69464paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = TextUnit.Companion.m73850getUnspecifiedXSAIIZE();
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = TextUnit.Companion.m73850getUnspecifiedXSAIIZE();
        }
        return m69463paddingFromY_r0B1c(modifier, alignmentLine, j3, j2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-VpY3zN4  reason: not valid java name */
    public static final Modifier m69465paddingFromBaselineVpY3zN4(@NotNull Modifier paddingFromBaseline, float f, float f2) {
        Modifier modifier;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        C3641Dp.Companion companion = C3641Dp.Companion;
        if (!C3641Dp.m73663equalsimpl0(f, companion.m73678getUnspecifiedD9Ej5fM())) {
            modifier = m69462paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline(), f, 0.0f, 4, null);
        } else {
            modifier = Modifier.Companion;
        }
        Modifier then = paddingFromBaseline.then(modifier);
        if (!C3641Dp.m73663equalsimpl0(f2, companion.m73678getUnspecifiedD9Ej5fM())) {
            modifier2 = m69462paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.p003ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f2, 2, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        return then.then(modifier2);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default  reason: not valid java name */
    public static /* synthetic */ Modifier m69466paddingFromBaselineVpY3zN4$default(Modifier modifier, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        if ((i & 2) != 0) {
            f2 = C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM();
        }
        return m69465paddingFromBaselineVpY3zN4(modifier, f, f2);
    }

    @Stable
    @NotNull
    /* renamed from: paddingFromBaseline-wCyjxdI  reason: not valid java name */
    public static final Modifier m69467paddingFromBaselinewCyjxdI(@NotNull Modifier paddingFromBaseline, long j, long j2) {
        Modifier modifier;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(paddingFromBaseline, "$this$paddingFromBaseline");
        if (!TextUnitKt.m73857isUnspecifiedR2X_6o(j)) {
            modifier = m69464paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p003ui.layout.AlignmentLineKt.getFirstBaseline(), j, 0L, 4, null);
        } else {
            modifier = Modifier.Companion;
        }
        Modifier then = paddingFromBaseline.then(modifier);
        if (!TextUnitKt.m73857isUnspecifiedR2X_6o(j2)) {
            modifier2 = m69464paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.p003ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j2, 2, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        return then.then(modifier2);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default  reason: not valid java name */
    public static /* synthetic */ Modifier m69468paddingFromBaselinewCyjxdI$default(Modifier modifier, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = TextUnit.Companion.m73850getUnspecifiedXSAIIZE();
        }
        if ((i & 2) != 0) {
            j2 = TextUnit.Companion.m73850getUnspecifiedXSAIIZE();
        }
        return m69467paddingFromBaselinewCyjxdI(modifier, j, j2);
    }
}
