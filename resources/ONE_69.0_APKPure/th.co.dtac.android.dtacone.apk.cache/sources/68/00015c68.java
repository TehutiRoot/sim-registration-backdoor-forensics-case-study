package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneOrderInfoModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$OrderInfoLayout$2 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$OrderInfoLayout$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CompanyThemes $isTrueThemes;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ OneOrderInfoModel $orderInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignaturePageScreenKt$OrderInfoLayout$2(Modifier modifier, OneOrderInfoModel oneOrderInfoModel, CompanyThemes companyThemes, int i, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$orderInfo = oneOrderInfoModel;
        this.$isTrueThemes = companyThemes;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        SignaturePageScreenKt.OrderInfoLayout(this.$modifier, this.$orderInfo, this.$isTrueThemes, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}