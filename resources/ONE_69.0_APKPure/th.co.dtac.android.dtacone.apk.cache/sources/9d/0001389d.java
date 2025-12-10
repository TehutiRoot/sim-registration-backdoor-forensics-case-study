package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.OnePostpaidBrandedAllPackageGroupResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.package_postpaid.PostpaidAllPackageGroupData;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/package_postpaid/OnePostpaidBrandedAllPackageGroupResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel$getAllPackageGroupBranded$3 */
/* loaded from: classes10.dex */
final class OnePostpaidPackagesViewModel$getAllPackageGroupBranded$3 extends Lambda implements Function1<OnePostpaidBrandedAllPackageGroupResponse, Unit> {
    final /* synthetic */ OnePostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackagesViewModel$getAllPackageGroupBranded$3(OnePostpaidPackagesViewModel onePostpaidPackagesViewModel) {
        super(1);
        this.this$0 = onePostpaidPackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidBrandedAllPackageGroupResponse onePostpaidBrandedAllPackageGroupResponse) {
        invoke2(onePostpaidBrandedAllPackageGroupResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidBrandedAllPackageGroupResponse onePostpaidBrandedAllPackageGroupResponse) {
        OnePostpaidRepository onePostpaidRepository;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        onePostpaidRepository = this.this$0.f94517b;
        PostpaidAllPackageGroupData data = onePostpaidBrandedAllPackageGroupResponse.getData();
        onePostpaidRepository.setPackageGroupRefNo(String.valueOf(data != null ? data.getPackageGroupRefNo() : null));
        OnePostpaidPackagesViewModel onePostpaidPackagesViewModel = this.this$0;
        PostpaidAllPackageGroupData data2 = onePostpaidBrandedAllPackageGroupResponse.getData();
        onePostpaidPackagesViewModel.getViewAllPackageGroupBranded(String.valueOf(data2 != null ? data2.getPackageGroupRefNo() : null), false);
    }
}