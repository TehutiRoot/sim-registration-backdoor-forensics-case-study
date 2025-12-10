package th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrRetailerAllPackageGroupResponse;", "", "default", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Default;", "tabs", "", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Tab;", "(Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Default;Ljava/util/List;)V", "getDefault", "()Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/Default;", "getTabs", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrRetailerAllPackageGroupResponse */
/* loaded from: classes8.dex */
public final class MrtrRetailerAllPackageGroupResponse {
    public static final int $stable = 8;
    @Nullable

    /* renamed from: default  reason: not valid java name */
    private final Default f109636default;
    @Nullable
    private final List<Tab> tabs;

    public MrtrRetailerAllPackageGroupResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrtrRetailerAllPackageGroupResponse copy$default(MrtrRetailerAllPackageGroupResponse mrtrRetailerAllPackageGroupResponse, Default r1, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            r1 = mrtrRetailerAllPackageGroupResponse.f109636default;
        }
        if ((i & 2) != 0) {
            list = mrtrRetailerAllPackageGroupResponse.tabs;
        }
        return mrtrRetailerAllPackageGroupResponse.copy(r1, list);
    }

    @Nullable
    public final Default component1() {
        return this.f109636default;
    }

    @Nullable
    public final List<Tab> component2() {
        return this.tabs;
    }

    @NotNull
    public final MrtrRetailerAllPackageGroupResponse copy(@Nullable Default r2, @Nullable List<Tab> list) {
        return new MrtrRetailerAllPackageGroupResponse(r2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MrtrRetailerAllPackageGroupResponse) {
            MrtrRetailerAllPackageGroupResponse mrtrRetailerAllPackageGroupResponse = (MrtrRetailerAllPackageGroupResponse) obj;
            return Intrinsics.areEqual(this.f109636default, mrtrRetailerAllPackageGroupResponse.f109636default) && Intrinsics.areEqual(this.tabs, mrtrRetailerAllPackageGroupResponse.tabs);
        }
        return false;
    }

    @Nullable
    public final Default getDefault() {
        return this.f109636default;
    }

    @Nullable
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public int hashCode() {
        Default r0 = this.f109636default;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        List<Tab> list = this.tabs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Default r0 = this.f109636default;
        List<Tab> list = this.tabs;
        return "MrtrRetailerAllPackageGroupResponse(default=" + r0 + ", tabs=" + list + ")";
    }

    public MrtrRetailerAllPackageGroupResponse(@Nullable Default r1, @Nullable List<Tab> list) {
        this.f109636default = r1;
        this.tabs = list;
    }

    public /* synthetic */ MrtrRetailerAllPackageGroupResponse(Default r2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : r2, (i & 2) != 0 ? null : list);
    }
}