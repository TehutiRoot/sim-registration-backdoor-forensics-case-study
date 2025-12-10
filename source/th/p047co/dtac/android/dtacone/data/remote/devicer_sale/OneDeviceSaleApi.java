package th.p047co.dtac.android.dtacone.data.remote.devicer_sale;

import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneAuthDeviceSaleResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneBlacklistSharingConsentTemplateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheck1IDXDeviceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheckBlacklistSharingResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneCheckExternalBlacklistFlagResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneDeviceSaleCampaignResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneDeviceSaleVerifySubResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneExtraAdvanceMasterResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetDiscountResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetInputFieldResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetProductSaleOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneGetReceiptBase64Response;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneNewIMEIResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OnePaymentTypeListResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneSaleOrderDtacDeviceAddIMEIResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneSaveExtraPackageResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneSaveSalesOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneValidateOneContractDiscountResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneVerifyIDPinResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.CheckBlacklistSharingRequest;
import th.p047co.dtac.android.dtacone.model.blacklist.GetBlacklistSharingConsentTemplateRequest;
import th.p047co.dtac.android.dtacone.model.blacklist.GetExtraAdvanceMasterRequest;
import th.p047co.dtac.android.dtacone.model.blacklist.SaveBlacklistSharingConsentRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.AddIMEIOpenMarketRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.AddIMEIRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.Check1IDXDeviceRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.CheckExternalBlacklistFlagRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleCampaignRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.DeviceSaleVerifySubrRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GenDeviceContractRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetBundledItemsStockRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetDiscountRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetExtraAdvanceDetailRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetInputFieldRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetNewIMEIRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.GetProductSaleOrderRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.SaveExtraPackage;
import th.p047co.dtac.android.dtacone.model.device_sale.SaveSalesOrderRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.ValidateContractRequest;
import th.p047co.dtac.android.dtacone.model.device_sale.VerifyIDPinRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.GetAuthorizationByRtrRequest;

