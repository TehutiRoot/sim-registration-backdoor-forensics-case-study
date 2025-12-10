package th.p047co.dtac.android.dtacone.data.remote.postpaid;

import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPricePlansResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OneGetPropositionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneSaveFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneSaveFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCancelAndCheckNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCancelAndCheckNumberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckAndReserveNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneConsentNoticeDocRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneConsentNoticeDocResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCustomerPreverifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCustomerPreverifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidGetProductMasterRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidGetProductMasterResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePostpaidValidateBlacklist3OperResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePreverifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePreverifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneProductPriceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneReserveAllocateMsisdnResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateAllowProtectionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExtraAdvancePaymentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateStockRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateStockResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneVerifyAndGenAutoApproveCodeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneVerifyAndGenAutoApproveCodeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentResponse;

@Metadata(m29143d1 = {"\u0000¤\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\bH'J\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000bH'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000eH'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0011H'J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0014H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0017H'J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001aH'J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001dH'J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020 H'J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00032\b\b\u0001\u0010\u0005\u001a\u00020#H'J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u00032\b\b\u0001\u0010\u0005\u001a\u00020&H'J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020)H'J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020,H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\u0005\u001a\u00020/H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\u0005\u001a\u000202H'J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010\u0005\u001a\u000205H'J\u0018\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\u0005\u001a\u000208H'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020;H'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0005\u001a\u00020>H'J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020AH'J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020DH'J\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00032\b\b\u0001\u0010\u0005\u001a\u00020GH'J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\u00032\b\b\u0001\u0010\u0005\u001a\u00020JH'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u00032\b\b\u0001\u0010\u0005\u001a\u00020MH'J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020O0\u00032\b\b\u0001\u0010\u0005\u001a\u00020PH'J\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00032\b\b\u0001\u0010\u0005\u001a\u00020SH'J\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020U0\u00032\b\b\u0001\u0010\u0005\u001a\u00020VH'¨\u0006W"}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/remote/postpaid/OnePostpaidApi;", "", "cancelAndCheckNumber", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCancelAndCheckNumberResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCancelAndCheckNumberRequest;", "checkNumber", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckNumberRequest;", "checkPrivilege", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeRequest;", "customerPreverify", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCustomerPreverifyRequest;", "getCampaignInfo", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoRequest;", "getCampaignSaleType", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeRequest;", "getOneConsentNoticeDoc", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneConsentNoticeDocResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneConsentNoticeDocRequest;", "getOneProductMaster", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidGetProductMasterResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidGetProductMasterRequest;", "getProductPrice", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneProductPriceRequest;", "getPropositionRebate", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateRequest;", "oneGenerateForm", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;", "oneGetForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;", "oneGetPricePlans", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansRequest;", "oneGetPricePlansDetail", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPricePlansDetailRequest;", "onePostpaidGetProposition", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OneGetPropositionRequest;", "onePostpaidValidateConsent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentRequest;", "onePostpaidValidateConsentViaAPIGW", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWRequest;", "oneSaveForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneSaveFormsRequest;", "oneUpdateAppForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;", "oneValidate3Oper", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePostpaidValidateBlacklist3OperRequest;", "oneValidateExistingCustomerScore", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreRequest;", "preverify", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePreverifyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePreverifyRequest;", "reserveAllocateMsisdn", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneReserveAllocateMsisdnResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckAndReserveNumberRequest;", "submitOrder", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneSubmitOrderRequest;", "validateAllowProtection", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateAllowProtectionRequest;", "validateExtraAdvancePayment", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExtraAdvancePaymentRequest;", "validateStockTrue", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateStockResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateStockRequest;", "verifyAndGenAutoApproveCode", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneVerifyAndGenAutoApproveCodeRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.postpaid.OnePostpaidApi */
/* loaded from: classes7.dex */
public interface OnePostpaidApi {
    @POST("/onePostpaidRegisterT/cancelAndCheckNumber")
    @NotNull
    Single<OneCancelAndCheckNumberResponse> cancelAndCheckNumber(@Body @NotNull OneCancelAndCheckNumberRequest oneCancelAndCheckNumberRequest);

    @POST("/onePostpaidRegisterT/checkNumber")
    @NotNull
    Single<OneCancelAndCheckNumberResponse> checkNumber(@Body @NotNull OneCheckNumberRequest oneCheckNumberRequest);

    @POST("/onePostpaidRegisterT/checkPrivilege")
    @NotNull
    Single<OneCheckPrivilegeResponse> checkPrivilege(@Body @NotNull OneCheckPrivilegeRequest oneCheckPrivilegeRequest);

    @POST("/onePostpaidRegisterT/customerPreverify")
    @NotNull
    Single<OneCustomerPreverifyResponse> customerPreverify(@Body @NotNull OneCustomerPreverifyRequest oneCustomerPreverifyRequest);

    @POST("/onePostpaidRegisterT/getCampaignInfo")
    @NotNull
    Single<OneCampaignInfoResponse> getCampaignInfo(@Body @NotNull OneCampaignInfoRequest oneCampaignInfoRequest);

    @POST("oneCommon/apigw/getCampaignSaleType")
    @NotNull
    Single<OneCampaignSaleTypeResponse> getCampaignSaleType(@Body @NotNull OneCampaignSaleTypeRequest oneCampaignSaleTypeRequest);

    @POST("oneCommon/apigw/consentNoticeDoc")
    @NotNull
    Single<OneConsentNoticeDocResponse> getOneConsentNoticeDoc(@Body @NotNull OneConsentNoticeDocRequest oneConsentNoticeDocRequest);

    @POST("oneCommon/getProductMaster")
    @NotNull
    Single<OnePostpaidGetProductMasterResponse> getOneProductMaster(@Body @NotNull OnePostpaidGetProductMasterRequest onePostpaidGetProductMasterRequest);

    @POST("oneCommon/apigw/getProductPrice")
    @NotNull
    Single<OneProductPriceResponse> getProductPrice(@Body @NotNull OneProductPriceRequest oneProductPriceRequest);

    @POST("oneCommon/apigw/getPropositionRebate")
    @NotNull
    Single<OnePropositionRebateResponse> getPropositionRebate(@Body @NotNull OnePropositionRebateRequest onePropositionRebateRequest);

    @POST("oneCommon/smartUI/generateForm")
    @NotNull
    Single<OneGenerateFormResponse> oneGenerateForm(@Body @NotNull OneGenerateFormRequest oneGenerateFormRequest);

    @POST("oneCommon/smartUI/getForms")
    @NotNull
    Single<OneGetFormsResponse> oneGetForms(@Body @NotNull OneGetFormsRequest oneGetFormsRequest);

    @POST("oneCommon/getPricePlans")
    @NotNull
    Single<OneGetPricePlansResponse> oneGetPricePlans(@Body @NotNull OneGetPricePlansRequest oneGetPricePlansRequest);

    @POST("oneCommon/getPricePlansDetail")
    @NotNull
    Single<OneGetPricePlansDetailResponse> oneGetPricePlansDetail(@Body @NotNull OneGetPricePlansDetailRequest oneGetPricePlansDetailRequest);

    @POST("oneCommon/smartUI/getProposition")
    @NotNull
    Single<OneGetPropositionResponse> onePostpaidGetProposition(@Body @NotNull OneGetPropositionRequest oneGetPropositionRequest);

    @POST("oneConsentT/validateConsentViaSmui")
    @NotNull
    Single<OnePostpaidValidateConsentResponse> onePostpaidValidateConsent(@Body @NotNull OnePostpaidValidateConsentRequest onePostpaidValidateConsentRequest);

    @POST("oneCommon/apigw/validateConsent")
    @NotNull
    Single<OnePostpaidValidateConsentViaAPIGWResponse> onePostpaidValidateConsentViaAPIGW(@Body @NotNull OnePostpaidValidateConsentViaAPIGWRequest onePostpaidValidateConsentViaAPIGWRequest);

    @POST("oneCommon/smartUI/saveForms")
    @NotNull
    Single<OneSaveFormsResponse> oneSaveForms(@Body @NotNull OneSaveFormsRequest oneSaveFormsRequest);

    @POST("oneCommon/smartUI/updateAppForms")
    @NotNull
    Single<OneUpdateAppFormsResponse> oneUpdateAppForms(@Body @NotNull OneUpdateAppFormsRequest oneUpdateAppFormsRequest);

    @POST("oneCommon/apigw/validateBlacklist")
    @NotNull
    Single<OnePostpaidValidateBlacklist3OperResponse> oneValidate3Oper(@Body @NotNull OnePostpaidValidateBlacklist3OperRequest onePostpaidValidateBlacklist3OperRequest);

    @POST("oneCommon/apigw/validateExistingCustomerScore")
    @NotNull
    Single<OneValidateExistingCustomerScoreResponse> oneValidateExistingCustomerScore(@Body @NotNull OneValidateExistingCustomerScoreRequest oneValidateExistingCustomerScoreRequest);

    @POST("/oneCustomerProfileT/preverify")
    @NotNull
    Single<OnePreverifyResponse> preverify(@Body @NotNull OnePreverifyRequest onePreverifyRequest);

    @POST("/onePostpaidRegisterT/reserveAllocateMsisdn")
    @NotNull
    Single<OneReserveAllocateMsisdnResponse> reserveAllocateMsisdn(@Body @NotNull OneCheckAndReserveNumberRequest oneCheckAndReserveNumberRequest);

    @POST("/onePostpaidRegisterT/submitOrder")
    @NotNull
    Single<OneSubmitOrderResponse> submitOrder(@Body @NotNull OneSubmitOrderRequest oneSubmitOrderRequest);

    @POST("oneCommon/apigw/validateAllowProtection")
    @NotNull
    Single<OneValidateAllowProtectionResponse> validateAllowProtection(@Body @NotNull OneValidateAllowProtectionRequest oneValidateAllowProtectionRequest);

    @POST("oneCommon/apigw/validateExtraAdvancePayment")
    @NotNull
    Single<OneValidateExtraAdvancePaymentResponse> validateExtraAdvancePayment(@Body @NotNull OneValidateExtraAdvancePaymentRequest oneValidateExtraAdvancePaymentRequest);

    @POST("oneCommon/apigw/validateStock")
    @NotNull
    Single<OneValidateStockResponse> validateStockTrue(@Body @NotNull OneValidateStockRequest oneValidateStockRequest);

    @POST("/onePostpaidRegisterT/verifyAndGenAutoApproveCode")
    @NotNull
    Single<OneVerifyAndGenAutoApproveCodeResponse> verifyAndGenAutoApproveCode(@Body @NotNull OneVerifyAndGenAutoApproveCodeRequest oneVerifyAndGenAutoApproveCodeRequest);
}