package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 5, 1}, m28846xi = 48)
@DebugMetadata(m28801c = "androidx.datastore.core.SingleProcessDataStore", m28800f = "SingleProcessDataStore.kt", m28799i = {0, 0, 0}, m28798l = {402, 410}, m28797m = "transformAndWrite", m28796n = {"this", "curDataAndHash", "curData"}, m28795s = {"L$0", "L$1", "L$2"})
/* loaded from: classes2.dex */
public final class SingleProcessDataStore$transformAndWrite$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$1(SingleProcessDataStore<T> singleProcessDataStore, Continuation<? super SingleProcessDataStore$transformAndWrite$1> continuation) {
        super(continuation);
        this.this$0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m56279j;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m56279j = this.this$0.m56279j(null, null, this);
        return m56279j;
    }
}
