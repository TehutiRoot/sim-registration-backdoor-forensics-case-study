package com.chuckerteam.chucker.internal.data.har.log.page;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;", "", "", "onContentLoad", "onLoad", "", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/Long;", "component2", "component3", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Long;", "getOnContentLoad", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getOnLoad", OperatorName.CURVE_TO, "Ljava/lang/String;", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PageTimings {
    @SerializedName("onContentLoad")
    @Nullable

    /* renamed from: a */
    private final Long f42893a;
    @SerializedName("onLoad")
    @Nullable

    /* renamed from: b */
    private final Long f42894b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42895c;

    public PageTimings() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PageTimings copy$default(PageTimings pageTimings, Long l, Long l2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = pageTimings.f42893a;
        }
        if ((i & 2) != 0) {
            l2 = pageTimings.f42894b;
        }
        if ((i & 4) != 0) {
            str = pageTimings.f42895c;
        }
        return pageTimings.copy(l, l2, str);
    }

    @Nullable
    public final Long component1() {
        return this.f42893a;
    }

    @Nullable
    public final Long component2() {
        return this.f42894b;
    }

    @Nullable
    public final String component3() {
        return this.f42895c;
    }

    @NotNull
    public final PageTimings copy(@Nullable Long l, @Nullable Long l2, @Nullable String str) {
        return new PageTimings(l, l2, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PageTimings) {
            PageTimings pageTimings = (PageTimings) obj;
            return Intrinsics.areEqual(this.f42893a, pageTimings.f42893a) && Intrinsics.areEqual(this.f42894b, pageTimings.f42894b) && Intrinsics.areEqual(this.f42895c, pageTimings.f42895c);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42895c;
    }

    @Nullable
    public final Long getOnContentLoad() {
        return this.f42893a;
    }

    @Nullable
    public final Long getOnLoad() {
        return this.f42894b;
    }

    public int hashCode() {
        Long l = this.f42893a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f42894b;
        int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f42895c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l = this.f42893a;
        Long l2 = this.f42894b;
        String str = this.f42895c;
        return "PageTimings(onContentLoad=" + l + ", onLoad=" + l2 + ", comment=" + str + ")";
    }

    public PageTimings(@Nullable Long l, @Nullable Long l2, @Nullable String str) {
        this.f42893a = l;
        this.f42894b = l2;
        this.f42895c = str;
    }

    public /* synthetic */ PageTimings(Long l, Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str);
    }
}
