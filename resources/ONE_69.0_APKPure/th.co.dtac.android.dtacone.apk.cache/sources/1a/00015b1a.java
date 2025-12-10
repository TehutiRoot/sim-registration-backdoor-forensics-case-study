package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import androidx.core.p005os.EnvironmentCompat;
import com.feitian.readerdk.Tool.C6139DK;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.upPass.IdDocumentResult;
import th.p047co.dtac.android.dtacone.model.upPass.ValidateDopaData;
import th.p047co.dtac.android.dtacone.model.upPass.ValidateDopaResponse;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.ValidateDopaState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$validateDopa$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {588}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nUpPassViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$validateDopa$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,786:1\n230#2,5:787\n230#2,5:792\n230#2,5:797\n230#2,5:802\n230#2,5:807\n*S KotlinDebug\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$validateDopa$1\n*L\n579#1:787,5\n602#1:792,5\n614#1:797,5\n641#1:802,5\n662#1:807,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$validateDopa$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$validateDopa$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$validateDopa$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$validateDopa$1> continuation) {
        super(2, continuation);
        this.this$0 = upPassViewModel;
    }

    private static final String invokeSuspend$getErrorMessageFromSystemMessage(String str) {
        Sequence findAll$default = Regex.findAll$default(new Regex("\\[code:?\\s+([^]\\s]+)]\\s+([^\\[]*)", RegexOption.IGNORE_CASE), str, 0, 2, null);
        if (!SequencesKt___SequencesKt.any(findAll$default)) {
            return null;
        }
        return SequencesKt___SequencesKt.joinToString$default(findAll$default, "\n", null, null, 0, null, C16694x756215f.INSTANCE, 30, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$validateDopa$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MrtrErrorService mrtrErrorService;
        MrtrErrorService mrtrErrorService2;
        MrtrErrorService mrtrErrorService3;
        MutableStateFlow mutableStateFlow;
        Object value;
        MrtrErrorService mrtrErrorService4;
        String str;
        String str2;
        ValidateDopaResponse validateDopaResponse;
        MrtrErrorService mrtrErrorService5;
        MrtrErrorService mrtrErrorService6;
        MrtrErrorService mrtrErrorService7;
        IdDocumentResult copy;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        ValidateDopaResponse copy2;
        ResponseBody errorBody;
        Headers headers;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        Object validateDopa;
        ValidateDopaResponse copy3;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        String str3;
        IdDocumentResult copy4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    validateDopa = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow3 = this.this$0.f107154w;
                do {
                    value3 = mutableStateFlow3.getValue();
                    ValidateDopaState validateDopaState = (ValidateDopaState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, ValidateDopaState.Loading.INSTANCE));
                UpPassRepository upPassRepository = this.this$0.f107133b;
                this.label = 1;
                validateDopa = upPassRepository.validateDopa(this);
                if (validateDopa == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            ValidateDopaResponse validateDopaResponse2 = (ValidateDopaResponse) validateDopa;
            StringBuilder sb = new StringBuilder();
            sb.append("validateDopa() - response: ");
            sb.append(validateDopaResponse2);
            if (Intrinsics.areEqual(validateDopaResponse2.getCodeType(), "S")) {
                ValidateDopaData data = validateDopaResponse2.getData();
                String verificationDopa = data.getVerificationDopa();
                if (verificationDopa != null && verificationDopa.length() != 0) {
                    str3 = this.this$0.f107133b.getIdDocumentResult().getVerificationDopa();
                    String str4 = str3;
                    UpPassRepository upPassRepository2 = this.this$0.f107133b;
                    copy4 = r6.copy((r55 & 1) != 0 ? r6.docType : null, (r55 & 2) != 0 ? r6.verificationDocType : null, (r55 & 4) != 0 ? r6.docNumber : null, (r55 & 8) != 0 ? r6.prefix : null, (r55 & 16) != 0 ? r6.firstName : null, (r55 & 32) != 0 ? r6.middleName : null, (r55 & 64) != 0 ? r6.lastName : null, (r55 & 128) != 0 ? r6.gender : null, (r55 & 256) != 0 ? r6.birthday : null, (r55 & 512) != 0 ? r6.birthdayUpPass : null, (r55 & 1024) != 0 ? r6.houseNo : null, (r55 & 2048) != 0 ? r6.moo : null, (r55 & 4096) != 0 ? r6.road : null, (r55 & 8192) != 0 ? r6.soi : null, (r55 & 16384) != 0 ? r6.subDistrict : null, (r55 & 32768) != 0 ? r6.district : null, (r55 & 65536) != 0 ? r6.province : null, (r55 & 131072) != 0 ? r6.country : null, (r55 & 262144) != 0 ? r6.postcode : null, (r55 & 524288) != 0 ? r6.issue : null, (r55 & 1048576) != 0 ? r6.expire : null, (r55 & 2097152) != 0 ? r6.bp1Number : null, (r55 & 4194304) != 0 ? r6.chipId : null, (r55 & 8388608) != 0 ? r6.laserCode : null, (r55 & 16777216) != 0 ? r6.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? r6.docImage : null, (r55 & 67108864) != 0 ? r6.faceImage : null, (r55 & 134217728) != 0 ? r6.dopaStatus : data.getDopaStatus(), (r55 & 268435456) != 0 ? r6.dopaFlag : data.getDopaFlag(), (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? r6.isDopaByPass : data.isDopaByPass(), (r55 & 1073741824) != 0 ? r6.verificationDopa : str4, (r55 & Integer.MIN_VALUE) != 0 ? r6.isManualKeyIn : false, (r56 & 1) != 0 ? r6.verificationSlugId : null, (r56 & 2) != 0 ? r6.verificationForm : null, (r56 & 4) != 0 ? r6.idCardInformation : null, (r56 & 8) != 0 ? r6.firstNameEng : null, (r56 & 16) != 0 ? this.this$0.f107133b.getIdDocumentResult().lastNameEng : null);
                    upPassRepository2.setIdDocumentResult(copy4);
                    mutableStateFlow5 = this.this$0.f107154w;
                    do {
                        value5 = mutableStateFlow5.getValue();
                        ValidateDopaState validateDopaState2 = (ValidateDopaState) value5;
                    } while (!mutableStateFlow5.compareAndSet(value5, new ValidateDopaState.Success(data)));
                }
                if (!data.isDopaByPass() && Intrinsics.areEqual(data.getDopaFlag(), "connect")) {
                    str3 = "Y";
                } else {
                    str3 = "N";
                }
                String str42 = str3;
                UpPassRepository upPassRepository22 = this.this$0.f107133b;
                copy4 = r6.copy((r55 & 1) != 0 ? r6.docType : null, (r55 & 2) != 0 ? r6.verificationDocType : null, (r55 & 4) != 0 ? r6.docNumber : null, (r55 & 8) != 0 ? r6.prefix : null, (r55 & 16) != 0 ? r6.firstName : null, (r55 & 32) != 0 ? r6.middleName : null, (r55 & 64) != 0 ? r6.lastName : null, (r55 & 128) != 0 ? r6.gender : null, (r55 & 256) != 0 ? r6.birthday : null, (r55 & 512) != 0 ? r6.birthdayUpPass : null, (r55 & 1024) != 0 ? r6.houseNo : null, (r55 & 2048) != 0 ? r6.moo : null, (r55 & 4096) != 0 ? r6.road : null, (r55 & 8192) != 0 ? r6.soi : null, (r55 & 16384) != 0 ? r6.subDistrict : null, (r55 & 32768) != 0 ? r6.district : null, (r55 & 65536) != 0 ? r6.province : null, (r55 & 131072) != 0 ? r6.country : null, (r55 & 262144) != 0 ? r6.postcode : null, (r55 & 524288) != 0 ? r6.issue : null, (r55 & 1048576) != 0 ? r6.expire : null, (r55 & 2097152) != 0 ? r6.bp1Number : null, (r55 & 4194304) != 0 ? r6.chipId : null, (r55 & 8388608) != 0 ? r6.laserCode : null, (r55 & 16777216) != 0 ? r6.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? r6.docImage : null, (r55 & 67108864) != 0 ? r6.faceImage : null, (r55 & 134217728) != 0 ? r6.dopaStatus : data.getDopaStatus(), (r55 & 268435456) != 0 ? r6.dopaFlag : data.getDopaFlag(), (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? r6.isDopaByPass : data.isDopaByPass(), (r55 & 1073741824) != 0 ? r6.verificationDopa : str42, (r55 & Integer.MIN_VALUE) != 0 ? r6.isManualKeyIn : false, (r56 & 1) != 0 ? r6.verificationSlugId : null, (r56 & 2) != 0 ? r6.verificationForm : null, (r56 & 4) != 0 ? r6.idCardInformation : null, (r56 & 8) != 0 ? r6.firstNameEng : null, (r56 & 16) != 0 ? this.this$0.f107133b.getIdDocumentResult().lastNameEng : null);
                upPassRepository22.setIdDocumentResult(copy4);
                mutableStateFlow5 = this.this$0.f107154w;
                do {
                    value5 = mutableStateFlow5.getValue();
                    ValidateDopaState validateDopaState22 = (ValidateDopaState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, new ValidateDopaState.Success(data)));
            } else {
                if (validateDopaResponse2.getCodeType().length() == 0) {
                    copy3 = new ValidateDopaResponse("T", "200", "เกิดข้อผิดพลาด\nกรุณาลองใหม่อีกครั้ง", this.this$0.f107133b.getErrorUserId(), null, null, null, null, C6139DK.ERROR_RECEIVE_LRC, null);
                } else {
                    copy3 = validateDopaResponse2.copy((r18 & 1) != 0 ? validateDopaResponse2.codeType : null, (r18 & 2) != 0 ? validateDopaResponse2.code : null, (r18 & 4) != 0 ? validateDopaResponse2.desc : null, (r18 & 8) != 0 ? validateDopaResponse2.userId : this.this$0.f107133b.getErrorUserId(), (r18 & 16) != 0 ? validateDopaResponse2.systemMessage : null, (r18 & 32) != 0 ? validateDopaResponse2.replaceMessage : null, (r18 & 64) != 0 ? validateDopaResponse2.responseDateTime : null, (r18 & 128) != 0 ? validateDopaResponse2.data : null);
                }
                mutableStateFlow4 = this.this$0.f107154w;
                do {
                    value4 = mutableStateFlow4.getValue();
                    ValidateDopaState validateDopaState3 = (ValidateDopaState) value4;
                } while (!mutableStateFlow4.compareAndSet(value4, new ValidateDopaState.Error(copy3)));
            }
        } catch (HttpException e) {
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("validateDopa() - HttpException: ");
            sb2.append(message);
            Response<?> response = e.response();
            if (response != null && (headers = response.headers()) != null) {
                str = headers.get("Content-Type");
            } else {
                str = null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("validateDopa() - contentType: ");
            sb3.append(str);
            if (response != null && (errorBody = response.errorBody()) != null) {
                str2 = errorBody.string();
            } else {
                str2 = null;
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("validateDopa() - errorBody: ");
            sb4.append(str2);
            if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "application/json", false, 2, (Object) null)) {
                mrtrErrorService5 = this.this$0.f107134c;
                String errorCode = mrtrErrorService5.getErrorCode(e);
                Intrinsics.checkNotNullExpressionValue(errorCode, "errorService.getErrorCode(e)");
                mrtrErrorService6 = this.this$0.f107134c;
                String errorMessage = mrtrErrorService6.getErrorMessage(e);
                Intrinsics.checkNotNullExpressionValue(errorMessage, "errorService.getErrorMessage(e)");
                String errorUserId = this.this$0.f107133b.getErrorUserId();
                mrtrErrorService7 = this.this$0.f107134c;
                String systemMessage = mrtrErrorService7.getSystemMessage(e);
                Intrinsics.checkNotNullExpressionValue(systemMessage, "errorService.getSystemMessage(e)");
                validateDopaResponse = new ValidateDopaResponse("T", errorCode, errorMessage, errorUserId, systemMessage, null, null, new ValidateDopaData("failed", null, null, false, null, 30, null), 96, null);
            } else {
                Object fromJson = new Gson().fromJson(str2, (Class<Object>) ValidateDopaResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(errorBod…DopaResponse::class.java)");
                copy2 = r3.copy((r18 & 1) != 0 ? r3.codeType : null, (r18 & 2) != 0 ? r3.code : null, (r18 & 4) != 0 ? r3.desc : null, (r18 & 8) != 0 ? r3.userId : this.this$0.f107133b.getErrorUserId(), (r18 & 16) != 0 ? r3.systemMessage : null, (r18 & 32) != 0 ? r3.replaceMessage : null, (r18 & 64) != 0 ? r3.responseDateTime : null, (r18 & 128) != 0 ? ((ValidateDopaResponse) fromJson).data : null);
                validateDopaResponse = copy2;
            }
            UpPassRepository upPassRepository3 = this.this$0.f107133b;
            copy = r14.copy((r55 & 1) != 0 ? r14.docType : null, (r55 & 2) != 0 ? r14.verificationDocType : null, (r55 & 4) != 0 ? r14.docNumber : null, (r55 & 8) != 0 ? r14.prefix : null, (r55 & 16) != 0 ? r14.firstName : null, (r55 & 32) != 0 ? r14.middleName : null, (r55 & 64) != 0 ? r14.lastName : null, (r55 & 128) != 0 ? r14.gender : null, (r55 & 256) != 0 ? r14.birthday : null, (r55 & 512) != 0 ? r14.birthdayUpPass : null, (r55 & 1024) != 0 ? r14.houseNo : null, (r55 & 2048) != 0 ? r14.moo : null, (r55 & 4096) != 0 ? r14.road : null, (r55 & 8192) != 0 ? r14.soi : null, (r55 & 16384) != 0 ? r14.subDistrict : null, (r55 & 32768) != 0 ? r14.district : null, (r55 & 65536) != 0 ? r14.province : null, (r55 & 131072) != 0 ? r14.country : null, (r55 & 262144) != 0 ? r14.postcode : null, (r55 & 524288) != 0 ? r14.issue : null, (r55 & 1048576) != 0 ? r14.expire : null, (r55 & 2097152) != 0 ? r14.bp1Number : null, (r55 & 4194304) != 0 ? r14.chipId : null, (r55 & 8388608) != 0 ? r14.laserCode : null, (r55 & 16777216) != 0 ? r14.address : null, (r55 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? r14.docImage : null, (r55 & 67108864) != 0 ? r14.faceImage : null, (r55 & 134217728) != 0 ? r14.dopaStatus : validateDopaResponse.getData().getDopaStatus(), (r55 & 268435456) != 0 ? r14.dopaFlag : validateDopaResponse.getData().getDopaFlag(), (r55 & PKIFailureInfo.duplicateCertReq) != 0 ? r14.isDopaByPass : validateDopaResponse.getData().isDopaByPass(), (r55 & 1073741824) != 0 ? r14.verificationDopa : null, (r55 & Integer.MIN_VALUE) != 0 ? r14.isManualKeyIn : false, (r56 & 1) != 0 ? r14.verificationSlugId : null, (r56 & 2) != 0 ? r14.verificationForm : null, (r56 & 4) != 0 ? r14.idCardInformation : null, (r56 & 8) != 0 ? r14.firstNameEng : null, (r56 & 16) != 0 ? this.this$0.f107133b.getIdDocumentResult().lastNameEng : null);
            upPassRepository3.setIdDocumentResult(copy);
            mutableStateFlow2 = this.this$0.f107154w;
            do {
                value2 = mutableStateFlow2.getValue();
                ValidateDopaState validateDopaState4 = (ValidateDopaState) value2;
            } while (!mutableStateFlow2.compareAndSet(value2, new ValidateDopaState.Error(validateDopaResponse)));
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("validateDopa() - Exception: ");
            sb5.append(message2);
            mrtrErrorService = this.this$0.f107134c;
            String errorMessage2 = mrtrErrorService.getErrorMessage(e2);
            if (Intrinsics.areEqual(errorMessage2, "errorMessage")) {
                mrtrErrorService4 = this.this$0.f107134c;
                String systemMessage2 = mrtrErrorService4.getSystemMessage(e2);
                Intrinsics.checkNotNullExpressionValue(systemMessage2, "errorService.getSystemMessage(e)");
                errorMessage2 = invokeSuspend$getErrorMessageFromSystemMessage(systemMessage2);
                if (errorMessage2 == null) {
                    errorMessage2 = "เกิดข้อผิดพลาด\nกรุณาลองใหม่อีกครั้ง";
                }
            }
            String desc = errorMessage2;
            mrtrErrorService2 = this.this$0.f107134c;
            String errorCode2 = mrtrErrorService2.getErrorCode(e2);
            Intrinsics.checkNotNullExpressionValue(errorCode2, "errorService.getErrorCode(e)");
            Intrinsics.checkNotNullExpressionValue(desc, "desc");
            String errorUserId2 = this.this$0.f107133b.getErrorUserId();
            mrtrErrorService3 = this.this$0.f107134c;
            String systemMessage3 = mrtrErrorService3.getSystemMessage(e2);
            Intrinsics.checkNotNullExpressionValue(systemMessage3, "errorService.getSystemMessage(e)");
            ValidateDopaResponse validateDopaResponse3 = new ValidateDopaResponse("T", errorCode2, desc, errorUserId2, systemMessage3, null, null, new ValidateDopaData("failed", EnvironmentCompat.MEDIA_UNKNOWN, EnvironmentCompat.MEDIA_UNKNOWN, false, null, 16, null), 96, null);
            mutableStateFlow = this.this$0.f107154w;
            do {
                value = mutableStateFlow.getValue();
                ValidateDopaState validateDopaState5 = (ValidateDopaState) value;
            } while (!mutableStateFlow.compareAndSet(value, new ValidateDopaState.Error(validateDopaResponse3)));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$validateDopa$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}