package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, m28850d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.text.input.EditingBufferKt */
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m73349updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m73212getLengthimpl;
        int m73214getMinimpl = TextRange.m73214getMinimpl(j);
        int m73213getMaximpl = TextRange.m73213getMaximpl(j);
        if (TextRange.m73218intersects5zctL8(j2, j)) {
            if (TextRange.m73206contains5zctL8(j2, j)) {
                m73214getMinimpl = TextRange.m73214getMinimpl(j2);
                m73213getMaximpl = m73214getMinimpl;
            } else {
                if (TextRange.m73206contains5zctL8(j, j2)) {
                    m73212getLengthimpl = TextRange.m73212getLengthimpl(j2);
                } else if (TextRange.m73207containsimpl(j2, m73214getMinimpl)) {
                    m73214getMinimpl = TextRange.m73214getMinimpl(j2);
                    m73212getLengthimpl = TextRange.m73212getLengthimpl(j2);
                } else {
                    m73213getMaximpl = TextRange.m73214getMinimpl(j2);
                }
                m73213getMaximpl -= m73212getLengthimpl;
            }
        } else if (m73213getMaximpl > TextRange.m73214getMinimpl(j2)) {
            m73214getMinimpl -= TextRange.m73212getLengthimpl(j2);
            m73212getLengthimpl = TextRange.m73212getLengthimpl(j2);
            m73213getMaximpl -= m73212getLengthimpl;
        }
        return TextRangeKt.TextRange(m73214getMinimpl, m73213getMaximpl);
    }
}
