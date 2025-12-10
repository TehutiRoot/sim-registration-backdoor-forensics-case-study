package th.p047co.dtac.android.dtacone.model.campaign.reward;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "detailLeft", "", "detailRight", "typeLine", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDetailLeft", "()Ljava/lang/String;", "getDetailRight", "getTypeLine", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem */
/* loaded from: classes8.dex */
public final class RewardRoadmapItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final String detailLeft;
    @Nullable
    private final String detailRight;
    @Nullable
    private final String typeLine;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/reward/RewardRoadmapItem;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.reward.RewardRoadmapItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<RewardRoadmapItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RewardRoadmapItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RewardRoadmapItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RewardRoadmapItem[] newArray(int i) {
            return new RewardRoadmapItem[i];
        }
    }

    public RewardRoadmapItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ RewardRoadmapItem copy$default(RewardRoadmapItem rewardRoadmapItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardRoadmapItem.detailLeft;
        }
        if ((i & 2) != 0) {
            str2 = rewardRoadmapItem.detailRight;
        }
        if ((i & 4) != 0) {
            str3 = rewardRoadmapItem.typeLine;
        }
        return rewardRoadmapItem.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.detailLeft;
    }

    @Nullable
    public final String component2() {
        return this.detailRight;
    }

    @Nullable
    public final String component3() {
        return this.typeLine;
    }

    @NotNull
    public final RewardRoadmapItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new RewardRoadmapItem(str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RewardRoadmapItem) {
            RewardRoadmapItem rewardRoadmapItem = (RewardRoadmapItem) obj;
            return Intrinsics.areEqual(this.detailLeft, rewardRoadmapItem.detailLeft) && Intrinsics.areEqual(this.detailRight, rewardRoadmapItem.detailRight) && Intrinsics.areEqual(this.typeLine, rewardRoadmapItem.typeLine);
        }
        return false;
    }

    @Nullable
    public final String getDetailLeft() {
        return this.detailLeft;
    }

    @Nullable
    public final String getDetailRight() {
        return this.detailRight;
    }

    @Nullable
    public final String getTypeLine() {
        return this.typeLine;
    }

    public int hashCode() {
        String str = this.detailLeft;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.detailRight;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.typeLine;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.detailLeft;
        String str2 = this.detailRight;
        String str3 = this.typeLine;
        return "RewardRoadmapItem(detailLeft=" + str + ", detailRight=" + str2 + ", typeLine=" + str3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.detailLeft);
        parcel.writeString(this.detailRight);
        parcel.writeString(this.typeLine);
    }

    public RewardRoadmapItem(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.detailLeft = str;
        this.detailRight = str2;
        this.typeLine = str3;
    }

    public /* synthetic */ RewardRoadmapItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardRoadmapItem(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
