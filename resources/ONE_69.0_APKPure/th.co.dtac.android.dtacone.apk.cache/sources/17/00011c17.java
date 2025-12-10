package th.p047co.dtac.android.dtacone.model.appOne.prepaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/prepaid/Campaign;", "", "campaignFlag", "", "scab", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/Scab;", "campaignDetail", "Lth/co/dtac/android/dtacone/model/appOne/prepaid/CampaignDetail;", "acceptPDPA", "", "(Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Scab;Lth/co/dtac/android/dtacone/model/appOne/prepaid/CampaignDetail;Ljava/lang/String;)V", "getAcceptPDPA", "()Ljava/lang/String;", "getCampaignDetail", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/CampaignDetail;", "getCampaignFlag", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScab", "()Lth/co/dtac/android/dtacone/model/appOne/prepaid/Scab;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lth/co/dtac/android/dtacone/model/appOne/prepaid/Scab;Lth/co/dtac/android/dtacone/model/appOne/prepaid/CampaignDetail;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/appOne/prepaid/Campaign;", "equals", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.prepaid.Campaign */
/* loaded from: classes8.dex */
public final class Campaign {
    public static final int $stable = 0;
    @SerializedName("acceptPDPA")
    @Nullable
    private final String acceptPDPA;
    @SerializedName("campaignDetail")
    @Nullable
    private final CampaignDetail campaignDetail;
    @SerializedName("campaignFlag")
    @Nullable
    private final Boolean campaignFlag;
    @SerializedName("scab")
    @Nullable
    private final Scab scab;

    public Campaign() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, Boolean bool, Scab scab, CampaignDetail campaignDetail, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = campaign.campaignFlag;
        }
        if ((i & 2) != 0) {
            scab = campaign.scab;
        }
        if ((i & 4) != 0) {
            campaignDetail = campaign.campaignDetail;
        }
        if ((i & 8) != 0) {
            str = campaign.acceptPDPA;
        }
        return campaign.copy(bool, scab, campaignDetail, str);
    }

    @Nullable
    public final Boolean component1() {
        return this.campaignFlag;
    }

    @Nullable
    public final Scab component2() {
        return this.scab;
    }

    @Nullable
    public final CampaignDetail component3() {
        return this.campaignDetail;
    }

    @Nullable
    public final String component4() {
        return this.acceptPDPA;
    }

    @NotNull
    public final Campaign copy(@Nullable Boolean bool, @Nullable Scab scab, @Nullable CampaignDetail campaignDetail, @Nullable String str) {
        return new Campaign(bool, scab, campaignDetail, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.campaignFlag, campaign.campaignFlag) && Intrinsics.areEqual(this.scab, campaign.scab) && Intrinsics.areEqual(this.campaignDetail, campaign.campaignDetail) && Intrinsics.areEqual(this.acceptPDPA, campaign.acceptPDPA);
        }
        return false;
    }

    @Nullable
    public final String getAcceptPDPA() {
        return this.acceptPDPA;
    }

    @Nullable
    public final CampaignDetail getCampaignDetail() {
        return this.campaignDetail;
    }

    @Nullable
    public final Boolean getCampaignFlag() {
        return this.campaignFlag;
    }

    @Nullable
    public final Scab getScab() {
        return this.scab;
    }

    public int hashCode() {
        Boolean bool = this.campaignFlag;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Scab scab = this.scab;
        int hashCode2 = (hashCode + (scab == null ? 0 : scab.hashCode())) * 31;
        CampaignDetail campaignDetail = this.campaignDetail;
        int hashCode3 = (hashCode2 + (campaignDetail == null ? 0 : campaignDetail.hashCode())) * 31;
        String str = this.acceptPDPA;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Boolean bool = this.campaignFlag;
        Scab scab = this.scab;
        CampaignDetail campaignDetail = this.campaignDetail;
        String str = this.acceptPDPA;
        return "Campaign(campaignFlag=" + bool + ", scab=" + scab + ", campaignDetail=" + campaignDetail + ", acceptPDPA=" + str + ")";
    }

    public Campaign(@Nullable Boolean bool, @Nullable Scab scab, @Nullable CampaignDetail campaignDetail, @Nullable String str) {
        this.campaignFlag = bool;
        this.scab = scab;
        this.campaignDetail = campaignDetail;
        this.acceptPDPA = str;
    }

    public /* synthetic */ Campaign(Boolean bool, Scab scab, CampaignDetail campaignDetail, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : scab, (i & 4) != 0 ? null : campaignDetail, (i & 8) != 0 ? null : str);
    }
}