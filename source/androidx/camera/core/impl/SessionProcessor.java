package androidx.camera.core.impl;

import android.hardware.camera2.CaptureResult;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.RestrictedCameraControl;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface SessionProcessor {

    /* loaded from: classes.dex */
    public interface CaptureCallback {
        void onCaptureCompleted(long j, int i, @NonNull Map<CaptureResult.Key, Object> map);

        void onCaptureFailed(int i);

        void onCaptureProcessStarted(int i);

        void onCaptureSequenceAborted(int i);

        void onCaptureSequenceCompleted(int i);

        void onCaptureStarted(int i, long j);
    }

    void abortCapture(int i);

    void deInitSession();

    @Nullable
    Pair<Long, Long> getRealtimeCaptureLatency();

    @NonNull
    @RestrictedCameraControl.CameraOperation
    Set<Integer> getSupportedCameraOperations();

    @NonNull
    SessionConfig initSession(@NonNull CameraInfo cameraInfo, @NonNull OutputSurface outputSurface, @NonNull OutputSurface outputSurface2, @Nullable OutputSurface outputSurface3);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(@NonNull RequestProcessor requestProcessor);

    void setParameters(@NonNull Config config);

    int startCapture(@NonNull CaptureCallback captureCallback);

    int startRepeating(@NonNull CaptureCallback captureCallback);

    int startTrigger(@NonNull Config config, @NonNull CaptureCallback captureCallback);

    void stopRepeating();
}
