package p000;

import androidx.compose.p003ui.platform.ClipboardManager;
import androidx.compose.p003ui.text.AnnotatedString;

/* renamed from: aq */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5327aq {
    /* renamed from: a */
    public static boolean m52120a(ClipboardManager clipboardManager) {
        AnnotatedString text = clipboardManager.getText();
        if (text == null || text.length() <= 0) {
            return false;
        }
        return true;
    }
}
