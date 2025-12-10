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
@Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0018"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/count/Mission;", "Landroid/os/Parcelable;", "newMissionCount", "", "(Ljava/lang/Integer;)V", "getNewMissionCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lth/co/dtac/android/dtacone/model/campaign/count/Mission;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.count.Mission */
/* loaded from: classes8.dex */
public final class Mission implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<Mission> CREATOR = new Creator();
    @SerializedName("newMissionCount")
    @Nullable
    private final Integer newMissionCount;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.count.Mission$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<Mission> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Mission createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Mission(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Mission[] newArray(int i) {
            return new Mission[i];
        }
    }

    public Mission() {
        this(null, 1, null);
    }

    public static /* synthetic */ Mission copy$default(Mission mission, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = mission.newMissionCount;
        }
        return mission.copy(num);
    }

    @Nullable
    public final Integer component1() {
        return this.newMissionCount;
    }

    @NotNull
    public final Mission copy(@Nullable Integer num) {
        return new Mission(num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mission) && Intrinsics.areEqual(this.newMissionCount, ((Mission) obj).newMissionCount);
    }

    @Nullable
    public final Integer getNewMissionCount() {
        return this.newMissionCount;
    }

    public int hashCode() {
        Integer num = this.newMissionCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    @NotNull
    public String toString() {
        Integer num = this.newMissionCount;
        return "Mission(newMissionCount=" + num + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        Integer num = this.newMissionCount;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
    }

    public Mission(@Nullable Integer num) {
        this.newMissionCount = num;
    }

    public /* synthetic */ Mission(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num);
    }
}
