package th.p047co.dtac.android.dtacone.model.customerenquiry;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_registration.family_sim.InputPostpaidFamilySimSubscriberFragment;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0014HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0003HÆ\u0001J\u0013\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020\u0014HÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018¨\u0006C"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/customerenquiry/DeviceSummaryResponse;", "", "buyingStatus", "", "customerNumber", InputPostpaidFamilySimSubscriberFragment.SUB_NUM, "contractStatus", "contractStartDate", "contractEndDate", "contractEndDay", "endContractReason", "salesOrdersNumber", "salesOrdersDate", "salesOrdersStatus", "createdBy", "shopName", FirebaseAnalytics.Param.LOCATION, "SKUName", "IMEI", "blockUsedHistoryId", "", "normalQuota", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getIMEI", "()Ljava/lang/String;", "getSKUName", "getBlockUsedHistoryId", "()I", "getBuyingStatus", "getContractEndDate", "getContractEndDay", "getContractStartDate", "getContractStatus", "getCreatedBy", "getCustomerNumber", "getEndContractReason", "getLocation", "getNormalQuota", "getSalesOrdersDate", "getSalesOrdersNumber", "getSalesOrdersStatus", "getShopName", "getSubscriberNumber", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.customerenquiry.DeviceSummaryResponse */
/* loaded from: classes8.dex */
public final class DeviceSummaryResponse {
    public static final int $stable = 0;
    @SerializedName("imei")
    @NotNull
    private final String IMEI;
    @SerializedName("skuName")
    @NotNull
    private final String SKUName;
    @SerializedName("blockUsedHistoryId")
    private final int blockUsedHistoryId;
    @SerializedName("buyingStatus")
    @NotNull
    private final String buyingStatus;
    @SerializedName("contractEndDate")
    @NotNull
    private final String contractEndDate;
    @SerializedName("contractEndDay")
    @NotNull
    private final String contractEndDay;
    @SerializedName("contractStartDate")
    @NotNull
    private final String contractStartDate;
    @SerializedName("contractStatus")
    @NotNull
    private final String contractStatus;
    @SerializedName("createdBy")
    @NotNull
    private final String createdBy;
    @SerializedName("customerNumber")
    @NotNull
    private final String customerNumber;
    @SerializedName("endContractReason")
    @NotNull
    private final String endContractReason;
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    @NotNull
    private final String location;
    @SerializedName("normalQuota")
    @NotNull
    private final String normalQuota;
    @SerializedName("salesOrdersDate")
    @NotNull
    private final String salesOrdersDate;
    @SerializedName("salesOrdersNumber")
    @NotNull
    private final String salesOrdersNumber;
    @SerializedName("salesOrdersStatus")
    @NotNull
    private final String salesOrdersStatus;
    @SerializedName("shopName")
    @NotNull
    private final String shopName;
    @SerializedName(InputPostpaidFamilySimSubscriberFragment.SUB_NUM)
    @NotNull
    private final String subscriberNumber;

    public DeviceSummaryResponse(@NotNull String buyingStatus, @NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String contractStatus, @NotNull String contractStartDate, @NotNull String contractEndDate, @NotNull String contractEndDay, @NotNull String endContractReason, @NotNull String salesOrdersNumber, @NotNull String salesOrdersDate, @NotNull String salesOrdersStatus, @NotNull String createdBy, @NotNull String shopName, @NotNull String location, @NotNull String SKUName, @NotNull String IMEI, int i, @NotNull String normalQuota) {
        Intrinsics.checkNotNullParameter(buyingStatus, "buyingStatus");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(contractStatus, "contractStatus");
        Intrinsics.checkNotNullParameter(contractStartDate, "contractStartDate");
        Intrinsics.checkNotNullParameter(contractEndDate, "contractEndDate");
        Intrinsics.checkNotNullParameter(contractEndDay, "contractEndDay");
        Intrinsics.checkNotNullParameter(endContractReason, "endContractReason");
        Intrinsics.checkNotNullParameter(salesOrdersNumber, "salesOrdersNumber");
        Intrinsics.checkNotNullParameter(salesOrdersDate, "salesOrdersDate");
        Intrinsics.checkNotNullParameter(salesOrdersStatus, "salesOrdersStatus");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(shopName, "shopName");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(SKUName, "SKUName");
        Intrinsics.checkNotNullParameter(IMEI, "IMEI");
        Intrinsics.checkNotNullParameter(normalQuota, "normalQuota");
        this.buyingStatus = buyingStatus;
        this.customerNumber = customerNumber;
        this.subscriberNumber = subscriberNumber;
        this.contractStatus = contractStatus;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
        this.contractEndDay = contractEndDay;
        this.endContractReason = endContractReason;
        this.salesOrdersNumber = salesOrdersNumber;
        this.salesOrdersDate = salesOrdersDate;
        this.salesOrdersStatus = salesOrdersStatus;
        this.createdBy = createdBy;
        this.shopName = shopName;
        this.location = location;
        this.SKUName = SKUName;
        this.IMEI = IMEI;
        this.blockUsedHistoryId = i;
        this.normalQuota = normalQuota;
    }

