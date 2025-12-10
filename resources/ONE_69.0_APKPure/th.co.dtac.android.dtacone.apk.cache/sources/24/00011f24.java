package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrRetailerSearchPackageResponse;", "", "packages", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Package;", "paginate", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Paginate;", "(Ljava/util/List;Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Paginate;)V", "getPackages", "()Ljava/util/List;", "getPaginate", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Paginate;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerSearchPackageResponse */
/* loaded from: classes8.dex */
public final class MrtrRetailerSearchPackageResponse {
    public static final int $stable = 8;
    @Nullable
    private final List<Package> packages;
    @Nullable
    private final Paginate paginate;

    public MrtrRetailerSearchPackageResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrtrRetailerSearchPackageResponse copy$default(MrtrRetailerSearchPackageResponse mrtrRetailerSearchPackageResponse, List list, Paginate paginate, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mrtrRetailerSearchPackageResponse.packages;
        }
        if ((i & 2) != 0) {
            paginate = mrtrRetailerSearchPackageResponse.paginate;
        }
        return mrtrRetailerSearchPackageResponse.copy(list, paginate);
    }

    @Nullable
    public final List<Package> component1() {
        return this.packages;
    }

    @Nullable
    public final Paginate component2() {
        return this.paginate;
    }

    @NotNull
    public final MrtrRetailerSearchPackageResponse copy(@Nullable List<Package> list, @Nullable Paginate paginate) {
        return new MrtrRetailerSearchPackageResponse(list, paginate);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrRetailerSearchPackageResponse) {
            MrtrRetailerSearchPackageResponse mrtrRetailerSearchPackageResponse = (MrtrRetailerSearchPackageResponse) obj;
            return Intrinsics.areEqual(this.packages, mrtrRetailerSearchPackageResponse.packages) && Intrinsics.areEqual(this.paginate, mrtrRetailerSearchPackageResponse.paginate);
        }
        return false;
    }

    @Nullable
    public final List<Package> getPackages() {
        return this.packages;
    }

    @Nullable
    public final Paginate getPaginate() {
        return this.paginate;
    }

    public int hashCode() {
        List<Package> list = this.packages;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Paginate paginate = this.paginate;
        return hashCode + (paginate != null ? paginate.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<Package> list = this.packages;
        Paginate paginate = this.paginate;
        return "MrtrRetailerSearchPackageResponse(packages=" + list + ", paginate=" + paginate + ")";
    }

    public MrtrRetailerSearchPackageResponse(@Nullable List<Package> list, @Nullable Paginate paginate) {
        this.packages = list;
        this.paginate = paginate;
    }

    public /* synthetic */ MrtrRetailerSearchPackageResponse(List list, Paginate paginate, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : paginate);
    }
}