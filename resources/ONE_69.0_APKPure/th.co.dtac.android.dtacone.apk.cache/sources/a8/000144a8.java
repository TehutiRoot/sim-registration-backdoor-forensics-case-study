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
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$TakePhotoButtonSection$2 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$TakePhotoButtonSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onConfirmPreview;
    final /* synthetic */ Function0<Unit> $onRetakePhoto;
    final /* synthetic */ Function0<Unit> $onTakePhoto;
    final /* synthetic */ TakePhotoIdCardState $takePhotoState;
    final /* synthetic */ ColumnScope $this_TakePhotoButtonSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TakePhotoIdCardScreenKt$TakePhotoButtonSection$2(ColumnScope columnScope, TakePhotoIdCardState takePhotoIdCardState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i) {
        super(2);
        this.$this_TakePhotoButtonSection = columnScope;
        this.$takePhotoState = takePhotoIdCardState;
        this.$onTakePhoto = function0;
        this.$onRetakePhoto = function02;
        this.$onConfirmPreview = function03;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoIdCardScreenKt.m9404k(this.$this_TakePhotoButtonSection, this.$takePhotoState, this.$onTakePhoto, this.$onRetakePhoto, this.$onConfirmPreview, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}