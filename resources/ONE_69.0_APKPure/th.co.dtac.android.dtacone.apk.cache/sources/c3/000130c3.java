package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import com.google.gson.Gson;
import java.net.SocketTimeoutException;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.AbstractC11695c;
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
import th.p047co.dtac.android.dtacone.app_one.util.theme.compose.CompanyThemes;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.ValidateDocApproved;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.repository.OneConsentAndESignRepository;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.request.OneVerifyQrCodeRequest;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.EngagedParty;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.OneVerifyQrCodeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.state.OneVerifyQrCodeState;
import th.p047co.dtac.android.dtacone.view.appOne.tol.util.StringHelperKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$verifyQrCode$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {338}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$verifyQrCode$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1159:1\n230#2,5:1160\n230#2,5:1165\n230#2,3:1170\n233#2,2:1179\n230#2,5:1181\n230#2,5:1186\n230#2,5:1191\n230#2,5:1196\n1208#3,2:1173\n1238#3,4:1175\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$verifyQrCode$1\n*L\n335#1:1160,5\n340#1:1165,5\n349#1:1170,3\n349#1:1179,2\n368#1:1181,5\n370#1:1186,5\n373#1:1191,5\n375#1:1196,5\n351#1:1173,2\n351#1:1175,4\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$verifyQrCode$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$verifyQrCode$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $qrValue;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$verifyQrCode$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, String str, Continuation<? super OneConsentAndESignViewModel$verifyQrCode$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$qrValue = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$verifyQrCode$1(this.this$0, this.$qrValue, continuation);
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
        String m14321f;
        OneVerifyQrCodeResponse oneVerifyQrCodeResponse;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        MutableStateFlow mutableStateFlow7;
        MutableStateFlow mutableStateFlow8;
        MutableStateFlow mutableStateFlow9;
        MutableStateFlow mutableStateFlow10;
        CompanyThemes m14323d;
        MutableStateFlow mutableStateFlow11;
        MutableStateFlow mutableStateFlow12;
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
                mutableStateFlow5 = this.this$0.f90962h;
                do {
                    value5 = mutableStateFlow5.getValue();
                    OneVerifyQrCodeState oneVerifyQrCodeState = (OneVerifyQrCodeState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, OneVerifyQrCodeState.Loading.INSTANCE));
                oneConsentAndESignRepository = this.this$0.f90956b;
                m14321f = this.this$0.m14321f(this.$qrValue);
                OneVerifyQrCodeRequest oneVerifyQrCodeRequest = new OneVerifyQrCodeRequest(StringHelperKt.toBase64(m14321f));
                this.label = 1;
                obj = oneConsentAndESignRepository.verifyQrCode(oneVerifyQrCodeRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oneVerifyQrCodeResponse = (OneVerifyQrCodeResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f90962h;
            do {
                value4 = mutableStateFlow4.getValue();
                OneVerifyQrCodeState oneVerifyQrCodeState2 = (OneVerifyQrCodeState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new OneVerifyQrCodeState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f90962h;
                do {
                    value2 = mutableStateFlow2.getValue();
                    OneVerifyQrCodeState oneVerifyQrCodeState3 = (OneVerifyQrCodeState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new OneVerifyQrCodeState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                errorUserId = this.this$0.getErrorUserId();
                copy = r1.copy((r18 & 1) != 0 ? r1.codeType : null, (r18 & 2) != 0 ? r1.code : null, (r18 & 4) != 0 ? r1.desc : null, (r18 & 8) != 0 ? r1.userId : errorUserId, (r18 & 16) != 0 ? r1.systemMessage : null, (r18 & 32) != 0 ? r1.replaceMessage : null, (r18 & 64) != 0 ? r1.responseDateTime : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).data : null);
                mutableStateFlow3 = this.this$0.f90962h;
                do {
                    value3 = mutableStateFlow3.getValue();
                    OneVerifyQrCodeState oneVerifyQrCodeState4 = (OneVerifyQrCodeState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new OneVerifyQrCodeState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f90962h;
            do {
                value = mutableStateFlow.getValue();
                OneVerifyQrCodeState oneVerifyQrCodeState5 = (OneVerifyQrCodeState) value;
                message = e2.getMessage();
                if (message == null) {
                    message = "Can't save order";
                }
            } while (!mutableStateFlow.compareAndSet(value, new OneVerifyQrCodeState.ErrorMessage(message)));
        }
        if (!Intrinsics.areEqual(oneVerifyQrCodeResponse.getCode(), "200")) {
            mutableStateFlow12 = this.this$0.f90962h;
            OneConsentAndESignViewModel oneConsentAndESignViewModel = this.this$0;
            do {
                value7 = mutableStateFlow12.getValue();
                OneVerifyQrCodeState oneVerifyQrCodeState6 = (OneVerifyQrCodeState) value7;
                errorUserId2 = oneConsentAndESignViewModel.getErrorUserId();
            } while (!mutableStateFlow12.compareAndSet(value7, new OneVerifyQrCodeState.Error(oneVerifyQrCodeResponse.toCommonErrorResponse(errorUserId2))));
            return Unit.INSTANCE;
        }
        mutableStateFlow6 = this.this$0.f90962h;
        OneConsentAndESignViewModel oneConsentAndESignViewModel2 = this.this$0;
        do {
            value6 = mutableStateFlow6.getValue();
            OneVerifyQrCodeState oneVerifyQrCodeState7 = (OneVerifyQrCodeState) value6;
            mutableStateFlow7 = oneConsentAndESignViewModel2.f90946J;
            mutableStateFlow7.setValue(oneVerifyQrCodeResponse.getData().getOrderId());
            List<String> activity = oneVerifyQrCodeResponse.getData().getActivity();
            LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC11695c.coerceAtLeast(AbstractC18946Zn0.mapCapacity(AbstractC10172es.collectionSizeOrDefault(activity, 10)), 16));
            for (Object obj2 : activity) {
                String str3 = (String) obj2;
                String str4 = (String) obj2;
                linkedHashMap.put(str3, Boxing.boxBoolean(false));
            }
            mutableStateFlow8 = oneConsentAndESignViewModel2.f90972r;
            mutableStateFlow8.setValue(new ValidateDocApproved(linkedHashMap));
            if (Intrinsics.areEqual(oneVerifyQrCodeResponse.getData().getAppName(), "SmartUI")) {
                mutableStateFlow11 = oneConsentAndESignViewModel2.f90938B;
                mutableStateFlow11.setValue(CompanyThemes.ONE_TRUE);
            } else {
                oneConsentAndESignViewModel2.m14319h(oneVerifyQrCodeResponse);
                oneConsentAndESignViewModel2.m14318i(oneVerifyQrCodeResponse);
                mutableStateFlow9 = oneConsentAndESignViewModel2.f90946J;
                mutableStateFlow9.setValue(((EngagedParty) CollectionsKt___CollectionsKt.first((List<? extends Object>) oneVerifyQrCodeResponse.getData().getEngagedParty())).getId());
                mutableStateFlow10 = oneConsentAndESignViewModel2.f90938B;
                m14323d = oneConsentAndESignViewModel2.m14323d(((EngagedParty) CollectionsKt___CollectionsKt.first((List<? extends Object>) oneVerifyQrCodeResponse.getData().getEngagedParty())).getName());
                mutableStateFlow10.setValue(m14323d);
            }
        } while (!mutableStateFlow6.compareAndSet(value6, new OneVerifyQrCodeState.Success(oneVerifyQrCodeResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$verifyQrCode$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}