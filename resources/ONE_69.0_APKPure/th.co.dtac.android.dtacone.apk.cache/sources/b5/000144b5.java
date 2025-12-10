package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$7 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ boolean $isTakingPhoto;
    final /* synthetic */ Function0<Unit> $onConfirmPreview;
    final /* synthetic */ Function0<Unit> $onConfirmUsePhoto;
    final /* synthetic */ Function1<Boolean, Unit> $onNext;
    final /* synthetic */ Function0<Unit> $onRetakePhoto;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onTakePhoto;
    final /* synthetic */ TakePhotoIdCardState $takePhotoState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePhotoIdCardScreenKt$TakePhotoIdCardScreen$7(TakePhotoIdCardState takePhotoIdCardState, LifecycleCameraController lifecycleCameraController, boolean z, Function2<? super Integer, ? super Integer, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$takePhotoState = takePhotoIdCardState;
        this.$cameraController = lifecycleCameraController;
        this.$isTakingPhoto = z;
        this.$onTakePhoto = function2;
        this.$onRetakePhoto = function0;
        this.$onConfirmUsePhoto = function02;
        this.$onConfirmPreview = function03;
        this.$onNext = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoIdCardScreenKt.TakePhotoIdCardScreen(this.$takePhotoState, this.$cameraController, this.$isTakingPhoto, this.$onTakePhoto, this.$onRetakePhoto, this.$onConfirmUsePhoto, this.$onConfirmPreview, this.$onNext, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}