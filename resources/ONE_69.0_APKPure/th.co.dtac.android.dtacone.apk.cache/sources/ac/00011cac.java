package th.p047co.dtac.android.dtacone.model.blacklist;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.withDevice.validateImei.response.CampaignItem;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/blacklist/CampaignBlacklistWithDeviceResponse;", "", "deviceType", "", "campaign", "", "Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/CampaignItem;", "(Ljava/lang/String;Ljava/util/List;)V", "getCampaign", "()Ljava/util/List;", "getDeviceType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.blacklist.CampaignBlacklistWithDeviceResponse */
/* loaded from: classes8.dex */
public final class CampaignBlacklistWithDeviceResponse {
    public static final int $stable = 8;
    @SerializedName("campaign")
    @NotNull
    private final List<CampaignItem> campaign;
    @SerializedName("deviceType")
    @NotNull
    private final String deviceType;

    public CampaignBlacklistWithDeviceResponse(@NotNull String deviceType, @NotNull List<CampaignItem> campaign) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        this.deviceType = deviceType;
        this.campaign = campaign;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignBlacklistWithDeviceResponse copy$default(CampaignBlacklistWithDeviceResponse campaignBlacklistWithDeviceResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignBlacklistWithDeviceResponse.deviceType;
        }
        if ((i & 2) != 0) {
            list = campaignBlacklistWithDeviceResponse.campaign;
        }
        return campaignBlacklistWithDeviceResponse.copy(str, list);
    }

    @NotNull
    public final String component1() {
        return this.deviceType;
    }

    @NotNull
    public final List<CampaignItem> component2() {
        return this.campaign;
    }

    @NotNull
    public final CampaignBlacklistWithDeviceResponse copy(@NotNull String deviceType, @NotNull List<CampaignItem> campaign) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Intrinsics.checkNotNullParameter(campaign, "campaign");
        return new CampaignBlacklistWithDeviceResponse(deviceType, campaign);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignBlacklistWithDeviceResponse) {
            CampaignBlacklistWithDeviceResponse campaignBlacklistWithDeviceResponse = (CampaignBlacklistWithDeviceResponse) obj;
            return Intrinsics.areEqual(this.deviceType, campaignBlacklistWithDeviceResponse.deviceType) && Intrinsics.areEqual(this.campaign, campaignBlacklistWithDeviceResponse.campaign);
        }
        return false;
    }

    @NotNull
    public final List<CampaignItem> getCampaign() {
        return this.campaign;
    }

    @NotNull
    public final String getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return (this.deviceType.hashCode() * 31) + this.campaign.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.deviceType;
        List<CampaignItem> list = this.campaign;
        return "CampaignBlacklistWithDeviceResponse(deviceType=" + str + ", campaign=" + list + ")";
    }

    public /* synthetic */ CampaignBlacklistWithDeviceResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}