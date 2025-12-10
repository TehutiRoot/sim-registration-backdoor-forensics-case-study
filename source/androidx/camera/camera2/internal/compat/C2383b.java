package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import java.util.Collections;
import java.util.Set;

/* renamed from: androidx.camera.camera2.internal.compat.b */
/* loaded from: classes.dex */
public class C2383b implements CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl {

    /* renamed from: a */
    public final CameraCharacteristics f10483a;

    public C2383b(CameraCharacteristics cameraCharacteristics) {
        this.f10483a = cameraCharacteristics;
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Object get(CameraCharacteristics.Key key) {
        return this.f10483a.get(key);
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public Set getPhysicalCameraIds() {
        return Collections.emptySet();
    }

    @Override // androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl
    public CameraCharacteristics unwrap() {
        return this.f10483a;
    }
}
