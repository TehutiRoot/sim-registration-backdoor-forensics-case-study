package th.p047co.dtac.android.dtacone.view.appOne.home.viewModel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.staff.StaffDetailCollection;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.Data;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.detail.OneStaffDetailResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "Lth/co/dtac/android/dtacone/model/staff/StaffDetailCollection;", "kotlin.jvm.PlatformType", "it", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/detail/OneStaffDetailResponse;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.home.viewModel.OneHomeViewModel$getStaffDetail$1 */
/* loaded from: classes10.dex */
public final class OneHomeViewModel$getStaffDetail$1 extends Lambda implements Function1<OneStaffDetailResponse, StaffDetailCollection> {
    public static final OneHomeViewModel$getStaffDetail$1 INSTANCE = new OneHomeViewModel$getStaffDetail$1();

    public OneHomeViewModel$getStaffDetail$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final StaffDetailCollection invoke(@NotNull OneStaffDetailResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Data data = it.getData();
        String id2 = data != null ? data.getId() : null;
        Data data2 = it.getData();
        String name = data2 != null ? data2.getName() : null;
        Data data3 = it.getData();
        String displayDate = data3 != null ? data3.getDisplayDate() : null;
        Data data4 = it.getData();
        Integer credit = data4 != null ? data4.getCredit() : null;
        Data data5 = it.getData();
        Integer soldAmount = data5 != null ? data5.getSoldAmount() : null;
        Data data6 = it.getData();
        Integer topupAmount = data6 != null ? data6.getTopupAmount() : null;
        Data data7 = it.getData();
        Integer stvAmount = data7 != null ? data7.getStvAmount() : null;
        Data data8 = it.getData();
        Integer epinAmount = data8 != null ? data8.getEpinAmount() : null;
        Data data9 = it.getData();
        Integer rectifyAmount = data9 != null ? data9.getRectifyAmount() : null;
        Data data10 = it.getData();
        Integer netSoldAmount = data10 != null ? data10.getNetSoldAmount() : null;
        Data data11 = it.getData();
        return new StaffDetailCollection(null, id2, name, displayDate, credit, soldAmount, topupAmount, stvAmount, epinAmount, rectifyAmount, netSoldAmount, null, data11 != null ? data11.getDisplayDateTh() : null);
    }
}