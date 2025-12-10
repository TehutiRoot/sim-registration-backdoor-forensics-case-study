package th.p047co.dtac.android.dtacone.view.appOne.staff.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.app_one.util.model.OneAddNewStaff;
import th.p047co.dtac.android.dtacone.app_one.util.validation.OneAddNewStaffRule;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.view.appOne.staff.viewmodel.OneStaffViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.fragment.OneInputAddNewStaffFragment$actionConfirm$1 */
/* loaded from: classes10.dex */
public final class OneInputAddNewStaffFragment$actionConfirm$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneInputAddNewStaffFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneInputAddNewStaffFragment$actionConfirm$1(OneInputAddNewStaffFragment oneInputAddNewStaffFragment) {
        super(0);
        this.this$0 = oneInputAddNewStaffFragment;
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
        OneTextInputLayoutText oneTextInputLayoutText2;
        OneTextInputLayoutText oneTextInputLayoutText3;
        OneStaffViewModel m9973s;
        OneStaffViewModel m9973s2;
        try {
            oneTextInputLayoutText = this.this$0.f97272i;
            OneTextInputLayoutText oneTextInputLayoutText4 = null;
            if (oneTextInputLayoutText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtName");
                oneTextInputLayoutText = null;
            }
            String text = oneTextInputLayoutText.getText();
            oneTextInputLayoutPhone = this.this$0.f97273j;
            if (oneTextInputLayoutPhone == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtPhoneNumber");
                oneTextInputLayoutPhone = null;
            }
            String text2 = oneTextInputLayoutPhone.getText();
            oneTextInputLayoutText2 = this.this$0.f97274k;
            if (oneTextInputLayoutText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtNewPassword");
                oneTextInputLayoutText2 = null;
            }
            String text3 = oneTextInputLayoutText2.getText();
            oneTextInputLayoutText3 = this.this$0.f97275l;
            if (oneTextInputLayoutText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtConfirmNewPassword");
            } else {
                oneTextInputLayoutText4 = oneTextInputLayoutText3;
            }
            OneAddNewStaff oneAddNewStaff = new OneAddNewStaff(text, text2, text3, oneTextInputLayoutText4.getText(), null, null, null, 112, null);
            new OneAddNewStaffRule().validate(oneAddNewStaff);
            m9973s = this.this$0.m9973s();
            m9973s.setAddNewStaffData(oneAddNewStaff);
            m9973s2 = this.this$0.m9973s();
            m9973s2.callRegisterStaff();
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}