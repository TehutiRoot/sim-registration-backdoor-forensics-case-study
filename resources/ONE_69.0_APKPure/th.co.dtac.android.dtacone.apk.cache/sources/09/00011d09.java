package th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint;

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
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nextReward", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardItem;", "nextRewardId", "", "nextRewardLabel", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getNextReward", "()Ljava/util/List;", "getNextRewardId", "()Ljava/lang/String;", "getNextRewardLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.DisplayNextReward */
/* loaded from: classes8.dex */
public final class DisplayNextReward implements Parcelable {
    @SerializedName("next_reward")
    @Nullable
    private final List<RewardItem> nextReward;
    @SerializedName("next_reward_id")
    @Nullable
    private final String nextRewardId;
    @SerializedName("next_reward_label")
    @Nullable
    private final String nextRewardLabel;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.DisplayNextReward$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<DisplayNextReward> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DisplayNextReward createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayNextReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DisplayNextReward[] newArray(int i) {
            return new DisplayNextReward[i];
        }
    }

    public DisplayNextReward() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayNextReward copy$default(DisplayNextReward displayNextReward, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = displayNextReward.nextReward;
        }
        if ((i & 2) != 0) {
            str = displayNextReward.nextRewardId;
        }
        if ((i & 4) != 0) {
            str2 = displayNextReward.nextRewardLabel;
        }
        return displayNextReward.copy(list, str, str2);
    }

    @Nullable
    public final List<RewardItem> component1() {
        return this.nextReward;
    }

    @Nullable
    public final String component2() {
        return this.nextRewardId;
    }

    @Nullable
    public final String component3() {
        return this.nextRewardLabel;
    }

    @NotNull
    public final DisplayNextReward copy(@Nullable List<RewardItem> list, @Nullable String str, @Nullable String str2) {
        return new DisplayNextReward(list, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplayNextReward) {
            DisplayNextReward displayNextReward = (DisplayNextReward) obj;
            return Intrinsics.areEqual(this.nextReward, displayNextReward.nextReward) && Intrinsics.areEqual(this.nextRewardId, displayNextReward.nextRewardId) && Intrinsics.areEqual(this.nextRewardLabel, displayNextReward.nextRewardLabel);
        }
        return false;
    }

    @Nullable
    public final List<RewardItem> getNextReward() {
        return this.nextReward;
    }

    @Nullable
    public final String getNextRewardId() {
        return this.nextRewardId;
    }

    @Nullable
    public final String getNextRewardLabel() {
        return this.nextRewardLabel;
    }

    public int hashCode() {
        List<RewardItem> list = this.nextReward;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.nextRewardId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextRewardLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<RewardItem> list = this.nextReward;
        String str = this.nextRewardId;
        String str2 = this.nextRewardLabel;
        return "DisplayNextReward(nextReward=" + list + ", nextRewardId=" + str + ", nextRewardLabel=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.nextReward);
        parcel.writeString(this.nextRewardId);
        parcel.writeString(this.nextRewardLabel);
    }

    public DisplayNextReward(@Nullable List<RewardItem> list, @Nullable String str, @Nullable String str2) {
        this.nextReward = list;
        this.nextRewardId = str;
        this.nextRewardLabel = str2;
    }

    public /* synthetic */ DisplayNextReward(List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisplayNextReward(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(RewardItem.CREATOR), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}