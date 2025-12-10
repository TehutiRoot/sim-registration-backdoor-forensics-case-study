package th.p047co.dtac.android.dtacone.view.appOne.campaign.view_model;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.DataCampaign;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignListTrueResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignListTrueResponse;", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.campaign.view_model.OneCampaignViewModel$callOneTrueCampaignCount$1 */
/* loaded from: classes10.dex */
public final class OneCampaignViewModel$callOneTrueCampaignCount$1 extends Lambda implements Function1<OneCampaignListTrueResponse, OneCampaignListTrueResponse> {
    final /* synthetic */ OneCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCampaignViewModel$callOneTrueCampaignCount$1(OneCampaignViewModel oneCampaignViewModel) {
        super(1);
        this.this$0 = oneCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OneCampaignListTrueResponse invoke(@NotNull OneCampaignListTrueResponse it) {
        PreferencesRepository preferencesRepository;
        Integer totalNotRegisterCampaign;
        PreferencesRepository preferencesRepository2;
        Integer totalNotRegisterCampaign2;
        PreferencesRepository preferencesRepository3;
        Intrinsics.checkNotNullParameter(it, "it");
        DataCampaign data = it.getData();
        if (data != null && (totalNotRegisterCampaign2 = data.getTotalNotRegisterCampaign()) != null) {
            OneCampaignViewModel oneCampaignViewModel = this.this$0;
            int intValue = totalNotRegisterCampaign2.intValue();
            preferencesRepository3 = oneCampaignViewModel.f88990d;
            preferencesRepository3.setInt(Constant.PREF_TOTAL_NEW, intValue);
        }
        DataCampaign data2 = it.getData();
        if (data2 != null && (totalNotRegisterCampaign = data2.getTotalNotRegisterCampaign()) != null) {
            OneCampaignViewModel oneCampaignViewModel2 = this.this$0;
            int intValue2 = totalNotRegisterCampaign.intValue();
            preferencesRepository2 = oneCampaignViewModel2.f88990d;
            preferencesRepository2.setInt(Constant.PREF_NEW_CAMPAIGN_COUNT, intValue2);
        }
        preferencesRepository = this.this$0.f88990d;
        preferencesRepository.setInt(Constant.PREF_NEW_MISSION_COUNT, 0);
        return it;
    }
}