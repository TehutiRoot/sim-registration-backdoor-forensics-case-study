package th.p047co.dtac.android.dtacone.model.appOne.consent_tmn;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.consent.ConsentNonTelcoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.tol.model.CommonErrorResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/consent_tmn/OneConsentDataTmnResponse;", "", "systemMessage", "", "code", "codeType", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "replaceMessage", "", "desc", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;Ljava/util/List;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/consent/ConsentNonTelcoResponse;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toCommonErrorResponse", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/CommonErrorResponse;", "userId", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.consent_tmn.OneConsentDataTmnResponse */
/* loaded from: classes8.dex */
public final class OneConsentDataTmnResponse {
    public static final int $stable = 8;
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final ConsentNonTelcoResponse data;
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

    public OneConsentDataTmnResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneConsentDataTmnResponse copy$default(OneConsentDataTmnResponse oneConsentDataTmnResponse, String str, String str2, String str3, String str4, ConsentNonTelcoResponse consentNonTelcoResponse, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneConsentDataTmnResponse.systemMessage;
        }
        if ((i & 2) != 0) {
            str2 = oneConsentDataTmnResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneConsentDataTmnResponse.codeType;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneConsentDataTmnResponse.responseDateTime;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            consentNonTelcoResponse = oneConsentDataTmnResponse.data;
        }
        ConsentNonTelcoResponse consentNonTelcoResponse2 = consentNonTelcoResponse;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneConsentDataTmnResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneConsentDataTmnResponse.desc;
        }
        return oneConsentDataTmnResponse.copy(str, str6, str7, str8, consentNonTelcoResponse2, list3, str5);
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
    public final ConsentNonTelcoResponse component5() {
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
    public final OneConsentDataTmnResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, @Nullable List<String> list, @Nullable String str5) {
        return new OneConsentDataTmnResponse(str, str2, str3, str4, consentNonTelcoResponse, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneConsentDataTmnResponse) {
            OneConsentDataTmnResponse oneConsentDataTmnResponse = (OneConsentDataTmnResponse) obj;
            return Intrinsics.areEqual(this.systemMessage, oneConsentDataTmnResponse.systemMessage) && Intrinsics.areEqual(this.code, oneConsentDataTmnResponse.code) && Intrinsics.areEqual(this.codeType, oneConsentDataTmnResponse.codeType) && Intrinsics.areEqual(this.responseDateTime, oneConsentDataTmnResponse.responseDateTime) && Intrinsics.areEqual(this.data, oneConsentDataTmnResponse.data) && Intrinsics.areEqual(this.replaceMessage, oneConsentDataTmnResponse.replaceMessage) && Intrinsics.areEqual(this.desc, oneConsentDataTmnResponse.desc);
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
    public final ConsentNonTelcoResponse getData() {
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
        ConsentNonTelcoResponse consentNonTelcoResponse = this.data;
        int hashCode5 = (hashCode4 + (consentNonTelcoResponse == null ? 0 : consentNonTelcoResponse.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.desc;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public final CommonErrorResponse toCommonErrorResponse(@NotNull String userId) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(userId, "userId");
        String str6 = this.systemMessage;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = this.code;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = this.codeType;
        if (str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        String str9 = this.responseDateTime;
        if (str9 == null) {
            str4 = "";
        } else {
            str4 = str9;
        }
        List<String> list = this.replaceMessage;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        List<String> list2 = list;
        String str10 = this.desc;
        if (str10 == null) {
            str5 = "";
        } else {
            str5 = str10;
        }
        return new CommonErrorResponse(str3, str2, str5, userId, str, list2, str4, null, 128, null);
    }

    @NotNull
    public String toString() {
        String str = this.systemMessage;
        String str2 = this.code;
        String str3 = this.codeType;
        String str4 = this.responseDateTime;
        ConsentNonTelcoResponse consentNonTelcoResponse = this.data;
        List<String> list = this.replaceMessage;
        String str5 = this.desc;
        return "OneConsentDataTmnResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + consentNonTelcoResponse + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneConsentDataTmnResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ConsentNonTelcoResponse consentNonTelcoResponse, @Nullable List<String> list, @Nullable String str5) {
        this.systemMessage = str;
        this.code = str2;
        this.codeType = str3;
        this.responseDateTime = str4;
        this.data = consentNonTelcoResponse;
        this.replaceMessage = list;
        this.desc = str5;
    }

    public /* synthetic */ OneConsentDataTmnResponse(String str, String str2, String str3, String str4, ConsentNonTelcoResponse consentNonTelcoResponse, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : consentNonTelcoResponse, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}