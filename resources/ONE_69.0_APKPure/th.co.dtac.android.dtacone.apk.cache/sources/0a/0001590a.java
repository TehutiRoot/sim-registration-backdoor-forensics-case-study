package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.Resource;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.model.mrtr_postpaid.registration.MrtrPostpaidRegistrationResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_postpaid.MrtrPostpaidRepository;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidRegisSuccessFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_postpaid/registration/MrtrPostpaidRegistrationResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$mrtrPostpaidRegistration$4 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$mrtrPostpaidRegistration$4 extends Lambda implements Function1<MrtrPostpaidRegistrationResponse, Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$mrtrPostpaidRegistration$4(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse) {
        invoke2(mrtrPostpaidRegistrationResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPostpaidRegistrationResponse mrtrPostpaidRegistrationResponse) {
        MutableLiveData m2274f0;
        MutableLiveData m2282b0;
        MrtrPostpaidRepository mrtrPostpaidRepository;
        this.this$0.setPostpaidRegistrationResponse(mrtrPostpaidRegistrationResponse);
        if (this.this$0.isCheckSimStock()) {
            mrtrPostpaidRepository = this.this$0.f106470b;
            if (mrtrPostpaidRepository.getCheckSimStockResponse() != null) {
                this.this$0.callCutSIMStock();
                return;
            }
        }
        if (this.this$0.isCheckSimStock() && this.this$0.isUserLan()) {
            this.this$0.callSaveResult();
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m2274f0 = this.this$0.m2274f0();
        m2274f0.postValue(Resource.Companion.success(mrtrPostpaidRegistrationResponse));
        m2282b0 = this.this$0.m2282b0();
        m2282b0.setValue(new Event(new FragmentNavEvent(MrtrPostpaidRegisSuccessFragment.class, null, null, 4, null)));
    }
}