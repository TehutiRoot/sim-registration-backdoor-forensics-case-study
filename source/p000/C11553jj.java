package p000;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C2383b;
import androidx.camera.core.Logger;
import java.util.Collections;
import java.util.Set;

/* renamed from: jj */
/* loaded from: classes.dex */
public class C11553jj extends C2383b {
    public C11553jj(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // androidx.camera.camera2.internal.compat.C2383b, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set getPhysicalCameraIds() {
        try {
            return this.f10483a.getPhysicalCameraIds();
        } catch (Exception e) {
            Logger.m63227e("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e);
            return Collections.emptySet();
        }
    }
}
