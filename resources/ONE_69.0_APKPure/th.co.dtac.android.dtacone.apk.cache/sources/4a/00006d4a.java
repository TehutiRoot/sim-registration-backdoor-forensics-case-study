package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 5, 1}, m29138xi = 48)
@DebugMetadata(m29093c = "androidx.datastore.core.SingleProcessDataStore", m29092f = "SingleProcessDataStore.kt", m29091i = {0, 1, 2, 2}, m29090l = {359, 362, 365}, m29089m = "readDataOrHandleCorruption", m29088n = {"this", "ex", "ex", "newData"}, m29087s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$readDataOrHandleCorruption$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$readDataOrHandleCorruption$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$readDataOrHandleCorruption$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m56230i;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m56230i = this.this$0.m56230i(this);
        return m56230i;
    }
}