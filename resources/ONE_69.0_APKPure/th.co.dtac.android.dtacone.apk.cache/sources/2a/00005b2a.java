package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.compose.material3.SwipeableV2State", m29092f = "SwipeableV2.kt", m29091i = {0}, m29090l = {350}, m29089m = "animateTo", m29088n = {"this"}, m29087s = {"L$0"})
/* loaded from: classes2.dex */
public final class SwipeableV2State$animateTo$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableV2State<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableV2State$animateTo$1(SwipeableV2State<T> swipeableV2State, Continuation<? super SwipeableV2State$animateTo$1> continuation) {
        super(continuation);
        this.this$0 = swipeableV2State;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.animateTo(null, 0.0f, this);
    }
}