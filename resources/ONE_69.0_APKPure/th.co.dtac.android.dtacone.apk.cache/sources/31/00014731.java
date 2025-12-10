package th.p047co.dtac.android.dtacone.view.compose.upPass;

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
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormResult;
import th.p047co.dtac.android.dtacone.viewmodel.upPass.UpPassViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.compose.upPass.IdDocOcrFaceCompareLivenessNavGraphKt$idDocOcrFaceCompareLivenessNavGraph$4$2$4$proceed$1", m29092f = "IdDocOcrFaceCompareLivenessNavGraph.kt", m29091i = {}, m29090l = {225}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.IdDocOcrFaceCompareLivenessNavGraphKt$idDocOcrFaceCompareLivenessNavGraph$4$2$4$proceed$1 */
/* loaded from: classes10.dex */
public final class C15733xbe652b4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Function2<UpPassFormResult, Continuation<? super Boolean>, Object> $onValidation;
    final /* synthetic */ UpPassViewModel $upPassViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15733xbe652b4(Function2<? super UpPassFormResult, ? super Continuation<? super Boolean>, ? extends Object> function2, UpPassViewModel upPassViewModel, Continuation<? super C15733xbe652b4> continuation) {
        super(2, continuation);
        this.$onValidation = function2;
        this.$upPassViewModel = upPassViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C15733xbe652b4(this.$onValidation, this.$upPassViewModel, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
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
            Function2<UpPassFormResult, Continuation<? super Boolean>, Object> function2 = this.$onValidation;
            UpPassFormResult formResult = this.$upPassViewModel.getFormResult();
            this.label = 1;
            obj = function2.invoke(formResult, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
        return ((C15733xbe652b4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}