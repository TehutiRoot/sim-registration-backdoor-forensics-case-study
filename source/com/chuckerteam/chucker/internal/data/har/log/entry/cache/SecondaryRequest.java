package com.chuckerteam.chucker.internal.data.har.log.entry.cache;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJF\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\f¨\u0006&"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;", "", "", ClientCookie.EXPIRES_ATTR, "lastAccess", "eTag", "", "hitCount", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getExpires", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLastAccess", OperatorName.CURVE_TO, "getETag", "d", "I", "getHitCount", "e", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SecondaryRequest {
    @SerializedName(ClientCookie.EXPIRES_ATTR)
    @Nullable

    /* renamed from: a */
    private final String f42869a;
    @SerializedName("lastAccess")
    @NotNull

    /* renamed from: b */
    private final String f42870b;
    @SerializedName("eTag")
    @NotNull

    /* renamed from: c */
    private final String f42871c;
    @SerializedName("hitCount")

    /* renamed from: d */
    private final int f42872d;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: e */
    private final String f42873e;

    public SecondaryRequest(@Nullable String str, @NotNull String lastAccess, @NotNull String eTag, int i, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(lastAccess, "lastAccess");
        Intrinsics.checkNotNullParameter(eTag, "eTag");
        this.f42869a = str;
        this.f42870b = lastAccess;
        this.f42871c = eTag;
        this.f42872d = i;
        this.f42873e = str2;
    }

    public static /* synthetic */ SecondaryRequest copy$default(SecondaryRequest secondaryRequest, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = secondaryRequest.f42869a;
        }
        if ((i2 & 2) != 0) {
            str2 = secondaryRequest.f42870b;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = secondaryRequest.f42871c;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = secondaryRequest.f42872d;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = secondaryRequest.f42873e;
        }
        return secondaryRequest.copy(str, str5, str6, i3, str4);
    }

    @Nullable
    public final String component1() {
        return this.f42869a;
    }

    @NotNull
    public final String component2() {
        return this.f42870b;
    }

    @NotNull
    public final String component3() {
        return this.f42871c;
    }

    public final int component4() {
        return this.f42872d;
    }

    @Nullable
    public final String component5() {
        return this.f42873e;
    }

    @NotNull
    public final SecondaryRequest copy(@Nullable String str, @NotNull String lastAccess, @NotNull String eTag, int i, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(lastAccess, "lastAccess");
        Intrinsics.checkNotNullParameter(eTag, "eTag");
        return new SecondaryRequest(str, lastAccess, eTag, i, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SecondaryRequest) {
            SecondaryRequest secondaryRequest = (SecondaryRequest) obj;
            return Intrinsics.areEqual(this.f42869a, secondaryRequest.f42869a) && Intrinsics.areEqual(this.f42870b, secondaryRequest.f42870b) && Intrinsics.areEqual(this.f42871c, secondaryRequest.f42871c) && this.f42872d == secondaryRequest.f42872d && Intrinsics.areEqual(this.f42873e, secondaryRequest.f42873e);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42873e;
    }

    @NotNull
    public final String getETag() {
        return this.f42871c;
    }

    @Nullable
    public final String getExpires() {
        return this.f42869a;
    }

    public final int getHitCount() {
        return this.f42872d;
    }

    @NotNull
    public final String getLastAccess() {
        return this.f42870b;
    }

    public int hashCode() {
        String str = this.f42869a;
        int hashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + this.f42870b.hashCode()) * 31) + this.f42871c.hashCode()) * 31) + this.f42872d) * 31;
        String str2 = this.f42873e;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42869a;
        String str2 = this.f42870b;
        String str3 = this.f42871c;
        int i = this.f42872d;
        String str4 = this.f42873e;
        return "SecondaryRequest(expires=" + str + ", lastAccess=" + str2 + ", eTag=" + str3 + ", hitCount=" + i + ", comment=" + str4 + ")";
    }

    public /* synthetic */ SecondaryRequest(String str, String str2, String str3, int i, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, str2, str3, i, (i2 & 16) != 0 ? null : str4);
    }
}
