package th.p047co.dtac.android.dtacone.view.fragment.mrtr_pre2post;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import th.p047co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity;
import th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel;

@Metadata(m29143d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m29142d2 = {"<anonymous>", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.fragment.mrtr_pre2post.MrtrPre2PostChooseContractFragment$onViewCreated$2 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostChooseContractFragment$onViewCreated$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MrtrPre2PostChooseContractFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostChooseContractFragment$onViewCreated$2(MrtrPre2PostChooseContractFragment mrtrPre2PostChooseContractFragment) {
        super(0);
        this.this$0 = mrtrPre2PostChooseContractFragment;
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
        mrtrPre2PostViewModel = this.this$0.f103048i;
        if (mrtrPre2PostViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            mrtrPre2PostViewModel = null;
        }
        mrtrPre2PostViewModel.onSelectRegistWithoutContract();
        mrtrPre2PostViewModel.setWithContract(false);
        FragmentActivity requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNull(requireActivity, "null cannot be cast to non-null type th.co.dtac.android.dtacone.view.activity.mrtr_pre2post.MrtrPre2PostActivity");
        ((MrtrPre2PostActivity) requireActivity).replaceFragment(new MrtrPre2PostInputSubscriberFragment(), Reflection.getOrCreateKotlinClass(MrtrPre2PostInputSubscriberFragment.class).getSimpleName());
    }
}