@Metadata(m28851d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001bH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001fH'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\"H'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u00032\b\b\u0001\u0010\u0005\u001a\u00020%H'J\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u00032\b\b\u0001\u0010\u0005\u001a\u00020(H'J\u0018\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0005\u001a\u00020+H'J\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00032\b\b\u0001\u0010\u0005\u001a\u00020.H'J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0003H'J\u000e\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0003H'J\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u000203H'J\u0018\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00032\b\b\u0001\u0010\u0005\u001a\u000206H'J\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u000208H'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010\u0005\u001a\u00020;H'J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020=0\u00032\b\b\u0001\u0010\u0005\u001a\u00020>H'J\u0018\u0010?\u001a\b\u0012\u0004\u0012\u00020@0\u00032\b\b\u0001\u0010\u0005\u001a\u00020AH'J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010\u0005\u001a\u00020DH'J\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020G0F2\b\b\u0001\u0010\u0005\u001a\u00020HH'¨\u0006I"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/devicer_sale/OneDeviceSaleApi;", "", "genOnePdfDeviceContract", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetReceiptBase64Response;", "request", "Lth/co/dtac/android/dtacone/model/device_sale/GenDeviceContractRequest;", "getOneAuthorizationDeviceSale", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneAuthDeviceSaleResponse;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/GetAuthorizationByRtrRequest;", "getOneBlacklistSharingConsentTemplate", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneBlacklistSharingConsentTemplateResponse;", "Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;", "getOneBundledItemsStock", "Lokhttp3/ResponseBody;", "Lth/co/dtac/android/dtacone/model/device_sale/GetBundledItemsStockRequest;", "getOneCampaign", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneDeviceSaleCampaignResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleCampaignRequest;", "getOneDiscount", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetDiscountResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/GetDiscountRequest;", "getOneExtraAdvanceDetail", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceDetailResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/GetExtraAdvanceDetailRequest;", "getOneExtraAdvanceMaster", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneExtraAdvanceMasterResponse;", "Lth/co/dtac/android/dtacone/model/blacklist/GetExtraAdvanceMasterRequest;", "getOneExtraAdvanceMasterT", "getOneInputFieldCampaign", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetInputFieldResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/GetInputFieldRequest;", "getOneProductSaleOrder", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneGetProductSaleOrderResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/GetProductSaleOrderRequest;", "oneCheck1IDXDevice", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheck1IDXDeviceResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/Check1IDXDeviceRequest;", "oneCheckBlacklistSharing", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheckBlacklistSharingResponse;", "Lth/co/dtac/android/dtacone/model/blacklist/CheckBlacklistSharingRequest;", "oneCheckExternalBlacklistFlag", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneCheckExternalBlacklistFlagResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/CheckExternalBlacklistFlagRequest;", "oneDeviceSaleVerifySubscriber", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneDeviceSaleVerifySubResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/DeviceSaleVerifySubrRequest;", "oneListCampaignPaymentTypeAdditional", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OnePaymentTypeListResponse;", "oneListCampaignPaymentTypeMain", "onePostpaidOpenMarketAddIMEI", "Lth/co/dtac/android/dtacone/model/device_sale/AddIMEIOpenMarketRequest;", "oneSaleOrderDtacDeviceAddIMEI", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneSaleOrderDtacDeviceAddIMEIResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/AddIMEIRequest;", "oneSaveConsentTemplate", "Lth/co/dtac/android/dtacone/model/blacklist/SaveBlacklistSharingConsentRequest;", "oneSaveExtraPackage", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneSaveExtraPackageResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/SaveExtraPackage;", "oneSaveSubmitSalesOrder", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneSaveSalesOrderResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/SaveSalesOrderRequest;", "oneValidateContractDiscount", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneValidateOneContractDiscountResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/ValidateContractRequest;", "oneValidateHardwareNumber", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneNewIMEIResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/GetNewIMEIRequest;", "oneVerifyIDPin", "Lio/reactivex/Observable;", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneVerifyIDPinResponse;", "Lth/co/dtac/android/dtacone/model/device_sale/VerifyIDPinRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.devicer_sale.OneDeviceSaleApi */
/* loaded from: classes7.dex */
public interface OneDeviceSaleApi {
    @POST("oneDeviceSale/deviceContract")
    @NotNull
    Single<OneGetReceiptBase64Response> genOnePdfDeviceContract(@Body @NotNull GenDeviceContractRequest genDeviceContractRequest);

    @POST("oneDeviceSale/authorization")
    @NotNull
    Single<OneAuthDeviceSaleResponse> getOneAuthorizationDeviceSale(@Body @NotNull GetAuthorizationByRtrRequest getAuthorizationByRtrRequest);

    @POST("oneDeviceSale/blacklistSharing/template")
    @NotNull
    Single<OneBlacklistSharingConsentTemplateResponse> getOneBlacklistSharingConsentTemplate(@Body @NotNull GetBlacklistSharingConsentTemplateRequest getBlacklistSharingConsentTemplateRequest);

    @POST("oneDeviceSale/getBundledItemsStock")
    @NotNull
    Single<ResponseBody> getOneBundledItemsStock(@Body @NotNull GetBundledItemsStockRequest getBundledItemsStockRequest);

    @POST("oneDeviceSale/campaign")
    @NotNull
    Single<OneDeviceSaleCampaignResponse> getOneCampaign(@Body @NotNull DeviceSaleCampaignRequest deviceSaleCampaignRequest);

    @POST("oneDeviceSale/discount")
    @NotNull
    Single<OneGetDiscountResponse> getOneDiscount(@Body @NotNull GetDiscountRequest getDiscountRequest);

    @POST("oneDeviceSale/blacklistSharing/getExtraAdvanceDetail")
    @NotNull
    Single<OneExtraAdvanceDetailResponse> getOneExtraAdvanceDetail(@Body @NotNull GetExtraAdvanceDetailRequest getExtraAdvanceDetailRequest);

    @POST("oneDeviceSale/blacklistSharing/getExtraAdvanceMaster")
    @NotNull
    Single<OneExtraAdvanceMasterResponse> getOneExtraAdvanceMaster(@Body @NotNull GetExtraAdvanceMasterRequest getExtraAdvanceMasterRequest);

    @POST("oneDeviceSaleT/getExtraAdvanceMaster")
    @NotNull
    Single<OneExtraAdvanceMasterResponse> getOneExtraAdvanceMasterT(@Body @NotNull GetExtraAdvanceMasterRequest getExtraAdvanceMasterRequest);

    @POST("oneDeviceSale/fields")
    @NotNull
    Single<OneGetInputFieldResponse> getOneInputFieldCampaign(@Body @NotNull GetInputFieldRequest getInputFieldRequest);

    @POST("oneDeviceSale/product")
    @NotNull
    Single<OneGetProductSaleOrderResponse> getOneProductSaleOrder(@Body @NotNull GetProductSaleOrderRequest getProductSaleOrderRequest);

    @POST("oneDeviceSale/V2/check1IDXDevice")
    @NotNull
    Single<OneCheck1IDXDeviceResponse> oneCheck1IDXDevice(@Body @NotNull Check1IDXDeviceRequest check1IDXDeviceRequest);

    @POST("oneDeviceSale/blacklistSharing/check/otherOperator")
    @NotNull
    Single<OneCheckBlacklistSharingResponse> oneCheckBlacklistSharing(@Body @NotNull CheckBlacklistSharingRequest checkBlacklistSharingRequest);

    @POST("oneDeviceSale/externalBlacklistFlag")
    @NotNull
    Single<OneCheckExternalBlacklistFlagResponse> oneCheckExternalBlacklistFlag(@Body @NotNull CheckExternalBlacklistFlagRequest checkExternalBlacklistFlagRequest);

    @POST("oneDeviceSale/verify/subscriber")
    @NotNull
    Single<OneDeviceSaleVerifySubResponse> oneDeviceSaleVerifySubscriber(@Body @NotNull DeviceSaleVerifySubrRequest deviceSaleVerifySubrRequest);

    @GET("oneDeviceSale/campaignPaymentType/additional")
    @NotNull
    Single<OnePaymentTypeListResponse> oneListCampaignPaymentTypeAdditional();

    @GET("oneDeviceSale/campaignPaymentType/main")
    @NotNull
    Single<OnePaymentTypeListResponse> oneListCampaignPaymentTypeMain();

    @POST("oneDeviceSale/openMarket/addIMEI")
    @NotNull
    Single<ResponseBody> onePostpaidOpenMarketAddIMEI(@Body @NotNull AddIMEIOpenMarketRequest addIMEIOpenMarketRequest);

    @POST("oneDeviceSale/dtacDevice/save")
    @NotNull
    Single<OneSaleOrderDtacDeviceAddIMEIResponse> oneSaleOrderDtacDeviceAddIMEI(@Body @NotNull AddIMEIRequest addIMEIRequest);

    @POST("oneDeviceSale/blacklistSharing/save")
    @NotNull
    Single<ResponseBody> oneSaveConsentTemplate(@Body @NotNull SaveBlacklistSharingConsentRequest saveBlacklistSharingConsentRequest);

    @POST("oneDeviceSale/package/save/extraPackage")
    @NotNull
    Single<OneSaveExtraPackageResponse> oneSaveExtraPackage(@Body @NotNull SaveExtraPackage saveExtraPackage);

    @POST("oneDeviceSale/submit")
    @NotNull
    Single<OneSaveSalesOrderResponse> oneSaveSubmitSalesOrder(@Body @NotNull SaveSalesOrderRequest saveSalesOrderRequest);

    @POST("oneDeviceSale/validateContract")
    @NotNull
    Single<OneValidateOneContractDiscountResponse> oneValidateContractDiscount(@Body @NotNull ValidateContractRequest validateContractRequest);

    @POST("oneDeviceSale/validate/hardwareNumber")
    @NotNull
    Single<OneNewIMEIResponse> oneValidateHardwareNumber(@Body @NotNull GetNewIMEIRequest getNewIMEIRequest);

    @POST("oneDeviceSale/pin/verifyIDPin")
    @NotNull
    Observable<OneVerifyIDPinResponse> oneVerifyIDPin(@Body @NotNull VerifyIDPinRequest verifyIDPinRequest);
}
