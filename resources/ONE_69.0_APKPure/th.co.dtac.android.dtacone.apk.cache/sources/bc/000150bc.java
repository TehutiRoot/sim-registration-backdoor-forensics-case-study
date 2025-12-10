package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.phone_number.PhoneNumberValidator;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostInputSubscriberFragment$onViewCreated$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostInputSubscriberFragment$onViewCreated$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPre2PostInputSubscriberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostInputSubscriberFragment$onViewCreated$1(MrtrPre2PostInputSubscriberFragment mrtrPre2PostInputSubscriberFragment) {
        super(0);
        this.this$0 = mrtrPre2PostInputSubscriberFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        MrtrPre2PostViewModel mrtrPre2PostViewModel;
        try {
            DtacClearableEditText dtacClearableEditText = this.this$0.f103166j;
            MrtrPre2PostViewModel mrtrPre2PostViewModel2 = null;
            if (dtacClearableEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("edtPhoneNumber");
                dtacClearableEditText = null;
            }
            String valueOf = String.valueOf(dtacClearableEditText.getText());
            new PhoneNumberValidator().validate(valueOf);
            mrtrPre2PostViewModel = this.this$0.f103165i;
            if (mrtrPre2PostViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                mrtrPre2PostViewModel2 = mrtrPre2PostViewModel;
            }
            mrtrPre2PostViewModel2.requestOTP(valueOf);
        } catch (ValidatedRuleException e) {
            this.this$0.showDialog(e.getResId());
        }
    }
}