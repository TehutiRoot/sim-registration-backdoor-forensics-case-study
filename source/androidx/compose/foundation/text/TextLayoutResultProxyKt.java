package androidx.compose.foundation.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, m28850d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* renamed from: a */
    public static final long m61051a(long j, Rect rect) {
        float m71502getXimpl;
        float m71503getYimpl;
        if (Offset.m71502getXimpl(j) < rect.getLeft()) {
            m71502getXimpl = rect.getLeft();
        } else if (Offset.m71502getXimpl(j) > rect.getRight()) {
            m71502getXimpl = rect.getRight();
        } else {
            m71502getXimpl = Offset.m71502getXimpl(j);
        }
        if (Offset.m71503getYimpl(j) < rect.getTop()) {
            m71503getYimpl = rect.getTop();
        } else if (Offset.m71503getYimpl(j) > rect.getBottom()) {
            m71503getYimpl = rect.getBottom();
        } else {
            m71503getYimpl = Offset.m71503getYimpl(j);
        }
        return OffsetKt.Offset(m71502getXimpl, m71503getYimpl);
    }
}
