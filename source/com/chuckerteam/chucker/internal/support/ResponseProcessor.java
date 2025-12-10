package com.chuckerteam.chucker.internal.support;

import com.chuckerteam.chucker.api.BodyDecoder;
import com.chuckerteam.chucker.api.ChuckerCollector;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Logger;
import com.chuckerteam.chucker.internal.support.ReportingSink;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.CloseableKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Handshake;
import okhttp3.MediaType;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 .2\u00020\u0001:\u0002\u001d%BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\"J!\u0010%\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010*R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/ResponseProcessor;", "", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "collector", "Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;", "cacheDirectoryProvider", "", "maxContentLength", "", "", "headersToRedact", "", "alwaysReadResponseBody", "", "Lcom/chuckerteam/chucker/api/BodyDecoder;", "bodyDecoders", "<init>", "(Lcom/chuckerteam/chucker/api/ChuckerCollector;Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;JLjava/util/Set;ZLjava/util/List;)V", "Lokhttp3/Response;", "response", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "process", "(Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)Lokhttp3/Response;", "", "e", "(Lokhttp3/Response;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", OperatorName.CURVE_TO, "Ljava/io/File;", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/io/File;", "Lokio/Buffer;", "payload", "d", "(Lokhttp3/Response;Lokio/Buffer;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "Lokio/ByteString;", "body", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Lokhttp3/Response;Lokio/ByteString;)Ljava/lang/String;", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "Lcom/chuckerteam/chucker/internal/support/CacheDirectoryProvider;", OperatorName.SET_LINE_CAPSTYLE, "Ljava/util/Set;", "Z", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", OperatorName.NON_STROKING_GRAY, "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class ResponseProcessor {
    @Deprecated
    @NotNull
    public static final String CONTENT_TYPE_IMAGE = "image";
    @Deprecated
    public static final long MAX_BLOB_SIZE = 1000000;

    /* renamed from: g */
    public static final C5973a f42963g = new C5973a(null);

    /* renamed from: a */
    public final ChuckerCollector f42964a;

    /* renamed from: b */
    public final CacheDirectoryProvider f42965b;

    /* renamed from: c */
    public final long f42966c;

    /* renamed from: d */
    public final Set f42967d;

    /* renamed from: e */
    public final boolean f42968e;

    /* renamed from: f */
    public final List f42969f;

    /* renamed from: com.chuckerteam.chucker.internal.support.ResponseProcessor$a */
    /* loaded from: classes3.dex */
    public static final class C5973a {
        public /* synthetic */ C5973a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C5973a() {
        }
    }

    /* renamed from: com.chuckerteam.chucker.internal.support.ResponseProcessor$b */
    /* loaded from: classes3.dex */
    public final class C5974b implements ReportingSink.Callback {

        /* renamed from: a */
        public final Response f42970a;

        /* renamed from: b */
        public final HttpTransaction f42971b;

        /* renamed from: c */
        public final /* synthetic */ ResponseProcessor f42972c;

        public C5974b(ResponseProcessor responseProcessor, Response response, HttpTransaction transaction) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(transaction, "transaction");
            this.f42972c = responseProcessor;
            this.f42970a = response;
            this.f42971b = transaction;
        }

        /* renamed from: a */
        public final Buffer m49902a(File file) {
            try {
                Source uncompress = OkHttpUtilsKt.uncompress(Okio.source(file), this.f42970a.headers());
                Buffer buffer = new Buffer();
                buffer.writeAll(uncompress);
                CloseableKt.closeFinally(uncompress, null);
                return buffer;
            } catch (IOException e) {
                Logger.Companion.error("Response payload couldn't be processed", e);
                return null;
            }
        }

        @Override // com.chuckerteam.chucker.internal.support.ReportingSink.Callback
        public void onClosed(File file, long j) {
            Buffer m49902a;
            if (file != null && (m49902a = m49902a(file)) != null) {
                this.f42972c.m49904d(this.f42970a, m49902a, this.f42971b);
            }
            this.f42971b.setResponsePayloadSize(Long.valueOf(j));
            this.f42972c.f42964a.onResponseReceived$com_github_ChuckerTeam_Chucker_library(this.f42971b);
            if (file != null) {
                file.delete();
            }
        }

        @Override // com.chuckerteam.chucker.internal.support.ReportingSink.Callback
        public void onFailure(File file, IOException exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            Logger.Companion.error("Failed to read response payload", exception);
        }
    }

    public ResponseProcessor(@NotNull ChuckerCollector collector, @NotNull CacheDirectoryProvider cacheDirectoryProvider, long j, @NotNull Set<String> headersToRedact, boolean z, @NotNull List<? extends BodyDecoder> bodyDecoders) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(cacheDirectoryProvider, "cacheDirectoryProvider");
        Intrinsics.checkNotNullParameter(headersToRedact, "headersToRedact");
        Intrinsics.checkNotNullParameter(bodyDecoders, "bodyDecoders");
        this.f42964a = collector;
        this.f42965b = cacheDirectoryProvider;
        this.f42966c = j;
        this.f42967d = headersToRedact;
        this.f42968e = z;
        this.f42969f = bodyDecoders;
    }

    /* renamed from: a */
    public final File m49907a() {
        File provide = this.f42965b.provide();
        if (provide == null) {
            Logger.DefaultImpls.warn$default(Logger.Companion, "Failed to obtain a valid cache directory for transaction files", null, 2, null);
            return null;
        }
        return FileFactory.INSTANCE.create(provide);
    }

    /* renamed from: b */
    public final String m49906b(Response response, ByteString byteString) {
        return (String) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(this.f42969f), new ResponseProcessor$decodePayload$1(response, byteString)));
    }

    /* renamed from: c */
    public final Response m49905c(Response response, HttpTransaction httpTransaction) {
        ResponseBody body = response.body();
        if (OkHttpUtilsKt.hasBody(response) && body != null) {
            MediaType contentType = body.contentType();
            long contentLength = body.contentLength();
            Source teeSource = new TeeSource(body.source(), new ReportingSink(m49907a(), new C5974b(this, response, httpTransaction), this.f42966c));
            if (this.f42968e) {
                teeSource = new DepletingSource(teeSource);
            }
            return response.newBuilder().body(ResponseBody.Companion.create(Okio.buffer(teeSource), contentType, contentLength)).build();
        }
        this.f42964a.onResponseReceived$com_github_ChuckerTeam_Chucker_library(httpTransaction);
        return response;
    }

    /* renamed from: d */
    public final void m49904d(Response response, Buffer buffer, HttpTransaction httpTransaction) {
        String mediaType;
        ResponseBody body = response.body();
        if (body == null) {
            return;
        }
        MediaType contentType = body.contentType();
        boolean z = true;
        if (contentType != null && (mediaType = contentType.toString()) != null && StringsKt__StringsKt.contains((CharSequence) mediaType, (CharSequence) CONTENT_TYPE_IMAGE, true)) {
            if (buffer.size() < 1000000) {
                httpTransaction.setResponseImageData(buffer.readByteArray());
            }
        } else if (buffer.size() != 0) {
            String m49906b = m49906b(response, buffer.readByteString());
            httpTransaction.setResponseBody(m49906b);
            if (m49906b != null) {
                z = false;
            }
            httpTransaction.setResponseBodyEncoded(z);
        }
    }

    /* renamed from: e */
    public final void m49903e(Response response, HttpTransaction httpTransaction) {
        httpTransaction.setRequestHeadersSize(Long.valueOf(response.request().headers().byteCount()));
        httpTransaction.setRequestHeaders(OkHttpUtilsKt.redact(response.request().headers(), this.f42967d));
        httpTransaction.setResponseHeadersSize(Long.valueOf(response.headers().byteCount()));
        httpTransaction.setResponseHeaders(OkHttpUtilsKt.redact(response.headers(), this.f42967d));
        httpTransaction.setRequestDate(Long.valueOf(response.sentRequestAtMillis()));
        httpTransaction.setResponseDate(Long.valueOf(response.receivedResponseAtMillis()));
        httpTransaction.setProtocol(response.protocol().toString());
        httpTransaction.setResponseCode(Integer.valueOf(response.code()));
        httpTransaction.setResponseMessage(response.message());
        Handshake handshake = response.handshake();
        if (handshake != null) {
            httpTransaction.setResponseTlsVersion(handshake.tlsVersion().javaName());
            httpTransaction.setResponseCipherSuite(handshake.cipherSuite().javaName());
        }
        httpTransaction.setResponseContentType(OkHttpUtilsKt.getContentType(response));
        httpTransaction.setTookMs(Long.valueOf(response.receivedResponseAtMillis() - response.sentRequestAtMillis()));
    }

    @NotNull
    public final Response process(@NotNull Response response, @NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m49903e(response, transaction);
        return m49905c(response, transaction);
    }
}
