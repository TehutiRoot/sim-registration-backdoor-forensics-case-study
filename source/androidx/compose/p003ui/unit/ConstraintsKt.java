package androidx.compose.p003ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Constraints;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.ranges.AbstractC11719c;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\u001a:\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\u000b\u001a\u00020\f*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001a!\u0010\u0012\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\u0016*\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001e\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u0000H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m28850d2 = {"", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", Constraints.TAG, "(IIII)J", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", TypedValues.CycleType.S_WAVE_OFFSET, "max", "value", PDPageLabelRange.STYLE_LETTERS_LOWER, "(II)I", "ui-unit_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.unit.ConstraintsKt */
/* loaded from: classes2.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i, int i2, int i3, int i4) {
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i >= 0 && i3 >= 0) {
                    return Constraints.Companion.m73633createConstraintsZbe2FdA$ui_unit_release(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public static /* synthetic */ long Constraints$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return Constraints(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static final int m58871a(int i, int i2) {
        if (i != Integer.MAX_VALUE) {
            return AbstractC11719c.coerceAtLeast(i + i2, 0);
        }
        return i;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM  reason: not valid java name */
    public static final long m73637constrain4WqzIAM(long j, long j2) {
        return IntSizeKt.IntSize(AbstractC11719c.coerceIn(IntSize.m73818getWidthimpl(j2), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j)), AbstractC11719c.coerceIn(IntSize.m73817getHeightimpl(j2), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j)));
    }

    /* renamed from: constrain-N9IONVI  reason: not valid java name */
    public static final long m73638constrainN9IONVI(long j, long j2) {
        return Constraints(AbstractC11719c.coerceIn(Constraints.m73628getMinWidthimpl(j2), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j)), AbstractC11719c.coerceIn(Constraints.m73626getMaxWidthimpl(j2), Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j)), AbstractC11719c.coerceIn(Constraints.m73627getMinHeightimpl(j2), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j)), AbstractC11719c.coerceIn(Constraints.m73625getMaxHeightimpl(j2), Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j)));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA  reason: not valid java name */
    public static final int m73639constrainHeightK40F9xA(long j, int i) {
        return AbstractC11719c.coerceIn(i, Constraints.m73627getMinHeightimpl(j), Constraints.m73625getMaxHeightimpl(j));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA  reason: not valid java name */
    public static final int m73640constrainWidthK40F9xA(long j, int i) {
        return AbstractC11719c.coerceIn(i, Constraints.m73628getMinWidthimpl(j), Constraints.m73626getMaxWidthimpl(j));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM  reason: not valid java name */
    public static final boolean m73641isSatisfiedBy4WqzIAM(long j, long j2) {
        int m73628getMinWidthimpl = Constraints.m73628getMinWidthimpl(j);
        int m73626getMaxWidthimpl = Constraints.m73626getMaxWidthimpl(j);
        int m73818getWidthimpl = IntSize.m73818getWidthimpl(j2);
        if (m73628getMinWidthimpl <= m73818getWidthimpl && m73818getWidthimpl <= m73626getMaxWidthimpl) {
            int m73627getMinHeightimpl = Constraints.m73627getMinHeightimpl(j);
            int m73625getMaxHeightimpl = Constraints.m73625getMaxHeightimpl(j);
            int m73817getHeightimpl = IntSize.m73817getHeightimpl(j2);
            if (m73627getMinHeightimpl <= m73817getHeightimpl && m73817getHeightimpl <= m73625getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U  reason: not valid java name */
    public static final long m73642offsetNN6EwU(long j, int i, int i2) {
        return Constraints(AbstractC11719c.coerceAtLeast(Constraints.m73628getMinWidthimpl(j) + i, 0), m58871a(Constraints.m73626getMaxWidthimpl(j), i), AbstractC11719c.coerceAtLeast(Constraints.m73627getMinHeightimpl(j) + i2, 0), m58871a(Constraints.m73625getMaxHeightimpl(j), i2));
    }

    /* renamed from: offset-NN6Ew-U$default  reason: not valid java name */
    public static /* synthetic */ long m73643offsetNN6EwU$default(long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m73642offsetNN6EwU(j, i, i2);
    }
}
