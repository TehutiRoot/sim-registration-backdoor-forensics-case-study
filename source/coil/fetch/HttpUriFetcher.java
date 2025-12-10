package coil.fetch;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.disk.DiskCache;
import coil.fetch.Fetcher;
import coil.network.CacheResponse;
import coil.network.CacheStrategy;
import coil.request.Options;
import coil.util.Utils;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import java.io.IOException;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0002?@B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010!\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u001b\u0010%\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u0004\u0018\u00010\u001f*\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020+*\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-J\u0013\u0010/\u001a\u00020+*\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0013\u00102\u001a\u000201*\u00020\u001dH\u0002¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00109R\u0014\u0010;\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010:R\u0014\u0010>\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b7\u0010=\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006A"}, m28850d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "", ImagesContract.URL, "Lcoil/request/Options;", "options", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/disk/DiskCache;", "diskCache", "", "respectCacheHeaders", "<init>", "(Ljava/lang/String;Lcoil/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "Lcoil/fetch/FetchResult;", RemoteConfigComponent.FETCH_FILE_NAME, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "getMimeType$coil_base_release", "(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;", "getMimeType", "Lcoil/disk/DiskCache$Snapshot;", OperatorName.FILL_NON_ZERO, "()Lcoil/disk/DiskCache$Snapshot;", "snapshot", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "Lcoil/network/CacheResponse;", "cacheResponse", OperatorName.NON_STROKING_CMYK, "(Lcoil/disk/DiskCache$Snapshot;Lokhttp3/Request;Lokhttp3/Response;Lcoil/network/CacheResponse;)Lcoil/disk/DiskCache$Snapshot;", "e", "()Lokhttp3/Request;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lokhttp3/Request;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "d", "(Lokhttp3/Request;Lokhttp3/Response;)Z", OperatorName.NON_STROKING_GRAY, "(Lcoil/disk/DiskCache$Snapshot;)Lcoil/network/CacheResponse;", "Lcoil/decode/ImageSource;", "i", "(Lcoil/disk/DiskCache$Snapshot;)Lcoil/decode/ImageSource;", "Lokhttp3/ResponseBody;", OperatorName.SET_LINE_JOINSTYLE, "(Lokhttp3/ResponseBody;)Lcoil/decode/ImageSource;", "Lcoil/decode/DataSource;", OperatorName.CLOSE_PATH, "(Lokhttp3/Response;)Lcoil/decode/DataSource;", "Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcoil/request/Options;", OperatorName.CURVE_TO, "Lkotlin/Lazy;", "Z", "()Ljava/lang/String;", "diskCacheKey", "Lokio/FileSystem;", "()Lokio/FileSystem;", "fileSystem", "Companion", "Factory", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n79#2:305\n160#2:306\n80#2:307\n81#2:313\n79#2:334\n160#2:335\n80#2:336\n81#2:342\n79#2:363\n160#2:364\n80#2:365\n81#2:371\n66#2:396\n67#2:402\n52#3,5:308\n60#3,7:314\n57#3,13:321\n52#3,5:337\n60#3,7:343\n57#3,13:350\n52#3,5:366\n60#3,7:372\n57#3,13:379\n64#3:395\n52#3,5:397\n60#3,7:403\n57#3,13:410\n215#4,2:392\n1#5:394\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:313\n167#1:334\n167#1:335\n167#1:336\n167#1:342\n170#1:363\n170#1:364\n170#1:365\n170#1:371\n255#1:396\n255#1:402\n162#1:308,5\n162#1:314,7\n162#1:321,13\n167#1:337,5\n167#1:343,7\n167#1:350,13\n170#1:366,5\n170#1:372,7\n170#1:379,13\n255#1:395\n255#1:397,5\n255#1:403,7\n255#1:410,13\n190#1:392,2\n*E\n"})
/* loaded from: classes3.dex */
public final class HttpUriFetcher implements Fetcher {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final CacheControl f40579f = new CacheControl.Builder().noCache().noStore().build();

    /* renamed from: g */
    public static final CacheControl f40580g = new CacheControl.Builder().noCache().onlyIfCached().build();

    /* renamed from: a */
    public final String f40581a;

    /* renamed from: b */
    public final Options f40582b;

    /* renamed from: c */
    public final Lazy f40583c;

    /* renamed from: d */
    public final Lazy f40584d;

    /* renamed from: e */
    public final boolean f40585e;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m28850d2 = {"Lcoil/fetch/HttpUriFetcher$Companion;", "", "()V", "CACHE_CONTROL_FORCE_NETWORK_NO_CACHE", "Lokhttp3/CacheControl;", "CACHE_CONTROL_NO_NETWORK_NO_CACHE", "MIME_TYPE_TEXT_PLAIN", "", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m28850d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/disk/DiskCache;", "diskCache", "", "respectCacheHeaders", "<init>", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "data", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/net/Uri;)Z", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "Lkotlin/Lazy;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "Z", "coil-base_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {

        /* renamed from: a */
        public final Lazy f40586a;

        /* renamed from: b */
        public final Lazy f40587b;

        /* renamed from: c */
        public final boolean f40588c;

        public Factory(@NotNull Lazy<? extends Call.Factory> lazy, @NotNull Lazy<? extends DiskCache> lazy2, boolean z) {
            this.f40586a = lazy;
            this.f40587b = lazy2;
            this.f40588c = z;
        }

        /* renamed from: a */
        private final boolean m51067a(Uri uri) {
            if (!Intrinsics.areEqual(uri.getScheme(), "http") && !Intrinsics.areEqual(uri.getScheme(), UriUtil.HTTPS_SCHEME)) {
                return false;
            }
            return true;
        }

        @Override // coil.fetch.Fetcher.Factory
        @Nullable
        public Fetcher create(@NotNull Uri uri, @NotNull Options options, @NotNull ImageLoader imageLoader) {
            if (m51067a(uri)) {
                return new HttpUriFetcher(uri.toString(), options, this.f40586a, this.f40587b, this.f40588c);
            }
            return null;
        }
    }

    public HttpUriFetcher(@NotNull String str, @NotNull Options options, @NotNull Lazy<? extends Call.Factory> lazy, @NotNull Lazy<? extends DiskCache> lazy2, boolean z) {
        this.f40581a = str;
        this.f40582b = options;
        this.f40583c = lazy;
        this.f40584d = lazy2;
        this.f40585e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m51078a(okhttp3.Request r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            if (r0 == 0) goto L13
            r0 = r6
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = (coil.fetch.HttpUriFetcher$executeNetworkRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            coil.fetch.HttpUriFetcher$executeNetworkRequest$1 r0 = new coil.fetch.HttpUriFetcher$executeNetworkRequest$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p000.AbstractC18812Yf0.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L72
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            boolean r6 = coil.util.Utils.isMainThread()
            if (r6 == 0) goto L5d
            coil.request.Options r6 = r4.f40582b
            coil.request.CachePolicy r6 = r6.getNetworkCachePolicy()
            boolean r6 = r6.getReadEnabled()
            if (r6 != 0) goto L57
            kotlin.Lazy r6 = r4.f40583c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            okhttp3.Response r5 = r5.execute()
            goto L75
        L57:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L5d:
            kotlin.Lazy r6 = r4.f40583c
            java.lang.Object r6 = r6.getValue()
            okhttp3.Call$Factory r6 = (okhttp3.Call.Factory) r6
            okhttp3.Call r5 = r6.newCall(r5)
            r0.label = r3
            java.lang.Object r6 = coil.util.Calls.await(r5, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            r5 = r6
            okhttp3.Response r5 = (okhttp3.Response) r5
        L75:
            boolean r6 = r5.isSuccessful()
            if (r6 != 0) goto L92
            int r6 = r5.code()
            r0 = 304(0x130, float:4.26E-43)
            if (r6 == r0) goto L92
            okhttp3.ResponseBody r6 = r5.body()
            if (r6 == 0) goto L8c
            coil.util.Utils.closeQuietly(r6)
        L8c:
            coil.network.HttpException r6 = new coil.network.HttpException
            r6.<init>(r5)
            throw r6
        L92:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.m51078a(okhttp3.Request, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: b */
    public final String m51077b() {
        String diskCacheKey = this.f40582b.getDiskCacheKey();
        if (diskCacheKey == null) {
            return this.f40581a;
        }
        return diskCacheKey;
    }

    /* renamed from: c */
    public final FileSystem m51076c() {
        Object value = this.f40584d.getValue();
        Intrinsics.checkNotNull(value);
        return ((DiskCache) value).getFileSystem();
    }

    /* renamed from: d */
    public final boolean m51075d(Request request, Response response) {
        if (this.f40582b.getDiskCachePolicy().getWriteEnabled() && (!this.f40585e || CacheStrategy.Companion.isCacheable(request, response))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final Request m51074e() {
        Request.Builder headers = new Request.Builder().url(this.f40581a).headers(this.f40582b.getHeaders());
        for (Map.Entry<Class<?>, Object> entry : this.f40582b.getTags().asMap().entrySet()) {
            Class<?> key = entry.getKey();
            Intrinsics.checkNotNull(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            headers.tag(key, entry.getValue());
        }
        boolean readEnabled = this.f40582b.getDiskCachePolicy().getReadEnabled();
        boolean readEnabled2 = this.f40582b.getNetworkCachePolicy().getReadEnabled();
        if (!readEnabled2 && readEnabled) {
            headers.cacheControl(CacheControl.FORCE_CACHE);
        } else if (readEnabled2 && !readEnabled) {
            if (this.f40582b.getDiskCachePolicy().getWriteEnabled()) {
                headers.cacheControl(CacheControl.FORCE_NETWORK);
            } else {
                headers.cacheControl(f40579f);
            }
        } else if (!readEnabled2 && !readEnabled) {
            headers.cacheControl(f40580g);
        }
        return headers.build();
    }

    /* renamed from: f */
    public final DiskCache.Snapshot m51073f() {
        DiskCache diskCache;
        if (!this.f40582b.getDiskCachePolicy().getReadEnabled() || (diskCache = (DiskCache) this.f40584d.getValue()) == null) {
            return null;
        }
        return diskCache.openSnapshot(m51077b());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d A[Catch: Exception -> 0x013f, TryCatch #0 {Exception -> 0x013f, blocks: (B:72:0x0188, B:54:0x011e, B:56:0x012c, B:58:0x013a, B:61:0x0143, B:63:0x014d, B:65:0x0155, B:67:0x016d), top: B:81:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    @Override // coil.fetch.Fetcher
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetch(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super coil.fetch.FetchResult> r13) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.fetch.HttpUriFetcher.fetch(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: g */
    public final CacheResponse m51072g(DiskCache.Snapshot snapshot) {
        try {
            BufferedSource buffer = Okio.buffer(m51076c().source(snapshot.getMetadata()));
            CacheResponse cacheResponse = new CacheResponse(buffer);
            if (buffer != null) {
                try {
                    buffer.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
            if (th == null) {
                Intrinsics.checkNotNull(cacheResponse);
                return cacheResponse;
            }
            throw th;
        } catch (IOException unused) {
            return null;
        }
    }

    @VisibleForTesting
    @Nullable
    public final String getMimeType$coil_base_release(@NotNull String str, @Nullable MediaType mediaType) {
        String str2;
        String mimeTypeFromUrl;
        if (mediaType != null) {
            str2 = mediaType.toString();
        } else {
            str2 = null;
        }
        if ((str2 == null || AbstractC20204hN1.startsWith$default(str2, HTTP.PLAIN_TEXT_TYPE, false, 2, null)) && (mimeTypeFromUrl = Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), str)) != null) {
            return mimeTypeFromUrl;
        }
        if (str2 == null) {
            return null;
        }
        return StringsKt__StringsKt.substringBefore$default(str2, ';', (String) null, 2, (Object) null);
    }

    /* renamed from: h */
    public final DataSource m51071h(Response response) {
        if (response.networkResponse() != null) {
            return DataSource.NETWORK;
        }
        return DataSource.DISK;
    }

    /* renamed from: i */
    public final ImageSource m51070i(DiskCache.Snapshot snapshot) {
        return ImageSources.create(snapshot.getData(), m51076c(), m51077b(), snapshot);
    }

    /* renamed from: j */
    public final ImageSource m51069j(ResponseBody responseBody) {
        return ImageSources.create(responseBody.source(), this.f40582b.getContext());
    }

    /* renamed from: k */
    public final DiskCache.Snapshot m51068k(DiskCache.Snapshot snapshot, Request request, Response response, CacheResponse cacheResponse) {
        DiskCache.Editor editor;
        Throwable th2;
        Unit unit;
        Long l;
        Unit unit2;
        Throwable th3 = null;
        if (!m51075d(request, response)) {
            if (snapshot != null) {
                Utils.closeQuietly(snapshot);
            }
            return null;
        }
        if (snapshot != null) {
            editor = snapshot.closeAndOpenEditor();
        } else {
            DiskCache diskCache = (DiskCache) this.f40584d.getValue();
            if (diskCache != null) {
                editor = diskCache.openEditor(m51077b());
            } else {
                editor = null;
            }
        }
        try {
            if (editor == null) {
                return null;
            }
            try {
                if (response.code() == 304 && cacheResponse != null) {
                    Response build = response.newBuilder().headers(CacheStrategy.Companion.combineHeaders(cacheResponse.getResponseHeaders(), response.headers())).build();
                    BufferedSink buffer = Okio.buffer(m51076c().sink(editor.getMetadata(), false));
                    try {
                        new CacheResponse(build).writeTo(buffer);
                        unit2 = Unit.INSTANCE;
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th4) {
                                th3 = th4;
                            }
                        }
                    } catch (Throwable th5) {
                        if (buffer != null) {
                            try {
                                buffer.close();
                            } catch (Throwable th6) {
                                AbstractC5370bT.addSuppressed(th5, th6);
                            }
                        }
                        th3 = th5;
                        unit2 = null;
                    }
                    if (th3 == null) {
                        Intrinsics.checkNotNull(unit2);
                    } else {
                        throw th3;
                    }
                } else {
                    BufferedSink buffer2 = Okio.buffer(m51076c().sink(editor.getMetadata(), false));
                    try {
                        new CacheResponse(response).writeTo(buffer2);
                        unit = Unit.INSTANCE;
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (Throwable th7) {
                                th2 = th7;
                            }
                        }
                        th2 = null;
                    } catch (Throwable th8) {
                        if (buffer2 != null) {
                            try {
                                buffer2.close();
                            } catch (Throwable th9) {
                                AbstractC5370bT.addSuppressed(th8, th9);
                            }
                        }
                        th2 = th8;
                        unit = null;
                    }
                    if (th2 == null) {
                        Intrinsics.checkNotNull(unit);
                        BufferedSink buffer3 = Okio.buffer(m51076c().sink(editor.getData(), false));
                        try {
                            ResponseBody body = response.body();
                            Intrinsics.checkNotNull(body);
                            l = Long.valueOf(body.source().readAll(buffer3));
                            if (buffer3 != null) {
                                try {
                                    buffer3.close();
                                } catch (Throwable th10) {
                                    th3 = th10;
                                }
                            }
                        } catch (Throwable th11) {
                            if (buffer3 != null) {
                                try {
                                    buffer3.close();
                                } catch (Throwable th12) {
                                    AbstractC5370bT.addSuppressed(th11, th12);
                                }
                            }
                            th3 = th11;
                            l = null;
                        }
                        if (th3 == null) {
                            Intrinsics.checkNotNull(l);
                        } else {
                            throw th3;
                        }
                    } else {
                        throw th2;
                    }
                }
                DiskCache.Snapshot commitAndOpenSnapshot = editor.commitAndOpenSnapshot();
                Utils.closeQuietly(response);
                return commitAndOpenSnapshot;
            } catch (Exception e) {
                Utils.abortQuietly(editor);
                throw e;
            }
        } catch (Throwable th13) {
            Utils.closeQuietly(response);
            throw th13;
        }
    }
}
