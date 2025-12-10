package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Mission;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignCountResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOneHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneHomeViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/home/viewModel/OneHomeViewModel$callOneDtacGetCampaignCount$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,600:1\n1#2:601\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$callOneDtacGetCampaignCount$1 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$callOneDtacGetCampaignCount$1 extends Lambda implements Function1<OneCampaignCountResponse, OneCampaignCountResponse> {
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeViewModel$callOneDtacGetCampaignCount$1(OneHomeViewModel oneHomeViewModel) {
        super(1);
        this.this$0 = oneHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneCampaignCountResponse invoke(@NotNull OneCampaignCountResponse it) {
        Mission mission;
        Integer newMissionCount;
        PreferencesRepository preferencesRepository;
        Campaign campaign;
        Integer newCampaignCount;
        PreferencesRepository preferencesRepository2;
        Integer totalNew;
        PreferencesRepository preferencesRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        CampaignCountResponse data = it.getData();
        if (data != null && (totalNew = data.getTotalNew()) != null) {
            OneHomeViewModel oneHomeViewModel = this.this$0;
            int intValue = totalNew.intValue();
            preferencesRepository3 = oneHomeViewModel.f91264e;
            preferencesRepository3.setInt(Constant.PREF_TOTAL_NEW, intValue);
        }
        CampaignCountResponse data2 = it.getData();
        if (data2 != null && (campaign = data2.getCampaign()) != null && (newCampaignCount = campaign.getNewCampaignCount()) != null) {
            OneHomeViewModel oneHomeViewModel2 = this.this$0;
            int intValue2 = newCampaignCount.intValue();
            preferencesRepository2 = oneHomeViewModel2.f91264e;
            preferencesRepository2.setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, intValue2);
        }
        CampaignCountResponse data3 = it.getData();
        if (data3 != null && (mission = data3.getMission()) != null && (newMissionCount = mission.getNewMissionCount()) != null) {
            OneHomeViewModel oneHomeViewModel3 = this.this$0;
            int intValue3 = newMissionCount.intValue();
            preferencesRepository = oneHomeViewModel3.f91264e;
            preferencesRepository.setInt(Constant.PREF_NEW_MISSION_COUNT, intValue3);
        }
        return it;
    }
}