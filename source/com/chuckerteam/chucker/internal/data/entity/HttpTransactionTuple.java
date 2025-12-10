package com.chuckerteam.chucker.internal.data.entity;

import androidx.core.app.NotificationCompat;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import com.chuckerteam.chucker.internal.support.FormatUtils;
import com.chuckerteam.chucker.internal.support.FormattedUrl;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bY\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\"J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010\"J\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b.\u0010\"J´\u0001\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b1\u0010\"J\u0010\u00102\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u00107\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010:R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010<\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010?R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010D\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010GR$\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010D\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010GR$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u0010D\u001a\u0004\bO\u0010\"\"\u0004\bP\u0010GR$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010GR$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010(\"\u0004\bW\u0010XR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bY\u0010<\u001a\u0004\bZ\u0010\u001f\"\u0004\b[\u0010?R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010<\u001a\u0004\b]\u0010\u001f\"\u0004\b^\u0010?R$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010D\u001a\u0004\b`\u0010\"\"\u0004\ba\u0010GR\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010-\"\u0004\be\u0010fR$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010D\u001a\u0004\bh\u0010\"\"\u0004\bi\u0010GR\u0011\u0010j\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bj\u0010-R\u0011\u0010n\u001a\u00020k8F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0013\u0010p\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010\"R\u0011\u0010r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bq\u0010\"¨\u0006s"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "", "", "id", "requestDate", "tookMs", "", "protocol", FirebaseAnalytics.Param.METHOD, "host", ClientCookie.PATH_ATTR, "scheme", "", "responseCode", "requestPayloadSize", "responsePayloadSize", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "graphQlDetected", "graphQlOperationName", "<init>", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)V", "bytes", PDPageLabelRange.STYLE_LETTERS_LOWER, "(J)Ljava/lang/String;", "encode", "getFormattedPath", "(Z)Ljava/lang/String;", "component1", "()J", "component2", "()Ljava/lang/Long;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "component10", "component11", "component12", "component13", "()Z", "component14", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/String;)Lcom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", OperatorName.SET_LINE_CAPSTYLE, "getId", "setId", "(J)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Long;", "getRequestDate", "setRequestDate", "(Ljava/lang/Long;)V", OperatorName.CURVE_TO, "getTookMs", "setTookMs", "d", "Ljava/lang/String;", "getProtocol", "setProtocol", "(Ljava/lang/String;)V", "e", "getMethod", "setMethod", OperatorName.FILL_NON_ZERO, "getHost", "setHost", OperatorName.NON_STROKING_GRAY, "getPath", "setPath", OperatorName.CLOSE_PATH, "getScheme", "setScheme", "i", "Ljava/lang/Integer;", "getResponseCode", "setResponseCode", "(Ljava/lang/Integer;)V", OperatorName.SET_LINE_JOINSTYLE, "getRequestPayloadSize", "setRequestPayloadSize", OperatorName.NON_STROKING_CMYK, "getResponsePayloadSize", "setResponsePayloadSize", OperatorName.LINE_TO, "getError", "setError", OperatorName.MOVE_TO, "Z", "getGraphQlDetected", "setGraphQlDetected", "(Z)V", OperatorName.ENDPATH, "getGraphQlOperationName", "setGraphQlOperationName", "isSsl", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", "getStatus", "()Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction$Status;", NotificationCompat.CATEGORY_STATUS, "getDurationString", "durationString", "getTotalSizeString", "totalSizeString", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHttpTransactionTuple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpTransactionTuple.kt\ncom/chuckerteam/chucker/internal/data/entity/HttpTransactionTuple\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
/* loaded from: classes3.dex */
public final class HttpTransactionTuple {

    /* renamed from: a */
    public long f42791a;

    /* renamed from: b */
    public Long f42792b;

    /* renamed from: c */
    public Long f42793c;

    /* renamed from: d */
    public String f42794d;

    /* renamed from: e */
    public String f42795e;

    /* renamed from: f */
    public String f42796f;

    /* renamed from: g */
    public String f42797g;

    /* renamed from: h */
    public String f42798h;

    /* renamed from: i */
    public Integer f42799i;

    /* renamed from: j */
    public Long f42800j;

    /* renamed from: k */
    public Long f42801k;

    /* renamed from: l */
    public String f42802l;

    /* renamed from: m */
    public boolean f42803m;

    /* renamed from: n */
    public String f42804n;

