package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedSearchPackageGroupResponse;", "", "listPackageGroups", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;", "total", "", "warningMessage", "", "(Ljava/util/List;ILjava/lang/String;)V", "getListPackageGroups", "()Ljava/util/List;", "getTotal", "()I", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedSearchPackageGroupResponse */
/* loaded from: classes8.dex */
public final class MrtrBrandedSearchPackageGroupResponse {
    public static final int $stable = 8;
    @SerializedName("listPackageGroups")
    @Nullable
    private final List<PackageGroups> listPackageGroups;
    @SerializedName("total")
    private final int total;
    @SerializedName("warningMessage")
    @Nullable
    private final String warningMessage;

    public MrtrBrandedSearchPackageGroupResponse() {
        this(null, 0, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrtrBrandedSearchPackageGroupResponse copy$default(MrtrBrandedSearchPackageGroupResponse mrtrBrandedSearchPackageGroupResponse, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = mrtrBrandedSearchPackageGroupResponse.listPackageGroups;
        }
        if ((i2 & 2) != 0) {
            i = mrtrBrandedSearchPackageGroupResponse.total;
        }
        if ((i2 & 4) != 0) {
            str = mrtrBrandedSearchPackageGroupResponse.warningMessage;
        }
        return mrtrBrandedSearchPackageGroupResponse.copy(list, i, str);
    }

    @Nullable
    public final List<PackageGroups> component1() {
        return this.listPackageGroups;
    }

    public final int component2() {
        return this.total;
    }

    @Nullable
    public final String component3() {
        return this.warningMessage;
    }

    @NotNull
    public final MrtrBrandedSearchPackageGroupResponse copy(@Nullable List<PackageGroups> list, int i, @Nullable String str) {
        return new MrtrBrandedSearchPackageGroupResponse(list, i, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrBrandedSearchPackageGroupResponse) {
            MrtrBrandedSearchPackageGroupResponse mrtrBrandedSearchPackageGroupResponse = (MrtrBrandedSearchPackageGroupResponse) obj;
            return Intrinsics.areEqual(this.listPackageGroups, mrtrBrandedSearchPackageGroupResponse.listPackageGroups) && this.total == mrtrBrandedSearchPackageGroupResponse.total && Intrinsics.areEqual(this.warningMessage, mrtrBrandedSearchPackageGroupResponse.warningMessage);
        }
        return false;
    }

    @Nullable
    public final List<PackageGroups> getListPackageGroups() {
        return this.listPackageGroups;
    }

    public final int getTotal() {
        return this.total;
    }

    @Nullable
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        List<PackageGroups> list = this.listPackageGroups;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.total) * 31;
        String str = this.warningMessage;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<PackageGroups> list = this.listPackageGroups;
        int i = this.total;
        String str = this.warningMessage;
        return "MrtrBrandedSearchPackageGroupResponse(listPackageGroups=" + list + ", total=" + i + ", warningMessage=" + str + ")";
    }

    public MrtrBrandedSearchPackageGroupResponse(@Nullable List<PackageGroups> list, int i, @Nullable String str) {
        this.listPackageGroups = list;
        this.total = i;
        this.warningMessage = str;
    }

    public /* synthetic */ MrtrBrandedSearchPackageGroupResponse(List list, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }
}