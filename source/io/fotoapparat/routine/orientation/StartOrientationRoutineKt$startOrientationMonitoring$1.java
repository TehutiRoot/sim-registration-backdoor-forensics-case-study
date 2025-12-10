package io.fotoapparat.routine.orientation;

import io.fotoapparat.concurrent.CameraExecutor;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.orientation.OrientationState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "", "orientationState", "Lio/fotoapparat/hardware/orientation/OrientationState;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class StartOrientationRoutineKt$startOrientationMonitoring$1 extends Lambda implements Function1<OrientationState, Unit> {
    final /* synthetic */ Device $this_startOrientationMonitoring;

    @Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: io.fotoapparat.routine.orientation.StartOrientationRoutineKt$startOrientationMonitoring$1$1 */
    /* loaded from: classes5.dex */
    public static final class C104981 extends Lambda implements Function0<Unit> {
        final /* synthetic */ OrientationState $orientationState;
        final /* synthetic */ Device $this_startOrientationMonitoring;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C104981(Device device2, OrientationState orientationState) {
            super(0);
            this.$this_startOrientationMonitoring = device2;
            this.$orientationState = orientationState;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$this_startOrientationMonitoring.getSelectedCamera().setDisplayOrientation(this.$orientationState);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartOrientationRoutineKt$startOrientationMonitoring$1(Device device2) {
        super(1);
        this.$this_startOrientationMonitoring = device2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrientationState orientationState) {
        invoke2(orientationState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull OrientationState orientationState) {
        Intrinsics.checkNotNullParameter(orientationState, "orientationState");
        this.$this_startOrientationMonitoring.getExecutor$fotoapparat_release().execute(new CameraExecutor.Operation(true, new C104981(this.$this_startOrientationMonitoring, orientationState)));
    }
}
