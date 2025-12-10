package io.fotoapparat;

import io.fotoapparat.capability.Capabilities;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.routine.capability.GetCapabilitiesRoutineKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class Fotoapparat$getCapabilities$future$1 extends FunctionReferenceImpl implements Function0<Capabilities> {
    public Fotoapparat$getCapabilities$future$1(Object obj) {
        super(0, obj, GetCapabilitiesRoutineKt.class, "getCapabilities", "getCapabilities(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/capability/Capabilities;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Capabilities invoke() {
        return GetCapabilitiesRoutineKt.getCapabilities((Device) this.receiver);
    }
}
