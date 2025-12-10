package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.ranges.AbstractC11695c;

@Metadata(m29143d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m29142d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY  reason: not valid java name */
    public static final long m69991finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return ConstraintsKt.Constraints$default(0, m69993finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m73809getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: finalMaxLines-xdlQI24  reason: not valid java name */
    public static final int m69992finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (!z && TextOverflow.m73771equalsimpl0(i, TextOverflow.Companion.m73779getEllipsisgIe3tQ8())) {
            return 1;
        }
        return AbstractC11695c.coerceAtLeast(i2, 1);
    }

    /* renamed from: finalMaxWidth-tfFHcEY  reason: not valid java name */
    public static final int m69993finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m73810getMaxWidthimpl;
        if ((z || TextOverflow.m73771equalsimpl0(i, TextOverflow.Companion.m73779getEllipsisgIe3tQ8())) && Constraints.m73806getHasBoundedWidthimpl(j)) {
            m73810getMaxWidthimpl = Constraints.m73810getMaxWidthimpl(j);
        } else {
            m73810getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (Constraints.m73812getMinWidthimpl(j) != m73810getMaxWidthimpl) {
            return AbstractC11695c.coerceIn(TextDelegateKt.ceilToIntPx(f), Constraints.m73812getMinWidthimpl(j), m73810getMaxWidthimpl);
        }
        return m73810getMaxWidthimpl;
    }
}