package coil.intercept;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@DebugMetadata(m29093c = "coil.intercept.EngineInterceptor", m29092f = "EngineInterceptor.kt", m29091i = {0, 0, 0, 0, 0, 0, 0, 0}, m29090l = {165}, m29089m = RemoteConfigComponent.FETCH_FILE_NAME, m29088n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, m29087s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
/* loaded from: classes3.dex */
public final class EngineInterceptor$fetch$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EngineInterceptor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$fetch$1(EngineInterceptor engineInterceptor, Continuation<? super EngineInterceptor$fetch$1> continuation) {
        super(continuation);
        this.this$0 = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m51058d;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m51058d = this.this$0.m51058d(null, null, null, null, null, this);
        return m51058d;
    }
}