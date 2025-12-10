package androidx.camera.core.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Quirk;
import androidx.core.p005os.EnvironmentCompat;

@RequiresApi(21)
/* loaded from: classes.dex */
public final class ImageCaptureRotationOptionQuirk implements Quirk {
    /* renamed from: a */
    public static boolean m62792a() {
        String str = Build.FINGERPRINT;
        if (!str.startsWith("generic") && !str.startsWith(EnvironmentCompat.MEDIA_UNKNOWN)) {
            String str2 = Build.MODEL;
            if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("Cuttlefish") && !str2.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !Build.PRODUCT.equals("google_sdk") && !Build.HARDWARE.contains("ranchu"))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m62791b() {
        if (m62792a() && Build.VERSION.SDK_INT == 21) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62790c() {
        if ("HONOR".equalsIgnoreCase(Build.BRAND) && "STK-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62789d() {
        if ("HUAWEI".equalsIgnoreCase(Build.BRAND) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m62788e() {
        if (!m62789d() && !m62790c() && !m62791b()) {
            return false;
        }
        return true;
    }

    public boolean isSupported(@NonNull Config.Option<?> option) {
        if (option != CaptureConfig.OPTION_ROTATION) {
            return true;
        }
        return false;
    }
}
