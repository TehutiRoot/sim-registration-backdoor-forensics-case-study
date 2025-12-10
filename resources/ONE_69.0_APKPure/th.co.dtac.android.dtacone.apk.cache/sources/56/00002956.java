package androidx.compose.foundation.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Rect;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, m29142d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect", PDPageLabelRange.STYLE_LETTERS_LOWER, "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, m29141k = 2, m29140mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextLayoutResultProxyKt {
    /* renamed from: a */
    public static final long m61001a(long j, Rect rect) {
        float m71686getXimpl;
        float m71687getYimpl;
        if (Offset.m71686getXimpl(j) < rect.getLeft()) {
            m71686getXimpl = rect.getLeft();
        } else if (Offset.m71686getXimpl(j) > rect.getRight()) {
            m71686getXimpl = rect.getRight();
        } else {
            m71686getXimpl = Offset.m71686getXimpl(j);
        }
        if (Offset.m71687getYimpl(j) < rect.getTop()) {
            m71687getYimpl = rect.getTop();
        } else if (Offset.m71687getYimpl(j) > rect.getBottom()) {
            m71687getYimpl = rect.getBottom();
        } else {
            m71687getYimpl = Offset.m71687getYimpl(j);
        }
        return OffsetKt.Offset(m71686getXimpl, m71687getYimpl);
    }

    /* renamed from: access$coerceIn-3MmeM6k  reason: not valid java name */
    public static final /* synthetic */ long m69990access$coerceIn3MmeM6k(long j, Rect rect) {
        return m61001a(j, rect);
    }
}