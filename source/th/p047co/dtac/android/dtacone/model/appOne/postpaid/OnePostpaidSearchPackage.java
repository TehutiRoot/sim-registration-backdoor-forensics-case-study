package th.p047co.dtac.android.dtacone.model.appOne.postpaid;

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
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u000bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0018H\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006#"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "packages", "", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackageName;", "paginate", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackagePaginate;", "message", "", "(Ljava/util/List;Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackagePaginate;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getPackages", "()Ljava/util/List;", "getPaginate", "()Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackagePaginate;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "flags", "CREATOR", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage */
/* loaded from: classes8.dex */
public final class OnePostpaidSearchPackage implements Parcelable {
    @Nullable
    private final transient String message;
    @SerializedName("packages")
    @Nullable
    private final List<OnePostpaidSearchPackageName> packages;
    @SerializedName("paginate")
    @Nullable
    private final OnePostpaidSearchPackagePaginate paginate;
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage$CREATOR */
    /* loaded from: classes8.dex */
    public static final class CREATOR implements Parcelable.Creator<OnePostpaidSearchPackage> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidSearchPackage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OnePostpaidSearchPackage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public OnePostpaidSearchPackage[] newArray(int i) {
            return new OnePostpaidSearchPackage[i];
        }
    }

    public OnePostpaidSearchPackage(@Nullable List<OnePostpaidSearchPackageName> list, @Nullable OnePostpaidSearchPackagePaginate onePostpaidSearchPackagePaginate, @Nullable String str) {
        this.packages = list;
        this.paginate = onePostpaidSearchPackagePaginate;
        this.message = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnePostpaidSearchPackage copy$default(OnePostpaidSearchPackage onePostpaidSearchPackage, List list, OnePostpaidSearchPackagePaginate onePostpaidSearchPackagePaginate, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onePostpaidSearchPackage.packages;
        }
        if ((i & 2) != 0) {
            onePostpaidSearchPackagePaginate = onePostpaidSearchPackage.paginate;
        }
        if ((i & 4) != 0) {
            str = onePostpaidSearchPackage.message;
        }
        return onePostpaidSearchPackage.copy(list, onePostpaidSearchPackagePaginate, str);
    }

    @Nullable
    public final List<OnePostpaidSearchPackageName> component1() {
        return this.packages;
    }

    @Nullable
    public final OnePostpaidSearchPackagePaginate component2() {
        return this.paginate;
    }

    @Nullable
    public final String component3() {
        return this.message;
    }

    @NotNull
    public final OnePostpaidSearchPackage copy(@Nullable List<OnePostpaidSearchPackageName> list, @Nullable OnePostpaidSearchPackagePaginate onePostpaidSearchPackagePaginate, @Nullable String str) {
        return new OnePostpaidSearchPackage(list, onePostpaidSearchPackagePaginate, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnePostpaidSearchPackage) {
            OnePostpaidSearchPackage onePostpaidSearchPackage = (OnePostpaidSearchPackage) obj;
            return Intrinsics.areEqual(this.packages, onePostpaidSearchPackage.packages) && Intrinsics.areEqual(this.paginate, onePostpaidSearchPackage.paginate) && Intrinsics.areEqual(this.message, onePostpaidSearchPackage.message);
        }
        return false;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final List<OnePostpaidSearchPackageName> getPackages() {
        return this.packages;
    }

    @Nullable
    public final OnePostpaidSearchPackagePaginate getPaginate() {
        return this.paginate;
    }

    public int hashCode() {
        List<OnePostpaidSearchPackageName> list = this.packages;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        OnePostpaidSearchPackagePaginate onePostpaidSearchPackagePaginate = this.paginate;
        int hashCode2 = (hashCode + (onePostpaidSearchPackagePaginate == null ? 0 : onePostpaidSearchPackagePaginate.hashCode())) * 31;
        String str = this.message;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<OnePostpaidSearchPackageName> list = this.packages;
        OnePostpaidSearchPackagePaginate onePostpaidSearchPackagePaginate = this.paginate;
        String str = this.message;
        return "OnePostpaidSearchPackage(packages=" + list + ", paginate=" + onePostpaidSearchPackagePaginate + ", message=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.packages);
        parcel.writeParcelable(this.paginate, i);
        parcel.writeString(this.message);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OnePostpaidSearchPackage(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(OnePostpaidSearchPackageName.CREATOR), (OnePostpaidSearchPackagePaginate) parcel.readParcelable(OnePostpaidSearchPackagePaginate.class.getClassLoader()), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
