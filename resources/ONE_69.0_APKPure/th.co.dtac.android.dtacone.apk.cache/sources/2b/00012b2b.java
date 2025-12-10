package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Mission;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "response", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignCountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneCampaignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneCampaignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/campaign/view_model/OneCampaignViewModel$getDtacCampaignCount$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,472:1\n1#2:473\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$getDtacCampaignCount$3 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$getDtacCampaignCount$3 extends Lambda implements Function1<OneCampaignCountResponse, Unit> {
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$getDtacCampaignCount$3(OneCampaignViewModel oneCampaignViewModel) {
        super(1);
        this.this$0 = oneCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignCountResponse oneCampaignCountResponse) {
        invoke2(oneCampaignCountResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignCountResponse oneCampaignCountResponse) {
        MutableLiveData mutableLiveData;
        Mission mission;
        Integer newMissionCount;
        PreferencesRepository preferencesRepository;
        Campaign campaign;
        Integer newCampaignCount;
        PreferencesRepository preferencesRepository2;
        Integer totalNew;
        PreferencesRepository preferencesRepository3;
        CampaignCountResponse data = oneCampaignCountResponse.getData();
        if (data != null && (totalNew = data.getTotalNew()) != null) {
            OneCampaignViewModel oneCampaignViewModel = this.this$0;
            int intValue = totalNew.intValue();
            preferencesRepository3 = oneCampaignViewModel.f88990d;
            preferencesRepository3.setInt(Constant.PREF_TOTAL_NEW, intValue);
        }
        CampaignCountResponse data2 = oneCampaignCountResponse.getData();
        if (data2 != null && (campaign = data2.getCampaign()) != null && (newCampaignCount = campaign.getNewCampaignCount()) != null) {
            OneCampaignViewModel oneCampaignViewModel2 = this.this$0;
            int intValue2 = newCampaignCount.intValue();
            preferencesRepository2 = oneCampaignViewModel2.f88990d;
            preferencesRepository2.setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, intValue2);
        }
        CampaignCountResponse data3 = oneCampaignCountResponse.getData();
        if (data3 != null && (mission = data3.getMission()) != null && (newMissionCount = mission.getNewMissionCount()) != null) {
            OneCampaignViewModel oneCampaignViewModel3 = this.this$0;
            int intValue3 = newMissionCount.intValue();
            preferencesRepository = oneCampaignViewModel3.f88990d;
            preferencesRepository.setInt(Constant.PREF_NEW_MISSION_COUNT, intValue3);
        }
        mutableLiveData = this.this$0.f88970B;
        mutableLiveData.setValue(Resource.Companion.success(oneCampaignCountResponse.getData()));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
    }
}