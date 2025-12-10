package androidx.compose.p003ui.viewinterop;

import androidx.compose.p003ui.input.nestedscroll.NestedScrollDispatcher;
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

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m28850d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", m28800f = "AndroidViewHolder.android.kt", m28799i = {}, m28798l = {540}, m28797m = "invokeSuspend", m28796n = {}, m28795s = {})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1 */
/* loaded from: classes2.dex */
public final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j, Continuation<? super AndroidViewHolder$onNestedPreFling$1> continuation) {
        super(2, continuation);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        Object coroutine_suspended = AbstractC18812Yf0.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            nestedScrollDispatcher = this.this$0.f31777b;
            long j = this.$toBeConsumed;
            this.label = 1;
            if (nestedScrollDispatcher.m72618dispatchPreFlingQWom1Mo(j, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
