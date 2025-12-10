package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReason;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.campaign.CampaignInfo;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.EntryFeeReasonState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.tolPackage.OneFeeInfoScreenKt$OneFeeInfoScreen$3 */
/* loaded from: classes10.dex */
public final class OneFeeInfoScreenKt$OneFeeInfoScreen$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CampaignInfo $campaignInfo;
    final /* synthetic */ EntryFeeReasonState $feeInfoState;
    final /* synthetic */ Function1<Boolean, Unit> $onClickCheckBox;
    final /* synthetic */ Function3<String, String, CampaignWaiveReason, Unit> $onSelect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneFeeInfoScreenKt$OneFeeInfoScreen$3(EntryFeeReasonState entryFeeReasonState, CampaignInfo campaignInfo, Function1<? super Boolean, Unit> function1, Function3<? super String, ? super String, ? super CampaignWaiveReason, Unit> function3, int i, int i2) {
        super(2);
        this.$feeInfoState = entryFeeReasonState;
        this.$campaignInfo = campaignInfo;
        this.$onClickCheckBox = function1;
        this.$onSelect = function3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(@Nullable Composer composer, int i) {
        OneFeeInfoScreenKt.OneFeeInfoScreen(this.$feeInfoState, this.$campaignInfo, this.$onClickCheckBox, this.$onSelect, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}