    public HttpTransactionTuple(long j, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Long l3, @Nullable Long l4, @Nullable String str6, boolean z, @Nullable String str7) {
        this.f42791a = j;
        this.f42792b = l;
        this.f42793c = l2;
        this.f42794d = str;
        this.f42795e = str2;
        this.f42796f = str3;
        this.f42797g = str4;
        this.f42798h = str5;
        this.f42799i = num;
        this.f42800j = l3;
        this.f42801k = l4;
        this.f42802l = str6;
        this.f42803m = z;
        this.f42804n = str7;
    }

    /* renamed from: a */
    public final String m49965a(long j) {
        return FormatUtils.INSTANCE.formatByteCount(j, true);
    }

    public final long component1() {
        return this.f42791a;
    }

    @Nullable
    public final Long component10() {
        return this.f42800j;
    }

    @Nullable
    public final Long component11() {
        return this.f42801k;
    }

    @Nullable
    public final String component12() {
        return this.f42802l;
    }

    public final boolean component13() {
        return this.f42803m;
    }

    @Nullable
    public final String component14() {
        return this.f42804n;
    }

    @Nullable
    public final Long component2() {
        return this.f42792b;
    }

    @Nullable
    public final Long component3() {
        return this.f42793c;
    }

    @Nullable
    public final String component4() {
        return this.f42794d;
    }

    @Nullable
    public final String component5() {
        return this.f42795e;
    }

    @Nullable
    public final String component6() {
        return this.f42796f;
    }

    @Nullable
    public final String component7() {
        return this.f42797g;
    }

    @Nullable
    public final String component8() {
        return this.f42798h;
    }

    @Nullable
    public final Integer component9() {
        return this.f42799i;
    }

    @NotNull
    public final HttpTransactionTuple copy(long j, @Nullable Long l, @Nullable Long l2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Long l3, @Nullable Long l4, @Nullable String str6, boolean z, @Nullable String str7) {
        return new HttpTransactionTuple(j, l, l2, str, str2, str3, str4, str5, num, l3, l4, str6, z, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpTransactionTuple) {
            HttpTransactionTuple httpTransactionTuple = (HttpTransactionTuple) obj;
            return this.f42791a == httpTransactionTuple.f42791a && Intrinsics.areEqual(this.f42792b, httpTransactionTuple.f42792b) && Intrinsics.areEqual(this.f42793c, httpTransactionTuple.f42793c) && Intrinsics.areEqual(this.f42794d, httpTransactionTuple.f42794d) && Intrinsics.areEqual(this.f42795e, httpTransactionTuple.f42795e) && Intrinsics.areEqual(this.f42796f, httpTransactionTuple.f42796f) && Intrinsics.areEqual(this.f42797g, httpTransactionTuple.f42797g) && Intrinsics.areEqual(this.f42798h, httpTransactionTuple.f42798h) && Intrinsics.areEqual(this.f42799i, httpTransactionTuple.f42799i) && Intrinsics.areEqual(this.f42800j, httpTransactionTuple.f42800j) && Intrinsics.areEqual(this.f42801k, httpTransactionTuple.f42801k) && Intrinsics.areEqual(this.f42802l, httpTransactionTuple.f42802l) && this.f42803m == httpTransactionTuple.f42803m && Intrinsics.areEqual(this.f42804n, httpTransactionTuple.f42804n);
        }
        return false;
    }

    @Nullable
    public final String getDurationString() {
        Long l = this.f42793c;
        if (l != null) {
            long longValue = l.longValue();
            return longValue + " ms";
        }
        return null;
    }

    @Nullable
    public final String getError() {
        return this.f42802l;
    }

    @NotNull
    public final String getFormattedPath(boolean z) {
        String str = this.f42797g;
        if (str == null) {
            return "";
        }
        HttpUrl parse = HttpUrl.Companion.parse("https://www.example.com" + str);
        if (parse == null) {
            return "";
        }
        return FormattedUrl.Companion.fromHttpUrl(parse, z).getPathWithQuery();
    }

    public final boolean getGraphQlDetected() {
        return this.f42803m;
    }

    @Nullable
    public final String getGraphQlOperationName() {
        return this.f42804n;
    }

    @Nullable
    public final String getHost() {
        return this.f42796f;
    }

    public final long getId() {
        return this.f42791a;
    }

    @Nullable
    public final String getMethod() {
        return this.f42795e;
    }

