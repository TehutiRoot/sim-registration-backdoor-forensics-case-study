package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 5, 1}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.datastore.core.SingleProcessDataStore", m29092f = "SingleProcessDataStore.kt", m29091i = {0, 0, 1, 1, 1, 2}, m29090l = {322, 348, 505}, m29089m = "readAndInit", m29088n = {"updateLock", "initData", "updateLock", "initData", "initializationComplete", "$this$withLock_u24default$iv"}, m29087s = {"L$1", "L$2", "L$1", "L$2", "L$3", "L$3"})
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readAndInit$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readAndInit$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$readAndInit$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m56234e;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m56234e = this.this$0.m56234e(this);
        return m56234e;
    }
}