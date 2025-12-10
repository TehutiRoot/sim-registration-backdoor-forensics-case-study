package com.chuckerteam.chucker.internal.data.har.log.entry;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0080\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJf\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010/\u001a\u0004\b6\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001c¨\u0006:"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;", "", "", "blocked", "dns", "ssl", "connect", "send", "wait", "receive", "", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJLjava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "getTime", "()J", "component1", "()Ljava/lang/Long;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;JJJJLjava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/Timings;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Long;", "getBlocked", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDns", OperatorName.CURVE_TO, "getSsl", "d", OperatorName.SET_LINE_CAPSTYLE, "getConnect", "e", "getSend", OperatorName.FILL_NON_ZERO, "getWait", OperatorName.NON_STROKING_GRAY, "getReceive", OperatorName.CLOSE_PATH, "Ljava/lang/String;", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Timings {
    @SerializedName("blocked")
    @Nullable

    /* renamed from: a */
    private final Long f42861a;
    @SerializedName("dns")
    @Nullable

    /* renamed from: b */
    private final Long f42862b;
    @SerializedName("ssl")
    @Nullable

    /* renamed from: c */
    private final Long f42863c;
    @SerializedName("connect")

    /* renamed from: d */
    private final long f42864d;
    @SerializedName("send")

    /* renamed from: e */
    private final long f42865e;
    @SerializedName("wait")

    /* renamed from: f */
    private final long f42866f;
    @SerializedName("receive")

    /* renamed from: g */
    private final long f42867g;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @NotNull

    /* renamed from: h */
    private final String f42868h;

    public Timings(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, long j, long j2, long j3, long j4, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.f42861a = l;
        this.f42862b = l2;
        this.f42863c = l3;
        this.f42864d = j;
        this.f42865e = j2;
        this.f42866f = j3;
        this.f42867g = j4;
        this.f42868h = comment;
    }

    @Nullable
    public final Long component1() {
        return this.f42861a;
    }

    @Nullable
    public final Long component2() {
        return this.f42862b;
    }

    @Nullable
    public final Long component3() {
        return this.f42863c;
    }

    public final long component4() {
        return this.f42864d;
    }

    public final long component5() {
        return this.f42865e;
    }

    public final long component6() {
        return this.f42866f;
    }

    public final long component7() {
        return this.f42867g;
    }

    @NotNull
    public final String component8() {
        return this.f42868h;
    }

    @NotNull
    public final Timings copy(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, long j, long j2, long j3, long j4, @NotNull String comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new Timings(l, l2, l3, j, j2, j3, j4, comment);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Timings) {
            Timings timings = (Timings) obj;
            return Intrinsics.areEqual(this.f42861a, timings.f42861a) && Intrinsics.areEqual(this.f42862b, timings.f42862b) && Intrinsics.areEqual(this.f42863c, timings.f42863c) && this.f42864d == timings.f42864d && this.f42865e == timings.f42865e && this.f42866f == timings.f42866f && this.f42867g == timings.f42867g && Intrinsics.areEqual(this.f42868h, timings.f42868h);
        }
        return false;
    }

    @Nullable
    public final Long getBlocked() {
        return this.f42861a;
    }

    @NotNull
    public final String getComment() {
        return this.f42868h;
    }

    public final long getConnect() {
        return this.f42864d;
    }

    @Nullable
    public final Long getDns() {
        return this.f42862b;
    }

    public final long getReceive() {
        return this.f42867g;
    }

    public final long getSend() {
        return this.f42865e;
    }

    @Nullable
    public final Long getSsl() {
        return this.f42863c;
    }

    public final long getTime() {
        long j;
        long j2;
        Long l = this.f42861a;
        long j3 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        Long l2 = this.f42862b;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = 0;
        }
        long j4 = j + j2;
        Long l3 = this.f42863c;
        if (l3 != null) {
            j3 = l3.longValue();
        }
        return j4 + j3 + this.f42864d + this.f42865e + this.f42866f + this.f42867g;
    }

    public final long getWait() {
        return this.f42866f;
    }

    public int hashCode() {
        Long l = this.f42861a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f42862b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f42863c;
        return ((((((((((hashCode2 + (l3 != null ? l3.hashCode() : 0)) * 31) + AbstractC17792Ig1.m67882a(this.f42864d)) * 31) + AbstractC17792Ig1.m67882a(this.f42865e)) * 31) + AbstractC17792Ig1.m67882a(this.f42866f)) * 31) + AbstractC17792Ig1.m67882a(this.f42867g)) * 31) + this.f42868h.hashCode();
    }

    @NotNull
    public String toString() {
        Long l = this.f42861a;
        Long l2 = this.f42862b;
        Long l3 = this.f42863c;
        long j = this.f42864d;
        long j2 = this.f42865e;
        long j3 = this.f42866f;
        long j4 = this.f42867g;
        String str = this.f42868h;
        return "Timings(blocked=" + l + ", dns=" + l2 + ", ssl=" + l3 + ", connect=" + j + ", send=" + j2 + ", wait=" + j3 + ", receive=" + j4 + ", comment=" + str + ")";
    }

    public /* synthetic */ Timings(Long l, Long l2, Long l3, long j, long j2, long j3, long j4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, j3, (i & 64) != 0 ? 0L : j4, (i & 128) != 0 ? "The information described by this object is incomplete." : str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Timings(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r18) {
        /*
            r17 = this;
            java.lang.String r0 = "transaction"
            r1 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.Long r0 = r18.getTookMs()
            if (r0 == 0) goto L13
            long r0 = r0.longValue()
        L11:
            r10 = r0
            goto L16
        L13:
            r0 = 0
            goto L11
        L16:
            r15 = 223(0xdf, float:3.12E-43)
            r16 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            r14 = 0
            r2 = r17
            r2.<init>(r3, r4, r5, r6, r8, r10, r12, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.entry.Timings.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}
