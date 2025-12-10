package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/Campaign;", "", "campaignType", "", "campaignService", "campaignCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCode", "()Ljava/lang/String;", "getCampaignService", "getCampaignType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.Campaign */
/* loaded from: classes8.dex */
public final class Campaign {
    public static final int $stable = 0;
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("campaignService")
    @Nullable
    private final String campaignService;
    @SerializedName("campaignType")
    @Nullable
    private final String campaignType;

    public Campaign() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaign.campaignType;
        }
        if ((i & 2) != 0) {
            str2 = campaign.campaignService;
        }
        if ((i & 4) != 0) {
            str3 = campaign.campaignCode;
        }
        return campaign.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.campaignType;
    }

    @Nullable
    public final String component2() {
        return this.campaignService;
    }

    @Nullable
    public final String component3() {
        return this.campaignCode;
    }

    @NotNull
    public final Campaign copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new Campaign(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.campaignType, campaign.campaignType) && Intrinsics.areEqual(this.campaignService, campaign.campaignService) && Intrinsics.areEqual(this.campaignCode, campaign.campaignCode);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignService() {
        return this.campaignService;
    }

    @Nullable
    public final String getCampaignType() {
        return this.campaignType;
    }

    public int hashCode() {
        String str = this.campaignType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignService;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignCode;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.campaignType;
        String str2 = this.campaignService;
        String str3 = this.campaignCode;
        return "Campaign(campaignType=" + str + ", campaignService=" + str2 + ", campaignCode=" + str3 + ")";
    }

    public Campaign(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.campaignType = str;
        this.campaignService = str2;
        this.campaignCode = str3;
    }

    public /* synthetic */ Campaign(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}