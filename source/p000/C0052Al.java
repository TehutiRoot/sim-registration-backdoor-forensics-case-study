package p000;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;

/* renamed from: Al */
/* loaded from: classes.dex */
public final class C0052Al extends CameraCaptureCallback {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f191a;

    public C0052Al(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f191a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    /* renamed from: a */
    public static C0052Al m69052a(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C0052Al(captureCallback);
    }

    /* renamed from: b */
    public CameraCaptureSession.CaptureCallback m69051b() {
        return this.f191a;
    }
}
