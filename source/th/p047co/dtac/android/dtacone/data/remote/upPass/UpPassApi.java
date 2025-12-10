package th.p047co.dtac.android.dtacone.data.remote.upPass;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Body;
import retrofit2.http.POST;
import th.p047co.dtac.android.dtacone.model.upPass.CreateFormRequest;
import th.p047co.dtac.android.dtacone.model.upPass.CreateFormResponse;
import th.p047co.dtac.android.dtacone.model.upPass.QueryResultRequest;
import th.p047co.dtac.android.dtacone.model.upPass.QueryResultResponse;
import th.p047co.dtac.android.dtacone.model.upPass.ValidateDopaRequest;
import th.p047co.dtac.android.dtacone.model.upPass.ValidateDopaResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2CancelStatusRequest;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2CancelStatusResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2GetStatusResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2QueryStatusRequest;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2QueryStatusResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2ServiceTimeResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2SubmitRequest;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2SubmitResponse;

@Metadata(m28851d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001b\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0004\u001a\u00020\u0012H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0004\u001a\u00020\u0016H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u0004\u001a\u00020\u001aH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0004\u001a\u00020\u001eH§@ø\u0001\u0000¢\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28850d2 = {"Lth/co/dtac/android/dtacone/data/remote/upPass/UpPassApi;", "", "cancelManualKyc2ndLine", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2CancelStatusResponse;", "request", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2CancelStatusRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2CancelStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAvailableAgent", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2ServiceTimeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createForm", "Lth/co/dtac/android/dtacone/model/upPass/CreateFormResponse;", "Lth/co/dtac/android/dtacone/model/upPass/CreateFormRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/CreateFormRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getManualKyc2ndLineStatus", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2GetStatusResponse;", "getResult", "Lth/co/dtac/android/dtacone/model/upPass/QueryResultResponse;", "Lth/co/dtac/android/dtacone/model/upPass/QueryResultRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/QueryResultRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestVerifyManualKyc2ndLineStatus", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusResponse;", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitManualKyc2ndLine", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2SubmitResponse;", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2SubmitRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2SubmitRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateDopa", "Lth/co/dtac/android/dtacone/model/upPass/ValidateDopaResponse;", "Lth/co/dtac/android/dtacone/model/upPass/ValidateDopaRequest;", "(Lth/co/dtac/android/dtacone/model/upPass/ValidateDopaRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.data.remote.upPass.UpPassApi */
/* loaded from: classes7.dex */
public interface UpPassApi {
    @POST("oneCommon/cancelManualKYC2ndLine")
    @Nullable
    Object cancelManualKyc2ndLine(@Body @NotNull Kyc2CancelStatusRequest kyc2CancelStatusRequest, @NotNull Continuation<? super Kyc2CancelStatusResponse> continuation);

    @POST("oneCommon/checkAvailableAgent")
    @Nullable
    Object checkAvailableAgent(@NotNull Continuation<? super Kyc2ServiceTimeResponse> continuation);

    @POST("oneCommon/commonCreateFromEkyc")
    @Nullable
    Object createForm(@Body @NotNull CreateFormRequest createFormRequest, @NotNull Continuation<? super CreateFormResponse> continuation);

    @POST("oneCommon/getManualKYC2ndLineStatus")
    @Nullable
    Object getManualKyc2ndLineStatus(@NotNull Continuation<? super Kyc2GetStatusResponse> continuation);

    @POST("oneCommon/commonQueryResultEkyc")
    @Nullable
    Object getResult(@Body @NotNull QueryResultRequest queryResultRequest, @NotNull Continuation<? super QueryResultResponse> continuation);

    @POST("oneCommon/reRequestVerifyManualKYC2ndLineStatus")
    @Nullable
    Object requestVerifyManualKyc2ndLineStatus(@Body @NotNull Kyc2QueryStatusRequest kyc2QueryStatusRequest, @NotNull Continuation<? super Kyc2QueryStatusResponse> continuation);

    @POST("oneCommon/submitManualKYC2ndLine")
    @Nullable
    Object submitManualKyc2ndLine(@Body @NotNull Kyc2SubmitRequest kyc2SubmitRequest, @NotNull Continuation<? super Kyc2SubmitResponse> continuation);

    @POST("oneCommon/commonDipchipValidateDopa")
    @Nullable
    Object validateDopa(@Body @NotNull ValidateDopaRequest validateDopaRequest, @NotNull Continuation<? super ValidateDopaResponse> continuation);
}
