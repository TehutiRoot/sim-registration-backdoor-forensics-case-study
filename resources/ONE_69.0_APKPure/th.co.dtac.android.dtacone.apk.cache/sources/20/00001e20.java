package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import androidx.camera.camera2.interop.ExperimentalCamera2Interop;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class TorchStateReset {

    /* renamed from: a */
    public final boolean f10653a;

    public TorchStateReset() {
        boolean z;
        if (DeviceQuirks.get(TorchIsClosedAfterImageCapturingQuirk.class) != null) {
            z = true;
        } else {
            z = false;
        }
        this.f10653a = z;
    }

    @NonNull
    @OptIn(markerClass = {ExperimentalCamera2Interop.class})
    public CaptureConfig createTorchResetRequest(@NonNull CaptureConfig captureConfig) {
        CaptureConfig.Builder builder = new CaptureConfig.Builder();
        builder.setTemplateType(captureConfig.getTemplateType());
        for (DeferrableSurface deferrableSurface : captureConfig.getSurfaces()) {
            builder.addSurface(deferrableSurface);
        }
        builder.addImplementationOptions(captureConfig.getImplementationOptions());
        Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
        builder2.setCaptureRequestOption(CaptureRequest.FLASH_MODE, 0);
        builder.addImplementationOptions(builder2.build());
        return builder.build();
    }

    public boolean isTorchResetRequired(@NonNull List<CaptureRequest> list, boolean z) {
        if (this.f10653a && z) {
            for (CaptureRequest captureRequest : list) {
                Integer num = (Integer) captureRequest.get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}