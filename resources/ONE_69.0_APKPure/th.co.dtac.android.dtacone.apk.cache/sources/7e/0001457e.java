package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import com.google.gson.Gson;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
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
import th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.CampaignPackageListState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getCampaignList$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {849}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getCampaignList$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,3:2378\n233#2,2:2382\n230#2,5:2384\n230#2,5:2389\n230#2,5:2394\n230#2,5:2399\n230#2,5:2404\n1#3:2381\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getCampaignList$1\n*L\n847#1:2373,5\n851#1:2378,3\n851#1:2382,2\n859#1:2384,5\n868#1:2389,5\n875#1:2394,5\n878#1:2399,5\n880#1:2404,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getCampaignList$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$getCampaignList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$getCampaignList$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$getCampaignList$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$getCampaignList$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        String str;
        String str2;
        MutableStateFlow mutableStateFlow2;
        Object value2;
        List<String> groupValues;
        String str3;
        List<String> groupValues2;
        Headers headers;
        String str4;
        CommonErrorResponse copy;
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        MutableStateFlow mutableStateFlow4;
        Object value4;
        MutableStateFlow mutableStateFlow5;
        Object value5;
        CampaignResponse campaignResponse;
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
                mutableStateFlow5 = this.this$0.f98260p0;
                do {
                    value5 = mutableStateFlow5.getValue();
                    CampaignPackageListState campaignPackageListState = (CampaignPackageListState) value5;
                } while (!mutableStateFlow5.compareAndSet(value5, CampaignPackageListState.Loading.INSTANCE));
                OneTolRepository oneTolRepository = this.this$0.f98221c;
                this.label = 1;
                obj = oneTolRepository.getCampaignPackageList(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            campaignResponse = (CampaignResponse) obj;
        } catch (SocketTimeoutException unused) {
            mutableStateFlow4 = this.this$0.f98260p0;
            do {
                value4 = mutableStateFlow4.getValue();
                CampaignPackageListState campaignPackageListState2 = (CampaignPackageListState) value4;
            } while (!mutableStateFlow4.compareAndSet(value4, new CampaignPackageListState.ErrorResId(R.string.request_timeout_try_again)));
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response != null && (headers = response.headers()) != null && (str4 = headers.get("Content-Type")) != null && StringsKt__StringsKt.contains$default((CharSequence) str4, (CharSequence) "application/json", false, 2, (Object) null)) {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                copy = r1.copy((r18 & 1) != 0 ? r1.f97859a : null, (r18 & 2) != 0 ? r1.f97860b : null, (r18 & 4) != 0 ? r1.f97861c : null, (r18 & 8) != 0 ? r1.f97862d : this.this$0.f98221c.getErrorUserId(), (r18 & 16) != 0 ? r1.f97863e : null, (r18 & 32) != 0 ? r1.f97864f : null, (r18 & 64) != 0 ? r1.f97865g : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).f97866h : null);
                mutableStateFlow3 = this.this$0.f98260p0;
                do {
                    value3 = mutableStateFlow3.getValue();
                    CampaignPackageListState campaignPackageListState3 = (CampaignPackageListState) value3;
                } while (!mutableStateFlow3.compareAndSet(value3, new CampaignPackageListState.Error(copy)));
            } else {
                Regex regex = new Regex("<h1>(.*?)</h1>");
                Regex regex2 = new Regex("<h2>(.*?)</h2>");
                String str5 = "";
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                MatchResult find$default = Regex.find$default(regex, str2, 0, 2, null);
                String str6 = (find$default == null || (groupValues2 = find$default.getGroupValues()) == null || (str6 = groupValues2.get(1)) == null) ? "" : "";
                if (str == null) {
                    str = "";
                }
                MatchResult find$default2 = Regex.find$default(regex2, str, 0, 2, null);
                if (find$default2 != null && (groupValues = find$default2.getGroupValues()) != null && (str3 = groupValues.get(1)) != null) {
                    str5 = str3;
                }
                String str7 = str6 + "\n" + str5;
                if (str7.length() == 0) {
                    str7 = String.valueOf(e.getMessage());
                }
                String str8 = str7;
                mutableStateFlow2 = this.this$0.f98260p0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    CampaignPackageListState campaignPackageListState4 = (CampaignPackageListState) value2;
                } while (!mutableStateFlow2.compareAndSet(value2, new CampaignPackageListState.ErrorMessage(str8)));
            }
        } catch (Exception e2) {
            mutableStateFlow = this.this$0.f98260p0;
            do {
                value = mutableStateFlow.getValue();
                CampaignPackageListState campaignPackageListState5 = (CampaignPackageListState) value;
            } while (!mutableStateFlow.compareAndSet(value, new CampaignPackageListState.ErrorMessage(String.valueOf(e2.getMessage()))));
        }
        if (!Intrinsics.areEqual(campaignResponse.getCode(), "200")) {
            mutableStateFlow7 = this.this$0.f98260p0;
            do {
                value7 = mutableStateFlow7.getValue();
                CampaignPackageListState campaignPackageListState6 = (CampaignPackageListState) value7;
                desc = campaignResponse.getDesc();
                if (desc.length() == 0) {
                    desc = "Get discount list failed.";
                }
            } while (!mutableStateFlow7.compareAndSet(value7, new CampaignPackageListState.ErrorMessage(desc)));
            return Unit.INSTANCE;
        }
        this.this$0.f98221c.setCompanyCode(campaignResponse.getData().getCompanyCode());
        mutableStateFlow6 = this.this$0.f98260p0;
        do {
            value6 = mutableStateFlow6.getValue();
            CampaignPackageListState campaignPackageListState7 = (CampaignPackageListState) value6;
        } while (!mutableStateFlow6.compareAndSet(value6, new CampaignPackageListState.Success(campaignResponse)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$getCampaignList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}