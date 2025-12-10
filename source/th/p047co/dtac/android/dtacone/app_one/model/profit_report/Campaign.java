package th.p047co.dtac.android.dtacone.app_one.model.profit_report;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/model/profit_report/Campaign;", "", "", "campaignHeaderLabel", "displayLabel1", "optinCampaignCount", "uom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/app_one/model/profit_report/Campaign;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCampaignHeaderLabel", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getDisplayLabel1", OperatorName.CURVE_TO, "getOptinCampaignCount", "d", "getUom", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.profit_report.Campaign */
/* loaded from: classes7.dex */
public final class Campaign {
    public static final int $stable = 0;
    @SerializedName("campaign_header_label")
    @NotNull

    /* renamed from: a */
    private final String f81982a;
    @SerializedName("display_label_1")
    @NotNull

    /* renamed from: b */
    private final String f81983b;
    @SerializedName("optin_campaign_count")
    @NotNull

    /* renamed from: c */
    private final String f81984c;
    @SerializedName("uom")
    @NotNull

    /* renamed from: d */
    private final String f81985d;

    public Campaign() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaign.f81982a;
        }
        if ((i & 2) != 0) {
            str2 = campaign.f81983b;
        }
        if ((i & 4) != 0) {
            str3 = campaign.f81984c;
        }
        if ((i & 8) != 0) {
            str4 = campaign.f81985d;
        }
        return campaign.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.f81982a;
    }

    @NotNull
    public final String component2() {
        return this.f81983b;
    }

    @NotNull
    public final String component3() {
        return this.f81984c;
    }

    @NotNull
    public final String component4() {
        return this.f81985d;
    }

    @NotNull
    public final Campaign copy(@NotNull String campaignHeaderLabel, @NotNull String displayLabel1, @NotNull String optinCampaignCount, @NotNull String uom) {
        Intrinsics.checkNotNullParameter(campaignHeaderLabel, "campaignHeaderLabel");
        Intrinsics.checkNotNullParameter(displayLabel1, "displayLabel1");
        Intrinsics.checkNotNullParameter(optinCampaignCount, "optinCampaignCount");
        Intrinsics.checkNotNullParameter(uom, "uom");
        return new Campaign(campaignHeaderLabel, displayLabel1, optinCampaignCount, uom);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.f81982a, campaign.f81982a) && Intrinsics.areEqual(this.f81983b, campaign.f81983b) && Intrinsics.areEqual(this.f81984c, campaign.f81984c) && Intrinsics.areEqual(this.f81985d, campaign.f81985d);
        }
        return false;
    }

    @NotNull
    public final String getCampaignHeaderLabel() {
        return this.f81982a;
    }

    @NotNull
    public final String getDisplayLabel1() {
        return this.f81983b;
    }

    @NotNull
    public final String getOptinCampaignCount() {
        return this.f81984c;
    }

    @NotNull
    public final String getUom() {
        return this.f81985d;
    }

    public int hashCode() {
        return (((((this.f81982a.hashCode() * 31) + this.f81983b.hashCode()) * 31) + this.f81984c.hashCode()) * 31) + this.f81985d.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f81982a;
        String str2 = this.f81983b;
        String str3 = this.f81984c;
        String str4 = this.f81985d;
        return "Campaign(campaignHeaderLabel=" + str + ", displayLabel1=" + str2 + ", optinCampaignCount=" + str3 + ", uom=" + str4 + ")";
    }

    public Campaign(@NotNull String campaignHeaderLabel, @NotNull String displayLabel1, @NotNull String optinCampaignCount, @NotNull String uom) {
        Intrinsics.checkNotNullParameter(campaignHeaderLabel, "campaignHeaderLabel");
        Intrinsics.checkNotNullParameter(displayLabel1, "displayLabel1");
        Intrinsics.checkNotNullParameter(optinCampaignCount, "optinCampaignCount");
        Intrinsics.checkNotNullParameter(uom, "uom");
        this.f81982a = campaignHeaderLabel;
        this.f81983b = displayLabel1;
        this.f81984c = optinCampaignCount;
        this.f81985d = uom;
    }

    public /* synthetic */ Campaign(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
