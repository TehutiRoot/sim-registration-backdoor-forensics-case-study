package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.DataValidateConsent;
import th.p047co.dtac.android.dtacone.model.appOne.postpaid.validate.OnePostpaidValidateConsentResponse;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.consent.OnePostpaidTMNFragment;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/appOne/postpaid/validate/OnePostpaidValidateConsentResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateConsent$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateConsent$2 extends Lambda implements Function1<OnePostpaidValidateConsentResponse, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$validateConsent$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePostpaidValidateConsentResponse onePostpaidValidateConsentResponse) {
        invoke2(onePostpaidValidateConsentResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePostpaidValidateConsentResponse onePostpaidValidateConsentResponse) {
        MutableLiveData m11600h2;
        this.this$0.setValidateConsentResponse(onePostpaidValidateConsentResponse.getData());
        DataValidateConsent data = onePostpaidValidateConsentResponse.getData();
        if (data != null ? Intrinsics.areEqual(data.getConsentTMN(), Boolean.TRUE) : false) {
            m11600h2 = this.this$0.m11600h2();
            m11600h2.setValue(new Event(new FragmentNavEvent(OnePostpaidTMNFragment.class, null, null, 4, null)));
            this.this$0.getLiveDataState().setValue(StatusResource.DISMISS);
            return;
        }
        this.this$0.saveOrder();
    }
}