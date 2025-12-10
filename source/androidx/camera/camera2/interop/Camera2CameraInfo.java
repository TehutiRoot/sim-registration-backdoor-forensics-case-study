package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.Camera2CameraInfoImpl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.core.util.Preconditions;
import java.util.Map;

@RequiresApi(21)
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public final class Camera2CameraInfo {

    /* renamed from: a */
    public final Camera2CameraInfoImpl f10740a;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Camera2CameraInfo(@NonNull Camera2CameraInfoImpl camera2CameraInfoImpl) {
        this.f10740a = camera2CameraInfoImpl;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static CameraCharacteristics extractCameraCharacteristics(@NonNull CameraInfo cameraInfo) {
        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
        Preconditions.checkState(implementation instanceof Camera2CameraInfoImpl, "CameraInfo does not contain any Camera2 information.");
        return ((Camera2CameraInfoImpl) implementation).getCameraCharacteristicsCompat().toCameraCharacteristics();
    }

    @NonNull
    public static Camera2CameraInfo from(@NonNull CameraInfo cameraInfo) {
        CameraInfoInternal implementation = ((CameraInfoInternal) cameraInfo).getImplementation();
        Preconditions.checkArgument(implementation instanceof Camera2CameraInfoImpl, "CameraInfo doesn't contain Camera2 implementation.");
        return ((Camera2CameraInfoImpl) implementation).getCamera2CameraInfo();
    }

    @Nullable
    public <T> T getCameraCharacteristic(@NonNull CameraCharacteristics.Key<T> key) {
        return (T) this.f10740a.getCameraCharacteristicsCompat().get(key);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        return this.f10740a.getCameraCharacteristicsMap();
    }

    @NonNull
    public String getCameraId() {
        return this.f10740a.getCameraId();
    }
}
