package io.fotoapparat.routine.camera;

import io.fotoapparat.configuration.Configuration;
import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\b"}, m28850d2 = {"updateCameraConfiguration", "", "Lio/fotoapparat/hardware/Device;", "cameraDevice", "Lio/fotoapparat/hardware/CameraDevice;", "updateDeviceConfiguration", "newConfiguration", "Lio/fotoapparat/configuration/Configuration;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class UpdateConfigurationRoutineKt {
    public static final void updateCameraConfiguration(@NotNull Device device2, @NotNull CameraDevice cameraDevice) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(cameraDevice, "cameraDevice");
        AbstractC1475Uc.m66000b(null, new UpdateConfigurationRoutineKt$updateCameraConfiguration$1(device2, cameraDevice, null), 1, null);
    }

    public static final void updateDeviceConfiguration(@NotNull Device device2, @NotNull Configuration newConfiguration) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        CameraDevice selectedCamera = device2.getSelectedCamera();
        device2.updateConfiguration(newConfiguration);
        updateCameraConfiguration(device2, selectedCamera);
    }
}
