package io.fotoapparat.routine.parameter;

import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.parameter.camera.CameraParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/camera/CameraParameters;", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.fotoapparat.routine.parameter.GetParametersRoutineKt$getCurrentParameters$1", m28800f = "GetParametersRoutine.kt", m28799i = {}, m28798l = {11, 13}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class GetParametersRoutineKt$getCurrentParameters$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CameraParameters>, Object> {
    final /* synthetic */ Device $this_getCurrentParameters;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetParametersRoutineKt$getCurrentParameters$1(Device device2, Continuation<? super GetParametersRoutineKt$getCurrentParameters$1> continuation) {
        super(2, continuation);
        this.$this_getCurrentParameters = device2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new GetParametersRoutineKt$getCurrentParameters$1(this.$this_getCurrentParameters, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Device device2 = this.$this_getCurrentParameters;
            this.label = 1;
            obj = device2.awaitSelectedCamera(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.label = 2;
        obj = ((CameraDevice) obj).getParameters(this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super CameraParameters> continuation) {
        return ((GetParametersRoutineKt$getCurrentParameters$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
