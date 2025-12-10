package io.fotoapparat;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.result.FocusResult;
import io.fotoapparat.routine.focus.FocusRoutineKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class Fotoapparat$focus$future$1 extends FunctionReferenceImpl implements Function0<FocusResult> {
    public Fotoapparat$focus$future$1(Object obj) {
        super(0, obj, FocusRoutineKt.class, "focus", "focus(Lio/fotoapparat/hardware/Device;)Lio/fotoapparat/result/FocusResult;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FocusResult invoke() {
        return FocusRoutineKt.focus((Device) this.receiver);
    }
}
