package th.p047co.dtac.android.dtacone.model.postpaid.recommend_package;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\tHÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/RecommendPackageResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "packages", "", "Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/PackagesItem;", "transactionId", "", "(Ljava/util/List;Ljava/lang/String;)V", "getPackages", "()Ljava/util/List;", "getTransactionId", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.postpaid.recommend_package.RecommendPackageResponse */
/* loaded from: classes8.dex */
public final class RecommendPackageResponse implements Parcelable {
    @SerializedName("packages")
    @Nullable
    private final List<PackagesItem> packages;
    @SerializedName("transactionId")
    @Nullable
    private final String transactionId;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/RecommendPackageResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/RecommendPackageResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/postpaid/recommend_package/RecommendPackageResponse;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.postpaid.recommend_package.RecommendPackageResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<RecommendPackageResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecommendPackageResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecommendPackageResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public RecommendPackageResponse[] newArray(int i) {
            return new RecommendPackageResponse[i];
        }
    }

    public RecommendPackageResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendPackageResponse copy$default(RecommendPackageResponse recommendPackageResponse, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendPackageResponse.packages;
        }
        if ((i & 2) != 0) {
            str = recommendPackageResponse.transactionId;
        }
        return recommendPackageResponse.copy(list, str);
    }

    @Nullable
    public final List<PackagesItem> component1() {
        return this.packages;
    }

    @Nullable
    public final String component2() {
        return this.transactionId;
    }

    @NotNull
    public final RecommendPackageResponse copy(@Nullable List<PackagesItem> list, @Nullable String str) {
        return new RecommendPackageResponse(list, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RecommendPackageResponse) {
            RecommendPackageResponse recommendPackageResponse = (RecommendPackageResponse) obj;
            return Intrinsics.areEqual(this.packages, recommendPackageResponse.packages) && Intrinsics.areEqual(this.transactionId, recommendPackageResponse.transactionId);
        }
        return false;
    }

    @Nullable
    public final List<PackagesItem> getPackages() {
        return this.packages;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        List<PackagesItem> list = this.packages;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.transactionId;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PackagesItem> list = this.packages;
        String str = this.transactionId;
        return "RecommendPackageResponse(packages=" + list + ", transactionId=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.packages);
        parcel.writeString(this.transactionId);
    }

    public RecommendPackageResponse(@Nullable List<PackagesItem> list, @Nullable String str) {
        this.packages = list;
        this.transactionId = str;
    }

    public /* synthetic */ RecommendPackageResponse(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecommendPackageResponse(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(PackagesItem.CREATOR), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}