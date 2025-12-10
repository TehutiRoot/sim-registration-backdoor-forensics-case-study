package th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint.history;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 72\u00020\u0001:\u00017B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0083\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0087\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010,\u001a\u00020-H\u0016J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0006HÖ\u0001J\u0018\u00104\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u00020-H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015¨\u00068"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pointType", "", "displayPointDetail", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/DisplayPointDetailItem;", "displayPointType", "transMonth", "displayTotalPoint", "pointUnit", "displayCampaignSumDate", "partnerCode", "displayImage", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/DisplayImage;", "campaignId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/DisplayImage;Ljava/lang/String;)V", "getCampaignId", "()Ljava/lang/String;", "getDisplayCampaignSumDate", "getDisplayImage", "()Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/DisplayImage;", "getDisplayPointDetail", "()Ljava/util/List;", "getDisplayPointType", "getDisplayTotalPoint", "getPartnerCode", "getPointType", "getPointUnit", "getTransMonth", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem */
/* loaded from: classes8.dex */
public final class CampaignDetailHistoryItem implements Parcelable {
    @SerializedName("campaign_id")
    @Nullable
    private final String campaignId;
    @SerializedName("display_campaign_sum_date")
    @Nullable
    private final String displayCampaignSumDate;
    @SerializedName("display_image")
    @Nullable
    private final DisplayImage displayImage;
    @SerializedName("display_point_detail")
    @Nullable
    private final List<DisplayPointDetailItem> displayPointDetail;
    @SerializedName("display_point_type")
    @Nullable
    private final String displayPointType;
    @SerializedName("display_total_point")
    @Nullable
    private final String displayTotalPoint;
    @SerializedName("partner_code")
    @Nullable
    private final String partnerCode;
    @SerializedName("point_type")
    @Nullable
    private final String pointType;
    @SerializedName("point_unit")
    @Nullable
    private final String pointUnit;
    @SerializedName("trans_month")
    @Nullable
    private final String transMonth;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/history/CampaignDetailHistoryItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.history.CampaignDetailHistoryItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CampaignDetailHistoryItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CampaignDetailHistoryItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CampaignDetailHistoryItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CampaignDetailHistoryItem[] newArray(int i) {
            return new CampaignDetailHistoryItem[i];
        }
    }

    public CampaignDetailHistoryItem() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final String component1() {
        return this.pointType;
    }

    @Nullable
    public final String component10() {
        return this.campaignId;
    }

    @Nullable
    public final List<DisplayPointDetailItem> component2() {
        return this.displayPointDetail;
    }

    @Nullable
    public final String component3() {
        return this.displayPointType;
    }

    @Nullable
    public final String component4() {
        return this.transMonth;
    }

    @Nullable
    public final String component5() {
        return this.displayTotalPoint;
    }

    @Nullable
    public final String component6() {
        return this.pointUnit;
    }

    @Nullable
    public final String component7() {
        return this.displayCampaignSumDate;
    }

    @Nullable
    public final String component8() {
        return this.partnerCode;
    }

    @Nullable
    public final DisplayImage component9() {
        return this.displayImage;
    }

    @NotNull
    public final CampaignDetailHistoryItem copy(@Nullable String str, @Nullable List<DisplayPointDetailItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable DisplayImage displayImage, @Nullable String str8) {
        return new CampaignDetailHistoryItem(str, list, str2, str3, str4, str5, str6, str7, displayImage, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignDetailHistoryItem) {
            CampaignDetailHistoryItem campaignDetailHistoryItem = (CampaignDetailHistoryItem) obj;
            return Intrinsics.areEqual(this.pointType, campaignDetailHistoryItem.pointType) && Intrinsics.areEqual(this.displayPointDetail, campaignDetailHistoryItem.displayPointDetail) && Intrinsics.areEqual(this.displayPointType, campaignDetailHistoryItem.displayPointType) && Intrinsics.areEqual(this.transMonth, campaignDetailHistoryItem.transMonth) && Intrinsics.areEqual(this.displayTotalPoint, campaignDetailHistoryItem.displayTotalPoint) && Intrinsics.areEqual(this.pointUnit, campaignDetailHistoryItem.pointUnit) && Intrinsics.areEqual(this.displayCampaignSumDate, campaignDetailHistoryItem.displayCampaignSumDate) && Intrinsics.areEqual(this.partnerCode, campaignDetailHistoryItem.partnerCode) && Intrinsics.areEqual(this.displayImage, campaignDetailHistoryItem.displayImage) && Intrinsics.areEqual(this.campaignId, campaignDetailHistoryItem.campaignId);
        }
        return false;
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    public final String getDisplayCampaignSumDate() {
        return this.displayCampaignSumDate;
    }

    @Nullable
    public final DisplayImage getDisplayImage() {
        return this.displayImage;
    }

    @Nullable
    public final List<DisplayPointDetailItem> getDisplayPointDetail() {
        return this.displayPointDetail;
    }

    @Nullable
    public final String getDisplayPointType() {
        return this.displayPointType;
    }

    @Nullable
    public final String getDisplayTotalPoint() {
        return this.displayTotalPoint;
    }

    @Nullable
    public final String getPartnerCode() {
        return this.partnerCode;
    }

    @Nullable
    public final String getPointType() {
        return this.pointType;
    }

    @Nullable
    public final String getPointUnit() {
        return this.pointUnit;
    }

    @Nullable
    public final String getTransMonth() {
        return this.transMonth;
    }

    public int hashCode() {
        String str = this.pointType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DisplayPointDetailItem> list = this.displayPointDetail;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.displayPointType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transMonth;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayTotalPoint;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pointUnit;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayCampaignSumDate;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.partnerCode;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DisplayImage displayImage = this.displayImage;
        int hashCode9 = (hashCode8 + (displayImage == null ? 0 : displayImage.hashCode())) * 31;
        String str8 = this.campaignId;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.pointType;
        List<DisplayPointDetailItem> list = this.displayPointDetail;
        String str2 = this.displayPointType;
        String str3 = this.transMonth;
        String str4 = this.displayTotalPoint;
        String str5 = this.pointUnit;
        String str6 = this.displayCampaignSumDate;
        String str7 = this.partnerCode;
        DisplayImage displayImage = this.displayImage;
        String str8 = this.campaignId;
        return "CampaignDetailHistoryItem(pointType=" + str + ", displayPointDetail=" + list + ", displayPointType=" + str2 + ", transMonth=" + str3 + ", displayTotalPoint=" + str4 + ", pointUnit=" + str5 + ", displayCampaignSumDate=" + str6 + ", partnerCode=" + str7 + ", displayImage=" + displayImage + ", campaignId=" + str8 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.pointType);
        parcel.writeTypedList(this.displayPointDetail);
        parcel.writeString(this.displayPointType);
        parcel.writeString(this.transMonth);
        parcel.writeString(this.displayTotalPoint);
        parcel.writeString(this.pointUnit);
        parcel.writeString(this.displayCampaignSumDate);
        parcel.writeString(this.partnerCode);
        parcel.writeParcelable(this.displayImage, i);
        parcel.writeString(this.campaignId);
    }

    public CampaignDetailHistoryItem(@Nullable String str, @Nullable List<DisplayPointDetailItem> list, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable DisplayImage displayImage, @Nullable String str8) {
        this.pointType = str;
        this.displayPointDetail = list;
        this.displayPointType = str2;
        this.transMonth = str3;
        this.displayTotalPoint = str4;
        this.pointUnit = str5;
        this.displayCampaignSumDate = str6;
        this.partnerCode = str7;
        this.displayImage = displayImage;
        this.campaignId = str8;
    }

    public /* synthetic */ CampaignDetailHistoryItem(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, DisplayImage displayImage, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : displayImage, (i & 512) == 0 ? str8 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CampaignDetailHistoryItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(DisplayPointDetailItem.CREATOR), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DisplayImage) parcel.readParcelable(DisplayImage.class.getClassLoader()), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
