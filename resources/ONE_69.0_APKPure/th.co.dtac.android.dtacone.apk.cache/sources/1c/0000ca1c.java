package io.fotoapparat;

import io.fotoapparat.characteristic.LensPosition;
import io.fotoapparat.configuration.CameraConfiguration;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationSensor;
import io.fotoapparat.routine.camera.SwitchCameraRoutineKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes5.dex */
public final class Fotoapparat$switchTo$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CameraConfiguration $cameraConfiguration;
    final /* synthetic */ Function1<Iterable<? extends LensPosition>, LensPosition> $lensPosition;
    final /* synthetic */ Fotoapparat this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Fotoapparat$switchTo$1(Fotoapparat fotoapparat, Function1<? super Iterable<? extends LensPosition>, ? extends LensPosition> function1, CameraConfiguration cameraConfiguration) {
        super(0);
        this.this$0 = fotoapparat;
        this.$lensPosition = function1;
        this.$cameraConfiguration = cameraConfiguration;
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
        OrientationSensor m30906a;
        Function1 function1;
        device2 = this.this$0.f62965e;
        m30906a = this.this$0.m30906a();
        function1 = this.this$0.f62963c;
        SwitchCameraRoutineKt.switchCamera(device2, this.$lensPosition, this.$cameraConfiguration, function1, m30906a);
    }
}