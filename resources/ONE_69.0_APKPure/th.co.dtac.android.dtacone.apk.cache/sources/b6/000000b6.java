package p000;

import android.hardware.camera2.CameraCaptureSession;
import androidx.camera.core.impl.CameraCaptureCallback;

/* renamed from: Al */
/* loaded from: classes.dex */
public final class C0054Al extends CameraCaptureCallback {

    /* renamed from: a */
    public final CameraCaptureSession.CaptureCallback f206a;

    public C0054Al(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f206a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }

    /* renamed from: a */
    public static C0054Al m69195a(CameraCaptureSession.CaptureCallback captureCallback) {
        return new C0054Al(captureCallback);
    }

    /* renamed from: b */
    public CameraCaptureSession.CaptureCallback m69194b() {
        return this.f206a;
    }
}