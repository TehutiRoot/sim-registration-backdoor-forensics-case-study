package th.p047co.dtac.android.dtacone.data.remote.campaign;

import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignDetailUrlResponse;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignListResponse;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.OneCampaignRedeemNotiResponse;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignListTrueRequest;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignListTrueResponse;
import th.p047co.dtac.android.dtacone.model.appOne.campaign.trueCompany.OneCampaignRegisterTrueRequest;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountRequest;
import th.p047co.dtac.android.dtacone.model.campaign.image.OneTrueCampaignImageResponse;
import th.p047co.dtac.android.dtacone.model.campaign.join.request.JoinCampaignRequest;
import th.p047co.dtac.android.dtacone.model.campaign.list.CampaignRequest;
import th.p047co.dtac.android.dtacone.model.campaign.reward.OneTrueCampaignRewardRequest;
import th.p047co.dtac.android.dtacone.model.campaign.reward.OneTrueCampaignRewardResponse;
import th.p047co.dtac.android.dtacone.model.campaign.web.CampaignDetailUrlRequest;
import th.p047co.dtac.android.dtacone.model.campaign_redemption.CampaignRedeemNotRequest;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m28851d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001cH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001eH'¨\u0006\u001f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/campaign/OneCampaignApi;", "", "getCampaignCount", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignCountResponse;", "request", "Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountRequest;", "getCampaignDetailUrl", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignDetailUrlResponse;", "Lth/co/dtac/android/dtacone/model/campaign/web/CampaignDetailUrlRequest;", "getCampaignList", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignListResponse;", "Lth/co/dtac/android/dtacone/model/campaign/list/CampaignRequest;", "getTrueCampaignList", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignListTrueResponse;", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignListTrueRequest;", "joinCampaign", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "Lth/co/dtac/android/dtacone/model/campaign/join/request/JoinCampaignRequest;", "oneRetailerCampaignRedeemNoti", "Lth/co/dtac/android/dtacone/model/appOne/campaign/OneCampaignRedeemNotiResponse;", "Lth/co/dtac/android/dtacone/model/campaign_redemption/CampaignRedeemNotRequest;", "oneTrueCampaignImage", "Lth/co/dtac/android/dtacone/model/campaign/image/OneTrueCampaignImageResponse;", "cpPhoto", "", "oneTrueCampaignReward", "Lth/co/dtac/android/dtacone/model/campaign/reward/OneTrueCampaignRewardResponse;", "Lth/co/dtac/android/dtacone/model/campaign/reward/OneTrueCampaignRewardRequest;", "registerCampaignTrue", "Lth/co/dtac/android/dtacone/model/appOne/campaign/trueCompany/OneCampaignRegisterTrueRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.campaign.OneCampaignApi */
/* loaded from: classes7.dex */
public interface OneCampaignApi {
    @POST("oneCampaign/retailer/campaign/opt-in/count/v2")
    @NotNull
    Single<OneCampaignCountResponse> getCampaignCount(@Body @NotNull CampaignCountRequest campaignCountRequest);

    @POST("oneCampaign/campaign/buzzeebee/detail")
    @NotNull
    Single<OneCampaignDetailUrlResponse> getCampaignDetailUrl(@Body @NotNull CampaignDetailUrlRequest campaignDetailUrlRequest);

    @POST("oneCampaign/campaign/list")
    @NotNull
    Single<OneCampaignListResponse> getCampaignList(@Body @NotNull CampaignRequest campaignRequest);

    @POST("oneCampaignT/partner/listCampaign")
    @NotNull
    Single<OneCampaignListTrueResponse> getTrueCampaignList(@Body @NotNull OneCampaignListTrueRequest oneCampaignListTrueRequest);

    @POST("oneCampaign/retailer/campaign/opt-in/register")
    @NotNull
    Single<OneCommonResponse> joinCampaign(@Body @NotNull JoinCampaignRequest joinCampaignRequest);

    @POST("oneCampaign/retailer/campaign/redeem/noti")
    @NotNull
    Single<OneCampaignRedeemNotiResponse> oneRetailerCampaignRedeemNoti(@Body @NotNull CampaignRedeemNotRequest campaignRedeemNotRequest);

    @GET("oneCampaignT/partner/imageCampaign")
    @NotNull
    Single<OneTrueCampaignImageResponse> oneTrueCampaignImage(@Header("CpPhoto") @NotNull String str);

    @POST("oneCampaignT/partner/rewardCampaign")
    @NotNull
    Single<OneTrueCampaignRewardResponse> oneTrueCampaignReward(@Body @NotNull OneTrueCampaignRewardRequest oneTrueCampaignRewardRequest);

    @POST("oneCampaignT/partner/registerCampaign")
    @NotNull
    Single<OneCommonResponse> registerCampaignTrue(@Body @NotNull OneCampaignRegisterTrueRequest oneCampaignRegisterTrueRequest);
}
