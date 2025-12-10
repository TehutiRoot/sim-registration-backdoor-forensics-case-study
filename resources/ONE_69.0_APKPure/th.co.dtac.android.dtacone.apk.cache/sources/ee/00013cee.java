package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Subscriber;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidViewModel$cutSimStock$1$3 */
/* loaded from: classes10.dex */
public final class OnePrepaidViewModel$cutSimStock$1$3 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ boolean $redirectToActivate;
    final /* synthetic */ MrtrPrepaidRegisterRequest $registerRequest;
    final /* synthetic */ OnePrepaidViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidViewModel$cutSimStock$1$3(OnePrepaidViewModel onePrepaidViewModel, boolean z, MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest) {
        super(1);
        this.this$0 = onePrepaidViewModel;
        this.$redirectToActivate = z;
        this.$registerRequest = mrtrPrepaidRegisterRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        Subscriber subscriber;
        if (this.this$0.isCheckSim()) {
            this.this$0.m10546h0(this.$redirectToActivate, this.$registerRequest);
        } else if (this.$redirectToActivate) {
            MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.$registerRequest;
            if (Intrinsics.areEqual((mrtrPrepaidRegisterRequest == null || (subscriber = mrtrPrepaidRegisterRequest.getSubscriber()) == null) ? null : subscriber.getSimType(), PrepaidActivateSimType.PUSH_MODE)) {
                this.this$0.assignPooling();
            } else {
                this.this$0.activatePrepaid();
            }
        } else {
            this.this$0.navigateToSuccessPage();
        }
    }
}