package th.p047co.dtac.android.dtacone.viewmodel.mrtr_mnp;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.ActivityNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_mnp.authorization.MnpAuthorizationResponse;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_mnp.MrtrMnpActivity;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_mnp/authorization/MnpAuthorizationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_mnp.MrtrMnpViewModel$callAuthorization$3 */
/* loaded from: classes9.dex */
public final class MrtrMnpViewModel$callAuthorization$3 extends Lambda implements Function1<MnpAuthorizationResponse, Unit> {
    final /* synthetic */ MrtrMnpViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrMnpViewModel$callAuthorization$3(MrtrMnpViewModel mrtrMnpViewModel) {
        super(1);
        this.this$0 = mrtrMnpViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MnpAuthorizationResponse mnpAuthorizationResponse) {
        invoke2(mnpAuthorizationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MnpAuthorizationResponse mnpAuthorizationResponse) {
        MutableLiveData m2343o;
        MrtrMnpViewModel mrtrMnpViewModel = this.this$0;
        Boolean isCheckSIMStock = mnpAuthorizationResponse.isCheckSIMStock();
        mrtrMnpViewModel.setCheckSimStock(isCheckSIMStock != null ? isCheckSIMStock.booleanValue() : false);
        this.this$0.setInvoiceAlertMethod(mnpAuthorizationResponse.getInvoiceAlertMethod());
        this.this$0.setRequireFaceRecognition(mnpAuthorizationResponse.getRequireFaceRecognition());
        this.this$0.setRequireLiveness(Boolean.valueOf(mnpAuthorizationResponse.isRequireLiveNess()));
        this.this$0.setAllowManualKYC(Boolean.valueOf(mnpAuthorizationResponse.isAllowManualKYC()));
        this.this$0.setAuthorizeResponse(mnpAuthorizationResponse);
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MrtrMnpActivity.EXTRA_AUTHORIZATION_RESPONSE, mnpAuthorizationResponse);
        m2343o = this.this$0.m2343o();
        m2343o.setValue(new Event(new ActivityNavEvent(MrtrMnpActivity.class, bundle)));
    }
}