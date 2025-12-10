package io.fotoapparat.routine.camera;

import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.parameter.camera.CameraParameters;
import io.fotoapparat.preview.Frame;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.fotoapparat.routine.camera.UpdateConfigurationRoutineKt$updateCameraConfiguration$1", m29092f = "UpdateConfigurationRoutine.kt", m29091i = {1}, m29090l = {25, 28}, m29089m = "invokeSuspend", m29088n = {"frameProcessor"}, m29087s = {"L$0"})
/* loaded from: classes5.dex */
public final class UpdateConfigurationRoutineKt$updateCameraConfiguration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraDevice $cameraDevice;
    final /* synthetic */ Device $this_updateCameraConfiguration;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateConfigurationRoutineKt$updateCameraConfiguration$1(Device device2, CameraDevice cameraDevice, Continuation<? super UpdateConfigurationRoutineKt$updateCameraConfiguration$1> continuation) {
        super(2, continuation);
        this.$this_updateCameraConfiguration = device2;
        this.$cameraDevice = cameraDevice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpdateConfigurationRoutineKt$updateCameraConfiguration$1(this.$this_updateCameraConfiguration, this.$cameraDevice, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function1<Frame, Unit> function1;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    function1 = (Function1) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    this.$cameraDevice.updateFrameProcessor(function1);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Device device2 = this.$this_updateCameraConfiguration;
            CameraDevice cameraDevice = this.$cameraDevice;
            this.label = 1;
            obj = device2.getCameraParameters(cameraDevice, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Function1<Frame, Unit> frameProcessor = this.$this_updateCameraConfiguration.getFrameProcessor();
        CameraDevice cameraDevice2 = this.$cameraDevice;
        this.L$0 = frameProcessor;
        this.label = 2;
        if (cameraDevice2.updateParameters((CameraParameters) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        function1 = frameProcessor;
        this.$cameraDevice.updateFrameProcessor(function1);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpdateConfigurationRoutineKt$updateCameraConfiguration$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}