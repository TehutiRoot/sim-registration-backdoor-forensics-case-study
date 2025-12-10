package th.p047co.dtac.android.dtacone.view.appOne.tol.fragment;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.tol.activity.OneRegisterTrueOnlineActivity;
import th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineViewModel;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlineSelectNumberFragment$setUpAdapter$1 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineSelectNumberFragment$setUpAdapter$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneRegisterTrueOnlineSelectNumberFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlineSelectNumberFragment$setUpAdapter$1(OneRegisterTrueOnlineSelectNumberFragment oneRegisterTrueOnlineSelectNumberFragment) {
        super(1);
        this.this$0 = oneRegisterTrueOnlineSelectNumberFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String it) {
        OneRegisterTrueOnlineViewModel viewModel;
        OneRegisterTrueOnlineActivity m9620n;
        Intrinsics.checkNotNullParameter(it, "it");
        viewModel = this.this$0.getViewModel();
        viewModel.setOldSelectedNumber(it);
        m9620n = this.this$0.m9620n();
        m9620n.replaceFragment(OneRegisterTrueOnlineCameraFragment.Companion.newInstance(), OneRegisterTrueOnlineCameraFragment.class.getName());
    }
}