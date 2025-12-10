package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.camera.view.LifecycleCameraController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1", m29092f = "TakePhotoOptionalScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nTakePhotoOptionalScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TakePhotoOptionalScreen.kt\nth/co/dtac/android/dtacone/view/appOne/tol/screen/takePhoto/TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,263:1\n1#2:264\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1 */
/* loaded from: classes10.dex */
public final class TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ TakePhotoOptionalState $takePhotoState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1(TakePhotoOptionalState takePhotoOptionalState, LifecycleCameraController lifecycleCameraController, Continuation<? super TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1> continuation) {
        super(2, continuation);
        this.$takePhotoState = takePhotoOptionalState;
        this.$cameraController = lifecycleCameraController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1(this.$takePhotoState, this.$cameraController, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LifecycleCameraController lifecycleCameraController;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if ((this.$takePhotoState instanceof TakePhotoOptionalState.PreviewPhoto) && (lifecycleCameraController = this.$cameraController) != null) {
                lifecycleCameraController.unbind();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}