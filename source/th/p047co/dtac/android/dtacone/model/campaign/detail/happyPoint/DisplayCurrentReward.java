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
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B/\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0016H\u0016R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006!"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "currRewardId", "", "currReward", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardItem;", "currRewardLabel", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getCurrReward", "()Ljava/util/List;", "getCurrRewardId", "()Ljava/lang/String;", "getCurrRewardLabel", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.DisplayCurrentReward */
/* loaded from: classes8.dex */
public final class DisplayCurrentReward implements Parcelable {
    @SerializedName("curr_reward")
    @Nullable
    private final List<RewardItem> currReward;
    @SerializedName("curr_reward_id")
    @Nullable
    private final String currRewardId;
    @SerializedName("curr_reward_label")
    @Nullable
    private final String currRewardLabel;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.DisplayCurrentReward$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<DisplayCurrentReward> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DisplayCurrentReward createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DisplayCurrentReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public DisplayCurrentReward[] newArray(int i) {
            return new DisplayCurrentReward[i];
        }
    }

    public DisplayCurrentReward() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DisplayCurrentReward copy$default(DisplayCurrentReward displayCurrentReward, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = displayCurrentReward.currRewardId;
        }
        if ((i & 2) != 0) {
            list = displayCurrentReward.currReward;
        }
        if ((i & 4) != 0) {
            str2 = displayCurrentReward.currRewardLabel;
        }
        return displayCurrentReward.copy(str, list, str2);
    }

    @Nullable
    public final String component1() {
        return this.currRewardId;
    }

    @Nullable
    public final List<RewardItem> component2() {
        return this.currReward;
    }

    @Nullable
    public final String component3() {
        return this.currRewardLabel;
    }

    @NotNull
    public final DisplayCurrentReward copy(@Nullable String str, @Nullable List<RewardItem> list, @Nullable String str2) {
        return new DisplayCurrentReward(str, list, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DisplayCurrentReward) {
            DisplayCurrentReward displayCurrentReward = (DisplayCurrentReward) obj;
            return Intrinsics.areEqual(this.currRewardId, displayCurrentReward.currRewardId) && Intrinsics.areEqual(this.currReward, displayCurrentReward.currReward) && Intrinsics.areEqual(this.currRewardLabel, displayCurrentReward.currRewardLabel);
        }
        return false;
    }

    @Nullable
    public final List<RewardItem> getCurrReward() {
        return this.currReward;
    }

    @Nullable
    public final String getCurrRewardId() {
        return this.currRewardId;
    }

    @Nullable
    public final String getCurrRewardLabel() {
        return this.currRewardLabel;
    }

    public int hashCode() {
        String str = this.currRewardId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<RewardItem> list = this.currReward;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.currRewardLabel;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.currRewardId;
        List<RewardItem> list = this.currReward;
        String str2 = this.currRewardLabel;
        return "DisplayCurrentReward(currRewardId=" + str + ", currReward=" + list + ", currRewardLabel=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.currRewardId);
        parcel.writeTypedList(this.currReward);
        parcel.writeString(this.currRewardLabel);
    }

    public DisplayCurrentReward(@Nullable String str, @Nullable List<RewardItem> list, @Nullable String str2) {
        this.currRewardId = str;
        this.currReward = list;
        this.currRewardLabel = str2;
    }

    public /* synthetic */ DisplayCurrentReward(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisplayCurrentReward(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.createTypedArrayList(RewardItem.CREATOR), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
