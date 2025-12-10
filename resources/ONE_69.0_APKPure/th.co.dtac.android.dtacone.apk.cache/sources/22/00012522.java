package th.p047co.dtac.android.dtacone.presenter.sellerID;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Mission;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nChangeTokenForPromoterPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTokenForPromoterPresenter.kt\nth/co/dtac/android/dtacone/presenter/sellerID/ChangeTokenForPromoterPresenter$callCampaignCount$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.sellerID.ChangeTokenForPromoterPresenter$callCampaignCount$2 */
/* loaded from: classes8.dex */
public final class ChangeTokenForPromoterPresenter$callCampaignCount$2 extends Lambda implements Function1<CampaignCountResponse, Unit> {
    final /* synthetic */ ChangeTokenForPromoterPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeTokenForPromoterPresenter$callCampaignCount$2(ChangeTokenForPromoterPresenter changeTokenForPromoterPresenter) {
        super(1);
        this.this$0 = changeTokenForPromoterPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CampaignCountResponse campaignCountResponse) {
        invoke2(campaignCountResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CampaignCountResponse campaignCountResponse) {
        Integer newMissionCount;
        Integer newCampaignCount;
        Integer totalNew = campaignCountResponse.getTotalNew();
        if (totalNew != null) {
            this.this$0.getPreference().setInt(Constant.PREF_TOTAL_NEW, totalNew.intValue());
        }
        Campaign campaign = campaignCountResponse.getCampaign();
        if (campaign != null && (newCampaignCount = campaign.getNewCampaignCount()) != null) {
            this.this$0.getPreference().setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, newCampaignCount.intValue());
        }
        Mission mission = campaignCountResponse.getMission();
        if (mission == null || (newMissionCount = mission.getNewMissionCount()) == null) {
            return;
        }
        this.this$0.getPreference().setInt(Constant.PREF_NEW_MISSION_COUNT, newMissionCount.intValue());
    }
}