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
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", Constant.BenefitName.Data, "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateIdCardResponse */
/* loaded from: classes7.dex */
public final class OnePrepaidValidateIdCardResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81920a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81921b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81922c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81923d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final Data f81924e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81925f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81926g;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;", "", "", "result", "", "showConsentXSIM", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateIdCardResponse$Data;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getResult", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/Boolean;", "getShowConsentXSIM", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateIdCardResponse$Data */
    /* loaded from: classes7.dex */
    public static final class Data {
        public static final int $stable = 0;
        @SerializedName("result")
        @Nullable

        /* renamed from: a */
        private final String f81927a;
        @SerializedName("showConsentXSIM")
        @Nullable

        /* renamed from: b */
        private final Boolean f81928b;

        public Data() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ Data copy$default(Data data, String str, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = data.f81927a;
            }
            if ((i & 2) != 0) {
                bool = data.f81928b;
            }
            return data.copy(str, bool);
        }

        @Nullable
        public final String component1() {
            return this.f81927a;
        }

        @Nullable
        public final Boolean component2() {
            return this.f81928b;
        }

        @NotNull
        public final Data copy(@Nullable String str, @Nullable Boolean bool) {
            return new Data(str, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Data) {
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.f81927a, data.f81927a) && Intrinsics.areEqual(this.f81928b, data.f81928b);
            }
            return false;
        }

        @Nullable
        public final String getResult() {
            return this.f81927a;
        }

        @Nullable
        public final Boolean getShowConsentXSIM() {
            return this.f81928b;
        }

        public int hashCode() {
            String str = this.f81927a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f81928b;
            return hashCode + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.f81927a;
            Boolean bool = this.f81928b;
            return "Data(result=" + str + ", showConsentXSIM=" + bool + ")";
        }

        public Data(@Nullable String str, @Nullable Boolean bool) {
            this.f81927a = str;
            this.f81928b = bool;
        }

        public /* synthetic */ Data(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool);
        }
    }

    public OnePrepaidValidateIdCardResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePrepaidValidateIdCardResponse copy$default(OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse, String str, String str2, String str3, String str4, Data data, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidValidateIdCardResponse.f81920a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidValidateIdCardResponse.f81921b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePrepaidValidateIdCardResponse.f81922c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePrepaidValidateIdCardResponse.f81923d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            data = onePrepaidValidateIdCardResponse.f81924e;
        }
        Data data2 = data;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePrepaidValidateIdCardResponse.f81925f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePrepaidValidateIdCardResponse.f81926g;
        }
        return onePrepaidValidateIdCardResponse.copy(str, str6, str7, str8, data2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81920a;
    }

    @Nullable
    public final String component2() {
        return this.f81921b;
    }

    @Nullable
    public final String component3() {
        return this.f81922c;
    }

    @Nullable
    public final String component4() {
        return this.f81923d;
    }

    @Nullable
    public final Data component5() {
        return this.f81924e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81925f;
    }

    @Nullable
    public final String component7() {
        return this.f81926g;
    }

    @NotNull
    public final OnePrepaidValidateIdCardResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        return new OnePrepaidValidateIdCardResponse(str, str2, str3, str4, data, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidValidateIdCardResponse) {
            OnePrepaidValidateIdCardResponse onePrepaidValidateIdCardResponse = (OnePrepaidValidateIdCardResponse) obj;
            return Intrinsics.areEqual(this.f81920a, onePrepaidValidateIdCardResponse.f81920a) && Intrinsics.areEqual(this.f81921b, onePrepaidValidateIdCardResponse.f81921b) && Intrinsics.areEqual(this.f81922c, onePrepaidValidateIdCardResponse.f81922c) && Intrinsics.areEqual(this.f81923d, onePrepaidValidateIdCardResponse.f81923d) && Intrinsics.areEqual(this.f81924e, onePrepaidValidateIdCardResponse.f81924e) && Intrinsics.areEqual(this.f81925f, onePrepaidValidateIdCardResponse.f81925f) && Intrinsics.areEqual(this.f81926g, onePrepaidValidateIdCardResponse.f81926g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81921b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81922c;
    }

    @Nullable
    public final Data getData() {
        return this.f81924e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81926g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81925f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81923d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81920a;
    }

    public int hashCode() {
        String str = this.f81920a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81921b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81922c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81923d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Data data = this.f81924e;
        int hashCode5 = (hashCode4 + (data == null ? 0 : data.hashCode())) * 31;
        List<String> list = this.f81925f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81926g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81920a;
        String str2 = this.f81921b;
        String str3 = this.f81922c;
        String str4 = this.f81923d;
        Data data = this.f81924e;
        List<String> list = this.f81925f;
        String str5 = this.f81926g;
        return "OnePrepaidValidateIdCardResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + data + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePrepaidValidateIdCardResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Data data, @Nullable List<String> list, @Nullable String str5) {
        this.f81920a = str;
        this.f81921b = str2;
        this.f81922c = str3;
        this.f81923d = str4;
        this.f81924e = data;
        this.f81925f = list;
        this.f81926g = str5;
    }

    public /* synthetic */ OnePrepaidValidateIdCardResponse(String str, String str2, String str3, String str4, Data data, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : data, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
