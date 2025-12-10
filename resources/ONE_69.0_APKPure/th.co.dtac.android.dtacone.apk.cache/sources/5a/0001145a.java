package th.p047co.dtac.android.dtacone.data.remote.oneNadOutbound;

import io.reactivex.Single;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundBillingRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundCallCustomerRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundCallHistoryRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundCustomerInfoRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundDeleteRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundInvoiceRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.request.OneNadOutboundSubmitRequest;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundBillingResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCallCustomerResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCallHistoryResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundCustomerInfoResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundDeleteResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundInvoiceResponse;
import th.p047co.dtac.android.dtacone.model.appOne.nadOutbound.response.OneNadOutboundSubmitResponse;

@Metadata(m29143d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/remote/oneNadOutbound/OneNadOutboundApi;", "", "getOneNadOutboundCustomerInfo", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCustomerInfoResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundCustomerInfoRequest;", "getOneNadOutboundInvoice", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundInvoiceResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundInvoiceRequest;", "getOneNadOutboundReminderList", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundBillingResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundBillingRequest;", "oneNadOutboundCallCustomer", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCallCustomerResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundCallCustomerRequest;", "oneNadOutboundCallHistory", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundCallHistoryResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundCallHistoryRequest;", "oneNadOutboundDelete", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundDeleteResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundDeleteRequest;", "oneNadOutboundSubmit", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/response/OneNadOutboundSubmitResponse;", "Lth/co/dtac/android/dtacone/model/appOne/nadOutbound/request/OneNadOutboundSubmitRequest;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.oneNadOutbound.OneNadOutboundApi */
/* loaded from: classes7.dex */
public interface OneNadOutboundApi {
    @POST("oneCustomerProfileT/billing/customerInfo")
    @NotNull
    Single<OneNadOutboundCustomerInfoResponse> getOneNadOutboundCustomerInfo(@Body @NotNull OneNadOutboundCustomerInfoRequest oneNadOutboundCustomerInfoRequest);

    @POST("oneCustomerProfileT/billing/invoice")
    @NotNull
    Single<OneNadOutboundInvoiceResponse> getOneNadOutboundInvoice(@Body @NotNull OneNadOutboundInvoiceRequest oneNadOutboundInvoiceRequest);

    @POST("oneCustomerProfileT/billing/reminders")
    @NotNull
    Single<OneNadOutboundBillingResponse> getOneNadOutboundReminderList(@Body @NotNull OneNadOutboundBillingRequest oneNadOutboundBillingRequest);

    @POST("oneCustomerProfileT/billing/call")
    @NotNull
    Single<OneNadOutboundCallCustomerResponse> oneNadOutboundCallCustomer(@Body @NotNull OneNadOutboundCallCustomerRequest oneNadOutboundCallCustomerRequest);

    @POST("oneCustomerProfileT/billing/callHistory")
    @NotNull
    Single<OneNadOutboundCallHistoryResponse> oneNadOutboundCallHistory(@Body @NotNull OneNadOutboundCallHistoryRequest oneNadOutboundCallHistoryRequest);

    @POST("oneCustomerProfileT/billing/delete")
    @NotNull
    Single<OneNadOutboundDeleteResponse> oneNadOutboundDelete(@Body @NotNull OneNadOutboundDeleteRequest oneNadOutboundDeleteRequest);

    @POST("oneCustomerProfileT/billing/submit")
    @NotNull
    Single<OneNadOutboundSubmitResponse> oneNadOutboundSubmit(@Body @NotNull OneNadOutboundSubmitRequest oneNadOutboundSubmitRequest);
}