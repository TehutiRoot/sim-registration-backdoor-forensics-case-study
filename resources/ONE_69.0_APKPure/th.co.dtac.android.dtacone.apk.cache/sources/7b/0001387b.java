package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignInfoResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignInfoResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidCampaignViewModel$getCampaignInfo$3 */
/* loaded from: classes10.dex */
public final class OnePostpaidCampaignViewModel$getCampaignInfo$3 extends Lambda implements Function1<OneCampaignInfoResponse, Unit> {
    final /* synthetic */ OnePostpaidCampaignViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidCampaignViewModel$getCampaignInfo$3(OnePostpaidCampaignViewModel onePostpaidCampaignViewModel) {
        super(1);
        this.this$0 = onePostpaidCampaignViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignInfoResponse oneCampaignInfoResponse) {
        invoke2(oneCampaignInfoResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignInfoResponse oneCampaignInfoResponse) {
        MutableLiveData m11793g;
        OnePostpaidRepository onePostpaidRepository;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m11793g = this.this$0.m11793g();
        m11793g.setValue(Resource.Companion.success(oneCampaignInfoResponse.getData()));
        onePostpaidRepository = this.this$0.f94493b;
        OneCampaignInfoResponse.Data data = oneCampaignInfoResponse.getData();
        onePostpaidRepository.setValidateSerialByDealer(data != null ? data.getValidateSerialByDealer() : null);
    }
}