package th.p047co.dtac.android.dtacone.model.newsfeed;

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
@Metadata(m29143d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0081\u0001\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/newsfeed/ResultMissionItem;", "Landroid/os/Parcelable;", "missionDescription", "", "displayDate", "statusOptin", "missionEndDate", "missionObjective", "missionStartDate", "missionTarget", "missionName", "missionReward", "missionPeriodShow", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayDate", "()Ljava/lang/String;", "getMissionDescription", "getMissionEndDate", "getMissionName", "getMissionObjective", "getMissionPeriodShow", "getMissionReward", "getMissionStartDate", "getMissionTarget", "getStatusOptin", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.newsfeed.ResultMissionItem */
/* loaded from: classes8.dex */
public final class ResultMissionItem implements Parcelable {
    public static final int $stable = 0;
    @NotNull
    public static final Parcelable.Creator<ResultMissionItem> CREATOR = new Creator();
    @SerializedName("DisplayDate")
    @Nullable
    private final String displayDate;
    @SerializedName("MissionDescription")
    @Nullable
    private final String missionDescription;
    @SerializedName("MissionEndDate")
    @Nullable
    private final String missionEndDate;
    @SerializedName("MissionName")
    @Nullable
    private final String missionName;
    @SerializedName("MissionObjective")
    @Nullable
    private final String missionObjective;
    @SerializedName("MissionPeriod_show")
    @Nullable
    private final String missionPeriodShow;
    @SerializedName("MissionReward")
    @Nullable
    private final String missionReward;
    @SerializedName("MissionStartDate")
    @Nullable
    private final String missionStartDate;
    @SerializedName("MissionTarget")
    @Nullable
    private final String missionTarget;
    @SerializedName("StatusOptin")
    @Nullable
    private final String statusOptin;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.newsfeed.ResultMissionItem$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<ResultMissionItem> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ResultMissionItem createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ResultMissionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ResultMissionItem[] newArray(int i) {
            return new ResultMissionItem[i];
        }
    }

    public ResultMissionItem() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    @Nullable
    public final String component1() {
        return this.missionDescription;
    }

    @Nullable
    public final String component10() {
        return this.missionPeriodShow;
    }

    @Nullable
    public final String component2() {
        return this.displayDate;
    }

    @Nullable
    public final String component3() {
        return this.statusOptin;
    }

    @Nullable
    public final String component4() {
        return this.missionEndDate;
    }

    @Nullable
    public final String component5() {
        return this.missionObjective;
    }

    @Nullable
    public final String component6() {
        return this.missionStartDate;
    }

    @Nullable
    public final String component7() {
        return this.missionTarget;
    }

    @Nullable
    public final String component8() {
        return this.missionName;
    }

    @Nullable
    public final String component9() {
        return this.missionReward;
    }

    @NotNull
    public final ResultMissionItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        return new ResultMissionItem(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ResultMissionItem) {
            ResultMissionItem resultMissionItem = (ResultMissionItem) obj;
            return Intrinsics.areEqual(this.missionDescription, resultMissionItem.missionDescription) && Intrinsics.areEqual(this.displayDate, resultMissionItem.displayDate) && Intrinsics.areEqual(this.statusOptin, resultMissionItem.statusOptin) && Intrinsics.areEqual(this.missionEndDate, resultMissionItem.missionEndDate) && Intrinsics.areEqual(this.missionObjective, resultMissionItem.missionObjective) && Intrinsics.areEqual(this.missionStartDate, resultMissionItem.missionStartDate) && Intrinsics.areEqual(this.missionTarget, resultMissionItem.missionTarget) && Intrinsics.areEqual(this.missionName, resultMissionItem.missionName) && Intrinsics.areEqual(this.missionReward, resultMissionItem.missionReward) && Intrinsics.areEqual(this.missionPeriodShow, resultMissionItem.missionPeriodShow);
        }
        return false;
    }

    @Nullable
    public final String getDisplayDate() {
        return this.displayDate;
    }

    @Nullable
    public final String getMissionDescription() {
        return this.missionDescription;
    }

    @Nullable
    public final String getMissionEndDate() {
        return this.missionEndDate;
    }

    @Nullable
    public final String getMissionName() {
        return this.missionName;
    }

    @Nullable
    public final String getMissionObjective() {
        return this.missionObjective;
    }

    @Nullable
    public final String getMissionPeriodShow() {
        return this.missionPeriodShow;
    }

    @Nullable
    public final String getMissionReward() {
        return this.missionReward;
    }

    @Nullable
    public final String getMissionStartDate() {
        return this.missionStartDate;
    }

    @Nullable
    public final String getMissionTarget() {
        return this.missionTarget;
    }

    @Nullable
    public final String getStatusOptin() {
        return this.statusOptin;
    }

    public int hashCode() {
        String str = this.missionDescription;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.displayDate;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.statusOptin;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.missionEndDate;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.missionObjective;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.missionStartDate;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.missionTarget;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.missionName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.missionReward;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.missionPeriodShow;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.missionDescription;
        String str2 = this.displayDate;
        String str3 = this.statusOptin;
        String str4 = this.missionEndDate;
        String str5 = this.missionObjective;
        String str6 = this.missionStartDate;
        String str7 = this.missionTarget;
        String str8 = this.missionName;
        String str9 = this.missionReward;
        String str10 = this.missionPeriodShow;
        return "ResultMissionItem(missionDescription=" + str + ", displayDate=" + str2 + ", statusOptin=" + str3 + ", missionEndDate=" + str4 + ", missionObjective=" + str5 + ", missionStartDate=" + str6 + ", missionTarget=" + str7 + ", missionName=" + str8 + ", missionReward=" + str9 + ", missionPeriodShow=" + str10 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.missionDescription);
        out.writeString(this.displayDate);
        out.writeString(this.statusOptin);
        out.writeString(this.missionEndDate);
        out.writeString(this.missionObjective);
        out.writeString(this.missionStartDate);
        out.writeString(this.missionTarget);
        out.writeString(this.missionName);
        out.writeString(this.missionReward);
        out.writeString(this.missionPeriodShow);
    }

    public ResultMissionItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.missionDescription = str;
        this.displayDate = str2;
        this.statusOptin = str3;
        this.missionEndDate = str4;
        this.missionObjective = str5;
        this.missionStartDate = str6;
        this.missionTarget = str7;
        this.missionName = str8;
        this.missionReward = str9;
        this.missionPeriodShow = str10;
    }

    public /* synthetic */ ResultMissionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "");
    }
}