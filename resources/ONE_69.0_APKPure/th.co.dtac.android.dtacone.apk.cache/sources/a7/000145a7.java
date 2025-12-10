package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.CustomerInformation;
import th.p047co.dtac.android.dtacone.view.appOne.tol.repository.OneTolRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1\n*L\n1624#1:2373,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $birthday;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1(String str, OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, Continuation<? super OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1> continuation) {
        super(2, continuation);
        this.$birthday = str;
        this.this$0 = oneRegisterTrueOnlineViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1(this.$birthday, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        CustomerInformation copy;
        Object value;
        CustomerInformation copy2;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.$birthday;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Date date = DateFormatExtKt.toDate(str, "dd/MM/yyyy", US);
            OneTolRepository oneTolRepository = this.this$0.f98221c;
            copy = r4.copy((r24 & 1) != 0 ? r4.f97990a : null, (r24 & 2) != 0 ? r4.f97991b : null, (r24 & 4) != 0 ? r4.f97992c : date, (r24 & 8) != 0 ? r4.f97993d : null, (r24 & 16) != 0 ? r4.f97994e : null, (r24 & 32) != 0 ? r4.f97995f : null, (r24 & 64) != 0 ? r4.f97996g : null, (r24 & 128) != 0 ? r4.f97997h : null, (r24 & 256) != 0 ? r4.f97998i : null, (r24 & 512) != 0 ? r4.f97999j : null, (r24 & 1024) != 0 ? this.this$0.f98221c.getCustomerInfo().f98000k : null);
            oneTolRepository.setCustomerInfo(copy);
            MutableStateFlow mutableStateFlow = this.this$0.f98194P;
            do {
                value = mutableStateFlow.getValue();
                copy2 = r4.copy((r24 & 1) != 0 ? r4.f97990a : null, (r24 & 2) != 0 ? r4.f97991b : null, (r24 & 4) != 0 ? r4.f97992c : date, (r24 & 8) != 0 ? r4.f97993d : null, (r24 & 16) != 0 ? r4.f97994e : null, (r24 & 32) != 0 ? r4.f97995f : null, (r24 & 64) != 0 ? r4.f97996g : null, (r24 & 128) != 0 ? r4.f97997h : null, (r24 & 256) != 0 ? r4.f97998i : null, (r24 & 512) != 0 ? r4.f97999j : null, (r24 & 1024) != 0 ? ((CustomerInformation) value).f98000k : null);
            } while (!mutableStateFlow.compareAndSet(value, copy2));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$setCustomerInfoBirthday$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}