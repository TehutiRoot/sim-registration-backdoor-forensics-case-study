package th.p047co.dtac.android.dtacone.model.esim;

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
@Metadata(m29143d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/esim/SIMSKUResponse;", "Landroid/os/Parcelable;", "packageGroup", "Lth/co/dtac/android/dtacone/model/esim/PackageGroup;", "(Lth/co/dtac/android/dtacone/model/esim/PackageGroup;)V", "getPackageGroup", "()Lth/co/dtac/android/dtacone/model/esim/PackageGroup;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.esim.SIMSKUResponse */
/* loaded from: classes8.dex */
public final class SIMSKUResponse implements Parcelable {
    public static final int $stable = 8;
    @NotNull
    public static final Parcelable.Creator<SIMSKUResponse> CREATOR = new Creator();
    @SerializedName("packageGroup")
    @Nullable
    private final PackageGroup packageGroup;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.esim.SIMSKUResponse$Creator */
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<SIMSKUResponse> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SIMSKUResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SIMSKUResponse(parcel.readInt() == 0 ? null : PackageGroup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final SIMSKUResponse[] newArray(int i) {
            return new SIMSKUResponse[i];
        }
    }

    public SIMSKUResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ SIMSKUResponse copy$default(SIMSKUResponse sIMSKUResponse, PackageGroup packageGroup, int i, Object obj) {
        if ((i & 1) != 0) {
            packageGroup = sIMSKUResponse.packageGroup;
        }
        return sIMSKUResponse.copy(packageGroup);
    }

    @Nullable
    public final PackageGroup component1() {
        return this.packageGroup;
    }

    @NotNull
    public final SIMSKUResponse copy(@Nullable PackageGroup packageGroup) {
        return new SIMSKUResponse(packageGroup);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SIMSKUResponse) && Intrinsics.areEqual(this.packageGroup, ((SIMSKUResponse) obj).packageGroup);
    }

    @Nullable
    public final PackageGroup getPackageGroup() {
        return this.packageGroup;
    }

    public int hashCode() {
        PackageGroup packageGroup = this.packageGroup;
        if (packageGroup == null) {
            return 0;
        }
        return packageGroup.hashCode();
    }

    @NotNull
    public String toString() {
        PackageGroup packageGroup = this.packageGroup;
        return "SIMSKUResponse(packageGroup=" + packageGroup + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        PackageGroup packageGroup = this.packageGroup;
        if (packageGroup == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        packageGroup.writeToParcel(out, i);
    }

    public SIMSKUResponse(@Nullable PackageGroup packageGroup) {
        this.packageGroup = packageGroup;
    }

    public /* synthetic */ SIMSKUResponse(PackageGroup packageGroup, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : packageGroup);
    }
}