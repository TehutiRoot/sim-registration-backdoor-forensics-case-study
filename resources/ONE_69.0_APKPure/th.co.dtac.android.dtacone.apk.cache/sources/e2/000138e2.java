package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.buyDol.model.response.OnePrepaidStatusResponse;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidConsentNonTelcoFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/view/appOne/buyDol/model/response/OnePrepaidStatusResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$acceptConsentTrue$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$acceptConsentTrue$2 extends Lambda implements Function1<OnePrepaidStatusResponse, Unit> {
    final /* synthetic */ Integer $mrtrConsentId;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$acceptConsentTrue$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, Integer num) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$mrtrConsentId = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        invoke2(onePrepaidStatusResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidStatusResponse onePrepaidStatusResponse) {
        OnePostpaidRepository onePostpaidRepository;
        MutableLiveData m11600h2;
        this.this$0.setTelcoMrtrConsentId(String.valueOf(this.$mrtrConsentId));
        onePostpaidRepository = this.this$0.f94609b;
        if (onePostpaidRepository.isBelow10Age()) {
            this.this$0.saveOrder();
            return;
        }
        this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
        m11600h2 = this.this$0.m11600h2();
        m11600h2.setValue(new Event(new FragmentNavEvent(OnePostpaidConsentNonTelcoFragment.class, null, null, 4, null)));
    }
}