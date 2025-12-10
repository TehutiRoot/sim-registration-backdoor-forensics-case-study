package th.p047co.dtac.android.dtacone.manager.service;

import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import th.p047co.dtac.android.dtacone.model.ConfigurationCollection;
import th.p047co.dtac.android.dtacone.model.ForgotPasswordCollection;
import th.p047co.dtac.android.dtacone.model.OTPVerifyCollection;
import th.p047co.dtac.android.dtacone.model.PerformanceReportsCollection;
import th.p047co.dtac.android.dtacone.model.RegisterOwnerCollection;
import th.p047co.dtac.android.dtacone.model.RrtProfileCollection;
import th.p047co.dtac.android.dtacone.model.ServerVersionCollection;
import th.p047co.dtac.android.dtacone.model.SimRCollection;
import th.p047co.dtac.android.dtacone.model.SimRInfoCollection;
import th.p047co.dtac.android.dtacone.model.WhatNewCollection;
import th.p047co.dtac.android.dtacone.model.activate_dol.ActivateDolCollection;
import th.p047co.dtac.android.dtacone.model.activate_dol.DolStatusCollection;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpCheckSubscriberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.topup.OneTopUpGetMainBalanceResponse;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolAcceptConsent;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolHistoryTransaction;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolListCard;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolPriceList;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestCharge;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolRequestChargeV2;
import th.p047co.dtac.android.dtacone.model.buy_dol.BuyDolResponseCharge;
import th.p047co.dtac.android.dtacone.model.buy_dol.OmisePublicKey;
import th.p047co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse;
import th.p047co.dtac.android.dtacone.model.change_password.ChangePasswordCollection;
import th.p047co.dtac.android.dtacone.model.consent.ConsentCollection;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentResponse;
import th.p047co.dtac.android.dtacone.model.consent.SaveConsentRequest;
import th.p047co.dtac.android.dtacone.model.epin.EpinConfirmCollection;
import th.p047co.dtac.android.dtacone.model.force_change_password.ForceChangePassword;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerDetailCollection;
import th.p047co.dtac.android.dtacone.model.inactive_user.OwnerListCollection;
import th.p047co.dtac.android.dtacone.model.login.Cli;
import th.p047co.dtac.android.dtacone.model.login.LoginCollection;
import th.p047co.dtac.android.dtacone.model.login.PostFirebaseToken;
import th.p047co.dtac.android.dtacone.model.login.TokenCollection;
import th.p047co.dtac.android.dtacone.model.newsfeed.LikeNewsRequest;
import th.p047co.dtac.android.dtacone.model.newsfeed.NewsFeedViewsCollection;
import th.p047co.dtac.android.dtacone.model.newsfeed.list.response.NewsItem;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpBody;
import th.p047co.dtac.android.dtacone.model.otp.request.RequestOtpResponse;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyOtpRequest;
import th.p047co.dtac.android.dtacone.model.otp.verify.VerifyWithDeviceBody;
import th.p047co.dtac.android.dtacone.model.permission.PermissionResponseCollection;
import th.p047co.dtac.android.dtacone.model.permission.SavePermissionCollection;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoRequest;
import th.p047co.dtac.android.dtacone.model.postcode.GetPostCodeInfoResponse;
import th.p047co.dtac.android.dtacone.model.postpaid.PostcodeRequestCollection;
import th.p047co.dtac.android.dtacone.model.postpaid.PostcodeResponseCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.CardCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PermissionActivation;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidActivationRequest;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidActivationResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidImage;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidPostcodeListCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.PrepaidStatusResponse;
import th.p047co.dtac.android.dtacone.model.prepaid.RegisterPrepaidCollection;
import th.p047co.dtac.android.dtacone.model.prepaid.WaitTimeResponse;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyConfirmCollection;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyListCollection;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyResponseCollection;
import th.p047co.dtac.android.dtacone.model.register.RegisterCollection;
import th.p047co.dtac.android.dtacone.model.register.SimRListCollection;
import th.p047co.dtac.android.dtacone.model.rtr_performance.RetailerProfileCollection;
import th.p047co.dtac.android.dtacone.model.rtr_performance.SaleReportListCollection;
import th.p047co.dtac.android.dtacone.model.staff.AddNewStaffCollection;
import th.p047co.dtac.android.dtacone.model.staff.RenameStaffCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffCreditResetCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffCreditUpdateCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffLimitCollection;
import th.p047co.dtac.android.dtacone.model.staff.StaffListCollection;
import th.p047co.dtac.android.dtacone.model.status.StatusResponse;
import th.p047co.dtac.android.dtacone.model.stv.StvCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvGroupListCollection;
import th.p047co.dtac.android.dtacone.model.stv.StvRecommendPackageReq;
import th.p047co.dtac.android.dtacone.model.stv.StvRecommendPackageResp;
import th.p047co.dtac.android.dtacone.model.stv.StvSubmitCollection;
import th.p047co.dtac.android.dtacone.model.stv.SubmitProsermRecommendReq;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;
import th.p047co.dtac.android.dtacone.model.topup.TopUpCollection;
import th.p047co.dtac.android.dtacone.model.topup.TopUpPriceListCollection;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferRequest;
import th.p047co.dtac.android.dtacone.model.topup.offer.TopupOfferResponse;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdateImageResponse;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidAllowCamera;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidOptionalImage;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidUpdateProfile;
import th.p047co.dtac.android.dtacone.model.updateprepaid.UpdatePrepaidVerifyOtpResponseCollection;

