package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C2441n;
import androidx.camera.camera2.internal.Camera2CameraControlImpl;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.FlashAvailabilityChecker;
import androidx.camera.core.CameraControl;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.n */
/* loaded from: classes.dex */
public final class C2441n {

    /* renamed from: a */
    public final Camera2CameraControlImpl f10717a;

    /* renamed from: b */
    public final MutableLiveData f10718b;

    /* renamed from: c */
    public final boolean f10719c;

    /* renamed from: d */
    public final Executor f10720d;

    /* renamed from: e */
    public boolean f10721e;

    /* renamed from: f */
    public CallbackToFutureAdapter.Completer f10722f;

    /* renamed from: g */
    public boolean f10723g;

    public C2441n(Camera2CameraControlImpl camera2CameraControlImpl, CameraCharacteristicsCompat cameraCharacteristicsCompat, Executor executor) {
        this.f10717a = camera2CameraControlImpl;
        this.f10720d = executor;
        Objects.requireNonNull(cameraCharacteristicsCompat);
        this.f10719c = FlashAvailabilityChecker.isFlashAvailable(new C13107pi(cameraCharacteristicsCompat));
        this.f10718b = new MutableLiveData(0);
        camera2CameraControlImpl.m63945k(new Camera2CameraControlImpl.CaptureResultListener() { // from class: DU1
            @Override // androidx.camera.camera2.internal.Camera2CameraControlImpl.CaptureResultListener
            public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
                boolean m63354i;
                m63354i = C2441n.this.m63354i(totalCaptureResult);
                return m63354i;
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ Object m63362a(C2441n c2441n, boolean z, CallbackToFutureAdapter.Completer completer) {
        return c2441n.m63355h(z, completer);
    }

    /* renamed from: c */
    public static /* synthetic */ void m63360c(C2441n c2441n, CallbackToFutureAdapter.Completer completer, boolean z) {
        c2441n.m63356g(completer, z);
    }

    /* renamed from: d */
    public ListenableFuture m63359d(final boolean z) {
        if (!this.f10719c) {
            Logger.m63230d("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return Futures.immediateFailedFuture(new IllegalStateException("No flash unit"));
        }
        m63352k(this.f10718b, Integer.valueOf(z ? 1 : 0));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: CU1
            {
                C2441n.this = this;
            }

            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return C2441n.m63362a(C2441n.this, z, completer);
            }
        });
    }

    /* renamed from: e */
    public void m63356g(CallbackToFutureAdapter.Completer completer, boolean z) {
        if (!this.f10719c) {
            if (completer != null) {
                completer.setException(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f10721e) {
            m63352k(this.f10718b, 0);
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.f10723g = z;
            this.f10717a.m63942n(z);
            m63352k(this.f10718b, Integer.valueOf(z ? 1 : 0));
            CallbackToFutureAdapter.Completer completer2 = this.f10722f;
            if (completer2 != null) {
                completer2.setException(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f10722f = completer;
        }
    }

    /* renamed from: f */
    public LiveData m63357f() {
        return this.f10718b;
    }

    /* renamed from: h */
    public final /* synthetic */ Object m63355h(final boolean z, final CallbackToFutureAdapter.Completer completer) {
        this.f10720d.execute(new Runnable() { // from class: EU1
            {
                C2441n.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2441n.m63360c(C2441n.this, completer, z);
            }
        });
        return "enableTorch: " + z;
    }

    /* renamed from: i */
    public final /* synthetic */ boolean m63354i(TotalCaptureResult totalCaptureResult) {
        boolean z;
        if (this.f10722f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z == this.f10723g) {
                this.f10722f.set(null);
                this.f10722f = null;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void m63353j(boolean z) {
        if (this.f10721e == z) {
            return;
        }
        this.f10721e = z;
        if (!z) {
            if (this.f10723g) {
                this.f10723g = false;
                this.f10717a.m63942n(false);
                m63352k(this.f10718b, 0);
            }
            CallbackToFutureAdapter.Completer completer = this.f10722f;
            if (completer != null) {
                completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
                this.f10722f = null;
            }
        }
    }

    /* renamed from: k */
    public final void m63352k(MutableLiveData mutableLiveData, Object obj) {
        if (Threads.isMainThread()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }
}
