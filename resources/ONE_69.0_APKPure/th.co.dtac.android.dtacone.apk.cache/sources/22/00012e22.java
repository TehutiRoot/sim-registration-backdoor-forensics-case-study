package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel;

import androidx.lifecycle.MutableLiveData;
import com.zxy.tiny.common.UriUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneCampaignSaleTypeResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.OneValidateExistingCustomerScoreResponse;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.true_company.ValidateExistingCustomerScoreData;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueAdditionalAdvanceFragment;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueSelectPackageFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", UriUtil.LOCAL_RESOURCE_SCHEME, "Lth/co/dtac/android/dtacone/model/appOne/postpaid/true_company/OneValidateExistingCustomerScoreResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel$validateExistingCustomerScore$3 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueViewModel$validateExistingCustomerScore$3 extends Lambda implements Function1<OneValidateExistingCustomerScoreResponse, Unit> {
    final /* synthetic */ OneDeviceSaleTrueViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueViewModel$validateExistingCustomerScore$3(OneDeviceSaleTrueViewModel oneDeviceSaleTrueViewModel) {
        super(1);
        this.this$0 = oneDeviceSaleTrueViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse) {
        invoke2(oneValidateExistingCustomerScoreResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OneValidateExistingCustomerScoreResponse oneValidateExistingCustomerScoreResponse) {
        MutableLiveData m14895E0;
        MutableLiveData m14895E02;
        this.this$0.getOneModel().setValidateExistingData(oneValidateExistingCustomerScoreResponse);
        ValidateExistingCustomerScoreData data = oneValidateExistingCustomerScoreResponse.getData();
        if ((data != null ? Intrinsics.areEqual(data.isPass(), Boolean.TRUE) : false) && Intrinsics.areEqual(oneValidateExistingCustomerScoreResponse.getData().getStatus(), "GREEN")) {
            OneCampaignSaleTypeResponse.Data campaignSaleTypeResponse = this.this$0.getOneModel().getCampaignSaleTypeResponse();
            if (campaignSaleTypeResponse != null ? Intrinsics.areEqual(campaignSaleTypeResponse.isChangePricePlan(), Boolean.TRUE) : false) {
                MutableLiveData<StatusResource> liveDataState = this.this$0.getLiveDataState();
                liveDataState.setValue(StatusResource.DISMISS);
                liveDataState.setValue(StatusResource.SUCCESS);
                m14895E02 = this.this$0.m14895E0();
                m14895E02.setValue(new Event(new FragmentNavEvent(OneDeviceSaleTrueSelectPackageFragment.class, null, null, 4, null)));
                return;
            }
            this.this$0.getProductPrice();
            return;
        }
        ValidateExistingCustomerScoreData data2 = oneValidateExistingCustomerScoreResponse.getData();
        if ((data2 != null ? Intrinsics.areEqual(data2.isPass(), Boolean.TRUE) : false) && Intrinsics.areEqual(oneValidateExistingCustomerScoreResponse.getData().getStatus(), "YELLOW")) {
            MutableLiveData<StatusResource> liveDataState2 = this.this$0.getLiveDataState();
            liveDataState2.setValue(StatusResource.DISMISS);
            liveDataState2.setValue(StatusResource.SUCCESS);
            m14895E0 = this.this$0.m14895E0();
            m14895E0.setValue(new Event(new FragmentNavEvent(OneDeviceSaleTrueAdditionalAdvanceFragment.class, null, null, 4, null)));
        }
    }
}