/* renamed from: th.co.dtac.android.dtacone.manager.service.RTRApi */
/* loaded from: classes7.dex */
public interface RTRApi {
    @POST("mrtrconsent/retailer/consent/accept")
    Observable<PrepaidStatusResponse> acceptBuyDOLConsent(@Body BuyDolAcceptConsent buyDolAcceptConsent);

    @POST("/mrtrconsent/consent/accept/")
    p046rx.Observable<Void> acceptConsent(@Body ConsentCollection consentCollection);

    @POST("prepaid-registration/activate")
    p046rx.Observable<PrepaidActivationResponse> activationPrepaid(@Body PrepaidActivationRequest prepaidActivationRequest);

    @POST("register/staff")
    p046rx.Observable<Void> addNewStaff(@Body AddNewStaffCollection addNewStaffCollection);

    @POST("/buy-dol/charge/v2")
    Observable<BuyDolResponseCharge> buyDolChargeV2(@Body BuyDolRequestChargeV2 buyDolRequestChargeV2);

    @POST("mrtrlogin/request/v2/changepassword")
    p046rx.Observable<Void> changePassword(@Body ChangePasswordCollection changePasswordCollection);

    @POST("/buy-dol/charge")
    Observable<BuyDolResponseCharge> charge(@Body BuyDolRequestCharge buyDolRequestCharge);

    @GET("mrtrlogin/mobile/version/configuration/location")
    p046rx.Observable<ServerVersionCollection> checkMailingAddressVersion();

    @GET("mrtrlogin/mobile/version/configuration")
    p046rx.Observable<ServerVersionCollection> checkMobileConfigVersion();

    @GET("check/register/{mobileNumber}")
    p046rx.Observable<Void> checkRegister(@Path("mobileNumber") String str);

    @GET("check/register/{msisdn}/{rtrCode}")
    p046rx.Observable<Void> checkRegisterStatus(@Path("msisdn") String str, @Path("rtrCode") String str2);

    @GET("/check/simr/{mobileNumber}")
    p046rx.Observable<SimRInfoCollection> checkSimR(@Path("mobileNumber") String str);

    @GET("/check/simr/{msisdn}/{rtrCode}")
    p046rx.Observable<SimRListCollection> checkSimR(@Path("msisdn") String str, @Path("rtrCode") String str2);

    @POST("oneCustomerEnquiry/checkSubscriberPrepaid")
    Single<OneTopUpCheckSubscriberResponse> checkSubscriberPrepaid(@Body OneTopUpCheckSubscriberRequest oneTopUpCheckSubscriberRequest);

