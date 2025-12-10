package io.fotoapparat.routine.photo;

import io.fotoapparat.hardware.CameraDevice;
import io.fotoapparat.hardware.Device;
import io.fotoapparat.result.Photo;
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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/result/Photo;", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "io.fotoapparat.routine.photo.TakePhotoRoutineKt$takePhoto$1", m28800f = "TakePhotoRoutine.kt", m28799i = {}, m28798l = {13}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* loaded from: classes5.dex */
public final class TakePhotoRoutineKt$takePhoto$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Photo>, Object> {
    final /* synthetic */ Device $this_takePhoto;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoRoutineKt$takePhoto$1(Device device2, Continuation<? super TakePhotoRoutineKt$takePhoto$1> continuation) {
        super(2, continuation);
        this.$this_takePhoto = device2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TakePhotoRoutineKt$takePhoto$1(this.$this_takePhoto, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            Device device2 = this.$this_takePhoto;
            this.label = 1;
            obj = device2.awaitSelectedCamera(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        CameraDevice cameraDevice = (CameraDevice) obj;
        Photo takePhoto = cameraDevice.takePhoto();
        TakePhotoRoutineKt.m30480a(cameraDevice);
        return takePhoto;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Photo> continuation) {
        return ((TakePhotoRoutineKt$takePhoto$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
