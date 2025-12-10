package io.fotoapparat.routine.capability;

import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.hardware.Device;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m29142d2 = {"getCapabilities", "Lio/fotoapparat/capability/Capabilities;", "Lio/fotoapparat/hardware/Device;", "fotoapparat_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class GetCapabilitiesRoutineKt {
    @NotNull
    public static final Capabilities getCapabilities(@NotNull Device device2) {
        Object m66133b;
        Intrinsics.checkNotNullParameter(device2, "<this>");
        m66133b = AbstractC1455Uc.m66133b(null, new GetCapabilitiesRoutineKt$getCapabilities$1(device2, null), 1, null);
        return (Capabilities) m66133b;
    }
}