package th.p047co.dtac.android.dtacone.view.appOne.tol.fragment;

import android.widget.Toast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "item", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.fragment.OneRegisterTrueOnlinePeriodListFragment$initView$2 */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlinePeriodListFragment$initView$2 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ OneRegisterTrueOnlinePeriodListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRegisterTrueOnlinePeriodListFragment$initView$2(OneRegisterTrueOnlinePeriodListFragment oneRegisterTrueOnlinePeriodListFragment) {
        super(1);
        this.this$0 = oneRegisterTrueOnlinePeriodListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Toast.makeText(this.this$0.requireContext(), String.valueOf(item), 0).show();
    }
}