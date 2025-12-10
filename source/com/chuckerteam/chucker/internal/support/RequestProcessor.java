package com.chuckerteam.chucker.internal.support;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.chuckerteam.chucker.R;
import com.chuckerteam.chucker.api.BodyDecoder;
import com.chuckerteam.chucker.api.ChuckerCollector;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.Logger;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p023io.CloseableKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J!\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010#R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/support/RequestProcessor;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/chuckerteam/chucker/api/ChuckerCollector;", "collector", "", "maxContentLength", "", "", "headersToRedact", "", "Lcom/chuckerteam/chucker/api/BodyDecoder;", "bodyDecoders", "<init>", "(Landroid/content/Context;Lcom/chuckerteam/chucker/api/ChuckerCollector;JLjava/util/Set;Ljava/util/List;)V", "Lokhttp3/Request;", "request", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "", "process", "(Lokhttp3/Request;Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", OperatorName.CURVE_TO, "d", "Lokio/ByteString;", "body", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Lokhttp3/Request;Lokio/ByteString;)Ljava/lang/String;", "graphQLOperationName", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/lang/String;Lokhttp3/Request;)Z", "Landroid/content/Context;", "Lcom/chuckerteam/chucker/api/ChuckerCollector;", OperatorName.SET_LINE_CAPSTYLE, "Ljava/util/Set;", "e", "Ljava/util/List;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequestProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestProcessor.kt\ncom/chuckerteam/chucker/internal/support/RequestProcessor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* loaded from: classes3.dex */
public final class RequestProcessor {

    /* renamed from: a */
    public final Context f42958a;

    /* renamed from: b */
    public final ChuckerCollector f42959b;

    /* renamed from: c */
    public final long f42960c;

    /* renamed from: d */
    public final Set f42961d;

    /* renamed from: e */
    public final List f42962e;

    public RequestProcessor(@NotNull Context context, @NotNull ChuckerCollector collector, long j, @NotNull Set<String> headersToRedact, @NotNull List<? extends BodyDecoder> bodyDecoders) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(collector, "collector");
        Intrinsics.checkNotNullParameter(headersToRedact, "headersToRedact");
        Intrinsics.checkNotNullParameter(bodyDecoders, "bodyDecoders");
        this.f42958a = context;
        this.f42959b = collector;
        this.f42960c = j;
        this.f42961d = headersToRedact;
        this.f42962e = bodyDecoders;
    }

    /* renamed from: a */
    public final String m49911a(Request request, ByteString byteString) {
        return (String) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(this.f42962e), new RequestProcessor$decodePayload$1(request, byteString)));
    }

    /* renamed from: b */
    public final boolean m49910b(String str, Request request) {
        if (str == null && !request.url().pathSegments().contains("graphql") && !StringsKt__StringsKt.contains$default((CharSequence) request.url().host(), (CharSequence) "graphql", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void m49909c(Request request, HttpTransaction httpTransaction) {
        String str;
        MediaType contentType;
        httpTransaction.setRequestHeadersSize(Long.valueOf(request.headers().byteCount()));
        Headers redact = OkHttpUtilsKt.redact(request.headers(), this.f42961d);
        httpTransaction.setRequestHeaders(redact);
        httpTransaction.setGraphQlOperationName(redact);
        httpTransaction.populateUrl(request.url());
        httpTransaction.setGraphQlDetected(m49910b(httpTransaction.getGraphQlOperationName(), request));
        httpTransaction.setRequestDate(Long.valueOf(System.currentTimeMillis()));
        httpTransaction.setMethod(request.method());
        RequestBody body = request.body();
        Long l = null;
        if (body != null && (contentType = body.contentType()) != null) {
            str = contentType.toString();
        } else {
            str = null;
        }
        httpTransaction.setRequestContentType(str);
        RequestBody body2 = request.body();
        if (body2 != null) {
            l = Long.valueOf(body2.contentLength());
        }
        httpTransaction.setRequestPayloadSize(l);
    }

    /* renamed from: d */
    public final void m49908d(Request request, HttpTransaction httpTransaction) {
        boolean z;
        RequestBody body = request.body();
        if (body == null) {
            return;
        }
        if (body.isOneShot()) {
            Logger.DefaultImpls.info$default(Logger.Companion, "Skipping one shot request body", null, 2, null);
        } else if (body.isDuplex()) {
            Logger.DefaultImpls.info$default(Logger.Companion, "Skipping duplex request body", null, 2, null);
        } else {
            try {
                Buffer buffer = new Buffer();
                body.writeTo(buffer);
                LimitingSource limitingSource = new LimitingSource(OkHttpUtilsKt.uncompress(buffer, request.headers()), this.f42960c);
                Buffer buffer2 = new Buffer();
                try {
                    buffer2.writeAll(limitingSource);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(limitingSource, null);
                    String m49911a = m49911a(request, buffer2.readByteString());
                    httpTransaction.setRequestBody(m49911a);
                    if (m49911a == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    httpTransaction.setRequestBodyEncoded(z);
                    if (m49911a != null && limitingSource.isThresholdReached()) {
                        String requestBody = httpTransaction.getRequestBody();
                        String string = this.f42958a.getString(R.string.chucker_body_content_truncated);
                        httpTransaction.setRequestBody(requestBody + string);
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(limitingSource, th2);
                        throw th3;
                    }
                }
            } catch (IOException e) {
                Logger.Companion.error("Failed to read request payload", e);
            }
        }
    }

    public final void process(@NotNull Request request, @NotNull HttpTransaction transaction) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        m49909c(request, transaction);
        m49908d(request, transaction);
        this.f42959b.onRequestSent$com_github_ChuckerTeam_Chucker_library(transaction);
    }
}
