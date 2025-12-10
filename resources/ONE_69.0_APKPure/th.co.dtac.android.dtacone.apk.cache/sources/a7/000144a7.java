package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.TakePhotoIdCardState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.takePhoto.TakePhotoIdCardScreenKt$PreviewPhotoSection$2 */
/* loaded from: classes10.dex */
public final class TakePhotoIdCardScreenKt$PreviewPhotoSection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function1<IntSize, Unit> $onSizeChanged;
    final /* synthetic */ TakePhotoIdCardState $takePhotoState;
    final /* synthetic */ ColumnScope $this_PreviewPhotoSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TakePhotoIdCardScreenKt$PreviewPhotoSection$2(ColumnScope columnScope, TakePhotoIdCardState takePhotoIdCardState, Function1<? super IntSize, Unit> function1, int i) {
        super(2);
        this.$this_PreviewPhotoSection = columnScope;
        this.$takePhotoState = takePhotoIdCardState;
        this.$onSizeChanged = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        TakePhotoIdCardScreenKt.m9405j(this.$this_PreviewPhotoSection, this.$takePhotoState, this.$onSizeChanged, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}