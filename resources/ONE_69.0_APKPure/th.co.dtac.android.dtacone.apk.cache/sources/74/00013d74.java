package th.p047co.dtac.android.dtacone.view.appOne.registration.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneInputInfoData;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneRegistrationInputInfoRule;
import th.p047co.dtac.android.dtacone.app_one.viewmodel.registration.OneRegistrationViewModel;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.registration.fragment.OneInputInfoFragment$initView$1 */
/* loaded from: classes10.dex */
public final class OneInputInfoFragment$initView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneInputInfoFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputInfoFragment$initView$1(OneInputInfoFragment oneInputInfoFragment) {
        super(0);
        this.this$0 = oneInputInfoFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneTextInputLayoutText oneTextInputLayoutText;
        OneTextInputLayoutPhone oneTextInputLayoutPhone;
        OneRegistrationViewModel m10440n;
        OneRegistrationViewModel m10440n2;
        try {
            oneTextInputLayoutText = this.this$0.f96205i;
            OneTextInputLayoutPhone oneTextInputLayoutPhone2 = null;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtRtrCode");
                oneTextInputLayoutText = null;
            }
            String str = oneTextInputLayoutText.getText().toString();
            oneTextInputLayoutPhone = this.this$0.f96206j;
            if (oneTextInputLayoutPhone == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtPhoneNumber");
            } else {
                oneTextInputLayoutPhone2 = oneTextInputLayoutPhone;
            }
            OneInputInfoData oneInputInfoData = new OneInputInfoData(str, oneTextInputLayoutPhone2.getText().toString());
            new OneRegistrationInputInfoRule().validate(oneInputInfoData);
            m10440n = this.this$0.m10440n();
            m10440n.setInputData(oneInputInfoData);
            m10440n2 = this.this$0.m10440n();
            m10440n2.checkProfileRegister();
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}