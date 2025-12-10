package coil.fetch;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@DebugMetadata(m28801c = "coil.fetch.HttpUriFetcher", m28800f = "HttpUriFetcher.kt", m28799i = {0, 0, 0, 1, 1, 1}, m28798l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID, 106}, m28797m = RemoteConfigComponent.FETCH_FILE_NAME, m28796n = {"this", "snapshot", "cacheStrategy", "this", "snapshot", "response"}, m28795s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class HttpUriFetcher$fetch$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HttpUriFetcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpUriFetcher$fetch$1(HttpUriFetcher httpUriFetcher, Continuation<? super HttpUriFetcher$fetch$1> continuation) {
        super(continuation);
        this.this$0 = httpUriFetcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.fetch(this);
    }
}
