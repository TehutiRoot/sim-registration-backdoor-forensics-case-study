package th.p047co.dtac.android.dtacone.model.commonError;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "", "codeType", "", "code", "desc", "userId", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/commonError/CommonErrorData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/commonError/CommonErrorData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.commonError.CommonErrorResponse */
/* loaded from: classes8.dex */
public final class CommonErrorResponse {
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("codeType")
    @NotNull
    private final String codeType;
    @SerializedName("data")
    @NotNull
    private final CommonErrorData data;
    @SerializedName("desc")
    @NotNull
    private final String desc;
    @SerializedName("replaceMessage")
    @NotNull
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @NotNull
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @NotNull
    private final String systemMessage;
    @SerializedName("userId")
    @NotNull
    private final String userId;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006JF\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006¨\u0006\u000e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse$Companion;", "", "()V", "businessError", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "desc", "", "code", "userId", "systemMessage", "replaceMessage", "", "responseDateTime", "technicalError", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.commonError.CommonErrorResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CommonErrorResponse businessError$default(Companion companion, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
            String str6;
            String str7;
            if ((i & 2) != 0) {
                str2 = "200";
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str6 = "";
            } else {
                str6 = str3;
            }
            if ((i & 8) != 0) {
                str7 = "";
            } else {
                str7 = str4;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list3 = list2;
            if ((i & 32) != 0) {
                Date date = new Date();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str5 = DateFormatExtKt.toDateString(date, "yyyy-MM-dd HH:mm:ss.SSS", US);
            }
            return companion.businessError(str, str8, str6, str7, list3, str5);
        }

        public static /* synthetic */ CommonErrorResponse technicalError$default(Companion companion, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
            String str6;
            String str7;
            if ((i & 2) != 0) {
                str2 = Constant.SERVER_ERROR_CODE;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str6 = "";
            } else {
                str6 = str3;
            }
            if ((i & 8) != 0) {
                str7 = "";
            } else {
                str7 = str4;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            List list3 = list2;
            if ((i & 32) != 0) {
                Date date = new Date();
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str5 = DateFormatExtKt.toDateString(date, "yyyy-MM-dd HH:mm:ss.SSS", US);
            }
            return companion.technicalError(str, str8, str6, str7, list3, str5);
        }

        @NotNull
        public final CommonErrorResponse businessError(@NotNull String desc, @NotNull String code, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
            Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
            Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
            return new CommonErrorResponse("B", code, desc, userId, systemMessage, replaceMessage, responseDateTime, null, 128, null);
        }

        @NotNull
        public final CommonErrorResponse technicalError(@NotNull String desc, @NotNull String code, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime) {
            Intrinsics.checkNotNullParameter(desc, "desc");
            Intrinsics.checkNotNullParameter(code, "code");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
            Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
            Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
            return new CommonErrorResponse("T", code, desc, userId, systemMessage, replaceMessage, responseDateTime, null, 128, null);
        }

        private Companion() {
        }
    }

    public CommonErrorResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final String component1() {
        return this.codeType;
    }

    @NotNull
    public final String component2() {
        return this.code;
    }

    @NotNull
    public final String component3() {
        return this.desc;
    }

    @NotNull
    public final String component4() {
        return this.userId;
    }

    @NotNull
    public final String component5() {
        return this.systemMessage;
    }

    @NotNull
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @NotNull
    public final String component7() {
        return this.responseDateTime;
    }

    @NotNull
    public final CommonErrorData component8() {
        return this.data;
    }

    @NotNull
    public final CommonErrorResponse copy(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull CommonErrorData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        return new CommonErrorResponse(codeType, code, desc, userId, systemMessage, replaceMessage, responseDateTime, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonErrorResponse) {
            CommonErrorResponse commonErrorResponse = (CommonErrorResponse) obj;
            return Intrinsics.areEqual(this.codeType, commonErrorResponse.codeType) && Intrinsics.areEqual(this.code, commonErrorResponse.code) && Intrinsics.areEqual(this.desc, commonErrorResponse.desc) && Intrinsics.areEqual(this.userId, commonErrorResponse.userId) && Intrinsics.areEqual(this.systemMessage, commonErrorResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, commonErrorResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, commonErrorResponse.responseDateTime) && Intrinsics.areEqual(this.data, commonErrorResponse.data);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCodeType() {
        return this.codeType;
    }

    @NotNull
    public final CommonErrorData getData() {
        return this.data;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }

    @NotNull
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @NotNull
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @NotNull
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((this.codeType.hashCode() * 31) + this.code.hashCode()) * 31) + this.desc.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.systemMessage.hashCode()) * 31) + this.replaceMessage.hashCode()) * 31) + this.responseDateTime.hashCode()) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.codeType;
        String str2 = this.code;
        String str3 = this.desc;
        String str4 = this.userId;
        String str5 = this.systemMessage;
        List<String> list = this.replaceMessage;
        String str6 = this.responseDateTime;
        CommonErrorData commonErrorData = this.data;
        return "CommonErrorResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", userId=" + str4 + ", systemMessage=" + str5 + ", replaceMessage=" + list + ", responseDateTime=" + str6 + ", data=" + commonErrorData + ")";
    }

    public CommonErrorResponse(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull CommonErrorData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        this.codeType = codeType;
        this.code = code;
        this.desc = desc;
        this.userId = userId;
        this.systemMessage = systemMessage;
        this.replaceMessage = replaceMessage;
        this.responseDateTime = responseDateTime;
        this.data = data;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ CommonErrorResponse(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.util.List r16, java.lang.String r17, th.p047co.dtac.android.dtacone.model.commonError.CommonErrorData r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r11
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r12
        L12:
            r4 = r0 & 4
            if (r4 == 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r13
        L19:
            r5 = r0 & 8
            if (r5 == 0) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r14
        L20:
            r6 = r0 & 16
            if (r6 == 0) goto L25
            goto L26
        L25:
            r2 = r15
        L26:
            r6 = r0 & 32
            if (r6 == 0) goto L2f
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto L31
        L2f:
            r6 = r16
        L31:
            r7 = r0 & 64
            if (r7 == 0) goto L48
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.String r9 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.lang.String r7 = th.p047co.dtac.android.dtacone.extension.format.DateFormatExtKt.toDateString(r7, r9, r8)
            goto L4a
        L48:
            r7 = r17
        L4a:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L56
            th.co.dtac.android.dtacone.model.commonError.CommonErrorData r0 = new th.co.dtac.android.dtacone.model.commonError.CommonErrorData
            java.lang.String r8 = "failed"
            r0.<init>(r8)
            goto L58
        L56:
            r0 = r18
        L58:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r2
            r17 = r6
            r18 = r7
            r19 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, th.co.dtac.android.dtacone.model.commonError.CommonErrorData, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
