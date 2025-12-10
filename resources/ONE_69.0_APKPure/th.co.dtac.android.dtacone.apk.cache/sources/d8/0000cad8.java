package io.fotoapparat.routine.orientation;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m29142d2 = {"startOrientationMonitoring", "", "Lio/fotoapparat/hardware/Device;", "orientationSensor", "Lio/fotoapparat/hardware/orientation/OrientationSensor;", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class StartOrientationRoutineKt {
    public static final void startOrientationMonitoring(@NotNull Device device2, @NotNull OrientationSensor orientationSensor) {
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(orientationSensor, "orientationSensor");
        orientationSensor.start(new StartOrientationRoutineKt$startOrientationMonitoring$1(device2));
    }
}