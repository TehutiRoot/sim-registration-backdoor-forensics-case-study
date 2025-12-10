package th.p047co.dtac.android.dtacone.view.appOne.tol.screen;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$2$1", m29092f = "OneTolNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.screen.OneTolNavGraphKt$oneTolNavGraph$1$3$2$1 */
/* loaded from: classes10.dex */
public final class OneTolNavGraphKt$oneTolNavGraph$1$3$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $cardReaderMode$delegate;
    final /* synthetic */ State<Boolean> $isCardReaderConnected$delegate;
    final /* synthetic */ MutableState<Boolean> $showCardReaderDetectedDialog$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneTolNavGraphKt$oneTolNavGraph$1$3$2$1(State<Boolean> state, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super OneTolNavGraphKt$oneTolNavGraph$1$3$2$1> continuation) {
        super(2, continuation);
        this.$isCardReaderConnected$delegate = state;
        this.$cardReaderMode$delegate = mutableState;
        this.$showCardReaderDetectedDialog$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OneTolNavGraphKt$oneTolNavGraph$1$3$2$1(this.$isCardReaderConnected$delegate, this.$cardReaderMode$delegate, this.$showCardReaderDetectedDialog$delegate, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$0(this.$isCardReaderConnected$delegate) && !OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$7(this.$cardReaderMode$delegate)) {
                OneTolNavGraphKt$oneTolNavGraph$1$3.invoke$lambda$18(this.$showCardReaderDetectedDialog$delegate, true);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((OneTolNavGraphKt$oneTolNavGraph$1$3$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}