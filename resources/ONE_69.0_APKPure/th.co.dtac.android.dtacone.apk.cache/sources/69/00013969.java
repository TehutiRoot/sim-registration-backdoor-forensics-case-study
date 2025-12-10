package th.p047co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.postpaid_registration.viewmodel.OnePostpaidRegistrationViewModel$uploadImage$4 */
/* loaded from: classes10.dex */
public final class OnePostpaidRegistrationViewModel$uploadImage$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $consentVersionLabel;
    final /* synthetic */ String $mrtrConsentId;
    final /* synthetic */ String $nontelcoConsentType;
    final /* synthetic */ OnePostpaidRegistrationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePostpaidRegistrationViewModel$uploadImage$4(OnePostpaidRegistrationViewModel onePostpaidRegistrationViewModel, String str, String str2, String str3) {
        super(0);
        this.this$0 = onePostpaidRegistrationViewModel;
        this.$nontelcoConsentType = str;
        this.$consentVersionLabel = str2;
        this.$mrtrConsentId = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.onePostpaidRegistration(this.$nontelcoConsentType, this.$consentVersionLabel, this.$mrtrConsentId);
    }
}