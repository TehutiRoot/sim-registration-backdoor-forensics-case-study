package io.fotoapparat;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.routine.parameter.GetParametersRoutineKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class Fotoapparat$getCurrentParameters$future$1 extends FunctionReferenceImpl implements Function0<CameraParameters> {
    public Fotoapparat$getCurrentParameters$future$1(Object obj) {
        super(0, obj, GetParametersRoutineKt.class, "getCurrentParameters", "getCurrentParameters(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/parameter/camera/CameraParameters;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CameraParameters invoke() {
        return GetParametersRoutineKt.getCurrentParameters((Device) this.receiver);
    }
}
