package th.p047co.dtac.android.dtacone.viewmodel.esim;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.mrtr_pack.MrtrBrandedAllPackageGroupResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/mrtr_pack/MrtrBrandedAllPackageGroupResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$3 */
/* loaded from: classes9.dex */
public final class ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$3 extends Lambda implements Function1<MrtrBrandedAllPackageGroupResponse, Unit> {
    final /* synthetic */ ESimPostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimPostpaidPackagesViewModel$getAllPackageGroupBranded$3(ESimPostpaidPackagesViewModel eSimPostpaidPackagesViewModel) {
        super(1);
        this.this$0 = eSimPostpaidPackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrBrandedAllPackageGroupResponse mrtrBrandedAllPackageGroupResponse) {
        invoke2(mrtrBrandedAllPackageGroupResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrBrandedAllPackageGroupResponse mrtrBrandedAllPackageGroupResponse) {
        ESimRepository eSimRepository;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        eSimRepository = this.this$0.f105665b;
        eSimRepository.setPackageGroupRefNo(mrtrBrandedAllPackageGroupResponse.getPackageGroupRefNo());
        this.this$0.getViewAllPackageGroupBranded(mrtrBrandedAllPackageGroupResponse.getPackageGroupRefNo(), false);
    }
}