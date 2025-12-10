package th.p047co.dtac.android.dtacone.widget.compose.signature;

import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.OneOrderInfoModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.compose.signature.SignaturePageScreenKt$SignaturePageScreen$14 */
/* loaded from: classes9.dex */
public final class SignaturePageScreenKt$SignaturePageScreen$14 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CompanyThemes $isTrueThemes;
    final /* synthetic */ Function0<Unit> $onBack;
    final /* synthetic */ Function1<ImageBitmap, Unit> $onNext;
    final /* synthetic */ OneOrderInfoModel $orderInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignaturePageScreenKt$SignaturePageScreen$14(OneOrderInfoModel oneOrderInfoModel, Function1<? super ImageBitmap, Unit> function1, Function0<Unit> function0, CompanyThemes companyThemes, int i, int i2) {
        super(2);
        this.$orderInfo = oneOrderInfoModel;
        this.$onNext = function1;
        this.$onBack = function0;
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
        SignaturePageScreenKt.SignaturePageScreen(this.$orderInfo, this.$onNext, this.$onBack, this.$isTrueThemes, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}