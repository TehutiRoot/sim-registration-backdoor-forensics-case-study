package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.util.Constant;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getConsentNonTelco$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {1835}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getConsentNonTelco$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n230#2,5:2378\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$getConsentNonTelco$1\n*L\n1834#1:2373,5\n1836#1:2378,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$getConsentNonTelco$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$getConsentNonTelco$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$getConsentNonTelco$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$getConsentNonTelco$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$getConsentNonTelco$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object value;
        Object value2;
        Object errorMessage;
        Object coroutine_suspended = AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow mutableStateFlow = this.this$0.f98207V0;
            do {
                value = mutableStateFlow.getValue();
                ConsentState consentState = (ConsentState) value;
            } while (!mutableStateFlow.compareAndSet(value, ConsentState.Loading.INSTANCE));
            OneTolRepository oneTolRepository = this.this$0.f98221c;
            this.label = 1;
            obj = oneTolRepository.getOneConsentData(Constant.ConsentDomain.PDPA, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        OneConsentDataTmnResponse oneConsentDataTmnResponse = (OneConsentDataTmnResponse) obj;
        MutableStateFlow mutableStateFlow2 = this.this$0.f98207V0;
        do {
            value2 = mutableStateFlow2.getValue();
            ConsentState consentState2 = (ConsentState) value2;
            ConsentNonTelcoResponse data = oneConsentDataTmnResponse.getData();
            if (data != null) {
                List<ConsentNonTelco> consent = data.getConsent();
                if (consent == null) {
                    consent = CollectionsKt__CollectionsKt.emptyList();
                }
                errorMessage = new ConsentState.Success(consent, null, 2, null);
            } else {
                String desc = oneConsentDataTmnResponse.getDesc();
                if (desc == null) {
                    desc = "Can't get consent data";
                }
                errorMessage = new ConsentState.ErrorMessage(desc);
            }
        } while (!mutableStateFlow2.compareAndSet(value2, errorMessage));
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$getConsentNonTelco$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}