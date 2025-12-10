package th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.input_document;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.util.validation.person.FirstNameLengthRule;
import th.p047co.dtac.android.dtacone.util.validation.person.LastNameLengthRule;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist.MrtrPrepaidReRegistActivity;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistSubmitFragment;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_prepaid_reregist.MrtrPrepaidReregistViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.input_document.MrtrPrepaidReregistInputDocumentFragment$initView$6 */
/* loaded from: classes9.dex */
public final class MrtrPrepaidReregistInputDocumentFragment$initView$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidReregistInputDocumentFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReregistInputDocumentFragment$initView$6(MrtrPrepaidReregistInputDocumentFragment mrtrPrepaidReregistInputDocumentFragment) {
        super(0);
        this.this$0 = mrtrPrepaidReregistInputDocumentFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        DtacClearableEditText dtacClearableEditText;
        DtacClearableEditText dtacClearableEditText2;
        MrtrPrepaidReregistViewModel m4441n;
        DtacClearableEditText dtacClearableEditText3;
        DtacClearableEditText dtacClearableEditText4;
        MrtrPrepaidReRegistActivity m4442m;
        try {
            FirstNameLengthRule firstNameLengthRule = new FirstNameLengthRule();
            dtacClearableEditText = this.this$0.f103945l;
            DtacClearableEditText dtacClearableEditText5 = null;
            if (dtacClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtName");
                dtacClearableEditText = null;
            }
            firstNameLengthRule.validate(String.valueOf(dtacClearableEditText.getText()));
            LastNameLengthRule lastNameLengthRule = new LastNameLengthRule();
            dtacClearableEditText2 = this.this$0.f103946m;
            if (dtacClearableEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
                dtacClearableEditText2 = null;
            }
            lastNameLengthRule.validate(String.valueOf(dtacClearableEditText2.getText()));
            m4441n = this.this$0.m4441n();
            MrtrPrepaidReregistInputDocumentFragment mrtrPrepaidReregistInputDocumentFragment = this.this$0;
            m4441n.setUpPassStepState(UpPassStepState.SUMMARY);
            UpdateProfileFormCollection updateForm = m4441n.getUpdateForm();
            if (updateForm != null) {
                dtacClearableEditText3 = mrtrPrepaidReregistInputDocumentFragment.f103945l;
                if (dtacClearableEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtName");
                    dtacClearableEditText3 = null;
                }
                updateForm.setFirstName(String.valueOf(dtacClearableEditText3.getText()));
            }
            UpdateProfileFormCollection updateForm2 = m4441n.getUpdateForm();
            if (updateForm2 != null) {
                dtacClearableEditText4 = mrtrPrepaidReregistInputDocumentFragment.f103946m;
                if (dtacClearableEditText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("edtSureName");
                } else {
                    dtacClearableEditText5 = dtacClearableEditText4;
                }
                updateForm2.setLastName(String.valueOf(dtacClearableEditText5.getText()));
            }
            m4442m = this.this$0.m4442m();
            m4442m.replaceFragment(MrtrPrepaidReregistSubmitFragment.Companion.newInstance(), Reflection.getOrCreateKotlinClass(MrtrPrepaidReregistSubmitFragment.class).getSimpleName());
        } catch (ValidatedRuleException e) {
            this.this$0.showDialog(e.getResId());
        }
    }
}