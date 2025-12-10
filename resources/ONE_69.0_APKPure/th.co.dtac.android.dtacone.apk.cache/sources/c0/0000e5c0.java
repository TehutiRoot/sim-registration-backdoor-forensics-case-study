package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m29092f = "Limit.kt", m29091i = {0}, m29090l = {73}, m29089m = "emitAbort$FlowKt__LimitKt", m29088n = {"$this$emitAbort"}, m29087s = {"L$0"})
/* loaded from: classes6.dex */
public final class FlowKt__LimitKt$emitAbort$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public FlowKt__LimitKt$emitAbort$1(Continuation<? super FlowKt__LimitKt$emitAbort$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m27295e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27295e = FlowKt__LimitKt.m27295e(null, null, this);
        return m27295e;
    }
}