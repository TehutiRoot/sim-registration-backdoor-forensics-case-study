package th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.activity;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.model.prepaid_registration.OnePrepaidAuthorizationResponse;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;
import th.p047co.dtac.android.dtacone.model.upPass.UpPassFormType;
import th.p047co.dtac.android.dtacone.view.appOne.prepaid_registration.viewmodel.OnePrepaidValidationViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.prepaid_registration.activity.OnePrepaidRegistrationActivity$handleBackPressed$1 */
/* loaded from: classes10.dex */
public final class OnePrepaidRegistrationActivity$handleBackPressed$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidRegistrationActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidRegistrationActivity$handleBackPressed$1(OnePrepaidRegistrationActivity onePrepaidRegistrationActivity) {
        super(0);
        this.this$0 = onePrepaidRegistrationActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnePrepaidValidationViewModel onePrepaidValidationViewModel;
        Boolean isAllowManualKYC;
        this.this$0.getSupportFragmentManager().popBackStack("UpPassFormOcrFragment", 0);
        onePrepaidValidationViewModel = this.this$0.f95636n;
        if (onePrepaidValidationViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prepaidValidationViewModel");
            onePrepaidValidationViewModel = null;
        }
        List<String> allowDocumentType = this.this$0.getViewModel().getAllowDocumentType();
        String orderType = this.this$0.getViewModel().getOrderType();
        int maxAttempt = this.this$0.getViewModel().getMaxAttempt();
        OnePrepaidAuthorizationResponse.Data getAuthorization = this.this$0.getViewModel().getGetAuthorization();
        onePrepaidValidationViewModel.setCurrentFormType(new UpPassFormType.OcrFaceCompareLiveness(null, allowDocumentType, false, orderType, (getAuthorization == null || (isAllowManualKYC = getAuthorization.isAllowManualKYC()) == null) ? false : isAllowManualKYC.booleanValue(), maxAttempt, this.this$0.getViewModel().isAllowKYC2ndLine(), PhoneNumberExtKt.toInternational(this.this$0.getViewModel().getDisplaySubscriberNumber()), this.this$0.getViewModel().getSimBarcode(), Boolean.valueOf(this.this$0.getViewModel().isFaceRecognition()), 5, null));
        this.this$0.getUpPassViewModel().resetFormState();
        this.this$0.getUpPassViewModel().triggerRestart();
    }
}