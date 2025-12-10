package th.p047co.dtac.android.dtacone.widget.compose.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.common.OneDialogKt$OneDialogError$1 */
/* loaded from: classes9.dex */
public final class OneDialogKt$OneDialogError$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $descriptionMaxLines;
    final /* synthetic */ CommonErrorResponse $error;
    final /* synthetic */ Function0<Unit> $onDismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogKt$OneDialogError$1(CommonErrorResponse commonErrorResponse, Function0<Unit> function0, int i, int i2, int i3) {
        super(2);
        this.$error = commonErrorResponse;
        this.$onDismiss = function0;
        this.$descriptionMaxLines = i;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneDialogKt.OneDialogError(this.$error, this.$onDismiss, this.$descriptionMaxLines, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}