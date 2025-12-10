package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.xsim_consent.XSIMConsentResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/xsim_consent/XSIMConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callAPIGetConsentXSimTemplate$3 */
/* loaded from: classes9.dex */
public final class C16617xf3250700 extends Lambda implements Function1<XSIMConsentResponse, Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16617xf3250700(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(XSIMConsentResponse xSIMConsentResponse) {
        invoke2(xSIMConsentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(XSIMConsentResponse xSIMConsentResponse) {
        MutableLiveData m2285Z;
        MutableLiveData m2290U;
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        m2285Z = this.this$0.m2285Z();
        Resource.Companion companion = Resource.Companion;
        m2285Z.setValue(companion.success(null));
        m2290U = this.this$0.m2290U();
        m2290U.setValue(companion.success(xSIMConsentResponse.getConsentImage()));
    }
}