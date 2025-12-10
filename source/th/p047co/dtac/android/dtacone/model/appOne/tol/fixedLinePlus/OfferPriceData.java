package th.p047co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/OfferPriceData;", "", "packageInfoList", "", "Lth/co/dtac/android/dtacone/model/appOne/tol/fixedLinePlus/PackagePriceInfo;", "(Ljava/util/List;)V", "getPackageInfoList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.fixedLinePlus.OfferPriceData */
/* loaded from: classes8.dex */
public final class OfferPriceData {
    public static final int $stable = 8;
    @SerializedName("packageInfoList")
    @NotNull
    private final List<PackagePriceInfo> packageInfoList;

    public OfferPriceData(@NotNull List<PackagePriceInfo> packageInfoList) {
        Intrinsics.checkNotNullParameter(packageInfoList, "packageInfoList");
        this.packageInfoList = packageInfoList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OfferPriceData copy$default(OfferPriceData offerPriceData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = offerPriceData.packageInfoList;
        }
        return offerPriceData.copy(list);
    }

    @NotNull
    public final List<PackagePriceInfo> component1() {
        return this.packageInfoList;
    }

    @NotNull
    public final OfferPriceData copy(@NotNull List<PackagePriceInfo> packageInfoList) {
        Intrinsics.checkNotNullParameter(packageInfoList, "packageInfoList");
        return new OfferPriceData(packageInfoList);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OfferPriceData) && Intrinsics.areEqual(this.packageInfoList, ((OfferPriceData) obj).packageInfoList);
    }

    @NotNull
    public final List<PackagePriceInfo> getPackageInfoList() {
        return this.packageInfoList;
    }

    public int hashCode() {
        return this.packageInfoList.hashCode();
    }

    @NotNull
    public String toString() {
        List<PackagePriceInfo> list = this.packageInfoList;
        return "OfferPriceData(packageInfoList=" + list + ")";
    }
}
