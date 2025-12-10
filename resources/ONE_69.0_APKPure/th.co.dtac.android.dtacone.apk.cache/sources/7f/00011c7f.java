package th.p047co.dtac.android.dtacone.model.appOne.tol.tolPackage;

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
@Metadata(m29143d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J4\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignData;", "", "companyCode", "", "campaignCount", "", "campaignList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/Campaign;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)V", "getCampaignCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCampaignList", "()Ljava/util/List;", "getCompanyCode", "()Ljava/lang/String;", "uniqueSortedSpeedList", "Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/UniqueSortedSpeedData;", "getUniqueSortedSpeedList", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;)Lth/co/dtac/android/dtacone/model/appOne/tol/tolPackage/CampaignData;", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.tolPackage.CampaignData */
/* loaded from: classes8.dex */
public final class CampaignData {
    public static final int $stable = 8;
    @SerializedName("campaignCount")
    @Nullable
    private final Integer campaignCount;
    @SerializedName("campaignList")
    @NotNull
    private final List<Campaign> campaignList;
    @SerializedName("companyCode")
    @NotNull
    private final String companyCode;

    public CampaignData() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignData copy$default(CampaignData campaignData, String str, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignData.companyCode;
        }
        if ((i & 2) != 0) {
            num = campaignData.campaignCount;
        }
        if ((i & 4) != 0) {
            list = campaignData.campaignList;
        }
        return campaignData.copy(str, num, list);
    }

    @NotNull
    public final String component1() {
        return this.companyCode;
    }

    @Nullable
    public final Integer component2() {
        return this.campaignCount;
    }

    @NotNull
    public final List<Campaign> component3() {
        return this.campaignList;
    }

    @NotNull
    public final CampaignData copy(@NotNull String companyCode, @Nullable Integer num, @NotNull List<Campaign> campaignList) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(campaignList, "campaignList");
        return new CampaignData(companyCode, num, campaignList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignData) {
            CampaignData campaignData = (CampaignData) obj;
            return Intrinsics.areEqual(this.companyCode, campaignData.companyCode) && Intrinsics.areEqual(this.campaignCount, campaignData.campaignCount) && Intrinsics.areEqual(this.campaignList, campaignData.campaignList);
        }
        return false;
    }

    @Nullable
    public final Integer getCampaignCount() {
        return this.campaignCount;
    }

    @NotNull
    public final List<Campaign> getCampaignList() {
        return this.campaignList;
    }

    @NotNull
    public final String getCompanyCode() {
        return this.companyCode;
    }

    @NotNull
    public final List<UniqueSortedSpeedData> getUniqueSortedSpeedList() {
        return CampaignResponseKt.getUniqueSortedSpeeds(this.campaignList);
    }

    public int hashCode() {
        int hashCode = this.companyCode.hashCode() * 31;
        Integer num = this.campaignCount;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.campaignList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.companyCode;
        Integer num = this.campaignCount;
        List<Campaign> list = this.campaignList;
        return "CampaignData(companyCode=" + str + ", campaignCount=" + num + ", campaignList=" + list + ")";
    }

    public CampaignData(@NotNull String companyCode, @Nullable Integer num, @NotNull List<Campaign> campaignList) {
        Intrinsics.checkNotNullParameter(companyCode, "companyCode");
        Intrinsics.checkNotNullParameter(campaignList, "campaignList");
        this.companyCode = companyCode;
        this.campaignCount = num;
        this.campaignList = campaignList;
    }

    public /* synthetic */ CampaignData(String str, Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}