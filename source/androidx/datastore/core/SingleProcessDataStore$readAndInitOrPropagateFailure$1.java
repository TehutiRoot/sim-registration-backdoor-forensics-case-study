package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.datastore.core.SingleProcessDataStore", m28800f = "SingleProcessDataStore.kt", m28799i = {0}, m28798l = {311}, m28797m = "readAndInitOrPropagateFailure", m28796n = {"this"}, m28795s = {"L$0"})
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
        Object m56282g;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m56282g = this.this$0.m56282g(this);
        return m56282g;
    }
}
