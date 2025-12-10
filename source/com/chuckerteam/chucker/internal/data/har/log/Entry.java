package com.chuckerteam.chucker.internal.data.har.log;

import androidx.annotation.VisibleForTesting;
import com.chuckerteam.chucker.internal.data.har.log.entry.Cache;
import com.chuckerteam.chucker.internal.data.har.log.entry.Request;
import com.chuckerteam.chucker.internal.data.har.log.entry.Response;
import com.chuckerteam.chucker.internal.data.har.log.entry.Timings;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0080\b\u0018\u0000 M2\u00020\u0001:\u0002MNBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J|\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0018J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b5\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u001b\"\u0004\b9\u0010:R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010!R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bG\u00102\u001a\u0004\bH\u0010\u0018R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bI\u00102\u001a\u0004\bJ\u0010\u0018R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\bK\u00102\u001a\u0004\bL\u0010\u0018¨\u0006O"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Entry;", "", "", "pageref", "startedDateTime", "", "time", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Request;", "request", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;", "response", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;", "cache", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;", "timings", "serverIPAddress", "connection", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;JLcom/chuckerteam/chucker/internal/data/har/log/entry/Request;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/Request;", "component5", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;", "component6", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;", "component7", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;JLcom/chuckerteam/chucker/internal/data/har/log/entry/Request;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/Entry;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getPageref", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getStartedDateTime", OperatorName.CURVE_TO, OperatorName.SET_LINE_CAPSTYLE, "getTime", "setTime", "(J)V", "d", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Request;", "getRequest", "e", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Response;", "getResponse", OperatorName.FILL_NON_ZERO, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;", "getCache", OperatorName.NON_STROKING_GRAY, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;", "getTimings", OperatorName.CLOSE_PATH, "getServerIPAddress", "i", "getConnection", OperatorName.SET_LINE_JOINSTYLE, "getComment", "Companion", "DateFormat", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Entry {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("pageref")
    @Nullable

    /* renamed from: a */
    private final String f42818a;
    @SerializedName("startedDateTime")
    @NotNull

    /* renamed from: b */
    private final String f42819b;
    @SerializedName("time")

    /* renamed from: c */
    private long f42820c;
    @SerializedName("request")
    @NotNull

    /* renamed from: d */
    private final Request f42821d;
    @SerializedName("response")
    @NotNull

    /* renamed from: e */
    private final Response f42822e;
    @SerializedName("cache")
    @NotNull

    /* renamed from: f */
    private final Cache f42823f;
    @SerializedName("timings")
    @NotNull

    /* renamed from: g */
    private final Timings f42824g;
    @SerializedName("serverIPAddress")
    @Nullable

    /* renamed from: h */
    private final String f42825h;
    @SerializedName("connection")
    @Nullable

    /* renamed from: i */
    private final String f42826i;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: j */
    private final String f42827j;

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Entry$Companion;", "", "<init>", "()V", "", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)Ljava/lang/String;", "DATE_FORMAT", "Ljava/lang/String;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String m49964a(long j) {
            SimpleDateFormat simpleDateFormat = DateFormat.INSTANCE.get();
            Intrinsics.checkNotNull(simpleDateFormat);
            String format = simpleDateFormat.format(new Date(j));
            Intrinsics.checkNotNullExpressionValue(format, "DateFormat.get()!!.format(Date(this))");
            return format;
        }

        public Companion() {
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014¨\u0006\u0005"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Entry$DateFormat;", "Ljava/lang/ThreadLocal;", "Ljava/text/SimpleDateFormat;", "()V", "initialValue", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static final class DateFormat extends ThreadLocal<SimpleDateFormat> {
        @NotNull
        public static final DateFormat INSTANCE = new DateFormat();

        @Override // java.lang.ThreadLocal
        @NotNull
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        }
    }

    public Entry(@Nullable String str, @NotNull String startedDateTime, long j, @NotNull Request request, @NotNull Response response, @NotNull Cache cache, @NotNull Timings timings, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timings, "timings");
        this.f42818a = str;
        this.f42819b = startedDateTime;
        this.f42820c = j;
        this.f42821d = request;
        this.f42822e = response;
        this.f42823f = cache;
        this.f42824g = timings;
        this.f42825h = str2;
        this.f42826i = str3;
        this.f42827j = str4;
    }

    @Nullable
    public final String component1() {
        return this.f42818a;
    }

    @Nullable
    public final String component10() {
        return this.f42827j;
    }

    @NotNull
    public final String component2() {
        return this.f42819b;
    }

    public final long component3() {
        return this.f42820c;
    }

    @NotNull
    public final Request component4() {
        return this.f42821d;
    }

    @NotNull
    public final Response component5() {
        return this.f42822e;
    }

    @NotNull
    public final Cache component6() {
        return this.f42823f;
    }

    @NotNull
    public final Timings component7() {
        return this.f42824g;
    }

    @Nullable
    public final String component8() {
        return this.f42825h;
    }

    @Nullable
    public final String component9() {
        return this.f42826i;
    }

    @NotNull
    public final Entry copy(@Nullable String str, @NotNull String startedDateTime, long j, @NotNull Request request, @NotNull Response response, @NotNull Cache cache, @NotNull Timings timings, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(timings, "timings");
        return new Entry(str, startedDateTime, j, request, response, cache, timings, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.f42818a, entry.f42818a) && Intrinsics.areEqual(this.f42819b, entry.f42819b) && this.f42820c == entry.f42820c && Intrinsics.areEqual(this.f42821d, entry.f42821d) && Intrinsics.areEqual(this.f42822e, entry.f42822e) && Intrinsics.areEqual(this.f42823f, entry.f42823f) && Intrinsics.areEqual(this.f42824g, entry.f42824g) && Intrinsics.areEqual(this.f42825h, entry.f42825h) && Intrinsics.areEqual(this.f42826i, entry.f42826i) && Intrinsics.areEqual(this.f42827j, entry.f42827j);
        }
        return false;
    }

    @NotNull
    public final Cache getCache() {
        return this.f42823f;
    }

    @Nullable
    public final String getComment() {
        return this.f42827j;
    }

    @Nullable
    public final String getConnection() {
        return this.f42826i;
    }

    @Nullable
    public final String getPageref() {
        return this.f42818a;
    }

    @NotNull
    public final Request getRequest() {
        return this.f42821d;
    }

    @NotNull
    public final Response getResponse() {
        return this.f42822e;
    }

    @Nullable
    public final String getServerIPAddress() {
        return this.f42825h;
    }

    @NotNull
    public final String getStartedDateTime() {
        return this.f42819b;
    }

    public final long getTime() {
        return this.f42820c;
    }

    @NotNull
    public final Timings getTimings() {
        return this.f42824g;
    }

    public int hashCode() {
        String str = this.f42818a;
        int hashCode = (((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f42819b.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.f42820c)) * 31) + this.f42821d.hashCode()) * 31) + this.f42822e.hashCode()) * 31) + this.f42823f.hashCode()) * 31) + this.f42824g.hashCode()) * 31;
        String str2 = this.f42825h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42826i;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f42827j;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setTime(long j) {
        this.f42820c = j;
    }

    @NotNull
    public String toString() {
        String str = this.f42818a;
        String str2 = this.f42819b;
        long j = this.f42820c;
        Request request = this.f42821d;
        Response response = this.f42822e;
        Cache cache = this.f42823f;
        Timings timings = this.f42824g;
        String str3 = this.f42825h;
        String str4 = this.f42826i;
        String str5 = this.f42827j;
        return "Entry(pageref=" + str + ", startedDateTime=" + str2 + ", time=" + j + ", request=" + request + ", response=" + response + ", cache=" + cache + ", timings=" + timings + ", serverIPAddress=" + str3 + ", connection=" + str4 + ", comment=" + str5 + ")";
    }

    public /* synthetic */ Entry(String str, String str2, long j, Request request, Response response, Cache cache, Timings timings, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, j, request, response, cache, timings, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Entry(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r17) {
        /*
            r16 = this;
            r0 = r17
            java.lang.String r1 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.Long r1 = r17.getRequestDate()
            if (r1 == 0) goto L18
            com.chuckerteam.chucker.internal.data.har.log.Entry$Companion r2 = com.chuckerteam.chucker.internal.data.har.log.Entry.Companion
            long r3 = r1.longValue()
            java.lang.String r1 = com.chuckerteam.chucker.internal.data.har.log.Entry.Companion.access$harFormatted(r2, r3)
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 != 0) goto L1d
            java.lang.String r1 = ""
        L1d:
            r4 = r1
            com.chuckerteam.chucker.internal.data.har.log.entry.Timings r1 = new com.chuckerteam.chucker.internal.data.har.log.entry.Timings
            r1.<init>(r0)
            long r5 = r1.getTime()
            com.chuckerteam.chucker.internal.data.har.log.entry.Request r7 = new com.chuckerteam.chucker.internal.data.har.log.entry.Request
            r7.<init>(r0)
            com.chuckerteam.chucker.internal.data.har.log.entry.Response r8 = new com.chuckerteam.chucker.internal.data.har.log.entry.Response
            r8.<init>(r0)
            com.chuckerteam.chucker.internal.data.har.log.entry.Cache r1 = new com.chuckerteam.chucker.internal.data.har.log.entry.Cache
            r13 = 7
            r14 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            com.chuckerteam.chucker.internal.data.har.log.entry.Timings r10 = new com.chuckerteam.chucker.internal.data.har.log.entry.Timings
            r10.<init>(r0)
            r14 = 897(0x381, float:1.257E-42)
            r15 = 0
            r3 = 0
            r13 = 0
            r2 = r16
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.Entry.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}
