package th.p047co.dtac.android.dtacone.model.campaign.count;

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
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\""}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "Landroid/os/Parcelable;", "mission", "Lth/co/dtac/android/dtacone/model/campaign/count/Mission;", "campaign", "Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;", "totalNew", "", "(Lth/co/dtac/android/dtacone/model/campaign/count/Mission;Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;Ljava/lang/Integer;)V", "getCampaign", "()Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;", "getMission", "()Lth/co/dtac/android/dtacone/model/campaign/count/Mission;", "getTotalNew", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lth/co/dtac/android/dtacone/model/campaign/count/Mission;Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/campaign/count/CampaignCountResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse */
/* loaded from: classes8.dex */
public final class CampaignCountResponse implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<CampaignCountResponse> CREATOR = new Creator();
    @SerializedName("campaign")
    @Nullable
    private final Campaign campaign;
    @SerializedName("mission")
    @Nullable
    private final Mission mission;
    @SerializedName("totalNew")
    @Nullable
    private final Integer totalNew;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.count.CampaignCountResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<CampaignCountResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignCountResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CampaignCountResponse(parcel.readInt() == 0 ? null : Mission.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Campaign.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CampaignCountResponse[] newArray(int i) {
            return new CampaignCountResponse[i];
        }
    }

    public CampaignCountResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CampaignCountResponse copy$default(CampaignCountResponse campaignCountResponse, Mission mission, Campaign campaign, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            mission = campaignCountResponse.mission;
        }
        if ((i & 2) != 0) {
            campaign = campaignCountResponse.campaign;
        }
        if ((i & 4) != 0) {
            num = campaignCountResponse.totalNew;
        }
        return campaignCountResponse.copy(mission, campaign, num);
    }

    @Nullable
    public final Mission component1() {
        return this.mission;
    }

    @Nullable
    public final Campaign component2() {
        return this.campaign;
    }

    @Nullable
    public final Integer component3() {
        return this.totalNew;
    }

    @NotNull
    public final CampaignCountResponse copy(@Nullable Mission mission, @Nullable Campaign campaign, @Nullable Integer num) {
        return new CampaignCountResponse(mission, campaign, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CampaignCountResponse) {
            CampaignCountResponse campaignCountResponse = (CampaignCountResponse) obj;
            return Intrinsics.areEqual(this.mission, campaignCountResponse.mission) && Intrinsics.areEqual(this.campaign, campaignCountResponse.campaign) && Intrinsics.areEqual(this.totalNew, campaignCountResponse.totalNew);
        }
        return false;
    }

    @Nullable
    public final Campaign getCampaign() {
        return this.campaign;
    }

    @Nullable
    public final Mission getMission() {
        return this.mission;
    }

    @Nullable
    public final Integer getTotalNew() {
        return this.totalNew;
    }

    public int hashCode() {
        Mission mission = this.mission;
        int hashCode = (mission == null ? 0 : mission.hashCode()) * 31;
        Campaign campaign = this.campaign;
        int hashCode2 = (hashCode + (campaign == null ? 0 : campaign.hashCode())) * 31;
        Integer num = this.totalNew;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Mission mission = this.mission;
        Campaign campaign = this.campaign;
        Integer num = this.totalNew;
        return "CampaignCountResponse(mission=" + mission + ", campaign=" + campaign + ", totalNew=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Mission mission = this.mission;
        if (mission == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mission.writeToParcel(out, i);
        }
        Campaign campaign = this.campaign;
        if (campaign == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            campaign.writeToParcel(out, i);
        }
        Integer num = this.totalNew;
        if (num == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num.intValue());
    }

    public CampaignCountResponse(@Nullable Mission mission, @Nullable Campaign campaign, @Nullable Integer num) {
        this.mission = mission;
        this.campaign = campaign;
        this.totalNew = num;
    }

    public /* synthetic */ CampaignCountResponse(Mission mission, Campaign campaign, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mission, (i & 2) != 0 ? null : campaign, (i & 4) != 0 ? 0 : num);
    }
}
