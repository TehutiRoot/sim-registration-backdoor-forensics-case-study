package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public interface SynchronizedCaptureSession {

    /* loaded from: classes.dex */
    public static abstract class StateCallback {
        /* renamed from: d */
        public void mo63367d(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* renamed from: e */
        public void mo63366e(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* renamed from: f */
        public void mo52015f(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* renamed from: g */
        public void mo63365g(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* renamed from: h */
        public void mo63364h(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        /* renamed from: i */
        public void mo63363i(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }

        public void onClosed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(@NonNull SynchronizedCaptureSession synchronizedCaptureSession) {
        }
    }

    void abortCaptures() throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int captureSingleRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void close();

    void finishClose();

    @NonNull
    CameraDevice getDevice();

    @Nullable
    Surface getInputSurface();

    @NonNull
    ListenableFuture<Void> getOpeningBlocker();

    @NonNull
    StateCallback getStateCallback();

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setRepeatingBurstRequests(@NonNull List<CaptureRequest> list, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    int setSingleRepeatingRequest(@NonNull CaptureRequest captureRequest, @NonNull Executor executor, @NonNull CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException;

    void stopRepeating() throws CameraAccessException;

    @NonNull
    CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