    @Nullable
    public final String getPath() {
        return this.f42797g;
    }

    @Nullable
    public final String getProtocol() {
        return this.f42794d;
    }

    @Nullable
    public final Long getRequestDate() {
        return this.f42792b;
    }

    @Nullable
    public final Long getRequestPayloadSize() {
        return this.f42800j;
    }

    @Nullable
    public final Integer getResponseCode() {
        return this.f42799i;
    }

    @Nullable
    public final Long getResponsePayloadSize() {
        return this.f42801k;
    }

    @Nullable
    public final String getScheme() {
        return this.f42798h;
    }

    @NotNull
    public final HttpTransaction.Status getStatus() {
        if (this.f42802l != null) {
            return HttpTransaction.Status.Failed;
        }
        if (this.f42799i == null) {
            return HttpTransaction.Status.Requested;
        }
        return HttpTransaction.Status.Complete;
    }

    @Nullable
    public final Long getTookMs() {
        return this.f42793c;
    }

    @NotNull
    public final String getTotalSizeString() {
        long j;
        Long l = this.f42800j;
        long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.f42801k;
        if (l2 != null) {
            j2 = l2.longValue();
        }
        return m49965a(j + j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int m67882a = AbstractC17792Ig1.m67882a(this.f42791a) * 31;
        Long l = this.f42792b;
        int hashCode = (m67882a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f42793c;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f42794d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42795e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42796f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f42797g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f42798h;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f42799i;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Long l3 = this.f42800j;
        int hashCode9 = (hashCode8 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f42801k;
        int hashCode10 = (hashCode9 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str6 = this.f42802l;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z = this.f42803m;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode11 + i) * 31;
        String str7 = this.f42804n;
        return i2 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean isSsl() {
        return AbstractC20204hN1.equals(this.f42798h, UriUtil.HTTPS_SCHEME, true);
    }

    public final void setError(@Nullable String str) {
        this.f42802l = str;
    }

    public final void setGraphQlDetected(boolean z) {
        this.f42803m = z;
    }

    public final void setGraphQlOperationName(@Nullable String str) {
        this.f42804n = str;
    }

    public final void setHost(@Nullable String str) {
        this.f42796f = str;
    }

    public final void setId(long j) {
        this.f42791a = j;
    }

    public final void setMethod(@Nullable String str) {
        this.f42795e = str;
    }

    public final void setPath(@Nullable String str) {
        this.f42797g = str;
    }

    public final void setProtocol(@Nullable String str) {
        this.f42794d = str;
    }

    public final void setRequestDate(@Nullable Long l) {
        this.f42792b = l;
    }

    public final void setRequestPayloadSize(@Nullable Long l) {
        this.f42800j = l;
    }

    public final void setResponseCode(@Nullable Integer num) {
        this.f42799i = num;
    }

    public final void setResponsePayloadSize(@Nullable Long l) {
        this.f42801k = l;
    }

    public final void setScheme(@Nullable String str) {
        this.f42798h = str;
    }

    public final void setTookMs(@Nullable Long l) {
        this.f42793c = l;
    }

    @NotNull
    public String toString() {
        long j = this.f42791a;
        Long l = this.f42792b;
        Long l2 = this.f42793c;
        String str = this.f42794d;
        String str2 = this.f42795e;
        String str3 = this.f42796f;
        String str4 = this.f42797g;
        String str5 = this.f42798h;
        Integer num = this.f42799i;
        Long l3 = this.f42800j;
        Long l4 = this.f42801k;
        String str6 = this.f42802l;
        boolean z = this.f42803m;
        String str7 = this.f42804n;
        return "HttpTransactionTuple(id=" + j + ", requestDate=" + l + ", tookMs=" + l2 + ", protocol=" + str + ", method=" + str2 + ", host=" + str3 + ", path=" + str4 + ", scheme=" + str5 + ", responseCode=" + num + ", requestPayloadSize=" + l3 + ", responsePayloadSize=" + l4 + ", error=" + str6 + ", graphQlDetected=" + z + ", graphQlOperationName=" + str7 + ")";
    }

    public /* synthetic */ HttpTransactionTuple(long j, Long l, Long l2, String str, String str2, String str3, String str4, String str5, Integer num, Long l3, Long l4, String str6, boolean z, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, l, l2, str, str2, str3, str4, str5, num, l3, l4, str6, (i & 4096) != 0 ? false : z, str7);
    }
}
