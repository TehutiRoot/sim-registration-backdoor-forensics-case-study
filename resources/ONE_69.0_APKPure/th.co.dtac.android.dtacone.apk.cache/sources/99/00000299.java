package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.C2367d;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.core.util.Preconditions;

/* renamed from: Cj */
/* loaded from: classes.dex */
public class C0197Cj extends C2367d {
    public C0197Cj(CameraDevice cameraDevice) {
        super((CameraDevice) Preconditions.checkNotNull(cameraDevice), null);
    }

    @Override // androidx.camera.camera2.internal.compat.C2367d, androidx.camera.camera2.internal.compat.C2366c, androidx.camera.camera2.internal.compat.C2368e, androidx.camera.camera2.internal.compat.CameraDeviceCompat.InterfaceC2359a
    /* renamed from: a */
    public void mo63626a(SessionConfigurationCompat sessionConfigurationCompat) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.unwrap();
        Preconditions.checkNotNull(sessionConfiguration);
        try {
            this.f10572a.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}