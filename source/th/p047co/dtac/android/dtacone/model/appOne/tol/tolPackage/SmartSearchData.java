package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006¢\u0006\u0002\u0010\u0019J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003JÍ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0006HÆ\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010J\u001a\u00020\u0006HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010&R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b.\u0010&R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001bR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001b¨\u0006L"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/SmartSearchData;", "", "campaignSpeedValue", "", "campaignSpeedUnit", "campaignSpeedKbps", "", "campaignCode", "campaignName", "campaignCategoryCode", "campaignEntryFeeCode", "campaignEntryFeeName", "campaignEntryFeeValue", "campaignEntryFeeCategoryCode", "campaignContractList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignContract;", "marketingCode", "marketingName", "marketingCategoryCode", "marketingSpeedUpValue", "marketingSpeedDownValue", "marketingSpeedUpUnit", "marketingSpeedDownUnit", "marketingRecurringChargeAmount", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getCampaignCategoryCode", "()Ljava/lang/String;", "getCampaignCode", "campaignContractFilter", "getCampaignContractFilter", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignContract;", "getCampaignContractList", "()Ljava/util/List;", "getCampaignEntryFeeCategoryCode", "getCampaignEntryFeeCode", "getCampaignEntryFeeName", "getCampaignEntryFeeValue", "()I", "getCampaignName", "getCampaignSpeedKbps", "getCampaignSpeedUnit", "getCampaignSpeedValue", "getMarketingCategoryCode", "getMarketingCode", "getMarketingName", "getMarketingRecurringChargeAmount", "getMarketingSpeedDownUnit", "getMarketingSpeedDownValue", "getMarketingSpeedUpUnit", "getMarketingSpeedUpValue", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSmartSearchData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmartSearchData.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/SmartSearchData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,27:1\n288#2,2:28\n*S KotlinDebug\n*F\n+ 1 SmartSearchData.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/SmartSearchData\n*L\n26#1:28,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.SmartSearchData */
/* loaded from: classes8.dex */
public final class SmartSearchData {
    public static final int $stable = 8;
    @NotNull
    private final String campaignCategoryCode;
    @NotNull
    private final String campaignCode;
    @NotNull
    private final List<CampaignContract> campaignContractList;
    @NotNull
    private final String campaignEntryFeeCategoryCode;
    @NotNull
    private final String campaignEntryFeeCode;
    @NotNull
    private final String campaignEntryFeeName;
    private final int campaignEntryFeeValue;
    @NotNull
    private final String campaignName;
    private final int campaignSpeedKbps;
    @NotNull
    private final String campaignSpeedUnit;
    @NotNull
    private final String campaignSpeedValue;
    @NotNull
    private final String marketingCategoryCode;
    @NotNull
    private final String marketingCode;
    @NotNull
    private final String marketingName;
    private final int marketingRecurringChargeAmount;
    @NotNull
    private final String marketingSpeedDownUnit;
    @NotNull
    private final String marketingSpeedDownValue;
    @NotNull
    private final String marketingSpeedUpUnit;
    @NotNull
    private final String marketingSpeedUpValue;

    public SmartSearchData() {
        this(null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, 0, 524287, null);
    }

    @NotNull
    public final String component1() {
        return this.campaignSpeedValue;
    }

    @NotNull
    public final String component10() {
        return this.campaignEntryFeeCategoryCode;
    }

    @NotNull
    public final List<CampaignContract> component11() {
        return this.campaignContractList;
    }

    @NotNull
    public final String component12() {
        return this.marketingCode;
    }

    @NotNull
    public final String component13() {
        return this.marketingName;
    }

    @NotNull
    public final String component14() {
        return this.marketingCategoryCode;
    }

    @NotNull
    public final String component15() {
        return this.marketingSpeedUpValue;
    }

    @NotNull
    public final String component16() {
        return this.marketingSpeedDownValue;
    }

    @NotNull
    public final String component17() {
        return this.marketingSpeedUpUnit;
    }

    @NotNull
    public final String component18() {
        return this.marketingSpeedDownUnit;
    }

    public final int component19() {
        return this.marketingRecurringChargeAmount;
    }

    @NotNull
    public final String component2() {
        return this.campaignSpeedUnit;
    }

    public final int component3() {
        return this.campaignSpeedKbps;
    }

    @NotNull
    public final String component4() {
        return this.campaignCode;
    }

