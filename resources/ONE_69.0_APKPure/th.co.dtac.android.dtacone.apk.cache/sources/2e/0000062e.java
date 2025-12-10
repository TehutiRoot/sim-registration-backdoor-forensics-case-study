package p000;

import android.os.Bundle;
import androidx.browser.trusted.TrustedWebActivityDisplayMode;

/* renamed from: GW1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class GW1 {
    /* renamed from: a */
    public static TrustedWebActivityDisplayMode m68272a(Bundle bundle) {
        if (bundle.getInt(TrustedWebActivityDisplayMode.KEY_ID) != 1) {
            return new TrustedWebActivityDisplayMode.DefaultMode();
        }
        return TrustedWebActivityDisplayMode.ImmersiveMode.m63957a(bundle);
    }
}