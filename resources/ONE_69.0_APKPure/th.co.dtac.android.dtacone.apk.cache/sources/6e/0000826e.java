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

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/Browser;", "", "", "name", ClientCookie.VERSION_ATTR, ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/Browser;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getName", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getVersion", OperatorName.CURVE_TO, "getComment", "com.github.ChuckerTeam.Chucker.library"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Browser {
    @SerializedName("name")
    @NotNull

    /* renamed from: a */
    private final String f42824a;
    @SerializedName(ClientCookie.VERSION_ATTR)
    @NotNull

    /* renamed from: b */
    private final String f42825b;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: c */
    private final String f42826c;

    public Browser(@NotNull String name, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.f42824a = name;
        this.f42825b = version;
        this.f42826c = str;
    }

    public static /* synthetic */ Browser copy$default(Browser browser, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = browser.f42824a;
        }
        if ((i & 2) != 0) {
            str2 = browser.f42825b;
        }
        if ((i & 4) != 0) {
            str3 = browser.f42826c;
        }
        return browser.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f42824a;
    }

    @NotNull
    public final String component2() {
        return this.f42825b;
    }

    @Nullable
    public final String component3() {
        return this.f42826c;
    }

    @NotNull
    public final Browser copy(@NotNull String name, @NotNull String version, @Nullable String str) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new Browser(name, version, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Browser) {
            Browser browser = (Browser) obj;
            return Intrinsics.areEqual(this.f42824a, browser.f42824a) && Intrinsics.areEqual(this.f42825b, browser.f42825b) && Intrinsics.areEqual(this.f42826c, browser.f42826c);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42826c;
    }

    @NotNull
    public final String getName() {
        return this.f42824a;
    }

    @NotNull
    public final String getVersion() {
        return this.f42825b;
    }

    public int hashCode() {
        int hashCode = ((this.f42824a.hashCode() * 31) + this.f42825b.hashCode()) * 31;
        String str = this.f42826c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.f42824a;
        String str2 = this.f42825b;
        String str3 = this.f42826c;
        return "Browser(name=" + str + ", version=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ Browser(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}