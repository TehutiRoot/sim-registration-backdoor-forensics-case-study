package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.StatusResource;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Subscriber;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$saveSimResult$2 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModel$saveSimResult$2 extends Lambda implements Function1<Void, Unit> {
    final /* synthetic */ boolean $redirectToActivate;
    final /* synthetic */ MrtrPrepaidRegisterRequest $registerRequest;
    final /* synthetic */ MrtrPrepaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidRegistrationViewModel$saveSimResult$2(boolean z, MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest, MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel) {
        super(1);
        this.$redirectToActivate = z;
        this.$registerRequest = mrtrPrepaidRegisterRequest;
        this.this$0 = mrtrPrepaidRegistrationViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Void r1) {
        invoke2(r1);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Void r2) {
        Subscriber subscriber;
        if (this.$redirectToActivate) {
            MrtrPrepaidRegisterRequest mrtrPrepaidRegisterRequest = this.$registerRequest;
            if (Intrinsics.areEqual((mrtrPrepaidRegisterRequest == null || (subscriber = mrtrPrepaidRegisterRequest.getSubscriber()) == null) ? null : subscriber.getSimType(), PrepaidActivateSimType.PUSH_MODE)) {
                this.this$0.assignPooling();
                return;
            } else {
                this.this$0.activatePrepaid();
                return;
            }
        }
        this.this$0.getLiveDataState().setValue(StatusResource.SUCCESS);
    }
}