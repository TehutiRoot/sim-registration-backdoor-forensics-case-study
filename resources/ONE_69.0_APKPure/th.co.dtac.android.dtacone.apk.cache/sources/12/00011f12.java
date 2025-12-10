package th.p047co.dtac.android.dtacone.model.mrtr_postpaid;

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
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b9\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¯\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J³\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u0005HÆ\u0001J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0016\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0017¨\u0006A"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/MrtrPostpaidValidateSimBarcodeResponse;", "", "isNiceNumber", "", "packageGroupCode", "", "packageGroupDescriptionEng", "switchOnReasonCode", "dealerNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "minPrice", "simType", "companyCode", "contractPeriod", "advancePayment", "penaltyRate", "packageGroupType", "simCardNumber", "customerNumber", "lastChangeDateTime", ConstsKt.TELEPHONE_TYPE, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvancePayment", "()Ljava/lang/String;", "getCompanyCode", "getContractPeriod", "getCustomerNumber", "getDealerNumber", "()Z", "getLastChangeDateTime", "getMinPrice", "getPackageGroupCode", "getPackageGroupDescriptionEng", "getPackageGroupType", "getPenaltyRate", "getSimCardNumber", "getSimType", "setSimType", "(Ljava/lang/String;)V", "getSubscriberNumber", "getSwitchOnReasonCode", "getTelephoneType", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.MrtrPostpaidValidateSimBarcodeResponse */
/* loaded from: classes8.dex */
public final class MrtrPostpaidValidateSimBarcodeResponse {
    public static final int $stable = 8;
    @SerializedName("advancePayment")
    @NotNull
    private final String advancePayment;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;
    @SerializedName("contractPeriod")
    @NotNull
    private final String contractPeriod;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("dealerNumber")
    @NotNull
    private final String dealerNumber;
    @SerializedName("isNiceNumber")
    private final boolean isNiceNumber;
    @SerializedName("lastChangeDateTime")
    @NotNull
    private final String lastChangeDateTime;
    @SerializedName("minPrice")
    @NotNull
    private final String minPrice;
    @SerializedName("packageGroupCode")
    @NotNull
    private final String packageGroupCode;
    @SerializedName("packageGroupDescriptionEng")
    @NotNull
    private final String packageGroupDescriptionEng;
    @SerializedName("packageGroupType")
    @NotNull
    private final String packageGroupType;
    @SerializedName("penaltyRate")
    @NotNull
    private final String penaltyRate;
    @SerializedName("simCardNumber")
    @NotNull
    private final String simCardNumber;
    @SerializedName("simType")
    @NotNull
    private String simType;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;
    @SerializedName("switchOnReasonCode")
    @NotNull
    private final String switchOnReasonCode;
    @SerializedName(ConstsKt.TELEPHONE_TYPE)
    @NotNull
    private final String telephoneType;

