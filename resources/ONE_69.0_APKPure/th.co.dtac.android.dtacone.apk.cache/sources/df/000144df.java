package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingDetails;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.EntryFeeData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.MarketingListState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$4 */
/* loaded from: classes10.dex */
public final class MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ EntryFeeData $entryFeeData;
    final /* synthetic */ MarketingListState $marketingState;
    final /* synthetic */ Function1<MarketingDetails, Unit> $onSelect;
    final /* synthetic */ Function0<Unit> $onSelectFeeDetail;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketingCodeSelectScreenKt$MarketingCodeSelectScreen$4(MarketingListState marketingListState, EntryFeeData entryFeeData, CampaignInfo campaignInfo, Function1<? super MarketingDetails, Unit> function1, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$marketingState = marketingListState;
        this.$entryFeeData = entryFeeData;
        this.$campaignInfo = campaignInfo;
        this.$onSelect = function1;
        this.$onSelectFeeDetail = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        MarketingCodeSelectScreenKt.MarketingCodeSelectScreen(this.$marketingState, this.$entryFeeData, this.$campaignInfo, this.$onSelect, this.$onSelectFeeDetail, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}