    @NotNull
    public final String component1() {
        return this.buyingStatus;
    }

    @NotNull
    public final String component10() {
        return this.salesOrdersDate;
    }

    @NotNull
    public final String component11() {
        return this.salesOrdersStatus;
    }

    @NotNull
    public final String component12() {
        return this.createdBy;
    }

    @NotNull
    public final String component13() {
        return this.shopName;
    }

    @NotNull
    public final String component14() {
        return this.location;
    }

    @NotNull
    public final String component15() {
        return this.SKUName;
    }

    @NotNull
    public final String component16() {
        return this.IMEI;
    }

    public final int component17() {
        return this.blockUsedHistoryId;
    }

    @NotNull
    public final String component18() {
        return this.normalQuota;
    }

    @NotNull
    public final String component2() {
        return this.customerNumber;
    }

    @NotNull
    public final String component3() {
        return this.subscriberNumber;
    }

    @NotNull
    public final String component4() {
        return this.contractStatus;
    }

    @NotNull
    public final String component5() {
        return this.contractStartDate;
    }

    @NotNull
    public final String component6() {
        return this.contractEndDate;
    }

    @NotNull
    public final String component7() {
        return this.contractEndDay;
    }

    @NotNull
    public final String component8() {
        return this.endContractReason;
    }

    @NotNull
    public final String component9() {
        return this.salesOrdersNumber;
    }

