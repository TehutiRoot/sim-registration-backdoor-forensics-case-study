package androidx.compose.p003ui.text.style;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u000b\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, m28850d2 = {"", "i1", "i2", "i3", PDPageLabelRange.STYLE_LETTERS_LOWER, "(III)I", "mask", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(I)I", OperatorName.CURVE_TO, "d", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.style.LineBreak_androidKt */
/* loaded from: classes2.dex */
public final class LineBreak_androidKt {
    /* renamed from: a */
    public static final int m58974a(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* renamed from: b */
    public static final int m58973b(int i) {
        return i & 255;
    }

    /* renamed from: c */
    public static final int m58972c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static final int m58971d(int i) {
        return (i >> 16) & 255;
    }
}
