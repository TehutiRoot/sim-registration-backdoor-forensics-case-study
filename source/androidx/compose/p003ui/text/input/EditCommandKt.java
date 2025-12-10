package androidx.compose.p003ui.text.input;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m28850d2 = {"", "high", "low", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(CC)Z", "ui-text_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.text.input.EditCommandKt */
/* loaded from: classes2.dex */
public final class EditCommandKt {
    /* renamed from: a */
    public static final boolean m59034a(char c, char c2) {
        if (Character.isHighSurrogate(c) && Character.isLowSurrogate(c2)) {
            return true;
        }
        return false;
    }
}
