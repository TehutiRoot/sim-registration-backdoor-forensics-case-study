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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u00013Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u000fJj\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000fJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b2\u0010\u000f¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse;", "", "", "systemMessage", "code", "codeType", "responseDateTime", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "data", "", "replaceMessage", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "component6", "()Ljava/util/List;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;Ljava/util/List;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSystemMessage", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCode", OperatorName.CURVE_TO, "getCodeType", "d", "getResponseDateTime", "e", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "getData", OperatorName.FILL_NON_ZERO, "Ljava/util/List;", "getReplaceMessage", OperatorName.NON_STROKING_GRAY, "getDesc", "ValidateBarcodeData", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse */
/* loaded from: classes7.dex */
public final class OnePrepaidValidateSimBarcodeResponse {
    public static final int $stable = 8;
    @SerializedName("systemMessage")
    @Nullable

    /* renamed from: a */
    private final String f82021a;
    @SerializedName("code")
    @Nullable

    /* renamed from: b */
    private final String f82022b;
    @SerializedName("codeType")
    @Nullable

    /* renamed from: c */
    private final String f82023c;
    @SerializedName("responseDateTime")
    @Nullable

    /* renamed from: d */
    private final String f82024d;
    @SerializedName("data")
    @Nullable

    /* renamed from: e */
    private final ValidateBarcodeData f82025e;
    @SerializedName("replaceMessage")
    @Nullable

    /* renamed from: f */
    private final List<String> f82026f;
    @SerializedName("desc")
    @Nullable

    /* renamed from: g */
    private final String f82027g;

    @StabilityInferred(parameters = 0)
    @Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\n\u0010\u0015¨\u0006."}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "", "", "simcardNumber", "companyCode", "simType", "dummyNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "displaySubscriberNumber", "", "isNumberingPooling", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getSimcardNumber", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getCompanyCode", OperatorName.CURVE_TO, "getSimType", "d", "getDummyNumber", "e", "getSubscriberNumber", OperatorName.FILL_NON_ZERO, "getDisplaySubscriberNumber", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Boolean;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
    /* renamed from: th.co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidValidateSimBarcodeResponse$ValidateBarcodeData */
    /* loaded from: classes7.dex */
    public static final class ValidateBarcodeData {
        public static final int $stable = 0;
        @SerializedName("simcardNumber")
        @Nullable

        /* renamed from: a */
        private final String f82028a;
        @SerializedName("companyCode")
        @Nullable

        /* renamed from: b */
        private final String f82029b;
        @SerializedName("simType")
        @Nullable

        /* renamed from: c */
        private final String f82030c;
        @SerializedName("dummyNumber")
        @Nullable

        /* renamed from: d */
        private final String f82031d;
        @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
        @Nullable

        /* renamed from: e */
        private final String f82032e;
        @SerializedName("displaySubscriberNumber")
        @Nullable

        /* renamed from: f */
        private final String f82033f;
        @SerializedName("isNumberingPooling")
        @Nullable

        /* renamed from: g */
        private final Boolean f82034g;

        public ValidateBarcodeData() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public static /* synthetic */ ValidateBarcodeData copy$default(ValidateBarcodeData validateBarcodeData, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                str = validateBarcodeData.f82028a;
            }
            if ((i & 2) != 0) {
                str2 = validateBarcodeData.f82029b;
            }
            String str7 = str2;
            if ((i & 4) != 0) {
                str3 = validateBarcodeData.f82030c;
            }
            String str8 = str3;
            if ((i & 8) != 0) {
                str4 = validateBarcodeData.f82031d;
            }
            String str9 = str4;
            if ((i & 16) != 0) {
                str5 = validateBarcodeData.f82032e;
            }
            String str10 = str5;
            if ((i & 32) != 0) {
                str6 = validateBarcodeData.f82033f;
            }
            String str11 = str6;
            if ((i & 64) != 0) {
                bool = validateBarcodeData.f82034g;
            }
            return validateBarcodeData.copy(str, str7, str8, str9, str10, str11, bool);
        }

        @Nullable
        public final String component1() {
            return this.f82028a;
        }

        @Nullable
        public final String component2() {
            return this.f82029b;
        }

        @Nullable
        public final String component3() {
            return this.f82030c;
        }

        @Nullable
        public final String component4() {
            return this.f82031d;
        }

        @Nullable
        public final String component5() {
            return this.f82032e;
        }

        @Nullable
        public final String component6() {
            return this.f82033f;
        }

