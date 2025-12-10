package th.p047co.dtac.android.dtacone.viewmodel.device_sale;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.device_sale.MainPackageGroupList;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.fragment.device_sale.DeviceSaleChangePackageFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/device_sale/MainPackageGroupList;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.device_sale.DeviceSaleViewModel$callSearchMainPackageGroupByRef$3 */
/* loaded from: classes9.dex */
public final class DeviceSaleViewModel$callSearchMainPackageGroupByRef$3 extends Lambda implements Function1<MainPackageGroupList, Unit> {
    final /* synthetic */ boolean $isNavigate;
    final /* synthetic */ DeviceSaleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSaleViewModel$callSearchMainPackageGroupByRef$3(DeviceSaleViewModel deviceSaleViewModel, boolean z) {
        super(1);
        this.this$0 = deviceSaleViewModel;
        this.$isNavigate = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MainPackageGroupList mainPackageGroupList) {
        invoke2(mainPackageGroupList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MainPackageGroupList mainPackageGroupList) {
        MutableLiveData m2974V0;
        MutableLiveData m3014B0;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (this.$isNavigate) {
            m3014B0 = this.this$0.m3014B0();
            m3014B0.setValue(new Event(new FragmentNavEvent(DeviceSaleChangePackageFragment.class, null, null, 6, null)));
        }
        m2974V0 = this.this$0.m2974V0();
        m2974V0.setValue(Resource.Companion.success(mainPackageGroupList));
    }
}