package th.p047co.dtac.android.dtacone.data.remote.OneChangeOwner;

import io.reactivex.Single;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.classify.OneClassifyCardTypeRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.classify.OneClassifyCardTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.insert_doc.OneInsertDocumentRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_order.OneChangeOwnerSubmitOrderRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_order.OneChangeOwnerSubmitOrderResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_worker.OneChangeOwnerSubmitWorkerRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.submit_worker.OneChangeOwnerSubmitWorkerResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_profile.OneChangeOwnerValidateProfileResponse;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_sim.OneChangeOwnerValidateSimRequest;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.validate_sim.OneChangeOwnerValidateSimResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.SubmitPrepaidReRegistRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.VerificationRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.VerificationResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid_reregist.validate.ValidateCardResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m28851d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\tH'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\fH'J\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u000fH'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0015H'J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0018H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH'J\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u001fH'¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/OneChangeOwner/OneChangeOwnerApi;", "", "changeOwnerInsertDocument", "Lio/reactivex/Single;", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "request", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/insert_doc/OneInsertDocumentRequest;", "changeOwnerSubmitOrder", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderResponse;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_order/OneChangeOwnerSubmitOrderRequest;", "changeOwnerSubmitWorker", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_worker/OneChangeOwnerSubmitWorkerResponse;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/submit_worker/OneChangeOwnerSubmitWorkerRequest;", "classifyCardType", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeResponse;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/classify/OneClassifyCardTypeRequest;", "oneChangeOwnerValidateSim", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/OneChangeOwnerValidateSimResponse;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_sim/OneChangeOwnerValidateSimRequest;", "oneChangeOwnerVerification", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/VerificationResponse;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/VerificationRequest;", "submitChangeOwner", "Lokhttp3/ResponseBody;", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/SubmitPrepaidReRegistRequest;", "validateCard", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardResponse;", "validateCardRequest", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid_reregist/validate/ValidateCardRequest;", "validateProfileTrue", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileResponse;", "Lth/co/dtac/android/dtacone/model/appOne/change_owner/validate_profile/OneChangeOwnerValidateProfileRequest;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.OneChangeOwner.OneChangeOwnerApi */
/* loaded from: classes7.dex */
public interface OneChangeOwnerApi {
    @POST("onePrepaidRegisterT/insertDocument")
    @NotNull
    Single<OneCommonResponse> changeOwnerInsertDocument(@Body @NotNull OneInsertDocumentRequest oneInsertDocumentRequest);

    @POST("oneChangeOwnerPrepaidT/submitOrder")
    @NotNull
    Single<OneChangeOwnerSubmitOrderResponse> changeOwnerSubmitOrder(@Body @NotNull OneChangeOwnerSubmitOrderRequest oneChangeOwnerSubmitOrderRequest);

    @POST("oneAsyncWorker/submitWorker")
    @NotNull
    Single<OneChangeOwnerSubmitWorkerResponse> changeOwnerSubmitWorker(@Body @NotNull OneChangeOwnerSubmitWorkerRequest oneChangeOwnerSubmitWorkerRequest);

    @POST("oneClassifyCardType/classify")
    @NotNull
    Single<OneClassifyCardTypeResponse> classifyCardType(@Body @NotNull OneClassifyCardTypeRequest oneClassifyCardTypeRequest);

    @POST("onePrepaidRegisterT/validateSim")
    @NotNull
    Single<OneChangeOwnerValidateSimResponse> oneChangeOwnerValidateSim(@Body @NotNull OneChangeOwnerValidateSimRequest oneChangeOwnerValidateSimRequest);

    @POST("oneChangeOwnerPrepaid/verification")
    @NotNull
    Single<VerificationResponse> oneChangeOwnerVerification(@Body @NotNull VerificationRequest verificationRequest);

    @POST("oneChangeOwnerPrepaid/update/profile")
    @NotNull
    Single<ResponseBody> submitChangeOwner(@Body @NotNull SubmitPrepaidReRegistRequest submitPrepaidReRegistRequest);

    @POST("oneChangeOwnerPrepaid/registration/card/validate")
    @NotNull
    Single<ValidateCardResponse> validateCard(@Body @NotNull ValidateCardRequest validateCardRequest);

    @POST("onePrepaidRegisterT/validateProfile")
    @NotNull
    Single<OneChangeOwnerValidateProfileResponse> validateProfileTrue(@Body @NotNull OneChangeOwnerValidateProfileRequest oneChangeOwnerValidateProfileRequest);
}
