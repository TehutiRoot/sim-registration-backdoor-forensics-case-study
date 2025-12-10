package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;
import java.util.Arrays;
import java.util.Locale;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ReportedVideoQualityNotSupportedQuirk implements VideoQualityQuirk {
    /* renamed from: a */
    public static boolean m62080a() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "HMA-L29".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m62079b() {
        if ("Huawei".equalsIgnoreCase(Build.BRAND) && "LYA-AL00".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m62078c() {
        if ("Huawei".equalsIgnoreCase(Build.MANUFACTURER) && Arrays.asList("JNY-L21A", "JNY-L01A", "JNY-L21B", "JNY-L22A", "JNY-L02A", "JNY-L22B", "JNY-LX1").contains(Build.MODEL.toUpperCase(Locale.US))) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62077d() {
        if ("Vivo".equalsIgnoreCase(Build.BRAND) && "vivo 1820".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m62076e() {
        if (!m62080a() && !m62079b() && !m62077d() && !m62078c()) {
            return false;
        }
        return true;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull Quality quality) {
        if (!m62080a() && !m62079b()) {
            if (m62077d()) {
                if (quality == Quality.f11631HD || quality == Quality.FHD) {
                    return true;
                }
                return false;
            } else if (m62078c() && cameraInfoInternal.getLensFacing() == 0 && (quality == Quality.FHD || quality == Quality.f11631HD)) {
                return true;
            } else {
                return false;
            }
        } else if (quality == Quality.UHD) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean workaroundBySurfaceProcessing() {
        if (!m62080a() && !m62079b() && !m62078c()) {
            return false;
        }
        return true;
    }
}
