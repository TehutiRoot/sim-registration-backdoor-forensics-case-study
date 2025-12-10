package io.fotoapparat;

import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import io.fotoapparat.routine.camera.StopRoutineKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class Fotoapparat$stop$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Fotoapparat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fotoapparat$stop$1(Fotoapparat fotoapparat) {
        super(0);
        this.this$0 = fotoapparat;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Device device2;
        OrientationSensor m30566a;
        device2 = this.this$0.f62902e;
        m30566a = this.this$0.m30566a();
        StopRoutineKt.shutDown(device2, m30566a);
    }
}
