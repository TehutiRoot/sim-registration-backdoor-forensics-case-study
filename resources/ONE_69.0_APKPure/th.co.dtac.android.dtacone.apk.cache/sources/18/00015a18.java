package th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.util.constant.prepaid.PrepaidRegisterType;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_prepaid_registration.MrtrPrepaidRegistrationViewModel$uploadImage$4 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidRegistrationViewModel$uploadImage$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $nontelcoConsentType;
    final /* synthetic */ String $registerType;
    final /* synthetic */ MrtrPrepaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidRegistrationViewModel$uploadImage$4(String str, MrtrPrepaidRegistrationViewModel mrtrPrepaidRegistrationViewModel, String str2) {
        super(0);
        this.$registerType = str;
        this.this$0 = mrtrPrepaidRegistrationViewModel;
        this.$nontelcoConsentType = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (!Intrinsics.areEqual(this.$registerType, PrepaidRegisterType.REGISTER_ACTIVATION)) {
            this.this$0.m2045C(this.$registerType);
        } else {
            this.this$0.registerAndActivatePrepaid(this.$nontelcoConsentType);
        }
    }
}