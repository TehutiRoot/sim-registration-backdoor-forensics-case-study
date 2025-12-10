package com.chuckerteam.chucker.internal.data.har.log.entry.response;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.protocol.HTTP;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u0000 12\u00020\u0001:\u00011BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015JV\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0015¨\u00062"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "", "", "size", "", "compression", "", "mimeType", TextBundle.TEXT_ENTRY, "encoding", ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Long;", "getSize", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Integer;", "getCompression", OperatorName.CURVE_TO, "Ljava/lang/String;", "getMimeType", "d", "getText", "e", "getEncoding", OperatorName.FILL_NON_ZERO, "getComment", "Companion", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class Content {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: g */
    public static final Content f42886g = new Content(0L, 0, HTTP.PLAIN_TEXT_TYPE, "", null, null, 48, null);
    @SerializedName("size")
    @Nullable

    /* renamed from: a */
    private final Long f42887a;
    @SerializedName("compression")
    @Nullable

    /* renamed from: b */
    private final Integer f42888b;
    @SerializedName("mimeType")
    @NotNull

    /* renamed from: c */
    private final String f42889c;
    @SerializedName(TextBundle.TEXT_ENTRY)
    @Nullable

    /* renamed from: d */
    private final String f42890d;
    @SerializedName("encoding")
    @Nullable

    /* renamed from: e */
    private final String f42891e;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: f */
    private final String f42892f;

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content$Companion;", "", "()V", "EMPTY", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "getEMPTY$com_github_ChuckerTeam_Chucker_library", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/response/Content;", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Content getEMPTY$com_github_ChuckerTeam_Chucker_library() {
            return Content.f42886g;
        }

        public Companion() {
        }
    }

    public Content(@Nullable Long l, @Nullable Integer num, @NotNull String mimeType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f42887a = l;
        this.f42888b = num;
        this.f42889c = mimeType;
        this.f42890d = str;
        this.f42891e = str2;
        this.f42892f = str3;
    }

    public static /* synthetic */ Content copy$default(Content content, Long l, Integer num, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = content.f42887a;
        }
        if ((i & 2) != 0) {
            num = content.f42888b;
        }
        Integer num2 = num;
        if ((i & 4) != 0) {
            str = content.f42889c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = content.f42890d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            str3 = content.f42891e;
        }
        String str7 = str3;
        if ((i & 32) != 0) {
            str4 = content.f42892f;
        }
        return content.copy(l, num2, str5, str6, str7, str4);
    }

    @Nullable
    public final Long component1() {
        return this.f42887a;
    }

    @Nullable
    public final Integer component2() {
        return this.f42888b;
    }

    @NotNull
    public final String component3() {
        return this.f42889c;
    }

    @Nullable
    public final String component4() {
        return this.f42890d;
    }

    @Nullable
    public final String component5() {
        return this.f42891e;
    }

    @Nullable
    public final String component6() {
        return this.f42892f;
    }

    @NotNull
    public final Content copy(@Nullable Long l, @Nullable Integer num, @NotNull String mimeType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new Content(l, num, mimeType, str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Content) {
            Content content = (Content) obj;
            return Intrinsics.areEqual(this.f42887a, content.f42887a) && Intrinsics.areEqual(this.f42888b, content.f42888b) && Intrinsics.areEqual(this.f42889c, content.f42889c) && Intrinsics.areEqual(this.f42890d, content.f42890d) && Intrinsics.areEqual(this.f42891e, content.f42891e) && Intrinsics.areEqual(this.f42892f, content.f42892f);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42892f;
    }

    @Nullable
    public final Integer getCompression() {
        return this.f42888b;
    }

    @Nullable
    public final String getEncoding() {
        return this.f42891e;
    }

    @NotNull
    public final String getMimeType() {
        return this.f42889c;
    }

    @Nullable
    public final Long getSize() {
        return this.f42887a;
    }

    @Nullable
    public final String getText() {
        return this.f42890d;
    }

    public int hashCode() {
        Long l = this.f42887a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.f42888b;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f42889c.hashCode()) * 31;
        String str = this.f42890d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42891e;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42892f;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Long l = this.f42887a;
        Integer num = this.f42888b;
        String str = this.f42889c;
        String str2 = this.f42890d;
        String str3 = this.f42891e;
        String str4 = this.f42892f;
        return "Content(size=" + l + ", compression=" + num + ", mimeType=" + str + ", text=" + str2 + ", encoding=" + str3 + ", comment=" + str4 + ")";
    }

    public /* synthetic */ Content(Long l, Integer num, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : num, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Content(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r11) {
        /*
            r10 = this;
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.Long r2 = r11.getResponsePayloadSize()
            java.lang.String r0 = r11.getResponseContentType()
            if (r0 != 0) goto L11
            java.lang.String r0 = "application/octet-stream"
        L11:
            r4 = r0
            java.lang.String r5 = r11.getResponseBody()
            r8 = 50
            r9 = 0
            r3 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.entry.response.Content.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}
