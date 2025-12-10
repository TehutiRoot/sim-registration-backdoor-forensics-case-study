package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.unit.Constraints;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u0004\u0018\u00010 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m28850d2 = {"Landroidx/compose/ui/layout/DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMinMax;", "minMax", "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "widthHeight", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMinMax;Landroidx/compose/ui/layout/IntrinsicWidthHeight;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "height", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getMeasurable", "()Landroidx/compose/ui/layout/IntrinsicMeasurable;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/ui/layout/IntrinsicMinMax;", OperatorName.CURVE_TO, "Landroidx/compose/ui/layout/IntrinsicWidthHeight;", "", "getParentData", "()Ljava/lang/Object;", "parentData", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.layout.DefaultIntrinsicMeasurable */
/* loaded from: classes2.dex */
public final class DefaultIntrinsicMeasurable implements Measurable {

    /* renamed from: a */
    public final IntrinsicMeasurable f30058a;

    /* renamed from: b */
    public final IntrinsicMinMax f30059b;

    /* renamed from: c */
    public final IntrinsicWidthHeight f30060c;

    public DefaultIntrinsicMeasurable(@NotNull IntrinsicMeasurable measurable, @NotNull IntrinsicMinMax minMax, @NotNull IntrinsicWidthHeight widthHeight) {
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Intrinsics.checkNotNullParameter(minMax, "minMax");
        Intrinsics.checkNotNullParameter(widthHeight, "widthHeight");
        this.f30058a = measurable;
        this.f30059b = minMax;
        this.f30060c = widthHeight;
    }

    @NotNull
    public final IntrinsicMeasurable getMeasurable() {
        return this.f30058a;
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    @Nullable
    public Object getParentData() {
        return this.f30058a.getParentData();
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int i) {
        return this.f30058a.maxIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int i) {
        return this.f30058a.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.p003ui.layout.Measurable
    @NotNull
    /* renamed from: measure-BRTryo0  reason: not valid java name */
    public Placeable mo72811measureBRTryo0(long j) {
        int minIntrinsicHeight;
        int minIntrinsicWidth;
        if (this.f30060c == IntrinsicWidthHeight.Width) {
            if (this.f30059b == IntrinsicMinMax.Max) {
                minIntrinsicWidth = this.f30058a.maxIntrinsicWidth(Constraints.m73625getMaxHeightimpl(j));
            } else {
                minIntrinsicWidth = this.f30058a.minIntrinsicWidth(Constraints.m73625getMaxHeightimpl(j));
            }
            return new I20(minIntrinsicWidth, Constraints.m73625getMaxHeightimpl(j));
        }
        if (this.f30059b == IntrinsicMinMax.Max) {
            minIntrinsicHeight = this.f30058a.maxIntrinsicHeight(Constraints.m73626getMaxWidthimpl(j));
        } else {
            minIntrinsicHeight = this.f30058a.minIntrinsicHeight(Constraints.m73626getMaxWidthimpl(j));
        }
        return new I20(Constraints.m73626getMaxWidthimpl(j), minIntrinsicHeight);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int i) {
        return this.f30058a.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.p003ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int i) {
        return this.f30058a.minIntrinsicWidth(i);
    }
}
