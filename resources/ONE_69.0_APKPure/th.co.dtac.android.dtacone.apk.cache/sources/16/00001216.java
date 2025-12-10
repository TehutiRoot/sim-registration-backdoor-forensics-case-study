package p000;

import android.util.Range;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* renamed from: T02 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class T02 {
    /* renamed from: a */
    public static CameraSelector m66419a(UseCaseConfig useCaseConfig) {
        return (CameraSelector) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR);
    }

    /* renamed from: b */
    public static CameraSelector m66418b(UseCaseConfig useCaseConfig, CameraSelector cameraSelector) {
        return (CameraSelector) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAMERA_SELECTOR, cameraSelector);
    }

    /* renamed from: c */
    public static CaptureConfig.OptionUnpacker m66417c(UseCaseConfig useCaseConfig) {
        return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER);
    }

    /* renamed from: d */
    public static CaptureConfig.OptionUnpacker m66416d(UseCaseConfig useCaseConfig, CaptureConfig.OptionUnpacker optionUnpacker) {
        return (CaptureConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: e */
    public static UseCaseConfigFactory.CaptureType m66415e(UseCaseConfig useCaseConfig) {
        return (UseCaseConfigFactory.CaptureType) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_CAPTURE_TYPE);
    }

    /* renamed from: f */
    public static CaptureConfig m66414f(UseCaseConfig useCaseConfig) {
        return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG);
    }

    /* renamed from: g */
    public static CaptureConfig m66413g(UseCaseConfig useCaseConfig, CaptureConfig captureConfig) {
        return (CaptureConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, captureConfig);
    }

    /* renamed from: h */
    public static SessionConfig m66412h(UseCaseConfig useCaseConfig) {
        return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG);
    }

    /* renamed from: i */
    public static SessionConfig m66411i(UseCaseConfig useCaseConfig, SessionConfig sessionConfig) {
        return (SessionConfig) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, sessionConfig);
    }

    /* renamed from: j */
    public static SessionConfig.OptionUnpacker m66410j(UseCaseConfig useCaseConfig) {
        return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER);
    }

    /* renamed from: k */
    public static SessionConfig.OptionUnpacker m66409k(UseCaseConfig useCaseConfig, SessionConfig.OptionUnpacker optionUnpacker) {
        return (SessionConfig.OptionUnpacker) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, optionUnpacker);
    }

    /* renamed from: l */
    public static int m66408l(UseCaseConfig useCaseConfig) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY)).intValue();
    }

    /* renamed from: m */
    public static int m66407m(UseCaseConfig useCaseConfig, int i) {
        return ((Integer) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_SURFACE_OCCUPANCY_PRIORITY, Integer.valueOf(i))).intValue();
    }

    /* renamed from: n */
    public static Range m66406n(UseCaseConfig useCaseConfig) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE);
    }

    /* renamed from: o */
    public static Range m66405o(UseCaseConfig useCaseConfig, Range range) {
        return (Range) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_TARGET_FRAME_RATE, range);
    }

    /* renamed from: p */
    public static boolean m66404p(UseCaseConfig useCaseConfig, boolean z) {
        return ((Boolean) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_HIGH_RESOLUTION_DISABLED, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: q */
    public static boolean m66403q(UseCaseConfig useCaseConfig, boolean z) {
        return ((Boolean) useCaseConfig.retrieveOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z))).booleanValue();
    }
}