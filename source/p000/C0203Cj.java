package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.C2385d;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.core.util.Preconditions;

/* renamed from: Cj */
/* loaded from: classes.dex */
public class C0203Cj extends C2385d {
    public C0203Cj(CameraDevice cameraDevice) {
        super((CameraDevice) Preconditions.checkNotNull(cameraDevice), null);
    }

    @Override // androidx.camera.camera2.internal.compat.C2385d, androidx.camera.camera2.internal.compat.C2384c, androidx.camera.camera2.internal.compat.C2386e, androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2377a
    /* renamed from: a */
    public void mo63675a(SessionConfigurationCompat sessionConfigurationCompat) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.unwrap();
        Preconditions.checkNotNull(sessionConfiguration);
        try {
            this.f10484a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
