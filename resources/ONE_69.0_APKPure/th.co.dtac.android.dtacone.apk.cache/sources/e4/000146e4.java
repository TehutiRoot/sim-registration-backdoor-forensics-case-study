package th.p047co.dtac.android.dtacone.view.compose.upPass;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "th.co.dtac.android.dtacone.view.compose.upPass.FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1", m29092f = "FaceCompareNavGraph.kt", m29091i = {}, m29090l = {}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* renamed from: th.co.dtac.android.dtacone.view.compose.upPass.FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1 */
/* loaded from: classes10.dex */
public final class FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $reCreateForm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1(Function0<Unit> function0, Continuation<? super FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1> continuation) {
        super(2, continuation);
        this.$reCreateForm = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1(this.$reCreateForm, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AbstractC19782eg0.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$reCreateForm.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FaceCompareNavGraphKt$faceCompareNavGraph$3$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}