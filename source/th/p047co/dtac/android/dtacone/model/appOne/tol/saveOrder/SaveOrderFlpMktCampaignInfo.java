package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpMktCampaignInfo;", "", "targetOfferCode", "", "targetOfferName", "targetOfferCategoryCode", "targetOfferType", "recurringChargeAmount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRecurringChargeAmount", "()Ljava/lang/String;", "getTargetOfferCategoryCode", "getTargetOfferCode", "getTargetOfferName", "getTargetOfferType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderFlpMktCampaignInfo */
/* loaded from: classes8.dex */
public final class SaveOrderFlpMktCampaignInfo {
    public static final int $stable = 0;
    @SerializedName("recurringChargeAmount")
    @NotNull
    private final String recurringChargeAmount;
    @SerializedName("targetOfferCategoryCode")
    @NotNull
    private final String targetOfferCategoryCode;
    @SerializedName("targetOfferCode")
    @NotNull
    private final String targetOfferCode;
    @SerializedName("targetOfferName")
    @NotNull
    private final String targetOfferName;
    @SerializedName("targetOfferType")
    @NotNull
    private final String targetOfferType;

    public SaveOrderFlpMktCampaignInfo() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ SaveOrderFlpMktCampaignInfo copy$default(SaveOrderFlpMktCampaignInfo saveOrderFlpMktCampaignInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderFlpMktCampaignInfo.targetOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = saveOrderFlpMktCampaignInfo.targetOfferName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = saveOrderFlpMktCampaignInfo.targetOfferCategoryCode;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = saveOrderFlpMktCampaignInfo.targetOfferType;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = saveOrderFlpMktCampaignInfo.recurringChargeAmount;
        }
        return saveOrderFlpMktCampaignInfo.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.targetOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.targetOfferName;
    }

    @NotNull
    public final String component3() {
        return this.targetOfferCategoryCode;
    }

    @NotNull
    public final String component4() {
        return this.targetOfferType;
    }

    @NotNull
    public final String component5() {
        return this.recurringChargeAmount;
    }

    @NotNull
    public final SaveOrderFlpMktCampaignInfo copy(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferCategoryCode, @NotNull String targetOfferType, @NotNull String recurringChargeAmount) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferCategoryCode, "targetOfferCategoryCode");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(recurringChargeAmount, "recurringChargeAmount");
        return new SaveOrderFlpMktCampaignInfo(targetOfferCode, targetOfferName, targetOfferCategoryCode, targetOfferType, recurringChargeAmount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderFlpMktCampaignInfo) {
            SaveOrderFlpMktCampaignInfo saveOrderFlpMktCampaignInfo = (SaveOrderFlpMktCampaignInfo) obj;
            return Intrinsics.areEqual(this.targetOfferCode, saveOrderFlpMktCampaignInfo.targetOfferCode) && Intrinsics.areEqual(this.targetOfferName, saveOrderFlpMktCampaignInfo.targetOfferName) && Intrinsics.areEqual(this.targetOfferCategoryCode, saveOrderFlpMktCampaignInfo.targetOfferCategoryCode) && Intrinsics.areEqual(this.targetOfferType, saveOrderFlpMktCampaignInfo.targetOfferType) && Intrinsics.areEqual(this.recurringChargeAmount, saveOrderFlpMktCampaignInfo.recurringChargeAmount);
        }
        return false;
    }

    @NotNull
    public final String getRecurringChargeAmount() {
        return this.recurringChargeAmount;
    }

    @NotNull
    public final String getTargetOfferCategoryCode() {
        return this.targetOfferCategoryCode;
    }

    @NotNull
    public final String getTargetOfferCode() {
        return this.targetOfferCode;
    }

    @NotNull
    public final String getTargetOfferName() {
        return this.targetOfferName;
    }

    @NotNull
    public final String getTargetOfferType() {
        return this.targetOfferType;
    }

    public int hashCode() {
        return (((((((this.targetOfferCode.hashCode() * 31) + this.targetOfferName.hashCode()) * 31) + this.targetOfferCategoryCode.hashCode()) * 31) + this.targetOfferType.hashCode()) * 31) + this.recurringChargeAmount.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.targetOfferCode;
        String str2 = this.targetOfferName;
        String str3 = this.targetOfferCategoryCode;
        String str4 = this.targetOfferType;
        String str5 = this.recurringChargeAmount;
        return "SaveOrderFlpMktCampaignInfo(targetOfferCode=" + str + ", targetOfferName=" + str2 + ", targetOfferCategoryCode=" + str3 + ", targetOfferType=" + str4 + ", recurringChargeAmount=" + str5 + ")";
    }

    public SaveOrderFlpMktCampaignInfo(@NotNull String targetOfferCode, @NotNull String targetOfferName, @NotNull String targetOfferCategoryCode, @NotNull String targetOfferType, @NotNull String recurringChargeAmount) {
        Intrinsics.checkNotNullParameter(targetOfferCode, "targetOfferCode");
        Intrinsics.checkNotNullParameter(targetOfferName, "targetOfferName");
        Intrinsics.checkNotNullParameter(targetOfferCategoryCode, "targetOfferCategoryCode");
        Intrinsics.checkNotNullParameter(targetOfferType, "targetOfferType");
        Intrinsics.checkNotNullParameter(recurringChargeAmount, "recurringChargeAmount");
        this.targetOfferCode = targetOfferCode;
        this.targetOfferName = targetOfferName;
        this.targetOfferCategoryCode = targetOfferCategoryCode;
        this.targetOfferType = targetOfferType;
        this.recurringChargeAmount = recurringChargeAmount;
    }

    public /* synthetic */ SaveOrderFlpMktCampaignInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
