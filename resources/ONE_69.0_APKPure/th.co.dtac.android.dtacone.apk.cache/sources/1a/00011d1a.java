package th.p047co.dtac.android.dtacone.model.campaign.detail.history;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001bHÖ\u0001J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001bH\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006&"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/history/PointsHistoryItem;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "reward", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/Reward;", "usageDate", "", "pointsType", MessageBundle.TITLE_ENTRY, "points", "(Lth/co/dtac/android/dtacone/model/campaign/detail/history/Reward;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPoints", "()Ljava/lang/String;", "getPointsType", "getReward", "()Lth/co/dtac/android/dtacone/model/campaign/detail/history/Reward;", "getTitle", "getUsageDate", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.history.PointsHistoryItem */
/* loaded from: classes8.dex */
public final class PointsHistoryItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("points")
    @Nullable
    private final String points;
    @SerializedName("pointsType")
    @Nullable
    private final String pointsType;
    @SerializedName("reward")
    @Nullable
    private final Reward reward;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;
    @SerializedName("usageDate")
    @Nullable
    private final String usageDate;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/history/PointsHistoryItem$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/PointsHistoryItem;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/history/PointsHistoryItem;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.history.PointsHistoryItem$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<PointsHistoryItem> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PointsHistoryItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PointsHistoryItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public PointsHistoryItem[] newArray(int i) {
            return new PointsHistoryItem[i];
        }
    }

    public PointsHistoryItem() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ PointsHistoryItem copy$default(PointsHistoryItem pointsHistoryItem, Reward reward, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            reward = pointsHistoryItem.reward;
        }
        if ((i & 2) != 0) {
            str = pointsHistoryItem.usageDate;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = pointsHistoryItem.pointsType;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = pointsHistoryItem.title;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = pointsHistoryItem.points;
        }
        return pointsHistoryItem.copy(reward, str5, str6, str7, str4);
    }

    @Nullable
    public final Reward component1() {
        return this.reward;
    }

    @Nullable
    public final String component2() {
        return this.usageDate;
    }

    @Nullable
    public final String component3() {
        return this.pointsType;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final String component5() {
        return this.points;
    }

    @NotNull
    public final PointsHistoryItem copy(@Nullable Reward reward, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new PointsHistoryItem(reward, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointsHistoryItem) {
            PointsHistoryItem pointsHistoryItem = (PointsHistoryItem) obj;
            return Intrinsics.areEqual(this.reward, pointsHistoryItem.reward) && Intrinsics.areEqual(this.usageDate, pointsHistoryItem.usageDate) && Intrinsics.areEqual(this.pointsType, pointsHistoryItem.pointsType) && Intrinsics.areEqual(this.title, pointsHistoryItem.title) && Intrinsics.areEqual(this.points, pointsHistoryItem.points);
        }
        return false;
    }

    @Nullable
    public final String getPoints() {
        return this.points;
    }

    @Nullable
    public final String getPointsType() {
        return this.pointsType;
    }

    @Nullable
    public final Reward getReward() {
        return this.reward;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getUsageDate() {
        return this.usageDate;
    }

    public int hashCode() {
        Reward reward = this.reward;
        int hashCode = (reward == null ? 0 : reward.hashCode()) * 31;
        String str = this.usageDate;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pointsType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.points;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Reward reward = this.reward;
        String str = this.usageDate;
        String str2 = this.pointsType;
        String str3 = this.title;
        String str4 = this.points;
        return "PointsHistoryItem(reward=" + reward + ", usageDate=" + str + ", pointsType=" + str2 + ", title=" + str3 + ", points=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.reward, i);
        parcel.writeString(this.usageDate);
        parcel.writeString(this.pointsType);
        parcel.writeString(this.title);
        parcel.writeString(this.points);
    }

    public PointsHistoryItem(@Nullable Reward reward, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.reward = reward;
        this.usageDate = str;
        this.pointsType = str2;
        this.title = str3;
        this.points = str4;
    }

    public /* synthetic */ PointsHistoryItem(Reward reward, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : reward, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PointsHistoryItem(@NotNull Parcel parcel) {
        this((Reward) parcel.readParcelable(Reward.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}