    @NotNull
    public final DeviceSummaryResponse copy(@NotNull String buyingStatus, @NotNull String customerNumber, @NotNull String subscriberNumber, @NotNull String contractStatus, @NotNull String contractStartDate, @NotNull String contractEndDate, @NotNull String contractEndDay, @NotNull String endContractReason, @NotNull String salesOrdersNumber, @NotNull String salesOrdersDate, @NotNull String salesOrdersStatus, @NotNull String createdBy, @NotNull String shopName, @NotNull String location, @NotNull String SKUName, @NotNull String IMEI, int i, @NotNull String normalQuota) {
        Intrinsics.checkNotNullParameter(buyingStatus, "buyingStatus");
        Intrinsics.checkNotNullParameter(customerNumber, "customerNumber");
        Intrinsics.checkNotNullParameter(subscriberNumber, "subscriberNumber");
        Intrinsics.checkNotNullParameter(contractStatus, "contractStatus");
        Intrinsics.checkNotNullParameter(contractStartDate, "contractStartDate");
        Intrinsics.checkNotNullParameter(contractEndDate, "contractEndDate");
        Intrinsics.checkNotNullParameter(contractEndDay, "contractEndDay");
        Intrinsics.checkNotNullParameter(endContractReason, "endContractReason");
        Intrinsics.checkNotNullParameter(salesOrdersNumber, "salesOrdersNumber");
        Intrinsics.checkNotNullParameter(salesOrdersDate, "salesOrdersDate");
        Intrinsics.checkNotNullParameter(salesOrdersStatus, "salesOrdersStatus");
        Intrinsics.checkNotNullParameter(createdBy, "createdBy");
        Intrinsics.checkNotNullParameter(shopName, "shopName");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(SKUName, "SKUName");
        Intrinsics.checkNotNullParameter(IMEI, "IMEI");
        Intrinsics.checkNotNullParameter(normalQuota, "normalQuota");
        return new DeviceSummaryResponse(buyingStatus, customerNumber, subscriberNumber, contractStatus, contractStartDate, contractEndDate, contractEndDay, endContractReason, salesOrdersNumber, salesOrdersDate, salesOrdersStatus, createdBy, shopName, location, SKUName, IMEI, i, normalQuota);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DeviceSummaryResponse) {
            DeviceSummaryResponse deviceSummaryResponse = (DeviceSummaryResponse) obj;
            return Intrinsics.areEqual(this.buyingStatus, deviceSummaryResponse.buyingStatus) && Intrinsics.areEqual(this.customerNumber, deviceSummaryResponse.customerNumber) && Intrinsics.areEqual(this.subscriberNumber, deviceSummaryResponse.subscriberNumber) && Intrinsics.areEqual(this.contractStatus, deviceSummaryResponse.contractStatus) && Intrinsics.areEqual(this.contractStartDate, deviceSummaryResponse.contractStartDate) && Intrinsics.areEqual(this.contractEndDate, deviceSummaryResponse.contractEndDate) && Intrinsics.areEqual(this.contractEndDay, deviceSummaryResponse.contractEndDay) && Intrinsics.areEqual(this.endContractReason, deviceSummaryResponse.endContractReason) && Intrinsics.areEqual(this.salesOrdersNumber, deviceSummaryResponse.salesOrdersNumber) && Intrinsics.areEqual(this.salesOrdersDate, deviceSummaryResponse.salesOrdersDate) && Intrinsics.areEqual(this.salesOrdersStatus, deviceSummaryResponse.salesOrdersStatus) && Intrinsics.areEqual(this.createdBy, deviceSummaryResponse.createdBy) && Intrinsics.areEqual(this.shopName, deviceSummaryResponse.shopName) && Intrinsics.areEqual(this.location, deviceSummaryResponse.location) && Intrinsics.areEqual(this.SKUName, deviceSummaryResponse.SKUName) && Intrinsics.areEqual(this.IMEI, deviceSummaryResponse.IMEI) && this.blockUsedHistoryId == deviceSummaryResponse.blockUsedHistoryId && Intrinsics.areEqual(this.normalQuota, deviceSummaryResponse.normalQuota);
        }
        return false;
    }

    public final int getBlockUsedHistoryId() {
        return this.blockUsedHistoryId;
    }

    @NotNull
    public final String getBuyingStatus() {
        return this.buyingStatus;
    }

    @NotNull
    public final String getContractEndDate() {
        return this.contractEndDate;
    }

    @NotNull
    public final String getContractEndDay() {
        return this.contractEndDay;
    }

    @NotNull
    public final String getContractStartDate() {
        return this.contractStartDate;
    }

    @NotNull
    public final String getContractStatus() {
        return this.contractStatus;
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    public final String getCustomerNumber() {
        return this.customerNumber;
    }

    @NotNull
    public final String getEndContractReason() {
        return this.endContractReason;
    }

    @NotNull
    public final String getIMEI() {
        return this.IMEI;
    }

    @NotNull
    public final String getLocation() {
        return this.location;
    }

    @NotNull
    public final String getNormalQuota() {
        return this.normalQuota;
    }

    @NotNull
    public final String getSKUName() {
        return this.SKUName;
    }

    @NotNull
    public final String getSalesOrdersDate() {
        return this.salesOrdersDate;
    }

    @NotNull
    public final String getSalesOrdersNumber() {
        return this.salesOrdersNumber;
    }

    @NotNull
    public final String getSalesOrdersStatus() {
        return this.salesOrdersStatus;
    }

    @NotNull
    public final String getShopName() {
        return this.shopName;
    }

    @NotNull
    public final String getSubscriberNumber() {
        return this.subscriberNumber;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.buyingStatus.hashCode() * 31) + this.customerNumber.hashCode()) * 31) + this.subscriberNumber.hashCode()) * 31) + this.contractStatus.hashCode()) * 31) + this.contractStartDate.hashCode()) * 31) + this.contractEndDate.hashCode()) * 31) + this.contractEndDay.hashCode()) * 31) + this.endContractReason.hashCode()) * 31) + this.salesOrdersNumber.hashCode()) * 31) + this.salesOrdersDate.hashCode()) * 31) + this.salesOrdersStatus.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.shopName.hashCode()) * 31) + this.location.hashCode()) * 31) + this.SKUName.hashCode()) * 31) + this.IMEI.hashCode()) * 31) + this.blockUsedHistoryId) * 31) + this.normalQuota.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.buyingStatus;
        String str2 = this.customerNumber;
        String str3 = this.subscriberNumber;
        String str4 = this.contractStatus;
        String str5 = this.contractStartDate;
        String str6 = this.contractEndDate;
        String str7 = this.contractEndDay;
        String str8 = this.endContractReason;
        String str9 = this.salesOrdersNumber;
        String str10 = this.salesOrdersDate;
        String str11 = this.salesOrdersStatus;
        String str12 = this.createdBy;
        String str13 = this.shopName;
        String str14 = this.location;
        String str15 = this.SKUName;
        String str16 = this.IMEI;
        int i = this.blockUsedHistoryId;
        String str17 = this.normalQuota;
        return "DeviceSummaryResponse(buyingStatus=" + str + ", customerNumber=" + str2 + ", subscriberNumber=" + str3 + ", contractStatus=" + str4 + ", contractStartDate=" + str5 + ", contractEndDate=" + str6 + ", contractEndDay=" + str7 + ", endContractReason=" + str8 + ", salesOrdersNumber=" + str9 + ", salesOrdersDate=" + str10 + ", salesOrdersStatus=" + str11 + ", createdBy=" + str12 + ", shopName=" + str13 + ", location=" + str14 + ", SKUName=" + str15 + ", IMEI=" + str16 + ", blockUsedHistoryId=" + i + ", normalQuota=" + str17 + ")";
    }

    public /* synthetic */ DeviceSummaryResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i, String str17, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, i, str17);
    }
}
