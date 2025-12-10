package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$SubscriptionInfoCard$2 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$SubscriptionInfoCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ boolean $isCheck;
    final /* synthetic */ Function1<Boolean, Unit> $onCheck;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$SubscriptionInfoCard$2(CampaignInfo campaignInfo, boolean z, Function1<? super Boolean, Unit> function1, int i) {
        super(2);
        this.$campaignInfo = campaignInfo;
        this.$isCheck = z;
        this.$onCheck = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneFeeInfoScreenKt.SubscriptionInfoCard(this.$campaignInfo, this.$isCheck, this.$onCheck, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}