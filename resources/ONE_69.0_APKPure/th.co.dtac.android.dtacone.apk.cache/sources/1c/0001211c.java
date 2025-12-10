package th.p047co.dtac.android.dtacone.model.withDevice.validateImei.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Parcelize
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/withDevice/validateImei/response/CampaignItem;", "Landroid/os/Parcelable;", "campaignType", "", "campaignCode", "campaignName", "campaignNameCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCampaignCode", "()Ljava/lang/String;", "getCampaignName", "getCampaignNameCode", "getCampaignType", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.withDevice.validateImei.response.CampaignItem */
/* loaded from: classes8.dex */
public final class CampaignItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CampaignItem> CREATOR = new Creator();
    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;
    @SerializedName("campaignName")
    @Nullable
    private final String campaignName;
    @SerializedName("campaignNameCode")
    @Nullable
    private final String campaignNameCode;
    @SerializedName("campaignType")
    @Nullable
    private final String campaignType;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.withDevice.validateImei.response.CampaignItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CampaignItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CampaignItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignItem[] newArray(int i) {
            return new CampaignItem[i];
        }
    }

    public CampaignItem() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ CampaignItem copy$default(CampaignItem campaignItem, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignItem.campaignType;
        }
        if ((i & 2) != 0) {
            str2 = campaignItem.campaignCode;
        }
        if ((i & 4) != 0) {
            str3 = campaignItem.campaignName;
        }
        if ((i & 8) != 0) {
            str4 = campaignItem.campaignNameCode;
        }
        return campaignItem.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.campaignType;
    }

    @Nullable
    public final String component2() {
        return this.campaignCode;
    }

    @Nullable
    public final String component3() {
        return this.campaignName;
    }

    @Nullable
    public final String component4() {
        return this.campaignNameCode;
    }

    @NotNull
    public final CampaignItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new CampaignItem(str, str2, str3, str4);
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
            return Intrinsics.areEqual(this.campaignType, campaignItem.campaignType) && Intrinsics.areEqual(this.campaignCode, campaignItem.campaignCode) && Intrinsics.areEqual(this.campaignName, campaignItem.campaignName) && Intrinsics.areEqual(this.campaignNameCode, campaignItem.campaignNameCode);
        }
        return false;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignName() {
        return this.campaignName;
    }

    @Nullable
    public final String getCampaignNameCode() {
        return this.campaignNameCode;
    }

    @Nullable
    public final String getCampaignType() {
        return this.campaignType;
    }

    public int hashCode() {
        String str = this.campaignType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.campaignCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.campaignName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaignNameCode;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.campaignType;
        String str2 = this.campaignCode;
        String str3 = this.campaignName;
        String str4 = this.campaignNameCode;
        return "CampaignItem(campaignType=" + str + ", campaignCode=" + str2 + ", campaignName=" + str3 + ", campaignNameCode=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.campaignType);
        out.writeString(this.campaignCode);
        out.writeString(this.campaignName);
        out.writeString(this.campaignNameCode);
    }

    public CampaignItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.campaignType = str;
        this.campaignCode = str2;
        this.campaignName = str3;
        this.campaignNameCode = str4;
    }

    public /* synthetic */ CampaignItem(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}