package com.chuckerteam.chucker.internal.data.har.log.entry;

import com.chuckerteam.chucker.internal.data.har.log.entry.request.PostData;
import com.chuckerteam.chucker.internal.data.har.log.entry.request.QueryString;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
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

@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0094\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0019J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0019R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001dR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u001dR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010!R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010#R\u001a\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010#R\u001a\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010\u0019¨\u0006K"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/Request;", "", "", FirebaseAnalytics.Param.METHOD, ImagesContract.URL, "httpVersion", "", "cookies", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Header;", "headers", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/QueryString;", "queryString", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;", "postData", "", "headersSize", "bodySize", "totalSize", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;JJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;", "component8", "()J", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;JJJLjava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/Request;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMethod", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getUrl", OperatorName.CURVE_TO, "getHttpVersion", "d", "Ljava/util/List;", "getCookies", "e", "getHeaders", OperatorName.FILL_NON_ZERO, "getQueryString", OperatorName.NON_STROKING_GRAY, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;", "getPostData", OperatorName.CLOSE_PATH, OperatorName.SET_LINE_CAPSTYLE, "getHeadersSize", "i", "getBodySize", OperatorName.SET_LINE_JOINSTYLE, "getTotalSize", OperatorName.NON_STROKING_CMYK, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1549#2:37\n1620#2,3:38\n1#3:41\n*S KotlinDebug\n*F\n+ 1 Request.kt\ncom/chuckerteam/chucker/internal/data/har/log/entry/Request\n*L\n28#1:37\n28#1:38,3\n*E\n"})
/* loaded from: classes3.dex */
public final class Request {
    @SerializedName(FirebaseAnalytics.Param.METHOD)
    @NotNull

    /* renamed from: a */
    private final String f42851a;
    @SerializedName(ImagesContract.URL)
    @NotNull

    /* renamed from: b */
    private final String f42852b;
    @SerializedName("httpVersion")
    @NotNull

    /* renamed from: c */
    private final String f42853c;
    @SerializedName("cookies")
    @NotNull

    /* renamed from: d */
    private final List<Object> f42854d;
    @SerializedName("headers")
    @NotNull

    /* renamed from: e */
    private final List<Header> f42855e;
    @SerializedName("queryString")
    @NotNull

    /* renamed from: f */
    private final List<QueryString> f42856f;
    @SerializedName("postData")
    @Nullable

    /* renamed from: g */
    private final PostData f42857g;
    @SerializedName("headersSize")

    /* renamed from: h */
    private final long f42858h;
    @SerializedName("bodySize")

    /* renamed from: i */
    private final long f42859i;
    @SerializedName("totalSize")

    /* renamed from: j */
    private final long f42860j;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: k */
    private final String f42861k;

