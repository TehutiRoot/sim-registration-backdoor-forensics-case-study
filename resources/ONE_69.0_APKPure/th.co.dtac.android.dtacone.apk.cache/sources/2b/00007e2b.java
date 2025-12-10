package coil.network;

import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010%\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, m29142d2 = {"Lcoil/network/CacheResponse;", "", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "Lokhttp3/CacheControl;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lkotlin/Lazy;", "getCacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "Lokhttp3/MediaType;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getContentType", "()Lokhttp3/MediaType;", "contentType", "", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getSentRequestAtMillis", "()J", "sentRequestAtMillis", "d", "getReceivedResponseAtMillis", "receivedResponseAtMillis", "", "e", "Z", "isTls", "()Z", "Lokhttp3/Headers;", OperatorName.FILL_NON_ZERO, "Lokhttp3/Headers;", "getResponseHeaders", "()Lokhttp3/Headers;", "responseHeaders", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CacheResponse {

    /* renamed from: a */
    public final Lazy f40650a;

    /* renamed from: b */
    public final Lazy f40651b;

    /* renamed from: c */
    public final long f40652c;

    /* renamed from: d */
    public final long f40653d;

    /* renamed from: e */
    public final boolean f40654e;

    /* renamed from: f */
    public final Headers f40655f;

    public CacheResponse(@NotNull BufferedSource bufferedSource) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f40650a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new CacheResponse$cacheControl$2(this));
        this.f40651b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new CacheResponse$contentType$2(this));
        this.f40652c = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.f40653d = Long.parseLong(bufferedSource.readUtf8LineStrict());
        this.f40654e = Integer.parseInt(bufferedSource.readUtf8LineStrict()) > 0;
        int parseInt = Integer.parseInt(bufferedSource.readUtf8LineStrict());
        Headers.Builder builder = new Headers.Builder();
        for (int i = 0; i < parseInt; i++) {
            Utils.addUnsafeNonAscii(builder, bufferedSource.readUtf8LineStrict());
        }
        this.f40655f = builder.build();
    }

    @NotNull
    public final CacheControl getCacheControl() {
        return (CacheControl) this.f40650a.getValue();
    }

    @Nullable
    public final MediaType getContentType() {
        return (MediaType) this.f40651b.getValue();
    }

    public final long getReceivedResponseAtMillis() {
        return this.f40653d;
    }

    @NotNull
    public final Headers getResponseHeaders() {
        return this.f40655f;
    }

    public final long getSentRequestAtMillis() {
        return this.f40652c;
    }

    public final boolean isTls() {
        return this.f40654e;
    }

    public final void writeTo(@NotNull BufferedSink bufferedSink) {
        long j;
        bufferedSink.writeDecimalLong(this.f40652c).writeByte(10);
        bufferedSink.writeDecimalLong(this.f40653d).writeByte(10);
        if (this.f40654e) {
            j = 1;
        } else {
            j = 0;
        }
        bufferedSink.writeDecimalLong(j).writeByte(10);
        bufferedSink.writeDecimalLong(this.f40655f.size()).writeByte(10);
        int size = this.f40655f.size();
        for (int i = 0; i < size; i++) {
            bufferedSink.writeUtf8(this.f40655f.name(i)).writeUtf8(": ").writeUtf8(this.f40655f.value(i)).writeByte(10);
        }
    }

    public CacheResponse(@NotNull Response response) {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f40650a = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new CacheResponse$cacheControl$2(this));
        this.f40651b = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new CacheResponse$contentType$2(this));
        this.f40652c = response.sentRequestAtMillis();
        this.f40653d = response.receivedResponseAtMillis();
        this.f40654e = response.handshake() != null;
        this.f40655f = response.headers();
    }
}