package th.p047co.dtac.android.dtacone.app_one.model.commission;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Bc\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJl\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\b\u0002\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R$\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneCommissionTResponse */
/* loaded from: classes7.dex */
public final class OneCommissionTResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81678a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81679b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81680c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81681d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81682e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81683f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81684g;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;", "", "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "commission", "<init>", "(Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;)V", "component1", "()Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "copy", "(Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;)Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionTResponse$Data;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/app_one/model/commission/OneCommissionSumaryTCollection;", "getCommission", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.commission.OneCommissionTResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 8;
        @SerializedName("commission")
        @Nullable

        /* renamed from: a */
        private final OneCommissionSumaryTCollection f81685a;

        public Data(@Nullable OneCommissionSumaryTCollection oneCommissionSumaryTCollection) {
            this.f81685a = oneCommissionSumaryTCollection;
        }

        public static /* synthetic */ Data copy$default(Data data, OneCommissionSumaryTCollection oneCommissionSumaryTCollection, int i, Object obj) {
            if ((i & 1) != 0) {
                oneCommissionSumaryTCollection = data.f81685a;
            }
            return data.copy(oneCommissionSumaryTCollection);
        }

        @Nullable
        public final OneCommissionSumaryTCollection component1() {
            return this.f81685a;
        }

        @NotNull
        public final Data copy(@Nullable OneCommissionSumaryTCollection oneCommissionSumaryTCollection) {
            return new Data(oneCommissionSumaryTCollection);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.areEqual(this.f81685a, ((Data) obj).f81685a);
        }

        @Nullable
        public final OneCommissionSumaryTCollection getCommission() {
            return this.f81685a;
        }

        public int hashCode() {
            OneCommissionSumaryTCollection oneCommissionSumaryTCollection = this.f81685a;
            if (oneCommissionSumaryTCollection == null) {
                return 0;
            }
            return oneCommissionSumaryTCollection.hashCode();
        }

        @NotNull
        public String toString() {
            OneCommissionSumaryTCollection oneCommissionSumaryTCollection = this.f81685a;
            return "Data(commission=" + oneCommissionSumaryTCollection + ")";
        }
    }

    public OneCommissionTResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OneCommissionTResponse copy$default(OneCommissionTResponse oneCommissionTResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oneCommissionTResponse.f81678a;
        }
        if ((i & 2) != 0) {
            str2 = oneCommissionTResponse.f81679b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oneCommissionTResponse.f81680c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = oneCommissionTResponse.f81681d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = oneCommissionTResponse.f81682e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = oneCommissionTResponse.f81683f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = oneCommissionTResponse.f81684g;
        }
        return oneCommissionTResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81678a;
    }

    @Nullable
    public final String component2() {
        return this.f81679b;
    }

    @Nullable
    public final String component3() {
        return this.f81680c;
    }

    @Nullable
    public final String component4() {
        return this.f81681d;
    }

    @Nullable
    public final Data component5() {
        return this.f81682e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81683f;
    }

    @Nullable
    public final String component7() {
        return this.f81684g;
    }

    @NotNull
    public final OneCommissionTResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OneCommissionTResponse(str, str2, str3, str4, data, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OneCommissionTResponse) {
            OneCommissionTResponse oneCommissionTResponse = (OneCommissionTResponse) obj;
            return Intrinsics.areEqual(this.f81678a, oneCommissionTResponse.f81678a) && Intrinsics.areEqual(this.f81679b, oneCommissionTResponse.f81679b) && Intrinsics.areEqual(this.f81680c, oneCommissionTResponse.f81680c) && Intrinsics.areEqual(this.f81681d, oneCommissionTResponse.f81681d) && Intrinsics.areEqual(this.f81682e, oneCommissionTResponse.f81682e) && Intrinsics.areEqual(this.f81683f, oneCommissionTResponse.f81683f) && Intrinsics.areEqual(this.f81684g, oneCommissionTResponse.f81684g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81679b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81680c;
    }

    @Nullable
    public final Data getData() {
        return this.f81682e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81684g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81683f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81681d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81678a;
    }

    public int hashCode() {
        String str = this.f81678a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81679b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81680c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81681d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81682e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81683f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81684g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81678a;
        String str2 = this.f81679b;
        String str3 = this.f81680c;
        String str4 = this.f81681d;
        Data data = this.f81682e;
        List<String> list = this.f81683f;
        String str5 = this.f81684g;
        return "OneCommissionTResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OneCommissionTResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81678a = str;
        this.f81679b = str2;
        this.f81680c = str3;
        this.f81681d = str4;
        this.f81682e = data;
        this.f81683f = list;
        this.f81684g = str5;
    }

    public /* synthetic */ OneCommissionTResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
