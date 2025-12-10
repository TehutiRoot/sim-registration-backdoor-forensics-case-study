package com.chuckerteam.chucker.internal.data.har.log.entry.request.postdata;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b$\u0010\u000b¨\u0006%"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;", "", "", "name", "value", "fileName", "contentType", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", OperatorName.CURVE_TO, "getFileName", "d", "getContentType", "e", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Params {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42881a;
    @SerializedName("value")
    @Nullable

    /* renamed from: b */
    private final String f42882b;
    @SerializedName("fileName")
    @Nullable

    /* renamed from: c */
    private final String f42883c;
    @SerializedName("contentType")
    @Nullable

    /* renamed from: d */
    private final String f42884d;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: e */
    private final String f42885e;

    public Params(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f42881a = name;
        this.f42882b = str;
        this.f42883c = str2;
        this.f42884d = str3;
        this.f42885e = str4;
    }

    public static /* synthetic */ Params copy$default(Params params, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = params.f42881a;
        }
        if ((i & 2) != 0) {
            str2 = params.f42882b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = params.f42883c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = params.f42884d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = params.f42885e;
        }
        return params.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.f42881a;
    }

    @Nullable
    public final String component2() {
        return this.f42882b;
    }

    @Nullable
    public final String component3() {
        return this.f42883c;
    }

    @Nullable
    public final String component4() {
        return this.f42884d;
    }

    @Nullable
    public final String component5() {
        return this.f42885e;
    }

    @NotNull
    public final Params copy(@NotNull String name, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Params(name, str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Params) {
            Params params = (Params) obj;
            return Intrinsics.areEqual(this.f42881a, params.f42881a) && Intrinsics.areEqual(this.f42882b, params.f42882b) && Intrinsics.areEqual(this.f42883c, params.f42883c) && Intrinsics.areEqual(this.f42884d, params.f42884d) && Intrinsics.areEqual(this.f42885e, params.f42885e);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42885e;
    }

    @Nullable
    public final String getContentType() {
        return this.f42884d;
    }

    @Nullable
    public final String getFileName() {
        return this.f42883c;
    }

    @NotNull
    public final String getName() {
        return this.f42881a;
    }

    @Nullable
    public final String getValue() {
        return this.f42882b;
    }

    public int hashCode() {
        int hashCode = this.f42881a.hashCode() * 31;
        String str = this.f42882b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42883c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42884d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f42885e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42881a;
        String str2 = this.f42882b;
        String str3 = this.f42883c;
        String str4 = this.f42884d;
        String str5 = this.f42885e;
        return "Params(name=" + str + ", value=" + str2 + ", fileName=" + str3 + ", contentType=" + str4 + ", comment=" + str5 + ")";
    }

    public /* synthetic */ Params(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
