package th.p047co.dtac.android.dtacone.view.appOne.eSign.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.commonError.CommonErrorResponse;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJf\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001b¨\u00067"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "", "", "codeType", "code", "desc", "systemMessage", "", "replaceMessage", "responseDateTime", "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;)V", "userId", "Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "toCommonErrorResponse", "(Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/commonError/CommonErrorResponse;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;)Lth/co/dtac/android/dtacone/view/appOne/eSign/request/OneConsentNoticeDocResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCodeType", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getDesc", "d", "getSystemMessage", "e", "Ljava/util/List;", "getReplaceMessage", OperatorName.FILL_NON_ZERO, "getResponseDateTime", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/view/appOne/eSign/request/ConsentNoticeDocData;", "getData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.request.OneConsentNoticeDocResponse */
/* loaded from: classes10.dex */
public final class OneConsentNoticeDocResponse {
    public static final int $stable = 8;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: a */
    private final String f90793a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f90794b;
    @SerializedName("desc")
    @Nullable

    /* renamed from: c */
    private final String f90795c;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: d */
    private final String f90796d;
    @SerializedName("replaceMessage")
    @NotNull

    /* renamed from: e */
    private final List<String> f90797e;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: f */
    private final String f90798f;
    @SerializedName("data")
    @NotNull

    /* renamed from: g */
    private final ConsentNoticeDocData f90799g;

    public OneConsentNoticeDocResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<String> replaceMessage, @Nullable String str5, @NotNull ConsentNoticeDocData data) {
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f90793a = str;
        this.f90794b = str2;
        this.f90795c = str3;
        this.f90796d = str4;
        this.f90797e = replaceMessage;
        this.f90798f = str5;
        this.f90799g = data;
    }

    public static /* synthetic */ OneConsentNoticeDocResponse copy$default(OneConsentNoticeDocResponse oneConsentNoticeDocResponse, String str, String str2, String str3, String str4, List list, String str5, ConsentNoticeDocData consentNoticeDocData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneConsentNoticeDocResponse.f90793a;
        }
        if ((i & 2) != 0) {
            str2 = oneConsentNoticeDocResponse.f90794b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneConsentNoticeDocResponse.f90795c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneConsentNoticeDocResponse.f90796d;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = oneConsentNoticeDocResponse.f90797e;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = oneConsentNoticeDocResponse.f90798f;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            consentNoticeDocData = oneConsentNoticeDocResponse.f90799g;
        }
        return oneConsentNoticeDocResponse.copy(str, str6, str7, str8, list3, str9, consentNoticeDocData);
    }

    @Nullable
    public final String component1() {
        return this.f90793a;
    }

    @Nullable
    public final String component2() {
        return this.f90794b;
    }

    @Nullable
    public final String component3() {
        return this.f90795c;
    }

    @Nullable
    public final String component4() {
        return this.f90796d;
    }

    @NotNull
    public final List<String> component5() {
        return this.f90797e;
    }

    @Nullable
    public final String component6() {
        return this.f90798f;
    }

    @NotNull
    public final ConsentNoticeDocData component7() {
        return this.f90799g;
    }

    @NotNull
    public final OneConsentNoticeDocResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull List<String> replaceMessage, @Nullable String str5, @NotNull ConsentNoticeDocData data) {
        Intrinsics.checkNotNullParameter(replaceMessage, "replaceMessage");
        Intrinsics.checkNotNullParameter(data, "data");
        return new OneConsentNoticeDocResponse(str, str2, str3, str4, replaceMessage, str5, data);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneConsentNoticeDocResponse) {
            OneConsentNoticeDocResponse oneConsentNoticeDocResponse = (OneConsentNoticeDocResponse) obj;
            return Intrinsics.areEqual(this.f90793a, oneConsentNoticeDocResponse.f90793a) && Intrinsics.areEqual(this.f90794b, oneConsentNoticeDocResponse.f90794b) && Intrinsics.areEqual(this.f90795c, oneConsentNoticeDocResponse.f90795c) && Intrinsics.areEqual(this.f90796d, oneConsentNoticeDocResponse.f90796d) && Intrinsics.areEqual(this.f90797e, oneConsentNoticeDocResponse.f90797e) && Intrinsics.areEqual(this.f90798f, oneConsentNoticeDocResponse.f90798f) && Intrinsics.areEqual(this.f90799g, oneConsentNoticeDocResponse.f90799g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f90794b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f90793a;
    }

    @NotNull
    public final ConsentNoticeDocData getData() {
        return this.f90799g;
    }

    @Nullable
    public final String getDesc() {
        return this.f90795c;
    }

    @NotNull
    public final List<String> getReplaceMessage() {
        return this.f90797e;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f90798f;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f90796d;
    }

    public int hashCode() {
        String str = this.f90793a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f90794b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f90795c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90796d;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f90797e.hashCode()) * 31;
        String str5 = this.f90798f;
        return ((hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f90799g.hashCode();
    }

    @NotNull
    public final CommonErrorResponse toCommonErrorResponse(@NotNull String userId) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Intrinsics.checkNotNullParameter(userId, "userId");
        String str6 = this.f90796d;
        if (str6 == null) {
            str = "";
        } else {
            str = str6;
        }
        String str7 = this.f90794b;
        if (str7 == null) {
            str2 = "";
        } else {
            str2 = str7;
        }
        String str8 = this.f90793a;
        if (str8 == null) {
            str3 = "";
        } else {
            str3 = str8;
        }
        String str9 = this.f90798f;
        if (str9 == null) {
            str4 = "";
        } else {
            str4 = str9;
        }
        List<String> list = this.f90797e;
        String str10 = this.f90795c;
        if (str10 == null) {
            str5 = "";
        } else {
            str5 = str10;
        }
        return new CommonErrorResponse(str3, str2, str5, userId, str, list, str4, null, 128, null);
    }

    @NotNull
    public String toString() {
        String str = this.f90793a;
        String str2 = this.f90794b;
        String str3 = this.f90795c;
        String str4 = this.f90796d;
        List<String> list = this.f90797e;
        String str5 = this.f90798f;
        ConsentNoticeDocData consentNoticeDocData = this.f90799g;
        return "OneConsentNoticeDocResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + consentNoticeDocData + ")";
    }

    public /* synthetic */ OneConsentNoticeDocResponse(String str, String str2, String str3, String str4, List list, String str5, ConsentNoticeDocData consentNoticeDocData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 32) != 0 ? null : str5, consentNoticeDocData);
    }
}