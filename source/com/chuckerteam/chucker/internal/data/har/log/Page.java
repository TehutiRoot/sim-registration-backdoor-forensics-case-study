package com.chuckerteam.chucker.internal.data.har.log;

import com.chuckerteam.chucker.internal.data.har.log.page.PageTimings;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\f¨\u0006("}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Page;", "", "", "startedDateTime", "id", MessageBundle.TITLE_ENTRY, "Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;", "pageTimings", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/Page;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getStartedDateTime", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getId", OperatorName.CURVE_TO, "getTitle", "d", "Lcom/chuckerteam/chucker/internal/data/har/log/page/PageTimings;", "getPageTimings", "e", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Page {
    @SerializedName("startedDateTime")
    @NotNull

    /* renamed from: a */
    private final String f42828a;
    @SerializedName("id")
    @NotNull

    /* renamed from: b */
    private final String f42829b;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @NotNull

    /* renamed from: c */
    private final String f42830c;
    @SerializedName("pageTimings")
    @NotNull

    /* renamed from: d */
    private final PageTimings f42831d;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: e */
    private final String f42832e;

    public Page(@NotNull String startedDateTime, @NotNull String id2, @NotNull String title, @NotNull PageTimings pageTimings, @Nullable String str) {
        Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pageTimings, "pageTimings");
        this.f42828a = startedDateTime;
        this.f42829b = id2;
        this.f42830c = title;
        this.f42831d = pageTimings;
        this.f42832e = str;
    }

    public static /* synthetic */ Page copy$default(Page page, String str, String str2, String str3, PageTimings pageTimings, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = page.f42828a;
        }
        if ((i & 2) != 0) {
            str2 = page.f42829b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = page.f42830c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            pageTimings = page.f42831d;
        }
        PageTimings pageTimings2 = pageTimings;
        if ((i & 16) != 0) {
            str4 = page.f42832e;
        }
        return page.copy(str, str5, str6, pageTimings2, str4);
    }

    @NotNull
    public final String component1() {
        return this.f42828a;
    }

    @NotNull
    public final String component2() {
        return this.f42829b;
    }

    @NotNull
    public final String component3() {
        return this.f42830c;
    }

    @NotNull
    public final PageTimings component4() {
        return this.f42831d;
    }

    @Nullable
    public final String component5() {
        return this.f42832e;
    }

    @NotNull
    public final Page copy(@NotNull String startedDateTime, @NotNull String id2, @NotNull String title, @NotNull PageTimings pageTimings, @Nullable String str) {
        Intrinsics.checkNotNullParameter(startedDateTime, "startedDateTime");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pageTimings, "pageTimings");
        return new Page(startedDateTime, id2, title, pageTimings, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Page) {
            Page page = (Page) obj;
            return Intrinsics.areEqual(this.f42828a, page.f42828a) && Intrinsics.areEqual(this.f42829b, page.f42829b) && Intrinsics.areEqual(this.f42830c, page.f42830c) && Intrinsics.areEqual(this.f42831d, page.f42831d) && Intrinsics.areEqual(this.f42832e, page.f42832e);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42832e;
    }

    @NotNull
    public final String getId() {
        return this.f42829b;
    }

    @NotNull
    public final PageTimings getPageTimings() {
        return this.f42831d;
    }

    @NotNull
    public final String getStartedDateTime() {
        return this.f42828a;
    }

    @NotNull
    public final String getTitle() {
        return this.f42830c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f42828a.hashCode() * 31) + this.f42829b.hashCode()) * 31) + this.f42830c.hashCode()) * 31) + this.f42831d.hashCode()) * 31;
        String str = this.f42832e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f42828a;
        String str2 = this.f42829b;
        String str3 = this.f42830c;
        PageTimings pageTimings = this.f42831d;
        String str4 = this.f42832e;
        return "Page(startedDateTime=" + str + ", id=" + str2 + ", title=" + str3 + ", pageTimings=" + pageTimings + ", comment=" + str4 + ")";
    }

    public /* synthetic */ Page(String str, String str2, String str3, PageTimings pageTimings, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, pageTimings, (i & 16) != 0 ? null : str4);
    }
}
