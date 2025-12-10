package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
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
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.ReserveServiceNumbResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {TypedValues.Custom.TYPE_DIMENSION}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,5:2378\n230#2,5:2383\n230#2,5:2388\n230#2,5:2393\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1\n*L\n907#1:2373,5\n910#1:2378,5\n920#1:2383,5\n923#1:2388,5\n926#1:2393,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $phoneNumber;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, String str, Continuation<? super OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
        this.$phoneNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1(this.this$0, this.$phoneNumber, continuation);
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
        MutableStateFlow mutableStateFlow3;
        Object value3;
        ResponseBody errorBody;
        Object reserveServiceNumbFlp;
        ReserveServiceNumbResponse reserveServiceNumbResponse;
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
                    reserveServiceNumbFlp = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                OneTolRepository oneTolRepository = this.this$0.f98221c;
                String str3 = this.$phoneNumber;
                this.label = 1;
                reserveServiceNumbFlp = oneTolRepository.reserveServiceNumbFlp(str3, this);
                if (reserveServiceNumbFlp == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            reserveServiceNumbResponse = (ReserveServiceNumbResponse) reserveServiceNumbFlp;
        } catch (HttpException e) {
            Response<?> response = e.response();
            if (response != null && (errorBody = response.errorBody()) != null) {
                str = errorBody.string();
            } else {
                str = null;
            }
            if (response == null || (headers = response.headers()) == null || (str2 = headers.get("Content-Type")) == null || !StringsKt__StringsKt.contains$default((CharSequence) str2, (CharSequence) "application/json", false, 2, (Object) null)) {
                mutableStateFlow2 = this.this$0.f98272v0;
                do {
                    value2 = mutableStateFlow2.getValue();
                    ((Boolean) value2).booleanValue();
                } while (!mutableStateFlow2.compareAndSet(value2, Boxing.boxBoolean(true)));
            } else {
                Object fromJson = new Gson().fromJson(str, (Class<Object>) CommonErrorResponse.class);
                Intrinsics.checkNotNullExpressionValue(fromJson, "Gson().fromJson(body, Co…rrorResponse::class.java)");
                r5.copy((r18 & 1) != 0 ? r5.f97859a : null, (r18 & 2) != 0 ? r5.f97860b : null, (r18 & 4) != 0 ? r5.f97861c : null, (r18 & 8) != 0 ? r5.f97862d : this.this$0.f98221c.getErrorUserId(), (r18 & 16) != 0 ? r5.f97863e : null, (r18 & 32) != 0 ? r5.f97864f : null, (r18 & 64) != 0 ? r5.f97865g : null, (r18 & 128) != 0 ? ((CommonErrorResponse) fromJson).f97866h : null);
                mutableStateFlow3 = this.this$0.f98272v0;
                do {
                    value3 = mutableStateFlow3.getValue();
                    ((Boolean) value3).booleanValue();
                } while (!mutableStateFlow3.compareAndSet(value3, Boxing.boxBoolean(true)));
            }
        } catch (Exception unused) {
            mutableStateFlow = this.this$0.f98272v0;
            do {
                value = mutableStateFlow.getValue();
                ((Boolean) value).booleanValue();
            } while (!mutableStateFlow.compareAndSet(value, Boxing.boxBoolean(true)));
        }
        if (Intrinsics.areEqual(reserveServiceNumbResponse.getCode(), "200") || Intrinsics.areEqual(reserveServiceNumbResponse.getCodeType(), "S")) {
            mutableStateFlow4 = this.this$0.f98272v0;
            do {
                value4 = mutableStateFlow4.getValue();
                ((Boolean) value4).booleanValue();
            } while (!mutableStateFlow4.compareAndSet(value4, Boxing.boxBoolean(false)));
            return Unit.INSTANCE;
        }
        mutableStateFlow5 = this.this$0.f98272v0;
        do {
            value5 = mutableStateFlow5.getValue();
            ((Boolean) value5).booleanValue();
        } while (!mutableStateFlow5.compareAndSet(value5, Boxing.boxBoolean(true)));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$mockCheckValidatePhoneNumber$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}