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
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "ValidateBarcodeData", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse */
/* loaded from: classes7.dex */
public final class OnePrepaidValidateSimBarcodeResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f81929a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f81930b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f81931c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f81932d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final ValidateBarcodeData f81933e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f81934f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f81935g;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\n\u0010\u0015¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "", "", "simcardNumber", "companyCode", "simType", "dummyNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "displaySubscriberNumber", "", "isNumberingPooling", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSimcardNumber", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCompanyCode", OperatorName.CURVE_TO, "getSimType", "d", "getDummyNumber", "e", "getSubscriberNumber", OperatorName.FILL_NON_ZERO, "getDisplaySubscriberNumber", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Boolean;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData */
    /* loaded from: classes7.dex */
    public static final class ValidateBarcodeData {
        public static final int $stable = 0;
        @SerializedName("simcardNumber")
        @Nullable

        /* renamed from: a */
        private final String f81936a;
        @SerializedName("companyCode")
        @Nullable

        /* renamed from: b */
        private final String f81937b;
        @SerializedName("simType")
        @Nullable

        /* renamed from: c */
        private final String f81938c;
        @SerializedName("dummyNumber")
        @Nullable

        /* renamed from: d */
        private final String f81939d;
        @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
        @Nullable

        /* renamed from: e */
        private final String f81940e;
        @SerializedName("displaySubscriberNumber")
        @Nullable

        /* renamed from: f */
        private final String f81941f;
        @SerializedName("isNumberingPooling")
        @Nullable

        /* renamed from: g */
        private final Boolean f81942g;

        public ValidateBarcodeData() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ ValidateBarcodeData copy$default(ValidateBarcodeData validateBarcodeData, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validateBarcodeData.f81936a;
            }
            if ((i & 2) != 0) {
                str2 = validateBarcodeData.f81937b;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = validateBarcodeData.f81938c;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = validateBarcodeData.f81939d;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = validateBarcodeData.f81940e;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = validateBarcodeData.f81941f;
            }
            String str11 = str6;
            if ((i & 64) != 0) {
                bool = validateBarcodeData.f81942g;
            }
            return validateBarcodeData.copy(str, str7, str8, str9, str10, str11, bool);
        }

        @Nullable
        public final String component1() {
            return this.f81936a;
        }

        @Nullable
        public final String component2() {
            return this.f81937b;
        }

        @Nullable
        public final String component3() {
            return this.f81938c;
        }

        @Nullable
        public final String component4() {
            return this.f81939d;
        }

        @Nullable
        public final String component5() {
            return this.f81940e;
        }

        @Nullable
        public final String component6() {
            return this.f81941f;
        }

        @Nullable
        public final Boolean component7() {
            return this.f81942g;
        }

        @NotNull
        public final ValidateBarcodeData copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
            return new ValidateBarcodeData(str, str2, str3, str4, str5, str6, bool);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ValidateBarcodeData) {
                ValidateBarcodeData validateBarcodeData = (ValidateBarcodeData) obj;
                return Intrinsics.areEqual(this.f81936a, validateBarcodeData.f81936a) && Intrinsics.areEqual(this.f81937b, validateBarcodeData.f81937b) && Intrinsics.areEqual(this.f81938c, validateBarcodeData.f81938c) && Intrinsics.areEqual(this.f81939d, validateBarcodeData.f81939d) && Intrinsics.areEqual(this.f81940e, validateBarcodeData.f81940e) && Intrinsics.areEqual(this.f81941f, validateBarcodeData.f81941f) && Intrinsics.areEqual(this.f81942g, validateBarcodeData.f81942g);
            }
            return false;
        }

        @Nullable
        public final String getCompanyCode() {
            return this.f81937b;
        }

        @Nullable
        public final String getDisplaySubscriberNumber() {
            return this.f81941f;
        }

        @Nullable
        public final String getDummyNumber() {
            return this.f81939d;
        }

        @Nullable
        public final String getSimType() {
            return this.f81938c;
        }

        @Nullable
        public final String getSimcardNumber() {
            return this.f81936a;
        }

        @Nullable
        public final String getSubscriberNumber() {
            return this.f81940e;
        }

        public int hashCode() {
            String str = this.f81936a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f81937b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f81938c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f81939d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f81940e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f81941f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.f81942g;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isNumberingPooling() {
            return this.f81942g;
        }

        @NotNull
        public String toString() {
            String str = this.f81936a;
            String str2 = this.f81937b;
            String str3 = this.f81938c;
            String str4 = this.f81939d;
            String str5 = this.f81940e;
            String str6 = this.f81941f;
            Boolean bool = this.f81942g;
            return "ValidateBarcodeData(simcardNumber=" + str + ", companyCode=" + str2 + ", simType=" + str3 + ", dummyNumber=" + str4 + ", subscriberNumber=" + str5 + ", displaySubscriberNumber=" + str6 + ", isNumberingPooling=" + bool + ")";
        }

        public ValidateBarcodeData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
            this.f81936a = str;
            this.f81937b = str2;
            this.f81938c = str3;
            this.f81939d = str4;
            this.f81940e = str5;
            this.f81941f = str6;
            this.f81942g = bool;
        }

        public /* synthetic */ ValidateBarcodeData(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool);
        }
    }

    public OnePrepaidValidateSimBarcodeResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ OnePrepaidValidateSimBarcodeResponse copy$default(OnePrepaidValidateSimBarcodeResponse onePrepaidValidateSimBarcodeResponse, String str, String str2, String str3, String str4, ValidateBarcodeData validateBarcodeData, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onePrepaidValidateSimBarcodeResponse.f81929a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidValidateSimBarcodeResponse.f81930b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePrepaidValidateSimBarcodeResponse.f81931c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePrepaidValidateSimBarcodeResponse.f81932d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            validateBarcodeData = onePrepaidValidateSimBarcodeResponse.f81933e;
        }
        ValidateBarcodeData validateBarcodeData2 = validateBarcodeData;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePrepaidValidateSimBarcodeResponse.f81934f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePrepaidValidateSimBarcodeResponse.f81935g;
        }
        return onePrepaidValidateSimBarcodeResponse.copy(str, str6, str7, str8, validateBarcodeData2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f81929a;
    }

    @Nullable
    public final String component2() {
        return this.f81930b;
    }

    @Nullable
    public final String component3() {
        return this.f81931c;
    }

    @Nullable
    public final String component4() {
        return this.f81932d;
    }

    @Nullable
    public final ValidateBarcodeData component5() {
        return this.f81933e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f81934f;
    }

    @Nullable
    public final String component7() {
        return this.f81935g;
    }

    @NotNull
    public final OnePrepaidValidateSimBarcodeResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ValidateBarcodeData validateBarcodeData, @Nullable List<String> list, @Nullable String str5) {
        return new OnePrepaidValidateSimBarcodeResponse(str, str2, str3, str4, validateBarcodeData, list, str5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePrepaidValidateSimBarcodeResponse) {
            OnePrepaidValidateSimBarcodeResponse onePrepaidValidateSimBarcodeResponse = (OnePrepaidValidateSimBarcodeResponse) obj;
            return Intrinsics.areEqual(this.f81929a, onePrepaidValidateSimBarcodeResponse.f81929a) && Intrinsics.areEqual(this.f81930b, onePrepaidValidateSimBarcodeResponse.f81930b) && Intrinsics.areEqual(this.f81931c, onePrepaidValidateSimBarcodeResponse.f81931c) && Intrinsics.areEqual(this.f81932d, onePrepaidValidateSimBarcodeResponse.f81932d) && Intrinsics.areEqual(this.f81933e, onePrepaidValidateSimBarcodeResponse.f81933e) && Intrinsics.areEqual(this.f81934f, onePrepaidValidateSimBarcodeResponse.f81934f) && Intrinsics.areEqual(this.f81935g, onePrepaidValidateSimBarcodeResponse.f81935g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f81930b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f81931c;
    }

    @Nullable
    public final ValidateBarcodeData getData() {
        return this.f81933e;
    }

    @Nullable
    public final String getDesc() {
        return this.f81935g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f81934f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f81932d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f81929a;
    }

    public int hashCode() {
        String str = this.f81929a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f81930b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f81931c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f81932d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ValidateBarcodeData validateBarcodeData = this.f81933e;
        int hashCode5 = (hashCode4 + (validateBarcodeData == null ? 0 : validateBarcodeData.hashCode())) * 31;
        List<String> list = this.f81934f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f81935g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f81929a;
        String str2 = this.f81930b;
        String str3 = this.f81931c;
        String str4 = this.f81932d;
        ValidateBarcodeData validateBarcodeData = this.f81933e;
        List<String> list = this.f81934f;
        String str5 = this.f81935g;
        return "OnePrepaidValidateSimBarcodeResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + validateBarcodeData + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePrepaidValidateSimBarcodeResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ValidateBarcodeData validateBarcodeData, @Nullable List<String> list, @Nullable String str5) {
        this.f81929a = str;
        this.f81930b = str2;
        this.f81931c = str3;
        this.f81932d = str4;
        this.f81933e = validateBarcodeData;
        this.f81934f = list;
        this.f81935g = str5;
    }

    public /* synthetic */ OnePrepaidValidateSimBarcodeResponse(String str, String str2, String str3, String str4, ValidateBarcodeData validateBarcodeData, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : validateBarcodeData, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}
