package p000;

import androidx.compose.p003ui.focus.FocusManager;

/* renamed from: F30 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class F30 {
    /* renamed from: a */
    public static /* synthetic */ void m68540a(FocusManager focusManager, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            focusManager.clearFocus(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
    }
}