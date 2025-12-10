package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 9, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "kotlinx.serialization.json.internal.JsonTreeReader", m28800f = "JsonTreeReader.kt", m28799i = {0, 0, 0, 0}, m28798l = {24}, m28797m = "readObject", m28796n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, m28795s = {"L$0", "L$1", "L$2", "L$3"})
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
        Object m26623c;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m26623c = this.this$0.m26623c(null, this);
        return m26623c;
    }
}
