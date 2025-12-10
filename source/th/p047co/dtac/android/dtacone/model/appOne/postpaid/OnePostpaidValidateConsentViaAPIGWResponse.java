package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidValidateConsentViaAPIGWResponse;", "", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/PostpaidValidateConsentViaAPIGWData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidValidateConsentViaAPIGWResponse */
/* loaded from: classes8.dex */
public final class OnePostpaidValidateConsentViaAPIGWResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final PostpaidValidateConsentViaAPIGWData data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;

    public OnePostpaidValidateConsentViaAPIGWResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePostpaidValidateConsentViaAPIGWResponse copy$default(OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse, String str, String str2, String str3, String str4, PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePostpaidValidateConsentViaAPIGWResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = onePostpaidValidateConsentViaAPIGWResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePostpaidValidateConsentViaAPIGWResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePostpaidValidateConsentViaAPIGWResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            postpaidValidateConsentViaAPIGWData = onePostpaidValidateConsentViaAPIGWResponse.data;
        }
        PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData2 = postpaidValidateConsentViaAPIGWData;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePostpaidValidateConsentViaAPIGWResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePostpaidValidateConsentViaAPIGWResponse.desc;
        }
        return onePostpaidValidateConsentViaAPIGWResponse.copy(str, str6, str7, str8, postpaidValidateConsentViaAPIGWData2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.systemMessage;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.codeType;
    }

    @Nullable
    public final String component4() {
        return this.responseDateTime;
    }

    @Nullable
    public final PostpaidValidateConsentViaAPIGWData component5() {
        return this.data;
    }

    @Nullable
    public final List<String> component6() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component7() {
        return this.desc;
    }

    @NotNull
    public final OnePostpaidValidateConsentViaAPIGWResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, @Nullable List<String> list, @Nullable String str5) {
        return new OnePostpaidValidateConsentViaAPIGWResponse(str, str2, str3, str4, postpaidValidateConsentViaAPIGWData, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidValidateConsentViaAPIGWResponse) {
            OnePostpaidValidateConsentViaAPIGWResponse onePostpaidValidateConsentViaAPIGWResponse = (OnePostpaidValidateConsentViaAPIGWResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, onePostpaidValidateConsentViaAPIGWResponse.systemMessage) && Intrinsics.areEqual(this.code, onePostpaidValidateConsentViaAPIGWResponse.code) && Intrinsics.areEqual(this.codeType, onePostpaidValidateConsentViaAPIGWResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, onePostpaidValidateConsentViaAPIGWResponse.responseDateTime) && Intrinsics.areEqual(this.data, onePostpaidValidateConsentViaAPIGWResponse.data) && Intrinsics.areEqual(this.replaceMessage, onePostpaidValidateConsentViaAPIGWResponse.replaceMessage) && Intrinsics.areEqual(this.desc, onePostpaidValidateConsentViaAPIGWResponse.desc);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final PostpaidValidateConsentViaAPIGWData getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.systemMessage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.codeType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.responseDateTime;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData = this.data;
        int hashCode5 = (hashCode4 + (postpaidValidateConsentViaAPIGWData == null ? 0 : postpaidValidateConsentViaAPIGWData.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "OnePostpaidValidateConsentViaAPIGWResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + postpaidValidateConsentViaAPIGWData + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePostpaidValidateConsentViaAPIGWResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = postpaidValidateConsentViaAPIGWData;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ OnePostpaidValidateConsentViaAPIGWResponse(String str, String str2, String str3, String str4, PostpaidValidateConsentViaAPIGWData postpaidValidateConsentViaAPIGWData, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : postpaidValidateConsentViaAPIGWData, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
