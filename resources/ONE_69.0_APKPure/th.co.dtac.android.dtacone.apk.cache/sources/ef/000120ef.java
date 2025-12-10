package th.p047co.dtac.android.dtacone.model.upPass.kyc2ndLine;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusResponse;", "", "codeType", "", "code", "desc", "userId", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/upPass/kyc2ndLine/Kyc2QueryStatusData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.kyc2ndLine.Kyc2QueryStatusResponse */
/* loaded from: classes8.dex */
public final class Kyc2QueryStatusResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @NotNull
    private final String code;
    @SerializedName("codeType")
    @NotNull
    private final String codeType;
    @SerializedName("data")
    @NotNull
    private final Kyc2QueryStatusData data;
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

    public Kyc2QueryStatusResponse() {
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
    public final Kyc2QueryStatusData component8() {
        return this.data;
    }

    @NotNull
    public final Kyc2QueryStatusResponse copy(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull Kyc2QueryStatusData data) {
        Intrinsics.checkNotNullParameter(codeType, "codeType");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        Intrinsics.checkNotNullParameter(data, "data");
        return new Kyc2QueryStatusResponse(codeType, code, desc, userId, systemMessage, replaceMessage, responseDateTime, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Kyc2QueryStatusResponse) {
            Kyc2QueryStatusResponse kyc2QueryStatusResponse = (Kyc2QueryStatusResponse) obj;
            return Intrinsics.areEqual(this.codeType, kyc2QueryStatusResponse.codeType) && Intrinsics.areEqual(this.code, kyc2QueryStatusResponse.code) && Intrinsics.areEqual(this.desc, kyc2QueryStatusResponse.desc) && Intrinsics.areEqual(this.userId, kyc2QueryStatusResponse.userId) && Intrinsics.areEqual(this.systemMessage, kyc2QueryStatusResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, kyc2QueryStatusResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, kyc2QueryStatusResponse.responseDateTime) && Intrinsics.areEqual(this.data, kyc2QueryStatusResponse.data);
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
    public final Kyc2QueryStatusData getData() {
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
        Kyc2QueryStatusData kyc2QueryStatusData = this.data;
        return "Kyc2QueryStatusResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", userId=" + str4 + ", systemMessage=" + str5 + ", replaceMessage=" + list + ", responseDateTime=" + str6 + ", data=" + kyc2QueryStatusData + ")";
    }

    public Kyc2QueryStatusResponse(@NotNull String codeType, @NotNull String code, @NotNull String desc, @NotNull String userId, @NotNull String systemMessage, @NotNull List<String> replaceMessage, @NotNull String responseDateTime, @NotNull Kyc2QueryStatusData data) {
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

    public /* synthetic */ Kyc2QueryStatusResponse(String str, String str2, String str3, String str4, String str5, List list, String str6, Kyc2QueryStatusData kyc2QueryStatusData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 64) == 0 ? str6 : "", (i & 128) != 0 ? new Kyc2QueryStatusData(null, null, null, null, null, 31, null) : kyc2QueryStatusData);
    }
}