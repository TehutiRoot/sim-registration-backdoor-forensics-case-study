package th.p047co.dtac.android.dtacone.viewmodel.home;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.campaign.count.Campaign;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.campaign.count.Mission;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nHomeViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/home/HomeViewModel$callApiGetCampaignCount$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModel$callApiGetCampaignCount$1 */
/* loaded from: classes9.dex */
public final class HomeViewModel$callApiGetCampaignCount$1 extends Lambda implements Function1<CampaignCountResponse, CampaignCountResponse> {
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$callApiGetCampaignCount$1(HomeViewModel homeViewModel) {
        super(1);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CampaignCountResponse invoke(@NotNull CampaignCountResponse it) {
        Integer newMissionCount;
        PreferencesRepository preferencesRepository;
        Integer newCampaignCount;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        Integer totalNew = it.getTotalNew();
        if (totalNew != null) {
            HomeViewModel homeViewModel = this.this$0;
            int intValue = totalNew.intValue();
            preferencesRepository3 = homeViewModel.f105997e;
            preferencesRepository3.setInt(Constant.PREF_TOTAL_NEW, intValue);
        }
        Campaign campaign = it.getCampaign();
        if (campaign != null && (newCampaignCount = campaign.getNewCampaignCount()) != null) {
            HomeViewModel homeViewModel2 = this.this$0;
            int intValue2 = newCampaignCount.intValue();
            preferencesRepository2 = homeViewModel2.f105997e;
            preferencesRepository2.setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, intValue2);
        }
        Mission mission = it.getMission();
        if (mission != null && (newMissionCount = mission.getNewMissionCount()) != null) {
            HomeViewModel homeViewModel3 = this.this$0;
            int intValue3 = newMissionCount.intValue();
            preferencesRepository = homeViewModel3.f105997e;
            preferencesRepository.setInt(Constant.PREF_NEW_MISSION_COUNT, intValue3);
        }
        return it;
    }
}