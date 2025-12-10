package th.p047co.dtac.android.dtacone.data.remote.pre2post;

import io.reactivex.Single;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansDetailRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansDetailResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.OneGetPricePlansResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostAuthorizationRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostBuyRecommendRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostCustomerPreverifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostGenAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostGetPropositionRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostPreVerifyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSaveFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostSubmitRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostUpdateAppFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostValidateConsentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostValidatePre2PostTrueCompanyRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostValidatePrivilegeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostVerifyIDNumberRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.request.OnePre2PostVerifySubscriberPreToPostRequest;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostAuthorizationResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostCustomerPreverifyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGenAppFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostGetPropositionResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostSubscribeNumberResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidateConsentResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePre2PostTrueCompanyResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostValidatePrivilegeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostVerifySubscriberPreToPostResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_pre2post.GetPre2PostMobileRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.request.UploadImageRequest;
import th.p047co.dtac.android.dtacone.model.upload_image.response.UploadImageResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m28851d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\t\u001a\u00020\rH'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\t\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\b\b\u0001\u0010\t\u001a\u00020\u0013H'J\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\t\u001a\u00020\u0016H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00032\b\b\u0001\u0010\t\u001a\u00020\u0019H'J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\t\u001a\u00020\u001cH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\t\u001a\u00020\u001fH'J\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\t\u001a\u00020\"H'J\u0018\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\t\u001a\u00020$H'J\u0018\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010&\u001a\u00020'H'J\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u00032\b\b\u0001\u0010\t\u001a\u00020*H'J\u0018\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\b\b\u0001\u0010\t\u001a\u00020,H'J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00032\b\b\u0001\u0010\t\u001a\u00020/H'J\u0018\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\b\b\u0001\u0010\t\u001a\u000202H'J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\b\b\u0001\u0010\t\u001a\u000205H'J\u0018\u00106\u001a\b\u0012\u0004\u0012\u0002070\u00032\b\b\u0001\u0010\t\u001a\u000208H'J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\t\u001a\u00020:H'J\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020<0\u00032\b\b\u0001\u0010\t\u001a\u00020=H'¨\u0006>"}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/pre2post/OnePre2PostApi;", "", "buyRecommendOnePre2Post", "Lio/reactivex/Single;", "Lokhttp3/ResponseBody;", "onePre2PostBuyRecommendRequest", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostBuyRecommendRequest;", "genAppForms", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGenAppFormResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGenAppFormsRequest;", "getCustomerPreverifyOnePre2Post", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostCustomerPreverifyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostCustomerPreverifyRequest;", "getForms", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGetFormsResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGetFormsRequest;", "getOnePre2PostAuthorization", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostAuthorizationResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostAuthorizationRequest;", "oneGetPricePlans", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansRequest;", "oneGetPricePlansDetail", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansDetailResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/OneGetPricePlansDetailRequest;", "onePre2PostPreVerify", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostPreVerifyRequest;", "onePre2postGetProposition", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostGetPropositionResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostGetPropositionRequest;", "oneVerifySubscriberPreToPost", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostVerifySubscriberPreToPostResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostVerifySubscriberPreToPostRequest;", "saveForms", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSaveFormsRequest;", "submitOnePre2Post", "onePre2PostSubmitRequest", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitRequest;", "submitPre2PostTrueCompany", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubmitOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostSubmitOrderRequest;", "updateAppForms", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostUpdateAppFormsRequest;", "uploadImageOnePre2Post", "Lth/co/dtac/android/dtacone/model/upload_image/response/UploadImageResponse;", "Lth/co/dtac/android/dtacone/model/upload_image/request/UploadImageRequest;", "validateOneConsentWithSmartUi", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidateConsentResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostValidateConsentRequest;", "validatePre2PostTrueCompany", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePre2PostTrueCompanyResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostValidatePre2PostTrueCompanyRequest;", "validatePrivilegeTrueCompany", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostValidatePrivilegeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostValidatePrivilegeRequest;", "verifyIDNumberOnePre2Post", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/request/OnePre2PostVerifyIDNumberRequest;", "verifySubscriberOnePre2Post", "Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostSubscribeNumberResponse;", "Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetPre2PostMobileRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.pre2post.OnePre2PostApi */
/* loaded from: classes7.dex */
public interface OnePre2PostApi {
    @POST("onePackRecommended/pre2post/buyOffer")
    @NotNull
    Single<ResponseBody> buyRecommendOnePre2Post(@Body @NotNull OnePre2PostBuyRecommendRequest onePre2PostBuyRecommendRequest);

