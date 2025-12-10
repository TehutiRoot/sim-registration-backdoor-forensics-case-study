package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.model.Event;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.livedata.FragmentNavEvent;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.fragment.true_company.OnePostpaidTrueMailingFragment;
import th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.repository.OnePostpaidRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$validateAllowProtection$2 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$validateAllowProtection$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$validateAllowProtection$2(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel) {
        super(1);
        this.this$0 = onePostpaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        OnePostpaidRepository onePostpaidRepository;
        OnePostpaidRepository onePostpaidRepository2;
        MutableLiveData m11585k2;
        Intrinsics.checkNotNullParameter(it, "it");
        MutableLiveData<StatusResource> liveDataState = this.this$0.getLiveDataState();
        StatusResource statusResource = StatusResource.DISMISS;
        liveDataState.setValue(statusResource);
        this.this$0.getLiveDataState().setValue(statusResource);
        onePostpaidRepository = this.this$0.f94609b;
        onePostpaidRepository.getModel().setValidateAllowProtectionResponse(null);
        onePostpaidRepository2 = this.this$0.f94609b;
        onePostpaidRepository2.getModel().setItemProtectSelected(null);
        m11585k2 = this.this$0.m11585k2();
        String name = OnePostpaidTrueMailingFragment.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OnePostpaidTrueMailingFragment::class.java.name");
        m11585k2.setValue(new Event(new FragmentNavEvent(OnePostpaidTrueMailingFragment.class, null, name)));
    }
}