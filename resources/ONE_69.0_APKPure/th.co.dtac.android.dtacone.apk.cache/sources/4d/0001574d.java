package th.p047co.dtac.android.dtacone.viewmodel.home;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.home.HomeViewModel$callApiGetCampaignCount$3 */
/* loaded from: classes9.dex */
public final class HomeViewModel$callApiGetCampaignCount$3 extends Lambda implements Function1<CampaignCountResponse, Unit> {
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$callApiGetCampaignCount$3(HomeViewModel homeViewModel) {
        super(1);
        this.this$0 = homeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CampaignCountResponse campaignCountResponse) {
        invoke2(campaignCountResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(CampaignCountResponse campaignCountResponse) {
        PreferencesRepository preferencesRepository;
        MutableLiveData m2582r;
        preferencesRepository = this.this$0.f105997e;
        preferencesRepository.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_COUNT, false);
        m2582r = this.this$0.m2582r();
        m2582r.setValue(Resource.Companion.success(Boolean.TRUE));
    }
}