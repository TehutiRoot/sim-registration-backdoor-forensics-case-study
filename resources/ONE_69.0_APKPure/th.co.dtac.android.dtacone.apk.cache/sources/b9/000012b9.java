package p000;

import android.hardware.camera2.CaptureResult;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.utils.ExifData;

/* renamed from: Ti */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1386Ti {
    /* renamed from: a */
    public static CaptureResult m66322a(CameraCaptureResult cameraCaptureResult) {
        return CameraCaptureResult.EmptyCameraCaptureResult.create().getCaptureResult();
    }

    /* renamed from: b */
    public static void m66321b(CameraCaptureResult cameraCaptureResult, ExifData.Builder builder) {
        builder.setFlashState(cameraCaptureResult.getFlashState());
    }
}