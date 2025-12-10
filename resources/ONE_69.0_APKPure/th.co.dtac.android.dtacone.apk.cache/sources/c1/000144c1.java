package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.camera.view.LifecycleCameraController;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoOptionalState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$3 */
/* loaded from: classes10.dex */
public final class TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ LifecycleCameraController $cameraController;
    final /* synthetic */ boolean $isMaxTakePhoto;
    final /* synthetic */ boolean $isShowInformation;
    final /* synthetic */ Function0<Unit> $onNext;
    final /* synthetic */ Function0<Unit> $onRetakePhoto;
    final /* synthetic */ Function0<Unit> $onTakeMorePhoto;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onTakePhoto;
    final /* synthetic */ TakePhotoOptionalState $takePhotoState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePhotoOptionalScreenKt$TakePhotoOptionalScreen$3(TakePhotoOptionalState takePhotoOptionalState, boolean z, LifecycleCameraController lifecycleCameraController, Function2<? super Integer, ? super Integer, Unit> function2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z2, int i, int i2) {
        super(2);
        this.$takePhotoState = takePhotoOptionalState;
        this.$isMaxTakePhoto = z;
        this.$cameraController = lifecycleCameraController;
        this.$onTakePhoto = function2;
        this.$onRetakePhoto = function0;
        this.$onTakeMorePhoto = function02;
        this.$onNext = function03;
        this.$isShowInformation = z2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoOptionalScreenKt.TakePhotoOptionalScreen(this.$takePhotoState, this.$isMaxTakePhoto, this.$cameraController, this.$onTakePhoto, this.$onRetakePhoto, this.$onTakeMorePhoto, this.$onNext, this.$isShowInformation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}