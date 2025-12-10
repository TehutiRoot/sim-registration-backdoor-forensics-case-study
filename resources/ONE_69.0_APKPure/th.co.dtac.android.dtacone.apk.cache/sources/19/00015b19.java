package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import com.feitian.readerdk.Tool.C6139DK;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2SubmitResponse;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.Kyc2ndLineSubmitState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$submitManualKyc2ndLine$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {380}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nUpPassViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$submitManualKyc2ndLine$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,786:1\n230#2,5:787\n230#2,5:792\n230#2,5:797\n230#2,5:802\n230#2,5:807\n*S KotlinDebug\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$submitManualKyc2ndLine$1\n*L\n377#1:787,5\n384#1:792,5\n393#1:797,5\n421#1:802,5\n431#1:807,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$submitManualKyc2ndLine$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$submitManualKyc2ndLine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$submitManualKyc2ndLine$1(UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$submitManualKyc2ndLine$1> continuation) {
        super(2, continuation);
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$submitManualKyc2ndLine$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MrtrErrorService mrtrErrorService;
        MrtrErrorService mrtrErrorService2;
        MrtrErrorService mrtrErrorService3;
        MutableStateFlow mutableStateFlow;
        Object value;
        String str;
        CommonErrorResponse commonErrorResponse;
        MrtrErrorService mrtrErrorService4;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MrtrErrorService mrtrErrorService5;
        MrtrErrorService mrtrErrorService6;
        MrtrErrorService mrtrErrorService7;
        ResponseBody errorBody;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        Object submitManualKyc2ndLine;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    submitManualKyc2ndLine = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow3 = this.this$0.f107144m;
                do {
                    value3 = mutableStateFlow3.getValue();
                    Kyc2ndLineSubmitState kyc2ndLineSubmitState = (Kyc2ndLineSubmitState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, Kyc2ndLineSubmitState.Loading.INSTANCE));
                UpPassRepository upPassRepository = this.this$0.f107133b;
                this.label = 1;
                submitManualKyc2ndLine = upPassRepository.submitManualKyc2ndLine(this);
                if (submitManualKyc2ndLine == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            Kyc2SubmitResponse kyc2SubmitResponse = (Kyc2SubmitResponse) submitManualKyc2ndLine;
            StringBuilder sb = new StringBuilder();
            sb.append("submitManualKyc2ndLine() - response: ");
            sb.append(kyc2SubmitResponse);
            if (Intrinsics.areEqual(kyc2SubmitResponse.getCodeType(), "S")) {
                mutableStateFlow5 = this.this$0.f107144m;
                do {
                    value5 = mutableStateFlow5.getValue();
                    Kyc2ndLineSubmitState kyc2ndLineSubmitState2 = (Kyc2ndLineSubmitState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, new Kyc2ndLineSubmitState.Success(kyc2SubmitResponse.getData())));
            } else {
                String codeType = kyc2SubmitResponse.getCodeType();
                String code = kyc2SubmitResponse.getCode();
                String desc = kyc2SubmitResponse.getDesc();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("submitManualKyc2ndLine() - error: ");
                sb2.append(codeType);
                sb2.append(", ");
                sb2.append(code);
                sb2.append(", ");
                sb2.append(desc);
                CommonErrorResponse commonErrorResponse2 = new CommonErrorResponse("T", "200", "ขออภัยค่ะ ไม่สามารถทำรายการได้\nกรุณาลองใหม่อีกครั้งค่ะ", this.this$0.f107133b.getErrorUserId(), null, null, null, null, C6139DK.ERROR_RECEIVE_LRC, null);
                mutableStateFlow4 = this.this$0.f107144m;
                do {
                    value4 = mutableStateFlow4.getValue();
                    Kyc2ndLineSubmitState kyc2ndLineSubmitState3 = (Kyc2ndLineSubmitState) value4;
                } while (!mutableStateFlow4.compareAndSet(value4, new Kyc2ndLineSubmitState.Error(commonErrorResponse2)));
            }
        } catch (HttpException e) {
            String message = e.getMessage();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("submitManualKyc2ndLine() - HttpException: ");
            sb3.append(message);
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            Gson create = new GsonBuilder().create();
            if (str == null) {
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
                commonErrorResponse = new CommonErrorResponse("T", errorCode, errorMessage, errorUserId, systemMessage, null, null, null, 224, null);
            } else {
                try {
                    Object fromJson = create.fromJson(str, (Class<Object>) CommonErrorResponse.class);
                    Intrinsics.checkNotNullExpressionValue(fromJson, "gson.fromJson(responseBo…rrorResponse::class.java)");
                    commonErrorResponse = r8.copy((r18 & 1) != 0 ? r8.codeType : null, (r18 & 2) != 0 ? r8.code : null, (r18 & 4) != 0 ? r8.desc : null, (r18 & 8) != 0 ? r8.userId : this.this$0.f107133b.getErrorUserId(), (r18 & 16) != 0 ? r8.systemMessage : null, (r18 & 32) != 0 ? r8.replaceMessage : null, (r18 & 64) != 0 ? r8.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                } catch (Exception e2) {
                    String message2 = e2.getMessage();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("submitManualKyc2ndLine() - Json parsing error: ");
                    sb4.append(message2);
                    mrtrErrorService4 = this.this$0.f107134c;
                    String errorCode2 = mrtrErrorService4.getErrorCode(e);
                    Intrinsics.checkNotNullExpressionValue(errorCode2, "errorService.getErrorCode(e)");
                    commonErrorResponse = new CommonErrorResponse("T", errorCode2, "ขออภัยค่ะ ไม่สามารถทำรายการได้\nกรุณาลองใหม่อีกครั้งค่ะ", this.this$0.f107133b.getErrorUserId(), null, null, null, null, C6139DK.ERROR_RECEIVE_LRC, null);
                }
            }
            CommonErrorResponse commonErrorResponse3 = commonErrorResponse;
            mutableStateFlow2 = this.this$0.f107144m;
            do {
                value2 = mutableStateFlow2.getValue();
                Kyc2ndLineSubmitState kyc2ndLineSubmitState4 = (Kyc2ndLineSubmitState) value2;
            } while (!mutableStateFlow2.compareAndSet(value2, new Kyc2ndLineSubmitState.Error(commonErrorResponse3)));
        } catch (Exception e3) {
            String message3 = e3.getMessage();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("submitManualKyc2ndLine() - Exception: ");
            sb5.append(message3);
            mrtrErrorService = this.this$0.f107134c;
            String errorCode3 = mrtrErrorService.getErrorCode(e3);
            Intrinsics.checkNotNullExpressionValue(errorCode3, "errorService.getErrorCode(e)");
            mrtrErrorService2 = this.this$0.f107134c;
            String errorMessage2 = mrtrErrorService2.getErrorMessage(e3);
            Intrinsics.checkNotNullExpressionValue(errorMessage2, "errorService.getErrorMessage(e)");
            String errorUserId2 = this.this$0.f107133b.getErrorUserId();
            mrtrErrorService3 = this.this$0.f107134c;
            String systemMessage2 = mrtrErrorService3.getSystemMessage(e3);
            Intrinsics.checkNotNullExpressionValue(systemMessage2, "errorService.getSystemMessage(e)");
            CommonErrorResponse commonErrorResponse4 = new CommonErrorResponse("T", errorCode3, errorMessage2, errorUserId2, systemMessage2, null, null, null, 224, null);
            mutableStateFlow = this.this$0.f107144m;
            do {
                value = mutableStateFlow.getValue();
                Kyc2ndLineSubmitState kyc2ndLineSubmitState5 = (Kyc2ndLineSubmitState) value;
            } while (!mutableStateFlow.compareAndSet(value, new Kyc2ndLineSubmitState.Error(commonErrorResponse4)));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$submitManualKyc2ndLine$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}