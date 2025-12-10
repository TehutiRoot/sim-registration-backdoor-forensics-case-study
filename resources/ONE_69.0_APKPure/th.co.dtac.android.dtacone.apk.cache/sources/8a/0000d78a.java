package p000;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.C2365b;
import androidx.camera.core.Logger;
import java.util.Collections;
import java.util.Set;

/* renamed from: jj */
/* loaded from: classes.dex */
public class C11538jj extends C2365b {
    public C11538jj(CameraCharacteristics cameraCharacteristics) {
        super(cameraCharacteristics);
    }

    @Override // androidx.camera.camera2.internal.compat.C2365b, androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set getPhysicalCameraIds() {
        try {
            return this.f10571a.getPhysicalCameraIds();
        } catch (Exception e) {
            Logger.m63175e("CameraCharacteristicsImpl", "CameraCharacteristics.getPhysicalCameraIds throws an exception.", e);
            return Collections.emptySet();
        }
    }
}