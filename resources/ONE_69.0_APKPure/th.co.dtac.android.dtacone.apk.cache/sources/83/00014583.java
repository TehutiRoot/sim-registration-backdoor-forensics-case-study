package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

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
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignWaiveReasonResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.EntryFeeReasonState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getEntryFeeReason$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {1177}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getEntryFeeReason$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,3:2378\n233#2,2:2382\n230#2,5:2384\n230#2,5:2389\n230#2,5:2394\n230#2,5:2399\n230#2,5:2404\n1#3:2381\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getEntryFeeReason$1\n*L\n1175#1:2373,5\n1179#1:2378,3\n1179#1:2382,2\n1186#1:2384,5\n1195#1:2389,5\n1197#1:2394,5\n1200#1:2399,5\n1202#1:2404,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getEntryFeeReason$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$getEntryFeeReason$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$getEntryFeeReason$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$getEntryFeeReason$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$getEntryFeeReason$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
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
        CampaignWaiveReasonResponse campaignWaiveReasonResponse;
        MutableStateFlow mutableStateFlow6;
        Object value6;
        MutableStateFlow mutableStateFlow7;
        Object value7;
        String desc;
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
                mutableStateFlow5 = this.this$0.f98173E0;
                do {
                    value5 = mutableStateFlow5.getValue();
                    EntryFeeReasonState entryFeeReasonState = (EntryFeeReasonState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, EntryFeeReasonState.Loading.INSTANCE));
                OneTolRepository oneTolRepository = this.this$0.f98221c;
                this.label = 1;
                obj = oneTolRepository.getCampaignWaiveReason(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            campaignWaiveReasonResponse = (CampaignWaiveReasonResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f98173E0;
            do {
                value4 = mutableStateFlow4.getValue();
                EntryFeeReasonState entryFeeReasonState2 = (EntryFeeReasonState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new EntryFeeReasonState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f98173E0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    EntryFeeReasonState entryFeeReasonState3 = (EntryFeeReasonState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new EntryFeeReasonState.ErrorMessage(String.valueOf(e.getMessage()))));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                copy = r1.copy((r18 & 1) != 0 ? r1.f97859a : null, (r18 & 2) != 0 ? r1.f97860b : null, (r18 & 4) != 0 ? r1.f97861c : null, (r18 & 8) != 0 ? r1.f97862d : this.this$0.f98221c.getErrorUserId(), (r18 & 16) != 0 ? r1.f97863e : null, (r18 & 32) != 0 ? r1.f97864f : null, (r18 & 64) != 0 ? r1.f97865g : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).f97866h : null);
                mutableStateFlow3 = this.this$0.f98173E0;
                do {
                    value3 = mutableStateFlow3.getValue();
                    EntryFeeReasonState entryFeeReasonState4 = (EntryFeeReasonState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new EntryFeeReasonState.Error(copy)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f98173E0;
            do {
                value = mutableStateFlow.getValue();
                EntryFeeReasonState entryFeeReasonState5 = (EntryFeeReasonState) value;
            } while (!mutableStateFlow.compareAndSet(value, new EntryFeeReasonState.ErrorMessage(String.valueOf(e2.getMessage()))));
        }
        if (!Intrinsics.areEqual(campaignWaiveReasonResponse.getCode(), "200")) {
            mutableStateFlow7 = this.this$0.f98173E0;
            do {
                value7 = mutableStateFlow7.getValue();
                EntryFeeReasonState entryFeeReasonState6 = (EntryFeeReasonState) value7;
                desc = campaignWaiveReasonResponse.getDesc();
                if (desc.length() == 0) {
                    desc = "Get discount list failed.";
                }
            } while (!mutableStateFlow7.compareAndSet(value7, new EntryFeeReasonState.ErrorMessage(desc)));
            return Unit.INSTANCE;
        }
        mutableStateFlow6 = this.this$0.f98173E0;
        do {
            value6 = mutableStateFlow6.getValue();
            EntryFeeReasonState entryFeeReasonState7 = (EntryFeeReasonState) value6;
        } while (!mutableStateFlow6.compareAndSet(value6, new EntryFeeReasonState.Success(campaignWaiveReasonResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$getEntryFeeReason$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}