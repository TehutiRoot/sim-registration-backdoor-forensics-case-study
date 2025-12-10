package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OneVerifyCampaignFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneCampaignSaleTypeResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$getCampaignSaleType$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$getCampaignSaleType$2 extends Lambda implements Function1<OneCampaignSaleTypeResponse, Unit> {
    final /* synthetic */ List<VerifyKeyListItem> $verifyKeyList;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$getCampaignSaleType$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, List<VerifyKeyListItem> list) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$verifyKeyList = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneCampaignSaleTypeResponse oneCampaignSaleTypeResponse) {
        invoke2(oneCampaignSaleTypeResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneCampaignSaleTypeResponse oneCampaignSaleTypeResponse) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        MutableLiveData m11600h2;
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.getModel().setCampaignSaleTypeResponse(oneCampaignSaleTypeResponse != null ? oneCampaignSaleTypeResponse.getData() : null);
        List<VerifyKeyListItem> list = this.$verifyKeyList;
        if (list != null && !list.isEmpty()) {
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
            m11600h2 = this.this$0.m11600h2();
            m11600h2.setValue(new Event(new FragmentNavEvent(OneVerifyCampaignFragment.class, null, null, 4, null)));
            return;
        }
        OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel = this.this$0;
        onePostpaidRepository2 = onePostpaidRegistrationViewModel.f94609b;
        onePostpaidRegistrationViewModel.getProposition(onePostpaidRepository2.getGetFlow());
    }
}