    @POST("epin/epin")
    p046rx.Observable<Void> confirmEPin(@Body EpinConfirmCollection epinConfirmCollection);

    @POST("/mrtrrectify/confirm")
    p046rx.Observable<RectifyResponseCollection> confirmRectify(@Header("Customer-Mobile") String str, @Body RectifyConfirmCollection rectifyConfirmCollection);

    @DELETE("/buy-dol/card")
    Observable<StatusResponse> deleteCard(@Query("accountCode") String str, @Query("cardToken") String str2);

    @DELETE("mrtrprofile/owner/{mrtrUserId}")
    p046rx.Observable<Void> deleteOwner(@Path("mrtrUserId") int i);

    @DELETE("mrtrprofile/staff/{id}")
    p046rx.Observable<Void> disableStaff(@Path("id") Long l);

    @Streaming
    @GET
    p046rx.Observable<ResponseBody> downloadDatabase(@Url String str);

    @POST("request/password/force")
    p046rx.Observable<StatusResponse> forceChangePassword(@Body ForceChangePassword forceChangePassword);

    @POST("mrtrlogin/request/forgotpassword")
    p046rx.Observable<Void> forgotPassword(@Body ForgotPasswordCollection forgotPasswordCollection);

    @GET("prepaid-registration/update/camera")
    p046rx.Observable<UpdatePrepaidAllowCamera> getAllowCamera(@Query("customerNumber") String str);

    @GET("balance")
    p046rx.Observable<BalanceCollection> getBalance();

    @GET("mrtrconsent/consent/onetime")
    Observable<ConsentNonTelcoResponse> getBuyDOLConsent(@Query("consentDomain") String str, @Query("mrtrUserId") Long l);

    @GET("/buy-dol/pricelist")
    p046rx.Observable<BuyDolPriceList> getBuyDOLPriceList();

    @GET("/buy-dol/transaction/{transactionId}")
    Observable<BuyDolResponseCharge> getBuyDolTransactionById(@Path("transactionId") String str);

    @GET("/buy-dol/transactions")
    Observable<BuyDolHistoryTransaction> getBuyDolTransactionHistory();

    @GET("cms/retailer/campaign/opt-in/count")
    p046rx.Observable<CampaignCountResponse> getCampaignCount();

    @GET("/buy-dol/cards")
    Observable<BuyDolListCard> getCards();

    @GET("news/v3/channel")
    p046rx.Observable<List<String>> getChannelTopic();

    @GET
    p046rx.Observable<Cli> getCli(@Url String str);

    @GET("configuration")
    p046rx.Observable<ConfigurationCollection> getConfiguration();

    @GET("/mrtrcommon/content/{content}")
    p046rx.Observable<Response<ResponseBody>> getContent(@Header("Accept-Language") String str, @Path("content") String str2);

    @GET("prepaid-registration/registration/consent/{mrtr_id}")
    p046rx.Observable<ConsentResponse> getContentPrepaid(@Path("mrtr_id") Long l);

    @GET("retailer/dol/status")
    p046rx.Observable<DolStatusCollection> getDolStatus();

    @GET("epin/pricelist")
    p046rx.Observable<List<Integer>> getEPinPrice();

    @POST("portin/card/postcode")
    p046rx.Observable<PostcodeResponseCollection> getMNPPostCode(@Body PostcodeRequestCollection postcodeRequestCollection);

    @POST("oneCustomerEnquiry/subscriber/mainBalance")
    Single<OneTopUpGetMainBalanceResponse> getMainBalance(@Body OneTopUpGetMainBalanceRequest oneTopUpGetMainBalanceRequest);

    @GET("mrtrlogin/mobile/version")
    p046rx.Observable<WhatNewCollection> getMinimumVersion();

    @GET("mrtrpermission/permissions")
    p046rx.Observable<PermissionResponseCollection> getMrtrPermission();

    @GET("news/v3/list")
    p046rx.Observable<List<NewsItem>> getNewsFeed(@Query("page") int i);

