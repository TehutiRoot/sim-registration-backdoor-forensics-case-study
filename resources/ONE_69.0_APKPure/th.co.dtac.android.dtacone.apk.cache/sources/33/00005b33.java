package androidx.compose.material3;

import androidx.compose.foundation.gestures.DragScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, m29142d2 = {"<anonymous>", "", "T"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.SwipeableV2State$swipeDraggableState$1$drag$2", m29092f = "SwipeableV2.kt", m29091i = {}, m29090l = {188}, m29089m = "invokeSuspend", m29088n = {}, m29087s = {})
/* loaded from: classes2.dex */
public final class SwipeableV2State$swipeDraggableState$1$drag$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<DragScope, Continuation<? super Unit>, Object> $block;
    int label;
    final /* synthetic */ SwipeableV2State$swipeDraggableState$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$swipeDraggableState$1$drag$2(Function2 function2, SwipeableV2State$swipeDraggableState$1 swipeableV2State$swipeDraggableState$1, Continuation continuation) {
        super(1, continuation);
        this.$block = function2;
        this.this$0 = swipeableV2State$swipeDraggableState$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new SwipeableV2State$swipeDraggableState$1$drag$2(this.$block, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SwipeableV2State$swipeDraggableState$1$dragScope$1 swipeableV2State$swipeDraggableState$1$dragScope$1;
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
            Function2<DragScope, Continuation<? super Unit>, Object> function2 = this.$block;
            swipeableV2State$swipeDraggableState$1$dragScope$1 = this.this$0.f26351a;
            this.label = 1;
            if (function2.invoke(swipeableV2State$swipeDraggableState$1$dragScope$1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable Continuation<? super Unit> continuation) {
        return ((SwipeableV2State$swipeDraggableState$1$drag$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}