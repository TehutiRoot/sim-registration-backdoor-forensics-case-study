package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.EntryFeeReasonState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$ReasonSelection$2 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$ReasonSelection$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ EntryFeeReasonState $feeInfoState;
    final /* synthetic */ String $filterText;
    final /* synthetic */ Function1<CampaignWaiveReason, Unit> $onSelect;
    final /* synthetic */ Function1<String, Unit> $onTextChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$ReasonSelection$2(EntryFeeReasonState entryFeeReasonState, String str, CampaignInfo campaignInfo, Function1<? super CampaignWaiveReason, Unit> function1, Function1<? super String, Unit> function12, int i) {
        super(2);
        this.$feeInfoState = entryFeeReasonState;
        this.$filterText = str;
        this.$campaignInfo = campaignInfo;
        this.$onSelect = function1;
        this.$onTextChange = function12;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneFeeInfoScreenKt.ReasonSelection(this.$feeInfoState, this.$filterText, this.$campaignInfo, this.$onSelect, this.$onTextChange, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}