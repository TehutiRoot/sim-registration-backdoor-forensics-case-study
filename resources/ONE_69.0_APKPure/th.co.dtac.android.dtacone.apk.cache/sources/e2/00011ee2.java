package th.p047co.dtac.android.dtacone.model.mrtr_mnp.package_set.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/MnpQueryPackageSetResponse;", "", "packageSetList", "", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/package_set/response/PackageSetListItem;", "(Ljava/util/List;)V", "getPackageSetList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_mnp.package_set.response.MnpQueryPackageSetResponse */
/* loaded from: classes8.dex */
public final class MnpQueryPackageSetResponse {
    public static final int $stable = 8;
    @SerializedName("packageSetList")
    @Nullable
    private final List<PackageSetListItem> packageSetList;

    public MnpQueryPackageSetResponse() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MnpQueryPackageSetResponse copy$default(MnpQueryPackageSetResponse mnpQueryPackageSetResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mnpQueryPackageSetResponse.packageSetList;
        }
        return mnpQueryPackageSetResponse.copy(list);
    }

    @Nullable
    public final List<PackageSetListItem> component1() {
        return this.packageSetList;
    }

    @NotNull
    public final MnpQueryPackageSetResponse copy(@Nullable List<PackageSetListItem> list) {
        return new MnpQueryPackageSetResponse(list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MnpQueryPackageSetResponse) && Intrinsics.areEqual(this.packageSetList, ((MnpQueryPackageSetResponse) obj).packageSetList);
    }

    @Nullable
    public final List<PackageSetListItem> getPackageSetList() {
        return this.packageSetList;
    }

    public int hashCode() {
        List<PackageSetListItem> list = this.packageSetList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        List<PackageSetListItem> list = this.packageSetList;
        return "MnpQueryPackageSetResponse(packageSetList=" + list + ")";
    }

    public MnpQueryPackageSetResponse(@Nullable List<PackageSetListItem> list) {
        this.packageSetList = list;
    }

    public /* synthetic */ MnpQueryPackageSetResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}