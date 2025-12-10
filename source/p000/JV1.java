package p000;

import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

/* renamed from: JV1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class JV1 {
    /* renamed from: a */
    public static TrustedWebActivityDisplayMode m67746a(Bundle bundle) {
        if (bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID) != 1) {
            return new TrustedWebActivityDisplayMode.DefaultMode();
        }
        return TrustedWebActivityDisplayMode.ImmersiveMode.m64006a(bundle);
    }
}
