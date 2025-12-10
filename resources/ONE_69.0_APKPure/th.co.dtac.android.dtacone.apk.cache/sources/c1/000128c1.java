package th.p047co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.model.appOne.change_owner.UpPassStepState;
import th.p047co.dtac.android.dtacone.model.prepaid.UpdateProfileFormCollection;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.MrtrPrepaidReregistSubmitFragment;
import th.p047co.dtac.android.dtacone.view.fragment.mrtr_prepaid_reregist.input_document.MrtrPrepaidReregistInputDocumentFragment;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.activity.mrtr_prepaid_reregist.MrtrPrepaidReRegistActivity$ComposeContent$3 */
/* loaded from: classes10.dex */
public final class MrtrPrepaidReRegistActivity$ComposeContent$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPrepaidReRegistActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPrepaidReRegistActivity$ComposeContent$3(MrtrPrepaidReRegistActivity mrtrPrepaidReRegistActivity) {
        super(0);
        this.this$0 = mrtrPrepaidReRegistActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getMrtrPrepaidReregistViewModel().dismissDialogTakeMorePhoto();
        this.this$0.getMrtrPrepaidReregistViewModel().setUpPassStepState(UpPassStepState.SUMMARY);
        UpdateProfileFormCollection updateForm = this.this$0.getMrtrPrepaidReregistViewModel().getUpdateForm();
        String firstName = updateForm != null ? updateForm.getFirstName() : null;
        if (firstName != null && !AbstractC19741eO1.isBlank(firstName)) {
            UpdateProfileFormCollection updateForm2 = this.this$0.getMrtrPrepaidReregistViewModel().getUpdateForm();
            String lastName = updateForm2 != null ? updateForm2.getLastName() : null;
            if (lastName != null && !AbstractC19741eO1.isBlank(lastName)) {
                this.this$0.addFragment(MrtrPrepaidReregistSubmitFragment.Companion.newInstance(), Reflection.getOrCreateKotlinClass(MrtrPrepaidReregistSubmitFragment.class).getSimpleName());
                return;
            }
        }
        this.this$0.replaceFragment(MrtrPrepaidReregistInputDocumentFragment.Companion.newInstance(), MrtrPrepaidReregistInputDocumentFragment.class.getSimpleName());
    }
}