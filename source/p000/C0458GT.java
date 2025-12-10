package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

/* renamed from: GT */
/* loaded from: classes.dex */
public class C0458GT implements ExposureState {

    /* renamed from: a */
    public final Object f1936a = new Object();

    /* renamed from: b */
    public final CameraCharacteristicsCompat f1937b;

    /* renamed from: c */
    public int f1938c;

    public C0458GT(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i) {
        this.f1937b = cameraCharacteristicsCompat;
        this.f1938c = i;
    }

    /* renamed from: a */
    public void m68236a(int i) {
        synchronized (this.f1936a) {
            this.f1938c = i;
        }
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.f1936a) {
            i = this.f1938c;
        }
        return i;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return (Range) this.f1937b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        if (!isExposureCompensationSupported()) {
            return Rational.ZERO;
        }
        return (Rational) this.f1937b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.f1937b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null && ((Integer) range.getLower()).intValue() != 0 && ((Integer) range.getUpper()).intValue() != 0) {
            return true;
        }
        return false;
    }
}
