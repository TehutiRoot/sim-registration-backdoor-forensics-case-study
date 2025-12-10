package io.fotoapparat.routine.focus;

import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.hardware.metering.FocalRequest;
import io.fotoapparat.result.FocusResult;
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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "Lio/fotoapparat/result/FocusResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "io.fotoapparat.routine.focus.FocusOnPointRoutineKt$focusOnPoint$1", m29092f = "FocusOnPointRoutine.kt", m29091i = {1}, m29090l = {12, 14}, m29089m = "invokeSuspend", m29088n = {"$this$invokeSuspend_u24lambda_u240"}, m29087s = {"L$0"})
/* loaded from: classes5.dex */
public final class FocusOnPointRoutineKt$focusOnPoint$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FocusResult>, Object> {
    final /* synthetic */ FocalRequest $focalRequest;
    final /* synthetic */ Device $this_focusOnPoint;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusOnPointRoutineKt$focusOnPoint$1(Device device2, FocalRequest focalRequest, Continuation<? super FocusOnPointRoutineKt$focusOnPoint$1> continuation) {
        super(2, continuation);
        this.$this_focusOnPoint = device2;
        this.$focalRequest = focalRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FocusOnPointRoutineKt$focusOnPoint$1(this.$this_focusOnPoint, this.$focalRequest, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CameraDevice cameraDevice;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    cameraDevice = (CameraDevice) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    return cameraDevice.autoFocus();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Device device2 = this.$this_focusOnPoint;
            this.label = 1;
            obj = device2.awaitSelectedCamera(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        FocalRequest focalRequest = this.$focalRequest;
        CameraDevice cameraDevice2 = (CameraDevice) obj;
        this.L$0 = cameraDevice2;
        this.label = 2;
        if (cameraDevice2.setFocalPoint(focalRequest, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        cameraDevice = cameraDevice2;
        return cameraDevice.autoFocus();
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super FocusResult> continuation) {
        return ((FocusOnPointRoutineKt$focusOnPoint$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}