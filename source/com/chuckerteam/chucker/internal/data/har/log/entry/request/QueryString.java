package com.chuckerteam.chucker.internal.data.har.log.entry.request;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001e"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/QueryString;", "", "", "name", "value", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/QueryString;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getValue", OperatorName.CURVE_TO, "getComment", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class QueryString {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42878a;
    @SerializedName("value")
    @NotNull

    /* renamed from: b */
    private final String f42879b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42880c;

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/QueryString$Companion;", "", "()V", "fromUrl", "", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/QueryString;", ImagesContract.URL, "Lokhttp3/HttpUrl;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<QueryString> fromUrl(@NotNull HttpUrl url) {
            Intrinsics.checkNotNullParameter(url, "url");
            int querySize = url.querySize();
            ArrayList arrayList = new ArrayList(querySize);
            for (int i = 0; i < querySize; i++) {
                String queryParameterName = url.queryParameterName(i);
                String queryParameterValue = url.queryParameterValue(i);
                if (queryParameterValue == null) {
                    queryParameterValue = "";
                }
                arrayList.add(new QueryString(queryParameterName, queryParameterValue, null, 4, null));
            }
            return arrayList;
        }

        public Companion() {
        }
    }

    public QueryString(@NotNull String name, @NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f42878a = name;
        this.f42879b = value;
        this.f42880c = str;
    }

    public static /* synthetic */ QueryString copy$default(QueryString queryString, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryString.f42878a;
        }
        if ((i & 2) != 0) {
            str2 = queryString.f42879b;
        }
        if ((i & 4) != 0) {
            str3 = queryString.f42880c;
        }
        return queryString.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f42878a;
    }

    @NotNull
    public final String component2() {
        return this.f42879b;
    }

    @Nullable
    public final String component3() {
        return this.f42880c;
    }

    @NotNull
    public final QueryString copy(@NotNull String name, @NotNull String value, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new QueryString(name, value, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueryString) {
            QueryString queryString = (QueryString) obj;
            return Intrinsics.areEqual(this.f42878a, queryString.f42878a) && Intrinsics.areEqual(this.f42879b, queryString.f42879b) && Intrinsics.areEqual(this.f42880c, queryString.f42880c);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42880c;
    }

    @NotNull
    public final String getName() {
        return this.f42878a;
    }

    @NotNull
    public final String getValue() {
        return this.f42879b;
    }

    public int hashCode() {
        int hashCode = ((this.f42878a.hashCode() * 31) + this.f42879b.hashCode()) * 31;
        String str = this.f42880c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f42878a;
        String str2 = this.f42879b;
        String str3 = this.f42880c;
        return "QueryString(name=" + str + ", value=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ QueryString(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
