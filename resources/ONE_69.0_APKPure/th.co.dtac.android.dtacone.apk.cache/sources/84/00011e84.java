package th.p047co.dtac.android.dtacone.model.home.homeDetail;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.home.groupService.response.GroupServiceItem;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.model.topup.BalanceCollection;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/home/homeDetail/HomeDetailResponse;", "", "balance", "Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "groupServiceList", "", "Lth/co/dtac/android/dtacone/model/home/groupService/response/GroupServiceItem;", "staffDetail", "Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;", "(Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;Ljava/util/List;Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;)V", "getBalance", "()Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;", "setBalance", "(Lth/co/dtac/android/dtacone/model/topup/BalanceCollection;)V", "getGroupServiceList", "()Ljava/util/List;", "setGroupServiceList", "(Ljava/util/List;)V", "getStaffDetail", "()Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;", "setStaffDetail", "(Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.home.homeDetail.HomeDetailResponse */
/* loaded from: classes8.dex */
public final class HomeDetailResponse {
    public static final int $stable = 8;
    @NotNull
    private BalanceCollection balance;
    @NotNull
    private List<GroupServiceItem> groupServiceList;
    @NotNull
    private StaffDetailCollection staffDetail;

    public HomeDetailResponse(@NotNull BalanceCollection balance, @NotNull List<GroupServiceItem> groupServiceList, @NotNull StaffDetailCollection staffDetail) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(groupServiceList, "groupServiceList");
        Intrinsics.checkNotNullParameter(staffDetail, "staffDetail");
        this.balance = balance;
        this.groupServiceList = groupServiceList;
        this.staffDetail = staffDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeDetailResponse copy$default(HomeDetailResponse homeDetailResponse, BalanceCollection balanceCollection, List list, StaffDetailCollection staffDetailCollection, int i, Object obj) {
        if ((i & 1) != 0) {
            balanceCollection = homeDetailResponse.balance;
        }
        if ((i & 2) != 0) {
            list = homeDetailResponse.groupServiceList;
        }
        if ((i & 4) != 0) {
            staffDetailCollection = homeDetailResponse.staffDetail;
        }
        return homeDetailResponse.copy(balanceCollection, list, staffDetailCollection);
    }

    @NotNull
    public final BalanceCollection component1() {
        return this.balance;
    }

    @NotNull
    public final List<GroupServiceItem> component2() {
        return this.groupServiceList;
    }

    @NotNull
    public final StaffDetailCollection component3() {
        return this.staffDetail;
    }

    @NotNull
    public final HomeDetailResponse copy(@NotNull BalanceCollection balance, @NotNull List<GroupServiceItem> groupServiceList, @NotNull StaffDetailCollection staffDetail) {
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(groupServiceList, "groupServiceList");
        Intrinsics.checkNotNullParameter(staffDetail, "staffDetail");
        return new HomeDetailResponse(balance, groupServiceList, staffDetail);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeDetailResponse) {
            HomeDetailResponse homeDetailResponse = (HomeDetailResponse) obj;
            return Intrinsics.areEqual(this.balance, homeDetailResponse.balance) && Intrinsics.areEqual(this.groupServiceList, homeDetailResponse.groupServiceList) && Intrinsics.areEqual(this.staffDetail, homeDetailResponse.staffDetail);
        }
        return false;
    }

    @NotNull
    public final BalanceCollection getBalance() {
        return this.balance;
    }

    @NotNull
    public final List<GroupServiceItem> getGroupServiceList() {
        return this.groupServiceList;
    }

    @NotNull
    public final StaffDetailCollection getStaffDetail() {
        return this.staffDetail;
    }

    public int hashCode() {
        return (((this.balance.hashCode() * 31) + this.groupServiceList.hashCode()) * 31) + this.staffDetail.hashCode();
    }

    public final void setBalance(@NotNull BalanceCollection balanceCollection) {
        Intrinsics.checkNotNullParameter(balanceCollection, "<set-?>");
        this.balance = balanceCollection;
    }

    public final void setGroupServiceList(@NotNull List<GroupServiceItem> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.groupServiceList = list;
    }

    public final void setStaffDetail(@NotNull StaffDetailCollection staffDetailCollection) {
        Intrinsics.checkNotNullParameter(staffDetailCollection, "<set-?>");
        this.staffDetail = staffDetailCollection;
    }

    @NotNull
    public String toString() {
        BalanceCollection balanceCollection = this.balance;
        List<GroupServiceItem> list = this.groupServiceList;
        StaffDetailCollection staffDetailCollection = this.staffDetail;
        return "HomeDetailResponse(balance=" + balanceCollection + ", groupServiceList=" + list + ", staffDetail=" + staffDetailCollection + ")";
    }
}