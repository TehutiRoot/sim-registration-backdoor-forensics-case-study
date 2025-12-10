package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.video.Quality;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExcludeStretchedVideoQualityQuirk implements VideoQualityQuirk {
    /* renamed from: a */
    public static boolean m62112a() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J400G".equalsIgnoreCase(Build.MODEL)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m62111b() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-J710MN".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m62110c() {
        if ("Samsung".equalsIgnoreCase(Build.BRAND) && "SM-G610M".equalsIgnoreCase(Build.MODEL) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m62109d() {
        if (!m62112a() && !m62110c() && !m62111b()) {
            return false;
        }
        return true;
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public boolean isProblematicVideoQuality(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull Quality quality) {
        if (m62112a()) {
            if (quality == Quality.FHD || quality == Quality.UHD) {
                return true;
            }
            return false;
        } else if ((m62110c() || m62111b()) && quality == Quality.FHD) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.camera.video.internal.compat.quirk.VideoQualityQuirk
    public /* synthetic */ boolean workaroundBySurfaceProcessing() {
        return AbstractC19627e22.m31596a(this);
    }
}
