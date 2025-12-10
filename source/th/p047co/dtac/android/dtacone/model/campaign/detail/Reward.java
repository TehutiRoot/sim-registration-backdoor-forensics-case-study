package th.p047co.dtac.android.dtacone.model.campaign.detail;

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
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003J!\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "nextReward", "Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;", "currentReward", "Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;", "(Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;)V", "getCurrentReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;", "getNextReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.Reward */
/* loaded from: classes8.dex */
public final class Reward implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("currentReward")
    @Nullable
    private final CurrentReward currentReward;
    @SerializedName("nextReward")
    @Nullable
    private final NextReward nextReward;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/Reward$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/Reward;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.Reward$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<Reward> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Reward createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Reward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public Reward[] newArray(int i) {
            return new Reward[i];
        }
    }

    public Reward() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Reward copy$default(Reward reward, NextReward nextReward, CurrentReward currentReward, int i, Object obj) {
        if ((i & 1) != 0) {
            nextReward = reward.nextReward;
        }
        if ((i & 2) != 0) {
            currentReward = reward.currentReward;
        }
        return reward.copy(nextReward, currentReward);
    }

    @Nullable
    public final NextReward component1() {
        return this.nextReward;
    }

    @Nullable
    public final CurrentReward component2() {
        return this.currentReward;
    }

    @NotNull
    public final Reward copy(@Nullable NextReward nextReward, @Nullable CurrentReward currentReward) {
        return new Reward(nextReward, currentReward);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Reward) {
            Reward reward = (Reward) obj;
            return Intrinsics.areEqual(this.nextReward, reward.nextReward) && Intrinsics.areEqual(this.currentReward, reward.currentReward);
        }
        return false;
    }

    @Nullable
    public final CurrentReward getCurrentReward() {
        return this.currentReward;
    }

    @Nullable
    public final NextReward getNextReward() {
        return this.nextReward;
    }

    public int hashCode() {
        NextReward nextReward = this.nextReward;
        int hashCode = (nextReward == null ? 0 : nextReward.hashCode()) * 31;
        CurrentReward currentReward = this.currentReward;
        return hashCode + (currentReward != null ? currentReward.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        NextReward nextReward = this.nextReward;
        CurrentReward currentReward = this.currentReward;
        return "Reward(nextReward=" + nextReward + ", currentReward=" + currentReward + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.nextReward, i);
        parcel.writeParcelable(this.currentReward, i);
    }

    public Reward(@Nullable NextReward nextReward, @Nullable CurrentReward currentReward) {
        this.nextReward = nextReward;
        this.currentReward = currentReward;
    }

    public /* synthetic */ Reward(NextReward nextReward, CurrentReward currentReward, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nextReward, (i & 2) != 0 ? null : currentReward);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Reward(@NotNull Parcel parcel) {
        this((NextReward) parcel.readParcelable(NextReward.class.getClassLoader()), (CurrentReward) parcel.readParcelable(CurrentReward.class.getClassLoader()));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
