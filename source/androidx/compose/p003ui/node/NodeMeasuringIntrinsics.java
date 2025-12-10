package androidx.compose.p003ui.node;

import androidx.compose.p003ui.layout.AlignmentLine;
import androidx.compose.p003ui.layout.IntrinsicMeasurable;
import androidx.compose.p003ui.layout.IntrinsicMeasureScope;
import androidx.compose.p003ui.layout.IntrinsicsMeasureScope;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import com.google.common.net.HttpHeaders;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0016\u0017\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\rJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0012\u0010\rJ/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\r¨\u0006\u001b"}, m28850d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "measureBlock", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "intrinsicMeasureScope", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "intrinsicMeasurable", "", OperatorName.CLOSE_PATH, "minWidth$ui_release", "(Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "minWidth", OperatorName.SET_LINE_WIDTH, "minHeight$ui_release", "minHeight", "maxWidth$ui_release", "maxWidth", "maxHeight$ui_release", "maxHeight", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "IntrinsicMinMax", "IntrinsicWidthHeight", "MeasureBlock", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics */
/* loaded from: classes2.dex */
public final class NodeMeasuringIntrinsics {
    @NotNull
    public static final NodeMeasuringIntrinsics INSTANCE = new NodeMeasuringIntrinsics();

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicMinMax */
    /* loaded from: classes2.dex */
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", HttpHeaders.WIDTH, "Height", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics$IntrinsicWidthHeight */
    /* loaded from: classes2.dex */
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0080\u0001\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m28850d2 = {"Landroidx/compose/ui/node/NodeMeasuringIntrinsics$MeasureBlock;", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics$MeasureBlock */
    /* loaded from: classes2.dex */
    public interface MeasureBlock {
        @NotNull
        /* renamed from: measure-3p2s80s */
        MeasureResult mo72815measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j);
    }

    /* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics$a */
    /* loaded from: classes2.dex */
    public static final class C3522a implements Measurable {

        /* renamed from: a */
        public final IntrinsicMeasurable f30414a;

        /* renamed from: b */
        public final IntrinsicMinMax f30415b;

        /* renamed from: c */
        public final IntrinsicWidthHeight f30416c;

        public C3522a(IntrinsicMeasurable measurable, IntrinsicMinMax minMax, IntrinsicWidthHeight widthHeight) {
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Intrinsics.checkNotNullParameter(minMax, "minMax");
            Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
            this.f30414a = measurable;
            this.f30415b = minMax;
            this.f30416c = widthHeight;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.f30414a.getParentData();
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.f30414a.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.f30414a.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72811measureBRTryo0(long j) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            if (this.f30416c == IntrinsicWidthHeight.Width) {
                if (this.f30415b == IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.f30414a.maxIntrinsicWidth(Constraints.m73625getMaxHeightimpl(j));
                } else {
                    minIntrinsicWidth = this.f30414a.minIntrinsicWidth(Constraints.m73625getMaxHeightimpl(j));
                }
                return new C3523b(minIntrinsicWidth, Constraints.m73625getMaxHeightimpl(j));
            }
            if (this.f30415b == IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.f30414a.maxIntrinsicHeight(Constraints.m73626getMaxWidthimpl(j));
            } else {
                minIntrinsicHeight = this.f30414a.minIntrinsicHeight(Constraints.m73626getMaxWidthimpl(j));
            }
            return new C3523b(Constraints.m73626getMaxWidthimpl(j), minIntrinsicHeight);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.f30414a.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.f30414a.minIntrinsicWidth(i);
        }
    }

    /* renamed from: androidx.compose.ui.node.NodeMeasuringIntrinsics$b */
    /* loaded from: classes2.dex */
    public static final class C3523b extends Placeable {
        public C3523b(int i, int i2) {
            m72848setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo69179placeAtf8xVGno(long j, float f, Function1 function1) {
        }
    }

    public final int maxHeight$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo72815measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3522a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int maxWidth$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo72815measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3522a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    public final int minHeight$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo72815measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3522a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    public final int minWidth$ui_release(@NotNull MeasureBlock measureBlock, @NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(measureBlock, "measureBlock");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return measureBlock.mo72815measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3522a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}
