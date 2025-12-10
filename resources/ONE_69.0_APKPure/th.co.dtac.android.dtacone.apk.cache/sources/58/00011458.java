package th.p047co.dtac.android.dtacone.data.remote.oneConsentAndESign;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.device_sale.OneBlacklistSharingConsentTemplateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.blacklist.GetBlacklistSharingConsentTemplateRequest;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneConsentNoticeDocResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneUpdateAppFormRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneVerifyQrCodeRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneConsentNoticeDocRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneSummitUnityResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneVerifyQrCodeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.VerifyQrCodeData;

@Metadata(m29143d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0004\u001a\u00020\tH§@ø\u0001\u0000¢\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0004\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\r\u001a\u00020\u000eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001b\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0004\u001a\u00020\u0018H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u0004\u001a\u00020\u001cH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u001f2\b\b\u0001\u0010\u0004\u001a\u00020 H§@ø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, m29142d2 = {"Lth/co/dtac/android/dtacone/data/remote/oneConsentAndESign/OneConsentAndESignApi;", "", "blackListConsentD", "Lth/co/dtac/android/dtacone/model/appOne/device_sale/OneBlacklistSharingConsentTemplateResponse;", "request", "Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;", "(Lth/co/dtac/android/dtacone/model/blacklist/GetBlacklistSharingConsentTemplateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "blackListConsentT", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneConsentNoticeDocRequest;", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneConsentNoticeDocRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConsent", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentResponse;", "consentDomain", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getForms", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;", "(Lth/co/dtac/android/dtacone/model/appOne/postpaid/forms/OneGetFormsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOneConsentDataTMN", "Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "submitPhotoConsent", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneSummitUnityResponse;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/VerifyQrCodeData;", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/VerifyQrCodeData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAppForm", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneUpdateAppFormRequest;", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneUpdateAppFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyQrCode", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/OneVerifyQrCodeResponse;", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneVerifyQrCodeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.oneConsentAndESign.OneConsentAndESignApi */
/* loaded from: classes7.dex */
public interface OneConsentAndESignApi {
    @POST("oneDeviceSale/blacklistSharing/template")
    @Nullable
    Object blackListConsentD(@Body @NotNull GetBlacklistSharingConsentTemplateRequest getBlacklistSharingConsentTemplateRequest, @NotNull Continuation<? super OneBlacklistSharingConsentTemplateResponse> continuation);

    @POST("oneCommon/apigw/consentNoticeDoc")
    @Nullable
    Object blackListConsentT(@Body @NotNull OneConsentNoticeDocRequest oneConsentNoticeDocRequest, @NotNull Continuation<? super OneConsentNoticeDocResponse> continuation);

    @GET("/oneConsent/consent")
    @Nullable
    Object getConsent(@NotNull @Query("consentDomain") String str, @NotNull Continuation<? super OneConsentResponse> continuation);

    @POST("oneCommon/smartUI/getForms")
    @Nullable
    Object getForms(@Body @NotNull OneGetFormsRequest oneGetFormsRequest, @NotNull Continuation<? super OneGetFormsResponse> continuation);

    @GET("/oneConsentT/consent")
    @Nullable
    Object getOneConsentDataTMN(@NotNull @Query("consentDomain") String str, @NotNull Continuation<? super OneConsentDataTmnResponse> continuation);

    @POST("oneConsentT/submit/photo/consent")
    @Nullable
    Object submitPhotoConsent(@Body @NotNull VerifyQrCodeData verifyQrCodeData, @NotNull Continuation<? super OneSummitUnityResponse> continuation);

    @POST("oneCommon/smartUI/updateAppForms")
    @Nullable
    Object updateAppForm(@Body @NotNull OneUpdateAppFormRequest oneUpdateAppFormRequest, @NotNull Continuation<? super OneCommonResponse> continuation);

    @POST("oneConsentT/consent-esignature/verifyQrCode")
    @Nullable
    Object verifyQrCode(@Body @NotNull OneVerifyQrCodeRequest oneVerifyQrCodeRequest, @NotNull Continuation<? super OneVerifyQrCodeResponse> continuation);
}