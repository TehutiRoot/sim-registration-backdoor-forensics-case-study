package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.MrtrPrepaidRegisterRequest;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.request.Subscriber;
import th.p047co.dtac.android.dtacone.model.mrtr_prepaid.register.response.MrtrPrepaidRegisterResponse;
import th.p047co.dtac.android.dtacone.repository.mrtr_prepaid.MrtrPrepaidRepository;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidActivateSimType;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "Lth/co/dtac/android/dtacone/model/mrtr_prepaid/register/response/MrtrPrepaidRegisterResponse;", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$registerAndActivatePrepaid$2$3 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModel$registerAndActivatePrepaid$2$3 extends Lambda implements Function1<MrtrPrepaidRegisterResponse, Unit> {
    final /* synthetic */ String $nontelcoConsentType;
    final /* synthetic */ MrtrPrepaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidRegistrationViewModel$registerAndActivatePrepaid$2$3(MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel, String str) {
        super(1);
        this.this$0 = mrtrPrepaidRegistrationViewModel;
        this.$nontelcoConsentType = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(MrtrPrepaidRegisterResponse mrtrPrepaidRegisterResponse) {
        invoke2(mrtrPrepaidRegisterResponse);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(MrtrPrepaidRegisterResponse it) {
        MrtrPrepaidRepository mrtrPrepaidRepository;
        this.this$0.setRegisterResponse(it);
        mrtrPrepaidRepository = this.this$0.f106723b;
        if (mrtrPrepaidRepository.isCutSim()) {
            MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel = this.this$0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            mrtrPrepaidRegistrationViewModel.m2026n(it, true, this.this$0.getRegisterRequest(), this.$nontelcoConsentType);
        } else if (this.this$0.isCheckSimStock()) {
            MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel2 = this.this$0;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            mrtrPrepaidRegistrationViewModel2.m2042F(it, true, this.this$0.getRegisterRequest(), this.$nontelcoConsentType);
        } else {
            MrtrPrepaidRegisterRequest registerRequest = this.this$0.getRegisterRequest();
            Intrinsics.checkNotNull(registerRequest);
            Subscriber subscriber = registerRequest.getSubscriber();
            if (Intrinsics.areEqual(subscriber != null ? subscriber.getSimType() : null, PrepaidActivateSimType.PUSH_MODE)) {
                this.this$0.assignPooling();
            } else {
                this.this$0.activatePrepaid();
            }
        }
    }
}