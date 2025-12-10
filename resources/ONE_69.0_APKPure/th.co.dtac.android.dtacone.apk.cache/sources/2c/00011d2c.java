package th.p047co.dtac.android.dtacone.model.campaign.web;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/web/CampaignDetailUrlRequest;", "", "retailerCode", "", "campaingId", "info", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaingId", "()Ljava/lang/String;", "getInfo", "getRetailerCode", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.web.CampaignDetailUrlRequest */
/* loaded from: classes8.dex */
public final class CampaignDetailUrlRequest {
    public static final int $stable = 0;
    @SerializedName("campaingId")
    @Nullable
    private final String campaingId;
    @SerializedName("info")
    @Nullable
    private final String info;
    @SerializedName("retailerCode")
    @Nullable
    private final String retailerCode;

    public CampaignDetailUrlRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CampaignDetailUrlRequest copy$default(CampaignDetailUrlRequest campaignDetailUrlRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignDetailUrlRequest.retailerCode;
        }
        if ((i & 2) != 0) {
            str2 = campaignDetailUrlRequest.campaingId;
        }
        if ((i & 4) != 0) {
            str3 = campaignDetailUrlRequest.info;
        }
        return campaignDetailUrlRequest.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.retailerCode;
    }

    @Nullable
    public final String component2() {
        return this.campaingId;
    }

    @Nullable
    public final String component3() {
        return this.info;
    }

    @NotNull
    public final CampaignDetailUrlRequest copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new CampaignDetailUrlRequest(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignDetailUrlRequest) {
            CampaignDetailUrlRequest campaignDetailUrlRequest = (CampaignDetailUrlRequest) obj;
            return Intrinsics.areEqual(this.retailerCode, campaignDetailUrlRequest.retailerCode) && Intrinsics.areEqual(this.campaingId, campaignDetailUrlRequest.campaingId) && Intrinsics.areEqual(this.info, campaignDetailUrlRequest.info);
        }
        return false;
    }

    @Nullable
    public final String getCampaingId() {
        return this.campaingId;
    }

    @Nullable
    public final String getInfo() {
        return this.info;
    }

    @Nullable
    public final String getRetailerCode() {
        return this.retailerCode;
    }

    public int hashCode() {
        String str = this.retailerCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaingId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.info;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.retailerCode;
        String str2 = this.campaingId;
        String str3 = this.info;
        return "CampaignDetailUrlRequest(retailerCode=" + str + ", campaingId=" + str2 + ", info=" + str3 + ")";
    }

    public CampaignDetailUrlRequest(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.retailerCode = str;
        this.campaingId = str2;
        this.info = str3;
    }

    public /* synthetic */ CampaignDetailUrlRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}