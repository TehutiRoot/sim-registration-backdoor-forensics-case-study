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
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsRequest;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGetFormsResponse;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneGetFormsState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$getForms$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {713}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$getForms$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,5:1170\n230#2,5:1175\n230#2,5:1180\n230#2,5:1185\n230#2,5:1190\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$getForms$1\n*L\n711#1:1160,5\n715#1:1165,5\n724#1:1170,5\n732#1:1175,5\n734#1:1180,5\n737#1:1185,5\n739#1:1190,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$getForms$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$getForms$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$getForms$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, Continuation<? super OneConsentAndESignViewModel$getForms$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$getForms$1(this.this$0, continuation);
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
        MutableStateFlow mutableStateFlow6;
        OneGetFormsResponse oneGetFormsResponse;
        MutableStateFlow mutableStateFlow7;
        Object value6;
        MutableStateFlow mutableStateFlow8;
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
                mutableStateFlow5 = this.this$0.f90966l;
                do {
                    value5 = mutableStateFlow5.getValue();
                    OneGetFormsState oneGetFormsState = (OneGetFormsState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, OneGetFormsState.Loading.INSTANCE));
                oneConsentAndESignRepository = this.this$0.f90956b;
                mutableStateFlow6 = this.this$0.f90946J;
                OneGetFormsRequest oneGetFormsRequest = new OneGetFormsRequest((String) mutableStateFlow6.getValue());
                this.label = 1;
                obj = oneConsentAndESignRepository.getForms(oneGetFormsRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oneGetFormsResponse = (OneGetFormsResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f90966l;
            do {
                value4 = mutableStateFlow4.getValue();
                OneGetFormsState oneGetFormsState2 = (OneGetFormsState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new OneGetFormsState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f90966l;
                do {
                    value2 = mutableStateFlow2.getValue();
                    OneGetFormsState oneGetFormsState3 = (OneGetFormsState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new OneGetFormsState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                errorUserId = this.this$0.getErrorUserId();
                copy = r1.copy((r18 & 1) != 0 ? r1.codeType : null, (r18 & 2) != 0 ? r1.code : null, (r18 & 4) != 0 ? r1.desc : null, (r18 & 8) != 0 ? r1.userId : errorUserId, (r18 & 16) != 0 ? r1.systemMessage : null, (r18 & 32) != 0 ? r1.replaceMessage : null, (r18 & 64) != 0 ? r1.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f90966l;
                do {
                    value3 = mutableStateFlow3.getValue();
                    OneGetFormsState oneGetFormsState4 = (OneGetFormsState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new OneGetFormsState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f90966l;
            do {
                value = mutableStateFlow.getValue();
                OneGetFormsState oneGetFormsState5 = (OneGetFormsState) value;
                message = e2.getMessage();
                if (message == null) {
                    message = "Can't get forms";
                }
            } while (!mutableStateFlow.compareAndSet(value, new OneGetFormsState.ErrorMessage(message)));
        }
        if (!Intrinsics.areEqual(oneGetFormsResponse.getCode(), "200")) {
            mutableStateFlow8 = this.this$0.f90966l;
            OneConsentAndESignViewModel oneConsentAndESignViewModel = this.this$0;
            do {
                value7 = mutableStateFlow8.getValue();
                OneGetFormsState oneGetFormsState6 = (OneGetFormsState) value7;
                errorUserId2 = oneConsentAndESignViewModel.getErrorUserId();
            } while (!mutableStateFlow8.compareAndSet(value7, new OneGetFormsState.Error(oneGetFormsResponse.toCommonErrorResponse(errorUserId2))));
            return Unit.INSTANCE;
        }
        mutableStateFlow7 = this.this$0.f90966l;
        do {
            value6 = mutableStateFlow7.getValue();
            OneGetFormsState oneGetFormsState7 = (OneGetFormsState) value6;
        } while (!mutableStateFlow7.compareAndSet(value6, new OneGetFormsState.Success(oneGetFormsResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$getForms$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}