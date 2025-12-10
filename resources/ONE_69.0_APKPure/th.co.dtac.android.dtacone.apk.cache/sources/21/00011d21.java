package th.p047co.dtac.android.dtacone.model.campaign.list;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\bA\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÒ\u0002\u0010X\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010YJ\t\u0010Z\u001a\u00020[HÖ\u0001J\u0013\u0010\\\u001a\u00020\u00192\b\u0010]\u001a\u0004\u0018\u00010^HÖ\u0003J\t\u0010_\u001a\u00020[HÖ\u0001J\t\u0010`\u001a\u00020\u0003HÖ\u0001J\u0019\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020[HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010!R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u0018\u00105R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010!R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010!R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010!R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010!R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010!¨\u0006f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "Landroid/os/Parcelable;", "campaignName", "", "displayTemplateId", "targetByMonth", "displayDetailPatternId", "campaignCatalogImageId", "campaignImageId", "displayCampaignPeriodLabel", "displayCampaignPeriod", "optInStatus", "partnerCode", "displayOptInPeriod", "campaignId", "campaignCriteriaImageId", "target_by_month_label", "display_current_reward_label", "display_current_reward", "display_next_reward_label", "display_next_reward", "currentDate", "campaign_start_date", "campaign_end_date", "isRedemption", "", "redemption_period_from", "redemption_period_to", "display_redemption_period_label", "display_redemption_period", "campaign_catalog_image_url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCatalogImageId", "()Ljava/lang/String;", "getCampaignCriteriaImageId", "getCampaignId", "getCampaignImageId", "getCampaignName", "getCampaign_catalog_image_url", "getCampaign_end_date", "getCampaign_start_date", "getCurrentDate", "getDisplayCampaignPeriod", "getDisplayCampaignPeriodLabel", "getDisplayDetailPatternId", "getDisplayOptInPeriod", "getDisplayTemplateId", "getDisplay_current_reward", "getDisplay_current_reward_label", "getDisplay_next_reward", "getDisplay_next_reward_label", "getDisplay_redemption_period", "getDisplay_redemption_period_label", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOptInStatus", "getPartnerCode", "getRedemption_period_from", "getRedemption_period_to", "getTargetByMonth", "getTarget_by_month_label", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/model/campaign/list/CampaignItem;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.list.CampaignItem */
/* loaded from: classes8.dex */
public final class CampaignItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CampaignItem> CREATOR = new Creator();
    @SerializedName("campaign_catalog_image_id")
    @Nullable
    private final String campaignCatalogImageId;
    @SerializedName("campaign_criteria_image_id")
    @Nullable
    private final String campaignCriteriaImageId;
    @SerializedName("campaign_id")
    @Nullable
    private final String campaignId;
    @SerializedName("campaign_image_id")
    @Nullable
    private final String campaignImageId;
    @SerializedName("campaign_name")
    @Nullable
    private final String campaignName;
    @SerializedName("campaign_catalog_image_url")
    @Nullable
    private final String campaign_catalog_image_url;
    @SerializedName("campaign_end_date")
    @Nullable
    private final String campaign_end_date;
    @SerializedName("campaign_start_date")
    @Nullable
    private final String campaign_start_date;
    @SerializedName("currentDate")
    @Nullable
    private final String currentDate;
    @SerializedName("display_campaign_period")
    @Nullable
    private final String displayCampaignPeriod;
    @SerializedName("display_campaign_period_label")
    @Nullable
    private final String displayCampaignPeriodLabel;
    @SerializedName("display_detail_pattern_id")
    @Nullable
    private final String displayDetailPatternId;
    @SerializedName("display_opt_in_period")
    @Nullable
    private final String displayOptInPeriod;
    @SerializedName("display_template_id")
    @Nullable
    private final String displayTemplateId;
    @SerializedName("display_current_reward")
    @Nullable
    private final String display_current_reward;
    @SerializedName("display_current_reward_label")
    @Nullable
    private final String display_current_reward_label;
    @SerializedName("display_next_reward")
    @Nullable
    private final String display_next_reward;
    @SerializedName("display_next_reward_label")
    @Nullable
    private final String display_next_reward_label;
    @SerializedName("display_redemption_period")
    @Nullable
    private final String display_redemption_period;
    @SerializedName("display_redemption_period_label")
    @Nullable
    private final String display_redemption_period_label;
    @SerializedName("isRedemption")
    @Nullable
    private final Boolean isRedemption;
    @SerializedName("opt_in_status")
    @Nullable
    private final String optInStatus;
    @SerializedName("partner_code")
    @Nullable
    private final String partnerCode;
    @SerializedName("redemption_period_from")
    @Nullable
    private final String redemption_period_from;
    @SerializedName("redemption_period_to")
    @Nullable
    private final String redemption_period_to;
    @SerializedName("target_by_month")
    @Nullable
    private final String targetByMonth;
    @SerializedName("target_by_month_label")
    @Nullable
    private final String target_by_month_label;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.list.CampaignItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CampaignItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignItem createFromParcel(@NotNull Parcel parcel) {
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CampaignItem(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, readString18, readString19, readString20, readString21, valueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignItem[] newArray(int i) {
            return new CampaignItem[i];
        }
    }

    public CampaignItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null);
    }

    @Nullable
    public final String component1() {
        return this.campaignName;
    }

    @Nullable
    public final String component10() {
        return this.partnerCode;
    }

    @Nullable
    public final String component11() {
        return this.displayOptInPeriod;
    }

    @Nullable
    public final String component12() {
        return this.campaignId;
    }

    @Nullable
    public final String component13() {
        return this.campaignCriteriaImageId;
    }

    @Nullable
    public final String component14() {
        return this.target_by_month_label;
    }

    @Nullable
    public final String component15() {
        return this.display_current_reward_label;
    }

    @Nullable
    public final String component16() {
        return this.display_current_reward;
    }

    @Nullable
    public final String component17() {
        return this.display_next_reward_label;
    }

    @Nullable
    public final String component18() {
        return this.display_next_reward;
    }

    @Nullable
    public final String component19() {
        return this.currentDate;
    }

    @Nullable
    public final String component2() {
        return this.displayTemplateId;
    }

    @Nullable
    public final String component20() {
        return this.campaign_start_date;
    }

    @Nullable
    public final String component21() {
        return this.campaign_end_date;
    }

    @Nullable
    public final Boolean component22() {
        return this.isRedemption;
    }

    @Nullable
    public final String component23() {
        return this.redemption_period_from;
    }

    @Nullable
    public final String component24() {
        return this.redemption_period_to;
    }

    @Nullable
    public final String component25() {
        return this.display_redemption_period_label;
    }

    @Nullable
    public final String component26() {
        return this.display_redemption_period;
    }

    @Nullable
    public final String component27() {
        return this.campaign_catalog_image_url;
    }

    @Nullable
    public final String component3() {
        return this.targetByMonth;
    }

    @Nullable
    public final String component4() {
        return this.displayDetailPatternId;
    }

    @Nullable
    public final String component5() {
        return this.campaignCatalogImageId;
    }

    @Nullable
    public final String component6() {
        return this.campaignImageId;
    }

    @Nullable
    public final String component7() {
        return this.displayCampaignPeriodLabel;
    }

    @Nullable
    public final String component8() {
        return this.displayCampaignPeriod;
    }

    @Nullable
    public final String component9() {
        return this.optInStatus;
    }

    @NotNull
    public final CampaignItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable Boolean bool, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26) {
        return new CampaignItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, bool, str22, str23, str24, str25, str26);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignItem) {
            CampaignItem campaignItem = (CampaignItem) obj;
            return Intrinsics.areEqual(this.campaignName, campaignItem.campaignName) && Intrinsics.areEqual(this.displayTemplateId, campaignItem.displayTemplateId) && Intrinsics.areEqual(this.targetByMonth, campaignItem.targetByMonth) && Intrinsics.areEqual(this.displayDetailPatternId, campaignItem.displayDetailPatternId) && Intrinsics.areEqual(this.campaignCatalogImageId, campaignItem.campaignCatalogImageId) && Intrinsics.areEqual(this.campaignImageId, campaignItem.campaignImageId) && Intrinsics.areEqual(this.displayCampaignPeriodLabel, campaignItem.displayCampaignPeriodLabel) && Intrinsics.areEqual(this.displayCampaignPeriod, campaignItem.displayCampaignPeriod) && Intrinsics.areEqual(this.optInStatus, campaignItem.optInStatus) && Intrinsics.areEqual(this.partnerCode, campaignItem.partnerCode) && Intrinsics.areEqual(this.displayOptInPeriod, campaignItem.displayOptInPeriod) && Intrinsics.areEqual(this.campaignId, campaignItem.campaignId) && Intrinsics.areEqual(this.campaignCriteriaImageId, campaignItem.campaignCriteriaImageId) && Intrinsics.areEqual(this.target_by_month_label, campaignItem.target_by_month_label) && Intrinsics.areEqual(this.display_current_reward_label, campaignItem.display_current_reward_label) && Intrinsics.areEqual(this.display_current_reward, campaignItem.display_current_reward) && Intrinsics.areEqual(this.display_next_reward_label, campaignItem.display_next_reward_label) && Intrinsics.areEqual(this.display_next_reward, campaignItem.display_next_reward) && Intrinsics.areEqual(this.currentDate, campaignItem.currentDate) && Intrinsics.areEqual(this.campaign_start_date, campaignItem.campaign_start_date) && Intrinsics.areEqual(this.campaign_end_date, campaignItem.campaign_end_date) && Intrinsics.areEqual(this.isRedemption, campaignItem.isRedemption) && Intrinsics.areEqual(this.redemption_period_from, campaignItem.redemption_period_from) && Intrinsics.areEqual(this.redemption_period_to, campaignItem.redemption_period_to) && Intrinsics.areEqual(this.display_redemption_period_label, campaignItem.display_redemption_period_label) && Intrinsics.areEqual(this.display_redemption_period, campaignItem.display_redemption_period) && Intrinsics.areEqual(this.campaign_catalog_image_url, campaignItem.campaign_catalog_image_url);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCatalogImageId() {
        return this.campaignCatalogImageId;
    }

    @Nullable
    public final String getCampaignCriteriaImageId() {
        return this.campaignCriteriaImageId;
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getCampaignImageId() {
        return this.campaignImageId;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
    }

    @Nullable
    public final String getCampaign_catalog_image_url() {
        return this.campaign_catalog_image_url;
    }

    @Nullable
    public final String getCampaign_end_date() {
        return this.campaign_end_date;
    }

    @Nullable
    public final String getCampaign_start_date() {
        return this.campaign_start_date;
    }

    @Nullable
    public final String getCurrentDate() {
        return this.currentDate;
    }

    @Nullable
    public final String getDisplayCampaignPeriod() {
        return this.displayCampaignPeriod;
    }

    @Nullable
    public final String getDisplayCampaignPeriodLabel() {
        return this.displayCampaignPeriodLabel;
    }

    @Nullable
    public final String getDisplayDetailPatternId() {
        return this.displayDetailPatternId;
    }

    @Nullable
    public final String getDisplayOptInPeriod() {
        return this.displayOptInPeriod;
    }

    @Nullable
    public final String getDisplayTemplateId() {
        return this.displayTemplateId;
    }

    @Nullable
    public final String getDisplay_current_reward() {
        return this.display_current_reward;
    }

    @Nullable
    public final String getDisplay_current_reward_label() {
        return this.display_current_reward_label;
    }

    @Nullable
    public final String getDisplay_next_reward() {
        return this.display_next_reward;
    }

    @Nullable
    public final String getDisplay_next_reward_label() {
        return this.display_next_reward_label;
    }

    @Nullable
    public final String getDisplay_redemption_period() {
        return this.display_redemption_period;
    }

    @Nullable
    public final String getDisplay_redemption_period_label() {
        return this.display_redemption_period_label;
    }

    @Nullable
    public final String getOptInStatus() {
        return this.optInStatus;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final String getRedemption_period_from() {
        return this.redemption_period_from;
    }

    @Nullable
    public final String getRedemption_period_to() {
        return this.redemption_period_to;
    }

    @Nullable
    public final String getTargetByMonth() {
        return this.targetByMonth;
    }

    @Nullable
    public final String getTarget_by_month_label() {
        return this.target_by_month_label;
    }

    public int hashCode() {
        String str = this.campaignName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayTemplateId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetByMonth;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayDetailPatternId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campaignCatalogImageId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.campaignImageId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.displayCampaignPeriodLabel;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayCampaignPeriod;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.optInStatus;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.partnerCode;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.displayOptInPeriod;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.campaignId;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.campaignCriteriaImageId;
        int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.target_by_month_label;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.display_current_reward_label;
        int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.display_current_reward;
        int hashCode16 = (hashCode15 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.display_next_reward_label;
        int hashCode17 = (hashCode16 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.display_next_reward;
        int hashCode18 = (hashCode17 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.currentDate;
        int hashCode19 = (hashCode18 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.campaign_start_date;
        int hashCode20 = (hashCode19 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.campaign_end_date;
        int hashCode21 = (hashCode20 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Boolean bool = this.isRedemption;
        int hashCode22 = (hashCode21 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str22 = this.redemption_period_from;
        int hashCode23 = (hashCode22 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.redemption_period_to;
        int hashCode24 = (hashCode23 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.display_redemption_period_label;
        int hashCode25 = (hashCode24 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.display_redemption_period;
        int hashCode26 = (hashCode25 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.campaign_catalog_image_url;
        return hashCode26 + (str26 != null ? str26.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRedemption() {
        return this.isRedemption;
    }

    @NotNull
    public String toString() {
        String str = this.campaignName;
        String str2 = this.displayTemplateId;
        String str3 = this.targetByMonth;
        String str4 = this.displayDetailPatternId;
        String str5 = this.campaignCatalogImageId;
        String str6 = this.campaignImageId;
        String str7 = this.displayCampaignPeriodLabel;
        String str8 = this.displayCampaignPeriod;
        String str9 = this.optInStatus;
        String str10 = this.partnerCode;
        String str11 = this.displayOptInPeriod;
        String str12 = this.campaignId;
        String str13 = this.campaignCriteriaImageId;
        String str14 = this.target_by_month_label;
        String str15 = this.display_current_reward_label;
        String str16 = this.display_current_reward;
        String str17 = this.display_next_reward_label;
        String str18 = this.display_next_reward;
        String str19 = this.currentDate;
        String str20 = this.campaign_start_date;
        String str21 = this.campaign_end_date;
        Boolean bool = this.isRedemption;
        String str22 = this.redemption_period_from;
        String str23 = this.redemption_period_to;
        String str24 = this.display_redemption_period_label;
        String str25 = this.display_redemption_period;
        String str26 = this.campaign_catalog_image_url;
        return "CampaignItem(campaignName=" + str + ", displayTemplateId=" + str2 + ", targetByMonth=" + str3 + ", displayDetailPatternId=" + str4 + ", campaignCatalogImageId=" + str5 + ", campaignImageId=" + str6 + ", displayCampaignPeriodLabel=" + str7 + ", displayCampaignPeriod=" + str8 + ", optInStatus=" + str9 + ", partnerCode=" + str10 + ", displayOptInPeriod=" + str11 + ", campaignId=" + str12 + ", campaignCriteriaImageId=" + str13 + ", target_by_month_label=" + str14 + ", display_current_reward_label=" + str15 + ", display_current_reward=" + str16 + ", display_next_reward_label=" + str17 + ", display_next_reward=" + str18 + ", currentDate=" + str19 + ", campaign_start_date=" + str20 + ", campaign_end_date=" + str21 + ", isRedemption=" + bool + ", redemption_period_from=" + str22 + ", redemption_period_to=" + str23 + ", display_redemption_period_label=" + str24 + ", display_redemption_period=" + str25 + ", campaign_catalog_image_url=" + str26 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.campaignName);
        out.writeString(this.displayTemplateId);
        out.writeString(this.targetByMonth);
        out.writeString(this.displayDetailPatternId);
        out.writeString(this.campaignCatalogImageId);
        out.writeString(this.campaignImageId);
        out.writeString(this.displayCampaignPeriodLabel);
        out.writeString(this.displayCampaignPeriod);
        out.writeString(this.optInStatus);
        out.writeString(this.partnerCode);
        out.writeString(this.displayOptInPeriod);
        out.writeString(this.campaignId);
        out.writeString(this.campaignCriteriaImageId);
        out.writeString(this.target_by_month_label);
        out.writeString(this.display_current_reward_label);
        out.writeString(this.display_current_reward);
        out.writeString(this.display_next_reward_label);
        out.writeString(this.display_next_reward);
        out.writeString(this.currentDate);
        out.writeString(this.campaign_start_date);
        out.writeString(this.campaign_end_date);
        Boolean bool = this.isRedemption;
        if (bool == null) {
            i2 = 0;
        } else {
            out.writeInt(1);
            i2 = bool.booleanValue();
        }
        out.writeInt(i2);
        out.writeString(this.redemption_period_from);
        out.writeString(this.redemption_period_to);
        out.writeString(this.display_redemption_period_label);
        out.writeString(this.display_redemption_period);
        out.writeString(this.campaign_catalog_image_url);
    }

    public CampaignItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20, @Nullable String str21, @Nullable Boolean bool, @Nullable String str22, @Nullable String str23, @Nullable String str24, @Nullable String str25, @Nullable String str26) {
        this.campaignName = str;
        this.displayTemplateId = str2;
        this.targetByMonth = str3;
        this.displayDetailPatternId = str4;
        this.campaignCatalogImageId = str5;
        this.campaignImageId = str6;
        this.displayCampaignPeriodLabel = str7;
        this.displayCampaignPeriod = str8;
        this.optInStatus = str9;
        this.partnerCode = str10;
        this.displayOptInPeriod = str11;
        this.campaignId = str12;
        this.campaignCriteriaImageId = str13;
        this.target_by_month_label = str14;
        this.display_current_reward_label = str15;
        this.display_current_reward = str16;
        this.display_next_reward_label = str17;
        this.display_next_reward = str18;
        this.currentDate = str19;
        this.campaign_start_date = str20;
        this.campaign_end_date = str21;
        this.isRedemption = bool;
        this.redemption_period_from = str22;
        this.redemption_period_to = str23;
        this.display_redemption_period_label = str24;
        this.display_redemption_period = str25;
        this.campaign_catalog_image_url = str26;
    }

    public /* synthetic */ CampaignItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, Boolean bool, String str22, String str23, String str24, String str25, String str26, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) != 0 ? null : str18, (i & 262144) != 0 ? null : str19, (i & 524288) != 0 ? null : str20, (i & 1048576) != 0 ? null : str21, (i & 2097152) != 0 ? null : bool, (i & 4194304) != 0 ? null : str22, (i & 8388608) != 0 ? null : str23, (i & 16777216) != 0 ? null : str24, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str25, (i & 67108864) != 0 ? null : str26);
    }
}