package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataItem;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignListTrueResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignListTrueResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$callOneTrueCampaignCount$4 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$callOneTrueCampaignCount$4 extends Lambda implements Function1<OneCampaignListTrueResponse, Unit> {
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$callOneTrueCampaignCount$4(OneCampaignViewModel oneCampaignViewModel) {
        super(1);
        this.this$0 = oneCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignListTrueResponse oneCampaignListTrueResponse) {
        invoke2(oneCampaignListTrueResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignListTrueResponse oneCampaignListTrueResponse) {
        PreferencesRepository preferencesRepository;
        MutableLiveData mutableLiveData;
        Integer totalNotRegisterCampaign;
        Integer totalNotRegisterCampaign2;
        List<DataItem> alreadyRegister;
        Integer totalNotRegisterCampaign3;
        List<DataItem> alreadyRegister2;
        preferencesRepository = this.this$0.f88990d;
        int i = 0;
        preferencesRepository.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_COUNT, false);
        mutableLiveData = this.this$0.f88970B;
        Resource.Companion companion = Resource.Companion;
        DataCampaign data = oneCampaignListTrueResponse.getData();
        Integer valueOf = Integer.valueOf((data == null || (alreadyRegister2 = data.getAlreadyRegister()) == null) ? 0 : alreadyRegister2.size());
        DataCampaign data2 = oneCampaignListTrueResponse.getData();
        Integer valueOf2 = Integer.valueOf((data2 == null || (totalNotRegisterCampaign3 = data2.getTotalNotRegisterCampaign()) == null) ? 0 : totalNotRegisterCampaign3.intValue());
        DataCampaign data3 = oneCampaignListTrueResponse.getData();
        int size = (data3 == null || (alreadyRegister = data3.getAlreadyRegister()) == null) ? 0 : alreadyRegister.size();
        DataCampaign data4 = oneCampaignListTrueResponse.getData();
        Campaign campaign = new Campaign(valueOf, valueOf2, Integer.valueOf(size + ((data4 == null || (totalNotRegisterCampaign2 = data4.getTotalNotRegisterCampaign()) == null) ? 0 : totalNotRegisterCampaign2.intValue())));
        DataCampaign data5 = oneCampaignListTrueResponse.getData();
        if (data5 != null && (totalNotRegisterCampaign = data5.getTotalNotRegisterCampaign()) != null) {
            i = totalNotRegisterCampaign.intValue();
        }
        mutableLiveData.setValue(companion.success(new CampaignCountResponse(null, campaign, Integer.valueOf(i))));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}