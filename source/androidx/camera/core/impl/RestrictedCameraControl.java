package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class RestrictedCameraControl extends ForwardingCameraControl {
    public static final int AE_REGION = 3;
    public static final int AF_REGION = 2;
    public static final int AUTO_FOCUS = 1;
    public static final int AWB_REGION = 4;
    public static final int EXPOSURE_COMPENSATION = 7;
    public static final int FLASH = 5;
    public static final int TORCH = 6;
    public static final int ZOOM = 0;

    /* renamed from: b */
    public final CameraControlInternal f11168b;

    /* renamed from: c */
    public volatile boolean f11169c;

    /* renamed from: d */
    public volatile Set f11170d;

    /* loaded from: classes.dex */
    public @interface CameraOperation {
    }

    public RestrictedCameraControl(@NonNull CameraControlInternal cameraControlInternal) {
        super(cameraControlInternal);
        this.f11169c = false;
        this.f11168b = cameraControlInternal;
    }

    /* renamed from: a */
    public FocusMeteringAction m62917a(FocusMeteringAction focusMeteringAction) {
        boolean z;
        FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
        boolean z2 = true;
        if (!focusMeteringAction.getMeteringPointsAf().isEmpty() && !m62916b(1, 2)) {
            builder.removePoints(1);
            z = true;
        } else {
            z = false;
        }
        if (!focusMeteringAction.getMeteringPointsAe().isEmpty() && !m62916b(3)) {
            builder.removePoints(2);
            z = true;
        }
        if (!focusMeteringAction.getMeteringPointsAwb().isEmpty() && !m62916b(4)) {
            builder.removePoints(4);
        } else {
            z2 = z;
        }
        if (!z2) {
            return focusMeteringAction;
        }
        FocusMeteringAction build = builder.build();
        if (build.getMeteringPointsAf().isEmpty() && build.getMeteringPointsAe().isEmpty() && build.getMeteringPointsAwb().isEmpty()) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: b */
    public boolean m62916b(int... iArr) {
        if (this.f11169c && this.f11170d != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            return this.f11170d.containsAll(arrayList);
        }
        return true;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> cancelFocusAndMetering() {
        return this.f11168b.cancelFocusAndMetering();
    }

    public void enableRestrictedOperations(boolean z, @Nullable @CameraOperation Set<Integer> set) {
        this.f11169c = z;
        this.f11170d = set;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> enableTorch(boolean z) {
        if (!m62916b(6)) {
            return Futures.immediateFailedFuture(new IllegalStateException("Torch is not supported"));
        }
        return this.f11168b.enableTorch(z);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.impl.CameraControlInternal
    @NonNull
    public CameraControlInternal getImplementation() {
        return this.f11168b;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Integer> setExposureCompensationIndex(int i) {
        if (!m62916b(7)) {
            return Futures.immediateFailedFuture(new IllegalStateException("ExposureCompensation is not supported"));
        }
        return this.f11168b.setExposureCompensationIndex(i);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setLinearZoom(float f) {
        if (!m62916b(0)) {
            return Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported"));
        }
        return this.f11168b.setLinearZoom(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<Void> setZoomRatio(float f) {
        if (!m62916b(0)) {
            return Futures.immediateFailedFuture(new IllegalStateException("Zoom is not supported"));
        }
        return this.f11168b.setZoomRatio(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    @NonNull
    public ListenableFuture<FocusMeteringResult> startFocusAndMetering(@NonNull FocusMeteringAction focusMeteringAction) {
        FocusMeteringAction m62917a = m62917a(focusMeteringAction);
        if (m62917a == null) {
            return Futures.immediateFailedFuture(new IllegalStateException("FocusMetering is not supported"));
        }
        return this.f11168b.startFocusAndMetering(m62917a);
    }
}
