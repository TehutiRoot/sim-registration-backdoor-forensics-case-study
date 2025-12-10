package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.view.appOne.staff.model.ListStaffResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/staff/model/ListStaffResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$callGetListStaff$3 */
/* loaded from: classes10.dex */
public final class OneStaffViewModel$callGetListStaff$3 extends Lambda implements Function1<ListStaffResponse, Unit> {
    final /* synthetic */ OneStaffViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffViewModel$callGetListStaff$3(OneStaffViewModel oneStaffViewModel) {
        super(1);
        this.this$0 = oneStaffViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ListStaffResponse listStaffResponse) {
        invoke2(listStaffResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ListStaffResponse listStaffResponse) {
        MutableLiveData m9894C;
        this.this$0.isRefreshing().setValue(StatusResource.SUCCESS);
        m9894C = this.this$0.m9894C();
        m9894C.setValue(Resource.Companion.success(listStaffResponse));
    }
}