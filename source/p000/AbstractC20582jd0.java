package p000;

import android.util.Size;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: jd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC20582jd0 {
    static {
        int i = ImageOutputConfig.INVALID_ROTATION;
    }

    /* renamed from: a */
    public static int m29183a(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_APP_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    /* renamed from: b */
    public static List m29182b(ImageOutputConfig imageOutputConfig) {
        List list = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS);
        Objects.requireNonNull(list);
        return new ArrayList(list);
    }

    /* renamed from: c */
    public static List m29181c(ImageOutputConfig imageOutputConfig, List list) {
        List list2 = (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_CUSTOM_ORDERED_RESOLUTIONS, list);
        if (list2 != null) {
            return new ArrayList(list2);
        }
        return null;
    }

    /* renamed from: d */
    public static Size m29180d(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION);
    }

    /* renamed from: e */
    public static Size m29179e(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_DEFAULT_RESOLUTION, size);
    }

    /* renamed from: f */
    public static Size m29178f(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION);
    }

    /* renamed from: g */
    public static Size m29177g(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, size);
    }

    /* renamed from: h */
    public static int m29176h(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_MIRROR_MODE, Integer.valueOf(i))).intValue();
    }

    /* renamed from: i */
    public static ResolutionSelector m29175i(ImageOutputConfig imageOutputConfig) {
        return (ResolutionSelector) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR);
    }

    /* renamed from: j */
    public static ResolutionSelector m29174j(ImageOutputConfig imageOutputConfig, ResolutionSelector resolutionSelector) {
        return (ResolutionSelector) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_RESOLUTION_SELECTOR, resolutionSelector);
    }

    /* renamed from: k */
    public static List m29173k(ImageOutputConfig imageOutputConfig) {
        return (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS);
    }

    /* renamed from: l */
    public static List m29172l(ImageOutputConfig imageOutputConfig, List list) {
        return (List) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_SUPPORTED_RESOLUTIONS, list);
    }

    /* renamed from: m */
    public static int m29171m(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO)).intValue();
    }

    /* renamed from: n */
    public static Size m29170n(ImageOutputConfig imageOutputConfig) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION);
    }

    /* renamed from: o */
    public static Size m29169o(ImageOutputConfig imageOutputConfig, Size size) {
        return (Size) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_RESOLUTION, size);
    }

    /* renamed from: p */
    public static int m29168p(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION)).intValue();
    }

    /* renamed from: q */
    public static int m29167q(ImageOutputConfig imageOutputConfig, int i) {
        return ((Integer) imageOutputConfig.retrieveOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(i))).intValue();
    }

    /* renamed from: r */
    public static boolean m29166r(ImageOutputConfig imageOutputConfig) {
        return imageOutputConfig.containsOption(ImageOutputConfig.OPTION_TARGET_ASPECT_RATIO);
    }

    /* renamed from: s */
    public static void m29165s(ImageOutputConfig imageOutputConfig) {
        boolean z;
        boolean hasTargetAspectRatio = imageOutputConfig.hasTargetAspectRatio();
        if (imageOutputConfig.getTargetResolution(null) != null) {
            z = true;
        } else {
            z = false;
        }
        if (hasTargetAspectRatio && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.getResolutionSelector(null) != null) {
            if (hasTargetAspectRatio || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
