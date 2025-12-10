package androidx.compose.p003ui.platform;

import android.os.Looper;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Z", "ui_release"}, m28849k = 2, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.platform.AndroidUiDispatcher_androidKt */
/* loaded from: classes2.dex */
public final class AndroidUiDispatcher_androidKt {
    /* renamed from: a */
    public static final boolean m59234a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
