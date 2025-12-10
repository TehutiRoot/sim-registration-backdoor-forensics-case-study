package th.p047co.dtac.android.dtacone.model.campaign.detail.history;

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
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u001b\u0010\f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000eH\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "pointsHistory", "", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/PointsHistoryItem;", "(Ljava/util/List;)V", "getPointsHistory", "()Ljava/util/List;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.history.MyCampaignDetailHistoryResponse */
/* loaded from: classes8.dex */
public final class MyCampaignDetailHistoryResponse implements Parcelable {
    @SerializedName("pointsHistory")
    @Nullable
    private final List<PointsHistoryItem> pointsHistory;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/campaign/detail/history/MyCampaignDetailHistoryResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.campaign.detail.history.MyCampaignDetailHistoryResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<MyCampaignDetailHistoryResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MyCampaignDetailHistoryResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MyCampaignDetailHistoryResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public MyCampaignDetailHistoryResponse[] newArray(int i) {
            return new MyCampaignDetailHistoryResponse[i];
        }
    }

    public MyCampaignDetailHistoryResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyCampaignDetailHistoryResponse copy$default(MyCampaignDetailHistoryResponse myCampaignDetailHistoryResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = myCampaignDetailHistoryResponse.pointsHistory;
        }
        return myCampaignDetailHistoryResponse.copy(list);
    }

    @Nullable
    public final List<PointsHistoryItem> component1() {
        return this.pointsHistory;
    }

    @NotNull
    public final MyCampaignDetailHistoryResponse copy(@Nullable List<PointsHistoryItem> list) {
        return new MyCampaignDetailHistoryResponse(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MyCampaignDetailHistoryResponse) && Intrinsics.areEqual(this.pointsHistory, ((MyCampaignDetailHistoryResponse) obj).pointsHistory);
    }

    @Nullable
    public final List<PointsHistoryItem> getPointsHistory() {
        return this.pointsHistory;
    }

    public int hashCode() {
        List<PointsHistoryItem> list = this.pointsHistory;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<PointsHistoryItem> list = this.pointsHistory;
        return "MyCampaignDetailHistoryResponse(pointsHistory=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.pointsHistory);
    }

    public MyCampaignDetailHistoryResponse(@Nullable List<PointsHistoryItem> list) {
        this.pointsHistory = list;
    }

    public /* synthetic */ MyCampaignDetailHistoryResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyCampaignDetailHistoryResponse(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(PointsHistoryItem.CREATOR));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
