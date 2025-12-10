package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.ranges.AbstractC11719c;

@Metadata(m28851d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, m28850d2 = {"finalConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxIntrinsicWidth", "", "finalConstraints-tfFHcEY", "(JZIF)J", "finalMaxLines", "", "maxLinesIn", "finalMaxLines-xdlQI24", "(ZII)I", "finalMaxWidth", "finalMaxWidth-tfFHcEY", "(JZIF)I", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes.dex */
public final class LayoutUtilsKt {
    /* renamed from: finalConstraints-tfFHcEY  reason: not valid java name */
    public static final long m69807finalConstraintstfFHcEY(long j, boolean z, int i, float f) {
        return ConstraintsKt.Constraints$default(0, m69809finalMaxWidthtfFHcEY(j, z, i, f), 0, Constraints.m73625getMaxHeightimpl(j), 5, null);
    }

    /* renamed from: finalMaxLines-xdlQI24  reason: not valid java name */
    public static final int m69808finalMaxLinesxdlQI24(boolean z, int i, int i2) {
        if (!z && TextOverflow.m73587equalsimpl0(i, TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) {
            return 1;
        }
        return AbstractC11719c.coerceAtLeast(i2, 1);
    }

    /* renamed from: finalMaxWidth-tfFHcEY  reason: not valid java name */
    public static final int m69809finalMaxWidthtfFHcEY(long j, boolean z, int i, float f) {
        int m73626getMaxWidthimpl;
        if ((z || TextOverflow.m73587equalsimpl0(i, TextOverflow.Companion.m73595getEllipsisgIe3tQ8())) && Constraints.m73622getHasBoundedWidthimpl(j)) {
            m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        } else {
            m73626getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (Constraints.m73628getMinWidthimpl(j) != m73626getMaxWidthimpl) {
            return AbstractC11719c.coerceIn(TextDelegateKt.ceilToIntPx(f), Constraints.m73628getMinWidthimpl(j), m73626getMaxWidthimpl);
        }
        return m73626getMaxWidthimpl;
    }
}
