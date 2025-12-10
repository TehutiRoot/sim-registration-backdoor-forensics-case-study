package th.p047co.dtac.android.dtacone.view.appOne.eSign.viewModel;

import java.util.List;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelco;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.model.DocumentType;
import th.p047co.dtac.android.dtacone.viewmodel.state.ConsentState;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$setConsentNonTelcoAgree$1", m29092f = "OneConsentAndESignViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneConsentAndESignViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$setConsentNonTelcoAgree$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,1159:1\n230#2,5:1160\n*S KotlinDebug\n*F\n+ 1 OneConsentAndESignViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/eSign/viewModel/OneConsentAndESignViewModel$setConsentNonTelcoAgree$1\n*L\n641#1:1160,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.viewModel.OneConsentAndESignViewModel$setConsentNonTelcoAgree$1 */
/* loaded from: classes10.dex */
public final class OneConsentAndESignViewModel$setConsentNonTelcoAgree$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $agree;
    final /* synthetic */ DocumentType $documentType;
    int label;
    final /* synthetic */ OneConsentAndESignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneConsentAndESignViewModel$setConsentNonTelcoAgree$1(OneConsentAndESignViewModel oneConsentAndESignViewModel, DocumentType documentType, boolean z, Continuation<? super OneConsentAndESignViewModel$setConsentNonTelcoAgree$1> continuation) {
        super(2, continuation);
        this.this$0 = oneConsentAndESignViewModel;
        this.$documentType = documentType;
        this.$agree = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneConsentAndESignViewModel$setConsentNonTelcoAgree$1(this.this$0, this.$documentType, this.$agree, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Object value;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0.f90978x;
            if (mutableStateFlow.getValue() instanceof ConsentState.Success) {
                mutableStateFlow2 = this.this$0.f90978x;
                Object value2 = mutableStateFlow2.getValue();
                Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type th.co.dtac.android.dtacone.viewmodel.state.ConsentState.Success");
                List<ConsentNonTelco> consents = ((ConsentState.Success) value2).getConsents();
                mutableStateFlow3 = this.this$0.f90978x;
                boolean z = this.$agree;
                do {
                    value = mutableStateFlow3.getValue();
                    ConsentState consentState = (ConsentState) value;
                } while (!mutableStateFlow3.compareAndSet(value, new ConsentState.Success(consents, Boxing.boxBoolean(z))));
                this.this$0.updateValidateDocApproved(this.$documentType.getDocType(), true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneConsentAndESignViewModel$setConsentNonTelcoAgree$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}