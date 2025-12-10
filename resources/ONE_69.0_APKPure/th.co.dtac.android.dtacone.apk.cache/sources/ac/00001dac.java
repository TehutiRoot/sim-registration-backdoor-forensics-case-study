package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2424o;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* renamed from: androidx.camera.camera2.internal.a */
/* loaded from: classes.dex */
public final class C2353a implements C2424o.InterfaceC2426b {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f10533a;

    /* renamed from: b */
    public final Range f10534b;

    /* renamed from: d */
    public CallbackToFutureAdapter.Completer f10536d;

    /* renamed from: c */
    public float f10535c = 1.0f;

    /* renamed from: e */
    public float f10537e = 1.0f;

    public C2353a(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        CameraCharacteristics.Key key;
        this.f10533a = cameraCharacteristicsCompat;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f10534b = (Range) cameraCharacteristicsCompat.get(key);
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: a */
    public void mo63279a(Camera2ImplConfig.Builder builder) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        builder.setCaptureRequestOption(key, Float.valueOf(this.f10535c));
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: b */
    public float mo63278b() {
        return ((Float) this.f10534b.getLower()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: c */
    public float mo63277c() {
        return ((Float) this.f10534b.getUpper()).floatValue();
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: d */
    public void mo63276d(float f, CallbackToFutureAdapter.Completer completer) {
        this.f10535c = f;
        CallbackToFutureAdapter.Completer completer2 = this.f10536d;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f10537e = this.f10535c;
        this.f10536d = completer;
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: e */
    public void mo63275e() {
        this.f10535c = 1.0f;
        CallbackToFutureAdapter.Completer completer = this.f10536d;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f10536d = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    /* renamed from: f */
    public Rect mo63274f() {
        return (Rect) Preconditions.checkNotNull((Rect) this.f10533a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.C2424o.InterfaceC2426b
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f;
        if (this.f10536d != null) {
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
            if (this.f10537e == f.floatValue()) {
                this.f10536d.set(null);
                this.f10536d = null;
            }
        }
    }
}