    @GET("news/v3/detail")
    p046rx.Observable<NewsItem> getNewsFeedById(@Query("newsId") int i);

    @GET("otp/request/{mobileNumber}/")
    p046rx.Observable<Void> getOTP(@Path("mobileNumber") String str, @Query("event") String str2);

    @GET("topup/offer/v2/{msisdn}")
    p046rx.Observable<TopupOfferResponse> getOffer(@Header("Customer-Mobile") String str, @Path("msisdn") String str2);

    @POST("topup/offer/v2")
    p046rx.Observable<TopupOfferResponse> getOffer(@Header("Customer-Mobile") String str, @Body TopupOfferRequest topupOfferRequest);

    @GET("/buy-dol/public-key")
    Observable<OmisePublicKey> getOmisePublicKey();

    @GET("prepaid-registration/image/optional")
    p046rx.Observable<UpdatePrepaidOptionalImage> getOptionalImages();

    @GET("mrtrprofile/owner/transaction")
    p046rx.Observable<OwnerDetailCollection> getOwnerDetail(@Query("mrtrUserId") int i);

    @GET("mrtrprofile/owner/list")
    p046rx.Observable<OwnerListCollection> getOwnerList();

    @GET("report/?type=rtr-performance")
    p046rx.Observable<PerformanceReportsCollection> getPerformanceReports();

    @GET("prepaid-registration/permission")
    p046rx.Observable<PermissionActivation> getPermissionActivation();

    @POST("mrtrcommon/postcode/info")
    p046rx.Observable<GetPostCodeInfoResponse> getPostCodeInfo(@Body GetPostCodeInfoRequest getPostCodeInfoRequest);

    @GET("rtrshortinfo")
    p046rx.Observable<RrtProfileCollection> getProfile();

    @GET("/mrtrrectify/list")
    p046rx.Observable<List<RectifyListCollection>> getRectifyList(@Query("customerNumber") String str);

    @GET("retailer/profile")
    p046rx.Observable<RetailerProfileCollection> getRetailerProfile();

    @GET("report-service/retailer/report")
    p046rx.Observable<SaleReportListCollection> getRetailerSaleReport();

    @GET("stv/packages")
    p046rx.Observable<List<StvCollection>> getSTVPackages();

    @GET("stv/packages/v5")
    p046rx.Observable<StvGroupListCollection> getSTVPackagesV5();

    @GET("stv/packages/v5")
    p046rx.Observable<StvGroupListCollection> getSTVPackagesV5(@Query("subscriberGroup") String str);

    @POST("stv/getPackageProserm")
    p046rx.Observable<StvRecommendPackageResp> getSTVRecommendPackages(@Body StvRecommendPackageReq stvRecommendPackageReq);

    @GET("/mrtruserprofile/simrlist")
    p046rx.Observable<SimRCollection> getSimRList();

    @GET("mrtrprofile/staff/{id}?version=2")
    p046rx.Observable<StaffDetailCollection> getStaffDetail(@Path("id") Long l);

    @GET("mrtrprofile/staff/limit")
    p046rx.Observable<StaffLimitCollection> getStaffLimit();

    @GET("mrtrprofile/staff/list?version=2")
    p046rx.Observable<StaffListCollection> getStaffList();

    @GET("pricelist")
    p046rx.Observable<List<TopUpPriceListCollection>> getTopupPriceList();

    @GET("prepaid-registration/subscriber-number")
    p046rx.Observable<WaitTimeResponse> getWaitTime(@Query("transactionId") String str);

    @POST("news/v3/like")
    p046rx.Observable<Void> like(@Body LikeNewsRequest likeNewsRequest);

    @POST("notification/notification/connect")
    p046rx.Observable<Void> postFirebaseToken(@Body PostFirebaseToken postFirebaseToken);

    @POST("register/owner")
    p046rx.Observable<Void> register(@Body RegisterCollection registerCollection);

    @POST("register/owner")
    p046rx.Observable<Void> registerOwner(@Body RegisterOwnerCollection registerOwnerCollection);

