package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.C2442o;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.core.CameraControl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;

/* renamed from: androidx.camera.camera2.internal.g */
/* loaded from: classes.dex */
public final class C2421g implements C2442o.InterfaceC2444b {

    /* renamed from: a */
    public final CameraCharacteristicsCompat f10629a;

    /* renamed from: c */
    public CallbackToFutureAdapter.Completer f10631c;

    /* renamed from: b */
    public Rect f10630b = null;

    /* renamed from: d */
    public Rect f10632d = null;

    public C2421g(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.f10629a = cameraCharacteristicsCompat;
    }

    /* renamed from: g */
    public static Rect m63497g(Rect rect, float f) {
        float width = rect.width() / f;
        float height = rect.height() / f;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: a */
    public void mo63331a(Camera2ImplConfig.Builder builder) {
        Rect rect = this.f10630b;
        if (rect != null) {
            builder.setCaptureRequestOption(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: b */
    public float mo63330b() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: c */
    public float mo63329c() {
        Float f = (Float) this.f10629a.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f == null) {
            return 1.0f;
        }
        if (f.floatValue() < mo63330b()) {
            return mo63330b();
        }
        return f.floatValue();
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: d */
    public void mo63328d(float f, CallbackToFutureAdapter.Completer completer) {
        this.f10630b = m63497g(m63496h(), f);
        CallbackToFutureAdapter.Completer completer2 = this.f10631c;
        if (completer2 != null) {
            completer2.setException(new CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f10632d = this.f10630b;
        this.f10631c = completer;
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: e */
    public void mo63327e() {
        this.f10632d = null;
        this.f10630b = null;
        CallbackToFutureAdapter.Completer completer = this.f10631c;
        if (completer != null) {
            completer.setException(new CameraControl.OperationCanceledException("Camera is not active."));
            this.f10631c = null;
        }
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    /* renamed from: f */
    public Rect mo63326f() {
        Rect rect = this.f10630b;
        if (rect == null) {
            return m63496h();
        }
        return rect;
    }

    /* renamed from: h */
    public final Rect m63496h() {
        return (Rect) Preconditions.checkNotNull((Rect) this.f10629a.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    @Override // androidx.camera.camera2.internal.C2442o.InterfaceC2444b
    public void onCaptureResult(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (this.f10631c != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = this.f10632d;
            if (rect2 != null && rect2.equals(rect)) {
                this.f10631c.set(null);
                this.f10631c = null;
                this.f10632d = null;
            }
        }
    }
}
