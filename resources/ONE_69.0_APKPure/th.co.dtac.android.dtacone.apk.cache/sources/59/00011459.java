package th.p047co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue;

import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleAuthorizationRequest;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleSaveOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleSubmitRequest;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.request.OneDeviceSaleValidateStockRequest;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleAuthorizationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaleValidateStockResponse;
import th.p047co.dtac.android.dtacone.model.appOne.oneDeviceSaleTrue.response.OneDeviceSaveOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneConsentNoticeDocRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneConsentNoticeDocResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidGetProductMasterRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidGetProductMasterResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSaveFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OneVerifyPrivilegeSubscribeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OneVerifyPrivilegeSubscribeResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterRequest;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m29143d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001eH'J\u0018\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00032\b\b\u0001\u0010\u0005\u001a\u00020!H'J\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00032\b\b\u0001\u0010\u0005\u001a\u00020$H'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\u0005\u001a\u00020'H'J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\u0005\u001a\u00020*H'J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\u00032\b\b\u0001\u0010\u0005\u001a\u00020-H'J\u0018\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u00032\b\b\u0001\u0010\u0005\u001a\u000200H'J\u0018\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00032\b\b\u0001\u0010\u0005\u001a\u000203H'J\u0018\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0005\u001a\u000206H'J\u0018\u00107\u001a\b\u0012\u0004\u0012\u0002080\u00032\b\b\u0001\u0010\u0005\u001a\u000209H'J\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\u00032\b\b\u0001\u0010\u0005\u001a\u00020<H'J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00032\b\b\u0001\u0010\u0005\u001a\u00020?H'J\u0018\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u00032\b\b\u0001\u0010\u0005\u001a\u00020BH'J\u0018\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u00032\b\b\u0001\u0010\u0005\u001a\u00020EH'J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00032\b\b\u0001\u0010\u0005\u001a\u00020HH'J\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00032\b\b\u0001\u0010\u0005\u001a\u00020KH'J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00032\b\b\u0001\u0010\u0005\u001a\u00020NH'¨\u0006O"}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/remote/oneDeviceSaleTrue/OneDeviceSaleTrueApi;", "", "checkPrivilege", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest;", "getCampaignInfo", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoRequest;", "getCampaignSaleType", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeRequest;", "getOneConsentNoticeDoc", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneConsentNoticeDocResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneConsentNoticeDocRequest;", "getOneExtraAdvanceMaster", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceMasterResponse;", "Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterRequest;", "getOneProductMaster", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidGetProductMasterResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidGetProductMasterRequest;", "getProductPrice", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceRequest;", "getPropositionRebate", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateRequest;", "oneDeviceSaleAuthorization", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleAuthorizationResponse;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleAuthorizationRequest;", "oneDeviceSaleValidateAllowProtection", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionRequest;", "oneDeviceSaleValidateBlackList", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperRequest;", "oneDeviceSaleValidateExtraAdvancePayment", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentRequest;", "oneDeviceSaleValidateStock", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaleValidateStockResponse;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleValidateStockRequest;", "oneGenerateForm", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;", "oneGetForm", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;", "oneGetPricePlans", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansRequest;", "oneGetPricePlansDetail", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailRequest;", "onePostpaidGetProposition", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionRequest;", "onePostpaidValidateConsentViaAPIGW", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWRequest;", "oneSaveOrderPreToPostTrueCompany", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/response/OneDeviceSaveOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleSaveOrderRequest;", "oneUpdateAppForm", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;", "oneValidateExistingCustomerScore", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreRequest;", "saveForms", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSaveFormsRequest;", "submitOrder", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/oneDeviceSaleTrue/request/OneDeviceSaleSubmitRequest;", "verifyPrivilegeSubscriber", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OneVerifyPrivilegeSubscribeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OneVerifyPrivilegeSubscribeRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.oneDeviceSaleTrue.OneDeviceSaleTrueApi */
/* loaded from: classes7.dex */
public interface OneDeviceSaleTrueApi {
    @POST("/onePostpaidRegisterT/checkPrivilege")
    @NotNull
    Single<OneCheckPrivilegeResponse> checkPrivilege(@Body @NotNull OneCheckPrivilegeRequest oneCheckPrivilegeRequest);

    @POST("/onePostpaidRegisterT/getCampaignInfo")
    @NotNull
    Single<OneCampaignInfoResponse> getCampaignInfo(@Body @NotNull OneCampaignInfoRequest oneCampaignInfoRequest);

    @POST("oneCommon/apigw/getCampaignSaleType")
    @NotNull
    Single<OneCampaignSaleTypeResponse> getCampaignSaleType(@Body @NotNull OneCampaignSaleTypeRequest oneCampaignSaleTypeRequest);

    @POST("oneCommon/apigw/consentNoticeDoc")
    @NotNull
    Single<OneConsentNoticeDocResponse> getOneConsentNoticeDoc(@Body @NotNull OneConsentNoticeDocRequest oneConsentNoticeDocRequest);

    @POST("oneDeviceSaleT/getExtraAdvanceMaster")
    @NotNull
    Single<OneExtraAdvanceMasterResponse> getOneExtraAdvanceMaster(@Body @NotNull GetExtraAdvanceMasterRequest getExtraAdvanceMasterRequest);

