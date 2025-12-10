package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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
@Metadata(m29143d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0006HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u009b\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0006HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0016¨\u0006="}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "", "campaignSpeedValue", "", "campaignSpeedUnit", "campaignSpeedKbps", "", "campaignCode", "campaignName", "campaignCategoryCode", "campaignEntryFeeCode", "campaignEntryFeeName", "campaignEntryFeeValue", "campaignEntryFeeCategoryCode", "campaignContractList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignContract;", "marketingCode", "marketingName", "marketingCategoryCode", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCategoryCode", "()Ljava/lang/String;", "getCampaignCode", "campaignContractFilter", "getCampaignContractFilter", "()Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignContract;", "getCampaignContractList", "()Ljava/util/List;", "getCampaignEntryFeeCategoryCode", "getCampaignEntryFeeCode", "getCampaignEntryFeeName", "getCampaignEntryFeeValue", "()I", "getCampaignName", "getCampaignSpeedKbps", "getCampaignSpeedUnit", "getCampaignSpeedValue", "getMarketingCategoryCode", "getMarketingCode", "getMarketingName", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nCampaignResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CampaignResponse.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,281:1\n288#2,2:282\n*S KotlinDebug\n*F\n+ 1 CampaignResponse.kt\nth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign\n*L\n179#1:282,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.Campaign */
/* loaded from: classes8.dex */
public final class Campaign {
    public static final int $stable = 8;
    @SerializedName("campaignCategoryCode")
    @NotNull
    private final String campaignCategoryCode;
    @SerializedName("campaignCode")
    @NotNull
    private final String campaignCode;
    @SerializedName("campaignContractList")
    @NotNull
    private final List<CampaignContract> campaignContractList;
    @SerializedName("campaignEntryFeeCategoryCode")
    @NotNull
    private final String campaignEntryFeeCategoryCode;
    @SerializedName("campaignEntryFeeCode")
    @NotNull
    private final String campaignEntryFeeCode;
    @SerializedName("campaignEntryFeeName")
    @NotNull
    private final String campaignEntryFeeName;
    @SerializedName("campaignEntryFeeValue")
    private final int campaignEntryFeeValue;
    @SerializedName("campaignName")
    @NotNull
    private final String campaignName;
    @SerializedName("campaignSpeedKbps")
    private final int campaignSpeedKbps;
    @SerializedName("campaignSpeedUnit")
    @NotNull
    private final String campaignSpeedUnit;
    @SerializedName("campaignSpeedValue")
    @NotNull
    private final String campaignSpeedValue;
    @SerializedName("marketingCategoryCode")
    @NotNull
    private final String marketingCategoryCode;
    @SerializedName("marketingCode")
    @NotNull
    private final String marketingCode;
    @SerializedName("marketingName")
    @NotNull
    private final String marketingName;

    public Campaign() {
        this(null, null, 0, null, null, null, null, null, 0, null, null, null, null, null, 16383, null);
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
    public final Campaign copy(@NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i, @NotNull String campaignCode, @NotNull String campaignName, @NotNull String campaignCategoryCode, @NotNull String campaignEntryFeeCode, @NotNull String campaignEntryFeeName, int i2, @NotNull String campaignEntryFeeCategoryCode, @NotNull List<CampaignContract> campaignContractList, @NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingCategoryCode) {
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
        return new Campaign(campaignSpeedValue, campaignSpeedUnit, i, campaignCode, campaignName, campaignCategoryCode, campaignEntryFeeCode, campaignEntryFeeName, i2, campaignEntryFeeCategoryCode, campaignContractList, marketingCode, marketingName, marketingCategoryCode);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.campaignSpeedValue, campaign.campaignSpeedValue) && Intrinsics.areEqual(this.campaignSpeedUnit, campaign.campaignSpeedUnit) && this.campaignSpeedKbps == campaign.campaignSpeedKbps && Intrinsics.areEqual(this.campaignCode, campaign.campaignCode) && Intrinsics.areEqual(this.campaignName, campaign.campaignName) && Intrinsics.areEqual(this.campaignCategoryCode, campaign.campaignCategoryCode) && Intrinsics.areEqual(this.campaignEntryFeeCode, campaign.campaignEntryFeeCode) && Intrinsics.areEqual(this.campaignEntryFeeName, campaign.campaignEntryFeeName) && this.campaignEntryFeeValue == campaign.campaignEntryFeeValue && Intrinsics.areEqual(this.campaignEntryFeeCategoryCode, campaign.campaignEntryFeeCategoryCode) && Intrinsics.areEqual(this.campaignContractList, campaign.campaignContractList) && Intrinsics.areEqual(this.marketingCode, campaign.marketingCode) && Intrinsics.areEqual(this.marketingName, campaign.marketingName) && Intrinsics.areEqual(this.marketingCategoryCode, campaign.marketingCategoryCode);
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

    public int hashCode() {
        return (((((((((((((((((((((((((this.campaignSpeedValue.hashCode() * 31) + this.campaignSpeedUnit.hashCode()) * 31) + this.campaignSpeedKbps) * 31) + this.campaignCode.hashCode()) * 31) + this.campaignName.hashCode()) * 31) + this.campaignCategoryCode.hashCode()) * 31) + this.campaignEntryFeeCode.hashCode()) * 31) + this.campaignEntryFeeName.hashCode()) * 31) + this.campaignEntryFeeValue) * 31) + this.campaignEntryFeeCategoryCode.hashCode()) * 31) + this.campaignContractList.hashCode()) * 31) + this.marketingCode.hashCode()) * 31) + this.marketingName.hashCode()) * 31) + this.marketingCategoryCode.hashCode();
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
        return "Campaign(campaignSpeedValue=" + str + ", campaignSpeedUnit=" + str2 + ", campaignSpeedKbps=" + i + ", campaignCode=" + str3 + ", campaignName=" + str4 + ", campaignCategoryCode=" + str5 + ", campaignEntryFeeCode=" + str6 + ", campaignEntryFeeName=" + str7 + ", campaignEntryFeeValue=" + i2 + ", campaignEntryFeeCategoryCode=" + str8 + ", campaignContractList=" + list + ", marketingCode=" + str9 + ", marketingName=" + str10 + ", marketingCategoryCode=" + str11 + ")";
    }

    public Campaign(@NotNull String campaignSpeedValue, @NotNull String campaignSpeedUnit, int i, @NotNull String campaignCode, @NotNull String campaignName, @NotNull String campaignCategoryCode, @NotNull String campaignEntryFeeCode, @NotNull String campaignEntryFeeName, int i2, @NotNull String campaignEntryFeeCategoryCode, @NotNull List<CampaignContract> campaignContractList, @NotNull String marketingCode, @NotNull String marketingName, @NotNull String marketingCategoryCode) {
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
    }

    public /* synthetic */ Campaign(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, int i2, String str8, List list, String str9, String str10, String str11, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) == 0 ? i2 : 0, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 2048) != 0 ? "" : str9, (i3 & 4096) != 0 ? "" : str10, (i3 & 8192) == 0 ? str11 : "");
    }
}