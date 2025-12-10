package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.SessionProcessor;
import java.util.List;
import java.util.Map;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface VendorExtender {
    @Nullable
    SessionProcessor createSessionProcessor(@NonNull Context context);

    @Nullable
    Range<Long> getEstimatedCaptureLatencyRange(@Nullable Size size);

    @NonNull
    List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions();

    @NonNull
    List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions();

    @NonNull
    Size[] getSupportedYuvAnalysisResolutions();

    void init(@NonNull CameraInfo cameraInfo);

    boolean isExtensionAvailable(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map);
}