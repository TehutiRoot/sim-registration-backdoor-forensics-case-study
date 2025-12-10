package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface CameraCharacteristicsProvider {
    @Nullable
    <T> T get(@NonNull CameraCharacteristics.Key<T> key);
}
