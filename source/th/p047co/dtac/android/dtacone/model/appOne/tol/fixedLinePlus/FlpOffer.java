package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/FlpOffer;", "", "mktOfferCode", "", "mktOfferName", "mktCategoryCode", "packageInfoList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/PackageInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getMktCategoryCode", "()Ljava/lang/String;", "mktNewName", "getMktNewName", "getMktOfferCode", "getMktOfferName", "getPackageInfoList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.FlpOffer */
/* loaded from: classes8.dex */
public final class FlpOffer {
    public static final int $stable = 8;
    @SerializedName("mktCategoryCode")
    @NotNull
    private final String mktCategoryCode;
    @SerializedName("mktOfferCode")
    @NotNull
    private final String mktOfferCode;
    @SerializedName("mktOfferName")
    @NotNull
    private final String mktOfferName;
    @SerializedName("packageInfoList")
    @NotNull
    private final List<PackageInfo> packageInfoList;

    public FlpOffer() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlpOffer copy$default(FlpOffer flpOffer, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = flpOffer.mktOfferCode;
        }
        if ((i & 2) != 0) {
            str2 = flpOffer.mktOfferName;
        }
        if ((i & 4) != 0) {
            str3 = flpOffer.mktCategoryCode;
        }
        if ((i & 8) != 0) {
            list = flpOffer.packageInfoList;
        }
        return flpOffer.copy(str, str2, str3, list);
    }

    @NotNull
    public final String component1() {
        return this.mktOfferCode;
    }

    @NotNull
    public final String component2() {
        return this.mktOfferName;
    }

    @NotNull
    public final String component3() {
        return this.mktCategoryCode;
    }

    @NotNull
    public final List<PackageInfo> component4() {
        return this.packageInfoList;
    }

    @NotNull
    public final FlpOffer copy(@NotNull String mktOfferCode, @NotNull String mktOfferName, @NotNull String mktCategoryCode, @NotNull List<PackageInfo> packageInfoList) {
        Intrinsics.checkNotNullParameter(mktOfferCode, "mktOfferCode");
        Intrinsics.checkNotNullParameter(mktOfferName, "mktOfferName");
        Intrinsics.checkNotNullParameter(mktCategoryCode, "mktCategoryCode");
        Intrinsics.checkNotNullParameter(packageInfoList, "packageInfoList");
        return new FlpOffer(mktOfferCode, mktOfferName, mktCategoryCode, packageInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FlpOffer) {
            FlpOffer flpOffer = (FlpOffer) obj;
            return Intrinsics.areEqual(this.mktOfferCode, flpOffer.mktOfferCode) && Intrinsics.areEqual(this.mktOfferName, flpOffer.mktOfferName) && Intrinsics.areEqual(this.mktCategoryCode, flpOffer.mktCategoryCode) && Intrinsics.areEqual(this.packageInfoList, flpOffer.packageInfoList);
        }
        return false;
    }

    @NotNull
    public final String getMktCategoryCode() {
        return this.mktCategoryCode;
    }

    @NotNull
    public final String getMktNewName() {
        String str = this.mktOfferName;
        String str2 = this.mktOfferCode;
        if (AbstractC20204hN1.startsWith$default(str, str2 + " :", false, 2, null)) {
            return this.mktOfferName;
        }
        String str3 = this.mktOfferCode;
        String str4 = this.mktOfferName;
        return str3 + " : " + str4;
    }

    @NotNull
    public final String getMktOfferCode() {
        return this.mktOfferCode;
    }

    @NotNull
    public final String getMktOfferName() {
        return this.mktOfferName;
    }

    @NotNull
    public final List<PackageInfo> getPackageInfoList() {
        return this.packageInfoList;
    }

    public int hashCode() {
        return (((((this.mktOfferCode.hashCode() * 31) + this.mktOfferName.hashCode()) * 31) + this.mktCategoryCode.hashCode()) * 31) + this.packageInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.mktOfferCode;
        String str2 = this.mktOfferName;
        String str3 = this.mktCategoryCode;
        List<PackageInfo> list = this.packageInfoList;
        return "FlpOffer(mktOfferCode=" + str + ", mktOfferName=" + str2 + ", mktCategoryCode=" + str3 + ", packageInfoList=" + list + ")";
    }

    public FlpOffer(@NotNull String mktOfferCode, @NotNull String mktOfferName, @NotNull String mktCategoryCode, @NotNull List<PackageInfo> packageInfoList) {
        Intrinsics.checkNotNullParameter(mktOfferCode, "mktOfferCode");
        Intrinsics.checkNotNullParameter(mktOfferName, "mktOfferName");
        Intrinsics.checkNotNullParameter(mktCategoryCode, "mktCategoryCode");
        Intrinsics.checkNotNullParameter(packageInfoList, "packageInfoList");
        this.mktOfferCode = mktOfferCode;
        this.mktOfferName = mktOfferName;
        this.mktCategoryCode = mktCategoryCode;
        this.packageInfoList = packageInfoList;
    }

    public /* synthetic */ FlpOffer(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
