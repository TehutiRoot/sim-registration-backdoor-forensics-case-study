package androidx.camera.extensions.internal.compat.workaround;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.internal.compat.quirk.DeviceQuirks;
import androidx.camera.extensions.internal.compat.quirk.GetAvailableKeysNeedsOnInit;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class AvailableKeysRetriever {

    /* renamed from: a */
    public boolean f11531a;

    public AvailableKeysRetriever() {
        boolean z;
        if (DeviceQuirks.get(GetAvailableKeysNeedsOnInit.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f11531a = z;
    }

    @NonNull
    public List<CaptureRequest.Key> getAvailableCaptureRequestKeys(@NonNull ImageCaptureExtenderImpl imageCaptureExtenderImpl, @NonNull String str, @NonNull CameraCharacteristics cameraCharacteristics, @NonNull Context context) {
        if (this.f11531a) {
            imageCaptureExtenderImpl.onInit(str, cameraCharacteristics, context);
        }
        try {
            return imageCaptureExtenderImpl.getAvailableCaptureRequestKeys();
        } finally {
            if (this.f11531a) {
                imageCaptureExtenderImpl.onDeInit();
            }
        }
    }
}
