package th.p047co.dtac.android.dtacone.model.appOne.tol.saveOrder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpMarketingCode;", "", "mktOfferCode", "", "mktOfferName", "mktOfferCategoryCode", "campaignInfoList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/saveOrder/SaveOrderFlpMktCampaignInfo;", "vasOfferCode", "vasOfferName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignInfoList", "()Ljava/util/List;", "getMktOfferCategoryCode", "()Ljava/lang/String;", "getMktOfferCode", "getMktOfferName", "getVasOfferCode", "getVasOfferName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.saveOrder.SaveOrderFlpMarketingCode */
/* loaded from: classes8.dex */
public final class SaveOrderFlpMarketingCode {
    public static final int $stable = 8;
    @SerializedName("campaignInfoList")
    @NotNull
    private final List<SaveOrderFlpMktCampaignInfo> campaignInfoList;
    @SerializedName("mktOfferCategoryCode")
    @NotNull
    private final String mktOfferCategoryCode;
    @SerializedName("mktOfferCode")
    @NotNull
    private final String mktOfferCode;
    @SerializedName("mktOfferName")
    @NotNull
    private final String mktOfferName;
    @SerializedName("vasOfferCode")
    @NotNull
    private final String vasOfferCode;
    @SerializedName("vasOfferName")
    @NotNull
    private final String vasOfferName;

    public SaveOrderFlpMarketingCode() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ SaveOrderFlpMarketingCode copy$default(SaveOrderFlpMarketingCode saveOrderFlpMarketingCode, String str, String str2, String str3, List list, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = saveOrderFlpMarketingCode.mktOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = saveOrderFlpMarketingCode.mktOfferName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = saveOrderFlpMarketingCode.mktOfferCategoryCode;
        }
        String str7 = str3;
        List<SaveOrderFlpMktCampaignInfo> list2 = list;
        if ((i & 8) != 0) {
            list2 = saveOrderFlpMarketingCode.campaignInfoList;
        }
        List list3 = list2;
        if ((i & 16) != 0) {
            str4 = saveOrderFlpMarketingCode.vasOfferCode;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = saveOrderFlpMarketingCode.vasOfferName;
        }
        return saveOrderFlpMarketingCode.copy(str, str6, str7, list3, str8, str5);
    }

    @NotNull
    public final String component1() {
        return this.mktOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.mktOfferName;
    }

    @NotNull
    public final String component3() {
        return this.mktOfferCategoryCode;
    }

    @NotNull
    public final List<SaveOrderFlpMktCampaignInfo> component4() {
        return this.campaignInfoList;
    }

    @NotNull
    public final String component5() {
        return this.vasOfferCode;
    }

    @NotNull
    public final String component6() {
        return this.vasOfferName;
    }

    @NotNull
    public final SaveOrderFlpMarketingCode copy(@NotNull String mktOfferCode, @NotNull String mktOfferName, @NotNull String mktOfferCategoryCode, @NotNull List<SaveOrderFlpMktCampaignInfo> campaignInfoList, @NotNull String vasOfferCode, @NotNull String vasOfferName) {
        Intrinsics.checkNotNullParameter(mktOfferCode, "mktOfferCode");
        Intrinsics.checkNotNullParameter(mktOfferName, "mktOfferName");
        Intrinsics.checkNotNullParameter(mktOfferCategoryCode, "mktOfferCategoryCode");
        Intrinsics.checkNotNullParameter(campaignInfoList, "campaignInfoList");
        Intrinsics.checkNotNullParameter(vasOfferCode, "vasOfferCode");
        Intrinsics.checkNotNullParameter(vasOfferName, "vasOfferName");
        return new SaveOrderFlpMarketingCode(mktOfferCode, mktOfferName, mktOfferCategoryCode, campaignInfoList, vasOfferCode, vasOfferName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SaveOrderFlpMarketingCode) {
            SaveOrderFlpMarketingCode saveOrderFlpMarketingCode = (SaveOrderFlpMarketingCode) obj;
            return Intrinsics.areEqual(this.mktOfferCode, saveOrderFlpMarketingCode.mktOfferCode) && Intrinsics.areEqual(this.mktOfferName, saveOrderFlpMarketingCode.mktOfferName) && Intrinsics.areEqual(this.mktOfferCategoryCode, saveOrderFlpMarketingCode.mktOfferCategoryCode) && Intrinsics.areEqual(this.campaignInfoList, saveOrderFlpMarketingCode.campaignInfoList) && Intrinsics.areEqual(this.vasOfferCode, saveOrderFlpMarketingCode.vasOfferCode) && Intrinsics.areEqual(this.vasOfferName, saveOrderFlpMarketingCode.vasOfferName);
        }
        return false;
    }

    @NotNull
    public final List<SaveOrderFlpMktCampaignInfo> getCampaignInfoList() {
        return this.campaignInfoList;
    }

    @NotNull
    public final String getMktOfferCategoryCode() {
        return this.mktOfferCategoryCode;
    }

    @NotNull
    public final String getMktOfferCode() {
        return this.mktOfferCode;
    }

    @NotNull
    public final String getMktOfferName() {
        return this.mktOfferName;
    }

    @NotNull
    public final String getVasOfferCode() {
        return this.vasOfferCode;
    }

    @NotNull
    public final String getVasOfferName() {
        return this.vasOfferName;
    }

    public int hashCode() {
        return (((((((((this.mktOfferCode.hashCode() * 31) + this.mktOfferName.hashCode()) * 31) + this.mktOfferCategoryCode.hashCode()) * 31) + this.campaignInfoList.hashCode()) * 31) + this.vasOfferCode.hashCode()) * 31) + this.vasOfferName.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.mktOfferCode;
        String str2 = this.mktOfferName;
        String str3 = this.mktOfferCategoryCode;
        List<SaveOrderFlpMktCampaignInfo> list = this.campaignInfoList;
        String str4 = this.vasOfferCode;
        String str5 = this.vasOfferName;
        return "SaveOrderFlpMarketingCode(mktOfferCode=" + str + ", mktOfferName=" + str2 + ", mktOfferCategoryCode=" + str3 + ", campaignInfoList=" + list + ", vasOfferCode=" + str4 + ", vasOfferName=" + str5 + ")";
    }

    public SaveOrderFlpMarketingCode(@NotNull String mktOfferCode, @NotNull String mktOfferName, @NotNull String mktOfferCategoryCode, @NotNull List<SaveOrderFlpMktCampaignInfo> campaignInfoList, @NotNull String vasOfferCode, @NotNull String vasOfferName) {
        Intrinsics.checkNotNullParameter(mktOfferCode, "mktOfferCode");
        Intrinsics.checkNotNullParameter(mktOfferName, "mktOfferName");
        Intrinsics.checkNotNullParameter(mktOfferCategoryCode, "mktOfferCategoryCode");
        Intrinsics.checkNotNullParameter(campaignInfoList, "campaignInfoList");
        Intrinsics.checkNotNullParameter(vasOfferCode, "vasOfferCode");
        Intrinsics.checkNotNullParameter(vasOfferName, "vasOfferName");
        this.mktOfferCode = mktOfferCode;
        this.mktOfferName = mktOfferName;
        this.mktOfferCategoryCode = mktOfferCategoryCode;
        this.campaignInfoList = campaignInfoList;
        this.vasOfferCode = vasOfferCode;
        this.vasOfferName = vasOfferName;
    }

    public /* synthetic */ SaveOrderFlpMarketingCode(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }
}
