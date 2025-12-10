package com.chuckerteam.chucker.internal.data.har.log.entry;

import com.chuckerteam.chucker.internal.data.entity.HttpHeader;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ0\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\f¨\u0006 "}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/Header;", "", "", "name", "value", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "header", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/Header;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", OperatorName.CURVE_TO, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Header {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42848a;
    @SerializedName("value")
    @NotNull

    /* renamed from: b */
    private final String f42849b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42850c;

    public Header(@NotNull String name, @NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42848a = name;
        this.f42849b = value;
        this.f42850c = str;
    }

    public static /* synthetic */ Header copy$default(Header header, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = header.f42848a;
        }
        if ((i & 2) != 0) {
            str2 = header.f42849b;
        }
        if ((i & 4) != 0) {
            str3 = header.f42850c;
        }
        return header.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f42848a;
    }

    @NotNull
    public final String component2() {
        return this.f42849b;
    }

    @Nullable
    public final String component3() {
        return this.f42850c;
    }

    @NotNull
    public final Header copy(@NotNull String name, @NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Header(name, value, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return Intrinsics.areEqual(this.f42848a, header.f42848a) && Intrinsics.areEqual(this.f42849b, header.f42849b) && Intrinsics.areEqual(this.f42850c, header.f42850c);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42850c;
    }

    @NotNull
    public final String getName() {
        return this.f42848a;
    }

    @NotNull
    public final String getValue() {
        return this.f42849b;
    }

    public int hashCode() {
        int hashCode = ((this.f42848a.hashCode() * 31) + this.f42849b.hashCode()) * 31;
        String str = this.f42850c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f42848a;
        String str2 = this.f42849b;
        String str3 = this.f42850c;
        return "Header(name=" + str + ", value=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ Header(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(@NotNull HttpHeader header) {
        this(header.getName(), header.getValue(), null, 4, null);
        Intrinsics.checkNotNullParameter(header, "header");
    }
}