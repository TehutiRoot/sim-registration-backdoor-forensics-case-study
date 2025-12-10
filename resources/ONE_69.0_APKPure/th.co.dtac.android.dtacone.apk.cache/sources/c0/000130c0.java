package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import com.google.gson.Gson;
import java.net.SocketTimeoutException;
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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneUpdateAppFormRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateAppFormsState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$updateAppForm$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {1054}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$updateAppForm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,5:1170\n230#2,5:1175\n230#2,5:1180\n230#2,5:1185\n230#2,5:1190\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$updateAppForm$1\n*L\n1052#1:1160,5\n1056#1:1165,5\n1065#1:1170,5\n1076#1:1175,5\n1078#1:1180,5\n1081#1:1185,5\n1083#1:1190,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$updateAppForm$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$updateAppForm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $documentType;
    final /* synthetic */ OneUpdateAppFormRequest $request;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$updateAppForm$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, OneUpdateAppFormRequest oneUpdateAppFormRequest, String str, Continuation<? super OneConsentAndESignViewModel$updateAppForm$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$request = oneUpdateAppFormRequest;
        this.$documentType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$updateAppForm$1(this.this$0, this.$request, this.$documentType, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        String message;
        String str;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        Headers headers;
        String str2;
        String errorUserId;
        CommonErrorResponse copy;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        OneConsentAndESignRepository oneConsentAndESignRepository;
        OneCommonResponse oneCommonResponse;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        Object value7;
        String errorUserId2;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                mutableStateFlow5 = this.this$0.f90968n;
                do {
                    value5 = mutableStateFlow5.getValue();
                    OneUpdateAppFormsState oneUpdateAppFormsState = (OneUpdateAppFormsState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, OneUpdateAppFormsState.Loading.INSTANCE));
                oneConsentAndESignRepository = this.this$0.f90956b;
                OneUpdateAppFormRequest oneUpdateAppFormRequest = this.$request;
                this.label = 1;
                obj = oneConsentAndESignRepository.updateAppForm(oneUpdateAppFormRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oneCommonResponse = (OneCommonResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f90968n;
            do {
                value4 = mutableStateFlow4.getValue();
                OneUpdateAppFormsState oneUpdateAppFormsState2 = (OneUpdateAppFormsState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new OneUpdateAppFormsState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f90968n;
                do {
                    value2 = mutableStateFlow2.getValue();
                    OneUpdateAppFormsState oneUpdateAppFormsState3 = (OneUpdateAppFormsState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new OneUpdateAppFormsState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                errorUserId = this.this$0.getErrorUserId();
                copy = r1.copy((r18 & 1) != 0 ? r1.codeType : null, (r18 & 2) != 0 ? r1.code : null, (r18 & 4) != 0 ? r1.desc : null, (r18 & 8) != 0 ? r1.userId : errorUserId, (r18 & 16) != 0 ? r1.systemMessage : null, (r18 & 32) != 0 ? r1.replaceMessage : null, (r18 & 64) != 0 ? r1.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f90968n;
                do {
                    value3 = mutableStateFlow3.getValue();
                    OneUpdateAppFormsState oneUpdateAppFormsState4 = (OneUpdateAppFormsState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new OneUpdateAppFormsState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f90968n;
            do {
                value = mutableStateFlow.getValue();
                OneUpdateAppFormsState oneUpdateAppFormsState5 = (OneUpdateAppFormsState) value;
                message = e2.getMessage();
                if (message == null) {
                    message = "Can't update app form";
                }
            } while (!mutableStateFlow.compareAndSet(value, new OneUpdateAppFormsState.ErrorMessage(message)));
        }
        if (!Intrinsics.areEqual(oneCommonResponse.getCode(), "200")) {
            mutableStateFlow9 = this.this$0.f90968n;
            OneConsentAndESignViewModel oneConsentAndESignViewModel = this.this$0;
            do {
                value7 = mutableStateFlow9.getValue();
                OneUpdateAppFormsState oneUpdateAppFormsState6 = (OneUpdateAppFormsState) value7;
                errorUserId2 = oneConsentAndESignViewModel.getErrorUserId();
            } while (!mutableStateFlow9.compareAndSet(value7, new OneUpdateAppFormsState.Error(oneCommonResponse.toCommonErrorResponse(errorUserId2))));
            return Unit.INSTANCE;
        }
        mutableStateFlow6 = this.this$0.f90968n;
        OneConsentAndESignViewModel oneConsentAndESignViewModel2 = this.this$0;
        String str3 = this.$documentType;
        do {
            value6 = mutableStateFlow6.getValue();
            OneUpdateAppFormsState oneUpdateAppFormsState7 = (OneUpdateAppFormsState) value6;
            mutableStateFlow7 = oneConsentAndESignViewModel2.f90976v;
            mutableStateFlow8 = oneConsentAndESignViewModel2.f90976v;
            ValidateDocApproved copy$default = ValidateDocApproved.copy$default((ValidateDocApproved) mutableStateFlow8.getValue(), null, 1, null);
            copy$default.updateDocumentApprovalStatus(str3, true);
            mutableStateFlow7.setValue(copy$default);
        } while (!mutableStateFlow6.compareAndSet(value6, new OneUpdateAppFormsState.Success(oneCommonResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$updateAppForm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}