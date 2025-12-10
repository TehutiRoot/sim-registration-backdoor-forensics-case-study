package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "kotlinx.coroutines.flow.FlowKt__LimitKt", m28800f = "Limit.kt", m28799i = {0}, m28798l = {73}, m28797m = "emitAbort$FlowKt__LimitKt", m28796n = {"$this$emitAbort"}, m28795s = {"L$0"})
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
        Object m27003e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m27003e = FlowKt__LimitKt.m27003e(null, null, this);
        return m27003e;
    }
}