    public MrtrPostpaidValidateSimBarcodeResponse() {
        this(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public final boolean component1() {
        return this.isNiceNumber;
    }

    @NotNull
    public final String component10() {
        return this.contractPeriod;
    }

    @NotNull
    public final String component11() {
        return this.advancePayment;
    }

    @NotNull
    public final String component12() {
        return this.penaltyRate;
    }

    @NotNull
    public final String component13() {
        return this.packageGroupType;
    }

    @NotNull
    public final String component14() {
        return this.simCardNumber;
    }

    @NotNull
    public final String component15() {
        return this.customerNumber;
    }

    @NotNull
    public final String component16() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String component17() {
        return this.telephoneType;
    }

    @NotNull
    public final String component2() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String component3() {
        return this.packageGroupDescriptionEng;
    }

    @NotNull
    public final String component4() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String component5() {
        return this.dealerNumber;
    }

    @NotNull
    public final String component6() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component7() {
        return this.minPrice;
    }

    @NotNull
    public final String component8() {
        return this.simType;
    }

    @NotNull
    public final String component9() {
        return this.companyCode;
    }

    @NotNull
    public final MrtrPostpaidValidateSimBarcodeResponse copy(boolean z, @NotNull String packageGroupCode, @NotNull String packageGroupDescriptionEng, @NotNull String switchOnReasonCode, @NotNull String dealerNumber, @NotNull String subscriberNumber, @NotNull String minPrice, @NotNull String simType, @NotNull String companyCode, @NotNull String contractPeriod, @NotNull String advancePayment, @NotNull String penaltyRate, @NotNull String packageGroupType, @NotNull String simCardNumber, @NotNull String customerNumber, @NotNull String lastChangeDateTime, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescriptionEng, "packageGroupDescriptionEng");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(dealerNumber, "dealerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(minPrice, "minPrice");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(contractPeriod, "contractPeriod");
        Intrinsics.checkNotNullParameter(advancePayment, "advancePayment");
        Intrinsics.checkNotNullParameter(penaltyRate, "penaltyRate");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        return new MrtrPostpaidValidateSimBarcodeResponse(z, packageGroupCode, packageGroupDescriptionEng, switchOnReasonCode, dealerNumber, subscriberNumber, minPrice, simType, companyCode, contractPeriod, advancePayment, penaltyRate, packageGroupType, simCardNumber, customerNumber, lastChangeDateTime, telephoneType);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrPostpaidValidateSimBarcodeResponse) {
            MrtrPostpaidValidateSimBarcodeResponse mrtrPostpaidValidateSimBarcodeResponse = (MrtrPostpaidValidateSimBarcodeResponse) obj;
            return this.isNiceNumber == mrtrPostpaidValidateSimBarcodeResponse.isNiceNumber && Intrinsics.areEqual(this.packageGroupCode, mrtrPostpaidValidateSimBarcodeResponse.packageGroupCode) && Intrinsics.areEqual(this.packageGroupDescriptionEng, mrtrPostpaidValidateSimBarcodeResponse.packageGroupDescriptionEng) && Intrinsics.areEqual(this.switchOnReasonCode, mrtrPostpaidValidateSimBarcodeResponse.switchOnReasonCode) && Intrinsics.areEqual(this.dealerNumber, mrtrPostpaidValidateSimBarcodeResponse.dealerNumber) && Intrinsics.areEqual(this.subscriberNumber, mrtrPostpaidValidateSimBarcodeResponse.subscriberNumber) && Intrinsics.areEqual(this.minPrice, mrtrPostpaidValidateSimBarcodeResponse.minPrice) && Intrinsics.areEqual(this.simType, mrtrPostpaidValidateSimBarcodeResponse.simType) && Intrinsics.areEqual(this.companyCode, mrtrPostpaidValidateSimBarcodeResponse.companyCode) && Intrinsics.areEqual(this.contractPeriod, mrtrPostpaidValidateSimBarcodeResponse.contractPeriod) && Intrinsics.areEqual(this.advancePayment, mrtrPostpaidValidateSimBarcodeResponse.advancePayment) && Intrinsics.areEqual(this.penaltyRate, mrtrPostpaidValidateSimBarcodeResponse.penaltyRate) && Intrinsics.areEqual(this.packageGroupType, mrtrPostpaidValidateSimBarcodeResponse.packageGroupType) && Intrinsics.areEqual(this.simCardNumber, mrtrPostpaidValidateSimBarcodeResponse.simCardNumber) && Intrinsics.areEqual(this.customerNumber, mrtrPostpaidValidateSimBarcodeResponse.customerNumber) && Intrinsics.areEqual(this.lastChangeDateTime, mrtrPostpaidValidateSimBarcodeResponse.lastChangeDateTime) && Intrinsics.areEqual(this.telephoneType, mrtrPostpaidValidateSimBarcodeResponse.telephoneType);
        }
        return false;
    }

    @NotNull
    public final String getAdvancePayment() {
        return this.advancePayment;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final String getContractPeriod() {
        return this.contractPeriod;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getDealerNumber() {
        return this.dealerNumber;
    }

    @NotNull
    public final String getLastChangeDateTime() {
        return this.lastChangeDateTime;
    }

    @NotNull
    public final String getMinPrice() {
        return this.minPrice;
    }

    @NotNull
    public final String getPackageGroupCode() {
        return this.packageGroupCode;
    }

    @NotNull
    public final String getPackageGroupDescriptionEng() {
        return this.packageGroupDescriptionEng;
    }

    @NotNull
    public final String getPackageGroupType() {
        return this.packageGroupType;
    }

    @NotNull
    public final String getPenaltyRate() {
        return this.penaltyRate;
    }

    @NotNull
    public final String getSimCardNumber() {
        return this.simCardNumber;
    }

    @NotNull
    public final String getSimType() {
        return this.simType;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String getSwitchOnReasonCode() {
        return this.switchOnReasonCode;
    }

    @NotNull
    public final String getTelephoneType() {
        return this.telephoneType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    public int hashCode() {
        boolean z = this.isNiceNumber;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((((((((((((((((((((((((((((r0 * 31) + this.packageGroupCode.hashCode()) * 31) + this.packageGroupDescriptionEng.hashCode()) * 31) + this.switchOnReasonCode.hashCode()) * 31) + this.dealerNumber.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + this.simType.hashCode()) * 31) + this.companyCode.hashCode()) * 31) + this.contractPeriod.hashCode()) * 31) + this.advancePayment.hashCode()) * 31) + this.penaltyRate.hashCode()) * 31) + this.packageGroupType.hashCode()) * 31) + this.simCardNumber.hashCode()) * 31) + this.customerNumber.hashCode()) * 31) + this.lastChangeDateTime.hashCode()) * 31) + this.telephoneType.hashCode();
    }

    public final boolean isNiceNumber() {
        return this.isNiceNumber;
    }

    public final void setSimType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.simType = str;
    }

    @NotNull
    public String toString() {
        boolean z = this.isNiceNumber;
        String str = this.packageGroupCode;
        String str2 = this.packageGroupDescriptionEng;
        String str3 = this.switchOnReasonCode;
        String str4 = this.dealerNumber;
        String str5 = this.subscriberNumber;
        String str6 = this.minPrice;
        String str7 = this.simType;
        String str8 = this.companyCode;
        String str9 = this.contractPeriod;
        String str10 = this.advancePayment;
        String str11 = this.penaltyRate;
        String str12 = this.packageGroupType;
        String str13 = this.simCardNumber;
        String str14 = this.customerNumber;
        String str15 = this.lastChangeDateTime;
        String str16 = this.telephoneType;
        return "MrtrPostpaidValidateSimBarcodeResponse(isNiceNumber=" + z + ", packageGroupCode=" + str + ", packageGroupDescriptionEng=" + str2 + ", switchOnReasonCode=" + str3 + ", dealerNumber=" + str4 + ", subscriberNumber=" + str5 + ", minPrice=" + str6 + ", simType=" + str7 + ", companyCode=" + str8 + ", contractPeriod=" + str9 + ", advancePayment=" + str10 + ", penaltyRate=" + str11 + ", packageGroupType=" + str12 + ", simCardNumber=" + str13 + ", customerNumber=" + str14 + ", lastChangeDateTime=" + str15 + ", telephoneType=" + str16 + ")";
    }

    public MrtrPostpaidValidateSimBarcodeResponse(boolean z, @NotNull String packageGroupCode, @NotNull String packageGroupDescriptionEng, @NotNull String switchOnReasonCode, @NotNull String dealerNumber, @NotNull String subscriberNumber, @NotNull String minPrice, @NotNull String simType, @NotNull String companyCode, @NotNull String contractPeriod, @NotNull String advancePayment, @NotNull String penaltyRate, @NotNull String packageGroupType, @NotNull String simCardNumber, @NotNull String customerNumber, @NotNull String lastChangeDateTime, @NotNull String telephoneType) {
        Intrinsics.checkNotNullParameter(packageGroupCode, "packageGroupCode");
        Intrinsics.checkNotNullParameter(packageGroupDescriptionEng, "packageGroupDescriptionEng");
        Intrinsics.checkNotNullParameter(switchOnReasonCode, "switchOnReasonCode");
        Intrinsics.checkNotNullParameter(dealerNumber, "dealerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(minPrice, "minPrice");
        Intrinsics.checkNotNullParameter(simType, "simType");
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(contractPeriod, "contractPeriod");
        Intrinsics.checkNotNullParameter(advancePayment, "advancePayment");
        Intrinsics.checkNotNullParameter(penaltyRate, "penaltyRate");
        Intrinsics.checkNotNullParameter(packageGroupType, "packageGroupType");
        Intrinsics.checkNotNullParameter(simCardNumber, "simCardNumber");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(lastChangeDateTime, "lastChangeDateTime");
        Intrinsics.checkNotNullParameter(telephoneType, "telephoneType");
        this.isNiceNumber = z;
        this.packageGroupCode = packageGroupCode;
        this.packageGroupDescriptionEng = packageGroupDescriptionEng;
        this.switchOnReasonCode = switchOnReasonCode;
        this.dealerNumber = dealerNumber;
        this.subscriberNumber = subscriberNumber;
        this.minPrice = minPrice;
        this.simType = simType;
        this.companyCode = companyCode;
        this.contractPeriod = contractPeriod;
        this.advancePayment = advancePayment;
        this.penaltyRate = penaltyRate;
        this.packageGroupType = packageGroupType;
        this.simCardNumber = simCardNumber;
        this.customerNumber = customerNumber;
        this.lastChangeDateTime = lastChangeDateTime;
        this.telephoneType = telephoneType;
    }

    public /* synthetic */ MrtrPostpaidValidateSimBarcodeResponse(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "0" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16);
    }
}