package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2442o;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* renamed from: androidx.camera.camera2.internal.a */
/* loaded from: classes.dex */
public final class C2371a implements C2442o.InterfaceC2444b {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f10445a;

    /* renamed from: b */
    public final Range f10446b;

    /* renamed from: d */
    public CallbackToFutureAdapter.Completer f10448d;

    /* renamed from: c */
    public float f10447c = 1.0f;

    /* renamed from: e */
    public float f10449e = 1.0f;

    public C2371a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        this.f10445a = cameraCharacteristicsCompat;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f10446b = (Range) cameraCharacteristicsCompat.get(key);
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: a */
    public void mo63331a(Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        builder.setCaptureRequestOption(key, Float.valueOf(this.f10447c));
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: b */
    public float mo63330b() {
        return ((Float) this.f10446b.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: c */
    public float mo63329c() {
        return ((Float) this.f10446b.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: d */
    public void mo63328d(float f, CallbackToFutureAdapter.Completer completer) {
        this.f10447c = f;
        CallbackToFutureAdapter.Completer completer2 = this.f10448d;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f10449e = this.f10447c;
        this.f10448d = completer;
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: e */
    public void mo63327e() {
        this.f10447c = 1.0f;
        CallbackToFutureAdapter.Completer completer = this.f10448d;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f10448d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: f */
    public Rect mo63326f() {
        return (Rect) Preconditions.checkNotNull((Rect) this.f10445a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.f10448d != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request != null) {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f = (Float) request.get(key);
            } else {
                f = null;
            }
            if (f == null) {
                return;
            }
            if (this.f10449e == f.floatValue()) {
                this.f10448d.set(null);
                this.f10448d = null;
            }
        }
    }
}
