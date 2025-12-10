package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import com.feitian.readerdk.Tool.C6139DK;
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
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import okhttp3.Headers;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import retrofit2.Response;
import th.p047co.dtac.android.dtacone.manager.service.MrtrErrorService;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.model.upPass.CreateFormResponse;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.repository.upPass.UpPassRepository;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.state.UpPassFormState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$createForm$1", m29092f = "UpPassViewModel.kt", m29091i = {}, m29090l = {102}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nUpPassViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$createForm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,786:1\n230#2,5:787\n230#2,5:792\n230#2,5:797\n230#2,5:802\n230#2,5:807\n230#2,5:812\n*S KotlinDebug\n*F\n+ 1 UpPassViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/upPass/UpPassViewModel$createForm$1\n*L\n99#1:787,5\n106#1:792,5\n125#1:797,5\n137#1:802,5\n139#1:807,5\n156#1:812,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel$createForm$1 */
/* loaded from: classes9.dex */
public final class UpPassViewModel$createForm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UpPassFormType $formType;
    int label;
    final /* synthetic */ UpPassViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpPassViewModel$createForm$1(UpPassFormType upPassFormType, UpPassViewModel upPassViewModel, Continuation<? super UpPassViewModel$createForm$1> continuation) {
        super(2, continuation);
        this.$formType = upPassFormType;
        this.this$0 = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new UpPassViewModel$createForm$1(this.$formType, this.this$0, continuation);
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
        String str2;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        MrtrErrorService mrtrErrorService4;
        String errorCode;
        MrtrErrorService mrtrErrorService5;
        String errorMessage;
        String errorUserId;
        MrtrErrorService mrtrErrorService6;
        String systemMessage;
        CommonErrorResponse copy;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        Headers headers;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        Object createForm;
        CommonErrorResponse commonErrorResponse;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    createForm = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                UpPassFormType upPassFormType = this.$formType;
                StringBuilder sb = new StringBuilder();
                sb.append("createForm() - formType: ");
                sb.append(upPassFormType);
                this.this$0.f107133b.setFormType(this.$formType);
                mutableStateFlow4 = this.this$0.f107140i;
                do {
                    value4 = mutableStateFlow4.getValue();
                    UpPassFormState upPassFormState = (UpPassFormState) value4;
                } while (!mutableStateFlow4.compareAndSet(value4, UpPassFormState.LoadingUrl.INSTANCE));
                UpPassFormType formType = this.this$0.f107133b.getFormType();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("createForm() - start request: ");
                sb2.append(formType);
                UpPassRepository upPassRepository = this.this$0.f107133b;
                boolean booleanValue = this.this$0.isAuth().getValue().booleanValue();
                this.label = 1;
                createForm = upPassRepository.createForm(booleanValue, this);
                if (createForm == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            CreateFormResponse createFormResponse = (CreateFormResponse) createForm;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("createForm() - response: ");
            sb3.append(createFormResponse);
            if (Intrinsics.areEqual(createFormResponse.getCodeType(), "S") && createFormResponse.getData().getUrl() != null) {
                mutableStateFlow6 = this.this$0.f107140i;
                do {
                    value6 = mutableStateFlow6.getValue();
                    UpPassFormState upPassFormState2 = (UpPassFormState) value6;
                } while (!mutableStateFlow6.compareAndSet(value6, new UpPassFormState.SuccessUrl(createFormResponse.getData().getUrl())));
            } else {
                String codeType = createFormResponse.getCodeType();
                if (codeType != null && codeType.length() != 0) {
                    String codeType2 = createFormResponse.getCodeType();
                    String code = createFormResponse.getCode();
                    if (code == null) {
                        code = "200";
                    }
                    String str3 = code;
                    String desc = createFormResponse.getDesc();
                    if (desc == null) {
                        desc = "เกิดข้อผิดพลาด\nกรุณาลองใหม่อีกครั้ง";
                    }
                    String str4 = desc;
                    String errorUserId2 = this.this$0.f107133b.getErrorUserId();
                    String systemMessage2 = createFormResponse.getSystemMessage();
                    if (systemMessage2 == null) {
                        systemMessage2 = "";
                    }
                    commonErrorResponse = new CommonErrorResponse(codeType2, str3, str4, errorUserId2, systemMessage2, null, null, null, 224, null);
                    mutableStateFlow5 = this.this$0.f107140i;
                    do {
                        value5 = mutableStateFlow5.getValue();
                        UpPassFormState upPassFormState3 = (UpPassFormState) value5;
                    } while (!mutableStateFlow5.compareAndSet(value5, new UpPassFormState.ErrorUrl(commonErrorResponse)));
                }
                commonErrorResponse = new CommonErrorResponse("T", "200", "เกิดข้อผิดพลาด\nกรุณาลองใหม่อีกครั้ง", this.this$0.f107133b.getErrorUserId(), null, null, null, null, C6139DK.ERROR_RECEIVE_LRC, null);
                mutableStateFlow5 = this.this$0.f107140i;
                do {
                    value5 = mutableStateFlow5.getValue();
                    UpPassFormState upPassFormState32 = (UpPassFormState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, new UpPassFormState.ErrorUrl(commonErrorResponse)));
            }
        } catch (HttpException e) {
            String message = e.getMessage();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("createForm() - HttpException: ");
            sb4.append(message);
            Response<?> response = e.response();
            if (response != null && (headers = response.headers()) != null) {
                str = headers.get("Content-Type");
            } else {
                str = null;
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append("createForm() - contentType: ");
            sb5.append(str);
            if (response != null && (errorBody = response.errorBody()) != null) {
                str2 = errorBody.string();
            } else {
                str2 = null;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("createForm() - errorBody: ");
            sb6.append(str2);
            if (str == null || !StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f107140i;
                UpPassViewModel upPassViewModel = this.this$0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    UpPassFormState upPassFormState4 = (UpPassFormState) value2;
                    mrtrErrorService4 = upPassViewModel.f107134c;
                    errorCode = mrtrErrorService4.getErrorCode(e);
                    Intrinsics.checkNotNullExpressionValue(errorCode, "errorService.getErrorCode(e)");
                    mrtrErrorService5 = upPassViewModel.f107134c;
                    errorMessage = mrtrErrorService5.getErrorMessage(e);
                    Intrinsics.checkNotNullExpressionValue(errorMessage, "errorService.getErrorMessage(e)");
                    errorUserId = upPassViewModel.f107133b.getErrorUserId();
                    mrtrErrorService6 = upPassViewModel.f107134c;
                    systemMessage = mrtrErrorService6.getSystemMessage(e);
                    Intrinsics.checkNotNullExpressionValue(systemMessage, "errorService.getSystemMessage(e)");
                } while (!mutableStateFlow2.compareAndSet(value2, new UpPassFormState.ErrorUrl(new CommonErrorResponse("T", errorCode, errorMessage, errorUserId, systemMessage, null, null, null, 224, null))));
            } else {
                Object fromJson = new Gson().fromJson(str2, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(errorBod…rrorResponse::class.java)");
                copy = r3.copy((r18 & 1) != 0 ? r3.codeType : null, (r18 & 2) != 0 ? r3.code : null, (r18 & 4) != 0 ? r3.desc : null, (r18 & 8) != 0 ? r3.userId : this.this$0.f107133b.getErrorUserId(), (r18 & 16) != 0 ? r3.systemMessage : null, (r18 & 32) != 0 ? r3.replaceMessage : null, (r18 & 64) != 0 ? r3.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f107140i;
                do {
                    value3 = mutableStateFlow3.getValue();
                    UpPassFormState upPassFormState5 = (UpPassFormState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new UpPassFormState.ErrorUrl(copy)));
            }
        } catch (Exception e2) {
            String message2 = e2.getMessage();
            StringBuilder sb7 = new StringBuilder();
            sb7.append("createForm() - Exception: ");
            sb7.append(message2);
            mrtrErrorService = this.this$0.f107134c;
            String errorCode2 = mrtrErrorService.getErrorCode(e2);
            Intrinsics.checkNotNullExpressionValue(errorCode2, "errorService.getErrorCode(e)");
            mrtrErrorService2 = this.this$0.f107134c;
            String errorMessage2 = mrtrErrorService2.getErrorMessage(e2);
            Intrinsics.checkNotNullExpressionValue(errorMessage2, "errorService.getErrorMessage(e)");
            String errorUserId3 = this.this$0.f107133b.getErrorUserId();
            mrtrErrorService3 = this.this$0.f107134c;
            String systemMessage3 = mrtrErrorService3.getSystemMessage(e2);
            Intrinsics.checkNotNullExpressionValue(systemMessage3, "errorService.getSystemMessage(e)");
            CommonErrorResponse commonErrorResponse2 = new CommonErrorResponse("T", errorCode2, errorMessage2, errorUserId3, systemMessage3, null, null, null, 224, null);
            mutableStateFlow = this.this$0.f107140i;
            do {
                value = mutableStateFlow.getValue();
                UpPassFormState upPassFormState6 = (UpPassFormState) value;
            } while (!mutableStateFlow.compareAndSet(value, new UpPassFormState.ErrorUrl(commonErrorResponse2)));
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((UpPassViewModel$createForm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}