    @POST("oneCommon/smartUI/genAppForms")
    @NotNull
    Single<OnePre2PostGenAppFormResponse> genAppForms(@Body @NotNull OnePre2PostGenAppFormsRequest onePre2PostGenAppFormsRequest);

    @POST("/onePre2PostT/smartUI/customerPreverify")
    @NotNull
    Single<OnePre2PostCustomerPreverifyResponse> getCustomerPreverifyOnePre2Post(@Body @NotNull OnePre2PostCustomerPreverifyRequest onePre2PostCustomerPreverifyRequest);

    @POST("oneCommon/smartUI/getForms")
    @NotNull
    Single<OnePre2PostGetFormsResponse> getForms(@Body @NotNull OnePre2PostGetFormsRequest onePre2PostGetFormsRequest);

    @POST("onePre2Post/authorization")
    @NotNull
    Single<OnePre2PostAuthorizationResponse> getOnePre2PostAuthorization(@Body @NotNull OnePre2PostAuthorizationRequest onePre2PostAuthorizationRequest);

    @POST("oneCommon/getPricePlans")
    @NotNull
    Single<OneGetPricePlansResponse> oneGetPricePlans(@Body @NotNull OneGetPricePlansRequest oneGetPricePlansRequest);

    @POST("oneCommon/getPricePlansDetail")
    @NotNull
    Single<OneGetPricePlansDetailResponse> oneGetPricePlansDetail(@Body @NotNull OneGetPricePlansDetailRequest oneGetPricePlansDetailRequest);

    @POST("onePre2PostT/smartUI/preverify")
    @NotNull
    Single<OneCommonResponse> onePre2PostPreVerify(@Body @NotNull OnePre2PostPreVerifyRequest onePre2PostPreVerifyRequest);

    @POST("onePre2PostT/smartUI/propositionList")
    @NotNull
    Single<OnePre2PostGetPropositionResponse> onePre2postGetProposition(@Body @NotNull OnePre2PostGetPropositionRequest onePre2PostGetPropositionRequest);

    @POST("onePre2PostT/verifySubscriberPreToPost")
    @NotNull
    Single<OnePre2PostVerifySubscriberPreToPostResponse> oneVerifySubscriberPreToPost(@Body @NotNull OnePre2PostVerifySubscriberPreToPostRequest onePre2PostVerifySubscriberPreToPostRequest);

    @POST("oneCommon/smartUI/saveForms")
    @NotNull
    Single<OneCommonResponse> saveForms(@Body @NotNull OnePre2PostSaveFormsRequest onePre2PostSaveFormsRequest);

    @POST("onePre2Post/submit")
    @NotNull
    Single<ResponseBody> submitOnePre2Post(@Body @NotNull OnePre2PostSubmitRequest onePre2PostSubmitRequest);

    @POST("onePre2PostT/smartUI/submitOrder")
    @NotNull
    Single<OnePre2PostSubmitOrderResponse> submitPre2PostTrueCompany(@Body @NotNull OnePre2PostSubmitOrderRequest onePre2PostSubmitOrderRequest);

    @POST("oneCommon/smartUI/updateAppForms")
    @NotNull
    Single<OneCommonResponse> updateAppForms(@Body @NotNull OnePre2PostUpdateAppFormsRequest onePre2PostUpdateAppFormsRequest);

    @POST("mrtrcommon/image")
    @NotNull
    Single<UploadImageResponse> uploadImageOnePre2Post(@Body @NotNull UploadImageRequest uploadImageRequest);

    @POST("oneConsentT/validateConsentViaSmui")
    @NotNull
    Single<OnePre2PostValidateConsentResponse> validateOneConsentWithSmartUi(@Body @NotNull OnePre2PostValidateConsentRequest onePre2PostValidateConsentRequest);

    @POST("onePre2PostT/smartUI/validatePre2Post")
    @NotNull
    Single<OnePre2PostValidatePre2PostTrueCompanyResponse> validatePre2PostTrueCompany(@Body @NotNull OnePre2PostValidatePre2PostTrueCompanyRequest onePre2PostValidatePre2PostTrueCompanyRequest);

    @POST("onePre2PostT/smartUI/validatePrivilege")
    @NotNull
    Single<OnePre2PostValidatePrivilegeResponse> validatePrivilegeTrueCompany(@Body @NotNull OnePre2PostValidatePrivilegeRequest onePre2PostValidatePrivilegeRequest);

    @POST("onePre2Post/validate/idNumber")
    @NotNull
    Single<ResponseBody> verifyIDNumberOnePre2Post(@Body @NotNull OnePre2PostVerifyIDNumberRequest onePre2PostVerifyIDNumberRequest);

    @POST("onePre2Post/subscriber")
    @NotNull
    Single<OnePre2PostSubscribeNumberResponse> verifySubscriberOnePre2Post(@Body @NotNull GetPre2PostMobileRequest getPre2PostMobileRequest);
}
