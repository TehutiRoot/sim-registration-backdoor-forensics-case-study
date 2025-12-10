package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 5, 1}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.datastore.core.SingleProcessDataStore", m29092f = "SingleProcessDataStore.kt", m29091i = {0}, m29090l = {311}, m29089m = "readAndInitOrPropagateFailure", m29088n = {"this"}, m29087s = {"L$0"})
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readAndInitOrPropagateFailure$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInitOrPropagateFailure$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$readAndInitOrPropagateFailure$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m56232g;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m56232g = this.this$0.m56232g(this);
        return m56232g;
    }
}