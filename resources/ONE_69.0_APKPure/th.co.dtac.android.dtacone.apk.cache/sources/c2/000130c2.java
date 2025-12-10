package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import androidx.core.view.PointerIconCompat;
import com.google.gson.Gson;
import java.net.SocketTimeoutException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
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
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneSummitUnifyRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneSummitUnityResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.VerifyQrCodeData;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneUpdateUnifyFormState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$updateUnifyForm$1$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {PointerIconCompat.TYPE_ALL_SCROLL}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$updateUnifyForm$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,5:1170\n230#2,5:1175\n230#2,5:1180\n230#2,5:1185\n230#2,5:1190\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$updateUnifyForm$1$1\n*L\n1011#1:1160,5\n1015#1:1165,5\n1024#1:1170,5\n1033#1:1175,5\n1035#1:1180,5\n1038#1:1185,5\n1040#1:1190,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$updateUnifyForm$1$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$updateUnifyForm$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OneSummitUnifyRequest $it;
    final /* synthetic */ Function1<Boolean, Unit> $onSuccess;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OneConsentAndESignViewModel$updateUnifyForm$1$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, OneSummitUnifyRequest oneSummitUnifyRequest, Function1<? super Boolean, Unit> function1, Continuation<? super OneConsentAndESignViewModel$updateUnifyForm$1$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$it = oneSummitUnifyRequest;
        this.$onSuccess = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$updateUnifyForm$1$1(this.this$0, this.$it, this.$onSuccess, continuation);
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
        OneSummitUnityResponse oneSummitUnityResponse;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        MutableStateFlow mutableStateFlow7;
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
                mutableStateFlow5 = this.this$0.f90970p;
                do {
                    value5 = mutableStateFlow5.getValue();
                    OneUpdateUnifyFormState oneUpdateUnifyFormState = (OneUpdateUnifyFormState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, OneUpdateUnifyFormState.Loading.INSTANCE));
                oneConsentAndESignRepository = this.this$0.f90956b;
                VerifyQrCodeData data = this.$it.getData();
                this.label = 1;
                obj = oneConsentAndESignRepository.updateUnifyForm(data, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oneSummitUnityResponse = (OneSummitUnityResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f90970p;
            do {
                value4 = mutableStateFlow4.getValue();
                OneUpdateUnifyFormState oneUpdateUnifyFormState2 = (OneUpdateUnifyFormState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new OneUpdateUnifyFormState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f90970p;
                do {
                    value2 = mutableStateFlow2.getValue();
                    OneUpdateUnifyFormState oneUpdateUnifyFormState3 = (OneUpdateUnifyFormState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new OneUpdateUnifyFormState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                errorUserId = this.this$0.getErrorUserId();
                copy = r1.copy((r18 & 1) != 0 ? r1.codeType : null, (r18 & 2) != 0 ? r1.code : null, (r18 & 4) != 0 ? r1.desc : null, (r18 & 8) != 0 ? r1.userId : errorUserId, (r18 & 16) != 0 ? r1.systemMessage : null, (r18 & 32) != 0 ? r1.replaceMessage : null, (r18 & 64) != 0 ? r1.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f90970p;
                do {
                    value3 = mutableStateFlow3.getValue();
                    OneUpdateUnifyFormState oneUpdateUnifyFormState4 = (OneUpdateUnifyFormState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new OneUpdateUnifyFormState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f90970p;
            do {
                value = mutableStateFlow.getValue();
                OneUpdateUnifyFormState oneUpdateUnifyFormState5 = (OneUpdateUnifyFormState) value;
                message = e2.getMessage();
                if (message == null) {
                    message = "Can't update app form";
                }
            } while (!mutableStateFlow.compareAndSet(value, new OneUpdateUnifyFormState.ErrorMessage(message)));
        }
        if (!Intrinsics.areEqual(oneSummitUnityResponse.getCode(), "200")) {
            mutableStateFlow7 = this.this$0.f90970p;
            OneConsentAndESignViewModel oneConsentAndESignViewModel = this.this$0;
            do {
                value7 = mutableStateFlow7.getValue();
                OneUpdateUnifyFormState oneUpdateUnifyFormState6 = (OneUpdateUnifyFormState) value7;
                errorUserId2 = oneConsentAndESignViewModel.getErrorUserId();
            } while (!mutableStateFlow7.compareAndSet(value7, new OneUpdateUnifyFormState.Error(oneSummitUnityResponse.toCommonErrorResponse(errorUserId2))));
            return Unit.INSTANCE;
        }
        mutableStateFlow6 = this.this$0.f90970p;
        Function1<Boolean, Unit> function1 = this.$onSuccess;
        do {
            value6 = mutableStateFlow6.getValue();
            OneUpdateUnifyFormState oneUpdateUnifyFormState7 = (OneUpdateUnifyFormState) value6;
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(true));
            }
        } while (!mutableStateFlow6.compareAndSet(value6, new OneUpdateUnifyFormState.Success(oneSummitUnityResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$updateUnifyForm$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}