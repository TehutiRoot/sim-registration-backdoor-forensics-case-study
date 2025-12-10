package th.p047co.dtac.android.dtacone.model.campaign_redemption;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign_redemption/CampaignRedeemNotResponse;", "", "retailerCode", "", Constant.NOTI_MESSAGE, Constant.TEXT_BUTTON, "displayFlag", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayFlag", "()Ljava/lang/String;", "getNotiMessage", "getRetailerCode", "getTextButton", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign_redemption.CampaignRedeemNotResponse */
/* loaded from: classes8.dex */
public final class CampaignRedeemNotResponse {
    public static final int $stable = 0;
    @SerializedName("displayFlag")
    @Nullable
    private final String displayFlag;
    @SerializedName(Constant.NOTI_MESSAGE)
    @Nullable
    private final String notiMessage;
    @SerializedName("retailerCode")
    @Nullable
    private final String retailerCode;
    @SerializedName(Constant.TEXT_BUTTON)
    @Nullable
    private final String textButton;

    public CampaignRedeemNotResponse() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CampaignRedeemNotResponse copy$default(CampaignRedeemNotResponse campaignRedeemNotResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignRedeemNotResponse.retailerCode;
        }
        if ((i & 2) != 0) {
            str2 = campaignRedeemNotResponse.notiMessage;
        }
        if ((i & 4) != 0) {
            str3 = campaignRedeemNotResponse.textButton;
        }
        if ((i & 8) != 0) {
            str4 = campaignRedeemNotResponse.displayFlag;
        }
        return campaignRedeemNotResponse.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.retailerCode;
    }

    @Nullable
    public final String component2() {
        return this.notiMessage;
    }

    @Nullable
    public final String component3() {
        return this.textButton;
    }

    @Nullable
    public final String component4() {
        return this.displayFlag;
    }

    @NotNull
    public final CampaignRedeemNotResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new CampaignRedeemNotResponse(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignRedeemNotResponse) {
            CampaignRedeemNotResponse campaignRedeemNotResponse = (CampaignRedeemNotResponse) obj;
            return Intrinsics.areEqual(this.retailerCode, campaignRedeemNotResponse.retailerCode) && Intrinsics.areEqual(this.notiMessage, campaignRedeemNotResponse.notiMessage) && Intrinsics.areEqual(this.textButton, campaignRedeemNotResponse.textButton) && Intrinsics.areEqual(this.displayFlag, campaignRedeemNotResponse.displayFlag);
        }
        return false;
    }

    @Nullable
    public final String getDisplayFlag() {
        return this.displayFlag;
    }

    @Nullable
    public final String getNotiMessage() {
        return this.notiMessage;
    }

    @Nullable
    public final String getRetailerCode() {
        return this.retailerCode;
    }

    @Nullable
    public final String getTextButton() {
        return this.textButton;
    }

    public int hashCode() {
        String str = this.retailerCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.notiMessage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textButton;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayFlag;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.retailerCode;
        String str2 = this.notiMessage;
        String str3 = this.textButton;
        String str4 = this.displayFlag;
        return "CampaignRedeemNotResponse(retailerCode=" + str + ", notiMessage=" + str2 + ", textButton=" + str3 + ", displayFlag=" + str4 + ")";
    }

    public CampaignRedeemNotResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.retailerCode = str;
        this.notiMessage = str2;
        this.textButton = str3;
        this.displayFlag = str4;
    }

    public /* synthetic */ CampaignRedeemNotResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
