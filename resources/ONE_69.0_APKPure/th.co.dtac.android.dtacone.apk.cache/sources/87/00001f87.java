package androidx.camera.core.impl;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ExposureState;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ZoomState;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

@RequiresApi(21)
/* loaded from: classes.dex */
public class RestrictedCameraInfo extends ForwardingCameraInfo {

    /* renamed from: b */
    public final CameraInfoInternal f11259b;

    /* renamed from: c */
    public final RestrictedCameraControl f11260c;

    /* renamed from: androidx.camera.core.impl.RestrictedCameraInfo$a */
    /* loaded from: classes.dex */
    public class C2489a implements ExposureState {
        public C2489a() {
        }

        @Override // androidx.camera.core.ExposureState
        public int getExposureCompensationIndex() {
            return 0;
        }

        @Override // androidx.camera.core.ExposureState
        public Range getExposureCompensationRange() {
            return new Range(0, 0);
        }

        @Override // androidx.camera.core.ExposureState
        public Rational getExposureCompensationStep() {
            return Rational.ZERO;
        }

        @Override // androidx.camera.core.ExposureState
        public boolean isExposureCompensationSupported() {
            return false;
        }
    }

    public RestrictedCameraInfo(@NonNull CameraInfoInternal cameraInfoInternal, @NonNull RestrictedCameraControl restrictedCameraControl) {
        super(cameraInfoInternal);
        this.f11259b = cameraInfoInternal;
        this.f11260c = restrictedCameraControl;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public ExposureState getExposureState() {
        if (!this.f11260c.m62864b(7)) {
            return new C2489a();
        }
        return this.f11259b.getExposureState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    @NonNull
    public CameraInfoInternal getImplementation() {
        return this.f11259b;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<Integer> getTorchState() {
        if (!this.f11260c.m62864b(6)) {
            return new MutableLiveData(0);
        }
        return this.f11259b.getTorchState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    @NonNull
    public LiveData<ZoomState> getZoomState() {
        if (!this.f11260c.m62864b(0)) {
            return new MutableLiveData(ImmutableZoomState.create(1.0f, 1.0f, 1.0f, 0.0f));
        }
        return this.f11259b.getZoomState();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        if (!this.f11260c.m62864b(5)) {
            return false;
        }
        return this.f11259b.hasFlashUnit();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(@NonNull FocusMeteringAction focusMeteringAction) {
        if (this.f11260c.m62865a(focusMeteringAction) == null) {
            return false;
        }
        return this.f11259b.isFocusMeteringSupported(focusMeteringAction);
    }
}