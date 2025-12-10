package th.p047co.dtac.android.dtacone.model.appOne.pre2post.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.customerenquiry.RecommendPackageResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006%"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/pre2post/response/OnePre2PostRecommendPackResponse;", "", "systemMessage", "", "code", "responseDateTime", "codeType", "replaceMessage", "", "desc", "data", "Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/customerenquiry/RecommendPackageResponse;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.pre2post.response.OnePre2PostRecommendPackResponse */
/* loaded from: classes8.dex */
public final class OnePre2PostRecommendPackResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final RecommendPackageResponse data;
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

    public OnePre2PostRecommendPackResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePre2PostRecommendPackResponse copy$default(OnePre2PostRecommendPackResponse onePre2PostRecommendPackResponse, String str, String str2, String str3, String str4, List list, String str5, RecommendPackageResponse recommendPackageResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePre2PostRecommendPackResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = onePre2PostRecommendPackResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePre2PostRecommendPackResponse.responseDateTime;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePre2PostRecommendPackResponse.codeType;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = onePre2PostRecommendPackResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = onePre2PostRecommendPackResponse.desc;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            recommendPackageResponse = onePre2PostRecommendPackResponse.data;
        }
        return onePre2PostRecommendPackResponse.copy(str, str6, str7, str8, list3, str9, recommendPackageResponse);
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
        return this.responseDateTime;
    }

    @Nullable
    public final String component4() {
        return this.codeType;
    }

    @Nullable
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component6() {
        return this.desc;
    }

    @Nullable
    public final RecommendPackageResponse component7() {
        return this.data;
    }

    @NotNull
    public final OnePre2PostRecommendPackResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable RecommendPackageResponse recommendPackageResponse) {
        return new OnePre2PostRecommendPackResponse(str, str2, str3, str4, list, str5, recommendPackageResponse);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePre2PostRecommendPackResponse) {
            OnePre2PostRecommendPackResponse onePre2PostRecommendPackResponse = (OnePre2PostRecommendPackResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, onePre2PostRecommendPackResponse.systemMessage) && Intrinsics.areEqual(this.code, onePre2PostRecommendPackResponse.code) && Intrinsics.areEqual(this.responseDateTime, onePre2PostRecommendPackResponse.responseDateTime) && Intrinsics.areEqual(this.codeType, onePre2PostRecommendPackResponse.codeType) && Intrinsics.areEqual(this.replaceMessage, onePre2PostRecommendPackResponse.replaceMessage) && Intrinsics.areEqual(this.desc, onePre2PostRecommendPackResponse.desc) && Intrinsics.areEqual(this.data, onePre2PostRecommendPackResponse.data);
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
    public final RecommendPackageResponse getData() {
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
        String str3 = this.responseDateTime;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.codeType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        RecommendPackageResponse recommendPackageResponse = this.data;
        return hashCode6 + (recommendPackageResponse != null ? recommendPackageResponse.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.responseDateTime;
        String str4 = this.codeType;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        RecommendPackageResponse recommendPackageResponse = this.data;
        return "OnePre2PostRecommendPackResponse(systemMessage=" + str + ", code=" + str2 + ", responseDateTime=" + str3 + ", codeType=" + str4 + ", replaceMessage=" + list + ", desc=" + str5 + ", data=" + recommendPackageResponse + ")";
    }

    public OnePre2PostRecommendPackResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable RecommendPackageResponse recommendPackageResponse) {
        this.systemMessage = str;
        this.code = str2;
        this.responseDateTime = str3;
        this.codeType = str4;
        this.replaceMessage = list;
        this.desc = str5;
        this.data = recommendPackageResponse;
    }

    public /* synthetic */ OnePre2PostRecommendPackResponse(String str, String str2, String str3, String str4, List list, String str5, RecommendPackageResponse recommendPackageResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : recommendPackageResponse);
    }
}