package coil.network;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import okhttp3.MediaType;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, m28850d2 = {"<anonymous>", "Lokhttp3/MediaType;", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class CacheResponse$contentType$2 extends Lambda implements Function0<MediaType> {
    final /* synthetic */ CacheResponse this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CacheResponse$contentType$2(CacheResponse cacheResponse) {
        super(0);
        this.this$0 = cacheResponse;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final MediaType invoke() {
        String str = this.this$0.getResponseHeaders().get("Content-Type");
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }
}
