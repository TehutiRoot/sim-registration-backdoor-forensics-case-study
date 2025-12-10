package th.p047co.dtac.android.dtacone.data.remote.oneTol;

import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import th.p047co.dtac.android.dtacone.model.appOne.common.true_company.OneCommonTrueLocationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneUpdateAppFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.device.DeviceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.discount.DiscountResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpAvailableTelNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpAvailableTelNumberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpMarketingPackageRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpMarketingPackageResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpPackagePriceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpPackagePriceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpReserveServiceNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpReserveServiceNumberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisAuthenticationRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisAuthenticationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.gis.GisStatusOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.inputId.IdCardValidationRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.inputId.IdCardValidationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.CallVerifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.CallVerifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.ReserveServiceNumbRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.ReserveServiceNumbResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReasonRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReasonResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.MarketingResponse;
import th.p047co.dtac.android.dtacone.model.appOne.tol.wsso.WssoRequest;
import th.p047co.dtac.android.dtacone.model.appOne.tol.wsso.WssoResponse;

@Metadata(m28851d1 = {"\u0000\u0094\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u0015H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00182\b\b\u0001\u0010\u0004\u001a\u00020\u0019H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u001c2\b\b\u0001\u0010\u0004\u001a\u00020\u001dH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020 2\b\b\u0001\u0010\u0004\u001a\u00020!H§@ø\u0001\u0000¢\u0006\u0002\u0010\"J\u001b\u0010#\u001a\u00020$2\b\b\u0001\u0010\u0004\u001a\u00020%H§@ø\u0001\u0000¢\u0006\u0002\u0010&J\u001b\u0010'\u001a\u00020(2\b\b\u0001\u0010\u0004\u001a\u00020)H§@ø\u0001\u0000¢\u0006\u0002\u0010*J\u001b\u0010+\u001a\u00020,2\b\b\u0001\u0010\u0004\u001a\u00020-H§@ø\u0001\u0000¢\u0006\u0002\u0010.J\u001b\u0010/\u001a\u0002002\b\b\u0001\u0010\u0004\u001a\u000201H§@ø\u0001\u0000¢\u0006\u0002\u00102J\u001b\u00103\u001a\u0002042\b\b\u0001\u0010\u0004\u001a\u000205H§@ø\u0001\u0000¢\u0006\u0002\u00106J\u0018\u00107\u001a\b\u0012\u0004\u0012\u000209082\b\b\u0001\u0010\u0004\u001a\u00020:H'J\u001b\u0010;\u001a\u00020<2\b\b\u0001\u0010\u0004\u001a\u00020=H§@ø\u0001\u0000¢\u0006\u0002\u0010>J\u001b\u0010?\u001a\u00020@2\b\b\u0001\u0010\u0004\u001a\u00020AH§@ø\u0001\u0000¢\u0006\u0002\u0010BJ\u001b\u0010C\u001a\u00020D2\b\b\u0001\u0010\u0004\u001a\u00020EH§@ø\u0001\u0000¢\u0006\u0002\u0010FJ\u001b\u0010G\u001a\u00020H2\b\b\u0001\u0010\u0004\u001a\u00020IH§@ø\u0001\u0000¢\u0006\u0002\u0010JJ\u001b\u0010K\u001a\u00020L2\b\b\u0001\u0010\u0004\u001a\u00020MH§@ø\u0001\u0000¢\u0006\u0002\u0010NJ\u001b\u0010O\u001a\u00020P2\b\b\u0001\u0010\u0004\u001a\u00020QH§@ø\u0001\u0000¢\u0006\u0002\u0010RJ\u001b\u0010S\u001a\u00020P2\b\b\u0001\u0010\u0004\u001a\u00020QH§@ø\u0001\u0000¢\u0006\u0002\u0010RJ\u001b\u0010T\u001a\u00020U2\b\b\u0001\u0010\u0004\u001a\u00020VH§@ø\u0001\u0000¢\u0006\u0002\u0010WJ\u001b\u0010X\u001a\u00020Y2\b\b\u0001\u0010\u0004\u001a\u00020ZH§@ø\u0001\u0000¢\u0006\u0002\u0010[\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/oneTol/OneTolApi;", "", "generateForm", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGenerateFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneConsentDataT", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "consentDomain", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneTrueLocation", "Lth/co/dtac/android/dtacone/model/appOne/common/true_company/OneCommonTrueLocationResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postValidateConsent", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolAppointment", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolCallVerify", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/CallVerifyRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolCampaignList", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolCampaignWaiveReason", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReasonResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReasonRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignWaiveReasonRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolDevice", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/device/DeviceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolDiscount", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/discount/DiscountRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolFlpMktPackage", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpMarketingPackageResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpMarketingPackageRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpMarketingPackageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolFlpPackagePrice", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpPackagePriceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpPackagePriceRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpPackagePriceRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolGetAvailableTelNumber", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpAvailableTelNumberResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpAvailableTelNumberRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpAvailableTelNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolGetWssoList", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/wsso/WssoRequest;", "tolGisAuthentication", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisAuthenticationResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisAuthenticationRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisAuthenticationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolGisStatusOrder", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/gis/GisStatusOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolMarketingList", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/MarketingRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolReserveServiceNumb", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/ReserveServiceNumbResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/ReserveServiceNumbRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/ReserveServiceNumbRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolReserveServiceNumber", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpReserveServiceNumberResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpReserveServiceNumberRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpReserveServiceNumberRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolSaveOrder", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tolSubmitOrder", "tolValidation", "Lth/co/dtac/android/dtacone/model/appOne/tol/inputId/IdCardValidationResponse;", "Lth/co/dtac/android/dtacone/model/appOne/tol/inputId/IdCardValidationRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/tol/inputId/IdCardValidationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAppForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneUpdateAppFormsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.oneTol.OneTolApi */
/* loaded from: classes7.dex */
public interface OneTolApi {
    @POST("oneCommon/smartUI/generateForm")
    @Nullable
    Object generateForm(@Body @NotNull OneGenerateFormRequest oneGenerateFormRequest, @NotNull Continuation<? super OneGenerateFormResponse> continuation);

    @GET("oneConsentT/consent")
    @Nullable
    Object getOneConsentDataT(@NotNull @Query("consentDomain") String str, @NotNull Continuation<? super OneConsentDataTmnResponse> continuation);

    @GET("oneCommon/getLocation")
    @Nullable
    Object getOneTrueLocation(@NotNull Continuation<? super OneCommonTrueLocationResponse> continuation);

    @POST("oneConsentT/validateConsentViaSmui")
    @Nullable
    Object postValidateConsent(@Body @NotNull OnePostpaidValidateConsentRequest onePostpaidValidateConsentRequest, @NotNull Continuation<? super OnePostpaidValidateConsentResponse> continuation);

    @POST("oneTol/tolAppointment")
    @Nullable
    Object tolAppointment(@Body @NotNull AppointmentRequest appointmentRequest, @NotNull Continuation<? super AppointmentResponse> continuation);

    @POST("oneTol/tolCallVerify")
    @Nullable
    Object tolCallVerify(@Body @NotNull CallVerifyRequest callVerifyRequest, @NotNull Continuation<? super CallVerifyResponse> continuation);

    @Headers({"READ_TIMEOUT:300"})
    @POST("oneTol/tolCampaignListT")
    @Nullable
    Object tolCampaignList(@Body @NotNull CampaignRequest campaignRequest, @NotNull Continuation<? super CampaignResponse> continuation);

    @POST("oneTol/tolCampaignWaiveReasonT")
    @Nullable
    Object tolCampaignWaiveReason(@Body @NotNull CampaignWaiveReasonRequest campaignWaiveReasonRequest, @NotNull Continuation<? super CampaignWaiveReasonResponse> continuation);

    @POST("oneTol/tolDevice")
    @Nullable
    Object tolDevice(@Body @NotNull DeviceRequest deviceRequest, @NotNull Continuation<? super DeviceResponse> continuation);

    @POST("oneTol/tolDiscount")
    @Nullable
    Object tolDiscount(@Body @NotNull DiscountRequest discountRequest, @NotNull Continuation<? super DiscountResponse> continuation);

    @POST("oneTol/tolFlpMktPackage")
    @Nullable
    Object tolFlpMktPackage(@Body @NotNull FlpMarketingPackageRequest flpMarketingPackageRequest, @NotNull Continuation<? super FlpMarketingPackageResponse> continuation);

    @POST("oneTol/tolFlpPackagePrice")
    @Nullable
    Object tolFlpPackagePrice(@Body @NotNull FlpPackagePriceRequest flpPackagePriceRequest, @NotNull Continuation<? super FlpPackagePriceResponse> continuation);

    @POST("oneTol/tolGetAvailableTelNum")
    @Nullable
    Object tolGetAvailableTelNumber(@Body @NotNull FlpAvailableTelNumberRequest flpAvailableTelNumberRequest, @NotNull Continuation<? super FlpAvailableTelNumberResponse> continuation);

    @POST("oneTol/tolGetWssoList")
    @NotNull
    Single<WssoResponse> tolGetWssoList(@Body @NotNull WssoRequest wssoRequest);

    @POST("oneTol/tolGisAuthentication")
    @Nullable
    Object tolGisAuthentication(@Body @NotNull GisAuthenticationRequest gisAuthenticationRequest, @NotNull Continuation<? super GisAuthenticationResponse> continuation);

    @POST("oneTol/tolGisStatusOrder")
    @Nullable
    Object tolGisStatusOrder(@Body @NotNull GisStatusOrderRequest gisStatusOrderRequest, @NotNull Continuation<? super GisStatusOrderResponse> continuation);

    @POST("oneTol/tolMarketingListDetailsT")
    @Nullable
    Object tolMarketingList(@Body @NotNull MarketingRequest marketingRequest, @NotNull Continuation<? super MarketingResponse> continuation);

    @POST("oneTol/tolReserveServiceNumb")
    @Nullable
    Object tolReserveServiceNumb(@Body @NotNull ReserveServiceNumbRequest reserveServiceNumbRequest, @NotNull Continuation<? super ReserveServiceNumbResponse> continuation);

    @POST("oneTol/tolReserveServiceNumb")
    @Nullable
    Object tolReserveServiceNumber(@Body @NotNull FlpReserveServiceNumberRequest flpReserveServiceNumberRequest, @NotNull Continuation<? super FlpReserveServiceNumberResponse> continuation);

    @POST("oneTol/tolSaveOrder")
    @Nullable
    Object tolSaveOrder(@Body @NotNull SaveOrderRequest saveOrderRequest, @NotNull Continuation<? super SaveOrderResponse> continuation);

    @POST("oneTol/tolSubmitOrder")
    @Nullable
    Object tolSubmitOrder(@Body @NotNull SaveOrderRequest saveOrderRequest, @NotNull Continuation<? super SaveOrderResponse> continuation);

    @POST("oneTol/tolValidation")
    @Nullable
    Object tolValidation(@Body @NotNull IdCardValidationRequest idCardValidationRequest, @NotNull Continuation<? super IdCardValidationResponse> continuation);

    @POST("oneCommon/smartUI/updateAppForms")
    @Nullable
    Object updateAppForms(@Body @NotNull OneUpdateAppFormsRequest oneUpdateAppFormsRequest, @NotNull Continuation<? super OneUpdateAppFormsResponse> continuation);
}
