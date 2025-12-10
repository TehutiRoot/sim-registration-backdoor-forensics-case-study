package th.p047co.dtac.android.dtacone.view.appOne.change_owner.activity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.activity.OneChangeOwnerActivity$ComposeContent$1 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerActivity$ComposeContent$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OneChangeOwnerActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerActivity$ComposeContent$1(OneChangeOwnerActivity oneChangeOwnerActivity) {
        super(0);
        this.this$0 = oneChangeOwnerActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getMViewModel().dismissCancelFlowDialog();
        OneChangeOwnerViewModel mViewModel = this.this$0.getMViewModel();
        mViewModel.clearInternalFile();
        mViewModel.clearModel();
        this.this$0.finish();
    }
}