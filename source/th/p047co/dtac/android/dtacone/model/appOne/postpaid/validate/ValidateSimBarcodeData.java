package th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.customerenquiry.ConstsKt;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018JÚ\u0001\u0010=\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00052\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\nHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001d\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u0004\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001a\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b&\u0010\u0018R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001b¨\u0006C"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/ValidateSimBarcodeData;", "", "companyCode", "", "isNiceNumber", "", "simCardNumber", "packageGroupType", ConstsKt.TELEPHONE_TYPE, "customerNumber", "", "penaltyRate", "dealerNumber", "contractPeriod", "simType", "packageGroupCode", "switchOnReasonCode", "advancePayment", "minPrice", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "lastChangeDateTime", "packageGroupDescriptionEng", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvancePayment", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompanyCode", "()Ljava/lang/String;", "getContractPeriod", "getCustomerNumber", "getDealerNumber", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLastChangeDateTime", "getMinPrice", "getPackageGroupCode", "getPackageGroupDescriptionEng", "getPackageGroupType", "getPenaltyRate", "getSimCardNumber", "getSimType", "getSubscriberNumber", "getSwitchOnReasonCode", "getTelephoneType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/ValidateSimBarcodeData;", "equals", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.validate.ValidateSimBarcodeData */
/* loaded from: classes8.dex */
public final class ValidateSimBarcodeData {
    public static final int $stable = 0;
    @SerializedName("advancePayment")
    @Nullable
    private final Integer advancePayment;
    @SerializedName("companyCode")
    @Nullable
    private final String companyCode;
    @SerializedName("contractPeriod")
    @Nullable
    private final Integer contractPeriod;
    @SerializedName("customerNumber")
    @Nullable
    private final Integer customerNumber;
    @SerializedName("dealerNumber")
    @Nullable
    private final String dealerNumber;
    @SerializedName("isNiceNumber")
    @Nullable
    private final Boolean isNiceNumber;
    @SerializedName("lastChangeDateTime")
    @Nullable
    private final String lastChangeDateTime;
    @SerializedName("minPrice")
    @Nullable
    private final Integer minPrice;
    @SerializedName("packageGroupCode")
    @Nullable
    private final String packageGroupCode;
    @SerializedName("packageGroupDescriptionEng")
    @Nullable
    private final String packageGroupDescriptionEng;
    @SerializedName("packageGroupType")
    @Nullable
    private final String packageGroupType;
    @SerializedName("penaltyRate")
    @Nullable
    private final Integer penaltyRate;
    @SerializedName("simCardNumber")
    @Nullable
    private final String simCardNumber;
    @SerializedName("simType")
    @Nullable
    private final String simType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @Nullable
    private final String subscriberNumber;
    @SerializedName("switchOnReasonCode")
    @Nullable
    private final String switchOnReasonCode;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @Nullable
    private final String telephoneType;

    public ValidateSimBarcodeData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    @Nullable
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final String component10() {
        return this.simType;
    }

    @Nullable
    public final String component11() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String component12() {
        return this.switchOnReasonCode;
    }

    @Nullable
    public final Integer component13() {
        return this.advancePayment;
    }

    @Nullable
    public final Integer component14() {
        return this.minPrice;
    }

    @Nullable
    public final String component15() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String component16() {
        return this.lastChangeDateTime;
    }

    @Nullable
    public final String component17() {
        return this.packageGroupDescriptionEng;
    }

    @Nullable
    public final Boolean component2() {
        return this.isNiceNumber;
    }

    @Nullable
    public final String component3() {
        return this.simCardNumber;
    }

    @Nullable
    public final String component4() {
        return this.packageGroupType;
    }

    @Nullable
    public final String component5() {
        return this.telephoneType;
    }

    @Nullable
    public final Integer component6() {
        return this.customerNumber;
    }

    @Nullable
    public final Integer component7() {
        return this.penaltyRate;
    }

    @Nullable
    public final String component8() {
        return this.dealerNumber;
    }

    @Nullable
    public final Integer component9() {
        return this.contractPeriod;
    }

    @NotNull
    public final ValidateSimBarcodeData copy(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5, @Nullable Integer num3, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        return new ValidateSimBarcodeData(str, bool, str2, str3, str4, num, num2, str5, num3, str6, str7, str8, num4, num5, str9, str10, str11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ValidateSimBarcodeData) {
            ValidateSimBarcodeData validateSimBarcodeData = (ValidateSimBarcodeData) obj;
            return Intrinsics.areEqual(this.companyCode, validateSimBarcodeData.companyCode) && Intrinsics.areEqual(this.isNiceNumber, validateSimBarcodeData.isNiceNumber) && Intrinsics.areEqual(this.simCardNumber, validateSimBarcodeData.simCardNumber) && Intrinsics.areEqual(this.packageGroupType, validateSimBarcodeData.packageGroupType) && Intrinsics.areEqual(this.telephoneType, validateSimBarcodeData.telephoneType) && Intrinsics.areEqual(this.customerNumber, validateSimBarcodeData.customerNumber) && Intrinsics.areEqual(this.penaltyRate, validateSimBarcodeData.penaltyRate) && Intrinsics.areEqual(this.dealerNumber, validateSimBarcodeData.dealerNumber) && Intrinsics.areEqual(this.contractPeriod, validateSimBarcodeData.contractPeriod) && Intrinsics.areEqual(this.simType, validateSimBarcodeData.simType) && Intrinsics.areEqual(this.packageGroupCode, validateSimBarcodeData.packageGroupCode) && Intrinsics.areEqual(this.switchOnReasonCode, validateSimBarcodeData.switchOnReasonCode) && Intrinsics.areEqual(this.advancePayment, validateSimBarcodeData.advancePayment) && Intrinsics.areEqual(this.minPrice, validateSimBarcodeData.minPrice) && Intrinsics.areEqual(this.subscriberNumber, validateSimBarcodeData.subscriberNumber) && Intrinsics.areEqual(this.lastChangeDateTime, validateSimBarcodeData.lastChangeDateTime) && Intrinsics.areEqual(this.packageGroupDescriptionEng, validateSimBarcodeData.packageGroupDescriptionEng);
        }
        return false;
    }

