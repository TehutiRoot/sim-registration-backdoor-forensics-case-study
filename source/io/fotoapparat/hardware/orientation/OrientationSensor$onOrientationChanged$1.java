package io.fotoapparat.hardware.orientation;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.fotoapparat.hardware.Device;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "deviceRotation", "", "Lio/fotoapparat/hardware/orientation/DeviceRotationDegrees;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class OrientationSensor$onOrientationChanged$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ OrientationSensor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationSensor$onOrientationChanged$1(OrientationSensor orientationSensor) {
        super(1);
        this.this$0 = orientationSensor;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        Device device2;
        Function1 function1;
        Orientation orientation = OrientationKt.toOrientation(RotationKt.toClosestRightAngle(i));
        OrientationSensor orientationSensor = this.this$0;
        device2 = orientationSensor.f62989b;
        OrientationState orientationState = new OrientationState(orientation, device2.getScreenOrientation());
        if (Intrinsics.areEqual(orientationState, orientationSensor.getLastKnownOrientationState())) {
            return;
        }
        orientationSensor.setLastKnownOrientationState(orientationState);
        function1 = orientationSensor.f62990c;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            function1 = null;
        }
        function1.invoke(orientationState);
    }
}
