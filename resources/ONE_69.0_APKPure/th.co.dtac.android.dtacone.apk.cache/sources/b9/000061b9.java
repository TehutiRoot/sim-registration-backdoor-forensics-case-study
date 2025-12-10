package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import com.google.common.net.HttpHeaders;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics */
/* loaded from: classes2.dex */
public final class MeasuringIntrinsics {

    /* renamed from: a */
    public static final MeasuringIntrinsics f30223a = new MeasuringIntrinsics();

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m29142d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "(Ljava/lang/String;I)V", "Min", "Max", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicMinMax */
    /* loaded from: classes2.dex */
    public enum IntrinsicMinMax {
        Min,
        Max
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m29142d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "(Ljava/lang/String;I)V", HttpHeaders.WIDTH, "Height", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$IntrinsicWidthHeight */
    /* loaded from: classes2.dex */
    public enum IntrinsicWidthHeight {
        Width,
        Height
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$a */
    /* loaded from: classes2.dex */
    public static final class C3483a implements Measurable {

        /* renamed from: a */
        public final IntrinsicMeasurable f30224a;

        /* renamed from: b */
        public final IntrinsicMinMax f30225b;

        /* renamed from: c */
        public final IntrinsicWidthHeight f30226c;

        public C3483a(IntrinsicMeasurable measurable, IntrinsicMinMax minMax, IntrinsicWidthHeight widthHeight) {
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Intrinsics.checkNotNullParameter(minMax, "minMax");
            Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
            this.f30224a = measurable;
            this.f30225b = minMax;
            this.f30226c = widthHeight;
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public Object getParentData() {
            return this.f30224a.getParentData();
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicHeight(int i) {
            return this.f30224a.maxIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int maxIntrinsicWidth(int i) {
            return this.f30224a.maxIntrinsicWidth(i);
        }

        @Override // androidx.compose.p003ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public Placeable mo72995measureBRTryo0(long j) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            if (this.f30226c == IntrinsicWidthHeight.Width) {
                if (this.f30225b == IntrinsicMinMax.Max) {
                    minIntrinsicWidth = this.f30224a.maxIntrinsicWidth(Constraints.m73809getMaxHeightimpl(j));
                } else {
                    minIntrinsicWidth = this.f30224a.minIntrinsicWidth(Constraints.m73809getMaxHeightimpl(j));
                }
                return new C3484b(minIntrinsicWidth, Constraints.m73809getMaxHeightimpl(j));
            }
            if (this.f30225b == IntrinsicMinMax.Max) {
                minIntrinsicHeight = this.f30224a.maxIntrinsicHeight(Constraints.m73810getMaxWidthimpl(j));
            } else {
                minIntrinsicHeight = this.f30224a.minIntrinsicHeight(Constraints.m73810getMaxWidthimpl(j));
            }
            return new C3484b(Constraints.m73810getMaxWidthimpl(j), minIntrinsicHeight);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicHeight(int i) {
            return this.f30224a.minIntrinsicHeight(i);
        }

        @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
        public int minIntrinsicWidth(int i) {
            return this.f30224a.minIntrinsicWidth(i);
        }
    }

    /* renamed from: androidx.compose.ui.layout.MeasuringIntrinsics$b */
    /* loaded from: classes2.dex */
    public static final class C3484b extends Placeable {
        public C3484b(int i, int i2) {
            m73032setMeasuredSizeozmzZPI(IntSizeKt.IntSize(i, i2));
        }

        @Override // androidx.compose.p003ui.layout.Measured
        public int get(AlignmentLine alignmentLine) {
            Intrinsics.checkNotNullParameter(alignmentLine, "alignmentLine");
            return Integer.MIN_VALUE;
        }

        @Override // androidx.compose.p003ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public void mo69367placeAtf8xVGno(long j, float f, Function1 function1) {
        }
    }

    /* renamed from: a */
    public final int m59481a(LayoutModifier modifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.mo69364measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3483a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: b */
    public final int m59480b(LayoutModifier modifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.mo69364measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3483a(intrinsicMeasurable, IntrinsicMinMax.Max, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }

    /* renamed from: c */
    public final int m59479c(LayoutModifier modifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.mo69364measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3483a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Height), ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: d */
    public final int m59478d(LayoutModifier modifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "intrinsicMeasureScope");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable, "intrinsicMeasurable");
        return modifier.mo69364measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), new C3483a(intrinsicMeasurable, IntrinsicMinMax.Min, IntrinsicWidthHeight.Width), ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null)).getWidth();
    }
}