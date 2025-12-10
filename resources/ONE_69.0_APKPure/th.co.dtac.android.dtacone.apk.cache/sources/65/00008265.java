package com.chuckerteam.chucker.internal.data.entity;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "", "", "name", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/entity/HttpHeader;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class HttpHeader {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42800a;
    @SerializedName("value")
    @NotNull

    /* renamed from: b */
    private final String f42801b;

    public HttpHeader(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42800a = name;
        this.f42801b = value;
    }

    public static /* synthetic */ HttpHeader copy$default(HttpHeader httpHeader, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = httpHeader.f42800a;
        }
        if ((i & 2) != 0) {
            str2 = httpHeader.f42801b;
        }
        return httpHeader.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.f42800a;
    }

    @NotNull
    public final String component2() {
        return this.f42801b;
    }

    @NotNull
    public final HttpHeader copy(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new HttpHeader(name, value);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpHeader) {
            HttpHeader httpHeader = (HttpHeader) obj;
            return Intrinsics.areEqual(this.f42800a, httpHeader.f42800a) && Intrinsics.areEqual(this.f42801b, httpHeader.f42801b);
        }
        return false;
    }

    @NotNull
    public final String getName() {
        return this.f42800a;
    }

    @NotNull
    public final String getValue() {
        return this.f42801b;
    }

    public int hashCode() {
        return (this.f42800a.hashCode() * 31) + this.f42801b.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f42800a;
        String str2 = this.f42801b;
        return "HttpHeader(name=" + str + ", value=" + str2 + ")";
    }
}