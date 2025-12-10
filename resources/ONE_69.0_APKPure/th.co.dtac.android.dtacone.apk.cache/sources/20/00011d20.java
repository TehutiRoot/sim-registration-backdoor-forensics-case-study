package th.p047co.dtac.android.dtacone.model.campaign.join.request;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/join/request/JoinCampaignRequest;", "", "campaignId", "", "(Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.join.request.JoinCampaignRequest */
/* loaded from: classes8.dex */
public final class JoinCampaignRequest {
    public static final int $stable = 0;
    @SerializedName("campaignId")
    @Nullable
    private final String campaignId;

    public JoinCampaignRequest() {
        this(null, 1, null);
    }

    public static /* synthetic */ JoinCampaignRequest copy$default(JoinCampaignRequest joinCampaignRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinCampaignRequest.campaignId;
        }
        return joinCampaignRequest.copy(str);
    }

    @Nullable
    public final String component1() {
        return this.campaignId;
    }

    @NotNull
    public final JoinCampaignRequest copy(@Nullable String str) {
        return new JoinCampaignRequest(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof JoinCampaignRequest) && Intrinsics.areEqual(this.campaignId, ((JoinCampaignRequest) obj).campaignId);
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    public int hashCode() {
        String str = this.campaignId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.campaignId;
        return "JoinCampaignRequest(campaignId=" + str + ")";
    }

    public JoinCampaignRequest(@Nullable String str) {
        this.campaignId = str;
    }

    public /* synthetic */ JoinCampaignRequest(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}