        @Nullable
        public final Boolean component7() {
            return this.f82034g;
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
                return Intrinsics.areEqual(this.f82028a, validateBarcodeData.f82028a) && Intrinsics.areEqual(this.f82029b, validateBarcodeData.f82029b) && Intrinsics.areEqual(this.f82030c, validateBarcodeData.f82030c) && Intrinsics.areEqual(this.f82031d, validateBarcodeData.f82031d) && Intrinsics.areEqual(this.f82032e, validateBarcodeData.f82032e) && Intrinsics.areEqual(this.f82033f, validateBarcodeData.f82033f) && Intrinsics.areEqual(this.f82034g, validateBarcodeData.f82034g);
            }
            return false;
        }

        @Nullable
        public final String getCompanyCode() {
            return this.f82029b;
        }

        @Nullable
        public final String getDisplaySubscriberNumber() {
            return this.f82033f;
        }

        @Nullable
        public final String getDummyNumber() {
            return this.f82031d;
        }

        @Nullable
        public final String getSimType() {
            return this.f82030c;
        }

        @Nullable
        public final String getSimcardNumber() {
            return this.f82028a;
        }

        @Nullable
        public final String getSubscriberNumber() {
            return this.f82032e;
        }

        public int hashCode() {
            String str = this.f82028a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f82029b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f82030c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f82031d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f82032e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f82033f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Boolean bool = this.f82034g;
            return hashCode6 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isNumberingPooling() {
            return this.f82034g;
        }

        @NotNull
        public String toString() {
            String str = this.f82028a;
            String str2 = this.f82029b;
            String str3 = this.f82030c;
            String str4 = this.f82031d;
            String str5 = this.f82032e;
            String str6 = this.f82033f;
            Boolean bool = this.f82034g;
            return "ValidateBarcodeData(simcardNumber=" + str + ", companyCode=" + str2 + ", simType=" + str3 + ", dummyNumber=" + str4 + ", subscriberNumber=" + str5 + ", displaySubscriberNumber=" + str6 + ", isNumberingPooling=" + bool + ")";
        }

        public ValidateBarcodeData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool) {
            this.f82028a = str;
            this.f82029b = str2;
            this.f82030c = str3;
            this.f82031d = str4;
            this.f82032e = str5;
            this.f82033f = str6;
            this.f82034g = bool;
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
            str = onePrepaidValidateSimBarcodeResponse.f82021a;
        }
        if ((i & 2) != 0) {
            str2 = onePrepaidValidateSimBarcodeResponse.f82022b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = onePrepaidValidateSimBarcodeResponse.f82023c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = onePrepaidValidateSimBarcodeResponse.f82024d;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            validateBarcodeData = onePrepaidValidateSimBarcodeResponse.f82025e;
        }
        ValidateBarcodeData validateBarcodeData2 = validateBarcodeData;
        List<String> list2 = list;
        if ((i & 32) != 0) {
            list2 = onePrepaidValidateSimBarcodeResponse.f82026f;
        }
        List list3 = list2;
        if ((i & 64) != 0) {
            str5 = onePrepaidValidateSimBarcodeResponse.f82027g;
        }
        return onePrepaidValidateSimBarcodeResponse.copy(str, str6, str7, str8, validateBarcodeData2, list3, str5);
    }

    @Nullable
    public final String component1() {
        return this.f82021a;
    }

    @Nullable
    public final String component2() {
        return this.f82022b;
    }

    @Nullable
    public final String component3() {
        return this.f82023c;
    }

    @Nullable
    public final String component4() {
        return this.f82024d;
    }

    @Nullable
    public final ValidateBarcodeData component5() {
        return this.f82025e;
    }

    @Nullable
    public final List<String> component6() {
        return this.f82026f;
    }

    @Nullable
    public final String component7() {
        return this.f82027g;
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
            return Intrinsics.areEqual(this.f82021a, onePrepaidValidateSimBarcodeResponse.f82021a) && Intrinsics.areEqual(this.f82022b, onePrepaidValidateSimBarcodeResponse.f82022b) && Intrinsics.areEqual(this.f82023c, onePrepaidValidateSimBarcodeResponse.f82023c) && Intrinsics.areEqual(this.f82024d, onePrepaidValidateSimBarcodeResponse.f82024d) && Intrinsics.areEqual(this.f82025e, onePrepaidValidateSimBarcodeResponse.f82025e) && Intrinsics.areEqual(this.f82026f, onePrepaidValidateSimBarcodeResponse.f82026f) && Intrinsics.areEqual(this.f82027g, onePrepaidValidateSimBarcodeResponse.f82027g);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.f82022b;
    }

    @Nullable
    public final String getCodeType() {
        return this.f82023c;
    }

    @Nullable
    public final ValidateBarcodeData getData() {
        return this.f82025e;
    }

    @Nullable
    public final String getDesc() {
        return this.f82027g;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.f82026f;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.f82024d;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.f82021a;
    }

    public int hashCode() {
        String str = this.f82021a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82022b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f82023c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f82024d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ValidateBarcodeData validateBarcodeData = this.f82025e;
        int hashCode5 = (hashCode4 + (validateBarcodeData == null ? 0 : validateBarcodeData.hashCode())) * 31;
        List<String> list = this.f82026f;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.f82027g;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82021a;
        String str2 = this.f82022b;
        String str3 = this.f82023c;
        String str4 = this.f82024d;
        ValidateBarcodeData validateBarcodeData = this.f82025e;
        List<String> list = this.f82026f;
        String str5 = this.f82027g;
        return "OnePrepaidValidateSimBarcodeResponse(systemMessage=" + str + ", code=" + str2 + ", codeType=" + str3 + ", responseDateTime=" + str4 + ", data=" + validateBarcodeData + ", replaceMessage=" + list + ", desc=" + str5 + ")";
    }

    public OnePrepaidValidateSimBarcodeResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable ValidateBarcodeData validateBarcodeData, @Nullable List<String> list, @Nullable String str5) {
        this.f82021a = str;
        this.f82022b = str2;
        this.f82023c = str3;
        this.f82024d = str4;
        this.f82025e = validateBarcodeData;
        this.f82026f = list;
        this.f82027g = str5;
    }

    public /* synthetic */ OnePrepaidValidateSimBarcodeResponse(String str, String str2, String str3, String str4, ValidateBarcodeData validateBarcodeData, List list, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : validateBarcodeData, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5);
    }
}