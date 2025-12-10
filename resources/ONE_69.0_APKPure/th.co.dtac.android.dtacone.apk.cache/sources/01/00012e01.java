package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.CampaignProductCategoryItem;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OnePropositionRebateResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.VerifyKeyListItem;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueVerifyCampaignFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.repository.OneDeviceSaleTrueRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OnePropositionRebateResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$getPropositionRebate$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$getPropositionRebate$3 extends Lambda implements Function1<OnePropositionRebateResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$getPropositionRebate$3(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePropositionRebateResponse onePropositionRebateResponse) {
        invoke2(onePropositionRebateResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePropositionRebateResponse onePropositionRebateResponse) {
        OneDeviceSaleTrueRepository oneDeviceSaleTrueRepository;
        MutableLiveData m14895E0;
        oneDeviceSaleTrueRepository = this.this$0.f90027b;
        oneDeviceSaleTrueRepository.getDeviceSaleModel().setPropositionRebateResponse(onePropositionRebateResponse.getData());
        CampaignProductCategoryItem campaignTrueItem = this.this$0.getOneModel().getCampaignTrueItem();
        List<VerifyKeyListItem> verifyKeyList = campaignTrueItem != null ? campaignTrueItem.getVerifyKeyList() : null;
        if (verifyKeyList == null || verifyKeyList.isEmpty()) {
            this.this$0.validateConsent();
            return;
        }
        MutableLiveData<StatusResource> liveDataState = this.this$0.getLiveDataState();
        liveDataState.setValue(StatusResource.DISMISS);
        liveDataState.setValue(StatusResource.SUCCESS);
        m14895E0 = this.this$0.m14895E0();
        m14895E0.setValue(new Event(new FragmentNavEvent(OneDeviceSaleTrueVerifyCampaignFragment.class, null, null, 4, null)));
    }
}