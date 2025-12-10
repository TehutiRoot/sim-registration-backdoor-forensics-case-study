package androidx.compose.p003ui.text.input;

import androidx.compose.p003ui.text.TextRange;
import androidx.compose.p003ui.text.TextRangeKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0006"}, m29142d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", TypedValues.AttributesType.S_TARGET, "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.text.input.EditingBufferKt */
/* loaded from: classes2.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M  reason: not valid java name */
    public static final long m73533updateRangeAfterDeletepWDy79M(long j, long j2) {
        int m73396getLengthimpl;
        int m73398getMinimpl = TextRange.m73398getMinimpl(j);
        int m73397getMaximpl = TextRange.m73397getMaximpl(j);
        if (TextRange.m73402intersects5zctL8(j2, j)) {
            if (TextRange.m73390contains5zctL8(j2, j)) {
                m73398getMinimpl = TextRange.m73398getMinimpl(j2);
                m73397getMaximpl = m73398getMinimpl;
            } else {
                if (TextRange.m73390contains5zctL8(j, j2)) {
                    m73396getLengthimpl = TextRange.m73396getLengthimpl(j2);
                } else if (TextRange.m73391containsimpl(j2, m73398getMinimpl)) {
                    m73398getMinimpl = TextRange.m73398getMinimpl(j2);
                    m73396getLengthimpl = TextRange.m73396getLengthimpl(j2);
                } else {
                    m73397getMaximpl = TextRange.m73398getMinimpl(j2);
                }
                m73397getMaximpl -= m73396getLengthimpl;
            }
        } else if (m73397getMaximpl > TextRange.m73398getMinimpl(j2)) {
            m73398getMinimpl -= TextRange.m73396getLengthimpl(j2);
            m73396getLengthimpl = TextRange.m73396getLengthimpl(j2);
            m73397getMaximpl -= m73396getLengthimpl;
        }
        return TextRangeKt.TextRange(m73398getMinimpl, m73397getMaximpl);
    }
}