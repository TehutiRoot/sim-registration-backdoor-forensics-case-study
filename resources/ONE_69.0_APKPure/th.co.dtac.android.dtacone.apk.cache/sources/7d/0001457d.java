package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import com.google.gson.Gson;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.OneGenerateFormResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.forms.PDFFormData;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.GenerateFormState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$generateForm$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {2034}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$generateForm$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,5:2378\n230#2,5:2383\n230#2,5:2388\n230#2,5:2393\n230#2,5:2398\n230#2,5:2403\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$generateForm$1\n*L\n2032#1:2373,5\n2036#1:2378,5\n2039#1:2383,5\n2053#1:2388,5\n2055#1:2393,5\n2058#1:2398,5\n2060#1:2403,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$generateForm$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$generateForm$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$generateForm$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$generateForm$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$generateForm$1(this.this$0, continuation);
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
        CommonErrorResponse copy;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        OneGenerateFormResponse oneGenerateFormResponse;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        List<PDFFormData> data;
        MutableStateFlow mutableStateFlow7;
        Object value7;
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
                mutableStateFlow5 = this.this$0.f98241i1;
                do {
                    value5 = mutableStateFlow5.getValue();
                    GenerateFormState generateFormState = (GenerateFormState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, GenerateFormState.Loading.INSTANCE));
                OneTolRepository oneTolRepository = this.this$0.f98221c;
                this.label = 1;
                obj = oneTolRepository.generateForm(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oneGenerateFormResponse = (OneGenerateFormResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f98241i1;
            do {
                value4 = mutableStateFlow4.getValue();
                GenerateFormState generateFormState2 = (GenerateFormState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new GenerateFormState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f98241i1;
                do {
                    value2 = mutableStateFlow2.getValue();
                    GenerateFormState generateFormState3 = (GenerateFormState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new GenerateFormState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                copy = r1.copy((r18 & 1) != 0 ? r1.f97859a : null, (r18 & 2) != 0 ? r1.f97860b : null, (r18 & 4) != 0 ? r1.f97861c : null, (r18 & 8) != 0 ? r1.f97862d : this.this$0.f98221c.getErrorUserId(), (r18 & 16) != 0 ? r1.f97863e : null, (r18 & 32) != 0 ? r1.f97864f : null, (r18 & 64) != 0 ? r1.f97865g : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).f97866h : null);
                mutableStateFlow3 = this.this$0.f98241i1;
                do {
                    value3 = mutableStateFlow3.getValue();
                    GenerateFormState generateFormState4 = (GenerateFormState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new GenerateFormState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f98241i1;
            do {
                value = mutableStateFlow.getValue();
                GenerateFormState generateFormState5 = (GenerateFormState) value;
                message = e2.getMessage();
                if (message == null) {
                    message = "Can't generate form";
                }
            } while (!mutableStateFlow.compareAndSet(value, new GenerateFormState.ErrorMessage(message)));
        }
        if (!Intrinsics.areEqual(oneGenerateFormResponse.getCode(), "200")) {
            mutableStateFlow7 = this.this$0.f98241i1;
            OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel = this.this$0;
            do {
                value7 = mutableStateFlow7.getValue();
                GenerateFormState generateFormState6 = (GenerateFormState) value7;
            } while (!mutableStateFlow7.compareAndSet(value7, new GenerateFormState.Error(oneGenerateFormResponse.toCommonErrorResponse(oneRegisterTrueOnlineViewModel.f98221c.getErrorUserId()))));
            return Unit.INSTANCE;
        }
        mutableStateFlow6 = this.this$0.f98241i1;
        do {
            value6 = mutableStateFlow6.getValue();
            GenerateFormState generateFormState7 = (GenerateFormState) value6;
            data = oneGenerateFormResponse.getData();
            if (data == null) {
                data = CollectionsKt__CollectionsKt.emptyList();
            }
        } while (!mutableStateFlow6.compareAndSet(value6, new GenerateFormState.Success(data)));
        StringBuilder sb = new StringBuilder();
        sb.append("generateForm: ");
        sb.append(oneGenerateFormResponse);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$generateForm$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}