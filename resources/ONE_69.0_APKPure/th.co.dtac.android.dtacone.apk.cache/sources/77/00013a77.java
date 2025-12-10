package th.p047co.dtac.android.dtacone.view.appOne.pre2post.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.fragment.OnePre2PostSignatureFragment$setupView$2$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostSignatureFragment$setupView$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OnePre2PostSignatureFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostSignatureFragment$setupView$2$1(OnePre2PostSignatureFragment onePre2PostSignatureFragment) {
        super(0);
        this.this$0 = onePre2PostSignatureFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean m11223p;
        OnePre2PostViewModel m11224o;
        m11223p = this.this$0.m11223p();
        if (m11223p) {
            m11224o = this.this$0.m11224o();
            m11224o.updateAppForms(true);
            return;
        }
        OnePre2PostSignatureFragment onePre2PostSignatureFragment = this.this$0;
        onePre2PostSignatureFragment.showDialogOne(onePre2PostSignatureFragment.getString(R.string.consent_xsim_validate_confirm_signature_message));
    }
}