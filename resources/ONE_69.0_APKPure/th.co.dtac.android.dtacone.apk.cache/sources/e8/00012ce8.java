package th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;
import th.p047co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.viewModel.OneDeviceSaleTrueViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.deviceSaleTrueCompany.fragment.OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$1 */
/* loaded from: classes10.dex */
public final class OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneDeviceSaleTrueInputSubscriberNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDeviceSaleTrueInputSubscriberNumberFragment$onViewCreated$1(OneDeviceSaleTrueInputSubscriberNumberFragment oneDeviceSaleTrueInputSubscriberNumberFragment) {
        super(0);
        this.this$0 = oneDeviceSaleTrueInputSubscriberNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneClearableEditText oneClearableEditText;
        OneDeviceSaleTrueViewModel viewModel;
        try {
            oneClearableEditText = this.this$0.f89773k;
            if (oneClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("editTextPhone");
                oneClearableEditText = null;
            }
            String valueOf = String.valueOf(oneClearableEditText.getText());
            new PhoneNumberValidator().validate(valueOf);
            viewModel = this.this$0.getViewModel();
            viewModel.verifySubscriber(valueOf);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}