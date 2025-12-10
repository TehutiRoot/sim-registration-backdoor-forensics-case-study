package th.p047co.dtac.android.dtacone.model.campaign.detail.happyPoint;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "displayCurrentReward", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;", "displayNextReward", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;", "(Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;)V", "getDisplayCurrentReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayCurrentReward;", "getDisplayNextReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/DisplayNextReward;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.RewardList */
/* loaded from: classes8.dex */
public final class RewardList implements Parcelable {
    @SerializedName("display_current_reward")
    @Nullable
    private final DisplayCurrentReward displayCurrentReward;
    @SerializedName("display_next_reward")
    @Nullable
    private final DisplayNextReward displayNextReward;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/happyPoint/RewardList;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.happyPoint.RewardList$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<RewardList> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RewardList createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardList(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RewardList[] newArray(int i) {
            return new RewardList[i];
        }
    }

    public RewardList() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RewardList copy$default(RewardList rewardList, DisplayCurrentReward displayCurrentReward, DisplayNextReward displayNextReward, int i, Object obj) {
        if ((i & 1) != 0) {
            displayCurrentReward = rewardList.displayCurrentReward;
        }
        if ((i & 2) != 0) {
            displayNextReward = rewardList.displayNextReward;
        }
        return rewardList.copy(displayCurrentReward, displayNextReward);
    }

    @Nullable
    public final DisplayCurrentReward component1() {
        return this.displayCurrentReward;
    }

    @Nullable
    public final DisplayNextReward component2() {
        return this.displayNextReward;
    }

    @NotNull
    public final RewardList copy(@Nullable DisplayCurrentReward displayCurrentReward, @Nullable DisplayNextReward displayNextReward) {
        return new RewardList(displayCurrentReward, displayNextReward);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RewardList) {
            RewardList rewardList = (RewardList) obj;
            return Intrinsics.areEqual(this.displayCurrentReward, rewardList.displayCurrentReward) && Intrinsics.areEqual(this.displayNextReward, rewardList.displayNextReward);
        }
        return false;
    }

    @Nullable
    public final DisplayCurrentReward getDisplayCurrentReward() {
        return this.displayCurrentReward;
    }

    @Nullable
    public final DisplayNextReward getDisplayNextReward() {
        return this.displayNextReward;
    }

    public int hashCode() {
        DisplayCurrentReward displayCurrentReward = this.displayCurrentReward;
        int hashCode = (displayCurrentReward == null ? 0 : displayCurrentReward.hashCode()) * 31;
        DisplayNextReward displayNextReward = this.displayNextReward;
        return hashCode + (displayNextReward != null ? displayNextReward.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        DisplayCurrentReward displayCurrentReward = this.displayCurrentReward;
        DisplayNextReward displayNextReward = this.displayNextReward;
        return "RewardList(displayCurrentReward=" + displayCurrentReward + ", displayNextReward=" + displayNextReward + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.displayCurrentReward, i);
        parcel.writeParcelable(this.displayNextReward, i);
    }

    public RewardList(@Nullable DisplayCurrentReward displayCurrentReward, @Nullable DisplayNextReward displayNextReward) {
        this.displayCurrentReward = displayCurrentReward;
        this.displayNextReward = displayNextReward;
    }

    public /* synthetic */ RewardList(DisplayCurrentReward displayCurrentReward, DisplayNextReward displayNextReward, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : displayCurrentReward, (i & 2) != 0 ? null : displayNextReward);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardList(@NotNull Parcel parcel) {
        this((DisplayCurrentReward) parcel.readParcelable(DisplayCurrentReward.class.getClassLoader()), (DisplayNextReward) parcel.readParcelable(DisplayNextReward.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
