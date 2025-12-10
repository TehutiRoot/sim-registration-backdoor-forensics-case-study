package io.fotoapparat.routine.parameter;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.parameter.camera.CameraParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m28850d2 = {"getCurrentParameters", "Lio/fotoapparat/parameter/camera/CameraParameters;", "Lio/fotoapparat/hardware/Device;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class GetParametersRoutineKt {
    @NotNull
    public static final CameraParameters getCurrentParameters(@NotNull Device device2) {
        Object m66000b;
        Intrinsics.checkNotNullParameter(device2, "<this>");
        m66000b = AbstractC1475Uc.m66000b(null, new GetParametersRoutineKt$getCurrentParameters$1(device2, null), 1, null);
        return (CameraParameters) m66000b;
    }
}
