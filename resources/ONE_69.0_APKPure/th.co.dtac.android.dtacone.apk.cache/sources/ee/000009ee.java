package p000;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.ExposureState;

/* renamed from: KT */
/* loaded from: classes.dex */
public class C0731KT implements ExposureState {

    /* renamed from: a */
    public final Object f3323a = new Object();

    /* renamed from: b */
    public final CameraCharacteristicsCompat f3324b;

    /* renamed from: c */
    public int f3325c;

    public C0731KT(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i) {
        this.f3324b = cameraCharacteristicsCompat;
        this.f3325c = i;
    }

    /* renamed from: a */
    public void m67715a(int i) {
        synchronized (this.f3323a) {
            this.f3325c = i;
        }
    }

    @Override // androidx.camera.core.ExposureState
    public int getExposureCompensationIndex() {
        int i;
        synchronized (this.f3323a) {
            i = this.f3325c;
        }
        return i;
    }

    @Override // androidx.camera.core.ExposureState
    public Range getExposureCompensationRange() {
        return (Range) this.f3324b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // androidx.camera.core.ExposureState
    public Rational getExposureCompensationStep() {
        if (!isExposureCompensationSupported()) {
            return Rational.ZERO;
        }
        return (Rational) this.f3324b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // androidx.camera.core.ExposureState
    public boolean isExposureCompensationSupported() {
        Range range = (Range) this.f3324b.get(CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        if (range != null && ((Integer) range.getLower()).intValue() != 0 && ((Integer) range.getUpper()).intValue() != 0) {
            return true;
        }
        return false;
    }
}