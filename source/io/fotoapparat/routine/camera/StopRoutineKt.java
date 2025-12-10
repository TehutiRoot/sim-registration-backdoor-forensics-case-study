package io.fotoapparat.routine.camera;

import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import io.fotoapparat.routine.orientation.StopOrientationRoutineKt;
import io.fotoapparat.view.FocalPointSelector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m28850d2 = {"shutDown", "", "Lio/fotoapparat/hardware/Device;", "orientationSensor", "Lio/fotoapparat/hardware/orientation/OrientationSensor;", "stop", "cameraDevice", "Lio/fotoapparat/hardware/CameraDevice;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class StopRoutineKt {
    public static final void shutDown(@NotNull Device device2, @NotNull OrientationSensor orientationSensor) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        FocalPointSelector focusPointSelector$fotoapparat_release = device2.getFocusPointSelector$fotoapparat_release();
        if (focusPointSelector$fotoapparat_release != null) {
            focusPointSelector$fotoapparat_release.setFocalPointListener(StopRoutineKt$shutDown$1.INSTANCE);
        }
        StopOrientationRoutineKt.stopMonitoring(orientationSensor);
        stop(device2, device2.getSelectedCamera());
    }

    public static final void stop(@NotNull Device device2, @NotNull CameraDevice cameraDevice) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        cameraDevice.stopPreview();
        cameraDevice.close();
        device2.clearSelectedCamera();
    }
}
