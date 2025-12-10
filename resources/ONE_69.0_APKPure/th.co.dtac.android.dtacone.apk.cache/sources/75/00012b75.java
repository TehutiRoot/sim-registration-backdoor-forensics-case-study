package th.p047co.dtac.android.dtacone.view.appOne.change_owner.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.view.appOne.change_owner.viewModel.OneChangeOwnerViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.change_owner.fragment.OneChangeOwnerVerifyOtpFragment$onStart$1$1 */
/* loaded from: classes10.dex */
public final class OneChangeOwnerVerifyOtpFragment$onStart$1$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ OneChangeOwnerVerifyOtpFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneChangeOwnerVerifyOtpFragment$onStart$1$1(OneChangeOwnerVerifyOtpFragment oneChangeOwnerVerifyOtpFragment) {
        super(1);
        this.this$0 = oneChangeOwnerVerifyOtpFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        OneChangeOwnerViewModel oneChangeOwnerViewModel;
        this.this$0.m15616A(false);
        oneChangeOwnerViewModel = this.this$0.f89095k;
        if (oneChangeOwnerViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewModel");
            oneChangeOwnerViewModel = null;
        }
        oneChangeOwnerViewModel.gotoCommonUpPassOCR();
    }
}