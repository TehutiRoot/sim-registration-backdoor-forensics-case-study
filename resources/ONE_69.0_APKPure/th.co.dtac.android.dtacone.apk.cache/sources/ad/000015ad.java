package p000;

import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigs;
import androidx.camera.core.impl.CameraInternal;
import java.util.Collections;
import java.util.LinkedHashSet;

/* renamed from: Wj */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1620Wj {
    /* renamed from: a */
    public static CameraControl m65670a(CameraInternal cameraInternal) {
        return cameraInternal.getCameraControlInternal();
    }

    /* renamed from: b */
    public static CameraInfo m65669b(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal();
    }

    /* renamed from: c */
    public static LinkedHashSet m65668c(CameraInternal cameraInternal) {
        return new LinkedHashSet(Collections.singleton(cameraInternal));
    }

    /* renamed from: d */
    public static CameraConfig m65667d(CameraInternal cameraInternal) {
        return CameraConfigs.emptyConfig();
    }

    /* renamed from: e */
    public static boolean m65666e(CameraInternal cameraInternal) {
        return true;
    }

    /* renamed from: f */
    public static boolean m65665f(CameraInternal cameraInternal) {
        if (cameraInternal.getCameraInfo().getLensFacing() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static void m65664g(CameraInternal cameraInternal, boolean z) {
    }

    /* renamed from: h */
    public static void m65663h(CameraInternal cameraInternal, CameraConfig cameraConfig) {
    }
}