package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.checkPort;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.state.SubmitOrderState;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.checkPort.CheckPortScreenKt$CheckPortScreen$1$2", m29092f = "CheckPortScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.checkPort.CheckPortScreenKt$CheckPortScreen$1$2 */
/* loaded from: classes10.dex */
public final class CheckPortScreenKt$CheckPortScreen$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<SaveOrderResponse, Unit> $onAppointmentPrimary;
    final /* synthetic */ SubmitOrderState $submitOrderState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckPortScreenKt$CheckPortScreen$1$2(Function1<? super SaveOrderResponse, Unit> function1, SubmitOrderState submitOrderState, Continuation<? super CheckPortScreenKt$CheckPortScreen$1$2> continuation) {
        super(2, continuation);
        this.$onAppointmentPrimary = function1;
        this.$submitOrderState = submitOrderState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new CheckPortScreenKt$CheckPortScreen$1$2(this.$onAppointmentPrimary, this.$submitOrderState, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onAppointmentPrimary.invoke(((SubmitOrderState.AppointmentPrimaryFull) this.$submitOrderState).getResult());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((CheckPortScreenKt$CheckPortScreen$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}