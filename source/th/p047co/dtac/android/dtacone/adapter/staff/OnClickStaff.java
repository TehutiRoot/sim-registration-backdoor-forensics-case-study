package th.p047co.dtac.android.dtacone.adapter.staff;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.staff.StaffCollection;

@Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m28850d2 = {"Lth/co/dtac/android/dtacone/adapter/staff/OnClickStaff;", "", "onClearMoney", "", "collection", "Lth/co/dtac/android/dtacone/model/staff/StaffCollection;", "onClickManagePermission", "onClickStaffDetail", "onManageMoney", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.adapter.staff.OnClickStaff */
/* loaded from: classes7.dex */
public interface OnClickStaff {
    void onClearMoney(@NotNull StaffCollection staffCollection);

    void onClickManagePermission(@NotNull StaffCollection staffCollection);

    void onClickStaffDetail(@NotNull StaffCollection staffCollection);

    void onManageMoney(@NotNull StaffCollection staffCollection);
}
