package th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.util.constant.Status;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.Data;
import th.p047co.dtac.android.dtacone.view.appOne.common.model.OneCommonResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/common/model/OneCommonResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel$deleteStaff$3 */
/* loaded from: classes10.dex */
public final class OneStaffViewModel$deleteStaff$3 extends Lambda implements Function1<OneCommonResponse, Unit> {
    final /* synthetic */ OneStaffViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffViewModel$deleteStaff$3(OneStaffViewModel oneStaffViewModel) {
        super(1);
        this.this$0 = oneStaffViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCommonResponse oneCommonResponse) {
        invoke2(oneCommonResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCommonResponse oneCommonResponse) {
        MutableLiveData m9895B;
        MutableLiveData m9895B2;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        Data data = oneCommonResponse.getData();
        if (Intrinsics.areEqual(data != null ? data.getStatus() : null, Status.getSUCCESS())) {
            m9895B2 = this.this$0.m9895B();
            m9895B2.setValue(Resource.Companion.success(oneCommonResponse.getData().getStatus()));
            return;
        }
        m9895B = this.this$0.m9895B();
        m9895B.setValue(Resource.Companion.error("", null, null));
    }
}