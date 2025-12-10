package th.p047co.dtac.android.dtacone.viewmodel.esim;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;
import th.p047co.dtac.android.dtacone.repository.esim.ESimRepository;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.ESimPrepaidSummaryFragment;
import th.p047co.dtac.android.dtacone.view.fragment.eSIM.payment.ESimPaymentFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.esim.ESimViewModel$getConsentXSIMConfirm$3 */
/* loaded from: classes9.dex */
public final class ESimViewModel$getConsentXSIMConfirm$3 extends Lambda implements Function1<XSIMConsentResponse, Unit> {
    final /* synthetic */ ESimViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESimViewModel$getConsentXSIMConfirm$3(ESimViewModel eSimViewModel) {
        super(1);
        this.this$0 = eSimViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(XSIMConsentResponse xSIMConsentResponse) {
        invoke2(xSIMConsentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(XSIMConsentResponse xSIMConsentResponse) {
        ESimRepository eSimRepository;
        MutableLiveData m2784A0;
        MutableLiveData m2784A02;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        eSimRepository = this.this$0.f105820b;
        eSimRepository.setXSIMConsentResponse(xSIMConsentResponse);
        boolean isGotoPayment = this.this$0.isGotoPayment();
        if (isGotoPayment) {
            m2784A02 = this.this$0.m2784A0();
            m2784A02.setValue(new Event(new FragmentNavEvent(ESimPaymentFragment.class, null, null, 4, null)));
        } else if (isGotoPayment) {
        } else {
            m2784A0 = this.this$0.m2784A0();
            m2784A0.setValue(new Event(new FragmentNavEvent(ESimPrepaidSummaryFragment.class, null, null, 4, null)));
        }
    }
}