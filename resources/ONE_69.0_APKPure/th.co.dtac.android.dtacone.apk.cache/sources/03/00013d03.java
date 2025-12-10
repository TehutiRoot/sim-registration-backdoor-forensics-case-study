package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Subscriber;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.repository.OnePrepaidRepository;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/app_one/model/prepaid_registration/OnePrepaidRegisterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$registerAndActivatePrepaid$2$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$registerAndActivatePrepaid$2$3 extends Lambda implements Function1<OnePrepaidRegisterResponse, Unit> {
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$registerAndActivatePrepaid$2$3(OnePrepaidViewModel onePrepaidViewModel) {
        super(1);
        this.this$0 = onePrepaidViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OnePrepaidRegisterResponse onePrepaidRegisterResponse) {
        invoke2(onePrepaidRegisterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OnePrepaidRegisterResponse onePrepaidRegisterResponse) {
        OnePrepaidRepository onePrepaidRepository;
        OnePrepaidRepository onePrepaidRepository2;
        OnePrepaidRepository onePrepaidRepository3;
        Subscriber subscriber;
        OnePrepaidRepository onePrepaidRepository4;
        OnePrepaidRepository onePrepaidRepository5;
        onePrepaidRepository = this.this$0.f95986b;
        onePrepaidRepository.setRegisterResponse(onePrepaidRegisterResponse);
        onePrepaidRepository2 = this.this$0.f95986b;
        if (onePrepaidRepository2.isCutSim()) {
            OnePrepaidViewModel onePrepaidViewModel = this.this$0;
            onePrepaidRepository5 = onePrepaidViewModel.f95986b;
            onePrepaidViewModel.m10520z(true, onePrepaidRepository5.getRegisterRequest());
        } else if (!this.this$0.isCheckSim()) {
            onePrepaidRepository3 = this.this$0.f95986b;
            MrtrPrepaidRegisterRequest registerRequest = onePrepaidRepository3.getRegisterRequest();
            if (Intrinsics.areEqual((registerRequest == null || (subscriber = registerRequest.getSubscriber()) == null) ? null : subscriber.getSimType(), PrepaidActivateSimType.PUSH_MODE)) {
                this.this$0.assignPooling();
            } else {
                this.this$0.activatePrepaid();
            }
        } else {
            OnePrepaidViewModel onePrepaidViewModel2 = this.this$0;
            onePrepaidRepository4 = onePrepaidViewModel2.f95986b;
            onePrepaidViewModel2.m10546h0(true, onePrepaidRepository4.getRegisterRequest());
        }
    }
}