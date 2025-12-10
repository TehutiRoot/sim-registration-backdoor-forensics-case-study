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
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BY\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\u0018\u0010&\u001a\u00020'2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u001fH\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "displayNextRewardImage", "", "displayDoMorePointNextRewardLabel", "displayDoMorePointNextRewardValue", "displayNextRewardName", "displayNextRewardValue", "displayNextRewardPoint", "displayNextRewardLabel", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayDoMorePointNextRewardLabel", "()Ljava/lang/String;", "getDisplayDoMorePointNextRewardValue", "getDisplayNextRewardImage", "getDisplayNextRewardLabel", "getDisplayNextRewardName", "getDisplayNextRewardPoint", "getDisplayNextRewardValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.NextReward */
/* loaded from: classes8.dex */
public final class NextReward implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @SerializedName("displayDoMorePointNextRewardLabel")
    @Nullable
    private final String displayDoMorePointNextRewardLabel;
    @SerializedName("displayDoMorePointNextRewardValue")
    @Nullable
    private final String displayDoMorePointNextRewardValue;
    @SerializedName("displayNextRewardImage")
    @Nullable
    private final String displayNextRewardImage;
    @SerializedName("displayNextRewardLabel")
    @Nullable
    private final String displayNextRewardLabel;
    @SerializedName("displayNextRewardName")
    @Nullable
    private final String displayNextRewardName;
    @SerializedName("displayNextRewardPoint")
    @Nullable
    private final String displayNextRewardPoint;
    @SerializedName("displayNextRewardValue")
    @Nullable
    private final String displayNextRewardValue;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/NextReward;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.NextReward$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<NextReward> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NextReward createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NextReward(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public NextReward[] newArray(int i) {
            return new NextReward[i];
        }
    }

    public NextReward() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ NextReward copy$default(NextReward nextReward, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nextReward.displayNextRewardImage;
        }
        if ((i & 2) != 0) {
            str2 = nextReward.displayDoMorePointNextRewardLabel;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = nextReward.displayDoMorePointNextRewardValue;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = nextReward.displayNextRewardName;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = nextReward.displayNextRewardValue;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = nextReward.displayNextRewardPoint;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = nextReward.displayNextRewardLabel;
        }
        return nextReward.copy(str, str8, str9, str10, str11, str12, str7);
    }

    @Nullable
    public final String component1() {
        return this.displayNextRewardImage;
    }

    @Nullable
    public final String component2() {
        return this.displayDoMorePointNextRewardLabel;
    }

    @Nullable
    public final String component3() {
        return this.displayDoMorePointNextRewardValue;
    }

    @Nullable
    public final String component4() {
        return this.displayNextRewardName;
    }

    @Nullable
    public final String component5() {
        return this.displayNextRewardValue;
    }

    @Nullable
    public final String component6() {
        return this.displayNextRewardPoint;
    }

    @Nullable
    public final String component7() {
        return this.displayNextRewardLabel;
    }

    @NotNull
    public final NextReward copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new NextReward(str, str2, str3, str4, str5, str6, str7);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NextReward) {
            NextReward nextReward = (NextReward) obj;
            return Intrinsics.areEqual(this.displayNextRewardImage, nextReward.displayNextRewardImage) && Intrinsics.areEqual(this.displayDoMorePointNextRewardLabel, nextReward.displayDoMorePointNextRewardLabel) && Intrinsics.areEqual(this.displayDoMorePointNextRewardValue, nextReward.displayDoMorePointNextRewardValue) && Intrinsics.areEqual(this.displayNextRewardName, nextReward.displayNextRewardName) && Intrinsics.areEqual(this.displayNextRewardValue, nextReward.displayNextRewardValue) && Intrinsics.areEqual(this.displayNextRewardPoint, nextReward.displayNextRewardPoint) && Intrinsics.areEqual(this.displayNextRewardLabel, nextReward.displayNextRewardLabel);
        }
        return false;
    }

    @Nullable
    public final String getDisplayDoMorePointNextRewardLabel() {
        return this.displayDoMorePointNextRewardLabel;
    }

    @Nullable
    public final String getDisplayDoMorePointNextRewardValue() {
        return this.displayDoMorePointNextRewardValue;
    }

    @Nullable
    public final String getDisplayNextRewardImage() {
        return this.displayNextRewardImage;
    }

    @Nullable
    public final String getDisplayNextRewardLabel() {
        return this.displayNextRewardLabel;
    }

    @Nullable
    public final String getDisplayNextRewardName() {
        return this.displayNextRewardName;
    }

    @Nullable
    public final String getDisplayNextRewardPoint() {
        return this.displayNextRewardPoint;
    }

    @Nullable
    public final String getDisplayNextRewardValue() {
        return this.displayNextRewardValue;
    }

    public int hashCode() {
        String str = this.displayNextRewardImage;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayDoMorePointNextRewardLabel;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayDoMorePointNextRewardValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayNextRewardName;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayNextRewardValue;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.displayNextRewardPoint;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.displayNextRewardLabel;
        return hashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.displayNextRewardImage;
        String str2 = this.displayDoMorePointNextRewardLabel;
        String str3 = this.displayDoMorePointNextRewardValue;
        String str4 = this.displayNextRewardName;
        String str5 = this.displayNextRewardValue;
        String str6 = this.displayNextRewardPoint;
        String str7 = this.displayNextRewardLabel;
        return "NextReward(displayNextRewardImage=" + str + ", displayDoMorePointNextRewardLabel=" + str2 + ", displayDoMorePointNextRewardValue=" + str3 + ", displayNextRewardName=" + str4 + ", displayNextRewardValue=" + str5 + ", displayNextRewardPoint=" + str6 + ", displayNextRewardLabel=" + str7 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.displayNextRewardImage);
        parcel.writeString(this.displayDoMorePointNextRewardLabel);
        parcel.writeString(this.displayDoMorePointNextRewardValue);
        parcel.writeString(this.displayNextRewardName);
        parcel.writeString(this.displayNextRewardValue);
        parcel.writeString(this.displayNextRewardPoint);
        parcel.writeString(this.displayNextRewardLabel);
    }

    public NextReward(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.displayNextRewardImage = str;
        this.displayDoMorePointNextRewardLabel = str2;
        this.displayDoMorePointNextRewardValue = str3;
        this.displayNextRewardName = str4;
        this.displayNextRewardValue = str5;
        this.displayNextRewardPoint = str6;
        this.displayNextRewardLabel = str7;
    }

    public /* synthetic */ NextReward(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NextReward(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}