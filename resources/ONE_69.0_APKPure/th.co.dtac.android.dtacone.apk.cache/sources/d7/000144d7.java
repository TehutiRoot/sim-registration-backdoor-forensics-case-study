package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeData;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$CampaignCard$2 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$CampaignCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CampaignInfo $campaignSelected;
    final /* synthetic */ EntryFeeData $entryFeeData;
    final /* synthetic */ Function0<Unit> $onSelectFeeDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingCodeSelectScreenKt$CampaignCard$2(EntryFeeData entryFeeData, CampaignInfo campaignInfo, Function0<Unit> function0, int i) {
        super(2);
        this.$entryFeeData = entryFeeData;
        this.$campaignSelected = campaignInfo;
        this.$onSelectFeeDetail = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        MarketingCodeSelectScreenKt.m9391a(this.$entryFeeData, this.$campaignSelected, this.$onSelectFeeDetail, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}