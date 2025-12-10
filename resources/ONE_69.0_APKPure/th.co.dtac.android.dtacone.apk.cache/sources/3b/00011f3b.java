package th.p047co.dtac.android.dtacone.model.mrtr_pre2post;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.PackageGroups;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_pre2post/GetAllPackageGroupBrandedPre2PostByRefResponse;", "", "listPackageGroups", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/PackageGroups;", "total", "", "warningMessage", "", "(Ljava/util/List;ILjava/lang/String;)V", "getListPackageGroups", "()Ljava/util/List;", "getTotal", "()I", "getWarningMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_pre2post.GetAllPackageGroupBrandedPre2PostByRefResponse */
/* loaded from: classes8.dex */
public final class GetAllPackageGroupBrandedPre2PostByRefResponse {
    public static final int $stable = 8;
    @SerializedName("listPackageGroups")
    @NotNull
    private final List<PackageGroups> listPackageGroups;
    @SerializedName("total")
    private final int total;
    @SerializedName("warningMessage")
    @NotNull
    private final String warningMessage;

    public GetAllPackageGroupBrandedPre2PostByRefResponse(@NotNull List<PackageGroups> listPackageGroups, int i, @NotNull String warningMessage) {
        Intrinsics.checkNotNullParameter(listPackageGroups, "listPackageGroups");
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
        this.listPackageGroups = listPackageGroups;
        this.total = i;
        this.warningMessage = warningMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAllPackageGroupBrandedPre2PostByRefResponse copy$default(GetAllPackageGroupBrandedPre2PostByRefResponse getAllPackageGroupBrandedPre2PostByRefResponse, List list, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getAllPackageGroupBrandedPre2PostByRefResponse.listPackageGroups;
        }
        if ((i2 & 2) != 0) {
            i = getAllPackageGroupBrandedPre2PostByRefResponse.total;
        }
        if ((i2 & 4) != 0) {
            str = getAllPackageGroupBrandedPre2PostByRefResponse.warningMessage;
        }
        return getAllPackageGroupBrandedPre2PostByRefResponse.copy(list, i, str);
    }

    @NotNull
    public final List<PackageGroups> component1() {
        return this.listPackageGroups;
    }

    public final int component2() {
        return this.total;
    }

    @NotNull
    public final String component3() {
        return this.warningMessage;
    }

    @NotNull
    public final GetAllPackageGroupBrandedPre2PostByRefResponse copy(@NotNull List<PackageGroups> listPackageGroups, int i, @NotNull String warningMessage) {
        Intrinsics.checkNotNullParameter(listPackageGroups, "listPackageGroups");
        Intrinsics.checkNotNullParameter(warningMessage, "warningMessage");
        return new GetAllPackageGroupBrandedPre2PostByRefResponse(listPackageGroups, i, warningMessage);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetAllPackageGroupBrandedPre2PostByRefResponse) {
            GetAllPackageGroupBrandedPre2PostByRefResponse getAllPackageGroupBrandedPre2PostByRefResponse = (GetAllPackageGroupBrandedPre2PostByRefResponse) obj;
            return Intrinsics.areEqual(this.listPackageGroups, getAllPackageGroupBrandedPre2PostByRefResponse.listPackageGroups) && this.total == getAllPackageGroupBrandedPre2PostByRefResponse.total && Intrinsics.areEqual(this.warningMessage, getAllPackageGroupBrandedPre2PostByRefResponse.warningMessage);
        }
        return false;
    }

    @NotNull
    public final List<PackageGroups> getListPackageGroups() {
        return this.listPackageGroups;
    }

    public final int getTotal() {
        return this.total;
    }

    @NotNull
    public final String getWarningMessage() {
        return this.warningMessage;
    }

    public int hashCode() {
        return (((this.listPackageGroups.hashCode() * 31) + this.total) * 31) + this.warningMessage.hashCode();
    }

    @NotNull
    public String toString() {
        List<PackageGroups> list = this.listPackageGroups;
        int i = this.total;
        String str = this.warningMessage;
        return "GetAllPackageGroupBrandedPre2PostByRefResponse(listPackageGroups=" + list + ", total=" + i + ", warningMessage=" + str + ")";
    }
}