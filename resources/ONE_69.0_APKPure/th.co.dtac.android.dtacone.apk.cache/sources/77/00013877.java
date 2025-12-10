package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.OnePostpaidModel;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCheckPrivilegeResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCheckPrivilegeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidCampaignViewModel$checkPrivilege$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignViewModel$checkPrivilege$3 extends Lambda implements Function1<OneCheckPrivilegeResponse, Unit> {
    final /* synthetic */ OnePostpaidCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCampaignViewModel$checkPrivilege$3(OnePostpaidCampaignViewModel onePostpaidCampaignViewModel) {
        super(1);
        this.this$0 = onePostpaidCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCheckPrivilegeResponse oneCheckPrivilegeResponse) {
        invoke2(oneCheckPrivilegeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCheckPrivilegeResponse oneCheckPrivilegeResponse) {
        OnePostpaidRepository onePostpaidRepository;
        MutableLiveData m11792h;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        onePostpaidRepository = this.this$0.f94493b;
        OnePostpaidModel model = onePostpaidRepository.getModel();
        OneCheckPrivilegeResponse.Data data = oneCheckPrivilegeResponse.getData();
        model.setCheckPrivilegeResponse(data != null ? data.getCheckPrivilegeResponse() : null);
        m11792h = this.this$0.m11792h();
        m11792h.setValue(Resource.Companion.success(oneCheckPrivilegeResponse));
    }
}