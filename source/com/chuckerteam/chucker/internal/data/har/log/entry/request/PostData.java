package com.chuckerteam.chucker.internal.data.har.log.entry.request;

import com.chuckerteam.chucker.internal.data.har.log.entry.request.postdata.Params;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010\u000e¨\u0006'"}, m28850d2 = {"Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;", "", "", "mimeType", "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;", "params", TextBundle.TEXT_ENTRY, ClientCookie.COMMENT_ATTR, "<init>", "(Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;", "transaction", "(Lcom/chuckerteam/chucker/internal/data/entity/HttpTransaction;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;Ljava/lang/String;Ljava/lang/String;)Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/PostData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMimeType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lcom/chuckerteam/chucker/internal/data/har/log/entry/request/postdata/Params;", "getParams", OperatorName.CURVE_TO, "getText", "d", "getComment", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PostData {
    @SerializedName("mimeType")
    @NotNull

    /* renamed from: a */
    private final String f42874a;
    @SerializedName("params")
    @Nullable

    /* renamed from: b */
    private final Params f42875b;
    @SerializedName(TextBundle.TEXT_ENTRY)
    @Nullable

    /* renamed from: c */
    private final String f42876c;
    @SerializedName(ClientCookie.COMMENT_ATTR)
    @Nullable

    /* renamed from: d */
    private final String f42877d;

    public PostData(@NotNull String mimeType, @Nullable Params params, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        this.f42874a = mimeType;
        this.f42875b = params;
        this.f42876c = str;
        this.f42877d = str2;
    }

    public static /* synthetic */ PostData copy$default(PostData postData, String str, Params params, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = postData.f42874a;
        }
        if ((i & 2) != 0) {
            params = postData.f42875b;
        }
        if ((i & 4) != 0) {
            str2 = postData.f42876c;
        }
        if ((i & 8) != 0) {
            str3 = postData.f42877d;
        }
        return postData.copy(str, params, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.f42874a;
    }

    @Nullable
    public final Params component2() {
        return this.f42875b;
    }

    @Nullable
    public final String component3() {
        return this.f42876c;
    }

    @Nullable
    public final String component4() {
        return this.f42877d;
    }

    @NotNull
    public final PostData copy(@NotNull String mimeType, @Nullable Params params, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        return new PostData(mimeType, params, str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PostData) {
            PostData postData = (PostData) obj;
            return Intrinsics.areEqual(this.f42874a, postData.f42874a) && Intrinsics.areEqual(this.f42875b, postData.f42875b) && Intrinsics.areEqual(this.f42876c, postData.f42876c) && Intrinsics.areEqual(this.f42877d, postData.f42877d);
        }
        return false;
    }

    @Nullable
    public final String getComment() {
        return this.f42877d;
    }

    @NotNull
    public final String getMimeType() {
        return this.f42874a;
    }

    @Nullable
    public final Params getParams() {
        return this.f42875b;
    }

    @Nullable
    public final String getText() {
        return this.f42876c;
    }

    public int hashCode() {
        int hashCode = this.f42874a.hashCode() * 31;
        Params params = this.f42875b;
        int hashCode2 = (hashCode + (params == null ? 0 : params.hashCode())) * 31;
        String str = this.f42876c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f42877d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f42874a;
        Params params = this.f42875b;
        String str2 = this.f42876c;
        String str3 = this.f42877d;
        return "PostData(mimeType=" + str + ", params=" + params + ", text=" + str2 + ", comment=" + str3 + ")";
    }

    public /* synthetic */ PostData(String str, Params params, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : params, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PostData(@org.jetbrains.annotations.NotNull com.chuckerteam.chucker.internal.data.entity.HttpTransaction r9) {
        /*
            r8 = this;
            java.lang.String r0 = "transaction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = r9.getRequestContentType()
            if (r0 != 0) goto Ld
            java.lang.String r0 = "application/octet-stream"
        Ld:
            r2 = r0
            java.lang.String r4 = r9.getRequestBody()
            r6 = 10
            r7 = 0
            r3 = 0
            r5 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.har.log.entry.request.PostData.<init>(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):void");
    }
}
