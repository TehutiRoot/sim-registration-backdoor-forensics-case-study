package androidx.camera.extensions.internal.compat.workaround;

import androidx.annotation.RequiresApi;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.ExtensionDisabledQuirk;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExtensionDisabledValidator {

    /* renamed from: a */
    public final ExtensionDisabledQuirk f11532a = (ExtensionDisabledQuirk) DeviceQuirks.get(ExtensionDisabledQuirk.class);

    public boolean shouldDisableExtension() {
        ExtensionDisabledQuirk extensionDisabledQuirk = this.f11532a;
        if (extensionDisabledQuirk != null && extensionDisabledQuirk.shouldDisableExtension()) {
            return true;
        }
        return false;
    }
}
