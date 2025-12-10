package com.chuckerteam.chucker.internal.data.har.log.entry;

import androidx.core.app.NotificationCompat;
import com.chuckerteam.chucker.internal.data.har.log.entry.response.Content;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u008e\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u001bJ\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0019J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00104\u001a\u0004\b7\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001eR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010!R\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u00104\u001a\u0004\bA\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010$R\u001a\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010$R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010$R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\bJ\u0010\u001b¨\u0006K"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;", "", "", NotificationCompat.CATEGORY_STATUS, "", "statusText", "httpVersion", "", "cookies", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Header;", "headers", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "content", "redirectUrl", "", "headersSize", "bodySize", "totalSize", ClientCookie.COMMENT_ATTR, "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;Ljava/lang/String;JJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "component7", "component8", "()J", "component9", "component10", "component11", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;Ljava/lang/String;JJJLjava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getStatus", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getStatusText", OperatorName.CURVE_TO, "getHttpVersion", "d", "Ljava/util/List;", "getCookies", "e", "getHeaders", OperatorName.FILL_NON_ZERO, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "getContent", OperatorName.NON_STROKING_GRAY, "getRedirectUrl", OperatorName.CLOSE_PATH, OperatorName.SET_LINE_CAPSTYLE, "getHeadersSize", "i", "getBodySize", OperatorName.SET_LINE_JOINSTYLE, "getTotalSize", OperatorName.NON_STROKING_CMYK, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Response.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Response\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,34:1\n1549#2:35\n1620#2,3:36\n1#3:39\n*S KotlinDebug\n*F\n+ 1 Response.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Response\n*L\n27#1:35\n27#1:36,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Response {
    @SerializedName(NotificationCompat.CATEGORY_STATUS)

    /* renamed from: a */
    private final int f42850a;
    @SerializedName("statusText")
    @NotNull

    /* renamed from: b */
    private final String f42851b;
    @SerializedName("httpVersion")
    @NotNull

    /* renamed from: c */
    private final String f42852c;
    @SerializedName("cookies")
    @NotNull

    /* renamed from: d */
    private final List<Object> f42853d;
    @SerializedName("headers")
    @NotNull

    /* renamed from: e */
    private final List<Header> f42854e;
    @SerializedName("content")
    @Nullable

    /* renamed from: f */
    private final Content f42855f;
    @SerializedName("redirectURL")
    @NotNull

    /* renamed from: g */
    private final String f42856g;
    @SerializedName("headersSize")

    /* renamed from: h */
    private final long f42857h;
    @SerializedName("bodySize")

    /* renamed from: i */
    private final long f42858i;
    @SerializedName("totalSize")

    /* renamed from: j */
    private final long f42859j;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: k */
    private final String f42860k;

    public Response(int i, @NotNull String statusText, @NotNull String httpVersion, @NotNull List<? extends Object> cookies, @NotNull List<Header> headers, @Nullable Content content, @NotNull String redirectUrl, long j, long j2, long j3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f42850a = i;
        this.f42851b = statusText;
        this.f42852c = httpVersion;
        this.f42853d = cookies;
        this.f42854e = headers;
        this.f42855f = content;
        this.f42856g = redirectUrl;
        this.f42857h = j;
        this.f42858i = j2;
        this.f42859j = j3;
        this.f42860k = str;
    }

    public final int component1() {
        return this.f42850a;
    }

    public final long component10() {
        return this.f42859j;
    }

    @Nullable
    public final String component11() {
        return this.f42860k;
    }

    @NotNull
    public final String component2() {
        return this.f42851b;
    }

    @NotNull
    public final String component3() {
        return this.f42852c;
    }

    @NotNull
    public final List<Object> component4() {
        return this.f42853d;
    }

    @NotNull
    public final List<Header> component5() {
        return this.f42854e;
    }

    @Nullable
    public final Content component6() {
        return this.f42855f;
    }

    @NotNull
    public final String component7() {
        return this.f42856g;
    }

    public final long component8() {
        return this.f42857h;
    }

    public final long component9() {
        return this.f42858i;
    }

    @NotNull
    public final Response copy(int i, @NotNull String statusText, @NotNull String httpVersion, @NotNull List<? extends Object> cookies, @NotNull List<Header> headers, @Nullable Content content, @NotNull String redirectUrl, long j, long j2, long j3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        return new Response(i, statusText, httpVersion, cookies, headers, content, redirectUrl, j, j2, j3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Response) {
            Response response = (Response) obj;
            return this.f42850a == response.f42850a && Intrinsics.areEqual(this.f42851b, response.f42851b) && Intrinsics.areEqual(this.f42852c, response.f42852c) && Intrinsics.areEqual(this.f42853d, response.f42853d) && Intrinsics.areEqual(this.f42854e, response.f42854e) && Intrinsics.areEqual(this.f42855f, response.f42855f) && Intrinsics.areEqual(this.f42856g, response.f42856g) && this.f42857h == response.f42857h && this.f42858i == response.f42858i && this.f42859j == response.f42859j && Intrinsics.areEqual(this.f42860k, response.f42860k);
        }
        return false;
    }

    public final long getBodySize() {
        return this.f42858i;
    }

    @Nullable
    public final String getComment() {
        return this.f42860k;
    }

    @Nullable
    public final Content getContent() {
        return this.f42855f;
    }

    @NotNull
    public final List<Object> getCookies() {
        return this.f42853d;
    }

    @NotNull
    public final List<Header> getHeaders() {
        return this.f42854e;
    }

    public final long getHeadersSize() {
        return this.f42857h;
    }

    @NotNull
    public final String getHttpVersion() {
        return this.f42852c;
    }

    @NotNull
    public final String getRedirectUrl() {
        return this.f42856g;
    }

    public final int getStatus() {
        return this.f42850a;
    }

    @NotNull
    public final String getStatusText() {
        return this.f42851b;
    }

    public final long getTotalSize() {
        return this.f42859j;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f42850a * 31) + this.f42851b.hashCode()) * 31) + this.f42852c.hashCode()) * 31) + this.f42853d.hashCode()) * 31) + this.f42854e.hashCode()) * 31;
        Content content = this.f42855f;
        int hashCode2 = (((((((((hashCode + (content == null ? 0 : content.hashCode())) * 31) + this.f42856g.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f42857h)) * 31) + AbstractC17792Ig1.m67882a(this.f42858i)) * 31) + AbstractC17792Ig1.m67882a(this.f42859j)) * 31;
        String str = this.f42860k;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i = this.f42850a;
        String str = this.f42851b;
        String str2 = this.f42852c;
        List<Object> list = this.f42853d;
        List<Header> list2 = this.f42854e;
        Content content = this.f42855f;
        String str3 = this.f42856g;
        long j = this.f42857h;
        long j2 = this.f42858i;
        long j3 = this.f42859j;
        String str4 = this.f42860k;
        return "Response(status=" + i + ", statusText=" + str + ", httpVersion=" + str2 + ", cookies=" + list + ", headers=" + list2 + ", content=" + content + ", redirectUrl=" + str3 + ", headersSize=" + j + ", bodySize=" + j2 + ", totalSize=" + j3 + ", comment=" + str4 + ")";
    }

    public /* synthetic */ Response(int i, String str, String str2, List list, List list2, Content content, String str3, long j, long j2, long j3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, list2, (i2 & 32) != 0 ? null : content, (i2 & 64) != 0 ? "" : str3, j, j2, j3, (i2 & 1024) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Response(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r20) {
        /*
            r19 = this;
            r0 = r20
            java.lang.String r1 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Integer r1 = r20.getResponseCode()
            if (r1 == 0) goto L13
            int r1 = r1.intValue()
            r3 = r1
            goto L15
        L13:
            r1 = 0
            r3 = 0
        L15:
            java.lang.String r1 = r20.getResponseMessage()
            java.lang.String r2 = ""
            if (r1 != 0) goto L1f
            r4 = r2
            goto L20
        L1f:
            r4 = r1
        L20:
            java.lang.String r1 = r20.getProtocol()
            if (r1 != 0) goto L28
            r5 = r2
            goto L29
        L28:
            r5 = r1
        L29:
            java.util.List r1 = r20.getParsedResponseHeaders()
            if (r1 == 0) goto L57
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r6 = 10
            int r6 = p000.AbstractC10176es.collectionSizeOrDefault(r1, r6)
            r2.<init>(r6)
            java.util.Iterator r1 = r1.iterator()
        L40:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r1.next()
            com.chuckerteam.chucker.internal.data.entity.HttpHeader r6 = (com.chuckerteam.chucker.internal.data.entity.HttpHeader) r6
            com.chuckerteam.chucker.internal.data.har.log.entry.Header r7 = new com.chuckerteam.chucker.internal.data.har.log.entry.Header
            r7.<init>(r6)
            r2.add(r7)
            goto L40
        L55:
            r7 = r2
            goto L5c
        L57:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r7 = r1
        L5c:
            java.lang.Long r1 = r20.getResponsePayloadSize()
            if (r1 == 0) goto L69
            com.chuckerteam.chucker.internal.data.har.log.entry.response.Content r1 = new com.chuckerteam.chucker.internal.data.har.log.entry.response.Content
            r1.<init>(r0)
        L67:
            r8 = r1
            goto L70
        L69:
            com.chuckerteam.chucker.internal.data.har.log.entry.response.Content$Companion r1 = com.chuckerteam.chucker.internal.data.har.log.entry.response.Content.Companion
            com.chuckerteam.chucker.internal.data.har.log.entry.response.Content r1 = r1.getEMPTY$com_github_ChuckerTeam_Chucker_library()
            goto L67
        L70:
            java.lang.Long r1 = r20.getResponseHeadersSize()
            if (r1 == 0) goto L7c
            long r1 = r1.longValue()
        L7a:
            r10 = r1
            goto L7f
        L7c:
            r1 = 0
            goto L7a
        L7f:
            long r12 = r20.getHarResponseBodySize()
            long r14 = r20.getResponseTotalSize()
            r17 = 1096(0x448, float:1.536E-42)
            r18 = 0
            r6 = 0
            r9 = 0
            r16 = 0
            r2 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r12, r14, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.entry.Response.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}