    @NotNull
    public final String component5() {
        return this.campaignName;
    }

    @NotNull
    public final String component6() {
        return this.campaignCategoryCode;
    }

    @NotNull
    public final String component7() {
        return this.campaignEntryFeeCode;
    }

    @NotNull
    public final String component8() {
        return this.campaignEntryFeeName;
    }

    public final int component9() {
        return this.campaignEntryFeeValue;
    }

    @NotNull
    public final SmartSearchData copy(@NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i, @NotNull String campaignCode, @NotNull String campaignName, @NotNull String campaignCategoryCode, @NotNull String campaignEntryFeeCode, @NotNull String campaignEntryFeeName, int i2, @NotNull String campaignEntryFeeCategoryCode, @NotNull List<CampaignContract> campaignContractList, @NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingCategoryCode, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, int i3) {
        Intrinsics.checkNotNullParameter(campaignSpeedValue, "campaignSpeedValue");
        Intrinsics.checkNotNullParameter(campaignSpeedUnit, "campaignSpeedUnit");
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(campaignCategoryCode, "campaignCategoryCode");
        Intrinsics.checkNotNullParameter(campaignEntryFeeCode, "campaignEntryFeeCode");
        Intrinsics.checkNotNullParameter(campaignEntryFeeName, "campaignEntryFeeName");
        Intrinsics.checkNotNullParameter(campaignEntryFeeCategoryCode, "campaignEntryFeeCategoryCode");
        Intrinsics.checkNotNullParameter(campaignContractList, "campaignContractList");
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingCategoryCode, "marketingCategoryCode");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        return new SmartSearchData(campaignSpeedValue, campaignSpeedUnit, i, campaignCode, campaignName, campaignCategoryCode, campaignEntryFeeCode, campaignEntryFeeName, i2, campaignEntryFeeCategoryCode, campaignContractList, marketingCode, marketingName, marketingCategoryCode, marketingSpeedUpValue, marketingSpeedDownValue, marketingSpeedUpUnit, marketingSpeedDownUnit, i3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SmartSearchData) {
            SmartSearchData smartSearchData = (SmartSearchData) obj;
            return Intrinsics.areEqual(this.campaignSpeedValue, smartSearchData.campaignSpeedValue) && Intrinsics.areEqual(this.campaignSpeedUnit, smartSearchData.campaignSpeedUnit) && this.campaignSpeedKbps == smartSearchData.campaignSpeedKbps && Intrinsics.areEqual(this.campaignCode, smartSearchData.campaignCode) && Intrinsics.areEqual(this.campaignName, smartSearchData.campaignName) && Intrinsics.areEqual(this.campaignCategoryCode, smartSearchData.campaignCategoryCode) && Intrinsics.areEqual(this.campaignEntryFeeCode, smartSearchData.campaignEntryFeeCode) && Intrinsics.areEqual(this.campaignEntryFeeName, smartSearchData.campaignEntryFeeName) && this.campaignEntryFeeValue == smartSearchData.campaignEntryFeeValue && Intrinsics.areEqual(this.campaignEntryFeeCategoryCode, smartSearchData.campaignEntryFeeCategoryCode) && Intrinsics.areEqual(this.campaignContractList, smartSearchData.campaignContractList) && Intrinsics.areEqual(this.marketingCode, smartSearchData.marketingCode) && Intrinsics.areEqual(this.marketingName, smartSearchData.marketingName) && Intrinsics.areEqual(this.marketingCategoryCode, smartSearchData.marketingCategoryCode) && Intrinsics.areEqual(this.marketingSpeedUpValue, smartSearchData.marketingSpeedUpValue) && Intrinsics.areEqual(this.marketingSpeedDownValue, smartSearchData.marketingSpeedDownValue) && Intrinsics.areEqual(this.marketingSpeedUpUnit, smartSearchData.marketingSpeedUpUnit) && Intrinsics.areEqual(this.marketingSpeedDownUnit, smartSearchData.marketingSpeedDownUnit) && this.marketingRecurringChargeAmount == smartSearchData.marketingRecurringChargeAmount;
        }
        return false;
    }

    @NotNull
    public final String getCampaignCategoryCode() {
        return this.campaignCategoryCode;
    }

    @NotNull
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final CampaignContract getCampaignContractFilter() {
        Object obj;
        Iterator<T> it = this.campaignContractList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((CampaignContract) obj).getCampaignContractType(), "INSTALLATION")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (CampaignContract) obj;
    }

    @NotNull
    public final List<CampaignContract> getCampaignContractList() {
        return this.campaignContractList;
    }

    @NotNull
    public final String getCampaignEntryFeeCategoryCode() {
        return this.campaignEntryFeeCategoryCode;
    }

    @NotNull
    public final String getCampaignEntryFeeCode() {
        return this.campaignEntryFeeCode;
    }

    @NotNull
    public final String getCampaignEntryFeeName() {
        return this.campaignEntryFeeName;
    }

    public final int getCampaignEntryFeeValue() {
        return this.campaignEntryFeeValue;
    }

    @NotNull
    public final String getCampaignName() {
        return this.campaignName;
    }

    public final int getCampaignSpeedKbps() {
        return this.campaignSpeedKbps;
    }

    @NotNull
    public final String getCampaignSpeedUnit() {
        return this.campaignSpeedUnit;
    }

    @NotNull
    public final String getCampaignSpeedValue() {
        return this.campaignSpeedValue;
    }

    @NotNull
    public final String getMarketingCategoryCode() {
        return this.marketingCategoryCode;
    }

    @NotNull
    public final String getMarketingCode() {
        return this.marketingCode;
    }

    @NotNull
    public final String getMarketingName() {
        return this.marketingName;
    }

    public final int getMarketingRecurringChargeAmount() {
        return this.marketingRecurringChargeAmount;
    }

    @NotNull
    public final String getMarketingSpeedDownUnit() {
        return this.marketingSpeedDownUnit;
    }

    @NotNull
    public final String getMarketingSpeedDownValue() {
        return this.marketingSpeedDownValue;
    }

    @NotNull
    public final String getMarketingSpeedUpUnit() {
        return this.marketingSpeedUpUnit;
    }

    @NotNull
    public final String getMarketingSpeedUpValue() {
        return this.marketingSpeedUpValue;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.campaignSpeedValue.hashCode() * 31) + this.campaignSpeedUnit.hashCode()) * 31) + this.campaignSpeedKbps) * 31) + this.campaignCode.hashCode()) * 31) + this.campaignName.hashCode()) * 31) + this.campaignCategoryCode.hashCode()) * 31) + this.campaignEntryFeeCode.hashCode()) * 31) + this.campaignEntryFeeName.hashCode()) * 31) + this.campaignEntryFeeValue) * 31) + this.campaignEntryFeeCategoryCode.hashCode()) * 31) + this.campaignContractList.hashCode()) * 31) + this.marketingCode.hashCode()) * 31) + this.marketingName.hashCode()) * 31) + this.marketingCategoryCode.hashCode()) * 31) + this.marketingSpeedUpValue.hashCode()) * 31) + this.marketingSpeedDownValue.hashCode()) * 31) + this.marketingSpeedUpUnit.hashCode()) * 31) + this.marketingSpeedDownUnit.hashCode()) * 31) + this.marketingRecurringChargeAmount;
    }

    @NotNull
    public String toString() {
        String str = this.campaignSpeedValue;
        String str2 = this.campaignSpeedUnit;
        int i = this.campaignSpeedKbps;
        String str3 = this.campaignCode;
        String str4 = this.campaignName;
        String str5 = this.campaignCategoryCode;
        String str6 = this.campaignEntryFeeCode;
        String str7 = this.campaignEntryFeeName;
        int i2 = this.campaignEntryFeeValue;
        String str8 = this.campaignEntryFeeCategoryCode;
        List<CampaignContract> list = this.campaignContractList;
        String str9 = this.marketingCode;
        String str10 = this.marketingName;
        String str11 = this.marketingCategoryCode;
        String str12 = this.marketingSpeedUpValue;
        String str13 = this.marketingSpeedDownValue;
        String str14 = this.marketingSpeedUpUnit;
        String str15 = this.marketingSpeedDownUnit;
        int i3 = this.marketingRecurringChargeAmount;
        return "SmartSearchData(campaignSpeedValue=" + str + ", campaignSpeedUnit=" + str2 + ", campaignSpeedKbps=" + i + ", campaignCode=" + str3 + ", campaignName=" + str4 + ", campaignCategoryCode=" + str5 + ", campaignEntryFeeCode=" + str6 + ", campaignEntryFeeName=" + str7 + ", campaignEntryFeeValue=" + i2 + ", campaignEntryFeeCategoryCode=" + str8 + ", campaignContractList=" + list + ", marketingCode=" + str9 + ", marketingName=" + str10 + ", marketingCategoryCode=" + str11 + ", marketingSpeedUpValue=" + str12 + ", marketingSpeedDownValue=" + str13 + ", marketingSpeedUpUnit=" + str14 + ", marketingSpeedDownUnit=" + str15 + ", marketingRecurringChargeAmount=" + i3 + ")";
    }

    public SmartSearchData(@NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i, @NotNull String campaignCode, @NotNull String campaignName, @NotNull String campaignCategoryCode, @NotNull String campaignEntryFeeCode, @NotNull String campaignEntryFeeName, int i2, @NotNull String campaignEntryFeeCategoryCode, @NotNull List<CampaignContract> campaignContractList, @NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingCategoryCode, @NotNull String marketingSpeedUpValue, @NotNull String marketingSpeedDownValue, @NotNull String marketingSpeedUpUnit, @NotNull String marketingSpeedDownUnit, int i3) {
        Intrinsics.checkNotNullParameter(campaignSpeedValue, "campaignSpeedValue");
        Intrinsics.checkNotNullParameter(campaignSpeedUnit, "campaignSpeedUnit");
        Intrinsics.checkNotNullParameter(campaignCode, "campaignCode");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(campaignCategoryCode, "campaignCategoryCode");
        Intrinsics.checkNotNullParameter(campaignEntryFeeCode, "campaignEntryFeeCode");
        Intrinsics.checkNotNullParameter(campaignEntryFeeName, "campaignEntryFeeName");
        Intrinsics.checkNotNullParameter(campaignEntryFeeCategoryCode, "campaignEntryFeeCategoryCode");
        Intrinsics.checkNotNullParameter(campaignContractList, "campaignContractList");
        Intrinsics.checkNotNullParameter(marketingCode, "marketingCode");
        Intrinsics.checkNotNullParameter(marketingName, "marketingName");
        Intrinsics.checkNotNullParameter(marketingCategoryCode, "marketingCategoryCode");
        Intrinsics.checkNotNullParameter(marketingSpeedUpValue, "marketingSpeedUpValue");
        Intrinsics.checkNotNullParameter(marketingSpeedDownValue, "marketingSpeedDownValue");
        Intrinsics.checkNotNullParameter(marketingSpeedUpUnit, "marketingSpeedUpUnit");
        Intrinsics.checkNotNullParameter(marketingSpeedDownUnit, "marketingSpeedDownUnit");
        this.campaignSpeedValue = campaignSpeedValue;
        this.campaignSpeedUnit = campaignSpeedUnit;
        this.campaignSpeedKbps = i;
        this.campaignCode = campaignCode;
        this.campaignName = campaignName;
        this.campaignCategoryCode = campaignCategoryCode;
        this.campaignEntryFeeCode = campaignEntryFeeCode;
        this.campaignEntryFeeName = campaignEntryFeeName;
        this.campaignEntryFeeValue = i2;
        this.campaignEntryFeeCategoryCode = campaignEntryFeeCategoryCode;
        this.campaignContractList = campaignContractList;
        this.marketingCode = marketingCode;
        this.marketingName = marketingName;
        this.marketingCategoryCode = marketingCategoryCode;
        this.marketingSpeedUpValue = marketingSpeedUpValue;
        this.marketingSpeedDownValue = marketingSpeedDownValue;
        this.marketingSpeedUpUnit = marketingSpeedUpUnit;
        this.marketingSpeedDownUnit = marketingSpeedDownUnit;
        this.marketingRecurringChargeAmount = i3;
    }

    public /* synthetic */ SmartSearchData(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2, String str8, List list, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? 0 : i2, (i4 & 512) != 0 ? "" : str8, (i4 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 2048) != 0 ? "" : str9, (i4 & 4096) != 0 ? "" : str10, (i4 & 8192) != 0 ? "" : str11, (i4 & 16384) != 0 ? "" : str12, (i4 & 32768) != 0 ? "" : str13, (i4 & 65536) != 0 ? "" : str14, (i4 & 131072) != 0 ? "" : str15, (i4 & 262144) != 0 ? 0 : i3);
    }
}
