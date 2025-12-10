package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.ExposureControl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

@RequiresApi(21)
/* loaded from: classes.dex */
public class ExposureControl {

    /* renamed from: a */
    public final Camera2CameraControlImpl f10412a;

    /* renamed from: b */
    public final C0458GT f10413b;

    /* renamed from: c */
    public final Executor f10414c;

    /* renamed from: d */
    public boolean f10415d = false;

    /* renamed from: e */
    public CallbackToFutureAdapter.Completer f10416e;

    /* renamed from: f */
    public Camera2CameraControlImpl.CaptureResultListener f10417f;

    public ExposureControl(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f10412a = camera2CameraControlImpl;
        this.f10413b = new C0458GT(cameraCharacteristicsCompat, 0);
        this.f10414c = executor;
    }

    /* renamed from: a */
    public static /* synthetic */ void m63779a(ExposureControl exposureControl, CallbackToFutureAdapter.Completer completer, int i) {
        exposureControl.m63772h(completer, i);
    }

    /* renamed from: b */
    public static /* synthetic */ Object m63778b(ExposureControl exposureControl, int i, CallbackToFutureAdapter.Completer completer) {
        return exposureControl.m63771i(i, completer);
    }

    /* renamed from: e */
    public static ExposureState m63775e(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        return new C0458GT(cameraCharacteristicsCompat, 0);
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m63773g(int i, CallbackToFutureAdapter.Completer completer, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
        Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION);
        if (num != null && num2 != null) {
            int intValue = num.intValue();
            if ((intValue == 2 || intValue == 3 || intValue == 4) && num2.intValue() == i) {
                completer.set(Integer.valueOf(i));
                return true;
            }
            return false;
        } else if (num2 != null && num2.intValue() == i) {
            completer.set(Integer.valueOf(i));
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public final void m63776d() {
        CallbackToFutureAdapter.Completer completer = this.f10416e;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Cancelled by another setExposureCompensationIndex()"));
            this.f10416e = null;
        }
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = this.f10417f;
        if (captureResultListener != null) {
            this.f10412a.m63964M(captureResultListener);
            this.f10417f = null;
        }
    }

    /* renamed from: f */
    public ExposureState m63774f() {
        return this.f10413b;
    }

    /* renamed from: h */
    public final /* synthetic */ void m63772h(final CallbackToFutureAdapter.Completer completer, final int i) {
        boolean z;
        boolean z2 = false;
        if (!this.f10415d) {
            this.f10413b.m68236a(0);
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        m63776d();
        if (this.f10416e == null) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "mRunningCompleter should be null when starting set a new exposure compensation value");
        if (this.f10417f == null) {
            z2 = true;
        }
        Preconditions.checkState(z2, "mRunningCaptureResultListener should be null when starting set a new exposure compensation value");
        Camera2CameraControlImpl.CaptureResultListener captureResultListener = new Camera2CameraControlImpl.CaptureResultListener() { // from class: FT
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                boolean m63773g;
                m63773g = ExposureControl.m63773g(i, completer, totalCaptureResult);
                return m63773g;
            }
        };
        this.f10417f = captureResultListener;
        this.f10416e = completer;
        this.f10412a.m63945k(captureResultListener);
        this.f10412a.m63957T();
    }

    /* renamed from: i */
    public final /* synthetic */ Object m63771i(final int i, final CallbackToFutureAdapter.Completer completer) {
        this.f10414c.execute(new Runnable() { // from class: ET
            {
                ExposureControl.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ExposureControl.m63779a(ExposureControl.this, completer, i);
            }
        });
        return "setExposureCompensationIndex[" + i + "]";
    }

    /* renamed from: j */
    public void m63770j(boolean z) {
        if (z == this.f10415d) {
            return;
        }
        this.f10415d = z;
        if (!z) {
            this.f10413b.m68236a(0);
            m63776d();
        }
    }

    /* renamed from: k */
    public void m63769k(Camera2ImplConfig.Builder builder) {
        builder.setCaptureRequestOption(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf(this.f10413b.getExposureCompensationIndex()));
    }

    /* renamed from: l */
    public ListenableFuture m63768l(final int i) {
        if (!this.f10413b.isExposureCompensationSupported()) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("ExposureCompensation is not supported"));
        }
        Range exposureCompensationRange = this.f10413b.getExposureCompensationRange();
        if (!exposureCompensationRange.contains((Range) Integer.valueOf(i))) {
            return Futures.immediateFailedFuture(new IllegalArgumentException("Requested ExposureCompensation " + i + " is not within valid range [" + exposureCompensationRange.getUpper() + CallerDataConverter.DEFAULT_RANGE_DELIMITER + exposureCompensationRange.getLower() + "]"));
        }
        this.f10413b.m68236a(i);
        return Futures.nonCancellationPropagating(CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: DT
            {
                ExposureControl.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return ExposureControl.m63778b(ExposureControl.this, i, completer);
            }
        }));
    }
}
