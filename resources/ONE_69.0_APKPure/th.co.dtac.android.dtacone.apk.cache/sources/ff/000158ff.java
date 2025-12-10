package th.p047co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_postpaid_registration.review.MrtrPostpaidRegisSuccessFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_postpaid_registration.MrtrPostpaidRegistrationViewModel$callSaveResult$3 */
/* loaded from: classes9.dex */
public final class MrtrPostpaidRegistrationViewModel$callSaveResult$3 extends Lambda implements Function1<Void, Unit> {
    final /* synthetic */ MrtrPostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPostpaidRegistrationViewModel$callSaveResult$3(MrtrPostpaidRegistrationViewModel mrtrPostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = mrtrPostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
        invoke2(r1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Void r9) {
        MutableLiveData m2282b0;
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m2282b0 = this.this$0.m2282b0();
        m2282b0.setValue(new Event(new FragmentNavEvent(MrtrPostpaidRegisSuccessFragment.class, null, null, 4, null)));
    }
}