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
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ2\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;", "Landroid/os/Parcelable;", "optinCampaignCount", "", "newCampaignCount", "allCampaignCount", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAllCampaignCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNewCampaignCount", "getOptinCampaignCount", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/campaign/count/Campaign;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.count.Campaign */
/* loaded from: classes8.dex */
public final class Campaign implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<Campaign> CREATOR = new Creator();
    @SerializedName("allCampaignCount")
    @Nullable
    private final Integer allCampaignCount;
    @SerializedName("newCampaignCount")
    @Nullable
    private final Integer newCampaignCount;
    @SerializedName("optinCampaignCount")
    @Nullable
    private final Integer optinCampaignCount;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.count.Campaign$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<Campaign> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Campaign createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Campaign(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Campaign[] newArray(int i) {
            return new Campaign[i];
        }
    }

    public Campaign() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Campaign copy$default(Campaign campaign, Integer num, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = campaign.optinCampaignCount;
        }
        if ((i & 2) != 0) {
            num2 = campaign.newCampaignCount;
        }
        if ((i & 4) != 0) {
            num3 = campaign.allCampaignCount;
        }
        return campaign.copy(num, num2, num3);
    }

    @Nullable
    public final Integer component1() {
        return this.optinCampaignCount;
    }

    @Nullable
    public final Integer component2() {
        return this.newCampaignCount;
    }

    @Nullable
    public final Integer component3() {
        return this.allCampaignCount;
    }

    @NotNull
    public final Campaign copy(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        return new Campaign(num, num2, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Campaign) {
            Campaign campaign = (Campaign) obj;
            return Intrinsics.areEqual(this.optinCampaignCount, campaign.optinCampaignCount) && Intrinsics.areEqual(this.newCampaignCount, campaign.newCampaignCount) && Intrinsics.areEqual(this.allCampaignCount, campaign.allCampaignCount);
        }
        return false;
    }

    @Nullable
    public final Integer getAllCampaignCount() {
        return this.allCampaignCount;
    }

    @Nullable
    public final Integer getNewCampaignCount() {
        return this.newCampaignCount;
    }

    @Nullable
    public final Integer getOptinCampaignCount() {
        return this.optinCampaignCount;
    }

    public int hashCode() {
        Integer num = this.optinCampaignCount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.newCampaignCount;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.allCampaignCount;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.optinCampaignCount;
        Integer num2 = this.newCampaignCount;
        Integer num3 = this.allCampaignCount;
        return "Campaign(optinCampaignCount=" + num + ", newCampaignCount=" + num2 + ", allCampaignCount=" + num3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.optinCampaignCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.newCampaignCount;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.allCampaignCount;
        if (num3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num3.intValue());
    }

    public Campaign(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        this.optinCampaignCount = num;
        this.newCampaignCount = num2;
        this.allCampaignCount = num3;
    }

    public /* synthetic */ Campaign(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3);
    }
}