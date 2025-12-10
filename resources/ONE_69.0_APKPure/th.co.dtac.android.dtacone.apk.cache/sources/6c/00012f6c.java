package th.p047co.dtac.android.dtacone.view.appOne.device_sale.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSetResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidRetailerAllPackageGroupResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidRetailerAllPackageGroupResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.device_sale.viewmodel.OneDeviceSalePackagesViewModel$getOneDeviceSalePostpaidAllPackageGroupRetailer$3 */
/* loaded from: classes10.dex */
public final class C14636xde26d7b0 extends Lambda implements Function1<OnePostpaidRetailerAllPackageGroupResponse, Unit> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ OneDeviceSalePackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14636xde26d7b0(OneDeviceSalePackagesViewModel oneDeviceSalePackagesViewModel, boolean z) {
        super(1);
        this.this$0 = oneDeviceSalePackagesViewModel;
        this.$isRefresh = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidRetailerAllPackageGroupResponse onePostpaidRetailerAllPackageGroupResponse) {
        invoke2(onePostpaidRetailerAllPackageGroupResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidRetailerAllPackageGroupResponse onePostpaidRetailerAllPackageGroupResponse) {
        MutableLiveData m14437m;
        MutableLiveData m14435o;
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        this.this$0.setPostpaidPackageSetRetailerResponse(onePostpaidRetailerAllPackageGroupResponse.getData());
        m14437m = this.this$0.m14437m();
        Resource.Companion companion = Resource.Companion;
        m14437m.postValue(companion.success(onePostpaidRetailerAllPackageGroupResponse.getData()));
        OneDeviceSalePackagesViewModel oneDeviceSalePackagesViewModel = this.this$0;
        OnePostpaidPackageSetResponse data = onePostpaidRetailerAllPackageGroupResponse.getData();
        oneDeviceSalePackagesViewModel.setDefaultPackageRetailer((data != null ? data.getDefaultPackage() : null) != null);
        if (this.$isRefresh) {
            m14435o = this.this$0.m14435o();
            m14435o.postValue(companion.success(Boolean.TRUE));
            return;
        }
        this.this$0.navigateNext();
    }
}