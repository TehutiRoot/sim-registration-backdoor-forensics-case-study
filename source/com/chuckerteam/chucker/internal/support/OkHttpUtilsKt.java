package com.chuckerteam.chucker.internal.support;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;
import okhttp3.Response;
import okio.GzipSource;
import okio.Okio;
import okio.Source;
import org.apache.http.protocol.HTTP;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\f\u001a\u00020\u0005*\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0004\b\f\u0010\r\"\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0015\u001a\u00020\u0012*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0018\u0010\u0016\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0003\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\n*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001c\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u001d\u001a\u00020\u0001*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001b\"\u0018\u0010\u001f\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001b¨\u0006 "}, m28850d2 = {"Lokhttp3/Response;", "", "hasBody", "(Lokhttp3/Response;)Z", "Lokio/Source;", "Lokhttp3/Headers;", "headers", "uncompress", "(Lokio/Source;Lokhttp3/Headers;)Lokio/Source;", "", "", "names", "redact", "(Lokhttp3/Headers;Ljava/lang/Iterable;)Lokhttp3/Headers;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", "supportedEncodings", "", OperatorName.CURVE_TO, "(Lokhttp3/Response;)J", "contentLength", "isChunked", "getContentType", "(Lokhttp3/Response;)Ljava/lang/String;", "contentType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lokhttp3/Headers;)Z", "containsGzip", "containsBrotli", "getHasSupportedContentEncoding", "hasSupportedContentEncoding", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOkHttpUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpUtils.kt\ncom/chuckerteam/chucker/internal/support/OkHttpUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,85:1\n1#2:86\n219#3:87\n1747#4,3:88\n*S KotlinDebug\n*F\n+ 1 OkHttpUtils.kt\ncom/chuckerteam/chucker/internal/support/OkHttpUtilsKt\n*L\n71#1:87\n79#1:88,3\n*E\n"})
/* loaded from: classes3.dex */
public final class OkHttpUtilsKt {

    /* renamed from: a */
    public static final List f42950a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{HTTP.IDENTITY_CODING, "gzip", "br"});

    /* renamed from: a */
    public static final boolean m49918a(Headers headers) {
        return AbstractC20204hN1.equals(headers.get("Content-Encoding"), "br", true);
    }

    /* renamed from: b */
    public static final boolean m49917b(Headers headers) {
        return AbstractC20204hN1.equals(headers.get("Content-Encoding"), "gzip", true);
    }

    /* renamed from: c */
    public static final long m49916c(Response response) {
        Long longOrNull;
        String header$default = Response.header$default(response, "Content-Length", null, 2, null);
        if (header$default != null && (longOrNull = AbstractC20032gN1.toLongOrNull(header$default)) != null) {
            return longOrNull.longValue();
        }
        return -1L;
    }

    @Nullable
    public static final String getContentType(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return Response.header$default(response, "Content-Type", null, 2, null);
    }

    public static final boolean getHasSupportedContentEncoding(@NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        String str = headers.get("Content-Encoding");
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                List list = f42950a;
                Locale ROOT = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
                String lowerCase = str.toLowerCase(ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                return list.contains(lowerCase);
            }
        }
        return true;
    }

    public static final boolean hasBody(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && m49916c(response) <= 0 && !isChunked(response)) {
            return false;
        }
        return true;
    }

    public static final boolean isChunked(@NotNull Response response) {
        Intrinsics.checkNotNullParameter(response, "<this>");
        return AbstractC20204hN1.equals(Response.header$default(response, "Transfer-Encoding", null, 2, null), HTTP.CHUNK_CODING, true);
    }

    @NotNull
    public static final Headers redact(@NotNull Headers headers, @NotNull Iterable<String> names) {
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(names, "names");
        Headers.Builder newBuilder = headers.newBuilder();
        for (String str : headers.names()) {
            if (!(names instanceof Collection) || !((Collection) names).isEmpty()) {
                Iterator<String> it = names.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (AbstractC20204hN1.equals(it.next(), str, true)) {
                            newBuilder.set(str, "**");
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return newBuilder.build();
    }

    @NotNull
    public static final Source uncompress(@NotNull Source source, @NotNull Headers headers) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (m49917b(headers)) {
            return new GzipSource(source);
        }
        if (m49918a(headers)) {
            return Okio.source(new BrotliInputStream(Okio.buffer(source).inputStream()));
        }
        return source;
    }
}