    @POST("oneCommon/getProductMaster")
    @NotNull
    Single<OnePostpaidGetProductMasterResponse> getOneProductMaster(@Body @NotNull OnePostpaidGetProductMasterRequest onePostpaidGetProductMasterRequest);

    @POST("oneCommon/apigw/getProductPrice")
    @NotNull
    Single<OneProductPriceResponse> getProductPrice(@Body @NotNull OneProductPriceRequest oneProductPriceRequest);

    @POST("oneCommon/apigw/getPropositionRebate")
    @NotNull
    Single<OnePropositionRebateResponse> getPropositionRebate(@Body @NotNull OnePropositionRebateRequest onePropositionRebateRequest);

    @POST("oneDeviceSaleT/authorization")
    @NotNull
    Single<OneDeviceSaleAuthorizationResponse> oneDeviceSaleAuthorization(@Body @NotNull OneDeviceSaleAuthorizationRequest oneDeviceSaleAuthorizationRequest);

    @POST("oneCommon/apigw/validateAllowProtection")
    @NotNull
    Single<OneValidateAllowProtectionResponse> oneDeviceSaleValidateAllowProtection(@Body @NotNull OneValidateAllowProtectionRequest oneValidateAllowProtectionRequest);

    @POST("oneCommon/apigw/validateBlacklist")
    @NotNull
    Single<OnePostpaidValidateBlacklist3OperResponse> oneDeviceSaleValidateBlackList(@Body @NotNull OnePostpaidValidateBlacklist3OperRequest onePostpaidValidateBlacklist3OperRequest);

    @POST("oneCommon/apigw/validateExtraAdvancePayment")
    @NotNull
    Single<OneValidateExtraAdvancePaymentResponse> oneDeviceSaleValidateExtraAdvancePayment(@Body @NotNull OneValidateExtraAdvancePaymentRequest oneValidateExtraAdvancePaymentRequest);

    @POST("oneCommon/apigw/validateStock")
    @NotNull
    Single<OneDeviceSaleValidateStockResponse> oneDeviceSaleValidateStock(@Body @NotNull OneDeviceSaleValidateStockRequest oneDeviceSaleValidateStockRequest);

    @POST("oneCommon/smartUI/generateForm")
    @NotNull
    Single<OneGenerateFormResponse> oneGenerateForm(@Body @NotNull OneGenerateFormRequest oneGenerateFormRequest);

    @POST("oneCommon/smartUI/getForms")
    @NotNull
    Single<OneGetFormsResponse> oneGetForm(@Body @NotNull OneGetFormsRequest oneGetFormsRequest);

    @POST("oneCommon/getPricePlans")
    @NotNull
    Single<OneGetPricePlansResponse> oneGetPricePlans(@Body @NotNull OneGetPricePlansRequest oneGetPricePlansRequest);

    @POST("oneCommon/getPricePlansDetail")
    @NotNull
    Single<OneGetPricePlansDetailResponse> oneGetPricePlansDetail(@Body @NotNull OneGetPricePlansDetailRequest oneGetPricePlansDetailRequest);

    @POST("oneCommon/smartUI/getProposition")
    @NotNull
    Single<OneGetPropositionResponse> onePostpaidGetProposition(@Body @NotNull OneGetPropositionRequest oneGetPropositionRequest);

    @POST("oneCommon/apigw/validateConsent")
    @NotNull
    Single<OnePostpaidValidateConsentViaAPIGWResponse> onePostpaidValidateConsentViaAPIGW(@Body @NotNull OnePostpaidValidateConsentViaAPIGWRequest onePostpaidValidateConsentViaAPIGWRequest);

    @POST("onePre2PostT/withDevice/saveOrder")
    @NotNull
    Single<OneDeviceSaveOrderResponse> oneSaveOrderPreToPostTrueCompany(@Body @NotNull OneDeviceSaleSaveOrderRequest oneDeviceSaleSaveOrderRequest);

    @POST("oneCommon/smartUI/updateAppForms")
    @NotNull
    Single<OneUpdateAppFormsResponse> oneUpdateAppForm(@Body @NotNull OneUpdateAppFormsRequest oneUpdateAppFormsRequest);

    @POST("oneCommon/apigw/validateExistingCustomerScore")
    @NotNull
    Single<OneValidateExistingCustomerScoreResponse> oneValidateExistingCustomerScore(@Body @NotNull OneValidateExistingCustomerScoreRequest oneValidateExistingCustomerScoreRequest);

    @POST("oneCommon/smartUI/saveForms")
    @NotNull
    Single<OneCommonResponse> saveForms(@Body @NotNull OnePre2PostSaveFormsRequest onePre2PostSaveFormsRequest);

    @POST("onePre2PostT/withDevice/submitOrder")
    @NotNull
    Single<OneSubmitOrderResponse> submitOrder(@Body @NotNull OneDeviceSaleSubmitRequest oneDeviceSaleSubmitRequest);

    @POST("onePre2PostT/verifyPrivilegeSubscriber")
    @NotNull
    Single<OneVerifyPrivilegeSubscribeResponse> verifyPrivilegeSubscriber(@Body @NotNull OneVerifyPrivilegeSubscribeRequest oneVerifyPrivilegeSubscribeRequest);
}