    public Request(@NotNull String method, @NotNull String url, @NotNull String httpVersion, @NotNull List<? extends Object> cookies, @NotNull List<Header> headers, @NotNull List<QueryString> queryString, @Nullable PostData postData, long j, long j2, long j3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryString, "queryString");
        this.f42851a = method;
        this.f42852b = url;
        this.f42853c = httpVersion;
        this.f42854d = cookies;
        this.f42855e = headers;
        this.f42856f = queryString;
        this.f42857g = postData;
        this.f42858h = j;
        this.f42859i = j2;
        this.f42860j = j3;
        this.f42861k = str;
    }

    @NotNull
    public final String component1() {
        return this.f42851a;
    }

    public final long component10() {
        return this.f42860j;
    }

    @Nullable
    public final String component11() {
        return this.f42861k;
    }

    @NotNull
    public final String component2() {
        return this.f42852b;
    }

    @NotNull
    public final String component3() {
        return this.f42853c;
    }

    @NotNull
    public final List<Object> component4() {
        return this.f42854d;
    }

    @NotNull
    public final List<Header> component5() {
        return this.f42855e;
    }

    @NotNull
    public final List<QueryString> component6() {
        return this.f42856f;
    }

    @Nullable
    public final PostData component7() {
        return this.f42857g;
    }

    public final long component8() {
        return this.f42858h;
    }

    public final long component9() {
        return this.f42859i;
    }

    @NotNull
    public final Request copy(@NotNull String method, @NotNull String url, @NotNull String httpVersion, @NotNull List<? extends Object> cookies, @NotNull List<Header> headers, @NotNull List<QueryString> queryString, @Nullable PostData postData, long j, long j2, long j3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(httpVersion, "httpVersion");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryString, "queryString");
        return new Request(method, url, httpVersion, cookies, headers, queryString, postData, j, j2, j3, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Request) {
            Request request = (Request) obj;
            return Intrinsics.areEqual(this.f42851a, request.f42851a) && Intrinsics.areEqual(this.f42852b, request.f42852b) && Intrinsics.areEqual(this.f42853c, request.f42853c) && Intrinsics.areEqual(this.f42854d, request.f42854d) && Intrinsics.areEqual(this.f42855e, request.f42855e) && Intrinsics.areEqual(this.f42856f, request.f42856f) && Intrinsics.areEqual(this.f42857g, request.f42857g) && this.f42858h == request.f42858h && this.f42859i == request.f42859i && this.f42860j == request.f42860j && Intrinsics.areEqual(this.f42861k, request.f42861k);
        }
        return false;
    }

    public final long getBodySize() {
        return this.f42859i;
    }

    @Nullable
    public final String getComment() {
        return this.f42861k;
    }

    @NotNull
    public final List<Object> getCookies() {
        return this.f42854d;
    }

    @NotNull
    public final List<Header> getHeaders() {
        return this.f42855e;
    }

    public final long getHeadersSize() {
        return this.f42858h;
    }

    @NotNull
    public final String getHttpVersion() {
        return this.f42853c;
    }

    @NotNull
    public final String getMethod() {
        return this.f42851a;
    }

    @Nullable
    public final PostData getPostData() {
        return this.f42857g;
    }

    @NotNull
    public final List<QueryString> getQueryString() {
        return this.f42856f;
    }

    public final long getTotalSize() {
        return this.f42860j;
    }

    @NotNull
    public final String getUrl() {
        return this.f42852b;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f42851a.hashCode() * 31) + this.f42852b.hashCode()) * 31) + this.f42853c.hashCode()) * 31) + this.f42854d.hashCode()) * 31) + this.f42855e.hashCode()) * 31) + this.f42856f.hashCode()) * 31;
        PostData postData = this.f42857g;
        int hashCode2 = (((((((hashCode + (postData == null ? 0 : postData.hashCode())) * 31) + AbstractC17631Fh1.m68395a(this.f42858h)) * 31) + AbstractC17631Fh1.m68395a(this.f42859i)) * 31) + AbstractC17631Fh1.m68395a(this.f42860j)) * 31;
        String str = this.f42861k;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42851a;
        String str2 = this.f42852b;
        String str3 = this.f42853c;
        List<Object> list = this.f42854d;
        List<Header> list2 = this.f42855e;
        List<QueryString> list3 = this.f42856f;
        PostData postData = this.f42857g;
        long j = this.f42858h;
        long j2 = this.f42859i;
        long j3 = this.f42860j;
        String str4 = this.f42861k;
        return "Request(method=" + str + ", url=" + str2 + ", httpVersion=" + str3 + ", cookies=" + list + ", headers=" + list2 + ", queryString=" + list3 + ", postData=" + postData + ", headersSize=" + j + ", bodySize=" + j2 + ", totalSize=" + j3 + ", comment=" + str4 + ")";
    }

    public /* synthetic */ Request(String str, String str2, String str3, List list, List list2, List list3, PostData postData, long j, long j2, long j3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, list2, list3, (i & 64) != 0 ? null : postData, j, j2, j3, (i & 1024) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Request(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = r21.getMethod()
            java.lang.String r2 = ""
            if (r1 != 0) goto L11
            r4 = r2
            goto L12
        L11:
            r4 = r1
        L12:
            java.lang.String r1 = r21.getUrl()
            if (r1 != 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r1
        L1b:
            java.lang.String r1 = r21.getProtocol()
            if (r1 != 0) goto L23
            r6 = r2
            goto L24
        L23:
            r6 = r1
        L24:
            java.util.List r1 = r21.getParsedRequestHeaders()
            if (r1 == 0) goto L52
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p000.AbstractC10172es.collectionSizeOrDefault(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L50
            java.lang.Object r3 = r1.next()
            com.chuckerteam.chucker.internal.data.entity.HttpHeader r3 = (com.chuckerteam.chucker.internal.data.entity.HttpHeader) r3
            com.chuckerteam.chucker.internal.data.har.log.entry.Header r7 = new com.chuckerteam.chucker.internal.data.har.log.entry.Header
            r7.<init>(r3)
            r2.add(r7)
            goto L3b
        L50:
            r8 = r2
            goto L57
        L52:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            r8 = r1
        L57:
            java.lang.String r1 = r21.getUrl()
            if (r1 == 0) goto L6e
            com.chuckerteam.chucker.internal.data.har.log.entry.request.QueryString$Companion r2 = com.chuckerteam.chucker.internal.data.har.log.entry.request.QueryString.Companion
            okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
            okhttp3.HttpUrl r1 = r3.get(r1)
            java.util.List r1 = r2.fromUrl(r1)
            if (r1 != 0) goto L6c
            goto L6e
        L6c:
            r9 = r1
            goto L73
        L6e:
            java.util.List r1 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L6c
        L73:
            java.lang.Long r1 = r21.getRequestPayloadSize()
            if (r1 == 0) goto L80
            com.chuckerteam.chucker.internal.data.har.log.entry.request.PostData r1 = new com.chuckerteam.chucker.internal.data.har.log.entry.request.PostData
            r1.<init>(r0)
        L7e:
            r10 = r1
            goto L82
        L80:
            r1 = 0
            goto L7e
        L82:
            java.lang.Long r1 = r21.getRequestHeadersSize()
            r2 = 0
            if (r1 == 0) goto L8f
            long r11 = r1.longValue()
            goto L90
        L8f:
            r11 = r2
        L90:
            java.lang.Long r1 = r21.getRequestPayloadSize()
            if (r1 == 0) goto L9c
            long r1 = r1.longValue()
            r13 = r1
            goto L9d
        L9c:
            r13 = r2
        L9d:
            long r15 = r21.getRequestTotalSize()
            r18 = 1032(0x408, float:1.446E-42)
            r19 = 0
            r7 = 0
            r17 = 0
            r3 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.entry.Request.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}