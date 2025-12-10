package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedViewAllPackageGroupResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedViewAllPackageGroupResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$3 extends Lambda implements Function1<MrtrBrandedViewAllPackageGroupResponse, Unit> {
    final /* synthetic */ boolean $isRefresh;
    final /* synthetic */ MrtrPostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidPackagesViewModel$getViewAllPackageGroupBranded$3(MrtrPostpaidPackagesViewModel mrtrPostpaidPackagesViewModel, boolean z) {
        super(1);
        this.this$0 = mrtrPostpaidPackagesViewModel;
        this.$isRefresh = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrBrandedViewAllPackageGroupResponse mrtrBrandedViewAllPackageGroupResponse) {
        invoke2(mrtrBrandedViewAllPackageGroupResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrBrandedViewAllPackageGroupResponse mrtrBrandedViewAllPackageGroupResponse) {
        MutableLiveData m2314w;
        MutableLiveData m2319r;
        m2314w = this.this$0.m2314w();
        Resource.Companion companion = Resource.Companion;
        m2314w.postValue(companion.success(mrtrBrandedViewAllPackageGroupResponse));
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        if (this.$isRefresh) {
            m2319r = this.this$0.m2319r();
            m2319r.postValue(companion.success(Boolean.TRUE));
            return;
        }
        this.this$0.navigateNext();
    }
}