package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.input_document;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.util.validation.person.FirstNameLengthRule;
import th.p047co.dtac.android.dtacone.util.validation.person.LastNameLengthRule;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.activity.OneChangeOwnerActivity;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerSummaryFragment;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.input_document.OnePrepaidChangeOwnerInputDocumentFragment$initView$6 */
/* loaded from: classes10.dex */
public final class OnePrepaidChangeOwnerInputDocumentFragment$initView$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePrepaidChangeOwnerInputDocumentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePrepaidChangeOwnerInputDocumentFragment$initView$6(OnePrepaidChangeOwnerInputDocumentFragment onePrepaidChangeOwnerInputDocumentFragment) {
        super(0);
        this.this$0 = onePrepaidChangeOwnerInputDocumentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OneCustomClearableEditText oneCustomClearableEditText;
        OneCustomClearableEditText oneCustomClearableEditText2;
        OneChangeOwnerViewModel m15386n;
        OneCustomClearableEditText oneCustomClearableEditText3;
        OneCustomClearableEditText oneCustomClearableEditText4;
        OneChangeOwnerActivity m15387m;
        try {
            FirstNameLengthRule firstNameLengthRule = new FirstNameLengthRule();
            oneCustomClearableEditText = this.this$0.f89302m;
            OneCustomClearableEditText oneCustomClearableEditText5 = null;
            if (oneCustomClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtName");
                oneCustomClearableEditText = null;
            }
            firstNameLengthRule.validate(String.valueOf(oneCustomClearableEditText.getText()));
            LastNameLengthRule lastNameLengthRule = new LastNameLengthRule();
            oneCustomClearableEditText2 = this.this$0.f89303n;
            if (oneCustomClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
                oneCustomClearableEditText2 = null;
            }
            lastNameLengthRule.validate(String.valueOf(oneCustomClearableEditText2.getText()));
            m15386n = this.this$0.m15386n();
            OnePrepaidChangeOwnerInputDocumentFragment onePrepaidChangeOwnerInputDocumentFragment = this.this$0;
            m15386n.setUpPassStepState(UpPassStepState.SUMMARY);
            UpdateProfileFormCollection updateForm = m15386n.getUpdateForm();
            if (updateForm != null) {
                oneCustomClearableEditText3 = onePrepaidChangeOwnerInputDocumentFragment.f89302m;
                if (oneCustomClearableEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtName");
                    oneCustomClearableEditText3 = null;
                }
                updateForm.setFirstName(String.valueOf(oneCustomClearableEditText3.getText()));
            }
            UpdateProfileFormCollection updateForm2 = m15386n.getUpdateForm();
            if (updateForm2 != null) {
                oneCustomClearableEditText4 = onePrepaidChangeOwnerInputDocumentFragment.f89303n;
                if (oneCustomClearableEditText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
                } else {
                    oneCustomClearableEditText5 = oneCustomClearableEditText4;
                }
                updateForm2.setLastName(String.valueOf(oneCustomClearableEditText5.getText()));
            }
            m15387m = this.this$0.m15387m();
            m15387m.replaceFragment(OneChangeOwnerSummaryFragment.Companion.newInstance(), Reflection.getOrCreateKotlinClass(OneChangeOwnerSummaryFragment.class).getSimpleName());
        } catch (ValidatedRuleException e) {
            this.this$0.showDialogOne(e.getResId());
        }
    }
}