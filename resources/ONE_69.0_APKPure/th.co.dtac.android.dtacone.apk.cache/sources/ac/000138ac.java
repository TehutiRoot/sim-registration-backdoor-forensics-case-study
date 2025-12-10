package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidSearchPackage;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/OnePostpaidSearchPackage;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3 extends Lambda implements Function1<OnePostpaidSearchPackage, Unit> {
    final /* synthetic */ OnePostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackagesViewModel$searchOnePackageGroupRetailer$3(OnePostpaidPackagesViewModel onePostpaidPackagesViewModel) {
        super(1);
        this.this$0 = onePostpaidPackagesViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidSearchPackage onePostpaidSearchPackage) {
        invoke2(onePostpaidSearchPackage);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable OnePostpaidSearchPackage onePostpaidSearchPackage) {
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        if (onePostpaidSearchPackage != null) {
            this.this$0.m11742z(onePostpaidSearchPackage);
        }
    }
}