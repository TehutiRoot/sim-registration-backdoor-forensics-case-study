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
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BM\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u001cH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006'"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "displayCurrentRewardLabel", "", "displayCurrentRewardImage", "displayCurrentRewardName", "displayCurrentRewardPoint", "displayCurrentRewardValue", "displayRedemptionPeriod", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayCurrentRewardImage", "()Ljava/lang/String;", "getDisplayCurrentRewardLabel", "getDisplayCurrentRewardName", "getDisplayCurrentRewardPoint", "getDisplayCurrentRewardValue", "getDisplayRedemptionPeriod", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.CurrentReward */
/* loaded from: classes8.dex */
public final class CurrentReward implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("displayCurrentRewardImage")
    @Nullable
    private final String displayCurrentRewardImage;
    @SerializedName("displayCurrentRewardLabel")
    @Nullable
    private final String displayCurrentRewardLabel;
    @SerializedName("displayCurrentRewardName")
    @Nullable
    private final String displayCurrentRewardName;
    @SerializedName("displayCurrentRewardPoint")
    @Nullable
    private final String displayCurrentRewardPoint;
    @SerializedName("displayCurrentRewardValue")
    @Nullable
    private final String displayCurrentRewardValue;
    @SerializedName("displayRedemptionPeriod")
    @Nullable
    private final String displayRedemptionPeriod;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/CurrentReward;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.CurrentReward$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<CurrentReward> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CurrentReward createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrentReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public CurrentReward[] newArray(int i) {
            return new CurrentReward[i];
        }
    }

    public CurrentReward() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ CurrentReward copy$default(CurrentReward currentReward, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = currentReward.displayCurrentRewardLabel;
        }
        if ((i & 2) != 0) {
            str2 = currentReward.displayCurrentRewardImage;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = currentReward.displayCurrentRewardName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = currentReward.displayCurrentRewardPoint;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = currentReward.displayCurrentRewardValue;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = currentReward.displayRedemptionPeriod;
        }
        return currentReward.copy(str, str7, str8, str9, str10, str6);
    }

    @Nullable
    public final String component1() {
        return this.displayCurrentRewardLabel;
    }

    @Nullable
    public final String component2() {
        return this.displayCurrentRewardImage;
    }

    @Nullable
    public final String component3() {
        return this.displayCurrentRewardName;
    }

    @Nullable
    public final String component4() {
        return this.displayCurrentRewardPoint;
    }

    @Nullable
    public final String component5() {
        return this.displayCurrentRewardValue;
    }

    @Nullable
    public final String component6() {
        return this.displayRedemptionPeriod;
    }

    @NotNull
    public final CurrentReward copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new CurrentReward(str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CurrentReward) {
            CurrentReward currentReward = (CurrentReward) obj;
            return Intrinsics.areEqual(this.displayCurrentRewardLabel, currentReward.displayCurrentRewardLabel) && Intrinsics.areEqual(this.displayCurrentRewardImage, currentReward.displayCurrentRewardImage) && Intrinsics.areEqual(this.displayCurrentRewardName, currentReward.displayCurrentRewardName) && Intrinsics.areEqual(this.displayCurrentRewardPoint, currentReward.displayCurrentRewardPoint) && Intrinsics.areEqual(this.displayCurrentRewardValue, currentReward.displayCurrentRewardValue) && Intrinsics.areEqual(this.displayRedemptionPeriod, currentReward.displayRedemptionPeriod);
        }
        return false;
    }

    @Nullable
    public final String getDisplayCurrentRewardImage() {
        return this.displayCurrentRewardImage;
    }

    @Nullable
    public final String getDisplayCurrentRewardLabel() {
        return this.displayCurrentRewardLabel;
    }

    @Nullable
    public final String getDisplayCurrentRewardName() {
        return this.displayCurrentRewardName;
    }

    @Nullable
    public final String getDisplayCurrentRewardPoint() {
        return this.displayCurrentRewardPoint;
    }

    @Nullable
    public final String getDisplayCurrentRewardValue() {
        return this.displayCurrentRewardValue;
    }

    @Nullable
    public final String getDisplayRedemptionPeriod() {
        return this.displayRedemptionPeriod;
    }

    public int hashCode() {
        String str = this.displayCurrentRewardLabel;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayCurrentRewardImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayCurrentRewardName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayCurrentRewardPoint;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayCurrentRewardValue;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayRedemptionPeriod;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.displayCurrentRewardLabel;
        String str2 = this.displayCurrentRewardImage;
        String str3 = this.displayCurrentRewardName;
        String str4 = this.displayCurrentRewardPoint;
        String str5 = this.displayCurrentRewardValue;
        String str6 = this.displayRedemptionPeriod;
        return "CurrentReward(displayCurrentRewardLabel=" + str + ", displayCurrentRewardImage=" + str2 + ", displayCurrentRewardName=" + str3 + ", displayCurrentRewardPoint=" + str4 + ", displayCurrentRewardValue=" + str5 + ", displayRedemptionPeriod=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.displayCurrentRewardLabel);
        parcel.writeString(this.displayCurrentRewardImage);
        parcel.writeString(this.displayCurrentRewardName);
        parcel.writeString(this.displayCurrentRewardPoint);
        parcel.writeString(this.displayCurrentRewardValue);
        parcel.writeString(this.displayRedemptionPeriod);
    }

    public CurrentReward(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.displayCurrentRewardLabel = str;
        this.displayCurrentRewardImage = str2;
        this.displayCurrentRewardName = str3;
        this.displayCurrentRewardPoint = str4;
        this.displayCurrentRewardValue = str5;
        this.displayRedemptionPeriod = str6;
    }

    public /* synthetic */ CurrentReward(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CurrentReward(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
