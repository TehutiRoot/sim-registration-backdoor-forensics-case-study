package com.chuckerteam.chucker.internal.data.har.log.entry;

import com.chuckerteam.chucker.internal.data.har.log.entry.cache.SecondaryRequest;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;", "", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;", "afterRequest", "beforeRequest", "", ClientCookie.COMMENT_ATTR, "<init>", "(Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;Ljava/lang/String;)V", "component1", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/Cache;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/cache/SecondaryRequest;", "getAfterRequest", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getBeforeRequest", OperatorName.CURVE_TO, "Ljava/lang/String;", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Cache {
    @SerializedName("afterRequest")
    @Nullable

    /* renamed from: a */
    private final SecondaryRequest f42845a;
    @SerializedName("beforeRequest")
    @Nullable

    /* renamed from: b */
    private final SecondaryRequest f42846b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42847c;

    public Cache() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Cache copy$default(Cache cache, SecondaryRequest secondaryRequest, SecondaryRequest secondaryRequest2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            secondaryRequest = cache.f42845a;
        }
        if ((i & 2) != 0) {
            secondaryRequest2 = cache.f42846b;
        }
        if ((i & 4) != 0) {
            str = cache.f42847c;
        }
        return cache.copy(secondaryRequest, secondaryRequest2, str);
    }

    @Nullable
    public final SecondaryRequest component1() {
        return this.f42845a;
    }

    @Nullable
    public final SecondaryRequest component2() {
        return this.f42846b;
    }

    @Nullable
    public final String component3() {
        return this.f42847c;
    }

    @NotNull
    public final Cache copy(@Nullable SecondaryRequest secondaryRequest, @Nullable SecondaryRequest secondaryRequest2, @Nullable String str) {
        return new Cache(secondaryRequest, secondaryRequest2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Cache) {
            Cache cache = (Cache) obj;
            return Intrinsics.areEqual(this.f42845a, cache.f42845a) && Intrinsics.areEqual(this.f42846b, cache.f42846b) && Intrinsics.areEqual(this.f42847c, cache.f42847c);
        }
        return false;
    }

    @Nullable
    public final SecondaryRequest getAfterRequest() {
        return this.f42845a;
    }

    @Nullable
    public final SecondaryRequest getBeforeRequest() {
        return this.f42846b;
    }

    @Nullable
    public final String getComment() {
        return this.f42847c;
    }

    public int hashCode() {
        SecondaryRequest secondaryRequest = this.f42845a;
        int hashCode = (secondaryRequest == null ? 0 : secondaryRequest.hashCode()) * 31;
        SecondaryRequest secondaryRequest2 = this.f42846b;
        int hashCode2 = (hashCode + (secondaryRequest2 == null ? 0 : secondaryRequest2.hashCode())) * 31;
        String str = this.f42847c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        SecondaryRequest secondaryRequest = this.f42845a;
        SecondaryRequest secondaryRequest2 = this.f42846b;
        String str = this.f42847c;
        return "Cache(afterRequest=" + secondaryRequest + ", beforeRequest=" + secondaryRequest2 + ", comment=" + str + ")";
    }

    public Cache(@Nullable SecondaryRequest secondaryRequest, @Nullable SecondaryRequest secondaryRequest2, @Nullable String str) {
        this.f42845a = secondaryRequest;
        this.f42846b = secondaryRequest2;
        this.f42847c = str;
    }

    public /* synthetic */ Cache(SecondaryRequest secondaryRequest, SecondaryRequest secondaryRequest2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : secondaryRequest, (i & 2) != 0 ? null : secondaryRequest2, (i & 4) != 0 ? null : str);
    }
}