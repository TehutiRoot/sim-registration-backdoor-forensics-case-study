package th.p047co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo;

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
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.PostCode;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$PostCodeList$1$1", m29092f = "InputInfoScreen.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.inputInfo.InputInfoScreenKt$PostCodeList$1$1 */
/* loaded from: classes10.dex */
public final class InputInfoScreenKt$PostCodeList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<PostCode, Unit> $onPostCodeSelect;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputInfoScreenKt$PostCodeList$1$1(Function1<? super PostCode, Unit> function1, Continuation<? super InputInfoScreenKt$PostCodeList$1$1> continuation) {
        super(2, continuation);
        this.$onPostCodeSelect = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new InputInfoScreenKt$PostCodeList$1$1(this.$onPostCodeSelect, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onPostCodeSelect.invoke(null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((InputInfoScreenKt$PostCodeList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}