package io.fotoapparat.routine.camera;

import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.exception.camera.CameraException;
import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bj\u0002`\nH\u0000\u001aY\u0010\u000b\u001a\u00020\u0001*\u00020\u00022#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\bj\u0002`\u000f¢\u0006\u0002\b\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bj\u0002`\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0013"}, m28850d2 = {"restartPreview", "", "Lio/fotoapparat/hardware/Device;", "oldCameraDevice", "Lio/fotoapparat/hardware/CameraDevice;", "orientationSensor", "Lio/fotoapparat/hardware/orientation/OrientationSensor;", "mainThreadErrorCallback", "Lkotlin/Function1;", "Lio/fotoapparat/exception/camera/CameraException;", "Lio/fotoapparat/error/CameraErrorCallback;", "switchCamera", "newLensPositionSelector", "", "Lio/fotoapparat/characteristic/LensPosition;", "Lio/fotoapparat/selector/LensPositionSelector;", "Lkotlin/ExtensionFunctionType;", "newConfiguration", "Lio/fotoapparat/configuration/CameraConfiguration;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class SwitchCameraRoutineKt {
    public static final void restartPreview(@NotNull Device device2, @NotNull CameraDevice oldCameraDevice, @NotNull OrientationSensor orientationSensor, @NotNull Function1<? super CameraException, Unit> mainThreadErrorCallback) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(oldCameraDevice, "oldCameraDevice");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        Intrinsics.checkNotNullParameter(mainThreadErrorCallback, "mainThreadErrorCallback");
        StopRoutineKt.stop(device2, oldCameraDevice);
        try {
            StartRoutineKt.start(device2, orientationSensor);
        } catch (CameraException e) {
            mainThreadErrorCallback.invoke(e);
        }
    }

    public static final void switchCamera(@NotNull Device device2, @NotNull Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> newLensPositionSelector, @NotNull CameraConfiguration newConfiguration, @NotNull Function1<? super CameraException, Unit> mainThreadErrorCallback, @NotNull OrientationSensor orientationSensor) {
        CameraDevice cameraDevice;
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(newLensPositionSelector, "newLensPositionSelector");
        Intrinsics.checkNotNullParameter(newConfiguration, "newConfiguration");
        Intrinsics.checkNotNullParameter(mainThreadErrorCallback, "mainThreadErrorCallback");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        try {
            cameraDevice = device2.getSelectedCamera();
        } catch (IllegalStateException unused) {
            cameraDevice = null;
        }
        if (cameraDevice == null) {
            device2.updateLensPositionSelector(newLensPositionSelector);
            device2.updateConfiguration(newConfiguration);
        } else if (!Intrinsics.areEqual(device2.getLensPositionSelector(), newLensPositionSelector)) {
            device2.updateLensPositionSelector(newLensPositionSelector);
            device2.updateConfiguration(newConfiguration);
            restartPreview(device2, cameraDevice, orientationSensor, mainThreadErrorCallback);
        }
    }
}
