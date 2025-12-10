package th.p047co.dtac.android.dtacone.model.changeMainPack.packageList.response;

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
@Metadata(m28851d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bHÆ\u0001J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0012H\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/GetMainPackageResponse;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "defaultPackage", "Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/MainPackage;", "packages", "", "(Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/MainPackage;Ljava/util/List;)V", "getDefaultPackage", "()Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/MainPackage;", "getPackages", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.changeMainPack.packageList.response.GetMainPackageResponse */
/* loaded from: classes8.dex */
public final class GetMainPackageResponse implements Parcelable {
    @SerializedName("default")
    @Nullable
    private final MainPackage defaultPackage;
    @SerializedName("packages")
    @Nullable
    private final List<MainPackage> packages;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/GetMainPackageResponse$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/GetMainPackageResponse;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/changeMainPack/packageList/response/GetMainPackageResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.changeMainPack.packageList.response.GetMainPackageResponse$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<GetMainPackageResponse> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetMainPackageResponse createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GetMainPackageResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public GetMainPackageResponse[] newArray(int i) {
            return new GetMainPackageResponse[i];
        }
    }

    public GetMainPackageResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetMainPackageResponse copy$default(GetMainPackageResponse getMainPackageResponse, MainPackage mainPackage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            mainPackage = getMainPackageResponse.defaultPackage;
        }
        if ((i & 2) != 0) {
            list = getMainPackageResponse.packages;
        }
        return getMainPackageResponse.copy(mainPackage, list);
    }

    @Nullable
    public final MainPackage component1() {
        return this.defaultPackage;
    }

    @Nullable
    public final List<MainPackage> component2() {
        return this.packages;
    }

    @NotNull
    public final GetMainPackageResponse copy(@Nullable MainPackage mainPackage, @Nullable List<MainPackage> list) {
        return new GetMainPackageResponse(mainPackage, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetMainPackageResponse) {
            GetMainPackageResponse getMainPackageResponse = (GetMainPackageResponse) obj;
            return Intrinsics.areEqual(this.defaultPackage, getMainPackageResponse.defaultPackage) && Intrinsics.areEqual(this.packages, getMainPackageResponse.packages);
        }
        return false;
    }

    @Nullable
    public final MainPackage getDefaultPackage() {
        return this.defaultPackage;
    }

    @Nullable
    public final List<MainPackage> getPackages() {
        return this.packages;
    }

    public int hashCode() {
        MainPackage mainPackage = this.defaultPackage;
        int hashCode = (mainPackage == null ? 0 : mainPackage.hashCode()) * 31;
        List<MainPackage> list = this.packages;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        MainPackage mainPackage = this.defaultPackage;
        List<MainPackage> list = this.packages;
        return "GetMainPackageResponse(defaultPackage=" + mainPackage + ", packages=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeParcelable(this.defaultPackage, i);
        parcel.writeTypedList(this.packages);
    }

    public GetMainPackageResponse(@Nullable MainPackage mainPackage, @Nullable List<MainPackage> list) {
        this.defaultPackage = mainPackage;
        this.packages = list;
    }

    public /* synthetic */ GetMainPackageResponse(MainPackage mainPackage, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mainPackage, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMainPackageResponse(@NotNull Parcel parcel) {
        this((MainPackage) parcel.readParcelable(MainPackage.class.getClassLoader()), parcel.createTypedArrayList(MainPackage.CREATOR));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