    @POST("prepaid-registration/registration")
    p046rx.Observable<PrepaidStatusResponse> registerPrepaid(@Body RegisterPrepaidCollection registerPrepaidCollection);

    @PUT("mrtrprofile/staff/{id}")
    p046rx.Observable<Void> renameStaff(@Path("id") Long l, @Body RenameStaffCollection renameStaffCollection);

    @POST("login/v3")
    p046rx.Observable<TokenCollection> requestLogin(@Body LoginCollection loginCollection);

    @POST("mrtrlogin/logout")
    p046rx.Observable<Void> requestLogout();

    @POST("otp/v2/request")
    p046rx.Observable<RequestOtpResponse> requestOtp(@Body RequestOtpBody requestOtpBody);

    @POST("mrtrprofile/staff/credit/reset")
    p046rx.Observable<Void> resetStaffCredit(@Body StaffCreditResetCollection staffCreditResetCollection);

    @POST("prepaid-registration/registration/consent/accept")
    p046rx.Observable<Void> saveConsentPrepaid(@Body SaveConsentRequest saveConsentRequest);

    @POST("/mrtrpermission/permissions/update")
    p046rx.Observable<Void> saveMrtrPermission(@Body SavePermissionCollection savePermissionCollection);

    @POST("news/click")
    p046rx.Observable<Void> saveViewEvent(@Body NewsFeedViewsCollection newsFeedViewsCollection);

    @POST("stv/prosermRecommend/v2")
    p046rx.Observable<Void> submitProsermRecommend(@Header("Customer-Mobile") String str, @Body SubmitProsermRecommendReq submitProsermRecommendReq);

    @POST("stv/submit/v2")
    p046rx.Observable<Void> submitStvPackage(@Header("Customer-Mobile") String str, @Body StvSubmitCollection stvSubmitCollection);

    @POST("topup/v2")
    p046rx.Observable<BalanceCollection> topUp(@Header("Customer-Mobile") String str, @Body TopUpCollection topUpCollection);

    @POST("news/v3/unlike")
    p046rx.Observable<Void> unlike(@Body LikeNewsRequest likeNewsRequest);

    @POST("prepaid-registration/update/profile/v2")
    p046rx.Observable<Void> updatePrepaidProfile(@Body UpdatePrepaidUpdateProfile updatePrepaidUpdateProfile);

    @POST("mrtrprofile/staff/credit")
    p046rx.Observable<Void> updateStaffCredit(@Body StaffCreditUpdateCollection staffCreditUpdateCollection);

    @POST("prepaid-registration/registration/send/image")
    p046rx.Observable<PrepaidImage> uploadImage(@Body PrepaidImage prepaidImage);

    @POST("prepaid-registration/image")
    @Multipart
    p046rx.Observable<UpdateImageResponse> uploadImageReRegistration(@Part("subscriberNumber") RequestBody requestBody, @Part("simcardNumber") RequestBody requestBody2, @Part MultipartBody.Part part);

    @POST("prepaid-registration/profileImage")
    @Multipart
    p046rx.Observable<UpdateImageResponse> uploadProfileImageReRegistration(@Part("subscriberNumber") RequestBody requestBody, @Part("simcardNumber") RequestBody requestBody2, @Part MultipartBody.Part part);

    @POST("prepaid-registration/registration/card/validate")
    p046rx.Observable<PrepaidPostcodeListCollection> validateCard(@Body CardCollection cardCollection);

    @POST("/prepaid-registration/verification")
    p046rx.Observable<UpdatePrepaidVerifyOtpResponseCollection> verificationPrepaid(@Body VerifyWithDeviceBody verifyWithDeviceBody);

    @POST("mrtrprofile/retailer/dol/activate")
    p046rx.Observable<Void> verifyActivateDol(@Body ActivateDolCollection activateDolCollection);

    @POST("otp/verify")
    p046rx.Observable<TokenCollection> verifyOTP(@Body OTPVerifyCollection oTPVerifyCollection);

    @POST("otp/v2/verify")
    p046rx.Observable<TokenCollection> verifyOTP(@Body VerifyOtpRequest verifyOtpRequest);
}
