package th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration;

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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAssignPoolingResponse */
/* loaded from: classes7.dex */
public final class OnePrepaidAssignPoolingResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81947a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81948b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81949c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81950d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81951e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81952f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81953g;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;", "", "", "simcardNumber", "lastChangeDateTime", "actualTelephone", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidAssignPoolingResponse$Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSimcardNumber", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getLastChangeDateTime", OperatorName.CURVE_TO, "getActualTelephone", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAssignPoolingResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 0;
        @SerializedName("simcardNumber")
        @Nullable

        /* renamed from: a */
        private final String f81954a;
        @SerializedName("lastChangeDateTime")
        @Nullable

        /* renamed from: b */
        private final String f81955b;
        @SerializedName("actualTelephone")
        @Nullable

        /* renamed from: c */
        private final String f81956c;

        public Data() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.f81954a;
            }
            if ((i & 2) != 0) {
                str2 = data.f81955b;
            }
            if ((i & 4) != 0) {
                str3 = data.f81956c;
            }
            return data.copy(str, str2, str3);
        }

        @Nullable
        public final String component1() {
            return this.f81954a;
        }

        @Nullable
        public final String component2() {
            return this.f81955b;
        }

        @Nullable
        public final String component3() {
            return this.f81956c;
        }

        @NotNull
        public final Data copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            return new Data(str, str2, str3);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.f81954a, data.f81954a) && Intrinsics.areEqual(this.f81955b, data.f81955b) && Intrinsics.areEqual(this.f81956c, data.f81956c);
            }
            return false;
        }

        @Nullable
        public final String getActualTelephone() {
            return this.f81956c;
        }

        @Nullable
        public final String getLastChangeDateTime() {
            return this.f81955b;
        }

        @Nullable
        public final String getSimcardNumber() {
            return this.f81954a;
        }

        public int hashCode() {
            String str = this.f81954a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81955b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81956c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f81954a;
            String str2 = this.f81955b;
            String str3 = this.f81956c;
            return "Data(simcardNumber=" + str + ", lastChangeDateTime=" + str2 + ", actualTelephone=" + str3 + ")";
        }

        public Data(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f81954a = str;
            this.f81955b = str2;
            this.f81956c = str3;
        }

        public /* synthetic */ Data(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    public OnePrepaidAssignPoolingResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePrepaidAssignPoolingResponse copy$default(OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidAssignPoolingResponse.f81947a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidAssignPoolingResponse.f81948b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePrepaidAssignPoolingResponse.f81949c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePrepaidAssignPoolingResponse.f81950d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = onePrepaidAssignPoolingResponse.f81951e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePrepaidAssignPoolingResponse.f81952f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePrepaidAssignPoolingResponse.f81953g;
        }
        return onePrepaidAssignPoolingResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81947a;
    }

    @Nullable
    public final String component2() {
        return this.f81948b;
    }

    @Nullable
    public final String component3() {
        return this.f81949c;
    }

    @Nullable
    public final String component4() {
        return this.f81950d;
    }

    @Nullable
    public final Data component5() {
        return this.f81951e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81952f;
    }

    @Nullable
    public final String component7() {
        return this.f81953g;
    }

    @NotNull
    public final OnePrepaidAssignPoolingResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OnePrepaidAssignPoolingResponse(str, str2, str3, str4, data, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidAssignPoolingResponse) {
            OnePrepaidAssignPoolingResponse onePrepaidAssignPoolingResponse = (OnePrepaidAssignPoolingResponse) obj;
            return Intrinsics.areEqual(this.f81947a, onePrepaidAssignPoolingResponse.f81947a) && Intrinsics.areEqual(this.f81948b, onePrepaidAssignPoolingResponse.f81948b) && Intrinsics.areEqual(this.f81949c, onePrepaidAssignPoolingResponse.f81949c) && Intrinsics.areEqual(this.f81950d, onePrepaidAssignPoolingResponse.f81950d) && Intrinsics.areEqual(this.f81951e, onePrepaidAssignPoolingResponse.f81951e) && Intrinsics.areEqual(this.f81952f, onePrepaidAssignPoolingResponse.f81952f) && Intrinsics.areEqual(this.f81953g, onePrepaidAssignPoolingResponse.f81953g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81948b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81949c;
    }

    @Nullable
    public final Data getData() {
        return this.f81951e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81953g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81952f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81950d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81947a;
    }

    public int hashCode() {
        String str = this.f81947a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81948b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81949c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81950d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81951e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81952f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81953g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81947a;
        String str2 = this.f81948b;
        String str3 = this.f81949c;
        String str4 = this.f81950d;
        Data data = this.f81951e;
        List<String> list = this.f81952f;
        String str5 = this.f81953g;
        return "OnePrepaidAssignPoolingResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePrepaidAssignPoolingResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81947a = str;
        this.f81948b = str2;
        this.f81949c = str3;
        this.f81950d = str4;
        this.f81951e = data;
        this.f81952f = list;
        this.f81953g = str5;
    }

    public /* synthetic */ OnePrepaidAssignPoolingResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}