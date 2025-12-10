package coil.network;

import coil.util.Time;
import coil.util.Utils;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Marker;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0010\u0011B\u001d\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m29142d2 = {"Lcoil/network/CacheStrategy;", "", "Lokhttp3/Request;", "networkRequest", "Lcoil/network/CacheResponse;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lokhttp3/Request;", "getNetworkRequest", "()Lokhttp3/Request;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/network/CacheResponse;", "getCacheResponse", "()Lcoil/network/CacheResponse;", "Companion", "Factory", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CacheStrategy {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final Request f40656a;

    /* renamed from: b */
    public final CacheResponse f40657b;

    @Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, m29142d2 = {"Lcoil/network/CacheStrategy$Companion;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "isCacheable", "(Lokhttp3/Request;Lokhttp3/Response;)Z", "Lcoil/network/CacheResponse;", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)Z", "Lokhttp3/Headers;", "cachedHeaders", "networkHeaders", "combineHeaders", "(Lokhttp3/Headers;Lokhttp3/Headers;)Lokhttp3/Headers;", "", "name", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean m51044a(String str) {
            if (AbstractC19741eO1.equals("Content-Length", str, true) || AbstractC19741eO1.equals("Content-Encoding", str, true) || AbstractC19741eO1.equals("Content-Type", str, true)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean m51043b(String str) {
            if (!AbstractC19741eO1.equals("Connection", str, true) && !AbstractC19741eO1.equals("Keep-Alive", str, true) && !AbstractC19741eO1.equals("Proxy-Authenticate", str, true) && !AbstractC19741eO1.equals("Proxy-Authorization", str, true) && !AbstractC19741eO1.equals("TE", str, true) && !AbstractC19741eO1.equals("Trailers", str, true) && !AbstractC19741eO1.equals("Transfer-Encoding", str, true) && !AbstractC19741eO1.equals("Upgrade", str, true)) {
                return true;
            }
            return false;
        }

        @NotNull
        public final Headers combineHeaders(@NotNull Headers headers, @NotNull Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                String name = headers.name(i);
                String value = headers.value(i);
                if ((!AbstractC19741eO1.equals("Warning", name, true) || !AbstractC19741eO1.startsWith$default(value, "1", false, 2, null)) && (m51044a(name) || !m51043b(name) || headers2.get(name) == null)) {
                    builder.add(name, value);
                }
            }
            int size2 = headers2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String name2 = headers2.name(i2);
                if (!m51044a(name2) && m51043b(name2)) {
                    builder.add(name2, headers2.value(i2));
                }
            }
            return builder.build();
        }

        public final boolean isCacheable(@NotNull Request request, @NotNull Response response) {
            return (request.cacheControl().noStore() || response.cacheControl().noStore() || Intrinsics.areEqual(response.headers().get("Vary"), Marker.ANY_MARKER)) ? false : true;
        }

        public Companion() {
        }

        public final boolean isCacheable(@NotNull Request request, @NotNull CacheResponse cacheResponse) {
            return (request.cacheControl().noStore() || cacheResponse.getCacheControl().noStore() || Intrinsics.areEqual(cacheResponse.getResponseHeaders().get("Vary"), Marker.ANY_MARKER)) ? false : true;
        }
    }

    @Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0018\u0010 \u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0015R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, m29142d2 = {"Lcoil/network/CacheStrategy$Factory;", "", "Lokhttp3/Request;", "request", "Lcoil/network/CacheResponse;", "cacheResponse", "<init>", "(Lokhttp3/Request;Lcoil/network/CacheResponse;)V", "Lcoil/network/CacheStrategy;", "compute", "()Lcoil/network/CacheStrategy;", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()J", PDPageLabelRange.STYLE_LETTERS_LOWER, "", OperatorName.CURVE_TO, "(Lokhttp3/Request;)Z", "Lokhttp3/Request;", "Lcoil/network/CacheResponse;", "Ljava/util/Date;", "Ljava/util/Date;", "servedDate", "", "d", "Ljava/lang/String;", "servedDateString", "e", "lastModified", OperatorName.FILL_NON_ZERO, "lastModifiedString", OperatorName.NON_STROKING_GRAY, ClientCookie.EXPIRES_ATTR, OperatorName.CLOSE_PATH, OperatorName.SET_LINE_CAPSTYLE, "sentRequestMillis", "i", "receivedResponseMillis", OperatorName.SET_LINE_JOINSTYLE, "etag", "", OperatorName.NON_STROKING_CMYK, "I", "ageSeconds", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Factory {

        /* renamed from: a */
        public final Request f40658a;

        /* renamed from: b */
        public final CacheResponse f40659b;

        /* renamed from: c */
        public Date f40660c;

        /* renamed from: d */
        public String f40661d;

        /* renamed from: e */
        public Date f40662e;

        /* renamed from: f */
        public String f40663f;

        /* renamed from: g */
        public Date f40664g;

        /* renamed from: h */
        public long f40665h;

        /* renamed from: i */
        public long f40666i;

        /* renamed from: j */
        public String f40667j;

        /* renamed from: k */
        public int f40668k;

        public Factory(@NotNull Request request, @Nullable CacheResponse cacheResponse) {
            this.f40658a = request;
            this.f40659b = cacheResponse;
            this.f40668k = -1;
            if (cacheResponse != null) {
                this.f40665h = cacheResponse.getSentRequestAtMillis();
                this.f40666i = cacheResponse.getReceivedResponseAtMillis();
                Headers responseHeaders = cacheResponse.getResponseHeaders();
                int size = responseHeaders.size();
                for (int i = 0; i < size; i++) {
                    String name = responseHeaders.name(i);
                    if (AbstractC19741eO1.equals(name, "Date", true)) {
                        this.f40660c = responseHeaders.getDate("Date");
                        this.f40661d = responseHeaders.value(i);
                    } else if (AbstractC19741eO1.equals(name, "Expires", true)) {
                        this.f40664g = responseHeaders.getDate("Expires");
                    } else if (AbstractC19741eO1.equals(name, "Last-Modified", true)) {
                        this.f40662e = responseHeaders.getDate("Last-Modified");
                        this.f40663f = responseHeaders.value(i);
                    } else if (AbstractC19741eO1.equals(name, "ETag", true)) {
                        this.f40667j = responseHeaders.value(i);
                    } else if (AbstractC19741eO1.equals(name, "Age", true)) {
                        this.f40668k = Utils.toNonNegativeInt(responseHeaders.value(i), -1);
                    }
                }
            }
        }

        /* renamed from: a */
        public final long m51042a() {
            Date date = this.f40660c;
            long j = 0;
            if (date != null) {
                j = Math.max(0L, this.f40666i - date.getTime());
            }
            int i = this.f40668k;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis(i));
            }
            return j + (this.f40666i - this.f40665h) + (Time.INSTANCE.currentMillis() - this.f40666i);
        }

        /* renamed from: b */
        public final long m51041b() {
            long j;
            long j2;
            CacheResponse cacheResponse = this.f40659b;
            Intrinsics.checkNotNull(cacheResponse);
            CacheControl cacheControl = cacheResponse.getCacheControl();
            if (cacheControl.maxAgeSeconds() != -1) {
                return TimeUnit.SECONDS.toMillis(cacheControl.maxAgeSeconds());
            }
            Date date = this.f40664g;
            if (date != null) {
                Date date2 = this.f40660c;
                if (date2 != null) {
                    j2 = date2.getTime();
                } else {
                    j2 = this.f40666i;
                }
                long time = date.getTime() - j2;
                if (time <= 0) {
                    return 0L;
                }
                return time;
            } else if (this.f40662e == null || this.f40658a.url().query() != null) {
                return 0L;
            } else {
                Date date3 = this.f40660c;
                if (date3 != null) {
                    j = date3.getTime();
                } else {
                    j = this.f40665h;
                }
                Date date4 = this.f40662e;
                Intrinsics.checkNotNull(date4);
                long time2 = j - date4.getTime();
                if (time2 <= 0) {
                    return 0L;
                }
                return time2 / 10;
            }
        }

        /* renamed from: c */
        public final boolean m51040c(Request request) {
            if (request.header("If-Modified-Since") == null && request.header("If-None-Match") == null) {
                return false;
            }
            return true;
        }

        @NotNull
        public final CacheStrategy compute() {
            long j;
            String str;
            if (this.f40659b == null) {
                return new CacheStrategy(this.f40658a, null, null);
            }
            if (this.f40658a.isHttps() && !this.f40659b.isTls()) {
                return new CacheStrategy(this.f40658a, null, null);
            }
            CacheControl cacheControl = this.f40659b.getCacheControl();
            if (!CacheStrategy.Companion.isCacheable(this.f40658a, this.f40659b)) {
                return new CacheStrategy(this.f40658a, null, null);
            }
            CacheControl cacheControl2 = this.f40658a.cacheControl();
            if (!cacheControl2.noCache() && !m51040c(this.f40658a)) {
                long m51042a = m51042a();
                long m51041b = m51041b();
                if (cacheControl2.maxAgeSeconds() != -1) {
                    m51041b = Math.min(m51041b, TimeUnit.SECONDS.toMillis(cacheControl2.maxAgeSeconds()));
                }
                long j2 = 0;
                if (cacheControl2.minFreshSeconds() != -1) {
                    j = TimeUnit.SECONDS.toMillis(cacheControl2.minFreshSeconds());
                } else {
                    j = 0;
                }
                if (!cacheControl.mustRevalidate() && cacheControl2.maxStaleSeconds() != -1) {
                    j2 = TimeUnit.SECONDS.toMillis(cacheControl2.maxStaleSeconds());
                }
                if (!cacheControl.noCache() && m51042a + j < m51041b + j2) {
                    return new CacheStrategy(null, this.f40659b, null);
                }
                String str2 = this.f40667j;
                if (str2 != null) {
                    Intrinsics.checkNotNull(str2);
                    str = "If-None-Match";
                } else {
                    str = "If-Modified-Since";
                    if (this.f40662e != null) {
                        str2 = this.f40663f;
                        Intrinsics.checkNotNull(str2);
                    } else if (this.f40660c != null) {
                        str2 = this.f40661d;
                        Intrinsics.checkNotNull(str2);
                    } else {
                        return new CacheStrategy(this.f40658a, null, null);
                    }
                }
                return new CacheStrategy(this.f40658a.newBuilder().addHeader(str, str2).build(), this.f40659b, null);
            }
            return new CacheStrategy(this.f40658a, null, null);
        }
    }

    public /* synthetic */ CacheStrategy(Request request, CacheResponse cacheResponse, DefaultConstructorMarker defaultConstructorMarker) {
        this(request, cacheResponse);
    }

    @Nullable
    public final CacheResponse getCacheResponse() {
        return this.f40657b;
    }

    @Nullable
    public final Request getNetworkRequest() {
        return this.f40656a;
    }

    public CacheStrategy(Request request, CacheResponse cacheResponse) {
        this.f40656a = request;
        this.f40657b = cacheResponse;
    }
}