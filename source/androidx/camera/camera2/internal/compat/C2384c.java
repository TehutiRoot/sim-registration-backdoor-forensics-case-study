package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C2386e;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.core.util.Preconditions;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.c */
/* loaded from: classes.dex */
public class C2384c extends C2386e {
    public C2384c(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: g */
    public static C2384c m63677g(CameraDevice cameraDevice, Handler handler) {
        return new C2384c(cameraDevice, new C2386e.C2387a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.C2386e, androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2377a
    /* renamed from: a */
    public void mo63675a(SessionConfigurationCompat sessionConfigurationCompat) {
        C2386e.m63673c(this.f10484a, sessionConfigurationCompat);
        CameraCaptureSessionCompat.C2376c c2376c = new CameraCaptureSessionCompat.C2376c(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        List<Surface> m63670f = C2386e.m63670f(sessionConfigurationCompat.getOutputConfigurations());
        Handler handler = ((C2386e.C2387a) Preconditions.checkNotNull((C2386e.C2387a) this.f10485b)).f10486a;
        InputConfigurationCompat inputConfiguration = sessionConfigurationCompat.getInputConfiguration();
        try {
            if (inputConfiguration != null) {
                InputConfiguration inputConfiguration2 = (InputConfiguration) inputConfiguration.unwrap();
                Preconditions.checkNotNull(inputConfiguration2);
                this.f10484a.createReprocessableCaptureSession(inputConfiguration2, m63670f, c2376c, handler);
            } else if (sessionConfigurationCompat.getSessionType() == 1) {
                this.f10484a.createConstrainedHighSpeedCaptureSession(m63670f, c2376c, handler);
            } else {
                m63671e(this.f10484a, m63670f, c2376c, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
