package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.b */
/* loaded from: classes.dex */
public class C2365b implements CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {

    /* renamed from: a */
    public final CameraCharacteristics f10571a;

    public C2365b(CameraCharacteristics cameraCharacteristics) {
        this.f10571a = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Object get(CameraCharacteristics.Key key) {
        return this.f10571a.get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set getPhysicalCameraIds() {
        return Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public CameraCharacteristics unwrap() {
        return this.f10571a;
    }
}