    @Nullable
    public final Integer getAdvancePayment() {
        return this.advancePayment;
    }

    @Nullable
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @Nullable
    public final Integer getContractPeriod() {
        return this.contractPeriod;
    }

    @Nullable
    public final Integer getCustomerNumber() {
        return this.customerNumber;
    }

    @Nullable
    public final String getDealerNumber() {
        return this.dealerNumber;
    }

    @Nullable
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @Nullable
    public final Integer getMinPrice() {
        return this.minPrice;
    }

    @Nullable
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @Nullable
    public final String getPackageGroupDescriptionEng() {
        return this.packageGroupDescriptionEng;
    }

    @Nullable
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @Nullable
    public final Integer getPenaltyRate() {
        return this.penaltyRate;
    }

    @Nullable
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @Nullable
    public final String getSimType() {
        return this.simType;
    }

    @Nullable
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @Nullable
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    @Nullable
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    public int hashCode() {
        String str = this.companyCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isNiceNumber;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.simCardNumber;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.packageGroupType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.telephoneType;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.customerNumber;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.penaltyRate;
        int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.dealerNumber;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.contractPeriod;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.simType;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.packageGroupCode;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.switchOnReasonCode;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num4 = this.advancePayment;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.minPrice;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str9 = this.subscriberNumber;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastChangeDateTime;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.packageGroupDescriptionEng;
        return hashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    @Nullable
    public final Boolean isNiceNumber() {
        return this.isNiceNumber;
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        Boolean bool = this.isNiceNumber;
        String str2 = this.simCardNumber;
        String str3 = this.packageGroupType;
        String str4 = this.telephoneType;
        Integer num = this.customerNumber;
        Integer num2 = this.penaltyRate;
        String str5 = this.dealerNumber;
        Integer num3 = this.contractPeriod;
        String str6 = this.simType;
        String str7 = this.packageGroupCode;
        String str8 = this.switchOnReasonCode;
        Integer num4 = this.advancePayment;
        Integer num5 = this.minPrice;
        String str9 = this.subscriberNumber;
        String str10 = this.lastChangeDateTime;
        String str11 = this.packageGroupDescriptionEng;
        return "ValidateSimBarcodeData(companyCode=" + str + ", isNiceNumber=" + bool + ", simCardNumber=" + str2 + ", packageGroupType=" + str3 + ", telephoneType=" + str4 + ", customerNumber=" + num + ", penaltyRate=" + num2 + ", dealerNumber=" + str5 + ", contractPeriod=" + num3 + ", simType=" + str6 + ", packageGroupCode=" + str7 + ", switchOnReasonCode=" + str8 + ", advancePayment=" + num4 + ", minPrice=" + num5 + ", subscriberNumber=" + str9 + ", lastChangeDateTime=" + str10 + ", packageGroupDescriptionEng=" + str11 + ")";
    }

    public ValidateSimBarcodeData(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable String str5, @Nullable Integer num3, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Integer num4, @Nullable Integer num5, @Nullable String str9, @Nullable String str10, @Nullable String str11) {
        this.companyCode = str;
        this.isNiceNumber = bool;
        this.simCardNumber = str2;
        this.packageGroupType = str3;
        this.telephoneType = str4;
        this.customerNumber = num;
        this.penaltyRate = num2;
        this.dealerNumber = str5;
        this.contractPeriod = num3;
        this.simType = str6;
        this.packageGroupCode = str7;
        this.switchOnReasonCode = str8;
        this.advancePayment = num4;
        this.minPrice = num5;
        this.subscriberNumber = str9;
        this.lastChangeDateTime = str10;
        this.packageGroupDescriptionEng = str11;
    }

    public /* synthetic */ ValidateSimBarcodeData(String str, Boolean bool, String str2, String str3, String str4, Integer num, Integer num2, String str5, Integer num3, String str6, String str7, String str8, Integer num4, Integer num5, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : num3, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : num4, (i & 8192) != 0 ? null : num5, (i & 16384) != 0 ? null : str9, (i & 32768) != 0 ? null : str10, (i & 65536) != 0 ? null : str11);
    }
}
