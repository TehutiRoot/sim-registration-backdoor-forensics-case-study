package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C2386e;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.core.util.Preconditions;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.compat.d */
/* loaded from: classes.dex */
public class C2385d extends C2384c {
    public C2385d(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    /* renamed from: h */
    public static C2385d m63676h(CameraDevice cameraDevice, Handler handler) {
        return new C2385d(cameraDevice, new C2386e.C2387a(handler));
    }

    @Override // androidx.camera.camera2.internal.compat.C2384c, androidx.camera.camera2.internal.compat.C2386e, androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2377a
    /* renamed from: a */
    public void mo63675a(SessionConfigurationCompat sessionConfigurationCompat) {
        C2386e.m63673c(this.f10484a, sessionConfigurationCompat);
        CameraCaptureSessionCompat.C2376c c2376c = new CameraCaptureSessionCompat.C2376c(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        Handler handler = ((C2386e.C2387a) Preconditions.checkNotNull((C2386e.C2387a) this.f10485b)).f10486a;
        InputConfigurationCompat inputConfiguration = sessionConfigurationCompat.getInputConfiguration();
        try {
            if (inputConfiguration != null) {
                InputConfiguration inputConfiguration2 = (InputConfiguration) inputConfiguration.unwrap();
                Preconditions.checkNotNull(inputConfiguration2);
                this.f10484a.createReprocessableCaptureSessionByConfigurations(inputConfiguration2, SessionConfigurationCompat.transformFromCompat(outputConfigurations), c2376c, handler);
            } else if (sessionConfigurationCompat.getSessionType() == 1) {
                this.f10484a.createConstrainedHighSpeedCaptureSession(C2386e.m63670f(outputConfigurations), c2376c, handler);
            } else {
                this.f10484a.createCaptureSessionByOutputConfigurations(SessionConfigurationCompat.transformFromCompat(outputConfigurations), c2376c, handler);
            }
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
