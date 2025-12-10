package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallContact;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.installation.InstallInformation;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onInstallContactChanged$1", m29092f = "OneRegisterTrueOnlineViewModel.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
@SourceDebugExtension({"SMAP\nOneRegisterTrueOnlineViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onInstallContactChanged$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,2372:1\n230#2,5:2373\n*S KotlinDebug\n*F\n+ 1 OneRegisterTrueOnlineViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/tol/viewmodel/OneRegisterTrueOnlineViewModel$onInstallContactChanged$1\n*L\n1631#1:2373,5\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel$onInstallContactChanged$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineViewModel$onInstallContactChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InstallContact $installContact;
    int label;
    final /* synthetic */ OneRegisterTrueOnlineViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineViewModel$onInstallContactChanged$1(OneRegisterTrueOnlineViewModel oneRegisterTrueOnlineViewModel, InstallContact installContact, Continuation<? super OneRegisterTrueOnlineViewModel$onInstallContactChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = oneRegisterTrueOnlineViewModel;
        this.$installContact = installContact;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneRegisterTrueOnlineViewModel$onInstallContactChanged$1(this.this$0, this.$installContact, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object value;
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.f98221c.setInstallInfo(InstallInformation.copy$default(this.this$0.f98221c.getInstallInfo(), this.$installContact, null, null, 6, null));
            MutableStateFlow mutableStateFlow = this.this$0.f98198R;
            InstallContact installContact = this.$installContact;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, InstallInformation.copy$default((InstallInformation) value, installContact, null, null, 6, null)));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneRegisterTrueOnlineViewModel$onInstallContactChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}