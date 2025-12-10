package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 9, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "kotlinx.serialization.json.internal.JsonTreeReader", m29092f = "JsonTreeReader.kt", m29091i = {0, 0, 0, 0}, m29090l = {24}, m29089m = "readObject", m29088n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m29087s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes6.dex */
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, Continuation<? super JsonTreeReader$readObject$2> continuation) {
        super(continuation);
        this.this$0 = jsonTreeReader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m26915c;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m26915c = this.this$0.m26915c(null, this);
        return m26915c;
    }
}