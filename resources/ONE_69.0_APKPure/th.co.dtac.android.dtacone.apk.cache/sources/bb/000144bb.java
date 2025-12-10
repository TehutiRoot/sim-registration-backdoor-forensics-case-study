package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.compose.foundation.layout.ColumnScope;
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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoOptionalScreenKt$TakePhotoButtonSection$2 */
/* loaded from: classes10.dex */
public final class TakePhotoOptionalScreenKt$TakePhotoButtonSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $isMaxTakePhoto;
    final /* synthetic */ Function0<Unit> $onConfirmPhoto;
    final /* synthetic */ Function0<Unit> $onRetakePhoto;
    final /* synthetic */ Function0<Unit> $onTakeMorePhoto;
    final /* synthetic */ Function0<Unit> $onTakePhoto;
    final /* synthetic */ TakePhotoOptionalState $takePhotoState;
    final /* synthetic */ ColumnScope $this_TakePhotoButtonSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoOptionalScreenKt$TakePhotoButtonSection$2(ColumnScope columnScope, TakePhotoOptionalState takePhotoOptionalState, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, int i) {
        super(2);
        this.$this_TakePhotoButtonSection = columnScope;
        this.$takePhotoState = takePhotoOptionalState;
        this.$isMaxTakePhoto = z;
        this.$onTakePhoto = function0;
        this.$onRetakePhoto = function02;
        this.$onConfirmPhoto = function03;
        this.$onTakeMorePhoto = function04;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoOptionalScreenKt.TakePhotoButtonSection(this.$this_TakePhotoButtonSection, this.$takePhotoState, this.$isMaxTakePhoto, this.$onTakePhoto, this.$onRetakePhoto, this.$onConfirmPhoto, this.$onTakeMorePhoto, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}