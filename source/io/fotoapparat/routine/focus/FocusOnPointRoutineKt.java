package io.fotoapparat.routine.focus;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.result.FocusResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m28850d2 = {"focusOnPoint", "Lio/fotoapparat/result/FocusResult;", "Lio/fotoapparat/hardware/Device;", "focalRequest", "Lio/fotoapparat/hardware/metering/FocalRequest;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class FocusOnPointRoutineKt {
    @NotNull
    public static final FocusResult focusOnPoint(@NotNull Device device2, @NotNull FocalRequest focalRequest) {
        Object m66000b;
        Intrinsics.checkNotNullParameter(device2, "<this>");
        Intrinsics.checkNotNullParameter(focalRequest, "focalRequest");
        m66000b = AbstractC1475Uc.m66000b(null, new FocusOnPointRoutineKt$focusOnPoint$1(device2, focalRequest, null), 1, null);
        return (FocusResult) m66000b;
    }
}
