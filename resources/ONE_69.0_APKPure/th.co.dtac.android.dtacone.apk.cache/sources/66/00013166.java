package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.data.cache.preference.PreferencesRepository;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignRedeemNotiResponse;
import th.p047co.dtac.android.dtacone.model.campaign_redemption.CampaignRedeemNotResponse;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignRedeemNotiResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$callRedeemNoti$2 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$callRedeemNoti$2 extends Lambda implements Function1<OneCampaignRedeemNotiResponse, Unit> {
    final /* synthetic */ OneHomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneHomeViewModel$callRedeemNoti$2(OneHomeViewModel oneHomeViewModel) {
        super(1);
        this.this$0 = oneHomeViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignRedeemNotiResponse oneCampaignRedeemNotiResponse) {
        invoke2(oneCampaignRedeemNotiResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignRedeemNotiResponse oneCampaignRedeemNotiResponse) {
        PreferencesRepository preferencesRepository;
        PreferencesRepository preferencesRepository2;
        PreferencesRepository preferencesRepository3;
        PreferencesRepository preferencesRepository4;
        MutableLiveData m14072J;
        String textButton;
        PreferencesRepository preferencesRepository5;
        preferencesRepository = this.this$0.f91264e;
        preferencesRepository.setBoolean(Constant.REQUIRE_CALL_CAMPAIGN_REDEMPTION, false);
        CampaignRedeemNotResponse data = oneCampaignRedeemNotiResponse.getData();
        if (Intrinsics.areEqual(data != null ? data.getDisplayFlag() : null, "Y")) {
            preferencesRepository5 = this.this$0.f91264e;
            preferencesRepository5.setBoolean(Constant.CAMPAIGN_REDEMPTION, true);
        } else {
            preferencesRepository2 = this.this$0.f91264e;
            preferencesRepository2.setBoolean(Constant.CAMPAIGN_REDEMPTION, false);
        }
        preferencesRepository3 = this.this$0.f91264e;
        CampaignRedeemNotResponse data2 = oneCampaignRedeemNotiResponse.getData();
        String str = "";
        preferencesRepository3.setString(Constant.NOTI_MESSAGE, (data2 == null || (r1 = data2.getNotiMessage()) == null) ? "" : "");
        preferencesRepository4 = this.this$0.f91264e;
        CampaignRedeemNotResponse data3 = oneCampaignRedeemNotiResponse.getData();
        if (data3 != null && (textButton = data3.getTextButton()) != null) {
            str = textButton;
        }
        preferencesRepository4.setString(Constant.TEXT_BUTTON, str);
        m14072J = this.this$0.m14072J();
        m14072J.setValue(Resource.Companion.success(Boolean.TRUE));
    }
}