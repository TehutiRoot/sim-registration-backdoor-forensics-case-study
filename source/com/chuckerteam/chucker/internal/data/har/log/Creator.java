package com.chuckerteam.chucker.internal.data.har.log;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "", "", "name", ClientCookie.VERSION_ATTR, ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/Creator;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getVersion", OperatorName.CURVE_TO, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Creator {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42815a;
    @SerializedName(ClientCookie.VERSION_ATTR)
    @NotNull

    /* renamed from: b */
    private final String f42816b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42817c;

    public Creator(@NotNull String name, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f42815a = name;
        this.f42816b = version;
        this.f42817c = str;
    }

    public static /* synthetic */ Creator copy$default(Creator creator, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = creator.f42815a;
        }
        if ((i & 2) != 0) {
            str2 = creator.f42816b;
        }
        if ((i & 4) != 0) {
            str3 = creator.f42817c;
        }
        return creator.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f42815a;
    }

    @NotNull
    public final String component2() {
        return this.f42816b;
    }

    @Nullable
    public final String component3() {
        return this.f42817c;
    }

    @NotNull
    public final Creator copy(@NotNull String name, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new Creator(name, version, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Creator) {
            Creator creator = (Creator) obj;
            return Intrinsics.areEqual(this.f42815a, creator.f42815a) && Intrinsics.areEqual(this.f42816b, creator.f42816b) && Intrinsics.areEqual(this.f42817c, creator.f42817c);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42817c;
    }

    @NotNull
    public final String getName() {
        return this.f42815a;
    }

    @NotNull
    public final String getVersion() {
        return this.f42816b;
    }

    public int hashCode() {
        int hashCode = ((this.f42815a.hashCode() * 31) + this.f42816b.hashCode()) * 31;
        String str = this.f42817c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f42815a;
        String str2 = this.f42816b;
        String str3 = this.f42817c;
        return "Creator(name=" + str + ", version=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ Creator(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
