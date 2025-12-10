package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpOffer;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.fixedLinePlus.OneRegisterTrueOnlineFlpPackageScreenKt$CampaignCard$2 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineFlpPackageScreenKt$CampaignCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ FlpOffer $marketingInfo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineFlpPackageScreenKt$CampaignCard$2(FlpOffer flpOffer, int i) {
        super(2);
        this.$marketingInfo = flpOffer;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneRegisterTrueOnlineFlpPackageScreenKt.m9555a(this.$marketingInfo, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}