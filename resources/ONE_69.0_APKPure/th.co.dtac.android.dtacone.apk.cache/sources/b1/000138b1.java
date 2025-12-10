package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidPackageSet;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidatePackageGroupCodeResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidatePackageGroupCodeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidPackagesViewModel$validatePackageGroupCode$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidPackagesViewModel$validatePackageGroupCode$3 extends Lambda implements Function1<OnePostpaidValidatePackageGroupCodeResponse, Unit> {
    final /* synthetic */ OnePostpaidPackageSet $pack;
    final /* synthetic */ OnePostpaidPackagesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidPackagesViewModel$validatePackageGroupCode$3(OnePostpaidPackagesViewModel onePostpaidPackagesViewModel, OnePostpaidPackageSet onePostpaidPackageSet) {
        super(1);
        this.this$0 = onePostpaidPackagesViewModel;
        this.$pack = onePostpaidPackageSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse) {
        invoke2(onePostpaidValidatePackageGroupCodeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidatePackageGroupCodeResponse onePostpaidValidatePackageGroupCodeResponse) {
        MutableLiveData m11751q;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.setPackageGroupCodeResponse(onePostpaidValidatePackageGroupCodeResponse);
        m11751q = this.this$0.m11751q();
        m11751q.postValue(Resource.Companion.success(this.$pack));
    }
}